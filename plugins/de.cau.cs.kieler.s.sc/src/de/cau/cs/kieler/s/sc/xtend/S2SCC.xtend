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
class S2SCC { 
    
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

       «/* Signal Reset, Output */»
       «sResetSignals(program)»
       «sTotalResetSignals(program)»
       «sReset(program)»

       «sOutputSignals(program)»
       «sOutputVariables(program)»

       «/* Generate input functions that are then called my the main function's
       tick function of the module */»
       «sSetInputsFunction(program, bufferSize)»

       «/* Generate output functions and reset functions for each S signal */» 
      «sSetOutputFunction(program)»

       «/* Possible global host code */»
       «if (program.globalHostCodeInstruction != null) {
       program.globalHostCodeInstruction.extractCode}»

       «/* Generate the main function */»
       «mainFunction(program)»

       «/* Generate the tick function */»
       «sTickFunction(program)»
       '''
   }     

   // -------------------------------------------------------------------------   
   
   // Generate the C header.
   def scHeader(Program program) {
       '''
    /*****************************************************************************/
    /*                 G E N E R A T E D     S C    C O D E                      */
    /*****************************************************************************/
    /* KIELER - Kiel Integrated Environment for Layout Eclipse RichClient        */
    /*                                                                           */
    /* http://www.informatik.uni-kiel.de/rtsys/kieler/                           */
    /* Copyright 2012 by                                                         */
    /* + Christian-Albrechts-University of Kiel                                  */
    /*   + Department of Computer Science                                        */
    /*     + Real-Time and Embedded Systems Group                                */
    /*                                                                           */
    /* This code is provided under the terms of the Eclipse Public License (EPL).*/
    /*****************************************************************************/

    #include <string.h>
    #include <stdlib.h>
    #include <stdio.h>

    #include "cJSON.h"
    
    «includeHeader»
    
    /* Signal constants */
    «sSignalConstants(program)»
    
    /* Variables */
    «sVariables(program)»    
    
    // Highest thread id in use;
    // Enforce the LARGEST array option for thread IDs due to problems with the intermediate LONG_BIT option 
    #define _SC_ID_MAX «2*program.priority» 

    // Highest signal id in use;
    #define _SC_SIG_MAX «program.getValuedObjects().filter[e|e.isSignal].size» 

    #include "sc.h"

    cJSON* output = 0;
    cJSON* value = 0;
    
    int presentSigInt[_SC_SIG_MAX];
    int presentSigIntPre[_SC_SIG_MAX];
    int valSigInt[_SC_SIG_MAX];
    int valSigIntPre[_SC_SIG_MAX];
    
    // order in which emits occur
    int emitCount = 0;
    int sigOrder[_SC_SIG_MAX];
    // priority with witch emits occur
    int sigPrio[_SC_SIG_MAX];
    
    #define EMIT_SCC(name) \
    presentSigInt[name] = 1; \
    sigOrder[name] = emitCount++; \
    sigPrio[name] = _cid;\
    

    #define EMIT_VAL_SCC(name, value, combine, initial) \
    if (presentSigInt[name] != 1) { \
        valSigInt[name] = initial; \
    } \
    presentSigInt[name] = 1; \
    valSigInt[name] = combine(valSigInt[name],  (int)value); \
    sigOrder[name] = emitCount++; \
    sigPrio[name] = _cid;\
    
    #define COMBINE_ADD(val1, val2) \
    (val1 + val2) \
    
    #define COMBINE_MULT(val1, val2) \
    (val1 * val2) \
    
    #define COMBINE_AND(val1, val2) \
    (val1 & val2) \
    
    #define COMBINE_OR(val1, val2) \
    (val1 || val2) \
    
    #define COMBINE_MIN(val1, val2) \
    ((val1 < val2) ? val1:val2) \
    
    #define COMBINE_MAX(val1, val2) \
    ((val1 > val2) ? val1:val2) \
    
    
    #define PRESENT_SCC(name) \
    ((presentSigInt[name]) != 0) \
    
    #define PRE_PRESENT_SCC(name) \
    ((presentSigIntPre[name]) != 0) \

    #define VAL_SCC(name) \
    (valSigInt[name]) \

    #define PRE_VAL_SCC(name) \
    (valSigIntPre[name]) \
    
