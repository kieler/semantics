package de.cau.cs.kieler.circuit.kivi

import com.google.common.collect.HashMultimap
import com.google.inject.Binder
import com.google.inject.Guice
import com.google.inject.Module
import de.cau.cs.kieler.core.kgraph.KGraphFactory
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.Colors
import de.cau.cs.kieler.core.krendering.KBackground
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.KContainerRendering

import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.core.util.Maybe
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.guardCreation.AbstractGuardCreator
import de.cau.cs.kieler.scg.sequentializer.AbstractSequentializer
import de.cau.cs.kieler.scg.transformations.BasicBlockTransformation
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent
import de.cau.cs.kieler.sim.kiem.KiemExecutionException
import de.cau.cs.kieler.sim.kiem.KiemInitializationException
import java.util.Set
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IWorkbenchPage
import org.eclipse.ui.IWorkbenchWindow
import org.eclipse.ui.PlatformUI
import org.json.JSONObject
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import com.google.inject.Scopes
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.krendering.KRectangle
import de.cau.cs.kieler.core.krendering.KText
import de.cau.cs.kieler.core.krendering.KRoundedRectangle
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.guardCreation.GuardCreator
import de.cau.cs.kieler.scg.synchronizer.DepthJoinSynchronizer
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.klighd.ui.view.DiagramView
import de.cau.cs.kieler.circuit.Actor
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.sim.kivi.KiViDataComponent
import de.cau.cs.kieler.core.krendering.KStyle
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.krendering.KContainerRendering
import org.eclipse.emf.ecore.util.EcoreUtil
import de.cau.cs.kieler.core.krendering.KForeground
import de.cau.cs.kieler.circuit.Link
import de.cau.cs.kieler.circuit.Port
import java.util.HashSet

class CircuitVisualizationDataComponent extends JSONObjectDataComponent {

	val Module configure = [ Binder binder |
		binder.bindScope(typeof(ViewSynthesisShared), Scopes.SINGLETON);
	]
	val injector = Guice.createInjector(configure)

	extension AnnotationsExtensions = injector.getInstance(typeof(AnnotationsExtensions))
	extension SCGDeclarationExtensions = injector.getInstance(typeof(SCGDeclarationExtensions))
	extension KRenderingExtensions = injector.getInstance(typeof(KRenderingExtensions))
	extension KNodeExtensions = injector.getInstance(typeof(KNodeExtensions))
	extension KEdgeExtensions = injector.getInstance(typeof(KEdgeExtensions))
	extension KPortExtensions = injector.getInstance(typeof(KPortExtensions))
	extension KContainerRenderingExtensions = injector.getInstance(typeof(KContainerRenderingExtensions))

	val HashMultimap<String, Port> muxSelPortMapping = HashMultimap.create
	val HashMultimap<String, Port> orInPortMapping = HashMultimap.create
	val HashMultimap<String, Port> andInPortMapping = HashMultimap.create
	val HashMultimap<String, KRendering> actorMapping = HashMultimap.create
	val HashMultimap<String, KRendering> guardActorMapping = HashMultimap.create
	val HashMultimap<String, KRendering> linkMapping = HashMultimap.create
	val HashMultimap<String, KRendering> nonGuardActorMapping = HashMultimap.create

