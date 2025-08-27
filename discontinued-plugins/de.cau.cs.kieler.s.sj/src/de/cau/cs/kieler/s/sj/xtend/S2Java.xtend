/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.s.sj.xtend

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.CombineOperator
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.StringValue
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
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
import java.util.HashMap
import java.util.List
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import static extension de.cau.cs.kieler.core.model.codegeneration.HostcodeUtil.*
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValueExtensions

/**
 * Transformation of S code into SS code that can be executed using the GCC.
 * 
 * @author cmot 
 * @kieler.design 2014-10-16 proposed cmot
 * @kieler.rating 2014-10-16 proposed yellow
 */
class S2Java { 
    
    public static String bufferSize;
    public static String includeHeader;
    
    private static val ANNOTATION_HOSTCODE = "hostcode"
    
    @Inject
    extension AnnotationsExtensions    

    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension KExpressionsValueExtensions      

    @Inject
    extension SExtension
    
    @Inject
    extension KExpressionsDeclarationExtensions       

    val preCache = <ValuedObject> newArrayList     
    
    // General method to create the c simulation interface.
    def transform (Program program, String className) {
        val timestamp = System.currentTimeMillis
       	program.eAllContents.filter(typeof(OperatorExpression)).filter[operator == OperatorType::PRE].forEach[
       		it.eAllContents.filter(typeof(ValuedObjectReference)).forEach[ preCache += it.valuedObject ]	
       	]  
              	  
      val code = '''
«/* Generate the Java header */»
       «header(program, program.name)»

       «/* Possible global host code */»
       «if (program.globalHostCodeInstruction != null) {
       program.globalHostCodeInstruction.extractCode}»

       «/* Generate the reset function */»
       «sResetFunction(program)»

       «/* Generate the tick function */»
       «sTickFunction(program)»
       
       }
       '''
        val time = (System.currentTimeMillis - timestamp) as float
        System.out.println("C code generation finished (time used: "+(time / 1000)+"s).")    
       code
   }     

   // -------------------------------------------------------------------------   
   
   // Generate the C header.
   def header(Program program, String className) {
       '''
    /*****************************************************************************/
    /*               G E N E R A T E D      J A V A   C O D E                    */
    /*****************************************************************************/
    /* KIELER - Kiel Integrated Environment for Layout Eclipse RichClient        */
    /*                                                                           */
    /* http://www.informatik.uni-kiel.de/rtsys/kieler/                           */
    /* Copyright 2014 by                                                         */
    /* + Kiel University                                                         */
    /*   + Department of Computer Science                                        */
    /*     + Real-Time and Embedded Systems Group                                */
    /*                                                                           */
    /* This code is provided under the terms of the Eclipse Public License (EPL).*/
    /*****************************************************************************/

    «includeHeader»
    «FOR hostcode : program.getAnnotations(ANNOTATION_HOSTCODE)»
        «(hostcode as StringAnnotation).values.head.removeEscapeChars»
    «ENDFOR»
    
    
    public class «className» {

    «sVariables(program)»    
    «program.tickVariables»
    boolean _PRE_GO = false;
    ''' 
   }
   
   // -------------------------------------------------------------------------
   
   private var List<OperatorExpression> cachedFoundePres = null;
   
   def  List<OperatorExpression> cachedFoundPres(Program program) {
      if (cachedFoundePres == null) {
         cachedFoundePres = program.eAllContents.filter(typeof(OperatorExpression)).filter[operator == OperatorType::PRE].toList  
      }  
      cachedFoundePres
   }
   
   // -------------------------------------------------------------------------
   
   private var HashMap<Integer, List<ValuedObjectReference>> cachedfound = new HashMap<Integer, List<ValuedObjectReference>>();
   
   def  List<ValuedObjectReference> cachedFound(Expression expression) {
      val hash = expression.hashCode
      if (cachedfound.get(hash) == null) {
         cachedfound.put(hash, expression.eAllContents.filter(typeof(ValuedObjectReference)).toList)  
      }  
      cachedfound.get(hash)
   }
   
   // -------------------------------------------------------------------------

   
   def boolean usesPre(Program program, ValuedObject valuedObject) {
		preCache.contains(valuedObject)
   }
   
   
   def privateOrPublic(ValuedObject valuedObject) {
       if (valuedObject.isInput || valuedObject.isOutput || valuedObject.isExtern) {
           return '''public'''
       }
       return '''public'''
   }

