/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.circuit.ui.simulation

import com.google.common.collect.HashMultimap
import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.Link
import de.cau.cs.kieler.circuit.Port
import de.cau.cs.kieler.kicool.ide.klighd.models.ModelChain
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KForeground
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.ui.visualization.DiagramHighlighter
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedList
import java.util.List
import java.util.Set

/**
 * @author fry 
 * 
 * DataComponent which highlights circuit components during simulation.
 *
 */
 
class CircuitDiagramHighlighter extends DiagramHighlighter {

	@Inject extension KRenderingExtensions

	// ----------------------------------------------------------------------
	// too many global maps..
	// ----------------------------------------------------------------------
		
	// highlighting info
	val HashMultimap<String, KRendering> actorMapping = HashMultimap.create // stores every gate name and its highlightable parts
	val HashMultimap<String, KRendering> linkMapping = HashMultimap.create // stores source port name and outgoing link
	// Object maps
	val LinkedList<Link> wires = new LinkedList<Link> // stores all links
	val LinkedList<Actor> actors = new LinkedList<Actor> // stores all actors
	val LinkedList<String> targetPorts = new LinkedList<String> // stores target port for each link with 1
	val HashMap<String, Boolean> muxFlapChange = new HashMap<String, Boolean> // stores whether a mux shall change position of flap
	val HashMap<String, Boolean> regChange = new HashMap<String, Boolean> // stores whether a reg shall be highlighted
	
	//these maps store content of other maps for each tick
	//this is necessary because backward steps in simulation shall work...
	val LinkedList<HashMap<String, Boolean>> muxFlapChangeCollection = new LinkedList<HashMap<String, Boolean>>
	val LinkedList<HashMap<String, Boolean>> regChangeCollection = new LinkedList<HashMap<String, Boolean>>
	val LinkedList<HashSet<String>> highlightingCollection = new LinkedList<HashSet<String>>

	static long tick = 0 //stores active tick
	static long oldTick = 0 // stores tick before active tick
	static boolean newTick = true // is true if this tick is a new tick (no back step)

    static var CircuitDiagramHighlighter instance
    
    static val KForeground LOW_WIRE_ELEMENT_STYLE = createLowElementStyle
    static val KForeground HIGH_WIRE_ELEMENT_STYLE = createHighElementStyle

    private new() {
        Guice.createInjector().injectMembers(this)
    }
    
    static def create() {
        if(instance === null) {
            instance = new CircuitDiagramHighlighter
        }
        instance
    }
    
    override getName() {
        return "Circuit Highlighter"
    }

    def isSupported(SimulationContext ctx) {
        return getActorModel !== null
    }
    
    def Actor getActorModel() {
        val currentDiagramModel = diagramViewContext.inputModel
        if(currentDiagramModel instanceof Actor) {
            return currentDiagramModel
        } else if (currentDiagramModel instanceof ModelChain) {
            return currentDiagramModel.models.findFirst[ it instanceof Actor ] as Actor
        }
        return null
    }
    
    private static def KForeground createLowElementStyle() {
        val style = KRenderingFactory.eINSTANCE.createKForeground()
        style.setColor(Colors::GRAY_55)
        style.setPropagateToChildren(true)
        return style
    }
        
    private static def KForeground createHighElementStyle() {
        val style = KRenderingFactory.eINSTANCE.createKForeground()
        style.setColor(Colors::LIGHT_SALMON)
        style.setPropagateToChildren(true)
        return style
    }  
    
    private def getActorsAndWires() {
        wires.clear
        actors.clear
        
        val circuit = getActorModel
        if (circuit === null) 
          return;

        // -------------------------------------------------------------
        // Store all KEdges and their source port names               --
        // and store all links                                        --
        // -------------------------------------------------------------
        circuit.eAllContents.filter(Link).forEach [ link |
            wires.add(link)
        ]

        // -------------------------------------------------------------------
        // Store all KRendering information for gate highlighting           --
        // -------------------------------------------------------------------
        for (node : circuit.eAllContents.filter(Actor).toList) {
            val atomicActor = node.innerActors.empty

            if (atomicActor && (node.name !== null) && (node.type !== null)) {
                actors.add(node)
            }
        }        
    }  
    