	override initialize() throws KiemInitializationException {

		val diagramEditor = getActiveEditor();
		if (diagramEditor == null) {
			return;
		}

		val viewParts = DiagramView.getDiagramViews(diagramEditor)
		if (viewParts.empty) {
			throw new KiemInitializationException("Model visualization not shown, cannot visualize simulation.", true,
				null);
		}

		muxSelPortMapping.clear
		orInPortMapping.clear
		andInPortMapping.clear
		actorMapping.clear
		guardActorMapping.clear
		linkMapping.clear
		nonGuardActorMapping.clear

		val contextsCirc = viewParts.map[viewer.viewContext].filter[inputModel instanceof Actor]

		val Runnable run = [|
			for (context : contextsCirc) {
				System.out.println("circuit-------------------------------++++++++!!!!!!!!!!!!!")
				System.out.println(context.getNode().toString)
				val circuit = context.inputModel as Actor
				val logic = circuit.eAllContents.filter(Actor).filter[name == "Program Logic"].head

				// store all links of the circuit
				for (link : circuit.eAllContents.filter(Link).toList) {
					val l = context.getTargetElement(link, KEdge)
					val rend = l.getData.filter(KRendering).head
					val sourcePort = link.source
					if (sourcePort instanceof Port) {
						linkMapping.put(sourcePort.name, rend)
					}

				}

				// store all actors of circuits logic
				for (node : logic.eAllContents.filter(Actor).toList) {
					val atomicActor = !(node.innerActors.toList.length > 0)
					if (atomicActor && (node.name != null)) {

						// get kRendering information for each actor
						val frame = context.getTargetElement(node, KNode)
						val KContainerRendering kgelem = frame.getData(KContainerRendering)
						val shape = frame.getData.filter(KRendering)
						val children = kgelem.children
						actorMapping.putAll(node.name, children)
						actorMapping.putAll(node.name, shape)

						// store guradActors
						if (node.name.startsWith("g")) {
							guardActorMapping.putAll(node.name, children)
							guardActorMapping.putAll(node.name, shape)
						} // store MUX actors
						else if (node.type != null){
							switch(node.type){
								case "MUX" : muxSelPortMapping.putAll(node.name, node.ports.filter[type == "Sel"])
								case "OR"  : orInPortMapping.putAll(node.name, node.ports.filter[type == "In"])
								case "AND" : andInPortMapping.putAll(node.name, node.ports.filter[type == "In"])
							}
						} // store the other actors
						else {
							guardActorMapping.putAll(node.name, children)
							guardActorMapping.putAll(node.name, shape)
						}

					}

				}

			}

//			for (e : guardActorMapping.entries) {
//				System.out.println("entry: " + e.key + " with value " + e.value)
//			}
//
//			for (l : linkMapping.entries) {
//				System.out.println("ENTRY: " + l.key + " with value " + l.value)
//			}
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

		]
		Display.getDefault().syncExec(run)

	}

