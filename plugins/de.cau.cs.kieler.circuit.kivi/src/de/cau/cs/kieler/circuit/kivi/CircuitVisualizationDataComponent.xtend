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
package de.cau.cs.kieler.circuit.kivi

import static java.lang.Math.toIntExact;
import com.google.common.collect.HashMultimap
import com.google.inject.Binder
import com.google.inject.Guice
import com.google.inject.Module
import com.google.inject.Scopes
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.Link
import de.cau.cs.kieler.circuit.Port
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.Colors
import de.cau.cs.kieler.core.krendering.KBackground
import de.cau.cs.kieler.core.krendering.KContainerRendering
import de.cau.cs.kieler.core.krendering.KForeground
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.KRoundedBendsPolyline
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.core.util.Maybe
import de.cau.cs.kieler.klighd.ui.view.DiagramView
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent
import de.cau.cs.kieler.sim.kiem.KiemExecutionException
import de.cau.cs.kieler.sim.kiem.KiemInitializationException
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedList
import java.util.Set
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IWorkbenchPage
import org.eclipse.ui.IWorkbenchWindow
import org.eclipse.ui.PlatformUI
import org.json.JSONObject
import java.util.List
import de.cau.cs.kieler.sim.kiem.IKiemEventListener
import de.cau.cs.kieler.sim.kiem.KiemEvent
import de.cau.cs.kieler.scg.transformations.basicblocks.BasicBlockTransformation
import de.cau.cs.kieler.scg.transformations.synchronizer.DepthJoinSynchronizer

/**
 * @author fry 
 * 
 * DataComponent which highlights circuit components during simulation.
 *
 */
 
class CircuitVisualizationDataComponent extends JSONObjectDataComponent implements IKiemEventListener {

	val Module configure = [ Binder binder |
		binder.bindScope(typeof(ViewSynthesisShared), Scopes.SINGLETON);
	]
	val injector = Guice.createInjector(configure)
	extension KRenderingExtensions = injector.getInstance(typeof(KRenderingExtensions))
	
	
	
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

	private static long tick = 0 //stores active tick
	private static long oldTick = 0 // stores tick before active tick
	private static boolean newTick = true // is true if this tick is a new tick (no back step)

	override getDataComponentId() {
		return "CircuitVisualizationDataComponent";
	}
	
	
	
	// ----------------------------------------------------------------------
	// in this method several maps are cleared and filled with information --
	// ----------------------------------------------------------------------
	override initialize() throws KiemInitializationException {

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
		
		
		
		val diagramEditor = getActiveEditor();
		if (diagramEditor == null) {
			return;
		}

		val viewParts = DiagramView.getDiagramViews(diagramEditor)
		if (viewParts.empty) {
			throw new KiemInitializationException("Model visualization not shown, cannot visualize simulation.", true,
				null);
		}
		
		// grab the circuit view from all active views 
		val contextsCirc = viewParts.map[viewer.viewContext].filter[inputModel instanceof Actor]

		val Runnable run = [|
			for (context : contextsCirc) {
				System.out.println("-- Initialize circuit simulation... --")
				val circuit = context.inputModel as Actor

				// -------------------------------------------------------------
				// Store all KEdges and their source port names               --
				// and store all links                                        --
				// -------------------------------------------------------------
				circuit.eAllContents.filter(Link).forEach [ link |
					val l = context.getTargetElement(link, KEdge)
					if (l != null) {
						val rend = l.getData.filter(KRendering).head
						val sourcePort = link.source as Port
						linkMapping.put(sourcePort.name, rend)
						wires.add(link)
					}

					// ----------------------------------------------------------
					// Before first tick all links shall be gray.              --
					// ----------------------------------------------------------
					if (l != null) {
						val KForeground style = KRenderingFactory.eINSTANCE.createKForeground()
						style.setColor(Colors::GRAY_55)
						l.KRendering.styles.add(style)
					}
				]

				// -------------------------------------------------------------------
				// Store all KRendering information for gate highlighting           --
				// -------------------------------------------------------------------
				for (node : circuit.eAllContents.filter(Actor).toList) {
					val atomicActor = node.innerActors.empty

					if (atomicActor && (node.name != null) && (node.type != null)) {

						// get kRendering information for each actor
						val frame = context.getTargetElement(node, KNode)
						if (frame != null) {
							val KContainerRendering kgelem = frame.getData(KContainerRendering)
							val shape = frame.getData.filter(KRendering)
							
							// every highlightable part of the gate needs to have a "highlightable" id in its specific draw() method
							val children = kgelem.children.filter [
								id == "highlightable" || id == "highlightable_0" || id == "highlightable_1"
							]
							actorMapping.putAll(node.name, children)
							actorMapping.putAll(node.name, shape)
							actors.add(node)
							
							//store each register and each mux in maps for flap and register highlighting
							if (node.type != null) {
								if (node.type == "MUX") {
									muxFlapChange.put(node.name, false)
								} else if (node.type == "REG") {
									regChange.put(node.name, false)
								}
							}
						}
					}
				}
			}
		]

		Display.getDefault().syncExec(run)

	}
	