	// ----------------------------------------------------------------------
	// in this method several maps are cleared and filled with information --
	// ----------------------------------------------------------------------
	override initialize(SimulationContext ctx) {
        super.initialize(ctx)

		actorMapping.clear
		wires.clear
		actors.clear
		linkMapping.clear
		targetPorts.clear
		muxFlapChange.clear
		regChange.clear
		tick = 0
		oldTick = 0
		newTick = true
		highlightingCollection.clear
		muxFlapChangeCollection.clear
		regChangeCollection.clear
		
		val circuit = getActorModel
		if (circuit === null) 
		  return;

		// -------------------------------------------------------------
		// Store all KEdges and their source port names               --
		// and store all links                                        --
		// -------------------------------------------------------------
		circuit.eAllContents.filter(Link).forEach [ link |
    		wires.add(link)
		]
		
        val lowWiresHighlighting = getHighlighting(wires, LOW_WIRE_ELEMENT_STYLE)
                                           
        highlightDiagram(lowWiresHighlighting)		

		// -------------------------------------------------------------------
		// Store all KRendering information for gate highlighting           --
		// -------------------------------------------------------------------
		for (node : circuit.eAllContents.filter(Actor).toList) {
			val atomicActor = node.innerActors.empty

			if (atomicActor && (node.name !== null) && (node.type !== null)) {
    			actors.add(node)
					
				//store each register and each mux in maps for flap and register highlighting
				if (node.type !== null) {
					if (node.type == "MUX") {
						muxFlapChange.put(node.name, false)
					} else if (node.type == "REG") {
						regChange.put(node.name, false)
					}
				}
			}
    	}
	}
	
	// -------------------------------------------------------------------------------------------------
	// In each step: list the gates which shall be highlighted                     --
	// -------------------------------------------------------------------------------------------------
	override update(SimulationContext ctx) {
        super.update(ctx)
        val pool = ctx.dataPool
        
        getActorsAndWires
        
	    unhighlightDiagram      
	    
	    if (!isSupported(ctx)) 
	       return;
	    
		var highlighting = <String>newHashSet // this map stores the nodes which shall be highlighted
		
        val entries = pool.entries
        for(entry : entries.values) {
            val value = entry.getTypedValue
            if (value instanceof Boolean) {
                if (value.booleanValue) {
                    if (entry.name.startsWith("_g") && !entry.name.contains("_e")) {
                        val lastChar = entry.name.charAt(entry.name.length-1)
                        if (lastChar >= '0' && lastChar <= '9') {
                            highlighting += "_g" + (Integer.parseInt(entry.name.substring(2)) - 1)
                        }
                    } else {
                        highlighting += entry.name
                    }
                }
            }
        }

		// -------------------------------------------------------------
		// Add MUX, REG, AND and OR gates to highlighting information --
		// -------------------------------------------------------------
		//stores all ports which are target of links with highlighted source gates
		targetPorts.clear
		for (entry : highlighting) {
			for (w : wires) {
				val sP = w.source as Port
				if (sP.name == entry) {
					val target = w.target as Port
					targetPorts.add(target.name)
				}
			}
		}
		
		//store actors because this list will be modified in addActors(..)
		val actorsCopy = actors.immutableCopy

    	addActors(highlighting, actors)

		actors.clear
		actors.addAll(actorsCopy) 

		//now store all information in the Collection lists
		// add a new entry, is there is no entry at index = tick
			
//		val tickInt = toIntExact(tick)
//			
//		if (highlightingCollection.size < tickInt) {
//			highlightingCollection.add(highlighting)
//			val HashMap<String,Boolean> mfc = new HashMap<String,Boolean>
//			mfc.putAll(muxFlapChange)
//			muxFlapChangeCollection.add(mfc)
//				
//			val HashMap<String,Boolean> rc = new HashMap<String,Boolean>
//			rc.putAll(regChange)
//			regChangeCollection.add(rc)
//		} 
//			
//		// maybe this case never occurs
//		// if the user went back several steps, and changed inputs, the entries at the index equal to the tick shall be replaced
//		else {
//			highlightingCollection.set(tickInt - 1, highlighting)
//			val HashMap<String,Boolean> mfc = new HashMap<String,Boolean>
//			mfc.putAll(muxFlapChange)
//			muxFlapChangeCollection.set(tickInt - 1, mfc)
//			
//			val HashMap<String,Boolean> rc = new HashMap<String,Boolean>
//			rc.putAll(regChange)
//			regChangeCollection.set(tickInt - 1, rc)
//		}

		// ---------------------------------------------------------------
		// Now highlight all entries of highlighting list          --
		// ---------------------------------------------------------------
		highlight(highlighting)
		
		tick = tick + 1
	}
	
