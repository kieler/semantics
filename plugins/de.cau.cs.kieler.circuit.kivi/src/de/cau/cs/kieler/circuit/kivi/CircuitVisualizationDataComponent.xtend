package de.cau.cs.kieler.circuit.kivi

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

class CircuitVisualizationDataComponent extends JSONObjectDataComponent {

	val Module configure = [ Binder binder |
		binder.bindScope(typeof(ViewSynthesisShared), Scopes.SINGLETON);
	]
	val injector = Guice.createInjector(configure)
	extension KRenderingExtensions = injector.getInstance(typeof(KRenderingExtensions))

	// port maps
	val HashMultimap<String, Port> muxSelPortMapping = HashMultimap.create // stores MUX name and its "Sel" port
	val HashMultimap<String, Port> orInPortMapping = HashMultimap.create
	val HashMultimap<String, Port> andInPortMapping = HashMultimap.create

	// actor maps
	val HashMultimap<String, KRendering> actorMapping = HashMultimap.create // stores every gate name and its highlightable parts
	val LinkedList<String> muxActors = new LinkedList<String> // stores all MUX names
	val HashMap<String, String> muxTrueLinkMapping = new HashMap<String, String> // stores name of source and target for "In_1" link of MUX
	val HashMap<String,Boolean> preRegister = new HashMap<String, Boolean> //e.g., for pre(O) store <pre(O), false>
	
	// link maps
	val HashMultimap<String, KRendering> linkMapping = HashMultimap.create // stores source port name and outgoing link

	override initialize() throws KiemInitializationException {

		muxSelPortMapping.clear
		orInPortMapping.clear
		andInPortMapping.clear
		actorMapping.clear
		muxActors.clear
		linkMapping.clear
		muxTrueLinkMapping.clear
		preRegister.clear

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
					}

					// ---------------------------------------------------------------------------
					// Before first tick in simulation all links shall be gray             --
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

