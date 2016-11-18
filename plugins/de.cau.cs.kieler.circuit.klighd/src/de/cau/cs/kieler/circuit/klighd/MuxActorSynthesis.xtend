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
 package de.cau.cs.kieler.circuit.klighd

import com.google.inject.Inject
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.LineCap
import de.cau.cs.kieler.klighd.krendering.LineJoin
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions

/**
 * @author fry
 * Synthesis for MUX gates
 */
 
class MuxActorSynthesis implements IDrawableActor {
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

	override draw(Actor actor) {
		val KNode node = actor.node

		node.setNodeSize(20, 30);

		node.addRectangle => [
			it.invisible = true;
			it.lineCap = LineCap.CAP_ROUND;
			it.lineCap.propagateToChildren = true

			it.addRectangle => [
//				it.id = "highlightable"
				it.lineWidth = 0;
				it.background = "white".color;
				it.selectionBackground = "red".color;
				it.setAreaPlacementData.from(LEFT, -0f, 0, TOP, 3, 0).to(RIGHT, 0f, 0, BOTTOM, 3, 0)
			];

			
			
			it.addPolygon() => [
//				it.id = "highlightable"
				it.lineWidth = 0
				it.background = "white".color;
				it.selectionBackground = "red".color;
				it.addKPosition(LEFT, 0f, 0, TOP, -3, 0)
				it.addKPosition(LEFT, 0f, 0, TOP, 3, 0f)
				it.addKPosition(RIGHT, 0f, 0, TOP, 3f, 0)
			]
			
			it.addPolygon() => [
//				it.id = "highlightable"
				it.lineWidth = 0
				it.background = "white".color;
				it.selectionBackground = "red".color;
				it.addKPosition(LEFT, 0f, 0, BOTTOM, -3, 0)
				it.addKPosition(LEFT, 0f, 0, BOTTOM, 3, 0f)
				it.addKPosition(RIGHT, 0f, 0, BOTTOM, 3f, 0)
			]
			
			it.addPolyline => [
				it.lineWidth = 1
				it.lineCap = LineCap.CAP_ROUND;
				it.lineJoin = LineJoin.JOIN_ROUND;
				it.addKPosition(LEFT, 0f, 0, BOTTOM, -3f, 0)
				it.addKPosition(LEFT, 0, 0, TOP, -3, 0)
				it.addKPosition(RIGHT, 0, 0, TOP, 3f, 0)
				it.addKPosition(RIGHT, 0, 0, BOTTOM, 3f, 0)
				it.addKPosition(LEFT, 0, 0, BOTTOM, -3, 0)
			]
			
			//Flap for simulation
			it.addPolyline => [
				it.id = "highlightable_0"
				it.lineWidth = 1
				it.lineCap = LineCap.CAP_ROUND;
				it.lineJoin = LineJoin.JOIN_ROUND;
				it.addKPosition(LEFT, 1f, 0, BOTTOM, 10f, 0)
				it.addKPosition(RIGHT, 1, 0, BOTTOM, 16f, 0)
				it.foreground = "black".color
			]
			it.addPolyline => [
				it.id = "highlightable_1"
				it.lineWidth = 1
				it.lineCap = LineCap.CAP_ROUND;
				it.lineJoin = LineJoin.JOIN_ROUND;
				it.addKPosition(LEFT, 1f, 0, TOP, 10f, 0)
				it.addKPosition(RIGHT, 1, 0, TOP, 16f, 0)
				it.foreground = "white".color
			]
			
		]

		return node;

	}

}