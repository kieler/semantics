/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.s.sc.xtend

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.CombineOperator
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.FloatValue
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.s.s.Abort
import de.cau.cs.kieler.s.s.Assignment
import de.cau.cs.kieler.s.s.Await
import de.cau.cs.kieler.s.s.Emit
import de.cau.cs.kieler.s.s.Fork
import de.cau.cs.kieler.s.s.Halt
import de.cau.cs.kieler.s.s.HostCodeInstruction
import de.cau.cs.kieler.s.s.If
import de.cau.cs.kieler.s.s.Instruction
import de.cau.cs.kieler.s.s.Join
import de.cau.cs.kieler.s.s.LocalSignal
import de.cau.cs.kieler.s.s.Pause
import de.cau.cs.kieler.s.s.Prio
import de.cau.cs.kieler.s.s.Program
import de.cau.cs.kieler.s.s.State
import de.cau.cs.kieler.s.s.Term
import de.cau.cs.kieler.s.s.Trans
import de.cau.cs.kieler.s.extensions.SExtension

/**
 * Transformation of S code into SS code that can be executed using the GCC.
 * 
 * @author cmot 
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 yellow KI-28
 */
class S2C { 
    
    public static String bufferSize;
    public static String includeHeader;
    
    @Inject
    extension KExpressionsExtension    

    @Inject
    extension SExtension     
    
    // General method to create the c simulation interface.
    def transform (Program program) {
       '''
«/* Generate the C header */»
       «scHeader(program)»

       «/* Possible global host code */»
       «if (program.globalHostCodeInstruction != null) {
       program.globalHostCodeInstruction.extractCode}»

       «/* Generate the reset function */»
       «sResetFunction(program)»

       «/* Generate the tick function */»
       «sTickFunction(program)»
       '''
   }     

   // -------------------------------------------------------------------------   
   
   // Generate the C header.
   def scHeader(Program program) {
       '''
    /*****************************************************************************/
    /*                 G E N E R A T E D       C    C O D E                      */
    /*****************************************************************************/
    /* KIELER - Kiel Integrated Environment for Layout Eclipse RichClient        */
    /*                                                                           */
    /* http://www.informatik.uni-kiel.de/rtsys/kieler/                           */
    /* Copyright 2014 by                                                         */
    /* + Christian-Albrechts-University of Kiel                                  */
    /*   + Department of Computer Science                                        */
    /*     + Real-Time and Embedded Systems Group                                */
    /*                                                                           */
    /* This code is provided under the terms of the Eclipse Public License (EPL).*/
    /*****************************************************************************/

    «includeHeader»

   «/* Variables */»
    «sVariables(program)»    
    
    ''' 
   }
   
   // -------------------------------------------------------------------------

   def boolean usesPre(Program program, ValuedObject valuedObject) {
       val foundPres = program.eAllContents.filter(typeof(OperatorExpression)).filter[operator == OperatorType::PRE].toList; 
       for (pre : foundPres) {
           for (subExpression : pre.subExpressions) {
               if (subExpression instanceof ValuedObjectReference) {
                   if ((subExpression as ValuedObjectReference).valuedObject == valuedObject) {
                       return true
                   }
               }
               val found = subExpression.eAllContents.filter(typeof(ValuedObjectReference)).filter(e | e.valuedObject == valuedObject).toList
               if (found.size > 0) {
                   return true
               }
           }
       } 
       return false
   }

   // Generate variables.
   def sVariables(Program program) {
       '''«FOR signal : program.getValuedObjects().filter[e|!e.isSignal]»
			«signal.type.expand» «signal.name» «IF signal.initialValue != null» = «signal.initialValue.expand» «ENDIF»;
			«IF program.usesPre(signal)»
				«signal.type.expand» PRE_«signal.name» «IF signal.initialValue != null» = «signal.initialValue.expand» «ENDIF»;
			«ENDIF»
  		«ENDFOR»
		'''
   }

   // Generate PRE variables setter.
   def setPreVariables(Program program) {
       '''«FOR signal : program.getValuedObjects().filter[e|!e.isSignal]»
       «IF program.usesPre(signal) 
 			» PRE_«signal.name» = «signal.name»;«
 		ENDIF»«ENDFOR»'''
   }

   def resetPreVariables(Program program) {
       '''«FOR signal : program.getValuedObjects().filter[e|!e.isSignal]»
       «IF program.usesPre(signal) 
 			» PRE_«signal.name» = 0;«
 		ENDIF»«ENDFOR»'''
   }
   
   


   def dispatch expand(ValueType valueType) {
       if (valueType == ValueType::BOOL) {
           return '''int'''
       }
       else {
           return '''«valueType»'''
       }
   }

   // -------------------------------------------------------------------------   
   
   // Generate the  reset function.
   def sResetFunction(Program program) {
       '''    int reset(){
       _GO = 1;
       «program.resetPreVariables»
    }
    '''
   }
      
   // -------------------------------------------------------------------------   
   
