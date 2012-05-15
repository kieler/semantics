package de.cau.cs.kieler.s.sc.xtend

import de.cau.cs.kieler.synccharts.*
import de.cau.cs.kieler.s.s.SFactory
import de.cau.cs.kieler.core.kexpressions.*
import java.util.*

import org.eclipse.xtend2.lib.StringConcatenation
import de.cau.cs.kieler.s.s.Program
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.s.s.State
import de.cau.cs.kieler.s.s.Instruction
import de.cau.cs.kieler.s.s.Pause
import de.cau.cs.kieler.s.s.Term
import de.cau.cs.kieler.s.s.Halt
import de.cau.cs.kieler.s.s.Join
import de.cau.cs.kieler.s.s.Abort
import de.cau.cs.kieler.s.s.Fork
import de.cau.cs.kieler.s.s.Trans
import de.cau.cs.kieler.s.s.Await
import de.cau.cs.kieler.s.s.Prio
import de.cau.cs.kieler.s.s.Emit

// Transformation of S code to SC code.
//
// author: cmot
class S2SC { 
    
    // Generale method to create the c simulation interface
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
   
   // Generate the C header
   def scHeader(String outputFolderm, Program program) {
   	'''
    /*****************************************************************************/
    /* Generated SC-code                                                         */
    /*****************************************************************************/
    /* KIELER - Kiel Integrated Environment for Layout Eclipse RichClient        */
    /*                                                                           */
    /* http://www.informatik.uni-kiel.de/rtsys/kieler/                           */
    /*                                                                           */
    /* Copyright 2009 by                                                         */
    /* + Christian-Albrechts-University of Kiel                                  */
    /*   + Department of Computer Science                                        */
    /*     + Real-Time and Embedded Systems Group                                */
    /*                                                                           */
    /* This code is provided under the terms of the Eclipse Public License (EPL).*/
    /*****************************************************************************/

	#include <string.h>
	#include <stdlib.h>
	#include <stdio.h>

    #include "sc.h"
	#include "cJSON.h"
	
	«/* Signal constants */»
	«sSignalConstant(program)»
	

	// Highest signal id in use;
    #define _SC_valSigInt_SIZE «program.getSignals().size» 

	cJSON* output = 0;
	cJSON* value = 0;
	
	int valSigInt[_SC_valSigInt_SIZE];
	int valSigIntPre[_SC_valSigInt_SIZE];
	
	''' 
   }
   
   // -------------------------------------------------------------------------
   
   def sSignalConstant(Program program) {
   	'''typedef enum {«FOR signal : program.getSignals() SEPARATOR ", "»sig_«signal.name»«ENDFOR»} signaltype;
   	
   	const char *s2signame[] = {«FOR signal : program.getSignals() SEPARATOR ", "»"sig_«signal.name»"«ENDFOR»};'''
   }
   
   // Generate simple reset
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
   
   // Generate simple signal inputs
   def sSimpleInputs(Program program) {
   	''' 
	«FOR signal : program.getSignals().filter(e|e.isInput||e.isOutput)»
void simple_INPUT_«signal.name»() {
	signals = signals | (1 << sig_«signal.name»);
}
	«ENDFOR»
'''
   }
   
   // -------------------------------------------------------------------------
   
   // Generate simple signal outputs
   def sSetOutputFunction(Program program) {
   	'''
	void callOutputs() {
	«FOR signal : program.getSignals().filter(e|e.isOutput)»
		simple_OUTPUT_«signal.name»(signals & (1 << sig_«signal.name»));
	«ENDFOR»
		signals=0;
	}
   	'''
   }
   
   // Generate input functions that are then called my the main function's
   // tick function of the module
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

   // Generate the main function
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
   
   // Generate the  tick function
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

   // Define output functions to return JSON for each s signal 
   def sSimpleOutputs(Program program) {
'''	   «'''«FOR signal : program.signals.filter(e | e.isOutput)»
       void «(((signal as EObject).eContainer) as Program).name»_OUTPUT_«signal.name»(int status){
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
   
   // Call input functions for each JSON s signal that is present

	//	child = cJSON_GetObjectItem(object, "S");
	//	if (child != NULL) {
	//		present = cJSON_GetObjectItem(child, "present");
	//		value = cJSON_GetObjectItem(child, "value");
	//		if (present != NULL && present->type) {
	//			simple_I_S();
	//		}
	//	}   
   
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
//	'''void «(((signal as EObject).eContainer) as Program).name»_INPUT_«signal.name»(«IF signal.type!="ValueType::PURE"»int val«ENDIF») {
//		signals = signals | (1 << sig_«signal.name»);
//		«IF signal.type!="ValueType::PURE"»valSigInt[sig_«signal.name»]=val;«ENDIF»
//	}'''
   }
   
   // -------------------------------------------------------------------------   
   // -------------------------------------------------------------------------
   
   def expand(State state) {
   		'''«FOR instruction : state.instructions»
   		«instruction.expand»
   		«ENDFOR»
   		'''
   }
   
   def dispatch expand(Pause pause) {
   	'''PAUSE;'''
   }   
   def dispatch expand(Term term) {
   	'''TERM;'''
   }   
   def dispatch expand(Halt halt) {
   	'''HALT;'''
   }   
   def dispatch expand(Join join) {
   	'''JOIN;'''
   }   
   def dispatch expand(Abort abort) {
   	'''ABORT;'''
   }   
   def dispatch expand(Fork fork) {
   	'''FORK;'''
   }   
   def dispatch expand(Trans trans) {
   	'''TRANS;'''
   }   
   def dispatch expand(Await await) {
   	'''AWAIT;'''
   }   
   def dispatch expand(Prio prio) {
   	'''PRIO;'''
   }   
   def dispatch expand(Emit emit) {
   	'''EMIT(sig_«emit.signal.name»);'''
   }   
   def dispatch expand(Instruction instruction) {
   }   


}
