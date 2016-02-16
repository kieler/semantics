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

/**
 * @author ssm als cmot
 * 
 */
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

	val HashMultimap<String, KRendering> guardActorMapping = HashMultimap.create
	val HashMultimap<String, KRendering> linkMapping = HashMultimap.create

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

		guardActorMapping.clear
		linkMapping.clear

		val contextsCirc = viewParts.map[viewer.viewContext].filter[inputModel instanceof Actor]

		val Runnable run = [|
			for (context : contextsCirc) {
				System.out.println("circuit-------------------------------++++++++!!!!!!!!!!!!!")
				System.out.println(context.getNode().toString)
				val circuit = context.inputModel as Actor
				for (node : circuit.eAllContents.filter(Actor).toList) {

					if (node.name != null && node.name.startsWith("g")) {
						System.out.println("put sth into guardActorMapping: " + node.name)
						// System.out.println(context.getTargetElements(node))
						val frame = context.getTargetElement(node, KNode)
						val KContainerRendering kgelem = frame.getData(KContainerRendering)
						val shape = frame.getData.filter(KRendering)
						val children = kgelem.children
						System.out.println(children + "HIHIHIHHI")
						guardActorMapping.putAll(node.name, children)
						guardActorMapping.putAll(node.name, shape)

						val links = node.ports.filter[type.startsWith("Out")].head.outgoingLinks
						for (l : links) {
							val link = context.getTargetElement(l, KEdge)
							val rend = link.getData.filter(KRendering).head
							linkMapping.put(node.name, rend)//context.getTargetElement(l, KEdge))
						}
					}

				}

			}

			for (e : guardActorMapping.entries) {
				System.out.println("entry: " + e.key + " with value " + e.value)
			}

			for (l : linkMapping.entries) {
				System.out.println("ENTRY: " + l.key + " with value " + l.value)
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

		]
		Display.getDefault().syncExec(run)

	}

	override step(JSONObject jSONObject) throws KiemExecutionException {
		System.out.println("step-------------------------------++++++++!!!!!!!!!!!!!")
		val highlighting = <String>newHashSet
		for (key : jSONObject.keys.toIterable) {
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
			}
		}

		for (h : highlighting) {
			System.out.println(h + " shall be highlighted")
		}
		highlight(highlighting)

		jSONObject
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

	protected static val HIGHLIGHTING_MARKER = new Property<Boolean>("highlighting", false);

	protected def void highlight(Set<String> guards) {

//		val KStyle style2 = KRenderingFactory.eINSTANCE.createKForeground().setColor(Colors.RED);
//		style2.setProperty(HIGHLIGHTING_MARKER, CircuitVisualizationDataComponent.this)
		val Runnable run = [|
			System.out.println("highlighting-------------------------------++++++++!!!!!!!!!!!!!")


			for (entry : guardActorMapping.entries) {
				val highlighting = entry.value.styles.findFirst[getProperty(HIGHLIGHTING_MARKER)]
//				val value = entry.value
//				val KContainerRendering kgelem = value.getData(KContainerRendering)
//				val children = kgelem.children
//				for (c : children) {
//					c.getStyles().add(EcoreUtil.copy(style2))
//				}
//				val kgelem = value.getData.filter(KRendering)
				if (guards.contains(entry.key)) {
					if (highlighting == null) {
						System.out.println("highlighted: " + entry.key)
						val KForeground style = KRenderingFactory.eINSTANCE.createKForeground()
						style.setProperty(HIGHLIGHTING_MARKER, true);
						style.setColor(Colors::RED)
						entry.value.styles.add(style)
					}
				} else {
					if (!guards.contains(entry.key) && highlighting != null) {
						System.out.println("UNNNhighlighted: " + entry.key)
						entry.value.styles.remove(highlighting)
					}
				}

			}
			
			
			
			for (entry : linkMapping.entries) {
				val highlighting = entry.value.styles.findFirst[getProperty(HIGHLIGHTING_MARKER)]
//				val value = entry.value
//				val KContainerRendering kgelem = value.getData(KContainerRendering)
//				val children = kgelem.children
//				for (c : children) {
//					c.getStyles().add(EcoreUtil.copy(style2))
//				}
//				val kgelem = value.getData.filter(KRendering)
				if (guards.contains(entry.key)) {
					if (highlighting == null) {
						System.out.println("highlighted: " + entry.key)
						val KForeground style = KRenderingFactory.eINSTANCE.createKForeground()
						style.setProperty(HIGHLIGHTING_MARKER, true);
						style.setColor(Colors::RED)
						entry.value.styles.add(style)
					}
				} else {
					if (!guards.contains(entry.key) && highlighting != null) {
						System.out.println("UNNNhighlighted: " + entry.key)
						entry.value.styles.remove(highlighting)
					}
				}

			}
			

		]
		Display.getDefault().syncExec(run)

	}

	private def KNode synthesizeConditionalAssignmentAnnotation(KNode sourceNode, Assignment assignment, SCGraph scg) {
		val VOName = assignment.getStringAnnotationValue(AbstractSequentializer::ANNOTATION_CONDITIONALASSIGNMENT)
		val VO = scg.findValuedObjectByName(VOName)
		val kNode = assignment.createNode(VO) => [ node |
			node.getData(typeof(KLayoutData)).setProperty(LayoutOptions.COMMENT_BOX, true)
//            node.setNodeSize(75.0f, 20.0f)
		]
//            node.setMinimalNodeSize(MINIMALWIDTH, MINIMALHEIGHT) 
		val figure = kNode.addRectangle().setLineWidth(1.0f).background = Colors::YELLOW;
		val assignmentStr = sourceNode.getData(typeof(KRoundedRectangle)).children.filter(typeof(KText)).head.text
		figure.addText(assignmentStr).setSurroundingSpace(4, 0, 2, 0).fontSize = 8

		sourceNode.parent.children += kNode

		kNode
	}

	private def KEdge synthesizeConditionalAssignmentLink(KNode aNode, KNode bNode) {
		val kEdge = createNewEdge() => [ edge |
			// Get and set source and target information.
			var sourceNode = aNode
			var targetNode = bNode
			edge.source = sourceNode
			edge.target = targetNode
			edge.sourcePort = aNode.getPort("DEBUGPORT")
			edge.targetPort = bNode.getPort("DEBUGPORT")

			edge.addPolyline(1.0f) => [
				it.lineStyle = LineStyle::DOT
				it.foreground = Colors::GRAY
			]

		]

		kEdge
	}

}

