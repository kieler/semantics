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

/**
 * 
 * This class transforms a given ESO tracelist to a core ESO variant
 * 
 * In core ESO no pure nor valued signals exists. Instead there are only variables.
 * Valued signals are transformed to a present and value variable
 * 
 */
class ESO2CoreESO {
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
	def tracelist transformESO2CoreESO (tracelist tl) {
	
		val newTl = EsoFactory::eINSTANCE.createtracelist

        //transform all traces
		tl.traces.forEach[trace |
		    
		    //create a new trace
			newTrace = EsoFactory::eINSTANCE.createtrace
			
			//compute all ticks from current trace
			trace.ticks.forEach[tick |
			    
			    //generate a new tick
				newTick = EsoFactory::eINSTANCE.createtick
				
				//transform all input variables from the current tick
				tick.input.forEach[in |
					
					//add an variable (extra Info)
					//pure signal transformation
					newTick.extraInfos.add(newKvpair(in.name, true))
					if(in.valued){
					    //valued signal transformation
						newTick.extraInfos.add(newKvpair(in.name + "_value", in.^val))
					}					
				]     
                
                //transform all outputs variables from the current tick
				tick.output.forEach[out |
					
					//add an variable (extra Info)
                    //pure signal transformation
					newTick.extraInfos.add(newKvpair(out.name, true))
					if(out.valued){
					    //valued signal transformation
						newTick.extraInfos.add(newKvpair(out.name + "_value", out.^val))
					}
				]
				//add new generated tick to new trace
				newTrace.ticks.add(newTick)
			]
			//add new generated trace to the trace list
			newTl.traces.add(newTrace)
		]
		
		//return new tracelist
		return newTl
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
}





