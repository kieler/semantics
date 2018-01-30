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

import com.google.common.collect.Iterators
import com.google.common.collect.Maps
import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.kicool.ui.synthesis.updates.MessageObjectReferencesManager
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
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
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.SCChartsDiagramProperties
import java.util.Collection
import java.util.Collections
import java.util.EnumSet
import java.util.Iterator
import java.util.Map
import java.util.Set
import org.eclipse.elk.alg.layered.options.LayerConstraint
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.Alignment
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property
import de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import org.eclipse.elk.core.options.PortSide

/**
 * Visualizes the dataflow between SCChart regions.
 * 
 * @author nbw
 */
class InducedDataflowHook extends SynthesisHook {

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
    @Inject extension KEffectsExtensions

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.InducedDataflowHook";

    /** Job name */
    public static final String JOB_NAME = "Calculating Dataflow";

    /** The related synthesis option */
    public static final SynthesisOption SHOW_DATAFLOW = SynthesisOption.createCheckOption("Induced Dataflow",
        false).setCategory(GeneralSynthesisOptions::DEBUGGING);
    public static final SynthesisOption SHOW_DATAFLOW_IO = SynthesisOption.createChoiceOption("Dataflow I/O",
        newArrayList(IOType.None, IOType.Local, IOType.All), IOType.None).setCategory(
        GeneralSynthesisOptions::DEBUGGING);

    /** Property to mark the type of write ports */
    private static final IProperty<Boolean> PORT_ABSOLUTE_WRITE = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.dataflow.absolute", false);

