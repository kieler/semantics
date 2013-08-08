/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 
package de.cau.cs.kieler.eso.coreeso.xtend

import de.cau.cs.kieler.sim.eso.eso.tracelist
import de.cau.cs.kieler.sim.eso.eso.kvpair
import de.cau.cs.kieler.sim.eso.eso.tick
import de.cau.cs.kieler.sim.eso.eso.trace
import de.cau.cs.kieler.sim.eso.eso.EsoFactory
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scl.scl.Program
import java.io.File
import org.eclipse.core.runtime.IPath
import de.cau.cs.kieler.core.model.util.ModelUtil
import org.eclipse.core.runtime.Path
import de.cau.cs.kieler.sim.eso.eso.signal
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.scl.scl.VariableDefinition
import java.util.ArrayList

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * 
 * This class transforms a given ESO tracelist to a core ESO variant
 * 
 * In core ESO no pure nor valued signals exists. Instead there are only variables.
 * Valued signals are transformed to a present and value variable
 * 
 */
class ESO2CoreESO {
    boolean allreadyAdded
	tick newTick
	trace newTrace

    /**
     * 
     * Generates a new ESO tracelist which only contains variables.
     * 
     * @param tl original ESO file tracelist
     * 
     * @return a new tracelist without pure and valued signals
     * 
     */
	def tracelist transformESO2CoreESO (tracelist tl, File modelFile) {
	
	    val sclModel = loadSCLModel(modelFile)
	    val inputDefinitions = new ArrayList<VariableDefinition>
	    val outputDefinitions = new ArrayList<VariableDefinition>
	    
	    sclModel.definitions.forEach[ definition | 
	        if(definition.input) inputDefinitions.add(definition.copy)
	    ]
	    sclModel.definitions.forEach[ definition | 
	        if(definition.output) outputDefinitions.add(definition.copy)
	    ]

		val newTl = EsoFactory::eINSTANCE.createtracelist

        //transform all traces
		tl.traces.forEach[trace |
		    
		    //create a new trace
			newTrace = EsoFactory::eINSTANCE.createtrace
			
			//compute all ticks from current trace
			trace.ticks.forEach[tick |
			    
			    //generate a new tick
				newTick = EsoFactory::eINSTANCE.createtick
				
				//add all existing extraInfos to the new extraInfo field
				newTick.extraInfos.addAll(tick.extraInfos)
				
				//transform all input variables from the current tick
                newTick.extraInfos.addAll(computeKVP(tick.input, inputDefinitions))
                
                //add all existing extraInfosOutput to the new extraInfoOutput field
                newTick.extraInfosOutput.addAll(tick.extraInfosOutput)

                //transform all outputs variables from the current tick
                newTick.extraInfosOutput.addAll(computeKVP(tick.output, outputDefinitions))

				//add new generated tick to new trace
				newTrace.ticks.add(newTick)
			]
			//add new generated trace to the trace list
			newTl.traces.add(newTrace)
		]
		
		//return new tracelist
		return newTl
//		return tl
	}
	
	/**
	 * Generates a new KVPair, for valued signals
	 * 
	 * @param name
	 *         name of the current valued signal
	 * @param valueObject
	 *         an EObject which is an ESO-Object containing the valued information
	 * 
	 */
	def dispatch kvpair newKvpair(String name, EObject valueObject) { 
		
		//new kvpair which will be filled according to the valueObject and the name
		val kvp = EsoFactory::eINSTANCE.createkvpair
		
		//variable and signal name are the same
		kvp.setKey(name)
		
		//set value it is the same as the signal value
		kvp.setValue(valueObject)
		
		return kvp
	}

    /**
     * Generates a new KVPair, for pure signals.
     * The boolValue field is normally set to true, because if there is a pure signal in the
     * trace, the generate variable is true because the signal is emitted 
     * 
     * @param name
     *         name of the current valued signal
     * @param boolValue
     *         signal value
     */
	def dispatch newKvpair(String name, boolean boolValue){
		
		val kvp = EsoFactory::eINSTANCE.createkvpair
		
		//variable name is the same as signal name
		kvp.setKey(name)
		val value = EsoFactory::eINSTANCE.createEsoBool
		
		//set the value of the variable
		value.setValue(boolValue)
		kvp.setValue(value)
		
		return kvp
	}	
	
	/**
     * Compute how the variables should be set or tested
     * 
     * we must ensure that values which should be present in the current tick, are tested and values which are not
     * listed in an ESO file to be tested for absence, and that variables which should be set, are set to their value
     * and variables which are not listed in the current tick, to set absent
     * so compute a list of key value pairs which contains this information
     * 
     * @param signals
     *          the signals that are tested (outputs) or set (inputs)
     * 
     * @param definitions
     *          the variable definition from the according scl model
     * 
     * @return a list which contains all key value pairs that should be set or tested to a specific value 
     * 
     */
	def computeKVP(EList<signal> signals, ArrayList<VariableDefinition> definitions){
	    
	   val newKvps = new ArrayList<kvpair>
	    
	    allreadyAdded = false
	    
	    definitions.forEach[ variable | 
	        if(!signals.nullOrEmpty){
                 //check if the current variable appears in the current tick
                 signals.forEach[ signal |
                     if(variable.name.equals(signal.name)){
                         //variable appears in current tick, set it according to the appearance
                         if(signal.valued){
                             newKvps.add(newKvpair(signal.name + "_value", signal.^val))
                             newKvps.add(newKvpair(signal.name, true))
                         }else{
                             newKvps.add(newKvpair(signal.name, true))
                         }
                         //The current tested variable was set already 
                         allreadyAdded = true
                     }else if(variable.name.contains("_value")){
                         //Variables with a _value prefix should never contain in an eso file
                         //additional the _value variable is generated if there is found a valued signal
                         //The _value prefix is used in the transformation from valued signals to 
                         //variables, a valued signal S(1) is transformed to S = true and S_value = 1 
                         allreadyAdded = true
                     }
                 ]
             }
	        // This variable should not be emitted/tested in this tick, so set/test all 
             // variables to absent (false) and let the _valued variables unchanged, 
             // because this value is remembered across the ticks
             if(!allreadyAdded){
                 // Because, we cannot say anything about an absent _value variable don't set the variable 
                 // (make an assertion). A valued Signal e.g. F(6) is transformed to F and F_value,
                 // F must be set/test to/for absence only
                 if(!(variable.name.contains("_value"))){
                     val kvp = EsoFactory::eINSTANCE.createkvpair
                     val boolValue = EsoFactory::eINSTANCE.createEsoBool
                     boolValue.setValue(false)
                     kvp.setKey(variable.name)
                     kvp.setValue(boolValue)
                     newKvps.add(kvp)
                 }    
             }
             
             //set false for the next variable
             allreadyAdded = false
	    ]

	    return newKvps
	}
	
	 /**
     * loads the SCL model from a given file
     * 
     * @param modelile
     *             contains the file which holds the SCL model
     * 
     * @return the SCL model from file 
     */
    def Program loadSCLModel(File modelFile) { 

        val IPath iPath = new Path(modelFile.toString())
                
        val EObject eobject = ModelUtil::loadEObjectFromModelFile(iPath)
        
        //check if the file contains an SCL model
        if(eobject instanceof Program){
            val Program sclModel = eobject as Program
            sclModel
        }else{
            return null
        }   
    }
}





