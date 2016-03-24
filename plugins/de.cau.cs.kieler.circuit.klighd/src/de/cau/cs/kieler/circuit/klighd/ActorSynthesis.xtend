package de.cau.cs.kieler.circuit.klighd

import com.google.inject.Inject
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.SizeConstraint
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import java.util.EnumSet
import de.cau.cs.kieler.core.krendering.LineJoin
import de.cau.cs.kieler.klay.layered.properties.Properties
import de.cau.cs.kieler.klay.layered.p4nodes.NodePlacementStrategy
import de.cau.cs.kieler.kiml.options.PortConstraints
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.core.krendering.Trigger
import de.cau.cs.kieler.klay.layered.properties.EdgeLabelSideSelection
import de.cau.cs.kieler.kiml.options.HierarchyHandling

class ActorSynthesis extends AbstractDiagramSynthesis<Actor> {
	@Inject
	AndActorSynthesis andActorSynthesis

	@Inject
	NotActorSynthesis notActorSynthesis

	@Inject
	OrActorSynthesis orActorSynthesis

	@Inject
	MuxActorSynthesis muxActorSynthesis

	@Inject
	RegisterActorSynthesis registerActorSynthesis

	@Inject
	FlipFlopActorSynthesis flipflopActorSynthesis

	@Inject
	extension KColorExtensions

	/** Rendering factory used to instantiate KRendering instances. */
	val renderingFactory = KRenderingFactory::eINSTANCE

	@Inject extension KNodeExtensions
	@Inject extension KLabelExtensions
	@Inject extension KRenderingExtensions

	extension KRenderingFactory = KRenderingFactory.eINSTANCE

//	static var r = 215
//	static var g = 235
//	static var b = 245
	override KNode transform(Actor actor) {

		val Boolean atomicActor = !(actor.innerActors.toList.length > 0)
		val hasType = !(actor.type == null)
		val hasName = !(actor.name == null)

		// create KNode for actor
		var KNode actorNode = actor.node; // ///getNode nicht createNode()
//		actorNode.associateWith(actor)
		// if actor is a gate create it. otherwise draw a simple frame.
		if (atomicActor) {
			if (!hasType) {
				actorNode.addRoundedRectangle(4, 4, 2)
				actorNode.addLayoutParam(LayoutOptions.SIZE_CONSTRAINT,
					EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
			} else {
				switch (actor.type) {
					case "AND":
						actorNode = andActorSynthesis.draw(actor)
					case "OR": {
//						orActorSynthesis.setColor(r,g,b)
						actorNode = orActorSynthesis.draw(actor)
					}
					case "NOT":
						actorNode = notActorSynthesis.draw(actor)
					case "REG":
						actorNode = registerActorSynthesis.draw(actor)
					case "MUX":
						actorNode = muxActorSynthesis.draw(actor)
					case "FF":
						actorNode = flipflopActorSynthesis.draw(actor)
					default: {

						actorNode.setNodeSize(2, 2);

						actorNode.addRectangle => [

							it.shadow = "black".color
							it.setBackground("white".color);
							it.selectionBackground = "green".color;
						]
						actorNode.addInsideBottomLeftNodeLabel(actor.type, KlighdConstants.DEFAULT_FONT_SIZE,
							KlighdConstants.DEFAULT_FONT_NAME)
						actorNode.addLayoutParam(LayoutOptions.SIZE_CONSTRAINT,
							EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
					}
				}

			}
		} else {

//			r = r-20
//			g = g-10
			// if actor is not a gate, draw a frame
			if (actor.eContainer != null) {

				// Add a rendering for the collapsed version of this node
				val collapsedRendering = createRegion(actorNode, actor)

				collapsedRendering.addAction(Trigger::DOUBLECLICK, KlighdConstants::ACTION_COLLAPSE_EXPAND)
				collapsedRendering.setAreaPlacementData(
					createKPosition(LEFT, 0, 0, TOP, 0, 0),
					createKPosition(LEFT, 80, 0, TOP, 50, 0)
				);
//				collapsedRendering.setRightTopAlignedPointPlacementData(40, 40, 50, 50)
				collapsedRendering.setBackgroundColor(100, 140, 200)
//				collapsedRendering.setForegroundColor(255, 204, 100)
				collapsedRendering.setProperty(KlighdProperties::COLLAPSED_RENDERING, true)
//				collapsedRendering.lineWidth = 2

				actorNode.data += collapsedRendering

				// Create the rendering for the expanded version of this node
				val expandedRendering = createRegion(actorNode, actor)
				expandedRendering.setProperty(KlighdProperties::EXPANDED_RENDERING, true)
				expandedRendering.setProperty(Properties.EDGE_LABEL_SIDE_SELECTION, EdgeLabelSideSelection.SMART)
				expandedRendering.setProperty(LayoutOptions.SELF_LOOP_INSIDE, true);
				expandedRendering.addAction(Trigger::DOUBLECLICK, KlighdConstants::ACTION_COLLAPSE_EXPAND)

				actorNode.data += expandedRendering

			}
			
		}
		if (hasName) {
				actorNode.addOutsideTopLeftNodeLabel(actor.name, KlighdConstants.DEFAULT_FONT_SIZE,
					KlighdConstants.DEFAULT_FONT_NAME);
			}
		
		return actorNode;

	}

	def createRegion(KNode actorNode, Actor actor) {
		actorNode.addLayoutParam(Properties.NODE_PLACER, NodePlacementStrategy.NETWORK_SIMPLEX)
		

		val darkBlue = createKColor.setColor(240, 247, 253);
		val red = createKColor.setColor(222, 100, 100);

		val rendering = renderingFactory.createKRoundedRectangle() => [ rect |
			rect.lineWidth = 0
			
			
//			////////////////////!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			if (actor.name.startsWith("g") && !actor.innerActors.empty) {
				rect.lineWidth = 1;
				rect.setForeground(red);
			} else {
				rect.setBackground(darkBlue)
			}
//			////////////////////!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

//			rect.selectionBackground = "green".color

		]

		return rendering
	}
//		val darkBlue = createKColor.setColor(215, 235, 255);
//		val blue = createKColor.setColor(235, 245, 255);
//			
//		actorNode.addRoundedRectangle(4, 4, 0) => [
//			it.addDoubleClickAction(KlighdConstants.ACTION_COLLAPSE_EXPAND);
//			if (actor.name == null) {
//				it.setBackground(blue);
//			} else {
//				it.setBackground(darkBlue)
//			}
//
//		]
//
//		actorNode.addLayoutParam(LayoutOptions.SIZE_CONSTRAINT,
//			EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
//		actorNode.addLayoutParam(Properties.NODE_PLACER, NodePlacementStrategy.BRANDES_KOEPF);
//		
//		return actorNode
//		
//	}
//	def colorReset(){
//		r = 235
//		g = 245
//		b = 245
//	}
}