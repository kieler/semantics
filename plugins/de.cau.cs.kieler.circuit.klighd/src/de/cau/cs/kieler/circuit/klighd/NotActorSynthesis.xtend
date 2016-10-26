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
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.LineCap
import de.cau.cs.kieler.core.krendering.LineJoin
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions

/**
 * @author fry
 * Synthesis for NOT gates
 */
 
class NotActorSynthesis implements IDrawableActor {
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

		node.setNodeSize(30, 30);
		node.addRectangle => [
			it.invisible = true
			it.addPolygon => [
				it.id = "highlightable"
				it.lineWidth = 1
				it.lineCap = LineCap.CAP_ROUND;
				it.lineJoin = LineJoin.JOIN_ROUND;
				it.background = "white".color;
				it.selectionBackground = "gray".color;
				it.addKPosition(LEFT, 0, 0, TOP, 1, 0)
				it.addKPosition(RIGHT, 2, 0, TOP, 0, 0.5f)
				it.addKPosition(LEFT, 0, 0, BOTTOM, 1, 0)
			];
			it.addEllipse => [
				it.id = "highlightable"
				it.setBackground("white".color).lineWidth = 1;
				it.setAreaPlacementData.from(LEFT, 24, 0, TOP, 12, 0).to(RIGHT, 0, 0, BOTTOM, 12, 0);
			]
		];
		return node;
	}

}