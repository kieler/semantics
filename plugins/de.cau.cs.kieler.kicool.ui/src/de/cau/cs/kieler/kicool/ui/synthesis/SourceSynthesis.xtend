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
    
    private val SOURCE_KGT = "source.kgt"
    
    def KNode sourceNode() {
        val sourceNode = KiCoolSynthesis.getKGTFromBundle(KiCoolUiModule.BUNDLE_ID, SOURCE_KGT)
       
        sourceNode
    }
    
    def sourceConnect(KNode source, KNode target) {
        val edge = createEdge 
        edge.source = source
        edge.target = target
        edge.addPolyline(0.5f).addOwnHeadArrowDecorator
        
        edge        
    }
    
}