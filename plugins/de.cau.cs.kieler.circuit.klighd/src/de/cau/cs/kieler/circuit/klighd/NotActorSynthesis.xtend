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

class NotActorSynthesis implements IDrawableActor {
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

//		node.setNodeSize(20, 20);
//
//		node.addRectangle =>
//			[
//
//				it.shadow = "black".color
//				it.selectionBackground = "green".color;
//				it.setBackground("white".color);
//				node.addInsideBottomCenteredNodeLabel("1", KlighdConstants.DEFAULT_FONT_SIZE,
//					KlighdConstants.DEFAULT_FONT_NAME);
//
//			]
        node.setNodeSize(30,30);
        
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
            	it.setAreaPlacementData.from(LEFT, 24, 0, TOP, 12,0).to(RIGHT, 0, 0, BOTTOM, 12,0);
            	]
        ];
    
		return node;
	}

}