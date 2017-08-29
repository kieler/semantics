/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.styles

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KRectangle
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import java.util.List
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

import static de.cau.cs.kieler.sccharts.ui.synthesis.styles.ColorStore.Color.*

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.klighd.krendering.KPolyline
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions

/**
 * Styles for {@link State}.
 * 
 * @author ssm
 * @kieler.design 2017-07-05 proposed
 * @kieler.rating 2017-07-05 proposed yellow
 * 
 */
@ViewSynthesisShared
class CommentStyles {

    @Inject
    extension KNodeExtensions
    
    @Inject
    extension KEdgeExtensions
    
    @Inject
    extension KRenderingExtensions

    @Inject
    extension KContainerRenderingExtensions

    @Inject
    extension ColorStore
    

    /**
     * Adds a small state figure.
     */
    def KRoundedRectangle addCommentFigure(KNode node) {
        node.setMinimalNodeSize(16, 16)
        node.addRoundedRectangle(1, 1, 1) => [
            setBackgroundGradient(COMMENT_BACKGROUND_GRADIENT_1.color, COMMENT_BACKGROUND_GRADIENT_2.color, 90);
            foreground = COMMENT_FOREGROND.color;
        ]
    }

    /**
     * Adds a title label to a macro state figure.
     */
    def KText addCommentText(KNode node, String text) {
        node.getKContainerRendering.addText(text) => [
            fontSize = 8;
            setGridPlacementData().from(LEFT, 4, 0, TOP, 4, 0).to(RIGHT, 4, 0, BOTTOM, 4, 0);
        ]
    }
    
    def KPolyline addCommentPolyline(KEdge edge) {
        edge.addPolyline => [
            lineWidth = 1;
            foreground = COMMENT_EDGE.color
        ]
    }     

}