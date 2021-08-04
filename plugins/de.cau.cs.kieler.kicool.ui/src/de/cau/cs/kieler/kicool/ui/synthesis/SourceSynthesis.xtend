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

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.ui.synthesis.styles.ProcessorStyles
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions

import static extension de.cau.cs.kieler.annotations.ide.klighd.CommonSynthesisUtil.setKID

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
    
    static val SOURCE_KGT = "source.kgt"
    
    def KNode sourceNode() {
        createNode => [
            setDefaultProcessorSize()
            width = height // make it round
            setProperty(KNodeProperties.SOURCE_NODE, true)
            KID = "source"
            addSourceRendering()
        ]
    }
    
    def sourceConnect(KNode source, KNode target) {
        val edge = createEdge 
        edge.source = source
        edge.target = target
        edge.targetPort = target.ports.head // Assuming the first port is left
        edge.addConnectionFigure()
        
        edge        
    }
    
}