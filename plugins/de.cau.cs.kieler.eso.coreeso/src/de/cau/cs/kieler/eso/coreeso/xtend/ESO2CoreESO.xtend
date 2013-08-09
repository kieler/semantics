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
 * If a signals is absent in ESO file 
 * 
 * @author gjo
 */
class ESO2CoreESO {
    boolean allreadyAdded
    
    /** contains the information for one tick */
	tick newTick
	/** contains the the information for one trace */
	trace newTrace

    /**
     * 
     * Generates a new ESO tracelist which only contains variables.
     * 
     * @param tracelist original ESO file tracelist
     * 
     * @return a new tracelist without pure and valued signals
     * 
     */
	def tracelist transformESO2CoreESO (tracelist tracelist, File modelFile) {
	    //the scl model
	    val sclModel = loadSCLModel(modelFile)
	    
	    //all input definitions from scl model
	    val inputDefinitions = new ArrayList<VariableDefinition>
	    
	    //al output definitions from scl model
	    val outputDefinitions = new ArrayList<VariableDefinition>
	    
	    //get all input definitions
	    sclModel.definitions.forEach[ definition | 
	        if(definition.input) inputDefinitions.add(definition.copy)
	    ]
	    // get all output definitions
	    sclModel.definitions.forEach[ definition | 
	        if(definition.output) outputDefinitions.add(definition.copy)
	    ]

        //the new core eso tracelist
		val coreTracelist = EsoFactory::eINSTANCE.createtracelist

        //transform all traces
		tracelist.traces.forEach[trace |
		    
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
			coreTracelist.traces.add(newTrace)
		]
		
		//return new core tracelist
		return coreTracelist
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
	def dispatch kvpair newKvpair(String name, EObject value) { 
		
		//new kvpair which will be filled according to the valueObject and the name
		val kvp = EsoFactory::eINSTANCE.createkvpair
		
		//variable and signal name are the same
		kvp.setKey(name)
		
		//set value it is the same as the signal value
		kvp.setValue(value)
		
		return kvp
	}

    /**
     * Generates a new KVPair, for pure signals.
     * A pure signal is transformed into a variable. A variable is set to true if the signal is present,
     * otherwise false
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
     * we must ensure that values which should be present in the current tick, are tested and values 
     * which are not listed in an ESO file to be tested for absence, and that variables which should 
     * be set, are set to their value and variables which are not listed in the current tick, to set 
     * absent so compute a list of key value pairs which contains this information
     * 
     * @param signals
     *          the signals that are tested (outputs) or set (inputs)
     * 
     * @param definitions
     *          the variable definition from the appropriated scl model
     * 
     * @return a list which contains all key value pairs that should be set or tested to a specific value 
     * 
     */
	def computeKVP(EList<signal> signals, ArrayList<VariableDefinition> definitions){
	    
	    // list from key value pairs
	    val newKvps = new ArrayList<kvpair>
	    
	    // If there is an assignment in the eso file to a specific variable then these variable has a
	    // value for these tick, if the value for a variable is not assigned in the ESO we must set is 
	    // to absent
	    allreadyAdded = false
	    
	    //check for all variables if they have a definition in the eso file
	    definitions.forEach[ variable | 
	        // if the current eso tick is empty then add a kvp which shows an absent variable
	        if((!signals.nullOrEmpty) && (!variable.name.contains("_value"))){
                 //check if the current variable appears in the current tick
                 signals.forEach[ signal |
                     if(variable.name.equals(signal.name)){
                         //variable appears in current tick, set it according to the appearance
                         if(signal.valued){
                             //Here a valued signal is separated into a present and a valued variable
                             newKvps.add(newKvpair(signal.name + "_value", signal.^val))
                             newKvps.add(newKvpair(signal.name, true))
                         }else{
                             //pure signals get a variable
                             newKvps.add(newKvpair(signal.name, true))
                         }
                         //The current tested variable was set already, so it don't must be set absence
                         allreadyAdded = true
                     
//                     // Variables with a _value prefix should not appear in an eso file
//                     // additional: the _value variable is already generated if there is found a valued 
//                     // signal. The _value prefix is used in the transformation from valued signals to 
//                     // variables, a valued signal S(1) is transformed to S = true and S_value = 1
//                     }else if(variable.name.contains("_value")){
//                         // so if there is found a variable definition in the scl model which contains
//                         // the _value prefix, it is already created in the previous part of this method
//                         allreadyAdded = true
                     }
                 ]
             }
	         // This variable should not be emitted/tested for presence in this tick, so set/test all 
             // variables for absence (false) and let the _valued variables unchanged, 
             // because this value is remembered across the ticks
             if(!allreadyAdded){
                 // Because, we cannot say anything about an absent _value variable don't set the variable 
                 // (or make an assertion if it will be tested). 
                 // A valued Signal e.g. F(6) is transformed to F and F_value,
                 // F must be set/test to/for absence only
                 if(!(variable.name.contains("_value"))){
                     // create a new key value pair
                     val kvp = EsoFactory::eINSTANCE.createkvpair
                     // create a new ESO bool object
                     val boolValue = EsoFactory::eINSTANCE.createEsoBool
                     // set the new key valua pair
                     boolValue.setValue(false)
                     kvp.setKey(variable.name)
                     kvp.setValue(boolValue)
                     
                     // add this key value pair to list that will be returnd
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