   // Generate the  tick function.
   def sTickFunction(Program program) {
       '''    int tick(){
       guard0 = _GO;
       «FOR state : program.states»
       «state.expand»
       «ENDFOR»
       _GO = 0;
       «program.setPreVariables»
    }
    '''
   }
   
   // -------------------------------------------------------------------------   
   // -------------------------------------------------------------------------   
   // -------------------------------------------------------------------------
   
   // Expand a state traversing all instructions of that state.
   def dispatch CharSequence expand(State state) {
           '''«state.name»: { 
           «FOR instruction : state.instructions»
           «instruction.expand»
           «ENDFOR»
           }'''
   }
   
   // Expand an IF instruction traversing all instructions of that IF instruction.
   def dispatch CharSequence expand(If ifInstruction) {
       '''if («ifInstruction.expression.expand») { 
           «FOR instruction : ifInstruction.instructions»
               «instruction.expand»
           «ENDFOR»
         }'''
   }   
   
   // -------------------------------------------------------------------------   

   // Host code without "..."
   def extractCode(String hostCodeString) {
        hostCodeString.substring(1, hostCodeString.length-1);
   }

   def extractCode(TextExpression hostCode) {
        hostCode.text.extractCode
   }
   
   // Expand Host code.
   def dispatch CharSequence expand(HostCodeInstruction hostCodeInstruction) {
        '''«hostCodeInstruction.hostCode.extractCode»;'''
   }
   // Expand Text Expression
   def dispatch CharSequence expand(TextExpression expression) {
        '''(«expression.text.extractCode»)'''
   }

   // -------------------------------------------------------------------------   

   // Expand a ASSIGNMENT instruction.
   def dispatch CharSequence expand(Assignment assignment) {
       '''«assignment.variable.expand » = «assignment.expression.expand»;'''
   }   
      
   // Expand a PAUSE instruction.
   def dispatch CharSequence expand(Pause pauseInstruction) {
       '''PAUSE;'''
   }   
   
   // Expand a TERM instruction.
   def dispatch CharSequence expand(Term termInstruction) {
       '''TERM;'''
   }   
   
   // Expand a HALT instruction.
   def dispatch CharSequence expand(Halt haltInstruction) {
       '''HALT;'''
   }   
   
   // Expand a JOIN instruction.
   def dispatch CharSequence expand(Join joinInstruction) {
       '''JOINELSE(«joinInstruction.continuation.name»);'''
   } 
   
   // Expand an ABORT instruction.  
   def dispatch CharSequence expand(Abort abortInstruction) {
       '''ABORT;'''
   }   
   
   // Retrieve the last FORK instruction because in SC the last fork
   // will become a FORKE statement.
   def getLastFork(Fork forkInstruction) {
        val instructionListContainer = ((forkInstruction).eContainer);
        if (instructionListContainer instanceof State) {
            return (instructionListContainer as State).instructions.filter(typeof(Fork)).toList.last;
        }
        if (instructionListContainer instanceof If) {
            return (instructionListContainer as If).instructions.filter(typeof(Fork)).toList.last;
        }
   }
   
   // Expand a FORK instruction.
   def dispatch CharSequence expand(Fork forkInstruction) {
       '''«IF forkInstruction.getLastFork != forkInstruction» 
             FORK(«forkInstruction.continuation.name»,«forkInstruction.priority»);
          «ENDIF»
          «IF forkInstruction.getLastFork == forkInstruction» 
             PRIO(«forkInstruction.priority»);
             FORKE(«forkInstruction.continuation.name»);
          «ENDIF»
       '''
   }   

   // Expand a TRANS instruction.    
   def dispatch CharSequence expand(Trans transInstruction) {
       '''goto «transInstruction.continuation.name»;'''
   }   
   
   // Expand an AWAIT instruction.
   def dispatch CharSequence expand(Await awaitInstruction) {
       '''AWAIT;'''
   }   
   
   // Expand a PRIO instruction.
   def dispatch CharSequence expand(Prio prioInstruction) {
       '''PRIO(«prioInstruction.priority»);'''
   }   
   
   // Expand SIGNAL instruction. This takes care of reincarnation
   // by resetting local signals when the state is re-entered.
   // Also reset the value of valued signals (test 139).
   def dispatch CharSequence expand(LocalSignal signalInstruction) {
       '''presentSigInt[«signalInstruction.signal.name»] = 0;
          valSigInt[«signalInstruction.signal.name»] = «signalInstruction.signal.combineOperator.initialValue»;'''   
   }
   
   // Expand an EMIT instruction.
   def dispatch CharSequence expand(Emit emitInstruction) {
       if (emitInstruction.value != null) {
           '''EMIT_VAL_SCC(«emitInstruction.signal.name», «emitInstruction.value.expand»,
               «emitInstruction.signal.combineOperator.macro», 
               «emitInstruction.signal.combineOperator.initialValue»);'''
       }
       else {
           '''EMIT_SCC(«emitInstruction.signal.name»);'''
       }
   }   
   