   // Generate variables.
   def sVariables(Program program) {
       '''«FOR declaration : program.variableDeclarations.filter[e|!e.isSignal&&!e.isExtern]»
          «FOR signal : declaration.valuedObjects»
              «IF !declaration.volatile»
              «'''  '''»«signal.privateOrPublic» «signal.type.expand»«IF signal.isArray»«FOR card : signal.cardinalities»[]«ENDFOR»«ENDIF» «signal.name»«IF signal.isArray» = new «signal.type.expand»«FOR card : signal.cardinalities»[«card.expand»]«ENDFOR»«ENDIF»«IF signal.initialValue != null /* WILL ALWAYS BE NULL BECAUSE */»
              «IF signal.isArray
//TODO: initial values für arrays
»
«««                «FOR card : signal.cardinalities»{int i«card.hashCode» = 0; for(i«card.hashCode»=0; i«card.hashCode» < «card.intValue»; i«card.hashCode»++) {«ENDFOR»
«««                «signal.name»«FOR card : signal.cardinalities»[i«card.hashCode»]«ENDFOR» = «signal.initialValue.expand»;
«««                «FOR card : signal.cardinalities»}}«ENDFOR»
                «ELSE»
                  = «signal.initialValue.expand» 
                «ENDIF»«ENDIF»;
            
            «ENDIF»
            «IF program.usesPre(signal)»
«'''  '''»«signal.privateOrPublic» «signal.type.expand» PRE_«signal.name» «IF signal.initialValue != null» = «signal.initialValue.expand» «ENDIF»;
            «ENDIF»
        «ENDFOR»
        «ENDFOR»
        '''
   }
   
   // Generate variables.
   def tickVariables(Program program) {
       '''«FOR declaration : program.variableDeclarations.filter[e|!e.isSignal&&!e.isExtern]»
          «FOR signal : declaration.valuedObjects»
              «IF declaration.volatile»
              «''' public '''»«signal.type.expand»«IF signal.isArray»[]«ENDIF» «signal.name»«IF signal.isArray» = new «signal.type.expand»«FOR card : signal.cardinalities»[«card»]«ENDFOR»«ENDIF»«IF signal.initialValue != null /* WILL ALWAYS BE NULL BECAUSE */»
              «IF signal.isArray
//TODO: initial values für arrays
»
«««                «FOR card : signal.cardinalities»{int i«card.hashCode» = 0; for(i«card.hashCode»=0; i«card.hashCode» < «card.intValue»; i«card.hashCode»++) {«ENDFOR»
«««                «signal.name»«FOR card : signal.cardinalities»[i«card.hashCode»]«ENDFOR» = «signal.initialValue.expand»;
«««                «FOR card : signal.cardinalities»}}«ENDFOR»
                «ELSE»
                  = «signal.initialValue.expand» 
                «ENDIF»«ENDIF»;
            
            «ENDIF»
        «ENDFOR»
        «ENDFOR»
        '''
   }
   

   // Generate PRE variables setter.
   def setPreVariables(Program program) {
       '''«FOR declaration : program.variableDeclarations.filter[e|!e.isSignal&&!e.isExtern]»
          «FOR signal : declaration.valuedObjects»
       «IF program.usesPre(signal) 
 			» PRE_«signal.name» = «signal.name»;«
 		ENDIF»«ENDFOR»«ENDFOR»'''
   }

   def resetVariables(Program program) {
       '''«FOR declaration : program.variableDeclarations.filter[e|!e.isSignal&&!e.isExtern]»
          «FOR signal : declaration.valuedObjects»
       
        «IF signal.isArray»
                «FOR card : signal.cardinalities»{int _i«signal.cardinalities.indexOf(card)» = 0; for(_i«signal.cardinalities.indexOf(card)»=0; _i«signal.cardinalities.indexOf(card)» < «card.intValue»; _i«signal.cardinalities.indexOf(card)»++) {«ENDFOR»
                «IF signal.type == ValueType::BOOL»
                  «signal.name»«FOR card : signal.cardinalities»[_i«signal.cardinalities.indexOf(card)»]«ENDFOR» = false;
                «ELSE»
                  «signal.name»«FOR card : signal.cardinalities»[_i«signal.cardinalities.indexOf(card)»]«ENDFOR» = 0;
                «ENDIF»
                «FOR card : signal.cardinalities»}}
                «ENDFOR»
        «ENDIF»
       
       «IF program.usesPre(signal) 
 			» PRE_«signal.name» = false;« // FIXME: Must be the INITIAL value of the valued object
 		ENDIF»«ENDFOR»«ENDFOR»'''
   }
   
   


   def dispatch expand(ValueType valueType) {
       if (valueType == ValueType::BOOL) {
           return '''boolean'''
       }
       else if (valueType == ValueType::STRING) {
           return '''String'''
       }
       else if (valueType == ValueType::FLOAT) {
           return '''double'''
       }
       else {
           return '''«valueType»'''
       }
   }

   // -------------------------------------------------------------------------   
   
   // Generate the  reset function.
   def sResetFunction(Program program) {
       '''  public void reset(){
       _GO = true;
       _PRE_GO = false;
       «program.resetVariables»
       return;
    }
    '''
   }
      
   // -------------------------------------------------------------------------   
   
   // Generate the  tick function.
   def sTickFunction(Program program) {
       '''  public void tick(){
       if (_PRE_GO) {
            _GO = false;
       }
       «FOR state : program.states»
       «state.expand»
       «ENDFOR»
       «program.setPreVariables»
       _PRE_GO = _GO;
       return;
    }
    '''
   }
   
