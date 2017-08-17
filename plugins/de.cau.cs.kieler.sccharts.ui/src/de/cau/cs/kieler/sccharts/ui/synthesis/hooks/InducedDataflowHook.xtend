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
import com.google.common.collect.Multimap
import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KGraphElement
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
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
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.SCChartsDiagramProperties
import de.cau.cs.kieler.sccharts.ui.synthesis.StateSynthesis
import java.util.Collection
import java.util.Collections
import java.util.EnumSet
import java.util.Iterator
import java.util.Set
import org.eclipse.elk.alg.layered.properties.LayeredOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortSide
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property
import de.cau.cs.kieler.kicool.ui.synthesis.updates.MessageObjectReferencesManager

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
    @Inject extension KNodeExtensions

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.InducedDataflowHook";

    /** Job name */
    public static final String JOB_NAME = "Calculating Dataflow";

    /** The related synthesis option */
    public static final SynthesisOption SHOW_DATAFLOW = SynthesisOption.createCheckOption("Show Induced Dataflow",
        false).setCategory(GeneralSynthesisOptions::APPEARANCE).setUpdateAction(InducedDataflowHook.ID);

    /** Property to store analysis results */
    private static final IProperty<Set<KGraphElement>> DATAFLOW_ELEMENTS = new Property<Set<KGraphElement>>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.dataflow.elements", null);

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
        val edges = rootNode.getProperty(DATAFLOW_ELEMENTS);
        if (edges !== null) {
            val viewer = usedContext.viewer;
            edges.forEach [
                viewer.hide(it)
                if (it instanceof KEdge) {                    
                    viewer.hide(it.sourcePort)
                    viewer.hide(it.targetPort)
                    StateSynthesis.configureLayout(it.source.parent)
                }
            ];
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
        val edges = rootNode.getProperty(DATAFLOW_ELEMENTS);
        if (edges !== null) {
            // Edges exist already
            val viewer = usedContext.viewer
            rootNode.hideDependencies;
            edges.forEach [
                if (it instanceof KEdge) {                    
                    configureParentLayout(it.source.parent)
                    viewer.show(it.sourcePort)
                    viewer.show(it.targetPort)
                }
                viewer.show(it)
            ];
            return;
        }
        // Prepare set for all created edges to be able to hide these
        val Set<KGraphElement> createdElements = Sets.newHashSet

        // No edges present yet, do the full analysis
        // Get the model tracking between model elements and diagram elements
        val tracking = rootNode.getProperty(SCChartsDiagramProperties::MODEL_TRACKER)
        if (tracking === null) {
            throw new IllegalArgumentException("Missing source model tracker")
        }

        // Prepare maps to know which ValuedObjects are written or read in each state
        val Multimap<State, ValuedObject> readStates = HashMultimap.create
        val Multimap<State, ValuedObject> preReadStates = HashMultimap.create
        val Multimap<State, ValuedObject> writeStates = HashMultimap.create

        // We traverse the model postfix dfs, so we have all used valued objects
        // in the child states available when performing the analysis of the parent state
        for (State currState : getPostfixDFSIterator(rootState).toIterable) {
            // For all states we need to make sure to account for actions on the state
            for (Action action : currState.actions) {
                addValuedObjectsOfActions(action, readStates.get(currState), preReadStates.get(currState),
                    writeStates.get(currState))
            }

            if (currState.regions.filter(ControlflowRegion).size > 0) {
                // Prepare maps to know which ValuedObjects are written or read in each state
                val Multimap<Region, ValuedObject> readRegions = HashMultimap.create
                val Multimap<Region, ValuedObject> preReadRegions = HashMultimap.create
                val Multimap<Region, ValuedObject> writeRegions = HashMultimap.create

                // For hierarchical states we assume that we have all usages of childstates already
                // calculated and only need to take care of the actions and transitions in this state
                // TODO This only works for control flow at the moment
                for (ControlflowRegion region : currState.regions.filter(ControlflowRegion)) {
                    for (State state : region.states) {
                        // Store the known child dependencies for the region
                        readRegions.putAll(region, readStates.get(state))
                        preReadRegions.putAll(region, preReadStates.get(state))
                        writeRegions.putAll(region, writeStates.get(state))

                        // While going along here, store the transition values for all states in the region
                        state.outgoingTransitions.forEach [ trans |
                            addValuedObjectsOfActions(trans, readRegions.get(region), preReadRegions.get(region),
                                writeRegions.get(region))
                        ]
                    }
                    // Store everything we found in the region in the parent state map
                    readStates.putAll(currState, readRegions.get(region))
                    preReadStates.putAll(currState, preReadRegions.get(region))
                    writeStates.putAll(currState, writeRegions.get(region))
                }

                // Draw the edges for all the regions in the current state
                createDataflowHyperedges(currState, readRegions, preReadRegions, writeRegions, tracking, createdElements)
            }
        }
        rootNode.setProperty(DATAFLOW_ELEMENTS, createdElements)
    }

    /**
     * Create a dataflow hyperedge for each signal flowing between concurrent regions. All the "producing" and the 
     * "consuming" regions are attached to that hyperedge. 
     */
    def createDataflowHyperedges(State state, Multimap<Region, ValuedObject> reads,
        Multimap<Region, ValuedObject> preReads, Multimap<Region, ValuedObject> writes,
        SourceModelTrackingAdapter tracking, Set<KGraphElement> createdElements) {
        // We search for all VOs that are read and also written in this hierarchy
        val Set<ValuedObject> relevantVOs = Sets.newHashSet
        writes.asMap.forEach [ writeRegion, writeVOs |
            writeVOs.forEach [ writeVO |
                // Search in the pre reads for the current VO in a different region
                preReads.asMap.filter [ preReadRegion, preReadVOs |
                    !writeRegion.equals(preReadRegion) && preReadVOs.contains(writeVO)
                ].forEach[preReadRegion, preReadVOs|relevantVOs.add(writeVO)]
                // Search in the normal reads for the current VO in a different region
                reads.asMap.filter[readRegion, readVOs|!writeRegion.equals(readRegion) && readVOs.contains(writeVO)].
                    forEach[readRegion, readVOs|relevantVOs.add(writeVO)]
            ]
        ]

        // Each valued object will be handled by a hyperedge 
        for (ValuedObject vo : relevantVOs) {
            val Set<KPort> readPorts = Sets.newHashSet
            reads.asMap.filter[region, VOs|VOs.contains(vo)].forEach [ region, VOs |
                val KPort port = createPort => [
                    node = tracking.getTargetElements(region).filter(KNode).head
                ]
                port.addLayoutParam(CoreOptions::PORT_SIDE, PortSide::WEST)
                readPorts.add(port)
            ]
            val Set<KPort> preReadPorts = Sets.newHashSet
            preReads.asMap.filter[region, VOs|VOs.contains(vo)].forEach [ region, VOs |
                val KPort port = createPort => [
                    node = tracking.getTargetElements(region).filter(KNode).head
                ]
                port.addLayoutParam(CoreOptions::PORT_SIDE, PortSide::WEST)
                preReadPorts.add(port)
            ]
            val Set<KPort> writePorts = Sets.newHashSet
            writes.asMap.filter[region, VOs|VOs.contains(vo)].forEach [ region, VOs |
                val KPort port = createPort => [
                    node = tracking.getTargetElements(region).filter(KNode).head
                ]
                port.addLayoutParam(CoreOptions::PORT_SIDE, PortSide::EAST)
                port.addOutsidePortLabel(vo.name)
                writePorts.add(port)
            ]

            var KNode preNode
            var KPort preNodeReadPort
            var KPort preNodeWritePort

            for (KPort writePort : writePorts) {
                // Create an edge for every normal reader that is not the current writer
                readPorts.filter[readPort|!readPort.node.equals(writePort.node)].forEach[readPort |
                    val KEdge edge = createDataflowEdge(writePort, readPort, 5)
                    createdElements.add(edge);

                    // This leaves a mark on the edge, so that succeeding processors find it.
                    // TODO Implement better mechanism than name matching.
                    edge.setProperty(MessageObjectReferencesManager.MESSAGE_OBJECT_REFERENCE, vo.name)
                    
                    // Configure source and target layout constraints
                    configurePortLayout(writePort.node)
                    configurePortLayout(readPort.node)
                ]
                
                // Create an edge to the preNode if there is at least one pre Reader
                if (!preReadPorts.filter[preReadPort|!preReadPort.node.equals(writePort.node)].empty) {
                    if (preNode === null) {
                        preNode = createPreNode(vo)
                        createdElements.add(preNode)
                        writePort.node.parent.children.add(preNode)
                        preNodeReadPort = createPort
                        preNodeReadPort.node = preNode
                        preNodeReadPort.addLayoutParam(CoreOptions::PORT_SIDE, PortSide.WEST)
                        preNodeWritePort = createPort
                        preNodeWritePort.node = preNode
                        preNodeWritePort.addLayoutParam(CoreOptions::PORT_SIDE, PortSide.EAST)                        
                        preNodeWritePort.addOutsidePortLabel("pre(" + vo.name + ")")
                    }
                    val KEdge edge = createDataflowEdge(writePort, preNodeReadPort, 0)
                    createdElements.add(edge)
                    
                    configurePortLayout(writePort.node)
                }
            }
            if (preNode !== null) {
                // Create an edge from the preNode to every reader
                for (KPort preReadPort : preReadPorts) {
                    val KEdge edge = createDataflowEdge(preNodeWritePort, preReadPort, 10)
                    createdElements.add(edge);

                    configurePortLayout(preReadPort.node)
                    
                }
            }
        }
    }

    /* =============
     * UTILITY METHODS
     * =============
     */
    private def void configureParentLayout(KNode node) {
        DiagramSyntheses.setLayoutOption(node, CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
        DiagramSyntheses.setLayoutOption(node, CoreOptions::DIRECTION, Direction.RIGHT)
    }

    private def void configurePortLayout(KNode node) {
        DiagramSyntheses.setLayoutOption(node, CoreOptions::PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
        DiagramSyntheses.setLayoutOption(node, CoreOptions::NODE_SIZE_CONSTRAINTS, SizeConstraint.free)
    }

    private def KEdge createDataflowEdge(KPort sourcePort, KPort targetPort, int priority) {
        val KEdge edge = createEdge => [
            it.sourcePort = sourcePort;
            it.source = sourcePort.node;
            it.targetPort = targetPort;
            it.target = targetPort.node;
            it.addPolyline => [
                it.lineWidth = 1
                // Default arrow head
                it.addHeadArrowDecorator
                // Junction points because of hyperedges
                it.addJunctionPointDecorator
            ];
        ]
        
        edge.addLayoutParam(LayeredOptions::PRIORITY_DIRECTION, priority);
        
        configureParentLayout(edge.source.parent)

        return edge
    }

    private def KNode createPreNode(ValuedObject vo) {
        val preNode = createNode => [ node |
            node.addRectangle
            node.width = 40
            node.height = 40
        ]
        preNode.addInsideCenteredNodeLabel("pre")
        preNode.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
        preNode.addLayoutParam(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.PORTS,SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS))
        
        return preNode
    }

    private def addValuedObjectsOfActions(Action action, Collection<ValuedObject> reads,
        Collection<ValuedObject> preReads, Collection<ValuedObject> writes) {
        // Here we need to do the magic and find out which ValuedObjects are read and which are written
        // The trigger should not have any side effect so it will only be a read access
        // TODO Make sure this is a valid assumption
        // So we take all ValuedObjects from the trigger and just take these
        collectReadAccessFromExpression(action.trigger, reads, preReads, null)

        // The effect is a bit more complicated, it could be an assignment, 
        // an emission or something else that we don't care in
        // TODO Make sure there is nothing else we are interested in
        action.effects.forEach [ effect |
            if (effect instanceof Emission) {
                val emission = effect as Emission;
                // Store the emitted object as written
                writes.add(emission.valuedObject);
                // Store the parts of the value as read object
                collectReadAccessFromExpression(emission.newValue, reads, preReads, emission.valuedObject)
            } else if (effect instanceof Assignment) {
                val assignment = effect as Assignment;
                // Store the target as written
                writes.add(assignment.valuedObject);
                // Store the parts of the value as read object
                collectReadAccessFromExpression(assignment.expression, reads, preReads, assignment.valuedObject)
            }
        ]
    }

    /**
     * Collects the {@code ValuedObjects} read in the given expression and stores these in the map,
     * using {@code scope} as the key. 
     */
    private def collectReadAccessFromExpression(Expression expression, Collection<ValuedObject> reads,
        Collection<ValuedObject> preReads, ValuedObject excludedVO) {
        if (expression !== null) {
            Iterators.concat(Iterators.singletonIterator(expression), expression.eAllContents).filter(
                ValuedObjectReference).filter[!it.valuedObject.equals(excludedVO)].forEach [
                if (it.eContainer instanceof OperatorExpression &&
                    (it.eContainer as OperatorExpression).operator == OperatorType.PRE) {
                    preReads.add(it.valuedObject)
                } else {
                    reads.add(it.valuedObject)
                }
            ]
        }
    }

    /**
     * Creates an {@code Iterator} that traverses all states contained in {@code rootState} as well as 
     * {@code rootState} itself in a postfix depth-first-search order.   
     */
    private def Iterator<State> getPostfixDFSIterator(State rootState) {
        val Iterator<State> iterator = rootState.regions.filter(ControlflowRegion).fold(
            Collections.emptyIterator,
            [ iter, region |
                region.states.fold(iter, [ currIter, currState |
                    Iterators.concat(currIter, getPostfixDFSIterator(currState))
                ])
            ]
        )
        return Iterators.concat(iterator, Iterators.singletonIterator(rootState));
    }
}
