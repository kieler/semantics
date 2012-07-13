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

import de.cau.cs.kieler.core.kexpressions.BooleanValue
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.Signal
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.s.s.Abort
import de.cau.cs.kieler.s.s.Await
import de.cau.cs.kieler.s.s.Emit
import de.cau.cs.kieler.s.s.Fork
import de.cau.cs.kieler.s.s.Halt
import de.cau.cs.kieler.s.s.If
import de.cau.cs.kieler.s.s.Instruction
import de.cau.cs.kieler.s.s.Join
import de.cau.cs.kieler.s.s.Pause
import de.cau.cs.kieler.s.s.Prio
import de.cau.cs.kieler.s.s.Program
import de.cau.cs.kieler.s.s.State
import de.cau.cs.kieler.s.s.Term
import de.cau.cs.kieler.s.s.Trans
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.FloatValue

/**
 * Transformation of S code into SS code that can be executed using the GCC.
 * 
 * @author cmot
 */
class S2SC { 
    
    // General method to create the c simulation interface.
	def transform (Program program, String outputFolder) {
       '''
	   «/* Generate the C header */»
       «scHeader(outputFolder, program)»

	   «/* Simple Signal Reset, Input Output */»
	   «sSimpleReset(program)»

       «sSimpleInputs(program)»

       «sSimpleOutputs(program)»

	   «/* Generate input functions that are then called my the main function's
		   tick function of the module */»
       «sSetInputsFunction(program)»

	   «/* Generate output functions for each S signal */» 
       «sSetOutputFunction(program)»
	   
	   «/* Generate the main function */»
	   «mainFunction(program)»

	   «/* Generate the tick function */»
	   «tickFunction(program)»
       '''
   } 	

   // -------------------------------------------------------------------------   
   
   // Generate the C header.
   def scHeader(String outputFolderm, Program program) {
   	'''
	/*****************************************************************************/
	/*                 G E N E R A T E D     S C    C O D E                     */
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
	
	«/* Signal constants */»
	«sSignalConstant(program)»
	
# define _BitScanReverse(set, bit)				      \
  bit = 0;							      \
  for (_setPart = set; _setPart > 1; _setPart >>= 1) {		      \
    bit++;							      \
  }

	
	// Highest thread id in use;
	#define _SC_ID_MAX «program.priority» 

	// Highest signal id in use;
	#define _SC_SIG_MAX «program.getSignals().size» 

	#include "sc.h"


	cJSON* output = 0;
	cJSON* value = 0;
	
	int valSigInt[_SC_SIG_MAX];
	int valSigIntPre[_SC_SIG_MAX];
	
	''' 
   }
   
   // -------------------------------------------------------------------------
   
   // Generate signal constants.
   def sSignalConstant(Program program) {
   	'''typedef enum {«FOR signal : program.getSignals() SEPARATOR ",
 "»sig_«signal.name»«ENDFOR»} signaltype;
   	
   	const char *s2signame[] = {«FOR signal : program.getSignals() SEPARATOR ", 
"»"sig_«signal.name»"«ENDFOR»};'''
   }
   
   // Generate simple reset.
   def sSimpleReset(Program program) {
   	   	''' 
   	int simple_reset() {
	RESET();
	/* initialize all valued integer signals */
	«FOR signal : program.getSignals()»
	valSigInt[sig_«signal.name»] = 0;
	«ENDFOR»
	return 0;
}
   	'''
   }
   
   // Generate simple signal inputs.
   def sSimpleInputs(Program program) {
   	''' 
	«FOR signal : program.getSignals().filter(e|e.isInput||e.isOutput)»
void simple_INPUT_«signal.name»() {
	   _sigAdd(signals, sig_«signal.name»);
«//     signalsPtr[sig_«signal.name»] = u2b(«signal.name»);
»
« //	signals = signals | (1 << sig_«signal.name»); 
»
}
	«ENDFOR»
'''
   }
   
   // -------------------------------------------------------------------------
   
   // Generate simple signal outputs.
   def sSetOutputFunction(Program program) {
   	'''
	void callOutputs() {
		int i = 0;
	«FOR signal : program.getSignals().filter(e|e.isOutput)»
	simple_OUTPUT_«signal.name»(_sigContains(signals, sig_«signal.name»));
«//		simple_OUTPUT_«signal.name»(signals & (1 << sig_«signal.name»));
»
	«ENDFOR»
		//signals=0;
		_sigClear(signals);
		
	«FOR signal : program.getSignals().filter(e|e.isOutput)»
	_sigDel(signals, sig_«signal.name»);
«//		simple_OUTPUT_«signal.name»(signals & (1 << sig_«signal.name»));
»
	«ENDFOR»
	}
   	'''
   }
   
   // Generate input functions that are then called my the main function's
   // tick function of the module.
   def sSetInputsFunction(Program program) {
'''
void setInputs(){
  char buffer[2048];
  int i=0;
  char c;
  // read next line
  for (i=0; (c=getchar())!='\n'; i++){
    buffer[i]=c;
  }
  buffer[i]=0;
  
	cJSON* object = 0;
	cJSON* child = 0;
	cJSON* present = 0;
	cJSON* value = 0;

	object = cJSON_Parse(buffer);
	
   «'''«FOR signal : program.signals.filter(e|e.isInput||e.isOutput)»
	       		«signal.callInputs»
   «ENDFOR»'''»	
   }'''
}
   
   // -------------------------------------------------------------------------

