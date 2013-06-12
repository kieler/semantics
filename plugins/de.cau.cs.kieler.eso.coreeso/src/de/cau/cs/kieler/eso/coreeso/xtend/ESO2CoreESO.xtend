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
import de.cau.cs.kieler.sim.eso.eso.EsoInt
import de.cau.cs.kieler.sim.eso.eso.signal
import de.cau.cs.kieler.sim.eso.eso.EsoBool
import de.cau.cs.kieler.sim.eso.eso.tick
import de.cau.cs.kieler.sim.eso.eso.trace
import de.cau.cs.kieler.sim.eso.eso.EsoFactory

class ESO2CoreESO {
	tick newTick
	trace newTrace

	def tracelist transformESO2CoreESO (tracelist tl) {
	
		return generateCoreEso(tl)
	}	

	def generateCoreEso(tracelist tl){	

		val newTl = EsoFactory::eINSTANCE.createtracelist

		tl.traces.forEach[trace |
			newTrace = EsoFactory::eINSTANCE.createtrace
			trace.ticks.forEach[tick |
				newTick = EsoFactory::eINSTANCE.createtick
				tick.input.forEach[in |
					
					newTick.input.add(newSignal(in.name, true))
					if(in.valued){
						newTick.extraInfos.add(newKeyValuePair(in.name + "_value", getValue(in)))
					}					
				]
				tick.output.forEach[out |
					
					newTick.output.add(newSignal(out.name, true))
					if(out.valued){
						newTick.extraInfos.add(newKeyValuePair(out.name + "_value", getValue(out)))
					}
				]
				newTrace.ticks.add(newTick)
			]
			newTl.traces.add(newTrace)
		]
		
		return newTl
	}
	
	def getValue(signal s) {
		val value = s.^val
		if(s.valued){
			if(value instanceof EsoInt){
				val EsoInt v = value as EsoInt
				return v.value
			}
			if(value instanceof EsoBool){
				val EsoBool v = value as EsoBool
				return v.value
			}
		}
		else{
			return true
		}
	}

	def  newSignal(String name, boolean boolValue){
		
		val s = EsoFactory::eINSTANCE.createsignal
		s.setName(name)
		val value = EsoFactory::eINSTANCE.createEsoBool
		value.setValue(boolValue)
		s.setVal(value)
		s.setValued(true)
		
		return s
	}

	def dispatch newKeyValuePair(String name, int intVal) { 
		
		val kvp = EsoFactory::eINSTANCE.createkvpair
		kvp.setKey(name)
		val value = EsoFactory::eINSTANCE.createEsoInt
		value.setValue(intVal)
		kvp.setValue(value)
		
		return kvp
	}

	def dispatch newKeyValuePair(String name, boolean booleanVal) { 
		
		val kvp = EsoFactory::eINSTANCE.createkvpair
		kvp.setKey(name)
		val value = EsoFactory::eINSTANCE.createEsoBool
		value.setValue(booleanVal)
		kvp.setValue(value)
		
		return kvp
	}
}