					if (atomicActor && (node.name != null)) {
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

							// several gates are stored in additional maps: MUX, OR, AND
							if (node.type != null) {
								switch (node.type) {
									case "MUX": {
										muxSelPortMapping.put(node.name, node.ports.filter[type == "Sel"].head)
										val sourcePort = node.ports.filter[type == "In_1"].head.incomingLinks.head.
											source as Port
										if (!sourcePort.name.startsWith("const0")) {
											muxTrueLinkMapping.put(node.name, sourcePort.name)
										}
										muxActors.add(node.name)
									}
									case "OR": {
										orInPortMapping.putAll(node.name, node.ports.filter[type == "In"])
									}
									case "AND": {
										andInPortMapping.putAll(node.name, node.ports.filter[type == "In"])
									}
									case "REG": {
										if(node.name.startsWith("pre")){
										preRegister.put(node.name, false)
										}
									}
								}
							}
						}
					}
				}
			}
		]

		Display.getDefault().syncExec(run)

	}

	override isObserver() {
		true
	}

	override isProducer() {
		false
	}

	override isHistoryObserver() {
		true
	}

	override wrapup() throws KiemInitializationException {
		System.out.println("wrapup-------------------------------++++++++!!!!!!!!!!!!!")

		val Runnable run = [|

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
		// -----------------------------------------------------------
		// Use highlighting information from C Code            --
		// -----------------------------------------------------------
		val highlighting = <String>newHashSet // this map stores the nodes which shall be highlighted
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
		for (entry : highlighting) {
			System.out.println("----- " + entry)

		}
		// -----------------------------------------------
		// Add preRegisters, MUX, AND and OR gates               --
		// -----------------------------------------------
		addMuxToHighlight(highlighting)

		// lists need to be copied in each step because they will be modified in methods
		val HashMultimap<String, Port> orList = HashMultimap.create
		orList.putAll(orInPortMapping)
		val HashMultimap<String, Port> andList = HashMultimap.create
		andList.putAll(andInPortMapping)
		addAndOrGatesToHighlight(highlighting, orList, andList)

		for (entry : highlighting) {
			System.out.println(entry)

		}
		for (entry : muxTrueLinkMapping.entrySet) {
			System.out.println("mltm " + entry.key)

		}
		for (entry : muxActors) {
			System.out.println("mux " + entry)

		}
		for (entry : preRegister.entrySet) {
			System.out.println("pre register " + entry.key + " : " + entry.value.toString )

		}
		
		// ---------------------------------------------------------------
		// Now highlight all entries of highlighting list          --
		// ---------------------------------------------------------------
		highlight(highlighting)

		jSONObject
	}

	protected static val HIGHLIGHTING_MARKER = new Property<Boolean>("highlightingMarker", false);
	protected static val FLAP_MARKER = new Property<Boolean>("muxflapMarker", false);

	// -----------------------------------------------------------------------
	// This method finally highlights the gates and links                   --
	// -----------------------------------------------------------------------
	protected def void highlight(Set<String> highlighting) {
		val Runnable run = [|

			// highlight actors: check for each entry (actor) if its name is in highlighting list. If so, highlight it.
			for (entry : actorMapping.entries) {

				val highlightingMarker = entry.value.styles.findFirst[getProperty(HIGHLIGHTING_MARKER)]
				val muxflapMarker = entry.value.styles.findFirst[getProperty(FLAP_MARKER)]

				if (highlighting.contains(entry.key) || (preRegister.containsKey("pre(" + entry.key + ")") && preRegister.get("pre(" + entry.key + ")"))) {

					// non-MUX gate highlighting
					if (highlightingMarker == null) { // if there was no highlighting before, add one
						if (entry.key.startsWith("g")) {
							val KBackground style = KRenderingFactory.eINSTANCE.createKBackground()
							style.setProperty(HIGHLIGHTING_MARKER, true);
							style.setColor(Colors::LIGHT_SALMON)
							entry.value.styles.add(style)
						} else {
							val KBackground style = KRenderingFactory.eINSTANCE.createKBackground()
							style.setProperty(HIGHLIGHTING_MARKER, true);
							style.setColor(Colors::PEACH_PUFF)
							entry.value.styles.add(style)
						}
					}
					

					// MUX highlighting
					if (muxflapMarker == null) {
						if (muxActors.contains(entry.key) ) {
							if (entry.value.id == "highlightable_1") {
								val KForeground bstyle = KRenderingFactory.eINSTANCE.createKForeground()
								bstyle.setProperty(FLAP_MARKER, true)
								bstyle.setColor(Colors::BLACK)
								entry.value.styles.add(bstyle)
							}
							if (entry.value.id == "highlightable_0") {
								val KForeground wstyle = KRenderingFactory.eINSTANCE.createKForeground()
								wstyle.setColor(Colors::PEACH_PUFF) // make it white: check if muxActros.contains(entry.key) is else case above..
								wstyle.setProperty(FLAP_MARKER, true)
								entry.value.styles.add(wstyle)
							}
						}
					}
				} else { // if the gate's name is not listed in highlighting list, remove all highlighting.
					if (!highlighting.contains(entry.key)) {
						entry.value.styles.remove(highlightingMarker)
						entry.value.styles.remove(muxflapMarker)
					}
				}
			}

			// highlight links: check for each link if source port is located at actor which shall be highlighted.
			// if so: highlight the outgoing link and make it fat..
			for (entry : linkMapping.entries) {
				val highlightingMarker = entry.value.styles.findFirst[getProperty(HIGHLIGHTING_MARKER)]
				val value = entry.value

				if (highlighting.contains(entry.key) || (preRegister.containsKey("pre(" + entry.key + ")") && preRegister.get("pre(" + entry.key + ")"))) {
					if (highlightingMarker == null) {

						// highlighting of the MUX's incoming links.
						// if MUX shall be highlighted, because "Sel" port is true. The "In_1" Link is green
						// the link at the "Sel" port will be Light_Salmon (else case)
						if ((muxTrueLinkMapping.containsKey(entry.key) && muxActors.contains(entry.key)) ||(!muxTrueLinkMapping.containsKey(entry.key) && !muxActors.contains(entry.key))) {
//							System.out.println("Check")
//							val KForeground style = KRenderingFactory.eINSTANCE.createKForeground()
//							style.setProperty(HIGHLIGHTING_MARKER, true);
//							style.setColor(Colors::LIGHT_SEA_GREEN)
//							entry.value.styles.add(style)
//						} else {
//							if (!muxTrueLinkMapping.containsKey(entry.key) && !muxActors.contains(entry.key)) {
								if (value instanceof KRoundedBendsPolyline) {
									entry.value.lineWidth = 3
								}
								val KForeground style = KRenderingFactory.eINSTANCE.createKForeground()
								style.setProperty(HIGHLIGHTING_MARKER, true);
								style.setColor(Colors::LIGHT_SALMON)
								entry.value.styles.add(style)

//							}
						}
					} // if the link was already highlighted: the color shall change and get brighter
					// to prevent multiple identical highlighting styles, the old one is removed and a new one is added..
//					else if (highlightingMarker != null) {
//						entry.value.styles.remove(highlightingMarker)
//						val KForeground style = KRenderingFactory.eINSTANCE.createKForeground()
//						style.setProperty(HIGHLIGHTING_MARKER, true);
//						style.setColor(Colors::PEACH_PUFF)
//						entry.value.styles.add(style)
//					}
				} // if this link shall not be highlighted: remove highlighting
				else if (!highlighting.contains(entry.key) || (preRegister.containsKey("pre(" + entry.key + ")") && !preRegister.get("pre(" + entry.key + ")"))) {
					if (highlightingMarker != null) {
						entry.value.styles.remove(highlightingMarker)
//						if (value instanceof KRoundedBendsPolyline) {
//							entry.value.lineWidth = 3
//						}
//					} else {
						if (value instanceof KRoundedBendsPolyline) {
							entry.value.lineWidth = 1

						}
					}
				}
				
				if(highlighting.contains(entry.key) && preRegister.containsKey("pre(" + entry.key + ")")){
					System.out.println("----------------- " + entry.key)
					preRegister.replace("pre(" + entry.key + ")", true)
				} else if(preRegister.containsKey("pre(" + entry.key + ")")){
					System.out.println("---------++-------- " + entry.key)
					preRegister.replace("pre(" + entry.key + ")", false)
				}
			}
		]
		Display.getDefault().syncExec(run)
	}

	// -------------------------------------------------------------------------------------
	// This method adds AND and OR gates which are subsequently highlighted          --
	// -------------------------------------------------------------------------------------
	def void addAndOrGatesToHighlight(HashSet<String> highlighting, Multimap<String, Port> orList,
		Multimap<String, Port> andList) {
		// flag to check if something new happened 
		var boolean oneMore = false

		// add OR 
		val HashMultimap<String, Port> ors = HashMultimap.create
		ors.putAll(orList)

		val orEntries = ors.entries
		for (or : orEntries) {
			val key1 = or.key
			if (highlighting.contains(or.value.name)) {
				oneMore = true
				if (orList.containsKey(key1)) {
					orList.removeAll(key1)
				}
				highlighting += or.key
			}
		}

		// add AND
		val HashMultimap<String, Port> ands = HashMultimap.create
		ands.putAll(andList)

		// flag to check if all previous ports of this and gate were highlighted
		var allPorts = false

		// store name of "active" and gate
		var key = new String

		val andEntries = ands.entries
		val length = andEntries.length
		var cnt = 0
		for (and : andEntries) {

			if (key == "") { // only happens if this for section starts
				key = and.key

				// check if this port is highlighted and set flag for next port to remember what happened here
				if (highlighting.contains(and.value.name)) {
					allPorts = true
				} else {
					allPorts = false
				}
			} // if this is not the first entry of the list, check if its the same and gate as before
			// afterwards check if all former ports were marked for highlighting
			else if (key == and.key && allPorts) {

				// if this port is not meant to be highlighted, the containing and gate shall not be highlighted
				if (!highlighting.contains(and.value.name)) {
					allPorts = false
				}
			} // if this is not the first entry on the list, and this entry has another key, as the one before,
			// check, if all ports of the former gate got a "1". If so, add the former actor to highlighting list
			else if (key != and.key) {
				if (allPorts) {
					highlighting += key
					if (andList.containsKey(key)) {
						andList.removeAll(key)
						oneMore = true
					}
				}
				key = and.key
				if (!highlighting.contains(and.value.name)) {
					allPorts = false
				} else {
					allPorts = true
				}
			}
			cnt += 1
			if (allPorts && cnt == length) {
				highlighting += key
				if (andList.containsKey(key)) {
					andList.removeAll(key)
				}
			}
		}

		// this time something happened in here.. so check if this affects another gate
		if (oneMore) {
			oneMore = false
			addAndOrGatesToHighlight(highlighting, orList, andList)
		}
	}

	// -------------------------------------------------------------------------------------
	// This method adds MUX gates and the source port of the "true" link for this MUX     --
	// -------------------------------------------------------------------------------------
	def addMuxToHighlight(HashSet<String> highlighting) {
		for (m : muxSelPortMapping.entries) {
			if (highlighting.contains(m.value.name)) {
				if (muxTrueLinkMapping.containsKey(m.key)) {
					highlighting += muxTrueLinkMapping.get(m.key)
				}
				highlighting += m.key
			} // This step is important because otherwise mux with "false" "Sel" port entry are highlihgted.
			// Only those MUXs with "true" "Sel" entry shall be highlighted. Every other MUXs are removed from list.
//			else if (highlighting.contains(m.key)) {
//				highlighting.remove(m.key)
//			}

			if (highlighting.contains(m.key) && highlighting.contains("!" + m.key)) {
				highlighting.remove("!"+m.key)
				System.out.println("removed " + "!"+m.key)
			}
		}
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

