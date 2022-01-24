/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.alg.layered.options.OrderingStrategy
import org.eclipse.elk.alg.layered.options.LongEdgeOrderingStrategy
import org.eclipse.elk.alg.layered.options.CycleBreakingStrategy

/**
 * Model Order Hook to configure all model order settings
 * 
 * @author sdo
 */
@ViewSynthesisShared
class ModelOrderSynthesisHook extends SynthesisHook {

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.modelOrderSynthesisHook";
    
    public static final SynthesisOption MODEL_ORDER_CATEGORY = GeneralSynthesisOptions::LAYOUT
    
    private static final String NONE = "None";
    private static final String E = "Prefer Edges";
    private static final String V = "Nodes and Edges";
    
    /** The synthesis option to switch between different side selection strategies. */
    public static final SynthesisOption MODEL_ORDER_STRATEGY_SELECTION = SynthesisOption.createChoiceOption(
        ModelOrderSynthesisHook,
        "Model Order",
        newLinkedList(
            NONE,
            E,
            V),
        NONE).setCategory(MODEL_ORDER_CATEGORY);
        
    private static final String DUMMY_NODES_OVER = "Long Edges Above";
    private static final String DUMMY_NODES_UNDER = "Long Edges Below";
    private static final String DUMMY_NODES_EQUAL = "Equal";
    
    public static val SynthesisOption MODEL_ORDER_LONG_EDGE_STRATEGY = SynthesisOption::createChoiceOption(
        ModelOrderSynthesisHook, "Model Order",
        newLinkedList(
            DUMMY_NODES_OVER,
            DUMMY_NODES_UNDER,
            DUMMY_NODES_EQUAL
        ), DUMMY_NODES_OVER).setCategory(MODEL_ORDER_CATEGORY)
        
    public static val SynthesisOption NODE_CM_INFLUENCE = SynthesisOption::createRangeOption(LabelShorteningHook, "Node Order Crossing Influence",
        0, 150, 1, 0).setCategory(MODEL_ORDER_CATEGORY)
    public static val SynthesisOption PORT_CM_INFLUENCE = SynthesisOption::createRangeOption(LabelShorteningHook, "Port Order Crossing Influence",
        0, 150, 1, 0).setCategory(MODEL_ORDER_CATEGORY)
        
    public static val SynthesisOption MODEL_ORDER_CYCLE_BREAKER = SynthesisOption::createCheckOption(
        ModelOrderSynthesisHook, "Model Order Cycle Breaker",
        false).setCategory(MODEL_ORDER_CATEGORY)
    
    override getDisplayedSynthesisOptions() {
        return newLinkedList(ModelOrderSynthesisHook.MODEL_ORDER_STRATEGY_SELECTION, NODE_CM_INFLUENCE,
            PORT_CM_INFLUENCE, MODEL_ORDER_CYCLE_BREAKER, MODEL_ORDER_LONG_EDGE_STRATEGY
        );
    }
    
    override finish(Scope scope, KNode node) {
    }
    
    override processRegion(Region region, KNode node) {
        switch (ModelOrderSynthesisHook.MODEL_ORDER_STRATEGY_SELECTION.objectValue) {
            case NONE:
                node.setProperty(LayeredOptions.CONSIDER_MODEL_ORDER_STRATEGY, OrderingStrategy.NONE)
            case V: {
                node.setProperty(LayeredOptions.CONSIDER_MODEL_ORDER_STRATEGY, OrderingStrategy.NODES_AND_EDGES)
                node.setProperty(LayeredOptions.CONSIDER_MODEL_ORDER_CROSSING_COUNTER_NODE_INFLUENCE, NODE_CM_INFLUENCE.intValue / 100.0)
                node.setProperty(LayeredOptions.CONSIDER_MODEL_ORDER_CROSSING_COUNTER_PORT_INFLUENCE, PORT_CM_INFLUENCE.intValue / 100.0)
            }
            case E: {
                node.setProperty(LayeredOptions.CONSIDER_MODEL_ORDER_STRATEGY, OrderingStrategy.PREFER_EDGES)
                node.setProperty(LayeredOptions.CONSIDER_MODEL_ORDER_CROSSING_COUNTER_NODE_INFLUENCE, NODE_CM_INFLUENCE.intValue / 100.0)
                node.setProperty(LayeredOptions.CONSIDER_MODEL_ORDER_CROSSING_COUNTER_PORT_INFLUENCE, PORT_CM_INFLUENCE.intValue / 100.0)
            }
            default:
                node.setProperty(LayeredOptions.CONSIDER_MODEL_ORDER_STRATEGY, OrderingStrategy.NONE)
        }
        switch (ModelOrderSynthesisHook.MODEL_ORDER_LONG_EDGE_STRATEGY.objectValue) {
            case DUMMY_NODES_EQUAL:
                node.setProperty(LayeredOptions.CONSIDER_MODEL_ORDER_LONG_EDGE_STRATEGY, LongEdgeOrderingStrategy.EQUAL)
            case DUMMY_NODES_OVER:
                node.setProperty(LayeredOptions.CONSIDER_MODEL_ORDER_LONG_EDGE_STRATEGY, LongEdgeOrderingStrategy.DUMMY_NODE_OVER)
            case DUMMY_NODES_UNDER:
                node.setProperty(LayeredOptions.CONSIDER_MODEL_ORDER_LONG_EDGE_STRATEGY, LongEdgeOrderingStrategy.DUMMY_NODE_UNDER)
            default:
                node.setProperty(LayeredOptions.CONSIDER_MODEL_ORDER_LONG_EDGE_STRATEGY, LongEdgeOrderingStrategy.DUMMY_NODE_UNDER)
        }
        if (ModelOrderSynthesisHook.MODEL_ORDER_CYCLE_BREAKER.booleanValue) {
            node.setProperty(LayeredOptions.CYCLE_BREAKING_STRATEGY, CycleBreakingStrategy.MODEL_ORDER)
        }
    }
    
}