	/**
	 * Filter all informations to name those KGraph elements which shall be highlighted 
	 */
	override step(JSONObject jSONObject) throws KiemExecutionException {
		System.out.println("step-------------------------------++++++++!!!!!!!!!!!!!")
		val highlighting = <String>newHashSet
		for (key : jSONObject.keys.toIterable) {

			// //check for active guards in this tick
			System.out.println("JSONObject ist: " + key.toString + " with value: " + jSONObject.get(key).toString)
			if ((key as String).startsWith(BasicBlockTransformation::GUARDPREFIX)) {
				val object = jSONObject.get(key)
				if (object instanceof JSONObject && (object as JSONObject).has("value")) {
					val value = (object as JSONObject).get("value")
					System.out.println("value value is " + value.toString)
					if ((value as Integer) != 0) {
						if (key.endsWith(DepthJoinSynchronizer::SCHIZOPHRENIC_SUFFIX)) {

							val myKey = key.substring(0, key.length - 2)
							highlighting += myKey
						} else {
							highlighting += key
						}
					}
				}
			} // ////check for Input or Output Signals which are true for this tick
			else {
				val object = jSONObject.get(key)
				if (object instanceof JSONObject && (object as JSONObject).has("present")) { //!(object as JSONObject).has("value")
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
		
		addMuxToHighlight(highlighting)
		
		addAndOrGatesToHighlight(highlighting)
		
		for (h : highlighting) {
			System.out.println(h + " shall be highlighted")
		}

		highlight(highlighting)

		jSONObject
	}
	
	def addAndOrGatesToHighlight(HashSet<String> highlighting) {
		
		//flag to check if something new happened 
		var boolean oneMore = false
		
		//add OR 
		for(or : orInPortMapping.entries){
			if(highlighting.contains(or.value.name)){
				oneMore = true
				highlighting += or.key
			}
		}
		
		//add AND
		
		//flag to check if all previous ports of this and gate were highlighted
		var allPorts = false
		
		//store name of "active" and gate
		var key = new String
		val length = andInPortMapping.entries.length
		System.out.println(length)
		var cnt = 1
		for(and : andInPortMapping.entries){
			if(key == ""){ //only happens if this for section starts
				key = and.key
				
				//check if this port is highlighted
				if(highlighting.contains(and.value.name)){
					allPorts = true 
				} else{
					allPorts = false
				}
			}
			// if this is not the first entry of the list, check if its the same and gate as before
			// afterwards check if all former ports were marked for highlighting
			else if (key == and.key && allPorts){
				//if this port is not ment to be highlighted, the containing and gate shall not be highlighted
				if(!highlighting.contains(and.value.name)){
					allPorts = false
				}
			}
			
			//if this is not the first entry on the list, and this entry has another key, as the one before,
			//check, if all ports of the former gate got a "1" . If so, add the former actor to highlighting list
			else if(key != and.key){
				if(allPorts){
					highlighting += key
					oneMore = true
				} 
				key = and.key
				if(!highlighting.contains(and.value.name)){
					allPorts = false
				}
			}
			
			if(cnt == length && allPorts){
				highlighting += key
			}
			cnt += 1 
		}
		
		//this time something happened in here.. maybe we should check if this affects another gate
		if(oneMore){
			oneMore = false
			addAndOrGatesToHighlight(highlighting)
		}
	}
	
	def addMuxToHighlight(HashSet<String> highlighting) {
	
		for(m : muxSelPortMapping.entries){
			if(highlighting.contains(m.value.name)){
				highlighting += m.key
			}
		}
		
		
	}



	protected static val HIGHLIGHTING_MARKER = new Property<Boolean>("highlighting", false);

	protected def void highlight(Set<String> highlights) {

//		val KStyle style2 = KRenderingFactory.eINSTANCE.createKForeground().setColor(Colors.RED);
//		style2.setProperty(HIGHLIGHTING_MARKER, CircuitVisualizationDataComponent.this)
		val Runnable run = [|
			System.out.println("highlighting-------------------------------++++++++!!!!!!!!!!!!!")
			
			
			
			//highlight guard actors
			for (entry : actorMapping.entries) {
				val highlighting = entry.value.styles.findFirst[getProperty(HIGHLIGHTING_MARKER)]
//				val value = entry.value
//				val KContainerRendering kgelem = value.getData(KContainerRendering)
//				val children = kgelem.children
//				for (c : children) {
//					c.getStyles().add(EcoreUtil.copy(style2))
//				}
//				val kgelem = value.getData.filter(KRendering)
				if (highlights.contains(entry.key)) {
					if (highlighting == null) {
						System.out.println("highlighted: " + entry.key)
						val KForeground style = KRenderingFactory.eINSTANCE.createKForeground()
						style.setProperty(HIGHLIGHTING_MARKER, true);
						style.setColor(Colors::RED)
						entry.value.styles.add(style)
					}
				} else {
					if (!highlights.contains(entry.key) && highlighting != null) {
						System.out.println("UNNNhighlighted: " + entry.key)
						entry.value.styles.remove(highlighting)
					}
				}

			}
			
			///highlight links
			for (entry : linkMapping.entries) {
				val highlighting = entry.value.styles.findFirst[getProperty(HIGHLIGHTING_MARKER)]
//				val value = entry.value
//				val KContainerRendering kgelem = value.getData(KContainerRendering)
//				val children = kgelem.children
//				for (c : children) {
//					c.getStyles().add(EcoreUtil.copy(style2))
//				}
//				val kgelem = value.getData.filter(KRendering)
				if (highlights.contains(entry.key)) {
					if (highlighting == null) {
						System.out.println("highlighted: " + entry.key)
						val KForeground style = KRenderingFactory.eINSTANCE.createKForeground()
						style.setProperty(HIGHLIGHTING_MARKER, true);
						style.setColor(Colors::GREEN)
						entry.value.styles.add(style)
					}
				} else {
					if (!highlights.contains(entry.key) && highlighting != null) {
						System.out.println("UNNNhighlighted: " + entry.key)
						entry.value.styles.remove(highlighting)
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

