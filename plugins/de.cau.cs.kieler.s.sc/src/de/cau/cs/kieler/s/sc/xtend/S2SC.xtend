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
	def createS2SC (Program program) {
       '''
	   «/* Generate the C header */»
       «scHeader()»

	   «/* Generate output functions for each Esterel signal */» 
	   «'''«FOR signal : program.signals.filter(e | e.isOutput)»
	       		«signal.outputFunctions»
	   «ENDFOR»'''»

	   «/* Generate input functions that are then called my the main function's
		   tick function of the module */»
       «sSetInputsFunction(program)»

	   «/* Generate the main tick function */»
	   «tickFunction(program)»

       '''
   } 	

   // -------------------------------------------------------------------------   
   
   // Generate the C header
   def scHeader() {
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

    #include "misc.h"
    #include "sc.h"
	''' 
   }
   
   // -------------------------------------------------------------------------   
   
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
	
   «'''«FOR signal : program.signals.filter(e|e.isInput)»
	       		«signal.callInputs»
   «ENDFOR»'''»	
   }'''
}
   
   // -------------------------------------------------------------------------   
   
   // Generate the generic C main function
   def tickFunction(Program program) {
   	'''    int tick(){
       TICKSTART(«program.priority»);
       
       «FOR state : program.states»
       «state.expand»
       «ENDFOR»
       
    }
	'''
   }
   
   // -------------------------------------------------------------------------   

   // Define output functions to return JSON for each s signal 
   def outputFunctions(Signal signal) {
	'''void «(((signal as EObject).eContainer) as Program).name»_OUTPUT_«signal.name»(int status){
		value = cJSON_CreateObject();
		cJSON_AddItemToObject(value, "present", status?cJSON_CreateTrue():cJSON_CreateFalse());
		«IF signal.type == ValueType::INT»
			cJSON_AddItemToObject(value, "value", cJSON_CreateNumber(VAL(sig_«signal.name»)));
		«ENDIF»
		cJSON_AddItemToObject(output, "«signal.name»", value);
	}'''
   }
   
   // -------------------------------------------------------------------------   
   
   // Call input functions for each JSON s signal that is present
   def callInputs(Signal signal) {
	'''void «(((signal as EObject).eContainer) as Program).name»_INPUT_«signal.name»(«IF signal.type!="ValueType::PURE"»int val«ENDIF») {
		signals = signals | (1 << sig_«signal.name»);
		«IF signal.type!="ValueType::PURE"»valSigInt[sig_«signal.name»]=val;«ENDIF»
	}'''
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
   	'''EMIT;'''
   }   
   def dispatch expand(Instruction instruction) {
   }   


}
