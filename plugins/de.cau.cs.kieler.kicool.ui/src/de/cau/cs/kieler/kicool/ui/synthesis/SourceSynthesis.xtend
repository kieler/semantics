/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.synthesis

import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.kicool.ui.KiCoolUiModule
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import org.eclipse.elk.core.options.CoreOptions
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory

/**
 * Main diagram synthesis for the source in KiCool.
 * 
 * @author ssm
 * @kieler.design 2017-06-10 proposed 
 * @kieler.rating 2017-06-10 proposed yellow
 */
@ViewSynthesisShared
class SourceSynthesis {
    
    @Inject extension KEdgeExtensions 
    @Inject extension ProcessorStyles  
    @Inject extension KNodeExtensions  
    @Inject extension KRenderingExtensions
    
    extension KRenderingFactory = KRenderingFactory::eINSTANCE
    
    static val SOURCE_KGT = "source.kgt"
    
    def KNode sourceNode() {
        createNode => [
            width = 16.5f
            height = 16.5f
            setProperty(KNodeProperties.SOURCE_NODE, true)
            data += KGraphFactory.eINSTANCE.createKIdentifier => [
                id = "source"
            ]
            addRoundedRectangle(10, 10) => [
                foreground = Colors.GRAY
                setBackgroundGradient(createKColor => [
                    red = 248
                    green = 249
                    blue = 253
                ], 255, createKColor => [
                    red = 205
                    green = 220
                    blue = 243
                ], 243, 90)
            ]
        ]
    }
    
    def sourceConnect(KNode source, KNode target) {
        val edge = createEdge 
        edge.source = source
        edge.target = target
        edge.addPolyline(0.5f).addOwnHeadArrowDecorator
        
        edge        
    }
    
}