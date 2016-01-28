package de.cau.cs.kieler.circuit.klighd

import com.google.inject.Inject
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.LineCap
import de.cau.cs.kieler.core.krendering.LineJoin
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.kiml.options.PortConstraints
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis

class OrActorSynthesis implements IDrawableActor {

	@Inject
	extension KNodeExtensions

	@Inject
	extension KEdgeExtensions

	@Inject
	extension KPortExtensions

	@Inject
	extension KLabelExtensions

	@Inject
	extension KRenderingExtensions

	@Inject
	extension KContainerRenderingExtensions

	@Inject
	extension KPolylineExtensions

	@Inject
	extension KColorExtensions

	extension KRenderingFactory = KRenderingFactory.eINSTANCE

//	override transform(Actor actor) {
//		val KNode orActor = draw(actor)
//		
//		
//	}
	override KNode draw(Actor actor) {
		val KNode node = actor.node

//		val ports = actor.ports
//		node.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);
////		node.ports.forEach [
//			it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.WEST).setLayoutOption(LayoutOptions.OFFSET, -8f);
//		];
//		node.ports.last.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.EAST).setLayoutOption(LayoutOptions.OFFSET,
//			-1f);
//		node.setNodeSize(30, 30);
//
//		node.addRectangle =>
//			[
//
//				it.shadow = "black".color
//				it.selectionBackground = "green".color;
//				it.setBackground("white".color);
//				node.addInsideBottomCenteredNodeLabel("||", KlighdConstants.DEFAULT_FONT_SIZE,
//					KlighdConstants.DEFAULT_FONT_NAME);
//
//			]
		val orange = createKColor.setColor(209, 156, 100);
		node.setNodeSize(30, 25);
		val lightGrey = createKColor.setColor(224, 216, 206);
		node.addRectangle => [
			it.invisible = true;
			it.lineCap = LineCap.CAP_ROUND;
			it.lineCap.propagateToChildren = true

			it.addRectangle => [
				it.lineWidth = 0;
				it.background = "white".color;
				it.selectionBackground = "red".color;
				it.setAreaPlacementData.from(LEFT, -5f, 0, TOP, 0, 0).to(RIGHT, 14f, 0, BOTTOM, 0, 0)
			];

			it.addPolyline => [
				it.lineWidth = 1
				it.lineCap = LineCap.CAP_ROUND;
				it.lineJoin = LineJoin.JOIN_ROUND;
				it.addKPosition(RIGHT, 14.5f, 0, TOP, 0.5f, 0)
				it.addKPosition(LEFT, -5f, 0, TOP, 0.5f, 0)
				//it.addKPosition(LEFT, 0, 0, BOTTOM, 0.5f, 0)

			];
			it.addPolyline => [
				it.lineWidth = 1
				it.lineCap = LineCap.CAP_ROUND;
				it.lineJoin = LineJoin.JOIN_ROUND;
				it.addKPosition(LEFT, -5f, 0, BOTTOM, 0.5f, 0)
				it.addKPosition(RIGHT, 14.5f, 0, BOTTOM, 0.5f, 0)

			]
//			it.addPolyline => [                
//                it.lineWidth = 2;
//                it.addKPosition(LEFT, 0, 0, TOP, 1, 0);
//                it.addKPosition(RIGHT, 15, 0, TOP, 1 ,0);
//            ];
//            
//            it.addPolyline => [
//                it.lineWidth = 2;
//                it.addKPosition(LEFT, 0, 0, BOTTOM, 1, 0);
//                it.addKPosition(RIGHT, 15, 0, BOTTOM, 1,0);
//            ];
			it.addArc() => [
				it.lineWidth = 1;
				it.arcAngle = 180;
				it.startAngle = -90;
				it.background = lightGrey
				it.setAreaPlacementData.from(LEFT, -15f, 0, TOP, 0, 0).to(LEFT, 1, 0, BOTTOM, 0, 0);
			];
			it.addArc() => [
				it.lineWidth = 1
				it.lineCap = LineCap.CAP_ROUND;
				it.background = "white".color;
				it.selectionBackground = "red".color;
				it.arcAngle = 180;
				it.startAngle = -90;
				it.setAreaPlacementData.from(LEFT, 1, 0, TOP, 0, 0).to(RIGHT, 1.5f, 0, BOTTOM, 0f, 0);
			];

//			it.addArc() => [
//				it.lineWidth = 1
//				it.background = orange;
//				it.selectionBackground = "blue".color;
//				it.arcAngle = 90;
//				it.startAngle = -90;
//				it.setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 1.5f, 0, BOTTOM, 0f,0);
//			// it.setAreaPlacementData.from(LEFT,-20, 0, TOP, 0,0).to(RIGHT, 0f, 0, BOTTOM, 0f,0);
//			];
//
//			it.addArc() => [
//				it.lineWidth = 1
//				it.background = orange;
//				it.selectionBackground = "green".color;
//				it.arcAngle = 90;
//				it.startAngle = 0;
//				it.setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 1.5f, 0, BOTTOM, 0f,0);
////                it.setAreaPlacementData.from(LEFT, -30, 0, TOP, 0,0).to(RIGHT, 0f, 0, BOTTOM, 0f,0);
//			];
			it.addPolygon() => [
				it.lineWidth = 0
				it.background = "white".color;
				it.selectionBackground = "red".color;
				it.addKPosition(LEFT, 26f, 0, TOP, 6.5f, 0)
				it.addKPosition(RIGHT, 0, 0, TOP, 0, 0.5f)
				it.addKPosition(LEFT, 26f, 0, BOTTOM, 6.5f, 0)

			]
			it.addPolyline() => [
				it.addKPosition(LEFT, 26.2f, 0, BOTTOM, 6.5f, 0);
				it.addKPosition(RIGHT, 0, 0, TOP, 0, 0.5f)

			]
			it.addPolyline() => [
				it.addKPosition(LEFT, 26.2f, 0, TOP, 6.5f, 0);
				it.addKPosition(RIGHT, 0, 0, BOTTOM, 0, 0.5f)

			]

//			it.addPolygon() => [
//				it.lineWidth = 1
//				it.background = "red".color
//				it.background = orange;
//				it.selectionBackground = "black".color;
////				it.addKPosition(LEFT, 26f, 0, TOP, 6.5f, 0)
//                it.addKPosition(RIGHT, 0, 0, TOP, 0, 0.5f)
//                it.addKPosition(LEFT, 26f, 0, BOTTOM, 6.5f, 0)
//			]
//			it.addPolygon() => [
//				it.lineWidth = 0
//				it.background = "red".color
//				it.background = orange;
//				it.selectionBackground = "black".color;
//				it.addKPosition(LEFT, 25f, 0, TOP, 6.5f, 0)
//                it.addKPosition(RIGHT, 1, 0, TOP, 0, 0.5f)
//                it.addKPosition(LEFT, 25f, 0, BOTTOM, 6.5f, 0)
//			]
		];

		return node;
	}

}