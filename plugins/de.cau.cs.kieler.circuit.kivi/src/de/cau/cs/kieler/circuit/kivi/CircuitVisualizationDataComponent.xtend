package de.cau.cs.kieler.circuit.kivi

import static java.lang.Math.toIntExact;
import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
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
import de.cau.cs.kieler.scg.synchronizer.DepthJoinSynchronizer
import de.cau.cs.kieler.scg.transformations.BasicBlockTransformation
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

class CircuitVisualizationDataComponent extends JSONObjectDataComponent implements IKiemEventListener {

	val Module configure = [ Binder binder |
		binder.bindScope(typeof(ViewSynthesisShared), Scopes.SINGLETON);
	]
	val injector = Guice.createInjector(configure)
	extension KRenderingExtensions = injector.getInstance(typeof(KRenderingExtensions))

	// highlighting info
	val HashMultimap<String, KRendering> actorMapping = HashMultimap.create // stores every gate name and its highlightable parts
	val HashMultimap<String, KRendering> linkMapping = HashMultimap.create // stores source port name and outgoing link
	// Object maps
	val LinkedList<Link> wires = new LinkedList<Link> // stores all links
	val LinkedList<Actor> actors = new LinkedList<Actor> // stores all actors
	val LinkedList<String> targetPorts = new LinkedList<String> // stores target port for each link with 1
	val HashMap<String, Boolean> muxFlapChange = new HashMap<String, Boolean> // stores if a mux shall change position of flap
	val HashMap<String, Boolean> regChange = new HashMap<String, Boolean> // stores if a reg shall be highlighted
	val LinkedList<HashMap<String, Boolean>> muxFlapChangeSummary = new LinkedList<HashMap<String, Boolean>>
	val LinkedList<HashMap<String, Boolean>> regChangeSummary = new LinkedList<HashMap<String, Boolean>>
	val LinkedList<HashSet<String>> highlightingSummary = new LinkedList<HashSet<String>>
	// /////////////////////////
	private static long tick = 0
	private static long oldTick = 0
	private static boolean newTick = true

	override getDataComponentId() {
		return "CircuitVisualizationDataComponent";
	}

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
		highlightingSummary.clear
		muxFlapChangeSummary.clear
		regChangeSummary.clear

		val diagramEditor = getActiveEditor();
		if (diagramEditor == null) {
			return;
		}

		val viewParts = DiagramView.getDiagramViews(diagramEditor)
		if (viewParts.empty) {
			throw new KiemInitializationException("Model visualization not shown, cannot visualize simulation.", true,
				null);
		}

		val contextsCirc = viewParts.map[viewer.viewContext].filter[inputModel instanceof Actor]

		val Runnable run = [|
			for (context : contextsCirc) {
				System.out.println("-- Initialize circuit simulation... --")
				val circuit = context.inputModel as Actor

				// ---------------------------------------------------------------------------
				// Store all KEdges and their source port names               --
				// ---------------------------------------------------------------------------
				circuit.eAllContents.filter(Link).forEach [ link |
					val l = context.getTargetElement(link, KEdge)
					if (l != null) {
						val rend = l.getData.filter(KRendering).head
						val sourcePort = link.source as Port
						linkMapping.put(sourcePort.name, rend)
						wires.add(link)
					}

					// ---------------------------------------------------------------------------
					// Before first tick all links shall be gray             --
					// ---------------------------------------------------------------------------
					if (l != null) {
						val KForeground style = KRenderingFactory.eINSTANCE.createKForeground()
						style.setColor(Colors::GRAY_55)
						l.KRendering.styles.add(style)
					}
				]

				// ------------------------------------------------------------------------
				// Store all KRendering information for gate highlighting           --
				// ------------------------------------------------------------------------
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

	override isProducer() {
		true
	}

	override isHistoryObserver() {
		true
	}

	override wrapup() throws KiemInitializationException {
		System.out.println("wrapup----------------------------------------")

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
				} // ////check for Input Signals which are true for this tick.....or Output if you remove has"value
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

			// -----------------------------------------------
			// Add preRegisters, MUX, AND and OR gates               --
			// -----------------------------------------------
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

			val actorsCopy = actors.immutableCopy

			addActors(highlighting, actors)

			actors.clear
			actors.addAll(actorsCopy)

			val tickInt = toIntExact(tick)
			
			if (highlightingSummary.size < tickInt) {
				highlightingSummary.add(highlighting)
				val HashMap<String,Boolean> mfc = new HashMap<String,Boolean>
				mfc.putAll(muxFlapChange)
				muxFlapChangeSummary.add(mfc)
				
				val HashMap<String,Boolean> rc = new HashMap<String,Boolean>
				rc.putAll(regChange)
				regChangeSummary.add(rc)
				for (entry : muxFlapChangeSummary) {
					System.out.println("mfxs: " + entry)
				}
			} else {
				highlightingSummary.set(tickInt - 1, highlighting)
				val HashMap<String,Boolean> mfc = new HashMap<String,Boolean>
				mfc.putAll(muxFlapChange)
				muxFlapChangeSummary.set(tickInt - 1, mfc)
				
				val HashMap<String,Boolean> rc = new HashMap<String,Boolean>
				rc.putAll(regChange)
				regChangeSummary.set(tickInt - 1, rc)
			}

		} 
		
		// ---------------------------------------------------------------
		// Now highlight all entries of highlighting list          --
		// ---------------------------------------------------------------
		else if (!newTick) {
			for (entry : muxFlapChangeSummary) {
					System.out.println("muxflapchange11: " + entry)
			}
			System.out.println("this is an old tick..")
			highlighting.clear
			val tickInt = toIntExact(tick)
			highlighting.addAll(highlightingSummary.get(tickInt - 1))
			muxFlapChange.clear
			for (entry : muxFlapChangeSummary) {
					System.out.println("muxflapchange22: " + entry)
			}
			muxFlapChange.putAll(muxFlapChangeSummary.get(tickInt - 1))
			regChange.clear
			regChange.putAll(regChangeSummary.get(tickInt - 1))
			for (entry : muxFlapChangeSummary) {
					System.out.println("muxflapchange: " + entry)
			}

		}
		for (entry : muxFlapChange.entrySet) {
			System.out.println("mfx    : " + entry)
		}
		highlight(highlighting)

		jSONObject
	}

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

