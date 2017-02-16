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

import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import com.google.inject.Inject
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import static de.cau.cs.kieler.kicool.ui.synthesis.ColorStore.Color.*

/**
 * Main diagram synthesis for SCCharts.
 * 
 * @author ssm
 * @kieler.design 2016-10-20 proposed 
 * @kieler.rating 2016-10-20 proposed yellow
 */
@ViewSynthesisShared
class ProcessorStyles {
    
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions    
    @Inject extension ColorStore
    
    def addProcessorGroupFigure(KNode node) {
        node.addRoundedRectangle(7, 7, 2) => [
            background = PROCESSORGROUP_BACKGROUND.color;
            foreground = PROCESSORGROUP_FOREGROUND.color;
        ]   
        node 
    }
}