	// -------------------------------------------------------------
	// get tick information and remember them for step(..) method --
	// -------------------------------------------------------------
	override provideEventOfInterest() {
		val events = {
			KiemEvent.STEP_INFO
		}
		val KiemEvent event = new KiemEvent(events)
		return event
	}

	override notifyEvent(KiemEvent event) {
		if (event.isEvent(KiemEvent.STEP_INFO) && event.getInfo() instanceof de.cau.cs.kieler.core.util.Pair) {
			val bla = event.getInfo() as de.cau.cs.kieler.core.util.Pair<Long, Long>
			oldTick = tick
			tick = bla.getFirst().longValue()
			if (oldTick < tick) {
				newTick = true
			} else if (oldTick > tick) {
				newTick = false

			}
		}
	}

	override isObserver() {
		true
	}
	
	// has to be true because each tick(step) needs to be executed for back steps
	override isProducer() {
		true
	}

	override isHistoryObserver() {
		true
	}

	override wrapup() throws KiemInitializationException {
		System.out.println("wrapup----------------------------------------")
		//remove all highlighting
		val Runnable run = [|
			
			for(entry : muxFlapChange.entrySet){
				entry.value = false
			}
			for(entry : regChange.entrySet){
				entry.value = false
			}

			highlight(<String>newHashSet)
			for (entry : linkMapping.entries) {
				if (entry.value != null) {
					val KForeground style = KRenderingFactory.eINSTANCE.createKForeground()
					style.setColor(Colors::BLACK)
					entry.value.styles.add(style)
					if (entry.value instanceof KRoundedBendsPolyline) {
						entry.value.lineWidth = 1

					}

				}

			}
		]
		Display.getDefault().syncExec(run)

	}