	// adds highlighting information to the highlighting list depending on actor type
	protected def void addActors(Set<String> highlighting, List<Actor> actorsCopy) {
		val List<Actor> removeActors = new LinkedList<Actor>
		for (a : actorsCopy) {
			switch a.type {
				case "REG": addReg(a, highlighting, removeActors)
				case "AND": addAnd(a, highlighting, removeActors)
				case "OR": addOr(a, highlighting, removeActors)
				case "MUX": addMux(a, highlighting, removeActors)
				case "vcc": addConst1(a, highlighting, removeActors)
				case "gnd": removeActors += a
			}
		}
		
		//if some new highlighting information was added, 
		//restart this method and check if now there are more gates, which shpuld highlighted
		if (removeActors.length > 0) {
			for (entry : removeActors) {
				actorsCopy.remove(entry)
			}
			removeActors.clear
			addActors(highlighting, actorsCopy)
		}

	}
	
	//all all "vcc" gates to highlighting list
	def addConst1(Actor const1, Set<String> highlighting, List<Actor> removeActors) {
		highlighting += const1.name

		val allOutgoingWires = wires.filter[(source as Port).name == const1.name]
		for (entry : allOutgoingWires) {
			val target = entry.target as Port
			targetPorts.add(target.name)

		}
		removeActors.add(const1)
	}
	
	
	//add registers to highlighting list.. 
	//remember for the next tick for each register, if there was a 1 at the input port in the this tick
	protected def addReg(Actor reg, Set<String> highlighting, List<Actor> removeActors) {

		val lastTick = false //regChange.get(reg.name)
		val presentTick = highlighting.contains(reg.name) || targetPorts.contains(reg.ports.filter [
			(type == "In") && (name != "Tick")
		].head.name)
		
		//if this reg had a 1 in the last tick and has a 1 in the present tick: highlight it.
		if (lastTick && presentTick) {
			if (!highlighting.contains(reg.name)) {
				highlighting += reg.name
			}
			val allOutgoingWires = wires.filter[(source as Port).name == reg.name]
			for (entry : allOutgoingWires) {
				val target = entry.target as Port
				targetPorts.add(target.name)
			}
			removeActors.add(reg)
		} 
		//if the register had a 1 in the last tick, but a 0 in the present tick: highlight it
		else if (lastTick && !presentTick) {
			highlighting += reg.name
			regChange.replace(reg.name, false)
			val allOutgoingWires = wires.filter[(source as Port).name == reg.name]
			for (entry : allOutgoingWires) {
				val target = entry.target as Port
				targetPorts.add(target.name)
			}
			removeActors.add(reg)
		} 
		//if the register has neither a 1 in the present nor had a 1 in the last tick: don't highlight it
		else if (!lastTick && presentTick) {
			regChange.replace(reg.name, true)
			removeActors.add(reg)
		}
	}
	
