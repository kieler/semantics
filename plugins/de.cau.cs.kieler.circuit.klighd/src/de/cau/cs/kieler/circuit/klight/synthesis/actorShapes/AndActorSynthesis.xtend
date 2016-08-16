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
import de.cau.cs.kieler.core.krendering.LineCap
import de.cau.cs.kieler.core.krendering.LineJoin
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions

/**
 * @author fry
 * Synthesis for AND gates
 */
class AndActorSynthesis implements IDrawableActor  {
	

	
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

		node.setNodeSize(32, 25);        
		node.addRectangle => [
		
			it.invisible = true;
			it.lineWidth = 0

			it.addRectangle => [
				it.id = "highlightable"
				it.lineWidth = 0;
				it.background = "white".color;
				it.selectionBackground = "red".color;
				it.setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 14f, 0, BOTTOM, 0, 0)
			
			];

			it.addPolyline => [
				it.id = "highlightable"
				it.lineWidth = 1
				it.lineCap = LineCap.CAP_ROUND;
				it.lineJoin = LineJoin.JOIN_ROUND;
				it.addKPosition(RIGHT, 14.5f, 0, TOP, 0.5f, 0)
				it.addKPosition(LEFT, 0, 0, TOP, 0.5f, 0)
				it.addKPosition(LEFT, 0, 0, BOTTOM, 0.5f, 0)
				it.addKPosition(RIGHT, 14.5f, 0, BOTTOM, 0.5f, 0)
			];

			it.addArc() => [
				it.id = "highlightable"
				it.lineWidth = 1
				it.lineCap = LineCap.CAP_ROUND;
				it.background = "white".color;
				it.selectionBackground = "red".color;
				it.arcAngle = 180;
				it.startAngle = -90;
				it.setAreaPlacementData.from(LEFT, 1, 0, TOP, 0, 0);
			];
			
		];
		return node;
	}
}
