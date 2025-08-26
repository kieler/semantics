/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2024 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import java.util.EnumSet
import org.eclipse.elk.core.options.ContentAlignment
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.core.options.TopdownNodeTypes

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Hook that configures SCCharts to be laid out using top-down layout instead of bottom-up layout.
 * 
 * @author mka
 *
 */
 @ViewSynthesisShared
class TopdownLayoutHook extends SynthesisHook {
    
    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.TopdownLayoutHook";
    
    public static final SynthesisOption USE_TOPDOWN_LAYOUT = 
        SynthesisOption.createCheckOption(TopdownLayoutHook, "Topdown Layout", false)
            .setCategory(GeneralSynthesisOptions::LAYOUT)
            .description = "Use top-down layout instead of bottom-up layout to generate the diagram."
            
    public static final SynthesisOption SCALE_CAP = 
        SynthesisOption.createCheckOption(TopdownLayoutHook, "Enable Scale Cap", true)
            .setCategory(GeneralSynthesisOptions::LAYOUT)
            .description = "If the scale cap is enabled, elements will only be scaled down. Otherwise they will be 
                            scaled up to fill all the available space."
            
    public static final SynthesisOption TOPDOWN_HIERARCHICAL_NODE_WIDTH = 
        SynthesisOption.createRangeOption(TopdownLayoutHook, "Topdown Hierarchical Node Width", 50.0f, 5000.0f, 1.0f, 150.0f)
            .setCategory(GeneralSynthesisOptions::LAYOUT)
            .description = "The fixed width to assign to all hierarchical nodes."
            
    public static final SynthesisOption TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO = 
        SynthesisOption.createRangeOption(TopdownLayoutHook, "Topdown Hierarchical Node Aspect Ratio", 0.2f, 5.0f, 0.01f, 1.41f)
            .setCategory(GeneralSynthesisOptions::LAYOUT)
            .description = "The aspect ratio all hierarchical nodes should have. Determines the height of the nodes."
            
    
    override getDisplayedSynthesisOptions() {
        return #[
            USE_TOPDOWN_LAYOUT, SCALE_CAP, TOPDOWN_HIERARCHICAL_NODE_WIDTH, TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO
        ]
    }
    
    override processState(State state, KNode node) {
        
        node.setProperty(CoreOptions::TOPDOWN_LAYOUT, USE_TOPDOWN_LAYOUT.booleanValue)
        if (USE_TOPDOWN_LAYOUT.booleanValue) {
            node.setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.noneOf(SizeConstraint))
            node.setLayoutOption(CoreOptions::NODE_SIZE_FIXED_GRAPH_SIZE, true)
            node.setLayoutOption(CoreOptions::TOPDOWN_NODE_TYPE, TopdownNodeTypes.HIERARCHICAL_NODE)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_WIDTH, TOPDOWN_HIERARCHICAL_NODE_WIDTH.floatValue as double)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO, TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO.floatValue as double)
            node.setLayoutOption(CoreOptions::CONTENT_ALIGNMENT, EnumSet.of(ContentAlignment.V_CENTER, ContentAlignment.H_CENTER))
            
            if (SCALE_CAP.booleanValue) {
                node.setLayoutOption(CoreOptions::TOPDOWN_SCALE_CAP, 1.0)
            } else {
                node.setLayoutOption(CoreOptions::TOPDOWN_SCALE_CAP, Double.MAX_VALUE)
            }
        }
    }
    
    override processRegion(Region region, KNode node) {
        node.setProperty(CoreOptions::TOPDOWN_LAYOUT, USE_TOPDOWN_LAYOUT.booleanValue)
        
        if (USE_TOPDOWN_LAYOUT.booleanValue) {
            node.setLayoutOption(CoreOptions::NODE_SIZE_FIXED_GRAPH_SIZE, true)
            node.setLayoutOption(CoreOptions::TOPDOWN_NODE_TYPE, TopdownNodeTypes.HIERARCHICAL_NODE)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_WIDTH, TOPDOWN_HIERARCHICAL_NODE_WIDTH.floatValue as double)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO, TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO.floatValue as double)
            node.setLayoutOption(CoreOptions::CONTENT_ALIGNMENT, EnumSet.of(ContentAlignment.V_CENTER, ContentAlignment.H_CENTER))
            if (SCALE_CAP.booleanValue) {
                node.setLayoutOption(CoreOptions::TOPDOWN_SCALE_CAP, 1.0)
            } else {
                node.setLayoutOption(CoreOptions::TOPDOWN_SCALE_CAP, Double.MAX_VALUE)
            }
        }
    }
    
    override start(Scope scope, KNode node) {
        node.setProperty(CoreOptions::TOPDOWN_LAYOUT, USE_TOPDOWN_LAYOUT.booleanValue)
        if (USE_TOPDOWN_LAYOUT.booleanValue) {
            node.setLayoutOption(CoreOptions::NODE_SIZE_FIXED_GRAPH_SIZE, true)
            node.setLayoutOption(CoreOptions::TOPDOWN_NODE_TYPE, TopdownNodeTypes.ROOT_NODE)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_WIDTH, TOPDOWN_HIERARCHICAL_NODE_WIDTH.floatValue as double)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO, TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO.floatValue as double)
            if (SCALE_CAP.booleanValue) {
                node.setLayoutOption(CoreOptions::TOPDOWN_SCALE_CAP, 1.0)
            } else {
                node.setLayoutOption(CoreOptions::TOPDOWN_SCALE_CAP, Double.MAX_VALUE)
            }
        }
    }
}