    private static final int EDGE_PRIORITY_NORMAL = 10
    private static final int EDGE_PRIORITY_PRE = 50

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_DATAFLOW, SHOW_DATAFLOW_IO);
    }

    /** Ensure this processor runs before the layout annotation processor */
    override getPriority() {
        return 70;
    }

    override finish(Scope model, KNode rootNode) {
        if (SHOW_DATAFLOW.booleanValue) {
            rootNode.showDataflow(model);
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
            for (Action action : currState.actions) {
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
                createDataflowHyperedges(currState, regionAccesses, tracking) // , createdElements)
            }
        }
    }

    /**
     * Create a dataflow hyperedge for each signal flowing between concurrent regions. All the "producing" and the 
     * "consuming" regions are attached to that hyperedge. 
     */
    def createDataflowHyperedges(State state, Map<Region, AccessContext> regionAccesses,
        SourceModelTrackingAdapter tracking) {
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
            // TODO Include objects here that are declared on a higher hierarchy
            regionAccesses.forEach [ region, context |
                relevantVOs.addAll(context.readAnywhere.filter[(it.eContainer as VariableDeclaration).input])
                relevantVOs.addAll(context.preReadAnywhere.filter[(it.eContainer as VariableDeclaration).input])
                relevantVOs.addAll(context.anyWriteAnywhere.filter[(it.eContainer as VariableDeclaration).output])
            ]
        }

        // Gather all local valued objects if we want to draw local I/O 
        val Set<ValuedObject> allLocalReads = Sets.newHashSet
        val Set<ValuedObject> allLocalWrites = Sets.newHashSet

        if (ioType == IOType.Local) {
            // Gather local data from all regions
            regionAccesses.forEach [ region, context |
                allLocalReads.addAll(context.readLocal.filter[(it.eContainer as VariableDeclaration).input])
                allLocalReads.addAll(context.preReadLocal.filter[(it.eContainer as VariableDeclaration).input])
                allLocalWrites.addAll(context.anyWriteLocal.filter[(it.eContainer as VariableDeclaration).output])
            ]
            // Store the I/O as relevant
            relevantVOs.addAll(allLocalReads)
            relevantVOs.addAll(allLocalWrites)
        }

        // Each valued object will be handled by a hyperedge 
        for (ValuedObject vo : relevantVOs) {
            val Set<KPort> readPorts = Sets.newHashSet
            val Set<KPort> preReadPorts = Sets.newHashSet
            val Set<KPort> writePorts = Sets.newHashSet
            // Create the necessary ports for all regions
            regionAccesses.forEach [ region, context |
                val KNode regionNode = tracking.getTargetElements(region).filter(KNode).head
                // Create port for read access
                if (context.readAnywhere.contains(vo)) {
                    readPorts.add(createDataflowPort(regionNode, false, null, true))
                }
                // Create port for read access of previous value 
                if (context.preReadAnywhere.contains(vo)) {
                    preReadPorts.add(createDataflowPort(regionNode, false, null, true))
                }
                // Create ports for write access
                if (context.absoluteWriteAnywhere.contains(vo)) {
                    // Add port for absolute write
                    writePorts.add(createDataflowPort(regionNode, true, vo.name, false))
                } else if (context.relativeWriteAnywhere.contains(vo)) {
                    // Only create port for relative writes if not also absolute write
                    writePorts.add(createDataflowPort(regionNode, false, vo.name, false))
                }
            ]

            // Create a pre actor if needed
            val KNode preNode = if (!preReadPorts.empty) {
                    val node = createPreNode(vo)
                    // Grab parent node from the region node to ensure proper handling on root state
                    preReadPorts.head.node.parent.children.add(node)
                    node
                }
            val KPort preNodeReadPort = if(preNode !== null) createDataflowPort(preNode, false, null, true)
            var KPort preNodeWritePort = if(preNode !== null) createDataflowPort(preNode, true, "pre(" + vo.name + ")", false)

            // Create an input node if needed
            val boolean needInput = ioType == IOType.All || (ioType == IOType.Local && allLocalReads.contains(vo))
            val KNode inputNode = if (needInput && !(readPorts.empty && preReadPorts.empty) &&
                    (vo.eContainer as VariableDeclaration).input) {
                    val node = createInputNode(vo)
                    Sets.union(readPorts, preReadPorts).head.node.parent.children.add(node)
                    node
                }

            // Create an output node if needed
            val boolean needOutput = ioType == IOType.All || (ioType == IOType.Local && allLocalWrites.contains(vo))
            val KNode outputNode = if (needOutput && !writePorts.empty &&
                    (vo.eContainer as VariableDeclaration).output) {
                    val node = createOutputNode(vo)
                    writePorts.head.node.parent.children.add(node)
                    node
                }
            for (KPort writePort : writePorts) {
                // Create an edge for every normal reader that is not the current writer
                readPorts.filter[readPort|!readPort.node.equals(writePort.node)].forEach [ readPort |
                    createDataflowEdge(writePort, readPort, EDGE_PRIORITY_NORMAL, vo)
                    // Configure source and target layout constraints
                    configurePortLayout(writePort.node)
                    configurePortLayout(readPort.node)
                ]

                // Create an edge to the preNode if there is at least one pre Reader
                if (preNode !== null) {
                    createDataflowEdge(writePort, preNodeReadPort, 0, vo)
                    // Configure only source layout to not reconfigure the pre node
                    configurePortLayout(writePort.node)
                }

                // Create an edge to the output if there is one
                if (outputNode !== null) {
                    createDataflowEdge(writePort, outputNode.ports.head, EDGE_PRIORITY_NORMAL, vo)
                    // Configure only source layout to not reconfigure the output node
                    configurePortLayout(writePort.node)
                    // Remove the port label if name already determined by output
                    writePort.labels.clear
                }
            }

            if (inputNode !== null) {
                val KPort inputPort = inputNode.ports.head
                // Create an edge to every reader
                for (KPort readPort : readPorts) {
                    createDataflowEdge(inputPort, readPort, EDGE_PRIORITY_NORMAL, vo)
                    // Configure only target layout to not reconfigure the input node
                    configurePortLayout(readPort.node)
                }

                if (preNode !== null) {
                    createDataflowEdge(inputPort, preNodeReadPort, EDGE_PRIORITY_NORMAL, vo)
                }
            }

            if (preNode !== null) {
                // Create an edge from the preNode to every reader
                for (KPort preReadPort : preReadPorts) {
                    createDataflowEdge(preNodeWritePort, preReadPort, EDGE_PRIORITY_PRE, vo)
                    // Configure only target layout to not reconfigure the pre node
                    configurePortLayout(preReadPort.node)

                }
            }
        }
    }

    /* =============
     * UTILITY METHODS
     * =============
     */
    /** Configure the layout on the state node for proper dataflow layout */
    private def void configureParentLayout(KNode node) {
        DiagramSyntheses.setLayoutOption(node, CoreOptions::PADDING, new ElkPadding(10));
        node.addLayoutParam(CoreOptions::NODE_SIZE_CONSTRAINTS, SizeConstraint.free)
        node.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
        node.addLayoutParam(CoreOptions::DIRECTION, Direction.RIGHT)
        node.addLayoutParam(LayeredOptions::FEEDBACK_EDGES, true);
        node.addLayoutParam(CoreOptions::SPACING_NODE_NODE, 20.0);
        node.addLayoutParam(LayeredOptions::SPACING_EDGE_NODE_BETWEEN_LAYERS, 20.0);
    }

    /** Configure the layout on the attached node */
    private def void configurePortLayout(KNode node) {
        node.addLayoutParam(CoreOptions::NODE_SIZE_CONSTRAINTS, SizeConstraint.free)
    }

    /** Create a port for the dataflow layout */
    private def KPort createDataflowPort(KNode kNode, boolean absoluteWrite, String name, boolean input) {
        // Create basic port
        val KPort port = createPort => [
            node = kNode
        ]

        // Set property to mark relative access on write ports
        // Is also set on read ports but is ignored there
        port.setProperty(PORT_ABSOLUTE_WRITE, absoluteWrite)
        port.setProperty(LayeredOptions::PORT_SIDE, if (input) PortSide.WEST else PortSide.EAST)

        // Create label if necessary
        if (!name.isNullOrEmpty) {
            port.addOutsidePortLabel(name).getKRendering => [
                fontSize = 11;
                fontBold = true;
            ]
        }

        return port;
    }

    /** Create an edge for the dataflow */
    private def KEdge createDataflowEdge(KPort sourcePort, KPort targetPort, int priority, ValuedObject vo) {
        val KEdge edge = createEdge => [
            it.sourcePort = sourcePort;
            it.source = sourcePort.node;
            it.targetPort = targetPort;
            it.target = targetPort.node;
            it.addPolyline => [
                if (!sourcePort.getProperty(PORT_ABSOLUTE_WRITE)) {
                    it.foreground = Colors.YELLOW_GREEN
                }
                it.lineWidth = 2
                // Default arrow head
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

        // Add an identifier to the edge to help incremental update
        edge.data += KGraphFactory::eINSTANCE.createKIdentifier => [it.id = vo.name + sourcePort.edges.size]
        // Add tooltip to edge
        edge.setProperty(KlighdProperties.TOOLTIP, vo.name)

        // This leaves a mark on the edge, so that succeeding processors find it.
        // TODO Implement better mechanism than name matching.
        edge.setProperty(MessageObjectReferencesManager.MESSAGE_OBJECT_REFERENCE, vo.name)

        edge.addLayoutParam(LayeredOptions::PRIORITY_DIRECTION, priority);

        // Ensure proper layout of the parent node
        configureParentLayout(edge.source.parent)

        return edge
    }

    /** Create a node for the pre register */
    private def KNode createPreNode(ValuedObject vo) {
        val preNode = createNode => [ node |
            // Create a basic outer rectangle
            node.addRectangle => [
                // Add a small wedge at the bottom
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
        // Add an identifier to help incremental updates
        preNode.data += KGraphFactory::eINSTANCE.createKIdentifier => [it.id = "preReg_" + vo.name]

        // Prevent node resizing
        preNode.addLayoutParam(CoreOptions::NODE_SIZE_CONSTRAINTS, SizeConstraint.fixed)

        return preNode
    }

    /** Create an input node for a given valued object */
    private def KNode createInputNode(ValuedObject vo) {
        val inputNode = createNode => [ node |
            // Create a small arrow-like node
            node.addPolygon => [
                it.points += createKPosition(RIGHT, 12, 0.0f, TOP, 0, 0);
                it.points += createKPosition(RIGHT, 0, 1.0f, TOP, 0, 0);
                it.points += createKPosition(RIGHT, 0, 1.0f, TOP, 0, 1.0f);
                it.points += createKPosition(RIGHT, 12, 0.0f, TOP, 0, 1.0f);
                it.points += createKPosition(RIGHT, 0, 0.0f, TOP, 0, 0.5f);
                it.points += createKPosition(RIGHT, 12, 0.0f, TOP, 0, 0);
                it.background = Colors.WHITE
            ]
            // Minimal node size
            node.width = 35
            node.height = 10
        ]
        // Add the name of the object as an inside label
        inputNode.addInsideCenteredNodeLabel(vo.name).getKRendering => [
            fontSize = 11;
            fontBold = true;
        ]

        // Add an identifier to help incremental updates
        inputNode.data += KGraphFactory::eINSTANCE.createKIdentifier => [it.id = "input_" + vo.name]

        // Allow resizing of the node for the node label
        inputNode.addLayoutParam(CoreOptions::NODE_SIZE_CONSTRAINTS,
            EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS))
        // Tune the alignment of the input node
        inputNode.addLayoutParam(CoreOptions::ALIGNMENT, Alignment.LEFT)
        inputNode.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint.FIRST)
        // Create a single port on the node
        val KPort port = createPort => [node = inputNode]
        port.addLayoutParam(PORT_ABSOLUTE_WRITE, true)
        return inputNode
    }

    /** Create an output node for a given valued object */
    private def KNode createOutputNode(ValuedObject vo) {
        val outputNode = createNode => [ node |
            // Create a small arrow-like node
            node.addPolygon => [
                it.points += createKPosition(LEFT, 12, 0.0f, TOP, 0, 0);
                it.points += createKPosition(LEFT, 0, 1.0f, TOP, 0, 0);
                it.points += createKPosition(LEFT, 0, 1.0f, TOP, 0, 1.0f);
                it.points += createKPosition(LEFT, 12, 0.0f, TOP, 0, 1.0f);
                it.points += createKPosition(LEFT, 0, 0.0f, TOP, 0, 0.5f);
                it.points += createKPosition(LEFT, 12, 0.0f, TOP, 0, 0);
                it.background = Colors.WHITE
            ]
            // Minimal node size
            node.width = 35
            node.height = 10
        ]
        // Add the name of the object as an inside label
        outputNode.addInsideCenteredNodeLabel(vo.name).getKRendering => [
            fontSize = 11;
            fontBold = true;
        ]

        // Add an identifier to help incremental updates
        outputNode.data += KGraphFactory::eINSTANCE.createKIdentifier => [it.id = "output_" + vo.name]

        // Allow resizing of the node for the node label
        outputNode.addLayoutParam(CoreOptions::NODE_SIZE_CONSTRAINTS,
            EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS))
        // Tune the alignment of the output node
        outputNode.addLayoutParam(CoreOptions::ALIGNMENT, Alignment.RIGHT)
        outputNode.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint.LAST)
        // Create a single port on the node
        createPort => [node = outputNode]
        return outputNode
    }

    /** Gathers the valued objects used in the given action */
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
            // Combine the expression and all sub elements, then filter for all valued objects
            Iterators.concat(Iterators.singletonIterator(expression), expression.eAllContents).filter(
                ValuedObjectReference).filter[valuedObject.eContainer instanceof VariableDeclaration].forEach [
                if (it.eContainer instanceof OperatorExpression &&
                    (it.eContainer as OperatorExpression).operator == OperatorType.PRE) {
                        preReads.add(it.valuedObject)    
                } else {
                    if (!it.valuedObject.equals(excludedVO)) {
                        reads.add(it.valuedObject)                        
                    }
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
            // Start with an empty iterator
            Collections.emptyIterator,
            // Concatenate the child iterators recursively
            [ iter, region |
                region.states.fold(iter, [ currIter, currState |
                    Iterators.concat(currIter, getPostfixDFSIterator(currState))
                ])
            ]
        )
        // Append the current element at the end
        return Iterators.concat(iterator, Iterators.singletonIterator(rootState));
    }

}

