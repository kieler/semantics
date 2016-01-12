/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.s.sj.xtend

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
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.s.extensions.SExtension
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
import java.util.List
import org.eclipse.emf.ecore.EObject

//import static de.cau.cs.kieler.s.sj.xtend.S2SJ.*

/**
 * Transformation of S code into SS code that can be executed using the GCC.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 yellow KI-28
 */
class S2SJ { 
    
    @Inject
    extension KExpressionsValuedObjectExtensions    

    @Inject
    extension SExtension 
    
        
    public static boolean debug = false;
    
    // General method to create the c simulation interface.
    def transform (Program program, String className, String packageName) {
       '''
«/* Generate the C header */»
       «sjHeader(program, className, packageName)»

       «/* Signal Reset, Output */»
       «sResetSignals(program)»

       «/* Generate the tick function */»
       «sTickFunction(program)»

       }
       '''
   }     

   // -------------------------------------------------------------------------   
   
   def String listContinuations(List<State> continuationList) {
       '''
    «FOR continuation : continuationList SEPARATOR ","» 
             «continuation.name»
    «ENDFOR»
       '''
   }

   // -------------------------------------------------------------------------   
   
   def dispatch expand(ValueType valueType) {
       if (valueType == ValueType::BOOL) {
           return '''boolean'''
       }
       else if (valueType == ValueType::INT) {
           return '''int'''
       }
       else  {
           return '''«valueType»'''
       }
   }   
   
   // -------------------------------------------------------------------------   

   def String listValuedObjects(List<ValuedObject> valuedObjectList) {
       '''
    «FOR valuedObject : valuedObjectList SEPARATOR ""»
        «IF valuedObject.isSignal»
            public boolean «valuedObject.name» = false;
        «ENDIF»
        «IF !valuedObject.isSignal»
            public «valuedObject.type.expand» «valuedObject.name»;
        «ENDIF»
    «ENDFOR»
    «FOR valuedObject : valuedObjectList SEPARATOR ""»
        «IF valuedObject.isSignal»
            public Object «valuedObject.name»_value = null;
        «ENDIF»
        «IF !valuedObject.isSignal && valuedObject.usesPre»
            public «valuedObject.type.expand» PRE_«valuedObject.name»;
        «ENDIF»
    «ENDFOR»
    «IF debug»
        «FOR valuedObject : valuedObjectList SEPARATOR ""»
            public int «valuedObject.name»_prio = -1;
        «ENDFOR»
        int order = 0;
        «FOR valuedObject : valuedObjectList SEPARATOR ""»
            public int «valuedObject.name»_order = -1;
        «ENDFOR»
    «ENDIF»
       '''
   }

   
   // -------------------------------------------------------------------------   

   // Generate the Java header.
   def sjHeader(Program program, String className, String packageName) {
       '''
       package ''' + packageName + ''';
       
/*
 *****************************************************************************
 *                 G E N E R A T E D     S J    C O D E                      *
 *****************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient        *
 *                                                                           *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/                           *
 * Copyright 2013 by                                                         *
 * + Kiel University                                                         *
 *   + Department of Computer Science                                        *
 *     + Real-Time and Embedded Systems Group                                *
 *                                                                           *
 * This code is provided under the terms of the Eclipse Public License (EPL).*
 *****************************************************************************
 */

import java.io.IOException;
import de.cau.cs.kieler.sjl.SJLProgramWithSignals;

import ''' + packageName + '''.''' + className + '''.State;
import static '''  + packageName + '''.''' + className + '''.State.*;
    
public class ''' + className + ''' extends SJLProgramWithSignals<State> implements Cloneable {
    
    enum State {
        ''' + program.eAllContents.filter(typeof(State)).toList.listContinuations + '''
    }

''' + program.valuedObjects.toList.listValuedObjects + ''' 

    public ''' + className + '''() {
        super(''' + program.states.head.name + ''', ''' + program.priority + ''', ''' + program.priority + ''');
    }
    
    ''' 
   }
   
