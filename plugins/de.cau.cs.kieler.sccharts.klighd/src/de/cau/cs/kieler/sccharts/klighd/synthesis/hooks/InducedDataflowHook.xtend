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
package de.cau.cs.kieler.sccharts.klighd.synthesis.hooks

import com.google.common.collect.Iterators
import com.google.common.collect.Maps
import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KGraphElement
import de.cau.cs.kieler.klighd.kgraph.KLabel
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.klighd.SCChartsDiagramProperties
import de.cau.cs.kieler.sccharts.klighd.hooks.SynthesisActionHook
import de.cau.cs.kieler.sccharts.klighd.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.klighd.synthesis.StateSynthesis
import java.util.Collection
import java.util.Collections
import java.util.EnumSet
import java.util.Iterator
import java.util.Map
import java.util.Set
import org.eclipse.elk.alg.layered.properties.LayerConstraint
import org.eclipse.elk.alg.layered.properties.LayeredOptions
import org.eclipse.elk.core.options.Alignment
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

/**
 * Visualizes the dataflow between SCChart regions.
 * 
 * @author nbw
 */
class InducedDataflowHook extends SynthesisActionHook {

    private enum IOType {
        None,
        Local,
        All
    }

    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions
    @Inject extension KLabelExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KNodeExtensions
    @Inject extension KContainerRenderingExtensions

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.InducedDataflowHook";

    /** Job name */
    public static final String JOB_NAME = "Calculating Dataflow";

    /** The related synthesis option */
    public static final SynthesisOption SHOW_DATAFLOW = SynthesisOption.createCheckOption("Show Induced Dataflow",
        false).setCategory(GeneralSynthesisOptions::DEBUGGING).setUpdateAction(InducedDataflowHook.ID);
    public static final SynthesisOption SHOW_DATAFLOW_IO = SynthesisOption.createChoiceOption("Show Dataflow I/O",
        newArrayList(IOType.None, IOType.Local, IOType.All), IOType.None).setCategory(
        GeneralSynthesisOptions::DEBUGGING).setUpdateAction(InducedDataflowHook.ID);

    /** Property to store analysis results */
    private static final IProperty<Set<KGraphElement>> DATAFLOW_ELEMENTS = new Property<Set<KGraphElement>>(
        "de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.dataflow.elements", null);

