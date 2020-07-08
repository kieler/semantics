/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.klighd

import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.keffects.ControlDependency
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.kexpressions.keffects.DataDependencyType
import de.cau.cs.kieler.kexpressions.keffects.Dependency
import de.cau.cs.kieler.kicool.ui.klighd.KiCoDiagramViewProperties
import de.cau.cs.kieler.klighd.IKlighdSelection
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.internal.macrolayout.KlighdDiagramLayoutConnector
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.KRoundedBendsPolyline
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.ExpressionDependency
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.GuardDependency
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScheduleDependency
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.TickBoundaryDependency
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import de.cau.cs.kieler.scg.klighd.actions.SCCActions
import de.cau.cs.kieler.scg.processors.analyzer.LoopAnalyzerV2
import de.cau.cs.kieler.scg.processors.priority.PriorityAuxiliaryData
import de.cau.cs.kieler.scg.processors.priority.PriorityProcessor
import java.util.LinkedList
import java.util.Set
import javax.inject.Inject
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.alg.layered.options.LayeringStrategy
import org.eclipse.elk.alg.layered.options.NodePlacementStrategy
import org.eclipse.elk.alg.layered.options.WrappingStrategy
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortSide
import org.eclipse.elk.graph.properties.Property
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.SelectionChangedEvent

import static de.cau.cs.kieler.scg.klighd.ColorStore.Color.*
import static de.cau.cs.kieler.scg.klighd.SCGraphSynthesisOptions.*
import static de.cau.cs.kieler.scg.processors.SCGAnnotations.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*

/** 
 * SCCGraph KlighD synthesis class. It contains all method mandatory to handle the visualization of
 * all predefined types of SC graphs.
 * 
 * @author ssm
 * @kieler.design 2013-10-23 proposed 
 * @kieler.rating 2013-10-23 proposed yellow
 */
class SCGraphDiagramSynthesis extends AbstractDiagramSynthesis<SCGraph> {

    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KLabelExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KPortExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGThreadExtensions
    @Inject extension SCGDependencyExtensions
    @Inject extension ColorStore
    @Inject extension SCGraphSynthesisHelper
    @Inject extension SCGraphComponentSynthesis
    @Inject extension SCGraphHierarchySynthesis

    extension KRenderingFactory = KRenderingFactory.eINSTANCE

    /**  
     * Returns a list of KlighD visualization options. Called by KlighD.
     * 
     * @return Returns a list of KlighD visualization options.
     */
    override getDisplayedSynthesisOptions() {
        return SCGSynthesisOptions
    }

    // -------------------------------------------------------------------------
    // -- Constants
    // -------------------------------------------------------------------------
    

    public static val THREAD_PRIO_PROPERTY = new Property<Boolean>("scgPriority.ThreadPriority", false)

    public static val SCC_PROPERTY = new Property<Boolean>("scgPriority.SCCPriority", false)

    public static val PRIO_STATEMENTS_PROPERTY = new Property<Boolean>("scgPriority.PrioStatements", false)

    public static val GRAPH_DEPENDENCY = new Property<Dependency>("graph.dependency", null)
    
    protected static val int SCHEDULING_SCHEDULINGEDGE_ALPHA = 96
    static val int PROBLEM_WIDTH = 4

    /** Thickness of an highlighted scheduling edge */
    static val int CONTROLFLOW_SCHEDULINGEDGE_WIDTH = 4

