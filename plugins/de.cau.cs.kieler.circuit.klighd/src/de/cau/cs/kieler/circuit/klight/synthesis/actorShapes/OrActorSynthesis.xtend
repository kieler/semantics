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
 package de.cau.cs.kieler.circuit.klight.synthesis.actorShapes

import com.google.inject.Inject
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.LineCap
import de.cau.cs.kieler.core.krendering.LineJoin
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions

/**
 * @author fry
 * Synthesis for OR gates
 */
 
class OrActorSynthesis implements IDrawableActor {

	@Inject
	extension KNodeExtensions

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

//	var r = 0
//	var g = 0
//	var b = 0

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
		val darkBlue = createKColor.setColor(240, 247, 253);

		node.setNodeSize(30, 25);
		
		node.addRectangle => [
			it.invisible = true;
			it.lineWidth = 0
			it.lineCap = LineCap.CAP_ROUND;
			it.lineCap.propagateToChildren = true

			it.addRectangle => [
				it.id = "highlightable"
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
			// it.addKPosition(LEFT, 0, 0, BOTTOM, 0.5f, 0)
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
				it.background = darkBlue
				it.setAreaPlacementData.from(LEFT, -15f, 0, TOP, 0, 0).to(LEFT, 1, 0, BOTTOM, 0, 0);
			];
			it.addArc() => [
				it.id = "highlightable"
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
				it.id = "highlightable"
				it.lineWidth = 0
				it.background = "white".color;
				it.selectionBackground = "red".color;
				it.addKPosition(LEFT, 26f, 0, TOP, 6.5f, 0)
				it.addKPosition(RIGHT, 0, 0, TOP, 0, 0.5f)
				it.addKPosition(LEFT, 26f, 0, BOTTOM, 6.5f, 0)

			]
			it.addPolyline() => [
				it.addKPosition(LEFT, 26f, 0, BOTTOM, 6.5f, 0);
				it.addKPosition(RIGHT, 0, 0, TOP, 0, 0.5f)

			]
			it.addPolyline() => [
				it.addKPosition(LEFT, 26f, 0, TOP, 6.5f, 0);
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
	
//	def setColor(int red, int green, int blue){
//		r = red
//		g = green
//		b = blue
//	}

}
