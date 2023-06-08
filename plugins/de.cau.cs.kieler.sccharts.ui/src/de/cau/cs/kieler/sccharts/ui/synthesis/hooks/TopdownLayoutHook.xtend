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
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import java.util.EnumSet
import org.eclipse.elk.alg.rectpacking.options.RectPackingOptions
import org.eclipse.elk.alg.rectpacking.p3whitespaceelimination.WhiteSpaceEliminationStrategy
import org.eclipse.elk.alg.topdownpacking.options.TopdownpackingOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.TopdownNodeTypes
import org.eclipse.elk.core.options.TopdownSizeApproximator

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.core.options.ContentAlignment

/**
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
            
    public static final SynthesisOption TOPDOWN_LAYOUT_CHOICE = 
        SynthesisOption.createChoiceOption("Topdown Layout Variant", #["Variant 1" ,"Variant 2", "Variant 3"], "Variant 1")
            .setCategory(GeneralSynthesisOptions::LAYOUT)
            
    public static final SynthesisOption TOPDOWN_HIERARCHICAL_NODE_WIDTH = 
        SynthesisOption.createRangeOption("Topdown Hierarchical Node Width", 50.0f, 300.0f, 1.0f, 150.0f)
            .setCategory(GeneralSynthesisOptions::LAYOUT)
            
    public static final SynthesisOption TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO = 
        SynthesisOption.createRangeOption("Topdown Hierarchical Node Aspect Ratio", 0.5f, 2.0f, 0.01f, 1.41f)
            .setCategory(GeneralSynthesisOptions::LAYOUT)
    
    override getDisplayedSynthesisOptions() {
        return #[USE_TOPDOWN_LAYOUT, TOPDOWN_LAYOUT_CHOICE, TOPDOWN_HIERARCHICAL_NODE_WIDTH, TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO]
    }
    
    override processState(State state, KNode node) {
        node.setProperty(CoreOptions::TOPDOWN_LAYOUT, USE_TOPDOWN_LAYOUT.booleanValue)
        if(USE_TOPDOWN_LAYOUT.booleanValue) {
            node.setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.noneOf(SizeConstraint))
        }
        
        if (USE_TOPDOWN_LAYOUT.booleanValue && TOPDOWN_LAYOUT_CHOICE.objectValue.equals("Variant 1")) {
            node.setLayoutOption(CoreOptions::ALGORITHM, TopdownpackingOptions.ALGORITHM_ID)
            node.setLayoutOption(CoreOptions::TOPDOWN_NODE_TYPE, TopdownNodeTypes.PARALLEL_NODE)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_WIDTH, TOPDOWN_HIERARCHICAL_NODE_WIDTH.floatValue as double)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO, TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO.floatValue as double)
        } else if (USE_TOPDOWN_LAYOUT.booleanValue && TOPDOWN_LAYOUT_CHOICE.objectValue.equals("Variant 2")) {
            node.setLayoutOption(CoreOptions::NODE_SIZE_FIXED_GRAPH_SIZE, true)
            node.setLayoutOption(CoreOptions::TOPDOWN_NODE_TYPE, TopdownNodeTypes.HIERARCHICAL_NODE)
            node.setLayoutOption(CoreOptions::TOPDOWN_SIZE_APPROXIMATOR, TopdownSizeApproximator.COUNT_CHILDREN);
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_WIDTH, TOPDOWN_HIERARCHICAL_NODE_WIDTH.floatValue as double)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO, TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO.floatValue as double)
            node.setLayoutOption(RectPackingOptions::WHITE_SPACE_ELIMINATION_STRATEGY, WhiteSpaceEliminationStrategy.TO_ASPECT_RATIO)
            node.setLayoutOption(CoreOptions::CONTENT_ALIGNMENT, EnumSet.of(ContentAlignment.V_CENTER, ContentAlignment.H_CENTER))
        } else if (USE_TOPDOWN_LAYOUT.booleanValue && TOPDOWN_LAYOUT_CHOICE.objectValue.equals("Variant 3")) {
            node.setLayoutOption(CoreOptions::NODE_SIZE_FIXED_GRAPH_SIZE, true)
            node.setLayoutOption(CoreOptions::TOPDOWN_NODE_TYPE, TopdownNodeTypes.HIERARCHICAL_NODE)
            node.setLayoutOption(CoreOptions::TOPDOWN_SIZE_APPROXIMATOR, TopdownSizeApproximator.COUNT_CHILDREN);
//                node.setLayoutOption(CoreOptions::TOPDOWN_SCALE_CAP, Double.MAX_VALUE)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_WIDTH, TOPDOWN_HIERARCHICAL_NODE_WIDTH.floatValue as double)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO, TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO.floatValue as double)
            node.setLayoutOption(RectPackingOptions::WHITE_SPACE_ELIMINATION_STRATEGY, WhiteSpaceEliminationStrategy.TO_ASPECT_RATIO)
        } 
    }
    
    override processRegion(Region region, KNode node) {
        node.setProperty(CoreOptions::TOPDOWN_LAYOUT, USE_TOPDOWN_LAYOUT.booleanValue)
        if (USE_TOPDOWN_LAYOUT.booleanValue && TOPDOWN_LAYOUT_CHOICE.objectValue.equals("Variant 1")) {
            node.setLayoutOption(CoreOptions::NODE_SIZE_FIXED_GRAPH_SIZE, true)
            node.setLayoutOption(CoreOptions::TOPDOWN_NODE_TYPE, TopdownNodeTypes.HIERARCHICAL_NODE)
            node.setLayoutOption(CoreOptions::CONTENT_ALIGNMENT, EnumSet.of(ContentAlignment.V_CENTER, ContentAlignment.H_CENTER))
        } else if (USE_TOPDOWN_LAYOUT.booleanValue && TOPDOWN_LAYOUT_CHOICE.objectValue.equals("Variant 2")) {
            node.setLayoutOption(CoreOptions::NODE_SIZE_FIXED_GRAPH_SIZE, true)
            node.setLayoutOption(CoreOptions::TOPDOWN_NODE_TYPE, TopdownNodeTypes.HIERARCHICAL_NODE)
            node.setLayoutOption(CoreOptions::TOPDOWN_SIZE_APPROXIMATOR, TopdownSizeApproximator.COUNT_CHILDREN);
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_WIDTH, TOPDOWN_HIERARCHICAL_NODE_WIDTH.floatValue as double)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO, TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO.floatValue as double)
            node.setLayoutOption(CoreOptions::CONTENT_ALIGNMENT, EnumSet.of(ContentAlignment.V_CENTER, ContentAlignment.H_CENTER))
        } else if (USE_TOPDOWN_LAYOUT.booleanValue && TOPDOWN_LAYOUT_CHOICE.objectValue.equals("Variant 3")) {
            node.setLayoutOption(CoreOptions::NODE_SIZE_FIXED_GRAPH_SIZE, true)
            node.setLayoutOption(CoreOptions::TOPDOWN_NODE_TYPE, TopdownNodeTypes.HIERARCHICAL_NODE)
            node.setLayoutOption(CoreOptions::TOPDOWN_SIZE_APPROXIMATOR, TopdownSizeApproximator.LOOKAHEAD_LAYOUT)
//            node.setLayoutOption(CoreOptions::TOPDOWN_SCALE_CAP, Double.MAX_VALUE)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_WIDTH, TOPDOWN_HIERARCHICAL_NODE_WIDTH.floatValue as double)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO, TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO.floatValue as double)
        }
    }
    
    override start(Scope scope, KNode node) {
        node.setProperty(CoreOptions::TOPDOWN_LAYOUT, USE_TOPDOWN_LAYOUT.booleanValue)
        if (USE_TOPDOWN_LAYOUT.booleanValue && TOPDOWN_LAYOUT_CHOICE.objectValue.equals("Variant 1")) {
            node.setProperty(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_WIDTH, TOPDOWN_HIERARCHICAL_NODE_WIDTH.floatValue as double)
            node.setProperty(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO, TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO.floatValue as double)
            node.setProperty(CoreOptions::TOPDOWN_NODE_TYPE, TopdownNodeTypes.ROOT_NODE)
            node.setProperty(CoreOptions::NODE_SIZE_FIXED_GRAPH_SIZE, true)
        } else if (USE_TOPDOWN_LAYOUT.booleanValue && TOPDOWN_LAYOUT_CHOICE.objectValue.equals("Variant 2")) {
            node.setLayoutOption(CoreOptions::NODE_SIZE_FIXED_GRAPH_SIZE, true)
            node.setLayoutOption(CoreOptions::TOPDOWN_NODE_TYPE, TopdownNodeTypes.ROOT_NODE)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_WIDTH, TOPDOWN_HIERARCHICAL_NODE_WIDTH.floatValue as double)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO, TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO.floatValue as double)
        } else if (USE_TOPDOWN_LAYOUT.booleanValue && TOPDOWN_LAYOUT_CHOICE.objectValue.equals("Variant 3")) {
            node.setLayoutOption(CoreOptions::NODE_SIZE_FIXED_GRAPH_SIZE, true)
            node.setLayoutOption(CoreOptions::TOPDOWN_NODE_TYPE, TopdownNodeTypes.ROOT_NODE)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_WIDTH, TOPDOWN_HIERARCHICAL_NODE_WIDTH.floatValue as double)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO, TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO.floatValue as double)
        }
    }
}