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
import de.cau.cs.kieler.sim.coreeso.coreEso.CoreEsoFactory
import de.cau.cs.kieler.sim.coreeso.coreEso.coreTracelist
import de.cau.cs.kieler.sim.coreeso.coreEso.coreTrace
import de.cau.cs.kieler.sim.coreeso.coreEso.coreTick

class ESO2CoreESO {
	coreTick newTick
	coreTrace newTrace


	def coreTracelist transformESO2CoreESO (tracelist tl) {
	
		return generateCoreEso(tl)
	}	

	def generateCoreEso(tracelist tl){	

		val ctl = CoreEsoFactory::eINSTANCE.createcoreTracelist

		tl.traces.forEach[trace |
			newTrace = CoreEsoFactory::eINSTANCE.createcoreTrace
			trace.ticks.forEach[tick |
				newTick = CoreEsoFactory::eINSTANCE.createcoreTick
				tick.input.forEach[in |
					if(in.valued){
						newTick.input.add(newKeyValuePair(in.name, true))
						newTick.input.add(newKeyValuePair(in.name + "_value", getValue(in)))
					}
					else{
						newTick.input.add(newKeyValuePair(in.name, getValue(in)))
					}
					
				]
				tick.output.forEach[out |
					if(out.valued){
						newTick.output.add(newKeyValuePair(out.name, true))
						newTick.output.add(newKeyValuePair(out.name + "_value", getValue(out)))
					}
					else{
						newTick.output.add(newKeyValuePair(out.name, getValue(out)))
					}
				]
				newTrace.ticks.add(newTick)
			]
			ctl.traces.add(newTrace)
		]
		
		return ctl
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

	def dispatch newKeyValuePair(String name, int intVal) { 
		
		val kvp = CoreEsoFactory::eINSTANCE.createcoreKvpair
		kvp.setKey(name)
		val value = CoreEsoFactory::eINSTANCE.createCoreEsoInt
		value.setValue(intVal)
		kvp.setValue(value)
		kvp
	}

	def dispatch newKeyValuePair(String name, boolean booleanVal) { 
		
		val kvp = CoreEsoFactory::eINSTANCE.createcoreKvpair
		kvp.setKey(name)
		val value = CoreEsoFactory::eINSTANCE.createCoreEsoBool
		value.setValue(booleanVal)
		kvp.setValue(value)
		kvp
	}
}