    /** Property to mark the type of write ports */
    private static final IProperty<Boolean> PORT_ABSOLUTE_WRITE = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.dataflow.absolute", false);
        
    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_DATAFLOW, SHOW_DATAFLOW_IO);
    }

    override finish(Scope model, KNode rootNode) {
        if (SHOW_DATAFLOW.booleanValue) {
            rootNode.showDataflow(model);
        }
    }

    override executeAction(KNode rootNode) {
        if (SHOW_DATAFLOW.booleanValue) {
            rootNode.showDataflow(usedContext.inputModel);
        } else {
            rootNode.hideDataflow;
        }
        return ActionResult.createResult(true);
    }

    /** 
     * Hide the dependency edges
     */
    private def hideDataflow(KNode rootNode) {
        val elements = rootNode.getProperty(DATAFLOW_ELEMENTS);
        if (elements !== null) {
            val viewer = usedContext.viewer;
            elements.forEach [
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
     * ADDING
     * ===============
     */
    /** 
     * Infer the dataflow between regions of superstates. This is only possible for
     * models passed as {@code SCCharts} or as {@code State}.
     */
    private def void showDataflow(KNode rootNode, Object model) {
        // Ensure a valid input model
        if (model instanceof State) {
            showDependencies(rootNode, model as State);
        } else {
            throw new IllegalArgumentException("Cannot perform dataflow analysis on models other than sccharts");
        }
    }

    /**
     * Infer the dataflow in the model, given by the root state.
     */
    private def void showDependencies(KNode rootNode, State rootState) {
        // Check if we already have dataflow edges.
        // Just clean the existing set and do a new analysis. 
        val edges = rootNode.getProperty(DATAFLOW_ELEMENTS);
        if (edges !== null) {
            rootNode.hideDataflow;
            edges.clear
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
        val Map<State, AccessContext> accessContexts = Maps.newHashMap

        // We traverse the model postfix dfs, so we have all used valued objects
        // in the child states available when performing the analysis of the parent state
        for (State currState : getPostfixDFSIterator(rootState).toIterable) {
            // For all states we need to make sure to account for actions on the state
            val AccessContext stateAccess = new AccessContext
            accessContexts.put(currState, stateAccess)
            for (Action action : currState.localActions) {
                addValuedObjectsOfActions(action, stateAccess)
            }

            if (currState.regions.filter(ControlflowRegion).size > 0) {
                // Prepare maps to know which ValuedObjects are written or read in each state
                val Map<Region, AccessContext> regionAccesses = Maps.newHashMap

                // For hierarchical states we assume that we have all usages of childstates already
                // calculated and only need to take care of the actions and transitions in this state
                // TODO This only works for control flow at the moment
                for (ControlflowRegion region : currState.regions.filter(ControlflowRegion)) {
                    val AccessContext regionAccess = new AccessContext
                    regionAccesses.put(region, regionAccess)
                    for (State state : region.states) {
                        // Store the known child dependencies for the region
                        regionAccess.copyAll(accessContexts.get(state))
                        // While going along here, store the transition values for all states in the region
                        state.outgoingTransitions.forEach [ trans |
                            addValuedObjectsOfActions(trans, regionAccess)
                        ]
                    }
                    // Store everything we found in the region in the parent state map
                    regionAccess.propagateUp(stateAccess)
                }

                // Draw the edges for all the regions in the current state
                createDataflowHyperedges(currState, regionAccesses, tracking, createdElements)
            }
        }
        rootNode.setProperty(DATAFLOW_ELEMENTS, createdElements)
    }

    /**
     * Create a dataflow hyperedge for each signal flowing between concurrent regions. All the "producing" and the 
     * "consuming" regions are attached to that hyperedge. 
     */
    def createDataflowHyperedges(State state, Map<Region, AccessContext> regionAccesses,
        SourceModelTrackingAdapter tracking, Set<KGraphElement> createdElements) {
        val IOType ioType = usedContext.getOptionValue(SHOW_DATAFLOW_IO) as IOType
        // We search for all VOs that are read and also written in this hierarchy
        val Set<ValuedObject> relevantVOs = Sets.newHashSet
        regionAccesses.forEach [ writeRegion, writeContext |
            writeContext.anyWriteAnywhere.forEach [ writeVO |
                // Search in different regions for a read/preRead access
                regionAccesses.filter [ readRegion, readContext |
                    !writeRegion.equals(readRegion) &&
                        (readContext.readAnywhere.contains(writeVO) || readContext.preReadAnywhere.contains(writeVO))
                ].forEach[k, v|relevantVOs.add(writeVO)]
            ]
        ]

        if (ioType == IOType.All) {
            // Add valued objects to the relevant objects, if they are declared as input or output
            regionAccesses.forEach [ region, context |
                relevantVOs.addAll(context.readAnywhere.filter[(it.eContainer as Declaration).input])
                relevantVOs.addAll(context.preReadAnywhere.filter[(it.eContainer as Declaration).input])
                relevantVOs.addAll(context.anyWriteAnywhere.filter[(it.eContainer as Declaration).output])
            ]
        }

        val Set<ValuedObject> allLocalReads = Sets.newHashSet
        val Set<ValuedObject> allLocalWrites = Sets.newHashSet

        if (ioType == IOType.Local) {
            regionAccesses.forEach [ region, context |
                allLocalReads.addAll(context.readLocal)
                allLocalReads.addAll(context.preReadLocal)
                allLocalWrites.addAll(context.anyWriteLocal)
            ]
            relevantVOs.addAll(allLocalReads)
            relevantVOs.addAll(allLocalWrites)
        }

        // Each valued object will be handled by a hyperedge 
        for (ValuedObject vo : relevantVOs) {
            val Set<KPort> readPorts = Sets.newHashSet
            val Set<KPort> preReadPorts = Sets.newHashSet
            val Set<KPort> writePorts = Sets.newHashSet
            regionAccesses.forEach [ region, context |
                if (context.readAnywhere.contains(vo)) {
                    val KPort port = createPort => [
                        node = tracking.getTargetElements(region).filter(KNode).head
                    ]
                    readPorts.add(port)
                    createdElements.add(port)
                }
                if (context.preReadAnywhere.contains(vo)) {
                    val KPort port = createPort => [
                        node = tracking.getTargetElements(region).filter(KNode).head
                    ]
                    preReadPorts.add(port)
                    createdElements.add(port)
                }
                if (context.absoluteWriteAnywhere.contains(vo)) {
                    val KPort port = createPort => [
                        node = tracking.getTargetElements(region).filter(KNode).head
                    ]
                    port.setProperty(PORT_ABSOLUTE_WRITE, true)
                    
                    val KLabel label = port.addOutsidePortLabel(vo.name)
                    label.getKRendering => [
                        fontSize = 11;
                        fontBold = true;
                    ]
                    writePorts.add(port)
                    createdElements.add(port)
                } else if (context.relativeWriteAnywhere.contains(vo)) {
                    val KPort port = createPort => [
                        node = tracking.getTargetElements(region).filter(KNode).head
                    ]
                    port.setProperty(PORT_ABSOLUTE_WRITE, false)
                    
                    val KLabel label = port.addOutsidePortLabel(vo.name)
                    label.getKRendering => [
                        fontSize = 11;
                        fontBold = true;
                    ]
                    writePorts.add(port)
                    createdElements.add(port)
                }
            ]

            // Create a pre actor if needed
            val KNode preNode = if (!preReadPorts.empty) {
                    val node = createPreNode(vo)
                    createdElements.add(node)
                    preReadPorts.head.node.parent.children.add(node)
                    node
                }
            val KPort preNodeReadPort = if (preNode !== null)
                    createPort => [
                        node = preNode
                    ]
            var KPort preNodeWritePort = if (preNode !== null)
                    createPort => [
                        node = preNode
                        val KLabel label = addOutsidePortLabel("pre(" + vo.name + ")")
                        label.getKRendering => [
                            fontSize = 11;
                            fontBold = true;
                        ]
                        setProperty(PORT_ABSOLUTE_WRITE, true)
                    ]

            // Create an input node if needed
            val boolean ioTypeNeedsInput = ioType == IOType.All ||
                (ioType == IOType.Local && allLocalReads.contains(vo))
            val KNode inputNode = if (ioTypeNeedsInput && !(readPorts.empty && preReadPorts.empty) &&
                    (vo.eContainer as Declaration).input) {
                    val node = createInputNode(vo)
                    createdElements.add(node)
                    Sets.union(readPorts, preReadPorts).head.node.parent.children.add(node)
                    node
                }

            // Create an output node if needed
            val boolean ioTypeNeedsOutput = ioType == IOType.All ||
                (ioType == IOType.Local && allLocalWrites.contains(vo))
            val KNode outputNode = if (ioTypeNeedsOutput && !writePorts.empty &&
                    (vo.eContainer as Declaration).output) {
                    val node = createOutputNode(vo)
                    createdElements.add(node)
                    writePorts.head.node.parent.children.add(node)
                    node
                }

            for (KPort writePort : writePorts) {
                // Create an edge for every normal reader that is not the current writer
                readPorts.filter[readPort|!readPort.node.equals(writePort.node)].forEach [ readPort |
                    val KEdge edge = createDataflowEdge(writePort, readPort, 5, true)
                    createdElements.add(edge);

                    // Add tooltip to edge
                    edge.setProperty(KlighdProperties.TOOLTIP, vo.name)

                    // This leaves a mark on the edge, so that succeeding processors find it.
                    // TODO Implement better mechanism than name matching.
                    // edge.setProperty(MessageObjectReferencesManager.MESSAGE_OBJECT_REFERENCE, vo.name)

                    // Configure source and target layout constraints
                    configurePortLayout(writePort.node)
                    configurePortLayout(readPort.node)
                ]

                // Create an edge to the preNode if there is at least one pre Reader
                if (preNode !== null) {
                    val KEdge edge = createDataflowEdge(writePort, preNodeReadPort, 0, true)
                    createdElements.add(edge)
                    configurePortLayout(writePort.node)
                }

                // Create an edge to the output if there is one
                if (outputNode !== null) {
                    val KEdge edge = createDataflowEdge(writePort, outputNode.ports.head, 5, true)
                    createdElements.add(edge)
                    configurePortLayout(writePort.node)
                    writePort.labels.clear
                }
            }

            if (inputNode !== null) {
                val KPort inputPort = inputNode.ports.head
                // Create an edge to every reader
                for (KPort readPort : readPorts) {
                    val KEdge edge = createDataflowEdge(inputPort, readPort, 5, true)
                    createdElements.add(edge)
                    configurePortLayout(readPort.node)
                }

                if (preNode !== null) {
                    val KEdge edge = createDataflowEdge(inputPort, preNodeReadPort, 5, true)
                    createdElements.add(edge)
                }
            }

            if (preNode !== null) {
                // Create an edge from the preNode to every reader
                for (KPort preReadPort : preReadPorts) {
                    val KEdge edge = createDataflowEdge(preNodeWritePort, preReadPort, 10, true)
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
        DiagramSyntheses.setLayoutOption(node, LayeredOptions::FEEDBACK_EDGES, true);
        DiagramSyntheses.setLayoutOption(node, CoreOptions::SPACING_NODE_NODE, 20.0);
        DiagramSyntheses.setLayoutOption(node, LayeredOptions::SPACING_EDGE_NODE_BETWEEN_LAYERS, 20.0);

    }

    private def void configurePortLayout(KNode node) {
        DiagramSyntheses.setLayoutOption(node, CoreOptions::NODE_SIZE_CONSTRAINTS, SizeConstraint.free)
    }

    private def KEdge createDataflowEdge(KPort sourcePort, KPort targetPort, int priority, boolean arrowhead) {
        val KEdge edge = createEdge => [
            it.sourcePort = sourcePort;
            it.source = sourcePort.node;
            it.targetPort = targetPort;
            it.target = targetPort.node;
            it.addPolyline => [
                if (!sourcePort.getProperty(PORT_ABSOLUTE_WRITE)) {
                    it.foreground = Colors.OLIVE_DRAB
                }
                it.lineWidth = 2
                // Default arrow head
                if (arrowhead)
                    it.addHeadArrowDecorator => [
                        it.selectionForeground = Colors.BLUE
                        it.selectionLineWidth = 3
                    ]
                // Junction points because of hyperedges
                it.addJunctionPointDecorator

                it.selectionForeground = Colors.BLUE
                it.selectionLineWidth = 3
            ];
        ]

        edge.addLayoutParam(LayeredOptions::PRIORITY_DIRECTION, priority);

        configureParentLayout(edge.source.parent)

        return edge
    }

    private def KNode createPreNode(ValuedObject vo) {
        val preNode = createNode => [ node |
            node.addRectangle => [
                it.addPolygon => [
                    it.points += createKPosition(LEFT, 0, 0.35f, BOTTOM, 0.5f, 0);
                    it.points += createKPosition(LEFT, 0, 0.5f, BOTTOM, 0, 0.35f);
                    it.points += createKPosition(RIGHT, 0, 0.35f, BOTTOM, 0.5f, 0);
                ]
                it.background = Colors.WHITE
            ]
            node.width = 30
            node.height = 30
        ]
        preNode.addLayoutParam(CoreOptions::NODE_SIZE_CONSTRAINTS, SizeConstraint.fixed)

        return preNode
    }

    private def KNode createInputNode(ValuedObject vo) {
        val inputNode = createNode => [ node |
            node.addPolygon => [
                it.points += createKPosition(RIGHT, 12, 0.0f, TOP, 0, 0);
                it.points += createKPosition(RIGHT, 0, 1.0f, TOP, 0, 0);
                it.points += createKPosition(RIGHT, 0, 1.0f, TOP, 0, 1.0f);
                it.points += createKPosition(RIGHT, 12, 0.0f, TOP, 0, 1.0f);
                it.points += createKPosition(RIGHT, 0, 0.0f, TOP, 0, 0.5f);
                it.points += createKPosition(RIGHT, 12, 0.0f, TOP, 0, 0);
                it.background = Colors.WHITE
            ]
            node.width = 35
            node.height = 10
        ]
        val KLabel label = inputNode.addInsideCenteredNodeLabel(vo.name)
        label.getKRendering => [
            fontSize = 11;
            fontBold = true;
        ]
        inputNode.addLayoutParam(CoreOptions::ALIGNMENT, Alignment.LEFT)
        inputNode.addLayoutParam(CoreOptions::NODE_SIZE_CONSTRAINTS,
            EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS))
        inputNode.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint.FIRST)
        createPort => [node = inputNode]
        return inputNode
    }

    private def KNode createOutputNode(ValuedObject vo) {

        val outputNode = createNode => [ node |
            node.addPolygon => [
                it.points += createKPosition(LEFT, 12, 0.0f, TOP, 0, 0);
                it.points += createKPosition(LEFT, 0, 1.0f, TOP, 0, 0);
                it.points += createKPosition(LEFT, 0, 1.0f, TOP, 0, 1.0f);
                it.points += createKPosition(LEFT, 12, 0.0f, TOP, 0, 1.0f);
                it.points += createKPosition(LEFT, 0, 0.0f, TOP, 0, 0.5f);
                it.points += createKPosition(LEFT, 12, 0.0f, TOP, 0, 0);
                it.background = Colors.WHITE
            ]
            node.width = 35
            node.height = 10
        ]
        val KLabel label = outputNode.addInsideCenteredNodeLabel(vo.name)
        label.getKRendering => [
            fontSize = 11;
            fontBold = true;
        ]
        outputNode.addLayoutParam(CoreOptions::ALIGNMENT, Alignment.RIGHT)
        outputNode.addLayoutParam(CoreOptions::NODE_SIZE_CONSTRAINTS,
            EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS))
        outputNode.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint.LAST)
        createPort => [node = outputNode]

        return outputNode
    }

    private def addValuedObjectsOfActions(Action action, AccessContext context) {
        // Here we need to do the magic and find out which ValuedObjects are read and which are written
        // The trigger should not have any side effect so it will only be a read access
        // TODO Make sure this is a valid assumption
        // So we take all ValuedObjects from the trigger and just take these
        collectReadAccessFromExpression(action.trigger, context.readLocal, context.preReadLocal, null)

        // The effect is a bit more complicated, it could be an assignment, 
        // an emission or something else that we don't care in
        // TODO Make sure there is nothing else we are interested in
        action.effects.forEach [ effect |
            if (effect instanceof Emission) {
                // Store the emitted object as written
                context.absoluteWriteLocal.add(effect.valuedObject);
                // Store the parts of the value as read object
                collectReadAccessFromExpression(effect.newValue, context.readLocal, context.preReadLocal,
                    effect.valuedObject)
            } else if (effect instanceof Assignment) {
                // Store the target as absolute write or relative write
                if (effect.operator == AssignOperator.ASSIGN) {
                    context.absoluteWriteLocal.add(effect.valuedObject);
                } else {
                    context.relativeWriteLocal.add(effect.valuedObject);
                }

                // Store the parts of the value as read object
                collectReadAccessFromExpression(effect.expression, context.readLocal, context.preReadLocal,
                    effect.valuedObject)
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

class AccessContext {
    Set<ValuedObject> readLocal
    Set<ValuedObject> preReadLocal
    Set<ValuedObject> absoluteWriteLocal
    Set<ValuedObject> relativeWriteLocal
    Set<ValuedObject> readNested
    Set<ValuedObject> preReadNested
    Set<ValuedObject> absoluteWriteNested
    Set<ValuedObject> relativeWriteNested

    new() {
        readLocal = newHashSet()
        preReadLocal = newHashSet()
        absoluteWriteLocal = newHashSet()
        relativeWriteLocal = newHashSet()
        readNested = newHashSet()
        preReadNested = newHashSet()
        absoluteWriteNested = newHashSet()
        relativeWriteNested = newHashSet()
    }

    def clear() {
        readLocal.clear
        preReadLocal.clear
        absoluteWriteLocal.clear
        relativeWriteLocal.clear
        readNested.clear
        preReadNested.clear
        absoluteWriteNested.clear
        relativeWriteNested.clear
    }

    def Set<ValuedObject> getReadAnywhere() {
        return Sets.union(readLocal, readNested)
    }

    def Set<ValuedObject> getPreReadAnywhere() {
        return Sets.union(preReadLocal, preReadNested)
    }

    def Set<ValuedObject> getAbsoluteWriteAnywhere() {
        return Sets.union(absoluteWriteLocal, absoluteWriteNested)
    }

    def Set<ValuedObject> getRelativeWriteAnywhere() {
        return Sets.union(relativeWriteLocal, relativeWriteNested)
    }

    def Set<ValuedObject> getAnyWriteAnywhere() {
        return Sets.union(Sets.union(relativeWriteLocal, absoluteWriteLocal),
            Sets.union(relativeWriteNested, absoluteWriteNested))
    }

    def Set<ValuedObject> getReadLocal() {
        return readLocal
    }

    def Set<ValuedObject> getPreReadLocal() {
        return preReadLocal
    }

    def Set<ValuedObject> getAbsoluteWriteLocal() {
        return absoluteWriteLocal
    }

    def Set<ValuedObject> getRelativeWriteLocal() {
        return relativeWriteLocal
    }

    def Set<ValuedObject> getAnyWriteLocal() {
        return Sets.union(relativeWriteLocal, absoluteWriteLocal)
    }

    def Set<ValuedObject> getReadNested() {
        return readNested
    }

    def Set<ValuedObject> getPreReadNested() {
        return preReadNested
    }

    def Set<ValuedObject> getAbsoluteWriteNested() {
        return absoluteWriteNested
    }

    def Set<ValuedObject> getRelativeWriteNested() {
        return relativeWriteNested
    }

    def Set<ValuedObject> getAnyWriteNested() {
        return Sets.union(relativeWriteNested, absoluteWriteNested)
    }

    def copyAll(AccessContext other) {
        if (other !== null) {
            readNested.addAll(other.readNested)
            preReadNested.addAll(other.preReadNested)
            absoluteWriteNested.addAll(other.absoluteWriteNested)
            relativeWriteNested.addAll(other.relativeWriteNested)
            readLocal.addAll(other.readLocal)
            preReadLocal.addAll(other.preReadLocal)
            absoluteWriteLocal.addAll(other.absoluteWriteLocal)
            relativeWriteLocal.addAll(other.relativeWriteLocal)
        }
    }
    
    def propagateUp(AccessContext parent) {
        if (parent !== null) {
            parent.readNested.addAll(this.readAnywhere)
            parent.preReadNested.addAll(this.preReadAnywhere)
            parent.absoluteWriteNested.addAll(this.absoluteWriteAnywhere)
            parent.relativeWriteNested.addAll(this.relativeWriteAnywhere)
        }
    }
}