    /** Figure constants */
    // -------------------------------------------------------------------------
    // -- Static Helper Class 
    // -------------------------------------------------------------------------
    /**
     * Global selection listener which dependencies for element selection.
     */
    static final ISelectionChangedListener SELECTION_LISTENER = new ISelectionChangedListener() {

        override void selectionChanged(SelectionChangedEvent event) {
            val selection = event.getSelection() as IKlighdSelection
            val viewContext = selection.getViewContext()
            val viewer = viewContext.viewer

            if (viewContext.getOptionValue(SHOW_DEPENDENCIES) as Boolean &&
                viewContext.getOptionValue(SELECTIVE_DEPENDENCIES) as Boolean) {
                val selectedNodes = <KNode>newHashSet

                // All nodes
                selectedNodes.addAll(selection.diagramElementsIterator.filter(KNode).toIterable)
                // All nodes with selected text
                selectedNodes.addAll(selection.diagramElementsIterator.filter [
                    !selectedNodes.contains(it)
                ].map [
                    var container = it.eContainer
                    while (container !== null) {
                        if(container instanceof KNode) return container as KNode
                        container = container.eContainer
                    }
                    return null
                ].filterNull.toIterable)

                val rootNode = viewContext.viewModel
                // Hide all dependencies
                rootNode.eAllContentsOfType(KNode, KEdge).filter(KEdge).filter [
                    viewContext.getSourceElement(it) instanceof Dependency
                ].forEach [
                    viewer.hide(it)
                ]

                // BLACK MAGIC to fix klighd behavior
                val instance = new KlighdDiagramLayoutConnector
                val arranger = instance.class.getDeclaredMethod("handleExcludedEdge", KEdge)
                arranger.accessible = true

                // Show dependencies for selected nodes
                for (knode : selectedNodes) {
                    val node = viewContext.getSourceElement(knode)
                    // Show edges
                    if (node instanceof Node) {
                        node.outgoingLinks.filter(Dependency).map[viewContext.getTargetElements(it)].forEach [
                            it.filter(KEdge).forEach [
                                viewer.show(it)
                                arranger.invoke(instance, it)
                            ]
                        ]
                        node.incomingLinks.filter(Dependency).map[viewContext.getTargetElements(it)].forEach [
                            it.filter(KEdge).forEach [
                                viewer.show(it)
                                arranger.invoke(instance, it)
                            ]
                        ]
                    }
                }
            }
        }
    }

    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------
    var Set<Node> pilNodes = <Node>newHashSet

    protected boolean isSCPDG

    /** List of all strongly connected components of the SCG */
    LinkedList<LinkedList<Node>> scc

    // -------------------------------------------------------------------------
    // -- Main Entry Point 
    // -------------------------------------------------------------------------
    /**
     * This method is called by KlighD. Trigger your visualization here.
     * 
     * @param model
     * 			the model in question
     * @return Returns the root KNode.
     */
    override transform(SCGraph model) {
        synthesis = this
        val compilationContext = usedContext.getProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT)
        if (compilationContext !== null) {
            val scgs = model.eContainer
            if (scgs !== null) {
                val pilr = compilationContext.getResultForModel(scgs)?.getProperty(LoopAnalyzerV2.LOOP_DATA)
                if(pilr !== null) pilNodes += pilr.criticalNodes
            }
            val prioAuxData = compilationContext.result.getProperty(PriorityProcessor.PRIORITY_AUXILIARY_DATA)
            if (prioAuxData !== null) {
                scc = prioAuxData.stronglyConnectedComponents
            }
        }

        // Invoke the synthesis.
        SCGraph = model
        hierarchyAttachment.clear
        annotationNodeAttachments.clear

        // Start the synthesis.
        val timestamp = System.currentTimeMillis
        System.out.println("Started SCG synthesis...")

        val newModel = model.synthesize();

        // Activate or deactivate selective dependencies
        if (SHOW_DEPENDENCIES.booleanValue) {
            val contextViewer = usedContext.getViewer()?.getContextViewer()
            if (SELECTIVE_DEPENDENCIES.booleanValue) {
                contextViewer?.addSelectionChangedListener(SELECTION_LISTENER)
            } else {
                contextViewer?.removeSelectionChangedListener(SELECTION_LISTENER)
            }
        } else {
            val contextViewer = usedContext.getViewer()?.getContextViewer()
            contextViewer?.removeSelectionChangedListener(SELECTION_LISTENER)
        }

        // End notifiaction
        var time = (System.currentTimeMillis - timestamp) as float
        System.out.println("SCG synthesis finished (time elapsed: " + (time / 1000) + "s).")

