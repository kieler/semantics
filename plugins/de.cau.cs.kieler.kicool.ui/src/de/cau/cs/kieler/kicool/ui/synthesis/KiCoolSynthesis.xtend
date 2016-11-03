/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.core.krendering.KText
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.klay.layered.properties.Properties
import de.cau.cs.kieler.klay.layered.p4nodes.NodePlacementStrategy

/**
 * Main diagram synthesis for SCCharts.
 * 
 * @author ssm
 * @kieler.design 2016-10-20 proposed 
 * @kieler.rating 2016-10-20 proposed yellow
 */
@ViewSynthesisShared
class KiCoolSynthesis extends AbstractDiagramSynthesis<System> {

    @Inject 
    extension KNodeExtensions
    
    @Inject
    extension KRenderingExtensions
    
    @Inject
    extension AnnotationsExtensions
    
    @Inject
    extension ProcessorSynthesis
    
    override transform(System model) {
        val rootNode = model.createNode
        
        rootNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
        rootNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
        rootNode.addLayoutParam(LayoutOptions::DIRECTION, Direction::RIGHT);
        rootNode.addLayoutParam(Properties::NODE_PLACER, NodePlacementStrategy::BRANDES_KOEPF);
        rootNode.setLayoutOption(LayoutOptions::SPACING, 20f);
        rootNode.setLayoutOption(LayoutOptions::BORDER_SPACING, 8f);
        
        rootNode.children += model.processors.transform
        
        rootNode
    }
    
}