/**
 * Container object to simplify the storage of read and write objects.
 */
class AccessContext {
    public Set<ValuedObject> readLocal
    public Set<ValuedObject> preReadLocal
    public Set<ValuedObject> absoluteWriteLocal
    public Set<ValuedObject> relativeWriteLocal
    public Set<ValuedObject> readNested
    public Set<ValuedObject> preReadNested
    public Set<ValuedObject> absoluteWriteNested
    public Set<ValuedObject> relativeWriteNested

    /** Create a new container and initialize all sets */
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

    /** Clear all sets in the container */
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

    /** Convenience to get all direct reads, local or nested. */
    def Set<ValuedObject> getReadAnywhere() {
        return Sets.union(readLocal, readNested)
    }

    /** Convenience to get all pre reads, local or nested. */
    def Set<ValuedObject> getPreReadAnywhere() {
        return Sets.union(preReadLocal, preReadNested)
    }

    /** Convenience to get all absolute writes, local or nested. */
    def Set<ValuedObject> getAbsoluteWriteAnywhere() {
        return Sets.union(absoluteWriteLocal, absoluteWriteNested)
    }

    /** Convenience to get all relative writes, local or nested. */
    def Set<ValuedObject> getRelativeWriteAnywhere() {
        return Sets.union(relativeWriteLocal, relativeWriteNested)
    }

    /** Convenience to get all writes, local or nested. */
    def Set<ValuedObject> getAnyWriteAnywhere() {
        return Sets.union(Sets.union(relativeWriteLocal, absoluteWriteLocal),
            Sets.union(relativeWriteNested, absoluteWriteNested))
    }

    /** Convenience to get all local writes */
    def Set<ValuedObject> getAnyWriteLocal() {
        return Sets.union(relativeWriteLocal, absoluteWriteLocal)
    }

    /** Convenience to get all nested writes */
    def Set<ValuedObject> getAnyWriteNested() {
        return Sets.union(relativeWriteNested, absoluteWriteNested)
    }

    /** Copies all data from {@code other} to the current container */
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

    /** Adds the data from the container as nested data in the parent container */
    def propagateUp(AccessContext parent) {
        if (parent !== null) {
            parent.readNested.addAll(this.readAnywhere)
            parent.preReadNested.addAll(this.preReadAnywhere)
            parent.absoluteWriteNested.addAll(this.absoluteWriteAnywhere)
            parent.relativeWriteNested.addAll(this.relativeWriteAnywhere)
        }
    }
}
