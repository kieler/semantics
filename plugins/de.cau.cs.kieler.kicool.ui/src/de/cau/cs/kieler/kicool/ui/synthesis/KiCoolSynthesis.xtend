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
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.kicool.System
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.alg.layered.p4nodes.NodePlacementStrategy
import org.eclipse.elk.alg.layered.properties.LayeredOptions

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
        
        rootNode.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.layered");
        rootNode.addLayoutParam(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
        rootNode.addLayoutParam(CoreOptions::DIRECTION, Direction::RIGHT);
        rootNode.addLayoutParam(LayeredOptions::NODE_PLACEMENT_STRATEGY, NodePlacementStrategy::BRANDES_KOEPF);
        rootNode.setLayoutOption(CoreOptions::SPACING_NODE, 20f);
        rootNode.setLayoutOption(CoreOptions::SPACING_BORDER, 8f);
        
        
        val nodes = model.processors.transform

        rootNode.children += nodes 
        
        rootNode
    }
    
}