   // -------------------------------------------------------------------------
  
   def EObject rootEObject(EObject eObject) {
       if (eObject.eContainer != null) {
          return rootEObject(eObject.eContainer)
       }
       return eObject
   }

   def boolean usesPre(ValuedObject valuedObject) {
       val root = valuedObject.rootEObject
       val foundPres = root.eAllContents.filter(typeof(OperatorExpression)).filter[operator == OperatorType::PRE].toList; 
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
   
   // Generate PRE variables setter.
   def setPreVariables(Program program) {
       '''«FOR valuedObject : program.getValuedObjects().filter[e|!e.isSignal] SEPARATOR ";
 "»«IF valuedObject.usesPre» PRE_«valuedObject.name» = «valuedObject.name» «ENDIF»«ENDFOR»'''
   }   


   def getDefaultInitialValue(ValuedObject valuedObject) {
       if (valuedObject.type == ValueType::BOOL) {
           '''false'''
       } else if ((valuedObject.type == ValueType::INT)||(valuedObject.type == ValueType::DOUBLE)||(valuedObject.type == ValueType::FLOAT)) {
           '''0'''
       } else {
           ''''''
       } 
   }

   // Generate reset signals
   def sResetSignals(Program program) {
    '''
    public void resetInputSignals() {    
       // inputs must be set from the environment
    }

    public void resetOutputSignals() {    
    «FOR valuedObject : program.valuedObjects.filter(e | !e.isInput) SEPARATOR ""»
        «IF valuedObject.isSignal»
            «valuedObject.name» = false;
        «ENDIF»
        «IF !valuedObject.isSignal»
            «valuedObject.name» = 
            «IF valuedObject.initialValue != null»«valuedObject.initialValue.expand»«ENDIF»
            «IF valuedObject.initialValue == null»«valuedObject.defaultInitialValue»«ENDIF»;
        «ENDIF»
    «ENDFOR»
    }
    ''';
   }

   // -------------------------------------------------------------------------
   
   // Generate the  tick function.
   def sTickFunction(Program program) {
       '''   @Override
    protected final void tick() {
        while (!isTickDone()) {
            switch (state()) {
                
       «FOR state : program.states»
       «state.expand»
       «ENDFOR»
       
            }
        }
        «setPreVariables(program)»       
    }
    '''
   }
   
   // -------------------------------------------------------------------------   
   // -------------------------------------------------------------------------
   
   // Expand a state traversing all instructions of that state.
   def dispatch CharSequence expand(State state) {
           '''      case «state.name»:  
           «FOR instruction : state.instructions»
           «instruction.expand»
           «ENDFOR»'''
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
       '''«assignment.valuedObject.expand » = «assignment.expression.expand»;'''
   }   

      
   // Expand a PAUSE instruction.
       //«pauseInstruction.continuation.name»
   def dispatch CharSequence expand(Pause pauseInstruction) {
       '''pauseB(«pauseInstruction.continuation.name»);
break;'''
   }   
   
   // Expand a TERM instruction.
   def dispatch CharSequence expand(Term termInstruction) {
       '''termB();
break;'''
   }   
   
   // Expand a HALT instruction.
   def dispatch CharSequence expand(Halt haltInstruction) {
       '''haltB();
break;'''
   }   
   
   // Expand a JOIN instruction.
   def dispatch CharSequence expand(Join joinInstruction) {
       '''if(!join()) {
               pauseB(«joinInstruction.continuation.name»);
break;
          };'''
   } 
   
   // Expand an ABORT instruction.  
   def dispatch CharSequence expand(Abort abortInstruction) {
       '''abort();'''
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
             fork(«forkInstruction.continuation.name»,«forkInstruction.priority»);
          «ENDIF»
          «IF forkInstruction.getLastFork == forkInstruction» 
             gotoB(«forkInstruction.continuation.name»);
break;
          «ENDIF»
       '''
   }   

   // Expand a TRANS instruction.    
   def dispatch CharSequence expand(Trans transInstruction) {
       '''gotoB(«transInstruction.continuation.name»);
break;'''
   }   
   
   // Expand an AWAIT instruction.
   def dispatch CharSequence expand(Await awaitInstruction) {
       '''AWAIT;'''
   }   
   
   // Expand a PRIO instruction.
   def dispatch CharSequence expand(Prio prioInstruction) {
       '''prioB(«prioInstruction.priority», «prioInstruction.continuation.name»);
break;'''
   }   
   
   // Expand SIGNAL instruction. This takes care of reincarnation
   // by resetting local signals when the state is re-entered.
   // Also reset the value of valued signals (test 139).
   def dispatch CharSequence expand(LocalSignal signalInstruction) {
       '''«signalInstruction.signal.name» = false;
          «signalInstruction.signal.name»_value = «signalInstruction.signal.combineOperator.initialValue»;'''
       //valSigInt[«signalInstruction.signal.name»] = «signalInstruction.signal.combineOperator.initialValue»;'''   
   }
   
   // Expand an EMIT instruction.
   def dispatch CharSequence expand(Emit emitInstruction) {
       if (emitInstruction.value != null) {
       '''«emitInstruction.signal.name» = true;
          «emitInstruction.signal.name»_value = «emitInstruction.signal.combineOperator.macro»(«emitInstruction.signal.name»_value,  «emitInstruction.value.expand»);
          «IF debug»«emitInstruction.signal.name»_prio = currentPrio();«ENDIF»
          «IF debug»«emitInstruction.signal.name»_order = order++;«ENDIF»'''
//           '''EMIT_VAL_SCC(«emitInstruction.signal.name», «emitInstruction.value.expand»,
//               «emitInstruction.signal.combineOperator.macro», 
//               «emitInstruction.signal.combineOperator.initialValue»);'''
       }
       else {
           '''«emitInstruction.signal.name» = true;          
              «IF debug»«emitInstruction.signal.name»_prio = currentPrio();«ENDIF»
              «IF debug»«emitInstruction.signal.name»_order = order++;«ENDIF»'''
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
          return '''combineAdd'''
       }
       else if (combineOperator.equals(CombineOperator::MULT)) {
          return '''combineMult'''
       }
       else if (combineOperator.equals(CombineOperator::MAX)) {
          return '''combineMax'''
       }
       else if (combineOperator.equals(CombineOperator::MIN)) {
          return '''combineMin'''
       }
       else if (combineOperator.equals(CombineOperator::OR)) {
          return '''combineOr'''
       }
       else if (combineOperator.equals(CombineOperator::AND)) {
          return '''combineAnd'''
       }
       // default case combine with +
       return '''combineAdd''';
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
          return '''false'''
       }
       else if (combineOperator.equals(CombineOperator::AND)) {
          return '''true'''
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
    «IF expression.operator  == OperatorType::LOGICAL_AND»
        («FOR subexpression : expression.subExpressions SEPARATOR " && "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::LOGICAL_OR»
        («FOR subexpression : expression.subExpressions SEPARATOR " || "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::BITWISE_AND»
        («FOR subexpression : expression.subExpressions SEPARATOR " & "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::BITWISE_OR»
        («FOR subexpression : expression.subExpressions SEPARATOR " | "»
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
      return  '''«signal.name»'''
   }
   // Expand a signal within a value reference
   def dispatch CharSequence expand_val(ValuedObject signal) {
      return '''«signal.name»'''
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
        '''«IF expression.value == true »true«ENDIF»«IF expression.value == false»false«ENDIF»'''
   }

   
   // Expand an object reference.
   def dispatch CharSequence expand(ValuedObjectReference valuedObjectReference) {
        '''«valuedObjectReference.valuedObject.expand»'''
   }
   
   // -------------------------------------------------------------------------   
}
