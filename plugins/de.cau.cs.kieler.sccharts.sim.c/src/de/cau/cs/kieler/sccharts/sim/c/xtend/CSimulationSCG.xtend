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
 package de.cau.cs.kieler.sccharts.sim.c.xtend

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.scg.SCGraph

/**
 * Transformation from SCG to wrapper code for the simulation.
 * 
 * @author cmot
 */
class CSimulationSCG { 

    @Inject
    extension KExpressionsExtension    

    // General method to create the c simulation interface.
	def transform (SCGraph scg, String bufferSize) {
       '''
	   «/* Generate the C header */»
       «generateHeader(scg)»

       «readInputs(scg, bufferSize)»

       «writeOutputs(scg)»

	   «/* Generate the main function */»
	   «mainFunction(scg)»
       '''
   } 	

   // -------------------------------------------------------------------------   
   
   // Generate the C header.
   def generateHeader(SCGraph scg) {
   	'''
	/*****************************************************************************/
	/*       G E N E R A T E D     C     S I M U L A T I O N   C O D E           */
	/*****************************************************************************/
	/* KIELER - Kiel Integrated Environment for Layout Eclipse RichClient        */
	/*                                                                           */
	/* http://www.informatik.uni-kiel.de/rtsys/kieler/                           */
	/* Copyright 2014 by                                                         */
	/* + Kiel University                                  */
	/*   + Department of Computer Science                                        */
	/*     + Real-Time and Embedded Systems Group                                */
	/*                                                                           */
	/* This code is provided under the terms of the Eclipse Public License (EPL).*/
	/*****************************************************************************/

	#include <string.h>
	#include <stdlib.h>
	#include <stdio.h>

	#include "cJSON.c"
	
	#include "scchart.c"

	cJSON* output = 0;
	''' 
   }
   
   // -------------------------------------------------------------------------
   
   // Read inputs.
   def readInputs(SCGraph scg, String bufferSize) {
   	'''
void readInputs() {
   char buffer[«bufferSize»];
   int i=0;
   char c;
   // read next line
   for (i=0; (c=getchar())!='\n'; i++){buffer[i]=c;} buffer[i]=0;
  
   cJSON* object = 0;
   cJSON* child = 0;
   cJSON* present = 0;
   cJSON* value = 0;

    object = cJSON_Parse(buffer);
    
    «FOR valuedObject : scg.getValuedObjects().filter[ isInput ]» 
    child = cJSON_GetObjectItem(object, "«valuedObject.name»");
    if (child != NULL) {
            present = cJSON_GetObjectItem(child, "present");
            value = cJSON_GetObjectItem(child, "value");
            if (present != NULL && present->type) {
                «valuedObject.name» = 1;
            }
            else if (value != NULL && value->type) {
                «valuedObject.name»  = value->valueint;
            }
            else {
                «valuedObject.name» = 0;
            }
    }   
    «ENDFOR»
}'''
  }
   
   // -------------------------------------------------------------------------
   
   // Write outputs.
   def writeOutputs(SCGraph scg) {
   	'''
void writeOutputs() {
    cJSON* value;;
	«FOR output : scg.getValuedObjects().filter[ !isInput ]»
	value = cJSON_CreateObject();
	cJSON_AddItemToObject(value, "value", cJSON_CreateNumber(«output.name»));
	cJSON_AddItemToObject(output, "«output.name»", value);
    «ENDFOR»
}'''
   }

   // -------------------------------------------------------------------------

   // Generate the main function.
   def mainFunction(SCGraph scg) {
   	'''
int main(int argc, const char* argv[]) {
        reset();
		output = cJSON_CreateObject();
		readInputs();
		tick();
		while(1) {
			writeOutputs();
			char* outString = cJSON_Print(output);
			strip_white_spaces(outString);
			printf("%s\n", outString);
			fflush(stdout);
			output = cJSON_CreateObject();
			readInputs();
			tick();
		}
}
	'''
   }
      
   // -------------------------------------------------------------------------   
   
}
