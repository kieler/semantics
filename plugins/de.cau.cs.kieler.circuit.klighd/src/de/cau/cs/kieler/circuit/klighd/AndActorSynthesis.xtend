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
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.kiml.options.PortConstraints
import de.cau.cs.kieler.core.krendering.LineCap
import de.cau.cs.kieler.core.krendering.LineJoin
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis

class AndActorSynthesis implements IDrawableActor  {
	

	
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

		node.setNodeSize(32, 25);        
		node.addRectangle => [
		
			it.invisible = true;

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