   // Generate the main function.
   def mainFunction(Program program) {
   	'''int main(int argc, const char* argv[]) {
		simple_reset();
		output = cJSON_CreateObject();
		RESET();
		setInputs();
		tick();
		while(1) {
			callOutputs();
			char* outString = cJSON_Print(output);
			strip_white_spaces(outString);
			printf("%s\n", outString);
			fflush(stdout);
			//reset();
			output = cJSON_CreateObject();
			setInputs();
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
   def tickFunction(Program program) {
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
   def sSimpleOutputs(Program program) {
	'''«'''«FOR signal : program.signals.filter(e | e.isOutput)»
		void simple_OUTPUT_«signal.name»(int status){
		value = cJSON_CreateObject();
		cJSON_AddItemToObject(value, "present", status?cJSON_CreateTrue():cJSON_CreateFalse());
	«IF signal.type == ValueType::INT»
cJSON_AddItemToObject(value, "value", cJSON_CreateNumber(VAL(sig_«signal.name»)));
	«ENDIF»
		cJSON_AddItemToObject(output, "«signal.name»", value);
		}
	«ENDFOR»'''»
	'''
   }
   
   // -------------------------------------------------------------------------   
   
   // Call input functions for each JSON s signal that is present.
   def callInputs(Signal signal) {
   	'''child = cJSON_GetObjectItem(object, "«signal.name»");
		if (child != NULL) {
			present = cJSON_GetObjectItem(child, "present");
			value = cJSON_GetObjectItem(child, "value");
			if (present != NULL && present->type) {
				simple_INPUT_«signal.name»();
			}
		}   
   	   
   	'''
   }
   
   // -------------------------------------------------------------------------   
   // -------------------------------------------------------------------------
   
   // Expand a state traversing all instructions of that state.
   def dispatch expand(State state) {
   		'''«state.name»: 
   		«FOR instruction : state.instructions»
   		«instruction.expand»
   		«ENDFOR»
   		'''
   }
   
   // Expand an IF instruction traversing all instructions of that IF instruction.
   def dispatch expand(If ifInstruction) {
   	'''if («ifInstruction.expression.expand») { 
   		«FOR instruction : ifInstruction.instructions»
   			«instruction.expand»
   		«ENDFOR»
         }'''
   }   
   
   // Expand a PAUS instruction.
   def dispatch expand(Pause pauseInstruction) {
   	'''PAUSE;'''
   }   
   
   // Expand a TERM instruction.
   def dispatch expand(Term termInstruction) {
   	'''TERM;'''
   }   
   
   // Expand a HALT instruction.
   def dispatch expand(Halt haltInstruction) {
   	'''HALT;'''
   }   
   
   // Expand a JOIN instruction.
   def dispatch expand(Join joinInstruction) {
   	'''JOINELSE(«joinInstruction.continuation.name»);'''
   } 
   
   // Expand an ABORT instruction.  
   def dispatch expand(Abort abortInstruction) {
   	'''ABORT;'''
   }   
   
   // Retrieve the last FORK instruction because in SC the last fork
   // will become an FORKE statement.
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
   def dispatch expand(Fork forkInstruction) {
   	'''«IF forkInstruction.getLastFork != forkInstruction» 
   	      FORK(«forkInstruction.thread.name»,«forkInstruction.priority»);
   	   «ENDIF»
   	   «IF forkInstruction.getLastFork == forkInstruction» 
   	      FORKE(«forkInstruction.thread.name»);
   	   «ENDIF»
   	'''
   }   

   // Expand a TRANS instruction.	
   def dispatch expand(Trans transInstruction) {
   	'''GOTO(«transInstruction.continuation.name»);'''
   }   
   
   // Expand an AWAIT instruction.
   def dispatch expand(Await awaitInstruction) {
   	'''AWAIT;'''
   }   
   
   // Expand a PRIO instruction.
   def dispatch expand(Prio prioInstruction) {
   	'''PRIO(«prioInstruction.priority»);'''
   }   
   
   // Expand an EMIT instruction.
   def dispatch expand(Emit emitInstruction) {
   	if (emitInstruction.value != null) {
	   	'''EMITINTADD(sig_«emitInstruction.signal.name», «emitInstruction.value.expand»);'''
   		
   	}
   	else {
   		'''EMIT(sig_«emitInstruction.signal.name»);'''
   	}
   }   
   
   // Expand fall back for other instructions do nothing.
   def dispatch expand(Instruction instruction) {
   }   
   
   // -------------------------------------------------------------------------   
   // -------------------------------------------------------------------------
   
   //Expand a complex expression.
   def dispatch expand(OperatorExpression expression) {
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
	    (VAL(«expression.subExpressions.toList.head.expand»))
	«ENDIF»
	«IF expression.operator  == OperatorType::PRE»
	    (PRE(«expression.subExpressions.toList.head.expand»))
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
	
   // Expand a signal.
   def dispatch expand(Signal signal) {
   	 '''PRESENT(sig_«signal.name»)'''
   }

   // Expand a int expression value.
   def dispatch expand(IntValue expression) {
   	 '''«expression.value.toString»'''
   }

   // Expand a float expression value.
   def dispatch expand(FloatValue expression) {
   	 '''«expression.value.toString»'''
   }

   // Expand a boolean expression value (true or false).
   def dispatch expand(BooleanValue expression) {
   	 '''«IF expression.value == true »1«ENDIF»«IF expression.value == false»0«ENDIF»'''
   }

   
   // Expand an object reference.
   def dispatch expand(ValuedObjectReference valuedObjectReference) {
   	 '''«valuedObjectReference.valuedObject.expand»'''
   }
   
   // Expand a valued object.
   def dispatch expand(ValuedObject valuedObject) {
   	 ''''''
   }

   // -------------------------------------------------------------------------   
}
