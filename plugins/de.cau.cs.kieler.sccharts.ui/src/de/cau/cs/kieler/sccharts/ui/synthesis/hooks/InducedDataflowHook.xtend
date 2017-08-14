/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import com.google.common.collect.HashMultimap
import com.google.common.collect.Iterators
import com.google.common.collect.Maps
import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KLayoutData
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.SCChartsDiagramProperties
import java.util.Collections
import java.util.HashMap
import java.util.Iterator
import java.util.Set
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

/**
 * Visualizes the dataflow between SCChart regions.
 * 
 * @author nbw
 */
class InducedDataflowHook extends SynthesisActionHook {

    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions
    @Inject extension KLabelExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension SCChartsStateExtensions

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.InducedDataflowHook";
    /** Job name */
    public static final String JOB_NAME = "Calculating Dataflow";
    /** The related synthesis option */
    public static final SynthesisOption SHOW_DATAFLOW = SynthesisOption.createCheckOption("Show Induced Dataflow",
        false).setCategory(GeneralSynthesisOptions::APPEARANCE).setUpdateAction(InducedDataflowHook.ID); // Add this action as updater
    /** Property to store analysis results */
    private static final IProperty<Set<KEdge>> DATAFLOW_EDGES = new Property<Set<KEdge>>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.dataflow.edges", null);

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_DATAFLOW);
    }

    override finish(Scope model, KNode rootNode) {
        if (SHOW_DATAFLOW.booleanValue) {
            rootNode.showDependencies(model);
        }
    }

    override executeAction(KNode rootNode) {
        if (SHOW_DATAFLOW.booleanValue) {
            rootNode.showDependencies(usedContext.inputModel);
        } else {
            rootNode.hideDependencies;
        }
        return ActionResult.createResult(true);
    }

    /** 
     * Hide the dependency edges
     */
    private def hideDependencies(KNode rootNode) {
        val propertyHolder = rootNode.data.filter(KLayoutData).head;
        val edges = propertyHolder?.getProperty(DATAFLOW_EDGES);
        if (edges !== null) {
            val viewer = usedContext.viewer;
            edges.forEach[viewer.hide(it)];
        }
    }

    /* ===============
     * ADDING DEPENDENCIES
     * ===============
     */

    /** 
     * Infer the dataflow between regions of superstates. This is only possible for
     * models passed as {@code SCCharts} or as {@code State}.
     */
    private def void showDependencies(KNode rootNode, Object model) {
        // Ensure a valid input model
        if (model instanceof State) {
            showDependencies(rootNode, model as State);
        } else if (model instanceof SCCharts) {
            for (State rootState : (model as SCCharts).rootStates) {
                showDependencies(rootNode, rootState);
            }
        } else {
            throw new IllegalArgumentException("Cannot perform dataflow analysis on models other than sccharts");
        }
    }

    /**
     * Infer the dataflow in the model, given by the root state.
     */
    private def void showDependencies(KNode rootNode, State rootState) {
        // Check if we already have dataflow edges.
        // TODO Can these already exist but be invalid due to incremental update?
        // Maybe just clean the existing set and do a new analysis. 
        val edges = rootNode.getProperty(DATAFLOW_EDGES);
        if (edges !== null) {
            // Edges exist already
            val viewer = usedContext.viewer;
            rootNode.hideDependencies;
            edges.forEach[viewer.show(it)];
            return;
        }

        // No edges present yet, do the full analysis
        // Get the model tracking between model elements and diagram elements
        val tracking = rootNode.getProperty(SCChartsDiagramProperties::MODEL_TRACKER);
        if (tracking === null) {
            throw new IllegalArgumentException("Missing source model tracker");
        }

        // Prepare maps to know which ValuedObjects are written or read in each state
        val HashMultimap<Scope, ValuedObject> readObjects = HashMultimap.create
        val HashMultimap<Scope, ValuedObject> writtenObjects = HashMultimap.create

        // Prepare set for all created edges to be able to hide these
        val Set<KEdge> createdEdges = Sets.newHashSet

        // We traverse the model postfix dfs, so we have all used valued objects
        // in the child states available when performing the analysis of the parent state
        for (State currState : getPostfixDFSIterator(rootState).toIterable) {

            // For all states we need to make sure to account for actions on the state
            for (Action action : currState.actions) {
                addValuedObjectsOfActions(currState, action, readObjects, writtenObjects);
            }

            if (currState.isHierarchical) {
                // For hierarchical states we assume that we have all usages of childstates already
                // calculated and only need to take care of the actions and transitions in this state
                // TODO This only works for control flow at the moment
                for (ControlflowRegion region : currState.regions.filter(ControlflowRegion)) {
                    for (State state : region.states) {
                        // Store the already known child dependencies
                        readObjects.putAll(region, readObjects.get(state))
                        writtenObjects.putAll(region, writtenObjects.get(state))
                        // While already going along here, store the transitions
                        state.outgoingTransitions.forEach [ trans |
                            addValuedObjectsOfActions(region, trans, readObjects, writtenObjects)
                        ]
                    }
                    readObjects.putAll(currState, readObjects.get(region))
                    writtenObjects.putAll(currState, writtenObjects.get(region))
                    // We could add the edges and ports here, if ELK would already 
                    // support proper hyperedges. For now we just store the data and create edges later
                }
            }
        }

        // Data has been assembled and now we can draw the edges
        createDataflowHyperedges(rootState, writtenObjects, readObjects, tracking, createdEdges);
        
        // Store the created edges in the model to be able to hide these again.
        rootNode.setProperty(DATAFLOW_EDGES, createdEdges)
    }

    /**
     * Create a dataflow hyperedge for each signal flowing between concurrent regions. All the "producing" and the 
     * "consuming" regions are attached to that hyperedge. 
     */
    def createDataflowHyperedges(State scc, HashMultimap<Scope, ValuedObject> writtenObjects,
        HashMultimap<Scope, ValuedObject> readObjects, SourceModelTrackingAdapter tracking, Set<KEdge> createdEdges) {
        // We need to assemble all the relevant valued objects in one region. 
        // Relevant valued objects are these that are incoming in one region 
        // and outgoing in another concurrent region.
        // Start with all regions that have some written objects
        val HashMap<Pair<Region, ValuedObject>, KPort> targetPorts = Maps.newHashMap;
        val HashMap<Pair<Region, ValuedObject>, KPort> sourcePorts = Maps.newHashMap;
        writtenObjects.keySet.filter(Region).forEach [ writtenRegion |
            writtenObjects.get(writtenRegion).forEach [ writtenObject |
                // We want to find all adjacent regions that read the same VO
                readObjects.keySet.filter(Region).filter [
                    writtenRegion.parentState.regions.contains(it)
                ].filter [
                    !writtenRegion.equals(it)
                ].forEach [ readRegion |
                    readObjects.get(readRegion).filter [ readObject |
                        writtenObject.equals(readObject)
                    ].forEach [ readObject |
                        // Create a source port that is reused for every edge from here
                        val sourcePair = new Pair(writtenRegion, readObject)
                        if (!sourcePorts.containsKey(sourcePair)) {
                            val KPort sourcePort = createPort => [
                                node = tracking.getTargetElements(writtenRegion).filter(KNode).head;
                            ]
                            sourcePort.addOutsidePortLabel(
                                writtenObject.name
                            );
                            sourcePorts.put(sourcePair, sourcePort)
                        }

                        // Create a target port if needed and store it for other sources
                        val targetPair = new Pair(readRegion, readObject)
                        if (!targetPorts.containsKey(targetPair)) {
                            targetPorts.put(targetPair, createPort => [
                                node = tracking.getTargetElements(readRegion).filter(KNode).head;
                            ])
                        }
                        // Create an edge for this dependency
                        val KEdge edge = createEdge => [
                            it.sourcePort = sourcePorts.get(sourcePair);
                            it.source = sourcePort.node;
                            it.targetPort = targetPorts.get(targetPair);
                            it.target = it.targetPort.node;
                            it.addPolyline => [
                                it.lineWidth = 1
                                // Default arrow head
                                it.addHeadArrowDecorator
                                // Junction points because of hyperedges
                                it.addJunctionPointDecorator
                            ];
                        ]
                        
                        createdEdges.add(edge);

                        // Set layout on the parent state
                        val parentNode = edge.source.parent;
                        DiagramSyntheses.setLayoutOption(parentNode, CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
                        DiagramSyntheses.setLayoutOption(parentNode, CoreOptions::PORT_CONSTRAINTS,
                            PortConstraints.FREE)
                        if (edge.source.getProperty(CoreOptions::DIRECTION) == Direction.DOWN) {
                            DiagramSyntheses.setLayoutOption(parentNode, CoreOptions::DIRECTION, Direction.LEFT)
                        } else {
                            DiagramSyntheses.setLayoutOption(parentNode, CoreOptions::DIRECTION, Direction.DOWN)
                        }
                        // Configure source and target layout constraints
                        DiagramSyntheses.setLayoutOption(edge.source, CoreOptions::PORT_CONSTRAINTS,
                            PortConstraints.FREE)
                        DiagramSyntheses.setLayoutOption(edge.target, CoreOptions::PORT_CONSTRAINTS,
                            PortConstraints.FREE)
                        DiagramSyntheses.setLayoutOption(edge.source, CoreOptions::NODE_SIZE_CONSTRAINTS,
                            SizeConstraint.free)
                        DiagramSyntheses.setLayoutOption(edge.target, CoreOptions::NODE_SIZE_CONSTRAINTS,
                            SizeConstraint.free)
                    ]
                ]
            ]
        ]
    }

    /* =============
     * UTILITY METHODS
     * =============
     */

    def addValuedObjectsOfActions(Scope scope, Action action, HashMultimap<Scope, ValuedObject> readObjects,
        HashMultimap<Scope, ValuedObject> writtenObjects) {
        // Here we need to do the magic and find out which ValuedObjects are read and which are written
        // The trigger should not have any side effect so it will only be a read access
        // TODO Make sure this is a valid assumption
        // So we take all ValuedObjects from the trigger and just take these
        if (action.trigger !== null) {
            if (action.trigger instanceof ValuedObjectReference) {
                readObjects.put(scope, (action.trigger as ValuedObjectReference).valuedObject);
            } else {
                action.trigger.eAllContents.filter(ValuedObjectReference).forEach [
                    readObjects.put(scope, it.valuedObject);
                ]
            }
        }

        // The effect is a bit more complicated, it could be an assignment, 
        // an emission or something else that we don't care in
        // TODO Make sure there is nothing else we are interested in
        action.effects.forEach [ effect |
            if (effect instanceof Emission) {
                val emission = effect as Emission;
                // Store the emitted object as written
                writtenObjects.put(scope, emission.valuedObject);
                // Store the parts of the value as read object
                if (emission.newValue instanceof ValuedObjectReference) {
                    readObjects.put(scope, (emission.newValue as ValuedObjectReference).valuedObject);
                } else {
                    if (emission.newValue !== null) {
                        emission.newValue.eAllContents.filter(ValuedObjectReference).forEach [
                            readObjects.put(scope, it.valuedObject);
                        ]
                    }
                }
            } else if (effect instanceof Assignment) {
                val assignment = effect as Assignment;
                // Store the target as written
                writtenObjects.put(scope, assignment.valuedObject);
                // Store the parts of the value as read object
                if (assignment.expression instanceof ValuedObjectReference) {
                    readObjects.put(scope, (assignment.expression as ValuedObjectReference).valuedObject);
                } else {
                    if (assignment.expression !== null) {
                        assignment.expression?.eAllContents.filter(ValuedObjectReference).forEach [
                            readObjects.put(scope, it.valuedObject);
                        ]
                    }
                }
            }
        ]
    }

    private def Iterator<State> getPostfixDFSIterator(State state) {
        if (state.isHierarchical) {
            var Iterator<State> iterator = Collections.emptyIterator
            for (region : state.regions.filter(ControlflowRegion)) {
                for (childState : region.states) {
                    iterator = Iterators.concat(iterator, getPostfixDFSIterator(childState))
                }
            }
            return Iterators.concat(iterator, Iterators.singletonIterator(state));
        } else {
            return Iterators.singletonIterator(state);
        }
    }
}