	//checks for each mux, if the selection port has a 1. If so, the flap changes position
	// if the mux's input is a 1, the output will be a 1 if the flap is in the right position.
	protected def addMux(Actor mux, Set<String> highlighting, List<Actor> removeActors) {

		val selectionPort = mux.ports.filter[type == "Sel"].head
		val In1 = mux.ports.filter[type == "In_1"].head
		val In0 = mux.ports.filter[type == "In_0"].head
		
		// case selection port = 1 and input port1 = 1
		if (targetPorts.contains(selectionPort.name) && targetPorts.contains(In1.name)) {
			highlighting += mux.name

			val allOutgoingWires = wires.filter[(source as Port).name == mux.name]
			for (entry : allOutgoingWires) {
				val target = entry.target as Port
				targetPorts.add(target.name)
			}
			muxFlapChange.replace(mux.name, true)
			removeActors.add(mux)
		} 
		// case selection port = 0 and input port0 = 1
		else if (!targetPorts.contains(selectionPort.name) && targetPorts.contains(In0.name)) {
			highlighting += mux.name

			val allOutgoingWires = wires.filter[(source as Port).name == mux.name]
			for (entry : allOutgoingWires) {
				val target = entry.target as Port
				targetPorts.add(target.name)
			}
			muxFlapChange.replace(mux.name, false)
			removeActors.add(mux)
		} 
		// case selection port = 1 and input port1 = 0
		else if (targetPorts.contains(selectionPort.name)) {
			muxFlapChange.replace(mux.name, true)
		} 
		// case selection port = 0 and was 1 before 
//		else if (!targetPorts.contains(selectionPort.name) && muxFlapChange.get(mux.name)) {
//			muxFlapChange.replace(mux.name, false)
//
//		}

	}
	
	// adds "and gates" to highlighting
	protected def addAnd(Actor actor, Set<String> highlighting, List<Actor> removeActors) {
		val inputPorts = actor.ports.filter[type == "In"]

		var onePortFalse = true

		for (p : inputPorts) {
			if (!highlighting.contains(p.name) && !targetPorts.contains(p.name)) {
				onePortFalse = false
			}
		}

		if (onePortFalse) {
			highlighting += actor.name

			val allOutgoingWires = wires.filter[(source as Port).name == actor.name]
			for (entry : allOutgoingWires) {
				val target = entry.target as Port
				targetPorts.add(target.name)
			}
			removeActors.add(actor)
		}
	}
	
	// adds "or gates" to highlighting
	protected def addOr(Actor actor, Set<String> highlighting, List<Actor> removeActors) {
		val inputPorts = actor.ports.filter[type == "In"]

		var onePortTrue = false

		for (p : inputPorts) {
			if (highlighting.contains(p.name) || targetPorts.contains(p.name)) {
				onePortTrue = true
			}
		}

		if (onePortTrue) {
			highlighting += actor.name
			val allOutgoingWires = wires.filter[(source as Port).name == actor.name]
			for (entry : allOutgoingWires) {
				val target = entry.target as Port
				targetPorts.add(target.name)
			}
			removeActors.add(actor)
		}
	}


	// -----------------------------------------------------------------------
	// This method finally highlights the gates and links                   --
	// -----------------------------------------------------------------------
	protected def void highlight(Set<String> highlighting) {
	    val actorsToHighlight = <Actor> newLinkedList
    	for (actor : actors) {
			if (highlighting.contains(actor.name)) {
			    actorsToHighlight += actor
			}
		} 
		
        val actorHighlighting = getHighlighting(actorsToHighlight, HIGH_WIRE_ELEMENT_STYLE)
				
    	// highlight links: check for each link if source port is located at actor which shall be highlighted.
    	// if so: highlight the outgoing link and make it fat..
    	val linksToHigh = <Link> newLinkedList
    	val linksToLow = <Link> newLinkedList
    	for (wire : wires) {
    	    linksToLow += wire
    	    if (targetPorts.contains((wire.target as Port).name)) {
    	        linksToHigh += wire
    	    }
//    		if (highlighting.contains(wire.name)) {
//    		    linksToHigh += wire      
//    		} else {
//                linksToLow += wire    		    
//    		}
  		}
  		
        val highWireHighlighting = getHighlighting(linksToHigh, HIGH_WIRE_ELEMENT_STYLE)
        val lowWireHighlighting = getHighlighting(linksToLow, LOW_WIRE_ELEMENT_STYLE)  		
  		
  		highlightDiagram(actorHighlighting)
  		highlightDiagram(lowWireHighlighting)         
  		highlightDiagram(highWireHighlighting)
	}
}

