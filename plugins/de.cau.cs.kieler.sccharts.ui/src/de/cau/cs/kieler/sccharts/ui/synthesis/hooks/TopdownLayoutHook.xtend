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
import java.util.HashMap
import java.util.LinkedHashMap
import org.eclipse.elk.alg.layered.options.LayerUnzippingStrategy
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.alg.layered.options.LayeredSizeApproximator
import org.eclipse.elk.alg.layered.options.SplineRoutingMode
import org.eclipse.elk.alg.layered.options.WrappingStrategy
import org.eclipse.elk.alg.rectpacking.options.RectPackingOptions
import org.eclipse.elk.alg.rectpacking.options.RectpackingSizeApproximator
import org.eclipse.elk.alg.rectpacking.p3whitespaceelimination.WhiteSpaceEliminationStrategy
import org.eclipse.elk.alg.topdownpacking.options.TopdownpackingOptions
import org.eclipse.elk.core.options.ContentAlignment
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.core.options.TopdownNodeTypes
import org.eclipse.elk.core.options.TopdownSizeApproximator

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

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
        SynthesisOption.createRangeOption("Topdown Hierarchical Node Width", 50.0f, 5000.0f, 1.0f, 150.0f)
            .setCategory(GeneralSynthesisOptions::LAYOUT)
            
    public static final SynthesisOption TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO = 
        SynthesisOption.createRangeOption("Topdown Hierarchical Node Aspect Ratio", 0.2f, 5.0f, 0.01f, 1.41f)
            .setCategory(GeneralSynthesisOptions::LAYOUT)
            
    public static final SynthesisOption CONSERVATIVE_SPLINES = 
        SynthesisOption.createCheckOption(TopdownLayoutHook, "Conservative Splines", false)
            .setCategory(GeneralSynthesisOptions::LAYOUT)
            
    public static final SynthesisOption SCALE_CAP = 
        SynthesisOption.createCheckOption(TopdownLayoutHook, "Enable Scale Cap", true)
            .setCategory(GeneralSynthesisOptions::LAYOUT)
            
    public static final SynthesisOption WHITESPACE_ELIMINATION_STRATEGY = 
        SynthesisOption.createChoiceOption("Whitespace Elimination", #["Equal Between Structures", "Aspect Ratio"], "Equal Between Structures")
            .setCategory(GeneralSynthesisOptions::LAYOUT)
            
    public static final SynthesisOption REGION_SIZE_APPROXIMATOR = 
        SynthesisOption.createChoiceOption("Region Size Approximator", #["Count Children", "Lookahead Layout", "Dynamic", "Expand to Aspect Ratio"], "Dynamic")
            .setCategory(GeneralSynthesisOptions::LAYOUT)
            
    public static final SynthesisOption STATE_SIZE_APPROXIMATOR = 
        SynthesisOption.createChoiceOption("State Size Approximator", #["Lookahead Layout", "Dynamic", "Layered Heuristic"], "Layered Heuristic")
            .setCategory(GeneralSynthesisOptions::LAYOUT)
            
    public static final SynthesisOption DISABLE_RECTPACKING_EXPANSION =
        SynthesisOption.createCheckOption("Disable Rectpacking Expansion", false)
            .setCategory(GeneralSynthesisOptions::LAYOUT)
            
//    public static final SynthesisOption
    
    override getDisplayedSynthesisOptions() {
        return #[CONSERVATIVE_SPLINES, USE_TOPDOWN_LAYOUT, SCALE_CAP, WHITESPACE_ELIMINATION_STRATEGY, TOPDOWN_LAYOUT_CHOICE, TOPDOWN_HIERARCHICAL_NODE_WIDTH,
            TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO, REGION_SIZE_APPROXIMATOR, STATE_SIZE_APPROXIMATOR, DISABLE_RECTPACKING_EXPANSION
        ]
    }
    
    override processState(State state, KNode node) {
        
        val optionValueMap = new LinkedHashMap();
        optionValueMap.put(CoreOptions.DIRECTION, #[Direction.DOWN, Direction.RIGHT]);
//        optionValueMap.put(CoreOptions.LABEL_MANAGER, #[SemanticSoftWrappingLabelManager, TruncatingLabelManager])
        node.setLayoutOption(CoreOptions::TOPDOWN_OPTION_VALUE_MAP, optionValueMap)
        
        node.setProperty(CoreOptions::TOPDOWN_LAYOUT, USE_TOPDOWN_LAYOUT.booleanValue)
        if (USE_TOPDOWN_LAYOUT.booleanValue) {
            node.setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.noneOf(SizeConstraint))
//            node.setProperty(CoreOptions::ALGORITHM, LayeredOptions.ALGORITHM_ID)
//            node.setProperty(CoreOptions::ALGORITHM, BoxLayouterOptions.ALGORITHM_ID)
        }
        
        if (SCALE_CAP.booleanValue) {
            node.setLayoutOption(CoreOptions::TOPDOWN_SCALE_CAP, 1.0)
        } else {
            node.setLayoutOption(CoreOptions::TOPDOWN_SCALE_CAP, Double.MAX_VALUE)
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
//            node.setLayoutOption(CoreOptions::TOPDOWN_SIZE_APPROXIMATOR, TopdownSizeApproximator.COUNT_CHILDREN);
            switch (STATE_SIZE_APPROXIMATOR.objectValue) {
                case "Lookahead Layout": node.setLayoutOption(CoreOptions::TOPDOWN_SIZE_APPROXIMATOR, TopdownSizeApproximator.LOOKAHEAD_LAYOUT)
                case "Dynamic": node.setLayoutOption(CoreOptions::TOPDOWN_SIZE_APPROXIMATOR, TopdownSizeApproximator.DYNAMIC)
                case "Layered Heuristic": node.setLayoutOption(CoreOptions::TOPDOWN_SIZE_APPROXIMATOR, LayeredSizeApproximator.LAYERED_ASPECT_RATIO_LOOKAHEAD)
            }
            node.setLayoutOption(CoreOptions::TOPDOWN_SIZE_APPROXIMATOR, null); // TESTING
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_WIDTH, TOPDOWN_HIERARCHICAL_NODE_WIDTH.floatValue as double)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO, TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO.floatValue as double)
            if (WHITESPACE_ELIMINATION_STRATEGY.objectValue.equals("Aspect Ratio")) {
                node.setLayoutOption(RectPackingOptions::WHITE_SPACE_ELIMINATION_STRATEGY, WhiteSpaceEliminationStrategy.TO_ASPECT_RATIO) 
                // to use I need to set RectPacking.ASPECT_RATIO dynamically, so make a Rectpacking Size Approximator as well?
            }
//            node.setLayoutOption(RectPackingOptions::WHITE_SPACE_ELIMINATION_STRATEGY, null)
            node.setLayoutOption(CoreOptions::CONTENT_ALIGNMENT, EnumSet.of(ContentAlignment.V_CENTER, ContentAlignment.H_CENTER))
        } 
        if (!DISABLE_RECTPACKING_EXPANSION.booleanValue) {
            node.setLayoutOption(RectPackingOptions::WHITE_SPACE_ELIMINATION_STRATEGY, null)
        
        }
    }
    
    override processRegion(Region region, KNode node) {
        node.setProperty(CoreOptions::TOPDOWN_LAYOUT, USE_TOPDOWN_LAYOUT.booleanValue)
        
        val optionValueMap = new HashMap();
        optionValueMap.put(CoreOptions.DIRECTION, #[Direction.DOWN, Direction.RIGHT]);
//        optionValueMap.put(CoreOptions.LABEL_MANAGER, #[SemanticSoftWrappingLabelManager, TruncatingLabelManager])
//        optionValueMap.put(LayeredOptions.WRAPPING_STRATEGY, #[WrappingStrategy.OFF, WrappingStrategy.SINGLE_EDGE])

//        optionValueMap.put(LayeredOptions::LAYERING_NODE_PROMOTION_STRATEGY, #[NodePromotionStrategy.NONE, NodePromotionStrategy.MODEL_ORDER_LEFT_TO_RIGHT, NodePromotionStrategy.MODEL_ORDER_RIGHT_TO_LEFT, NodePromotionStrategy.NIKOLOV_IMPROVED])
//        optionValueMap.put(LayeredOptions::LAYERING_STRATEGY, #[LayeringStrategy.MIN_WIDTH, LayeringStrategy.STRETCH_WIDTH])

        optionValueMap.put(LayeredOptions::LAYER_UNZIPPING_STRATEGY, #[LayerUnzippingStrategy.N_LAYERS, LayerUnzippingStrategy.NONE])
        node.setLayoutOption(CoreOptions::TOPDOWN_OPTION_VALUE_MAP, optionValueMap)
        
//        node.setLayoutOption(LayeredOptions.WRAPPING_STRATEGY, WrappingStrategy.SINGLE_EDGE)
        
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
            switch (REGION_SIZE_APPROXIMATOR.objectValue) {
                case "Count Children": node.setLayoutOption(CoreOptions::TOPDOWN_SIZE_APPROXIMATOR, TopdownSizeApproximator.COUNT_CHILDREN)
                case "Lookahead Layout": node.setLayoutOption(CoreOptions::TOPDOWN_SIZE_APPROXIMATOR, TopdownSizeApproximator.LOOKAHEAD_LAYOUT)
                case "Dynamic": node.setLayoutOption(CoreOptions::TOPDOWN_SIZE_APPROXIMATOR, TopdownSizeApproximator.DYNAMIC)
                case "Expand to Aspect Ratio": node.setLayoutOption(CoreOptions::TOPDOWN_SIZE_APPROXIMATOR, RectpackingSizeApproximator.RECTPACKING_EXPAND_TO_ASPECT_RATIO_LOOKAHEAD)
            }
            node.setLayoutOption(CoreOptions::TOPDOWN_SIZE_APPROXIMATOR, null); // TESTING
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_WIDTH, TOPDOWN_HIERARCHICAL_NODE_WIDTH.floatValue as double)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO, TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO.floatValue as double)
            node.setLayoutOption(CoreOptions::CONTENT_ALIGNMENT, EnumSet.of(ContentAlignment.V_CENTER, ContentAlignment.H_CENTER))
            
            if (CONSERVATIVE_SPLINES.booleanValue) {
                node.setLayoutOption(LayeredOptions::EDGE_ROUTING_SPLINES_MODE, SplineRoutingMode.CONSERVATIVE_SOFT) 
            }
        }
    }
    
    override start(Scope scope, KNode node) {
        
        val optionValueMap = new HashMap();
        optionValueMap.put(CoreOptions.DIRECTION, #[Direction.DOWN, Direction.RIGHT]);
//        optionValueMap.put(CoreOptions.LABEL_MANAGER, #[SemanticSoftWrappingLabelManager, TruncatingLabelManager])
        node.setLayoutOption(CoreOptions::TOPDOWN_OPTION_VALUE_MAP, optionValueMap)
        
        
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
            
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_WIDTH, 1500.0)
            node.setLayoutOption(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO, 2.5)
            
        }
    }
}