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

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SynthesisHook
import de.cau.cs.kieler.sccharts.s.DependencyTransformation
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions

/**
 * Shows priority label of the priority based compilation.
 * FIXME Unfinished
 * TODO Move this class to de.cau.cs.kieler.sccharts.s
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
 @ViewSynthesisShared
class PrioritybasedCompilationHook extends SynthesisHook {

    @Inject extension SCChartsScopeExtensions
    @Inject extension DependencyTransformation

    // Options
    public static final SynthesisOption SHOW_DEPENDENCIES = SynthesisOption.createCheckOption(
        "Dependencies && optimized priorities", false);

    public static final SynthesisOption SHOW_ORDER = SynthesisOption.createCheckOption(
        "Dependencies && priorities", false);
        
    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_DEPENDENCIES, SHOW_ORDER);
    }

    private var dependencyGraph = null;

    override processState(State state, KNode node) {
        if (SHOW_ORDER.booleanValue || SHOW_DEPENDENCIES.booleanValue) {
            if (dependencyGraph == null) {

                // Calculate only once
                dependencyGraph = state.getRootState.getDependencyGraph
            }
        }
// general states
//                var priority = ""
//                if (SHOW_ORDER.booleanValue || SHOW_DEPENDENCIES.booleanValue) {
//                    if (!dependencyGraph.dependencyNodes.filter(e|e.getState == s && !e.getIsJoin).nullOrEmpty) {
//                        val dependencyNode = dependencyGraph.dependencyNodes.filter(
//                            e |
//                                e.getState == s && !e.getIsJoin
//                            ).get(0)
//                            priority = if (SHOW_DEPENDENCIES.booleanValue)
//                                dependencyNode.getPriority + ""
//                            else
//                                (dependencyNode.getOrder) + ""
//                            if (s.hasInnerStatesOrControlflowRegions || s.hasInnerActions) {
//                                if (!dependencyGraph.dependencyNodes.filter(e|e.getState == s && e.getIsJoin).
//                                    nullOrEmpty) {
//                                    val dependencyNodeJoin = dependencyGraph.dependencyNodes.filter(
//                                        e |
//                                            e.getState == s && e.getIsJoin
//                                        ).get(0)
//                                        priority = priority + ", " + if (SHOW_DEPENDENCIES.booleanValue)
//                                            dependencyNodeJoin.getPriority + ""
//                                        else
//                                            (dependencyNodeJoin.getOrder) + ""
//
//                                    // priority = priority + ", " + dependencyGraph.dependencyNodes.filter(e|e.getState == s && e.getIsJoin).get(0).getPriority
//                                    }
//                                }
//                                priority = priority + ""
//                            }
//
//                            for (dependency : dependencyGraph.dependencies.filter[stateToDependOn.getState == s].
//                                toList) {
//                                if (dependency instanceof DataDependency) {
//
//                                    // val join1 = if (dependency.stateDepending.getIsJoin) "j" else ""
//                                    // val join2 = if (dependency.stateToDependOn.getIsJoin) "j" else ""
//                                    // System.out.println("Dependency: " + dependency.stateDepending.getState.id + join1 + "-->" + dependency.stateToDependOn.getState.id + join2)
//                                    s.createEdge() => [ edge |
//                                        edge.target = dependency.stateDepending.getState.node;
//                                        edge.source = dependency.stateToDependOn.getState.node;
//                                        // edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
//                                        edge.setLayoutOption(LayoutOptions::NO_LAYOUT, false);
//                                        edge.addPolyline(3) => [
//                                            it.setForeground("blue".color)
//                                            it.addArrowDecorator()
//                                        ];
//                                    ];
//                                }
//                            }
//
//                        }
//                        val priorityToShow = priority
//                        val prioritySpace = if(priorityToShow.length > 0) "  " else " "

// Macro States
//                                        if (priorityToShow.length > 0) {
//                                            val estimatedWidth = PlacementUtil.estimateTextSize(ktext).width
//                                            it.addText(priorityToShow) =>
//                                                [
//                                                    it.fontSize = 9;
//                                                    it.setFontBold(true);
//                                                    if (SHOW_DEPENDENCIES.booleanValue) {
//                                                        it.setForeground("blue".color)
//                                                    } else {
//                                                        it.setForeground("red".color)
//                                                    }
//                                                    it.setGridPlacementData().from(LEFT, estimatedWidth + 12, 0, TOP,
//                                                        15f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
//                                                ];
//                                        }

// Normal states
//                            if (priorityToShow.length > 0) {
//                                val estimatedWidth = PlacementUtil.estimateTextSize(ktext).width
//                                it.addText(priorityToShow) =>
//                                    [
//                                        it.fontSize = 9;
//                                        it.setFontBold(true);
//                                        if (SHOW_DEPENDENCIES.booleanValue) {
//                                            it.setForeground("blue".color)
//                                        } else {
//                                            it.setForeground("red".color)
//                                        }
//                                        it.setGridPlacementData().from(LEFT, estimatedWidth + 6, 0, TOP, 15f, 0).to(
//                                            RIGHT, 8, 0, BOTTOM, 8, 0);
//                                    ]
//                            }
    }
}