        if (USE_ADAPTIVEZOOM.booleanValue) {
            newModel.applyAdaptiveZoom
        }
        return newModel
    }

    // -------------------------------------------------------------------------
    // -- Synthesis 
    // -------------------------------------------------------------------------
    /**
     * Is triggered when a SCGrpah must be synthesized.
     * 
     * @param scg
     * 			the SCG in question
     * @return Returns the top level KNode.
     */
    private def KNode synthesize(SCGraph scg) {
        val node = scg.createNode().associateWith(scg)
        // Set root node and layout options.
        rootNode = node
        isSCPDG = scg.hasAnnotation(ANNOTATION_SCPDGTRANSFORMATION)
        isGuardSCG = scg.hasAnnotation(ANNOTATION_GUARDED)
        scg.getStringAnnotationValue("main")
        if (ORIENTATION.objectValue == "Left-Right") {
            orientation = SCGraphSynthesisHelper.ORIENTATION_LANDSCAPE
        } else {
            orientation = SCGraphSynthesisHelper.ORIENTATION_PORTRAIT
        }
        if (topdown) {
            node.setLayoutOption(CoreOptions::DIRECTION, Direction::DOWN)
        } else {
            node.setLayoutOption(CoreOptions::DIRECTION, Direction::RIGHT)
        }
        node.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 25.0);
        node.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
        node.setLayoutOption(CoreOptions::ALGORITHM, LayeredOptions.ALGORITHM_ID);
        node.setLayoutOption(LayeredOptions::THOROUGHNESS, 100)
        node.setLayoutOption(CoreOptions::SEPARATE_CONNECTED_COMPONENTS, false);
        if (scg.hasAnnotation(ANNOTATION_SEQUENTIALIZED)) {
            node.setLayoutOption(LayeredOptions::LAYERING_STRATEGY, LayeringStrategy::LONGEST_PATH)
            node.setLayoutOption(LayeredOptions::WRAPPING_STRATEGY, WrappingStrategy.SINGLE_EDGE)
        }

        // Sausage folding on/off
        if ((SHOW_SAUSAGE_FOLDING.booleanValue) && scg.hasAnnotation(ANNOTATION_SEQUENTIALIZED)) {
            node.addLayoutParam(LayeredOptions::LAYERING_STRATEGY, LayeringStrategy::LONGEST_PATH)
            node.setLayoutOption(LayeredOptions::WRAPPING_STRATEGY, WrappingStrategy.SINGLE_EDGE)
        }

        // Added as suggested by uru (mail to cmot, 11.11.2016)            
        node.addLayoutParam(LayeredOptions::NODE_PLACEMENT_STRATEGY, NodePlacementStrategy.NETWORK_SIMPLEX);

        val threadTypes = <Entry, ThreadPathType>newHashMap

        // Synthesize all children             
        for (n : scg.nodes) {
            if (n instanceof Entry) {
                if (n.hasAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE)) {
                    threadTypes.put((n as Entry),
                        n.getStringAnnotationValue(ANNOTATION_CONTROLFLOWTHREADPATHTYPE).fromString2)
                }
            }

            val aNode = n.createComponentNode
            node.children += aNode

            if (n.schizophrenic) {
                aNode.KRendering.foreground = SCHIZO_COLOR.color
                if (n instanceof Assignment) {
                    if (n.next === null) {
                        node.children += aNode.createDeadend(SCGraphSynthesisHelper.SCGPORTID_OUTGOING)
                    }
                } else if (n instanceof Conditional) {
                    if (n.then === null) {
                        node.children += aNode.createDeadend(SCGraphSynthesisHelper.SCGPORTID_OUTGOING_THEN)
                    }
                    if (n.^else === null) {
                        node.children += aNode.createDeadend(SCGraphSynthesisHelper.SCGPORTID_OUTGOING_ELSE)
                    }
                }
            }
        }
        // For each node transform the control flow edges.
        // This must be done after all nodes have been created.
        scg.nodes.forEach [
            if(it instanceof Surface) it.depth?.synthesizeTickEdge
            if(it instanceof Assignment) it.next?.synthesizeControlFlow(SCGraphSynthesisHelper.SCGPORTID_OUTGOING)
            if(it instanceof Entry) it.next?.synthesizeControlFlow(SCGraphSynthesisHelper.SCGPORTID_OUTGOING)
            if(it instanceof Exit) it.next?.synthesizeControlFlow(SCGraphSynthesisHelper.SCGPORTID_OUTGOING)
            if(it instanceof Join) it.next?.synthesizeControlFlow(SCGraphSynthesisHelper.SCGPORTID_OUTGOING)
            if(it instanceof Depth) it.next?.synthesizeControlFlow(SCGraphSynthesisHelper.SCGPORTID_OUTGOING)
            if(it instanceof Fork) it.getNext().forEach[synthesizeControlFlow("")]
            if (it instanceof Conditional) {
                it.then?.synthesizeControlFlow(SCGraphSynthesisHelper.SCGPORTID_OUTGOING_THEN)
                it.^else?.synthesizeControlFlow(SCGraphSynthesisHelper.SCGPORTID_OUTGOING_ELSE)
            }
            it.synthesizeAnnotations

            // If the dependency edges shall be layouted as well, they must be drawn before any 
            // hierarchy management. The hierarchy methods break edges in half and connect them via a port.
            if (scg instanceof SCGraph && SHOW_DEPENDENCIES.booleanValue &&
                (LAYOUT_DEPENDENCIES.booleanValue || isSCPDG)) {
                it.dependencies.forEach[(it as Dependency).synthesizeDependency]
            }
        ]
        
        // This will straighten edges on the else path
        if (scg.hasAnnotation(ANNOTATION_SEQUENTIALIZED) && 
            (scg.basicBlocks.nullOrEmpty || (!SHOW_BASICBLOCKS.booleanValue && !SHOW_SCHEDULINGBLOCKS.booleanValue))
        ) {
            node.improveMainlineStraightness()
        }

        // Apply any hierarchy if the corresponding option is set. Since layout of edges between nodes
        // in different hierarchies is not supported, the synthesis splits these edges at the hierarchy
        // border and connects them via a port. Thus, a kind of pseudo hierarchical edge layout is archived. 
        scg.applyHierarchy(node, threadTypes)

        // Draw basic blocks if present.
        if(scg.basicBlocks.size > 0) scg.synthesizeBasicBlocks

        // If dependency edge are drawn plain (without layout), draw them after the hierarchy management.
        if (SHOW_DEPENDENCIES.booleanValue && !(LAYOUT_DEPENDENCIES.booleanValue || isSCPDG)) {
            scg.nodes.forEach [
                it.dependenciesView.forEach[synthesizeDependency]
            ]
        }

        if (isGuardSCG) {
            scg.synthesizeSCCInGuardSCG
        }

        // Draw strongly connected components
        if (scc !== null) {
            for (component : scc) {
                if (component.size > 1) {
                    for (n : component) {
                        for (n2CF : n.allNext) {
                            val n2 = n2CF.target
                            if (component.contains(n2)) {
                                val edges = n2CF.allEdges
                                for (edge : edges) {
                                    val edgeRendering = edge.getData(typeof(KRoundedBendsPolyline))
                                    edgeRendering.setProperty(SCC_PROPERTY, true)
                                    val style = createKForeground().setColor2(STRONGLY_CONNECTED_COMPONENT_COLOR.color)
                                    style.properties.put(SCCActions.P, true)
                                    style.propagateToChildren = true
                                    edgeRendering.styles += style
                                }
                                n2CF.thickenControlFlow(4)
                            }
                        }
                        for (n2Dep : n.dependenciesView) {
                            val n2 = n2Dep.target
                            if (component.contains(n2)) {
                                val edges = n2Dep.allEdges
                                for (edge : edges) {
                                    if (edge !== null) {
                                        val edgeRendering = edge.getData(typeof(KRoundedBendsPolyline))
                                        edgeRendering.setProperty(SCC_PROPERTY, true)
                                        val style = createKForeground().setColor2(
                                            STRONGLY_CONNECTED_COMPONENT_COLOR.color)
                                        style.properties.put(SCCActions.P, true)
                                        style.propagateToChildren = true
                                        edgeRendering.styles += style
                                    }
                                }
                                n2Dep.thickenDependency(4)
                            }
                        }
                    }
                }
            }
        }

        // Draw analysis visualization if present.
        scg.synthesizeAnalyses
        scg.synthesizeSchedule
        scg.synthesizeScheduleGroups

        scg.applyDependencyHierarchy
        return node
    }

    private def synthesizeAnnotations(Node node) {
        if(!SHOW_ANNOTATIONS.booleanValue) return;
        if(node.annotations.empty) return;

        var commentText = "Annotations:\n"

        for (a : node.annotations) {
            commentText += "\n"
            commentText += a.name
            switch (a) {
                StringAnnotation: commentText += ": " + a.values
                IntAnnotation: commentText += ": " + a.value
            }
        }

        val aNode = createNode()
        aNode.addLayoutParam(CoreOptions.COMMENT_BOX, true)

        aNode.setMinimalNodeSize(16, 16)
        aNode.addRoundedRectangle(1, 1, 1) => [
            setBackgroundGradient(COMMENT_BACKGROUND_GRADIENT_1.color2, COMMENT_BACKGROUND_GRADIENT_2.color2, 90);
            foreground = COMMENT_FOREGROND.color2;
        ]
        aNode.getKContainerRendering.addText(commentText) => [
            fontSize = 8;
            setGridPlacementData().from(LEFT, 4, 0, TOP, 4, 0).to(RIGHT, 4, 0, BOTTOM, 4, 0);
        ]

        val edge = createEdge()
        edge.source = node.getNode
        edge.target = aNode
        edge.addPolyline => [
            lineWidth = 1;
            foreground = COMMENT_EDGE.color
        ]

        node.getNode.parent.children += aNode
        annotationNodeAttachments.put(node.getNode, aNode)
    }

    /**
     * Draw a control flow edge from one node to another.
     * Use the outgoing port description as port identifier.
     * 
     * @param controlFlow
     * 			the control flow in question
     * @param outgoingPortId
     * 			the identifier for the outgoing port
     * @return Returns the KEdge. 
     */
    private def KEdge synthesizeControlFlow(ControlFlow controlFlow, String outgoingPortId) {
        if(controlFlow.target === null || controlFlow.eContainer === null) return null;

        return controlFlow.createNewEdge().associateWith(controlFlow) => [ edge |
            // Get and set source and target information.
            val sourceObj = controlFlow.eContainer
            val targetObj = controlFlow.target
            var sourceNode = sourceObj.node
            var targetNode = targetObj.node
            edge.source = sourceNode
            edge.target = targetNode
            edge.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
            edge.addLayoutParam(LayeredOptions::PRIORITY, 1);

            if(USE_ADAPTIVEZOOM.booleanValue) edge.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.50);
            // If the source is a fork node, create a new port for this control flow and attach it.
            // Otherwise, use the outgoing port identified by the given parameter.
            if (sourceObj instanceof Fork) {
                sourceObj.node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints.FIXED_ORDER)
                edge.sourcePort = sourceObj.node.createPort("fork" + targetObj.hashCode()) => [
                    if (topdown()) {
                        it.addLayoutParam(CoreOptions::PORT_SIDE, PortSide::SOUTH)
                    } else {
                        it.addLayoutParam(CoreOptions::PORT_SIDE, PortSide::EAST)
                    }
                    it.setPortSize(3, 3)
                    it.addRectangle.invisible = true;
                    it.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -3.0)
                    sourceObj.node.ports += it
                ]
            } else {
                if (isGuardSCG) {
                    edge.sourcePort = sourceNode.addHelperPort(edge.hashCode.toString, PortSide::SOUTH)
                } else {
                    edge.sourcePort = sourceNode.getPort(outgoingPortId)
                    if (outgoingPortId.equals(SCGraphSynthesisHelper.SCGPORTID_OUTGOING_ELSE)) {
                        // Added as suggested by uru (mail to cmot, 11.11.2016)            
                        edge.addLayoutParam(LayeredOptions::PRIORITY, 10);
                    }
                }
            }
            // If the target is a join node, create a new port for this control flow and attach it.
            // Otherwise, use the default incoming port.
            if (targetObj instanceof Join) {
                sourceObj.node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints.FIXED_ORDER)
                edge.targetPort = targetObj.node.createPort("join" + sourceObj.hashCode()) => [
                    if (topdown()) {
                        it.addLayoutParam(CoreOptions::PORT_SIDE, PortSide::NORTH)
                    } else {
                        it.addLayoutParam(CoreOptions::PORT_SIDE, PortSide::WEST)
                    }
                    it.setPortSize(3, 3)
                    it.addRectangle.invisible = true;
                    it.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -1.5)
                    targetObj.node.ports += it
                ]
            } else {
                if (isGuardSCG) {
                    edge.targetPort = targetNode.addHelperPort(edge.hashCode.toString, PortSide::NORTH)
                } else {
                    edge.targetPort = targetNode.getPort(SCGraphSynthesisHelper.SCGPORTID_INCOMING)
                    if (outgoingPortId.equals(SCGraphSynthesisHelper.SCGPORTID_OUTGOING_ELSE)) {
                        // Added as suggested by uru (mail to cmot, 11.11.2016)            
                        edge.addLayoutParam(LayeredOptions::PRIORITY, 10);
                    }
                }
            }
            // Finally, draw the solid edge and add a decorator.
            edge.addRoundedBendsPolyline(8, CONTROLFLOW_THICKNESS.floatValue) => [
                it.lineStyle = LineStyle::SOLID
                it.addHeadArrowDecorator
                it.foreground = STANDARD_CONTROLFLOWEDGE.color
                it.foreground.propagateToChildren = true
            ]
            // If the outgoing identifier indicates a 'then branch', add a 'then label'.
            if (outgoingPortId == SCGraphSynthesisHelper.SCGPORTID_OUTGOING_THEN) {
                edge.createLabel.configureTailEdgeLabel('true', 9, KlighdConstants::DEFAULT_FONT_NAME)
            }

            if (controlFlow.targetNode.schizophrenic) {
                edge.KRendering.foreground = SCHIZO_COLOR.color
            }

            // Visualize the prio-statements of the priority-based approach
            if (!(sourceObj instanceof Fork) && !(sourceObj instanceof Depth) && !(targetObj instanceof Join)) {
                val srcNode = sourceObj as Node
                val tgtNode = targetObj as Node
                if (srcNode.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) &&
                    tgtNode.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)) {
                    val srcPrio = srcNode.getAnnotation(
                        PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) as IntAnnotation
                    val tgtPrio = tgtNode.getAnnotation(
                        PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) as IntAnnotation
                    if (srcPrio.value != tgtPrio.value) {
                        edge.sourcePort => [
                            it.setPortSize(50, 20)
                            it.KContainerRendering.setProperty(PRIO_STATEMENTS_PROPERTY, true)
                            var rec = it.KContainerRendering.addRoundedRectangle(SCGraphSynthesisHelper.CORNERRADIUS,
                                SCGraphSynthesisHelper.CORNERRADIUS, SCGraphSynthesisHelper.LINEWIDTH)
                            rec.background = "white".color
                            var txt = rec.addText("prio(" + tgtPrio.value + ")")
                            txt.fontSize = 7
                            var x = txt.setAreaPlacementData
                            x.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 1, 0, BOTTOM, 1, 0)
                        ]
                    }
                }
            }
        ]
    }

    private def KNode createDeadend(KNode node, String outgoingPortId) {
        val deadend = createNode() => [ n |
            val figure = n.addEllipse()
            figure => [
                n.setMinimalNodeSize(8, 8)
                foreground = SCHIZO_COLOR.color
                background = SCHIZO_COLOR.color
            ]
        ]

        createNewEdge() => [ edge |
            // Get and set source and target information.
            var sourceNode = node
            var targetNode = deadend
            edge.source = sourceNode
            edge.target = targetNode
            edge.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
            edge.sourcePort = sourceNode.getPort(outgoingPortId)
            edge.addRoundedBendsPolyline(8, CONTROLFLOW_THICKNESS.floatValue) => [
                it.lineStyle = LineStyle::SOLID
//                it.addArrowDecorator
                it.foreground = SCHIZO_COLOR.color
            ]
        ]
        hierarchyAttachment.put(node, deadend)

        deadend
    }

    /**
     * Synthesize a (single) dependency.
     * 
     * @param dependency
     * 			the dependency in question
     * @return Returns the dependency. 
     */
    private def Dependency synthesizeDependency(Dependency dependency) {

        // If non concurrent dependency are hidden and the given dependency is not concurrent, exit at once.
        if (dependency instanceof DataDependency) {
            if((!isSCPDG) && ((!SHOW_NONCONCURRENT.booleanValue && !dependency.isConcurrent))) return dependency;
            if(!SHOW_CONFLUENT.booleanValue && dependency.confluent) return dependency;
        }
        if(dependency instanceof ScheduleDependency) return dependency;

        if (dependency instanceof DataDependency) {
            if(!SHOW_DEPENDENCY_WRITE_WRITE.booleanValue &&
                dependency.type == DataDependencyType.WRITE_WRITE) return dependency;
            if(!SHOW_DEPENDENCY_ABSWRITE_RELWRITE.booleanValue &&
                dependency.type == DataDependencyType.WRITE_RELATIVEWRITE) return dependency;
            if(!SHOW_DEPENDENCY_WRITE_READ.booleanValue &&
                dependency.type == DataDependencyType.WRITE_READ) return dependency;
        }

        // Retrieve node information.
        val sourceNode = (dependency.eContainer as Node).node
        val targetNode = dependency.target.node

        // Draw the dashed dependency edge....
        dependency.createNewEdge().associateWith(dependency) => [ edge |
            if(USE_ADAPTIVEZOOM.booleanValue) edge.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.40);
            edge.source = sourceNode
            edge.target = targetNode
            if (dependency instanceof DataDependency) {
                edge.addRoundedBendsPolyline(8, 2) => [
                    // ... and use the predefined color for the different dependency types.    
                    if (dependency.type == DataDependencyType.WRITE_READ) {
                        it.foreground = DEPENDENCY_ABSWRITEREAD.color
                    } else if (dependency.type == DataDependencyType.WRITE_RELATIVEWRITE) {
                        it.foreground = DEPENDENCY_ABSWRITERELWRITE.color
                    } else if (dependency.type == DataDependencyType.WRITE_WRITE) {
                        it.foreground = DEPENDENCY_ABSWRITEABSWRITE.color
                    }
                    it.lineStyle = LineStyle::DASH
                    it.addHeadArrowDecorator
                ]
            } else if (dependency instanceof ControlDependency) {
                edge.addRoundedBendsPolyline(8, 2) => [
                    // ... and use the predefined color for the different dependency types.    
                    it.foreground = DEPENDENCY_CONTROL.color
                    it.lineStyle = LineStyle::DOT
                    it.addHeadArrowDecorator
                ]
            } else if (dependency instanceof ExpressionDependency) {
                edge.addRoundedBendsPolyline(8, 2) => [
                    // ... and use the predefined color for the different dependency types.    
                    it.foreground = DEPENDENCY_EXPRESSION.color
                    it.lineStyle = LineStyle::SOLID
                    it.addHeadArrowDecorator
                ]
            } else if (dependency instanceof GuardDependency) {
                edge.addRoundedBendsPolyline(8, 2) => [
                    // ... and use the predefined color for the different dependency types.    
                    it.foreground = DEPENDENCY_GUARD.color
                    it.lineStyle = LineStyle::DASHDOTDOT
                    it.addHeadArrowDecorator
                ]
                edge.setProperty(GRAPH_DEPENDENCY, dependency);
            } else if (dependency instanceof TickBoundaryDependency) {
                edge.addRoundedBendsPolyline(8, 2) => [
                    // ... and use the predefined color for the different dependency types.    
                    it.foreground = DEPENDENCY_TICKBOUNDARY.color
                    it.lineStyle = LineStyle::DOT
                    it.addHeadArrowDecorator
                ]
            }

            // If dependency edges are layouted, use the dependency ports to attach the edges.
            if ((LAYOUT_DEPENDENCIES.booleanValue) || (isSCPDG) || (isGuardSCG)) {
                if (isGuardSCG) {
                    edge.sourcePort = sourceNode.addHelperPort(edge.hashCode.toString, PortSide::SOUTH)
                    edge.targetPort = targetNode.addHelperPort(edge.hashCode.toString, PortSide::NORTH)
                    if (dependency instanceof GuardDependency) {
                        targetNode => [
                            val polyline = it.getData(typeof(KRoundedRectangle)).foreground = DEPENDENCY_GUARD.color
                            polyline.foreground.propagateToChildren = true
                        ]
                    }
                    sourceNode.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
                } else {
                    edge.sourcePort = sourceNode.getPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOINGDEPENDENCY)
                    edge.targetPort = targetNode.getPort(SCGraphSynthesisHelper.SCGPORTID_INCOMINGDEPENDENCY)
                }
            } else {
                // Otherwise, add NO_LAYOUT as layout option to trigger node-to-node hierarchy-crossover
                // drawing.
                edge.setLayoutOption(CoreOptions::NO_LAYOUT, true)
            }

            // hide if only selected elements should be shown
            if (SELECTIVE_DEPENDENCIES.booleanValue) {
                edge.initiallyHide
            }
        ]

        dependency
    }

    private def void synthesizeSchedule(SCGraph scg) {
        if(!scg.hasSchedulingData) return;

        for (node : scg.nodes) {
            if (!node.dependencies.filter(ScheduleDependency).empty) {
                val sourceKNode = node.node
                val targetNode = node.dependencies.filter(ScheduleDependency).head.target
                val targetKNode = targetNode.node
                val nonScheduleDependencies = node.dependenciesView.filter[!(it instanceof ScheduleDependency)].filter [
                    target == targetNode
                ]

                if (!nonScheduleDependencies.empty) {
                    nonScheduleDependencies.forEach [
                        colorDependency(SCHEDULING_SCHEDULINGEDGE.color)
                        thickenDependency(CONTROLFLOW_SCHEDULINGEDGE_WIDTH)
                        dependencyAlpha(SCHEDULING_SCHEDULINGEDGE_ALPHA)
                    ]
                } else {
                    node.createEdge => [
                        it.source = sourceKNode
                        it.target = targetKNode
                        it.addRoundedBendsPolyline(8, CONTROLFLOW_SCHEDULINGEDGE_WIDTH) => [
                            it.foreground = SCHEDULING_SCHEDULINGEDGE.color
                            it.foreground.alpha = SCHEDULING_SCHEDULINGEDGE_ALPHA
                            it.addHeadArrowDecorator
                        ]
                        if (!isGuardSCG) {
                            it.setLayoutOption(CoreOptions::NO_LAYOUT, true)
                        } else {
                            it.sourcePort = sourceKNode.addHelperPort(it.hashCode.toString, PortSide::SOUTH)
                            it.targetPort = targetKNode.addHelperPort(it.hashCode.toString, PortSide::NORTH)
                        }
                    ]
                }
            }
        }
    }

    /**
     * Calls the analyses visualization class. 
     * Each additional analysis stored by the scheduler can hook they visualization in the visualization class.
     * 
     * @param scg
     * 			the scg containing additional visualization data
     * @return Returns nothing.
     */
    private def void synthesizeAnalyses(SCGraph scg) {

        if(!SHOW_POTENTIALPROBLEMS.booleanValue) return;

        if(pilNodes.empty) return;
        if(isGuardSCG) return;

        for (n : pilNodes.filter[it !== null]) {
            val nextFlows = n.allNext
            var hasFlows = false
            for (flow : nextFlows) {
                if (pilNodes.contains(flow.target)) {
                    flow.colorControlFlow(PROBLEM_COLOR.color)
                    flow.thickenControlFlow(PROBLEM_WIDTH)
                    hasFlows = true
                }
            }

            if (!hasFlows) {
                val nextDeps = n.eContents.filter(DataDependency).filter[concurrent && !confluent].toList
                for (flow : nextDeps) {
                    if (pilNodes.contains(flow.target)) {
                        flow.colorDependency(PROBLEM_COLOR.color)
                        flow.thickenDependency(PROBLEM_WIDTH)
                    }
                }
            }
        }
    }
    
    /**
     * Improves straightness of edges on the main flow of the sequentialized SCG
     */
    private def improveMainlineStraightness(KNode root) {
        val PRIO = 9
        val nodes = newLinkedHashMap
        for (node : root.children) { // Does not work with hierarchy
            nodes.put(node, new Pair(
                node.incomingEdges.filter[origin instanceof ControlFlow].toList,
                node.outgoingEdges.filter[origin instanceof ControlFlow].toList
            ))
        }
        
        var processed = newHashSet
        do {
            processed.clear
            
            for (entry : nodes.entrySet) {
                val node = entry.key
                val incoming = entry.value.key
                val outgoing = entry.value.value
                
                if (incoming.empty) {
                    // Will not work with pauses
                    outgoing.forEach[setLayoutOption(LayeredOptions.PRIORITY_STRAIGHTNESS, PRIO)]
                    processed += node
                } else if (incoming.exists[getProperty(LayeredOptions.PRIORITY_STRAIGHTNESS)?:0 === PRIO]) {
                    // Assuming this is mainline if one incoming has PRIO set
                    if (outgoing.size > 1) {
                        // Will not work if forks are present
                        outgoing.findFirst[
                            val cf = it.origin as ControlFlow
                            val parent = cf.eContainer
                            // Only set on else branch
                            return parent instanceof Conditional && (parent as Conditional).^else === cf
                        ]?.setLayoutOption(LayeredOptions.PRIORITY_STRAIGHTNESS, PRIO)
                    } else {
                        outgoing.forEach[setLayoutOption(LayeredOptions.PRIORITY_STRAIGHTNESS, PRIO)]
                    }
                    processed += node
                }
            }
            
            processed.forEach[nodes.remove(it)]
        } while (!processed.empty)
    }
}