   // -------------------------------------------------------------------------   
   // -------------------------------------------------------------------------   
   // -------------------------------------------------------------------------
   
   // Expand a state traversing all instructions of that state.
   // Special case: Do not generate the tick(named) label!
   def dispatch CharSequence expand(State state) {
           '''
           «IF state.name.toLowerCase != "tick"» 
             state.name»:
           «ENDIF»
           { 
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
   // Removes the first and last character from a String if these are matching quotation marks.
   def extractCode(String hostCodeString) {
        if ((hostCodeString.startsWith("'") && hostCodeString.endsWith("'"))
            || (hostCodeString.startsWith('"') && hostCodeString.endsWith('"'))) {
            return hostCodeString.substring(1, hostCodeString.length - 1);
        } else {
            return hostCodeString
        }
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

   def expandOperator(Assignment assignment) {
       if (assignment.operator == AssignOperator.ASSIGNADD) return ''' +='''
       if (assignment.operator == AssignOperator.ASSIGNSUB) return ''' -='''
       if (assignment.operator == AssignOperator.ASSIGNMUL) return ''' *='''
       if (assignment.operator == AssignOperator.ASSIGNDIV) return ''' /='''
       if (assignment.operator == AssignOperator.POSTFIXADD) return '''++'''
       if (assignment.operator == AssignOperator.POSTFIXSUB) return '''--'''
       return ''' ='''
   }

    // Expand an ASSIGNMENT instruction.
    def dispatch CharSequence expand(Assignment assignment) {
        if (assignment.expression instanceof FunctionCall) {
            var returnValue = '''«assignment.expression.expand»;'''
            if (assignment.valuedObject != null) {
                returnValue = '''«assignment.valuedObject.expand» = ''' + returnValue
            }            
            return returnValue 
        } else {
            var returnValue = '''«assignment.valuedObject.expand»'''
            if (!assignment.indices.nullOrEmpty) {          
                for (index : assignment.indices) {
                    returnValue = returnValue + '''[«index.expand»]'''
                }
            }
            
            if (assignment.operator == AssignOperator.ASSIGNMIN) {
                returnValue = returnValue + ''' = «assignment.expression.expand» < «returnValue» ? «assignment.expression.expand» : «returnValue»;'''
            } else if (assignment.operator == AssignOperator.ASSIGNMAX) {
                returnValue = returnValue + ''' = «assignment.expression.expand» > «returnValue» ? «assignment.expression.expand» : «returnValue»;'''
            } else {
                returnValue = returnValue + assignment.expandOperator
                if ((assignment.operator != AssignOperator.POSTFIXADD) && 
                    (assignment.operator != AssignOperator.POSTFIXSUB)) {
                    returnValue = returnValue + ''' «assignment.expression.expand»;'''
                } else {
                    returnValue = returnValue + ''';'''
                }
            }
            return returnValue
        }
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
        «IF expression.subExpressions.size > 1»
            («FOR subexpression : expression.subExpressions SEPARATOR " - "»
            «subexpression.expand»
            «ENDFOR»)
        «ELSE»
        -«expression.subExpressions.head.expand»
        «ENDIF»
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
   // Expand a signal within a value reference for arrays
   def CharSequence expand_val_array(ValuedObject signal, List<Expression> indices) {
       var returnValue = '''«signal.name»'''
       for (index : indices) {
           returnValue = returnValue + '''[«index.expand»]'''
       }
       return returnValue
   }
   def dispatch CharSequence expand_val(ValuedObjectReference valuedObjectReference) {
       if (!valuedObjectReference.indices.nullOrEmpty) {
        '''«valuedObjectReference.valuedObject.expand_val_array(valuedObjectReference.indices)»'''
       } else {
        '''«valuedObjectReference.valuedObject.expand_val»'''
       }
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
   
   
   def dispatch CharSequence expand(StringValue expression) {
        '''"«expression.value»"'''
   }
   

   // Expand a boolean expression value (true or false).
   def dispatch CharSequence expand(BoolValue expression) {
        '''«IF expression.value == true »true«ENDIF»«IF expression.value == false»false«ENDIF»'''
   }

   // Expand an object reference.
   def dispatch CharSequence expand(ValuedObjectReference valuedObjectReference) {
       if (!valuedObjectReference.indices.nullOrEmpty) {
        '''«valuedObjectReference.valuedObject.expand_val_array(valuedObjectReference.indices)»'''
       } else {
        '''«valuedObjectReference.valuedObject.expand»'''
       }

   }
   
    def dispatch CharSequence expand(FunctionCall functionCall) {
        var funcCall = functionCall.functionName + "("
        
        var cnt = 0
        for(par : functionCall.parameters) {
            if (cnt>0) { funcCall = funcCall + ", " }
            if (par.callByReference) { funcCall = funcCall + "&" }
            funcCall = funcCall + par.expression.expand
            cnt = cnt + 1
        }
        funcCall = funcCall + ")"
        funcCall
   }
   
   // -------------------------------------------------------------------------   
}