	// -------------------------------------------------------------------------------------------------
	// In each step: list the gates which shall be highlighted                     --
	// -------------------------------------------------------------------------------------------------
	override step(JSONObject jSONObject) throws KiemExecutionException {
		System.out.println("step ---------------------------------------- " + tick)
		// -----------------------------------------------------------
		// Use highlighting information from C Code            --
		// -----------------------------------------------------------
		var highlighting = <String>newHashSet // this map stores the nodes which shall be highlighted
		
		//only if this tick is a new tick, new highlighting information need to be computed
		//otherwise, old information is copied from "...Collection" lists.
		if (newTick) {
			System.out.println("this is a new tick..")
			for (key : jSONObject.keys.toIterable) {

				// check for active guards in this tick
				if ((key as String).startsWith(BasicBlockTransformation::GUARDPREFIX)) {
					val object = jSONObject.get(key)
					if (object instanceof JSONObject && (object as JSONObject).has("value")) {
						val value = (object as JSONObject).get("value")

						if ((value as Integer) != 0) {
							if (key.endsWith(DepthJoinSynchronizer::SCHIZOPHRENIC_SUFFIX)) {
								val myKey = key.substring(0, key.length - 2)
								highlighting += myKey
							} else {
								highlighting += key
							}
						}
					}
				} // check for Input Signals which are true for this tick.....or Output if you remove has"value
				else {
					val object = jSONObject.get(key)
					if (object instanceof JSONObject && (object as JSONObject).has("present")) { // &&!(object as JSONObject).has("value")) {
						val value = (object as JSONObject).get("present")
						if ((value as Boolean)) {
							highlighting += key
						} else {
							// e.g.: !A is true
							highlighting += "!" + key
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
			
			val tickInt = toIntExact(tick)
			
			if (highlightingCollection.size < tickInt) {
				highlightingCollection.add(highlighting)
				val HashMap<String,Boolean> mfc = new HashMap<String,Boolean>
				mfc.putAll(muxFlapChange)
				muxFlapChangeCollection.add(mfc)
				
				val HashMap<String,Boolean> rc = new HashMap<String,Boolean>
				rc.putAll(regChange)
				regChangeCollection.add(rc)
			} 
			
			// maybe this case never occurs
			// if the user went back several steps, and changed inputs, the entries at the index equal to the tick shall be replaced
			else {
				highlightingCollection.set(tickInt - 1, highlighting)
				val HashMap<String,Boolean> mfc = new HashMap<String,Boolean>
				mfc.putAll(muxFlapChange)
				muxFlapChangeCollection.set(tickInt - 1, mfc)
				
				val HashMap<String,Boolean> rc = new HashMap<String,Boolean>
				rc.putAll(regChange)
				regChangeCollection.set(tickInt - 1, rc)
			}

		} 
		
		// if this is not a new tick, use the values stored in the "...Collection" lists
		else if (!newTick) {
			for (entry : muxFlapChangeCollection) {
					System.out.println("muxflapchange11: " + entry)
			}
			System.out.println("this is an old tick..")
			highlighting.clear
			val tickInt = toIntExact(tick)
			highlighting.addAll(highlightingCollection.get(tickInt - 1))
			muxFlapChange.clear
			muxFlapChange.putAll(muxFlapChangeCollection.get(tickInt - 1))
			regChange.clear
			regChange.putAll(regChangeCollection.get(tickInt - 1))
			
		}
		
		// ---------------------------------------------------------------
		// Now highlight all entries of highlighting list          --
		// ---------------------------------------------------------------
		highlight(highlighting)

		jSONObject
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

		val lastTick = regChange.get(reg.name)
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
		else if (!targetPorts.contains(selectionPort.name) && muxFlapChange.get(mux.name)) {
			muxFlapChange.replace(mux.name, false)

		}

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




	protected static val HIGHLIGHTING_MARKER = new Property<Boolean>("highlightingMarker", false);
	protected static val FLAP_MARKER = new Property<Boolean>("muxflapMarker", false);

	// -----------------------------------------------------------------------
	// This method finally highlights the gates and links                   --
	// -----------------------------------------------------------------------
	protected def void highlight(Set<String> highlighting) {
		System.out.println("highlighting for step -------------------------------------" + tick)
		val Runnable run = [|

			// highlight actors: check for each entry (actor) if its name is in highlighting list. If so, highlight it.
			for (entry : actorMapping.entries) {

				val highlightingMarker = entry.value.styles.findFirst[getProperty(HIGHLIGHTING_MARKER)]

				if (highlighting.contains(entry.key)) {

					if (highlightingMarker == null) {

						val KBackground style = KRenderingFactory.eINSTANCE.createKBackground()
						style.setProperty(HIGHLIGHTING_MARKER, true);
						style.setColor(Colors::LIGHT_SALMON)
						entry.value.styles.add(style)

					}
				} 
				// if the gate's name is not listed in highlighting list, remove all highlighting.
				else { 
					if (!highlighting.contains(entry.key)) {
						entry.value.styles.remove(highlightingMarker)
					}
				}
				
				//highlighting for the mux flaps
				val muxflapMarker = entry.value.styles.findFirst[getProperty(FLAP_MARKER)]

				for (mux : muxFlapChange.entrySet) {
					if (mux.key == entry.key) {
						if (mux.value) {
							if (muxflapMarker == null) {
								
								//each mux has two flaps. which one is white and which one is black is decided by the muxFlapChange list
								if (entry.value.id == "highlightable_1") {
									val KForeground bstyle = KRenderingFactory.eINSTANCE.createKForeground()
									bstyle.setProperty(FLAP_MARKER, true)
									bstyle.setColor(Colors::BLACK)
									entry.value.styles.add(bstyle)
								}
								if (entry.value.id == "highlightable_0") {
									val KForeground wstyle = KRenderingFactory.eINSTANCE.createKForeground()
									wstyle.setColor(Colors::WHITE) // make it white: check if muxActros.contains(entry.key) is else case above..
									wstyle.setProperty(FLAP_MARKER, true)
									entry.value.styles.add(wstyle)
								}
							}
						} 
						// if the mux's flap shall not point to it's input1, remove the highlighting.
						//this will color the flap pointing to the input0 black and the flap for input 1 white.
						else if (!mux.value) {
							if (muxflapMarker != null)
								entry.value.styles.remove(muxflapMarker)
						}
					}
				}

			}

			// highlight links: check for each link if source port is located at actor which shall be highlighted.
			// if so: highlight the outgoing link and make it fat..
			for (entry : linkMapping.entries) {
				val highlightingMarker = entry.value.styles.findFirst[getProperty(HIGHLIGHTING_MARKER)]
				val value = entry.value

				if (highlighting.contains(entry.key)) {
					if (highlightingMarker == null) {
						if (value instanceof KRoundedBendsPolyline) {
							entry.value.lineWidth = 3
						}
						val KForeground style = KRenderingFactory.eINSTANCE.createKForeground()
						style.setProperty(HIGHLIGHTING_MARKER, true);
						style.setColor(Colors::LIGHT_SALMON)
						entry.value.styles.add(style)
					}
				} 
				// if this link shall not be highlighted: remove highlighting
				else if (!highlighting.contains(entry.key)) {
					if (highlightingMarker != null) {
						entry.value.styles.remove(highlightingMarker)
						if (value instanceof KRoundedBendsPolyline) {
							entry.value.lineWidth = 1

						}
					}
				}
			}
		]
		Display.getDefault().syncExec(run)
	}

	protected def IEditorPart getActiveEditor() {
		val Maybe<IEditorPart> maybe = new Maybe<IEditorPart>();
		val Runnable run = [|
			val IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			val IWorkbenchPage activePage = window.getActivePage();
			val IEditorPart editor = activePage.getActiveEditor();
			maybe.set(editor);
		]
		Display.getDefault().syncExec(run)
		return maybe.get();
	}
}

