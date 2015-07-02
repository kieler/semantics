/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 
package de.cau.cs.kieler.eso.coreeso.xtend

import de.cau.cs.kieler.sim.eso.eso.tracelist
import de.cau.cs.kieler.sim.eso.eso.EsoInt
import de.cau.cs.kieler.sim.eso.eso.kvpair
import de.cau.cs.kieler.sim.eso.eso.EsoBool
import de.cau.cs.kieler.sim.eso.eso.tick
import de.cau.cs.kieler.sim.eso.eso.trace
import de.cau.cs.kieler.sim.eso.eso.EsoFactory
import org.eclipse.emf.ecore.EObject

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
					
					newTick.extraInfos.add(newKvpair(in.name, true))
					if(in.valued){
						newTick.extraInfos.add(newKvpair(in.name + "_value", in.^val))
					}					
				]
				tick.output.forEach[out |
					
					newTick.extraInfos.add(newKvpair(out.name, true))
					if(out.valued){
						newTick.extraInfos.add(newKvpair(out.name + "_value", out.^val))
					}
				]
				newTrace.ticks.add(newTick)
			]
			newTl.traces.add(newTrace)
		]
		
		return newTl
	}
	
	
	def dispatch kvpair newKvpair(String name, EObject valueObject) { 
		val kvp = EsoFactory::eINSTANCE.createkvpair
		//val js = EsoFactory::eINSTANCE.createEsoJson //Why Json?? 
		
		kvp.setKey(name)
		
		if(valueObject instanceof EsoInt){
			//s.setName(name)
			val EsoInt value = valueObject as EsoInt
			var intValue = EsoFactory::eINSTANCE.createEsoInt
			intValue.setValue(value.value)
			kvp.setValue(intValue)	
		}
		else if(valueObject instanceof EsoBool){
			//s.setName(name)
			val EsoBool value = valueObject as EsoBool
			val boolValue = EsoFactory::eINSTANCE.createEsoBool
			boolValue.setValue(value.value)
			kvp.setValue(boolValue)
		}
		
		return kvp
	}

	def dispatch newKvpair(String name, boolean boolValue){
		
		val kvp = EsoFactory::eINSTANCE.createkvpair
		kvp.setKey(name)
		val value = EsoFactory::eINSTANCE.createEsoBool
		value.setValue(boolValue)
		kvp.setValue(value)
		
		return kvp
	}	
}





