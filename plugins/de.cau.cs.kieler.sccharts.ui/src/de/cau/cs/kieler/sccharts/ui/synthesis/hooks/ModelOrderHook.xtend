/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
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
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import org.eclipse.elk.alg.layered.options.LayeredOptions

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import org.eclipse.elk.alg.layered.options.CycleBreakingStrategy
import org.eclipse.elk.alg.layered.options.CrossingMinimizationStrategy
import org.eclipse.elk.alg.layered.options.GreedySwitchType
import org.eclipse.elk.alg.layered.options.OrderingStrategy

/**
 * Sets the model order configuration on the diagram.
 * 
 * @author sdo
 * 
 */
@ViewSynthesisShared
class ModelOrderHook extends SynthesisHook {
    
    private static String NONE = "None"
    private static String TRUE_TIE_BREAKER = "True Tie-Breaker"
    private static String TIE_BREAKER = "Tie-Breaker"
    private static String PREFER_EDGES = "Prefer Edge Order"
    private static String PREFER_NODES = "Prefer Node Order"
    private static String ENFORCE_NODES = "Enforce Node Order"
    private static String FULL_CONTROL = "Full Control"
    private static String FULL_CONTROL_EDGES = "Full Control Edges"
    
    /** The related synthesis option */
    public static final SynthesisOption MODEL_ORDER = SynthesisOption.createChoiceOption(
        ModelOrderHook,
        "Model Order", #[NONE, TRUE_TIE_BREAKER, TIE_BREAKER, PREFER_EDGES, PREFER_NODES, ENFORCE_NODES, FULL_CONTROL, FULL_CONTROL_EDGES], PREFER_EDGES).
        setCategory(GeneralSynthesisOptions::LAYOUT);

    override getDisplayedSynthesisOptions() {
        return newLinkedList(MODEL_ORDER);
    }

    override processRegion(Region region, KNode node) {
        switch (MODEL_ORDER.objectValue) {
            
            case FULL_CONTROL_EDGES: {
                // Enforce model order during cycle breaking.
                node.setLayoutOption(LayeredOptions.CYCLE_BREAKING_STRATEGY, CycleBreakingStrategy.MODEL_ORDER)
                // Presort nodes and edges before crossing minimization.
                node.setLayoutOption(LayeredOptions.CONSIDER_MODEL_ORDER_STRATEGY, OrderingStrategy.PREFER_EDGES)
                // Do not do crossing minimization.
                node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_STRATEGY, CrossingMinimizationStrategy.NONE)
                node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_GREEDY_SWITCH_TYPE, GreedySwitchType.OFF)
            }
            case FULL_CONTROL: {
                // Enforce model order during cycle breaking.
                node.setLayoutOption(LayeredOptions.CYCLE_BREAKING_STRATEGY, CycleBreakingStrategy.MODEL_ORDER)
                // Presort nodes and edges before crossing minimization.
                node.setLayoutOption(LayeredOptions.CONSIDER_MODEL_ORDER_STRATEGY, OrderingStrategy.NODES_AND_EDGES)
                // Do not do crossing minimization.
                node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_STRATEGY, CrossingMinimizationStrategy.NONE)
                node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_GREEDY_SWITCH_TYPE, GreedySwitchType.OFF)
            }
            case ENFORCE_NODES: {
                // Enforce model order during cycle breaking.
                node.setLayoutOption(LayeredOptions.CYCLE_BREAKING_STRATEGY, CycleBreakingStrategy.MODEL_ORDER)
                // Presort nodes and edges before crossing minimization.
                node.setLayoutOption(LayeredOptions.CONSIDER_MODEL_ORDER_STRATEGY, OrderingStrategy.NODES_AND_EDGES)
                // Do not change node order during crossing minimization.
                node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_FORCE_NODE_MODEL_ORDER, true)
            }
            case PREFER_NODES: {
                // Enforce model order during cycle breaking.
                node.setLayoutOption(LayeredOptions.CYCLE_BREAKING_STRATEGY, CycleBreakingStrategy.MODEL_ORDER)
                // Presort nodes and edges before crossing minimization.
                node.setLayoutOption(LayeredOptions.CONSIDER_MODEL_ORDER_STRATEGY, OrderingStrategy.NODES_AND_EDGES)
                // Weight nodes a little bit more than edges. 1 is as important as 10 node order violations
                node.setLayoutOption(LayeredOptions.CONSIDER_MODEL_ORDER_CROSSING_COUNTER_NODE_INFLUENCE, 0.1)
            }
            case PREFER_EDGES: {
                // Enforce model order during cycle breaking.
                node.setLayoutOption(LayeredOptions.CYCLE_BREAKING_STRATEGY, CycleBreakingStrategy.MODEL_ORDER)
                // Presort nodes and edges before crossing minimization.
                node.setLayoutOption(LayeredOptions.CONSIDER_MODEL_ORDER_STRATEGY, OrderingStrategy.PREFER_EDGES)
                // 1 is as important as 10 edge order violations
                node.setLayoutOption(LayeredOptions.CONSIDER_MODEL_ORDER_CROSSING_COUNTER_PORT_INFLUENCE, 0.1)
            }
            case TIE_BREAKER: {
                // Enforce model order during cycle breaking.
                node.setLayoutOption(LayeredOptions.CYCLE_BREAKING_STRATEGY, CycleBreakingStrategy.MODEL_ORDER)
                // Presort nodes and edges before crossing minimization.
                node.setLayoutOption(LayeredOptions.CONSIDER_MODEL_ORDER_STRATEGY, OrderingStrategy.PREFER_EDGES)
                // Always use the best ordered solution that was tried.
                node.setLayoutOption(LayeredOptions.CONSIDER_MODEL_ORDER_CROSSING_COUNTER_PORT_INFLUENCE, 0.01)
                node.setLayoutOption(LayeredOptions.CONSIDER_MODEL_ORDER_CROSSING_COUNTER_NODE_INFLUENCE, 0.01)
            }
            case TRUE_TIE_BREAKER: {
                // Enforce model order during cycle breaking.
                node.setLayoutOption(LayeredOptions.CYCLE_BREAKING_STRATEGY, CycleBreakingStrategy.GREEDY_MODEL_ORDER)
                // Presort nodes and edges before crossing minimization.
                node.setLayoutOption(LayeredOptions.CONSIDER_MODEL_ORDER_STRATEGY, OrderingStrategy.PREFER_EDGES)
                // Always use the best ordered solution that was tried.
                node.setLayoutOption(LayeredOptions.CONSIDER_MODEL_ORDER_CROSSING_COUNTER_PORT_INFLUENCE, 0.01)
                node.setLayoutOption(LayeredOptions.CONSIDER_MODEL_ORDER_CROSSING_COUNTER_NODE_INFLUENCE, 0.01)
            }
        	case NONE: {
        		
        	}
        	default: {
        		
        	}
        }
    }
    
}