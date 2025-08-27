/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2022 by
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
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import org.eclipse.elk.alg.layered.options.CrossingMinimizationStrategy
import org.eclipse.elk.alg.layered.options.CycleBreakingStrategy
import org.eclipse.elk.alg.layered.options.GreedySwitchType
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.alg.layered.options.OrderingStrategy

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Sets the model order configuration on the diagram.
 * 
 * @author sdo
 * 
 */
@ViewSynthesisShared
class ModelOrderHook extends SynthesisHook {
    
    private static String TIE_BREAKER = "Tie-Breaker"
    private static String FULL_CONTROL_EDGES = "Full Control"
    
    /** The related synthesis option */
    public static final SynthesisOption MODEL_ORDER = SynthesisOption.createChoiceOption(
        ModelOrderHook,
        "Model Order", #[TIE_BREAKER, FULL_CONTROL_EDGES], TIE_BREAKER).
        setCategory(GeneralSynthesisOptions::LAYOUT);

    override getDisplayedSynthesisOptions() {
        return newLinkedList(MODEL_ORDER);
    }

    override processRegion(Region region, KNode node) {
        if (region instanceof ControlflowRegion) {
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
                case TIE_BREAKER: {
                    // Enforce model order during cycle breaking.
                    node.setLayoutOption(LayeredOptions.CYCLE_BREAKING_STRATEGY, CycleBreakingStrategy.MODEL_ORDER)
                    // Presort nodes and edges before crossing minimization.
                    node.setLayoutOption(LayeredOptions.CONSIDER_MODEL_ORDER_STRATEGY, OrderingStrategy.PREFER_EDGES)
                    // Always use the best ordered solution that was tried.
                    node.setLayoutOption(LayeredOptions.CONSIDER_MODEL_ORDER_CROSSING_COUNTER_PORT_INFLUENCE, 0.01)
                    node.setLayoutOption(LayeredOptions.CONSIDER_MODEL_ORDER_CROSSING_COUNTER_NODE_INFLUENCE, 0.01)
                }
                default: {
                    
                }
            }
        }
    }
    
}