		if (removeActors.length > 0) {
			for (entry : removeActors) {
				actorsCopy.remove(entry)
			}
			removeActors.clear
			addActors(highlighting, actorsCopy)
		}

	}

	def addConst1(Actor const1, Set<String> highlighting, List<Actor> removeActors) {
		highlighting += const1.name

		val allOutgoingWires = wires.filter[(source as Port).name == const1.name]
		for (entry : allOutgoingWires) {
			val target = entry.target as Port
			targetPorts.add(target.name)

		}
		removeActors.add(const1)
	}

	protected def addReg(Actor reg, Set<String> highlighting, List<Actor> removeActors) {

		val lastTick = regChange.get(reg.name)
		val presentTick = highlighting.contains(reg.name) || targetPorts.contains(reg.ports.filter [
			(type == "In") && (name != "Tick")
		].head.name)
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
		} else if (lastTick && !presentTick) {
			highlighting += reg.name
			regChange.replace(reg.name, false)
			val allOutgoingWires = wires.filter[(source as Port).name == reg.name]
			for (entry : allOutgoingWires) {
				val target = entry.target as Port
				targetPorts.add(target.name)
			}
			removeActors.add(reg)
		} else if (!lastTick && presentTick) {
			regChange.replace(reg.name, true)
			removeActors.add(reg)
		}
	}

	protected def addMux(Actor mux, Set<String> highlighting, List<Actor> removeActors) {

		val selectionPort = mux.ports.filter[type == "Sel"].head
		val In1 = mux.ports.filter[type == "In_1"].head
		val In0 = mux.ports.filter[type == "In_0"].head

		if (targetPorts.contains(selectionPort.name) && targetPorts.contains(In1.name)) {
			highlighting += mux.name

			val allOutgoingWires = wires.filter[(source as Port).name == mux.name]
			for (entry : allOutgoingWires) {
				val target = entry.target as Port
				targetPorts.add(target.name)
			}
			muxFlapChange.replace(mux.name, true)
			removeActors.add(mux)
		} else if (!targetPorts.contains(selectionPort.name) && targetPorts.contains(In0.name)) {
			highlighting += mux.name

			val allOutgoingWires = wires.filter[(source as Port).name == mux.name]
			for (entry : allOutgoingWires) {
				val target = entry.target as Port
				targetPorts.add(target.name)
			}
			muxFlapChange.replace(mux.name, false)
			removeActors.add(mux)
		} else if (targetPorts.contains(selectionPort.name)) {
			muxFlapChange.replace(mux.name, true)
		} else if (!targetPorts.contains(selectionPort.name) && muxFlapChange.get(mux.name)) {
			muxFlapChange.replace(mux.name, false)

		}

	}

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
		System.out.println("highlighting -------------------------------------")
		val Runnable run = [|

			// highlight actors: check for each entry (actor) if its name is in highlighting list. If so, highlight it.
			for (entry : actorMapping.entries) {

				val highlightingMarker = entry.value.styles.findFirst[getProperty(HIGHLIGHTING_MARKER)]

				if (highlighting.contains(entry.key)) {

					// non-MUX gate highlighting
					if (highlightingMarker == null) {

						val KBackground style = KRenderingFactory.eINSTANCE.createKBackground()
						style.setProperty(HIGHLIGHTING_MARKER, true);
						style.setColor(Colors::LIGHT_SALMON)
						entry.value.styles.add(style)

					}
				} else { // if the gate's name is not listed in highlighting list, remove all highlighting.
					if (!highlighting.contains(entry.key)) {
						entry.value.styles.remove(highlightingMarker)
					}
				}

				val muxflapMarker = entry.value.styles.findFirst[getProperty(FLAP_MARKER)]

				for (mux : muxFlapChange.entrySet) {
					if (mux.key == entry.key) {
						if (mux.value) {
							if (muxflapMarker == null) {
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
						} else if (!mux.value) {
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
				} // if this link shall not be highlighted: remove highlighting
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

