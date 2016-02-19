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

class MuxActorSynthesis implements IDrawableActor {
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

	override draw(Actor actor) {
		val KNode node = actor.node

		node.setNodeSize(20, 30);

		node.addRectangle => [
			it.invisible = true;
			it.lineCap = LineCap.CAP_ROUND;
			it.lineCap.propagateToChildren = true

			it.addRectangle => [
				it.id = "highlightable"
				it.lineWidth = 0;
				it.background = "white".color;
				it.selectionBackground = "red".color;
				it.setAreaPlacementData.from(LEFT, -0f, 0, TOP, 3, 0).to(RIGHT, 0f, 0, BOTTOM, 3, 0)
			];

			
			
			it.addPolygon() => [
				it.id = "highlightable"
				it.lineWidth = 0
				it.background = "white".color;
				it.selectionBackground = "red".color;
				it.addKPosition(LEFT, 0f, 0, TOP, -3, 0)
				it.addKPosition(LEFT, 0f, 0, TOP, 3, 0f)
				it.addKPosition(RIGHT, 0f, 0, TOP, 3f, 0)
			]
			
			it.addPolygon() => [
				it.id = "highlightable"
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
		]

		return node;

	}

}