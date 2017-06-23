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
package de.cau.cs.kieler.sccharts.klighd.srtg.synthesis

import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.StateStyles
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.ColorStore

import static de.cau.cs.kieler.sccharts.klighd.synthesis.styles.ColorStore.Color.*
import de.cau.cs.kieler.klighd.kgraph.KNode

/**
 * @author ssm
 *
 */
class SRTGStateStyles extends StateStyles {
    
    @Inject
    extension KNodeExtensions

    @Inject
    extension KRenderingExtensions

    @Inject
    extension KContainerRenderingExtensions

    @Inject
    extension ColorStore    
    
        override KRoundedRectangle addConnectorFigure(KNode node) {
        node.setNodeSize(2, 2);
        node.addRoundedRectangle(7, 7, baseLineWidth) => [
            background = STATE_CONNECTOR.color;
            foreground = STATE_CONNECTOR.color;
        ]
    }
    
}