   // Expand fall back for other instructions: Do nothing.
   def dispatch CharSequence expand(Instruction instruction) {
       ''''''
   }   
   
   // -------------------------------------------------------------------------   
   
   // Combine operator
   def macro(CombineOperator combineOperator) {
       if (combineOperator.equals(CombineOperator::ADD)) {
          return '''COMBINE_ADD'''
       }
       else if (combineOperator.equals(CombineOperator::MULT)) {
          return '''COMBINE_MULT'''
       }
       else if (combineOperator.equals(CombineOperator::MAX)) {
          return '''COMBINE_MAX'''
       }
       else if (combineOperator.equals(CombineOperator::MIN)) {
          return '''COMBINE_MIN'''
       }
       else if (combineOperator.equals(CombineOperator::OR)) {
          return '''COMBINE_OR'''
       }
       else if (combineOperator.equals(CombineOperator::AND)) {
          return '''COMBINE_AND'''
       }
       // default case combine with +
       return '''COMBINE_ADD''';
   }

   def initialValue(CombineOperator combineOperator) {
       if (combineOperator.equals(CombineOperator::ADD)) {
          return '''0'''
       }
       else if (combineOperator.equals(CombineOperator::MULT)) {
          return '''1'''
       }
       else if (combineOperator.equals(CombineOperator::MAX)) {
          return '''-999999'''
       }
       else if (combineOperator.equals(CombineOperator::MIN)) {
          return '''999999'''
       }
       else if (combineOperator.equals(CombineOperator::OR)) {
          return '''0'''
       }
       else if (combineOperator.equals(CombineOperator::AND)) {
          return '''1'''
       }
       // default case combine with +
       return '''0''';
   }

   // -------------------------------------------------------------------------
   
   //Expand a complex expression.
   def dispatch CharSequence expand(OperatorExpression expression) {
        '''
    «IF expression.operator  == OperatorType::EQ»
        («FOR subexpression : expression.subExpressions SEPARATOR " == "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::LT»
        («FOR subexpression : expression.subExpressions SEPARATOR "  <  "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::LEQ»
        («FOR subexpression : expression.subExpressions SEPARATOR " <= "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::GT»
        («FOR subexpression : expression.subExpressions SEPARATOR " > "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::GEQ»
        («FOR subexpression : expression.subExpressions SEPARATOR " >= "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::NOT»
        (!(«expression.subExpressions.toList.head.expand»))
    «ENDIF»
    «IF expression.operator  == OperatorType::VAL»
        VAL_SCC(«expression.subExpressions.toList.head.expand_val»)
    «ENDIF»
    «IF expression.operator  == OperatorType::PRE»
    (PRE_«expression.subExpressions.toList.head.expand_val»)
    «ENDIF»
    «IF expression.operator  == OperatorType::NE»
        («FOR subexpression : expression.subExpressions SEPARATOR " != "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::AND»
        («FOR subexpression : expression.subExpressions SEPARATOR " && "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::OR»
        («FOR subexpression : expression.subExpressions SEPARATOR " || "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::ADD»
        («FOR subexpression : expression.subExpressions SEPARATOR " + "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::SUB»
        («FOR subexpression : expression.subExpressions SEPARATOR " - "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::MULT»
        («FOR subexpression : expression.subExpressions SEPARATOR " * "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::DIV»
        («FOR subexpression : expression.subExpressions SEPARATOR " / "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::MOD»
        («FOR subexpression : expression.subExpressions SEPARATOR " % "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
            '''
   }

   // -------------------------------------------------------------------------
    
   // Expand a signal.
   def dispatch CharSequence expand(ValuedObject signal) {
       if (signal.isSignal) {
            return  '''PRESENT_SCC(«signal.name»)'''
       } else {
            // variable case
            return  '''«signal.name»'''
       }
   }
   // Expand a signal within a value reference
   def dispatch CharSequence expand_val(ValuedObject signal) {
       //if (signal.isSignal) {
            return  '''«signal.name»'''
       //}
       //return ''''''
   }
   def dispatch CharSequence expand_val(ValuedObjectReference valuedObjectReference) {
        '''«valuedObjectReference.valuedObject.expand_val»'''
   }   
   def dispatch CharSequence expand_val(Expression other) {
        other.expand;
   }
   
   // Expand a int expression value.
   def dispatch CharSequence expand(IntValue expression) {
        '''«expression.value.toString»'''
   }

   // Expand a float expression value.
   def dispatch CharSequence expand(FloatValue expression) {
        '''«expression.value.toString»'''
   }

   // Expand a boolean expression value (true or false).
   def dispatch CharSequence expand(BoolValue expression) {
        '''«IF expression.value == true »1«ENDIF»«IF expression.value == false»0«ENDIF»'''
   }

   // Expand an object reference.
   def dispatch CharSequence expand(ValuedObjectReference valuedObjectReference) {
        '''«valuedObjectReference.valuedObject.expand»'''
   }
   
   // -------------------------------------------------------------------------   
}