    ''' 
   }
   
   // -------------------------------------------------------------------------
   
   // Generate signal constants.
   def sSignalConstants(Program program) {
       val valuedObjects = program.getValuedObjects()
       val signals = valuedObjects.filter[e|e.isSignal]
       if (!signals.nullOrEmpty) {
       '''typedef enum {«FOR signal : signals SEPARATOR ",
 "»«signal.name»«ENDFOR»} signaltype;
       
       const char *s2signame[] = {«FOR signal : signals SEPARATOR ", 
"»"«signal.name»"«ENDFOR»};'''
       }
       else {
           ''''''
       }
   }


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
       '''«FOR signal : program.getValuedObjects().filter[e|!e.isSignal] SEPARATOR ";
 "»«signal.type.expand» «signal.name» «IF signal.initialValue != null» = «signal.initialValue.expand» «ENDIF»;
  «IF program.usesPre(signal)»
     «signal.type.expand» PRE_«signal.name» «IF signal.initialValue != null» = «signal.initialValue.expand» «ENDIF»;
  «ENDIF»
  «ENDFOR»
 '''
   }
   
   
   // Generate variables.
   def sVariablesOLD(Program program) {
       '''«FOR declaration : program.declarations.filter[e|!e.isSignal&&!e.isExtern]»
          «FOR signal : declaration.valuedObjects»
            «signal.type.expand» «signal.name»«IF signal.isArray»«FOR card : signal.cardinalities»[«card»]«ENDFOR»«ENDIF»«IF signal.initialValue != null /* WILL ALWAYS BE NULL BECAUSE */»
              «IF signal.isArray»
                «FOR card : signal.cardinalities»{int i«card.hashCode» = 0; for(i«card.hashCode»=0; i«card.hashCode» < «card.intValue»; i«card.hashCode»++) {«ENDFOR»
                «signal.name»«FOR card : signal.cardinalities»[i«card.hashCode»]«ENDFOR» = «signal.initialValue.expand»;
                «FOR card : signal.cardinalities»}}«ENDFOR»
                «ELSE»
                  = «signal.initialValue.expand» 
                «ENDIF»«ENDIF»;
            
            «IF program.usesPre(signal)»
                «signal.type.expand» PRE_«signal.name» «IF signal.initialValue != null» = «signal.initialValue.expand» «ENDIF»;
            «ENDIF»
        «ENDFOR»
        «ENDFOR»
        '''
   }
   
      

   // Generate PRE variables setter.
   def setPreVariables(Program program) {
       '''«FOR signal : program.getValuedObjects().filter[e|!e.isSignal] SEPARATOR ";
 "»«IF program.usesPre(signal)» PRE_«signal.name» = «signal.name» «ENDIF»«ENDFOR»'''
   }


   def dispatch expand(ValueType valueType) {
       if ((valueType == ValueType::BOOL) || (valueType == ValueType::PURE))  {
           return '''int'''
       } else {
           return '''«valueType»'''
       }
   }
   
   // Generate simple reset.
   def sReset(Program program) {
              ''' 
       int reset() {
    RESET();
    /* initialize all  signals */
    resetSignals();
    return 0;
}
       '''
   }
   
   // -------------------------------------------------------------------------
   
   // Generate simple signal outputs.
   def sSetOutputFunction(Program program) {
       '''
    void callOutputs() {
    «FOR signal : program.getValuedObjects().filter(e|e.isOutput && e.isSignal)»
        OUTPUT_«signal.name»(PRESENT_SCC(«signal.name»));
    «ENDFOR»
    «FOR variable : program.getValuedObjects().filter(e|e.isOutput && !e.isSignal)»
        OUTPUT_«variable.name»();
    «ENDFOR»
        }
       '''
   }

   // -------------------------------------------------------------------------
   // Intermediate tick reset function.
   def sResetSignals(Program program) {
       '''
    void resetSignals() {
    «FOR signal : program.getValuedObjects().filter[e|e.isSignal]»
      presentSigIntPre[«signal.name»] = presentSigInt[«signal.name»];
      presentSigInt[«signal.name»] = 0;
      valSigIntPre[«signal.name»] = valSigInt[«signal.name»];
      «/*Do not reset valSigInt here. The value needs to stay until it
       * is changed by another emission!
       */»
    «ENDFOR»
    }
       '''
   }

   // -------------------------------------------------------------------------
   
   // Startup tick reset function
   def sTotalResetSignals(Program program) {
       '''
    void totalResetSignals() {
    «FOR signal : program.getValuedObjects().filter[e|e.isSignal]»
      presentSigInt[«signal.name»] = 0;
      presentSigIntPre[«signal.name»] = 0;
      valSigInt[«signal.name»] = «signal.combineOperator.initialValue»;
      valSigIntPre[«signal.name»] = «signal.combineOperator.initialValue»;
    «ENDFOR»
    }
       '''
   }
   
   // Generate input functions that are then called by the main function's
   // tick function of the module.
   def sSetInputsFunction(Program program, String bufferSize) {
'''
void setInputs(){
  char buffer[«bufferSize»];
  int i=0;
  char c;
  // read next line
  for (i=0; (c=getchar()) != '\n'; i++){
    buffer[i]=c;
  }
  buffer[i]=0;
  
    cJSON* object = 0;
    cJSON* child = 0;
    cJSON* present = 0;
    cJSON* value = 0;

    object = cJSON_Parse(buffer);
    
   «'''«FOR signal : program.getValuedObjects().filter[e|e.isSignal].filter(e|e.isInput||e.isOutput)»
                   «signal.callInputSignal»
   «ENDFOR»'''»    
   «'''«FOR variable : program.getValuedObjects().filter[e|!e.isSignal].filter(e|e.isInput||e.isOutput)»
                   «variable.callInputVariable»
   «ENDFOR»'''»    
   }'''
}
   
   // -------------------------------------------------------------------------
   
   // Generate the main function.
   def mainFunction(Program program) {
       '''int main(int argc, const char* argv[]) {
        reset();
        output = cJSON_CreateObject();
        RESET();
        totalResetSignals();
        setInputs();
        emitCount = 0;
        tick();
        while(1) {
            callOutputs();
            char* outString = cJSON_Print(output);
            strip_white_spaces(outString);
            printf("%s\n", outString);
            fflush(stdout);
            
            «setPreVariables(program)»
                
            resetSignals();
            output = cJSON_CreateObject();
            setInputs();
            emitCount = 0;
            tick();
        }
    }
    
    void printOutputs() {
        printf("%s \n", cJSON_Print(output));
    }
    '''
   }
      
   // -------------------------------------------------------------------------   
   
   // Generate the  tick function.
   def sTickFunction(Program program) {
       '''    int tick(){
       TICKSTART(«program.priority»);
       
       «FOR state : program.states»
       «state.expand»
       «ENDFOR»
       
       TICKEND;
    }
    '''
   }
   
   // -------------------------------------------------------------------------   

   // Define output functions to return JSON for each s signal.
   def sOutputSignals(Program program) {
    '''«'''«FOR signal : program.getValuedObjects().filter[e|e.isSignal].filter(e | e.isOutput)»
        void OUTPUT_«signal.name»(int status){
        value = cJSON_CreateObject();
        cJSON_AddItemToObject(value, "present", status?cJSON_CreateTrue():cJSON_CreateFalse());
    «IF signal.type == ValueType::INT»
cJSON_AddItemToObject(value, "value", cJSON_CreateNumber(VAL(«signal.name»)));
    «ENDIF»
        cJSON_AddItemToObject(value, "order", cJSON_CreateNumber(sigOrder[«signal.name»]));
        cJSON_AddItemToObject(value, "prio", cJSON_CreateNumber(sigPrio[«signal.name»]));
        cJSON_AddItemToObject(output, "«signal.name»", value);
        //printf("«signal.name»:%d\n", status);
        }
    «ENDFOR»'''»
    '''
   }

   // Define output functions to return JSON for each s variable.
   def sOutputVariables(Program program) {
    '''«'''«FOR signal : program.getValuedObjects().filter[e|!e.isSignal].filter(e | e.isOutput)»
        void OUTPUT_«signal.name»(){
        value = cJSON_CreateObject();
        cJSON_AddItemToObject(value, "present", «signal.name»?cJSON_CreateTrue():cJSON_CreateFalse());
        cJSON_AddItemToObject(value, "value", cJSON_CreateNumber(«signal.name»));
        //cJSON_AddItemToObject(output, "«signal.name»", cJSON_CreateNumber(«signal.name»));
        cJSON_AddItemToObject(output, "«signal.name»", value);
    }
    «ENDFOR»'''»
    '''
   }
   
   // -------------------------------------------------------------------------   
   
   // Call input functions for each JSON s signal that is present.
   def callInputSignal(ValuedObject signal) {
       if (signal.isSignal) {
           return        
       '''child = cJSON_GetObjectItem(object, "«signal.name»");
        if (child != NULL) {
            present = cJSON_GetObjectItem(child, "present");
            value = cJSON_GetObjectItem(child, "value");
            if (present != NULL && present->type) {
                if (value != NULL) {
                    // Emit with given value
                    EMIT_VAL_SCC(«signal.name», value->valueint, +,  «signal.combineOperator.initialValue»);
                } else {
                    // Emit with initial value because no value was given
                    EMIT_VAL_SCC(«signal.name», «signal.combineOperator.initialValue», +,  «signal.combineOperator.initialValue»);
                }        
            }
        }   
          
       '''
       }
   }

      // Call input functions for each JSON s signal that is present.
   def callInputVariable(ValuedObject variable) {
       if (!variable.isSignal && variable.isInput) {
          return '''
          child = cJSON_GetObjectItem(object, "«variable.name»");
          {
            cJSON* childValue = cJSON_GetObjectItem(child, "value");
            cJSON* childPresent = cJSON_GetObjectItem(child, "present");
            if (childPresent != NULL && childValue == NULL) {
                «variable.name» = childPresent->valueint;
            }
            else if (childValue != NULL) {
                «variable.name» = childValue->valueint;
            }
            else {
                «variable.name» = NULL;
            }
          }'''
       }
   }
   
   
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
       '''«assignment.valuedObject.expand » = «assignment.expression.expand»;'''
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
       '''GOTO(«transInstruction.continuation.name»);'''
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
