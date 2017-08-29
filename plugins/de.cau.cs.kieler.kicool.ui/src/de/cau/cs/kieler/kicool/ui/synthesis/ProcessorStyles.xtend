/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.synthesis

import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import static de.cau.cs.kieler.kicool.ui.synthesis.styles.ColorStore.Color.*
import static extension de.cau.cs.kieler.kicool.ui.synthesis.styles.ColorStore.*
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KPolyline
import de.cau.cs.kieler.klighd.krendering.LineCap
import de.cau.cs.kieler.klighd.krendering.KPolygon
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.extensions.PositionReferenceX
import de.cau.cs.kieler.klighd.krendering.extensions.PositionReferenceY
import de.cau.cs.kieler.klighd.krendering.LineJoin

/**
 * User-defined KiCool synthesis styles
 * 
 * @author ssm
 * @kieler.design 2016-10-20 proposed 
 * @kieler.rating 2016-10-20 proposed yellow
 */
@ViewSynthesisShared
class ProcessorStyles {
    
    @Inject extension KRenderingExtensions

    extension KRenderingFactory = KRenderingFactory::eINSTANCE
    
    
    def addProcessorGroupFigure(KNode node) {
        node.addRoundedRectangle(7, 7, 2) => [
            background = PROCESSORGROUP_BACKGROUND.color;
            foreground = PROCESSORGROUP_FOREGROUND.color;
        ]   
        node 
    }
    
    def KRendering addOwnHeadArrowDecorator(KPolyline pl) {
        internalAddArrowDecorator(pl, true)
    }    
    
    def KRendering internalAddArrowDecorator(KPolyline pl, boolean head) {
        pl.lineCap = LineCap::CAP_FLAT
        return pl.drawArrow() => [
            it.placementData = createKDecoratorPlacementData => [
                it.rotateWithLine = true;
                it.relative = if (head) 1f else 0f;
                it.absolute = if (head) -2f else 2f;
                it.width = 6;
                it.height = 4;
                it.setXOffset(if (head) -4f else 6f); // chsch: used the regular way here and below, as the alias 
                it.setYOffset(if (head) -2f else 3f); //  name translation convention changed from Xtext 2.3 to 2.4.
            ];
            if (!head) it.rotation = 180f
        ];
    }   
    
    def KPolygon drawArrow(KContainerRendering cr) {
        return createKPolygon => [
            cr.addChild(it).withCopyOf(cr.lineWidth).withCopyOf(cr.foreground).setBackground(cr.foreground).setLineJoin(LineJoin::JOIN_ROUND);
            it.points += createKPosition(PositionReferenceX::LEFT, 0, 0, PositionReferenceY::TOP, 0, 0);
            it.points += createKPosition(PositionReferenceX::LEFT, 0, 0.66f, PositionReferenceY::TOP, 0, 0.5f);
            it.points += createKPosition(PositionReferenceX::LEFT, 0, 0, PositionReferenceY::BOTTOM, 0, 0);
            it.points += createKPosition(PositionReferenceX::RIGHT, 0, 0, PositionReferenceY::BOTTOM, 0, 0.5f);    
       ];    
    }
    
    def <T extends KRendering> T addChild(KContainerRendering parent, T child) {
        return child => [
            parent.children.add(it);
        ];
    }    
}