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
package de.cau.cs.kieler.scg.klighd

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.TickBoundaryDependency
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import de.cau.cs.kieler.scg.processors.SCGAnnotations
import de.cau.cs.kieler.scg.processors.priority.PriorityAuxiliaryData
import org.eclipse.elk.alg.layered.options.LayerConstraint
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.alg.layered.options.NodePlacementStrategy
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.PortAlignment
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortSide

import static de.cau.cs.kieler.scg.klighd.ColorStore.Color.*
import static de.cau.cs.kieler.scg.klighd.SCGraphSynthesisOptions.*
import static de.cau.cs.kieler.scg.processors.SCGAnnotations.*

/**
 * @author kolja
 * 
 */
class SCGraphComponentSynthesis {

    @Inject extension SCGraphSynthesisHelper
    @Inject extension KNodeExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KColorExtensions
    @Inject extension KLabelExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCGraphShapes
    @Inject extension KPortExtensions
    @Inject extension SCGMethodExtensions
    @Inject extension ColorStore

    /**
     * This dispatch method is triggered when an assignment must be synthesized.
     * 
     * @param assignment
     *          the assignment in question.
     * @return Returns the top level KNode. 
     */
    def dispatch createComponentNode(Assignment assignment) {
        val node = assignment.createNode().associateWith(assignment)
        // Straightforward rectangle drawing
        val figure = node.addRoundedRectangle(SCGraphSynthesisHelper.CORNERRADIUS, SCGraphSynthesisHelper.CORNERRADIUS,
            SCGraphSynthesisHelper.LINEWIDTH)
        figure.addText("").setSurroundingSpace(6, 0, 2, 0)
        var isSCGRef = false
        if (assignment.expression instanceof ReferenceCall) {
            val call = assignment.expression as ReferenceCall
            val decl = call.valuedObject?.eContainer
            if (decl instanceof ReferenceDeclaration) {
                isSCGRef = decl.reference instanceof SCGraph
            }
        }
        if (isSCGRef) {
            figure.setBackgroundGradient("#fcf7fc".color, "#e6cbf2".color, 90.0f)
        } else {
            figure.background = "white".color;
        }
        node.initialiseFigure(assignment)

        // Add ports for control-flow and dependency routing.
        if (isGuardSCG) {
            node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE)
        }

        if (isGuardSCG) {
            if (assignment.incomingLinks.empty ||
                assignment.incomingLinks.forall[it instanceof TickBoundaryDependency]) {
                node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::FIRST)
            }
        }

        node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER)
        node.addLayoutParam(CoreOptions::PORT_ALIGNMENT_DEFAULT, PortAlignment::CENTER)
        node.addLayoutParam(CoreOptions::SPACING_PORT_PORT, 10.0)
        if (!isGuardSCG) {
            if (topdown()) {
                node.addPort("dummyN", 27, 0, 1, PortSide::NORTH).setProperty(CoreOptions::PORT_INDEX, 0)
                node.addPort(SCGraphSynthesisHelper.SCGPORTID_INCOMING, 37, 0, 1, PortSide::NORTH).setProperty(
                    CoreOptions::PORT_INDEX, 1)
                node.addPort("dummyS", 27, 0, 1, PortSide::SOUTH).setProperty(CoreOptions::PORT_INDEX, 2)
                node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOING, 37, 24, 0, PortSide::SOUTH).setProperty(
                    CoreOptions::PORT_INDEX, 1)
                node.addPort(SCGraphSynthesisHelper.SCGPORTID_INCOMINGDEPENDENCY, 47, 0, 1, PortSide::NORTH).
                    setProperty(CoreOptions::PORT_INDEX, 2)
                node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOINGDEPENDENCY, 47, 24, 0, PortSide::SOUTH).
                    setProperty(CoreOptions::PORT_INDEX, 0)
            // node.addPort("DEBUGPORT", MINIMALWIDTH, MINIMALHEIGHT / 2, 1, PortSide::SOUTH)
            } else {
                node.addPort("dummyN", 27, 0, 1, PortSide::WEST).setProperty(CoreOptions::PORT_INDEX, 0)
                node.addPort(SCGraphSynthesisHelper.SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST).setProperty(
                    CoreOptions::PORT_INDEX, 1)
                node.addPort("dummyS", 27, 0, 1, PortSide::EAST).setProperty(CoreOptions::PORT_INDEX, 2)
                node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOING, 75, 12.5f, 1, PortSide::EAST).setProperty(
                    CoreOptions::PORT_INDEX, 1)
                node.addPort(SCGraphSynthesisHelper.SCGPORTID_INCOMINGDEPENDENCY, 0, 19, 1, PortSide::WEST).setProperty(
                    CoreOptions::PORT_INDEX, 2)
                node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOINGDEPENDENCY, 75, 19, 1, PortSide::EAST).
                    setProperty(CoreOptions::PORT_INDEX, 0)
                node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOINGDEPENDENCY, 75, 19, 1, PortSide::EAST).
                    setProperty(CoreOptions::PORT_INDEX, 0)
            }
        } else {
            if (assignment.hasAnnotation(SCGAnnotations.ANNOTATION_HEADNODE)) {
                var sbHeadNodeName = assignment.getStringAnnotationValue(SCGAnnotations.ANNOTATION_HEADNODE)
                sbHeadNodeName.createLabel(node).associateWith(assignment).
                    configureOutsideTopLeftNodeLabel(sbHeadNodeName, 9, KlighdConstants::DEFAULT_FONT_NAME).
                    KRendering.foreground = "black".color
            }
        }

        // Draw the node priorities
        if (assignment.hasAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION)) {
            node.createPriorityLabel(assignment).setAreaPlacementData.from(LEFT, 0, -0.9f, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0)
        }

        // Draw the optimized node priority IDs
        if (assignment.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)) {
            node.createOptimizedPriorityLabel(assignment).setAreaPlacementData.from(LEFT, 0, 0.9f, TOP, 0, 0.3f).to(RIGHT, 0, 0.9f, BOTTOM, 0, 0)
        }
        return node
    }
    
    /**
     * This dispatch method is triggered when a conditional must be synthesized.
     * 
     * @param conditional
     *          the conditional in question.
     * @return Returns the top level KNode. 
     */
    def dispatch createComponentNode(Conditional conditional) {
        val node = conditional.createNode().associateWith(conditional)
        // Draw a diamond figure for conditionals.
        node.addPolygon.createDiamondShape
        node.initialiseFigure(conditional)
        // Add ports for control-flow and dependency routing.
        var switchBranch = false
        val branchAnnotation = conditional.getAnnotation(ANNOTATION_BRANCH)
        if (branchAnnotation instanceof StringAnnotation) {
            val annotationValue = (branchAnnotation as StringAnnotation).getValues.head
            if (annotationValue == "switch") {
                switchBranch = true
            }
        }
        node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER)
        node.addLayoutParam(CoreOptions::PORT_ALIGNMENT_DEFAULT, PortAlignment::CENTER)
        node.addLayoutParam(CoreOptions::SPACING_PORT_PORT, 10.0)
        var KPort port
        if (topdown) {
            node.addPort("dummyN", 27, 0, 1, PortSide::NORTH).setProperty(CoreOptions::PORT_INDEX, 0)
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_INCOMING, 37, 0, 1, PortSide::NORTH).setProperty(
                CoreOptions::PORT_INDEX, 1)
            node.addPort("dummyS", 27, 0, 1, PortSide::SOUTH).setProperty(CoreOptions::PORT_INDEX, 2)
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOING_ELSE, 37.5f, 24, 0, PortSide::SOUTH).setProperty(
                CoreOptions::PORT_INDEX, 1)
            if (switchBranch)
                port = node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOING_THEN, 7, 12.5f, 0, PortSide::WEST)
            else {
                port = node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOING_THEN, 68, 12.5f, 0, PortSide::EAST)
            }
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_INCOMINGDEPENDENCY, 47, 0, 1, PortSide::NORTH).setProperty(
                CoreOptions::PORT_INDEX, 2)
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOINGDEPENDENCY, 47, 21, 1, PortSide::SOUTH).setProperty(
                CoreOptions::PORT_INDEX, 0)
            port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -1.5)
        } else {
            node.addPort("dummyW", 27, 0, 1, PortSide::WEST).setProperty(CoreOptions::PORT_INDEX, 0)
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST).setProperty(
                CoreOptions::PORT_INDEX, 1)
            node.addPort("dummyE", 27, 0, 1, PortSide::EAST).setProperty(CoreOptions::PORT_INDEX, 2)
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOING_ELSE, 75, 12.5f, 0, PortSide::EAST).setProperty(
                CoreOptions::PORT_INDEX, 1)
            if (switchBranch)
                port = node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOING_THEN, 37.5f, 0, 0, PortSide::NORTH)
            else {
                port = node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOING_THEN, 37.5f, 20, 0, PortSide::SOUTH)
            }
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_INCOMINGDEPENDENCY, 0, 19, 1, PortSide::WEST).setProperty(
                CoreOptions::PORT_INDEX, 2)
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOINGDEPENDENCY, 75, 19, 1, PortSide::EAST).setProperty(
                CoreOptions::PORT_INDEX, 0)
            port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.0)
        }
        // Removed as suggested by uru (mail to cmot, 11.11.2016)  
        if (!SCGraph.hasAnnotation(SCGAnnotations.ANNOTATION_SEQUENTIALIZED) &&
            !CONDITIONAL_LEFT_OR_RIGTH.booleanValue)
            port.addLayoutParam(LayeredOptions.ALLOW_NON_FLOW_PORTS_TO_SWITCH_SIDES, Boolean.TRUE);

        // Added as suggested by uru (mail to cmot, 11.11.2016)            
        port.addLayoutParam(LayeredOptions::NODE_PLACEMENT_STRATEGY, NodePlacementStrategy.NETWORK_SIMPLEX);

        // Draw the node priorities
        if (conditional.hasAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION)) {
            node.createPriorityLabel(conditional).setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0.6f)
        }

        // Draw the optimized node priority IDs
        if (conditional.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)) {
            node.createOptimizedPriorityLabel(conditional).setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0.6f).to(RIGHT, 0, 0, BOTTOM, 0, 0)
        }
        return node
    }

    /**
     * This dispatch method is triggered when a surface must be synthesized.
     * 
     * @param surface
     *          the surface in question.
     * @return Returns the top level KNode. 
     */
    def dispatch createComponentNode(Surface surface) {
        val node = surface.createNode().associateWith(surface)
        // Draw a surface node...
        if (topdown) {
            node.addPolygon().createSurfaceShape()
        } else {
            node.addPolygon().createSurfaceLandscapeShape()
        }
        node.initialiseFigure(if(SHOW_CAPTION.booleanValue) "surface" else "")
        // Add ports for control-flow/tick edge routing.
        node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
        if (topdown) {
            val port = node.addPort(SCGraphSynthesisHelper.SCGPORTID_INCOMING, 37, 0, 1, PortSide::NORTH)
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOING, 37, 25, 0, PortSide::SOUTH)
            port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.5)
        } else {
            val port = node.addPort(SCGraphSynthesisHelper.SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST)
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOING, 75, 12.5f, 0, PortSide::EAST)
            port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.5)
        }

        // Draw the node priorities
        if (surface.hasAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION)) {
            node.createPriorityLabel(surface).setAreaPlacementData.from(LEFT, 0, -0.8f, TOP, 0, 0.6f)
        }

        // Draw the optimized node priority IDs
        if (surface.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)) {
            node.createOptimizedPriorityLabel(surface).setAreaPlacementData.from(LEFT, 0, 0.8f, TOP, 0, 0.6f)
        }
        return node
    }

    /**
     * This dispatch method is triggered when a depth must be synthesized.
     * 
     * @param depth
     *          the depth in question.
     * @return Returns the top level KNode. 
     */
    def dispatch createComponentNode(Depth depth) {
        val node = depth.createNode().associateWith(depth)
        // If the corresponding option is set to true, depth nodes are placed in the first layer.
        if (ALIGN_TICK_START.booleanValue)
            node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::FIRST)
        if (topdown) {
            node.addPolygon().createDepthShape()
        } else {
            node.addPolygon().createDepthLandscapeShape()
        }
        node.initialiseFigure(if(SHOW_CAPTION.booleanValue) "depth" else "")
        // Add ports for control-flow/tick edge routing.
        node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
        if (topdown) {
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_INCOMING, 37, 0, 1, PortSide::NORTH)
            val port = node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOING, 37.5f, 25, 0, PortSide::SOUTH)
            port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.5)
        } else {
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST)
            val port = node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOING, 75, 12.5f, 0, PortSide::EAST)
            port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.5)
        }

        // Draw the node priorities
        if (depth.hasAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION)) {
            node.createPriorityLabel(depth).setAreaPlacementData.from(LEFT, 0, -0.8f, TOP, 0, -0.3f).to(RIGHT, 0, 0, BOTTOM, 0, 0)
        }

        // Draw the optimized node priority IDs
        if (depth.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)) {
            node.createOptimizedPriorityLabel(depth).setAreaPlacementData.from(LEFT, 0, 0.8f, TOP, 0, -0.3f).to(RIGHT, 0, 0, BOTTOM, 0, 0)
        }
        return node
    }

    /**
     * This dispatch method is triggered when an entry must be synthesized.
     * 
     * @param entry
     *          the entry node in question.
     * @return Returns the top level KNode. 
     */
    def dispatch createComponentNode(Entry entry) {
        val node = entry.createNode().associateWith(entry)
        val scg = entry.eContainer as SCGraph
        // If the corresponding option is set to true, exit nodes are placed in the first layer;
        if (ALIGN_ENTRYEXIT_NODES.booleanValue)
            node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::FIRST)
        // Draw an ellipse figure for exit nodes...
        val figure = node.addEllipse().background = "white".color;
        figure.addText("").setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 1, 0)
        val text = if(entry.hasAnnotation("label")) entry.getStringAnnotationValue("label") else "entry"
        node.initialiseFigure(SHOW_CAPTION.booleanValue ? text : "")
        if (scg.method) {
            val method = scg.methodDeclaration
            node.addOutsideTopCenteredNodeLabel(
                (method.returnType !== ValueType.PURE ? method.returnType.literal : "void") + " " +
                    method.valuedObjects.head.name + "(" + method.parameterDeclarations.filter(VariableDeclaration).map [
                        type.literal
                    ].join(", ") + ")"
            )
        }

        // Add ports for control-flow routing.
        if (isGuardSCG) {
            node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE)
        } else {
            node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER)
        }
        node.addLayoutParam(CoreOptions::PORT_ALIGNMENT_DEFAULT, PortAlignment::CENTER)
        node.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 10d)
        if (topdown) {
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_INCOMING, 37, 0, 1, PortSide::NORTH)
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOING, 37, 25, 0, PortSide::SOUTH)
        } else {
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST)
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOING, 75, 12.5f, 0, PortSide::EAST)
        }

        // If there is an reset SCG, add it to the diagram
        if (entry.resetSCG !== null) {
            val properties = new KlighdSynthesisProperties
            properties.setProperty(KlighdSynthesisProperties.REQUESTED_UPDATE_STRATEGY, SimpleUpdateStrategy.ID)
            val subDiagramViewContext = LightDiagramServices::translateModel2(entry.resetSCG, synthesis.usedContext, properties)
            val subDiagramNode = subDiagramViewContext.viewModel
            val subDiagramChildrenNodes = subDiagramNode.children.immutableCopy 
            rootNode.children.addAll(subDiagramChildrenNodes)
            createResetTickEdge(subDiagramChildrenNodes.last, node)
            node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::NONE)
            subDiagramChildrenNodes.last.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT,
                LayerConstraint::NONE)
        }

        // Draw the node priorities
        if (entry.hasAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION)) {
            node.createPriorityLabel(entry).setAreaPlacementData.from(LEFT, 0, -0.8f, TOP, 0, 0.1f)
        }

        // Draw the optimized node priority IDs
        if (entry.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)) {
            node.createOptimizedPriorityLabel(entry).setAreaPlacementData.from(LEFT, 0, 0.8f, TOP, 0, 0.1f)
        }
        return node
    }

    /**
     * This dispatch method is triggered when an exit must be synthesized.
     * 
     * @param exit
     *          the exit node in question.
     * @return Returns the top level KNode. 
     */
    def dispatch createComponentNode(Exit exit) {
        val node = exit.createNode().associateWith(exit)
        if (USE_ADAPTIVEZOOM.booleanValue)
            node.setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.50)
        // If the corresponding option is set to true, exit nodes are placed in the last layer.
        if (ALIGN_ENTRYEXIT_NODES.booleanValue)
            node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::LAST)
        // Draw an ellipse for an exit node...
        val figure = node.addEllipse().background = "white".color;
        figure.addText("").setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 1, 0)
        node.initialiseFigure(SHOW_CAPTION.booleanValue ? "exit" : "")

        if (exit.final) {
            figure.background = PASSIVE_REGION_COLOR.color
        }

        // Add ports for control-flow routing.
        if (isGuardSCG) {
            node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE)
        } else {
            node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER)
        }
        node.addLayoutParam(CoreOptions::PORT_ALIGNMENT_DEFAULT, PortAlignment::CENTER)
        node.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 10d)
        if (topdown) {
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_INCOMING, 37, 0, 1, PortSide::NORTH)
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOING, 37, 25, 0, PortSide::SOUTH)
        } else {
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST)
            node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOING, 75, 12.5f, 0, PortSide::EAST)
        }

        // Draw the node priorities
        if (exit.hasAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION)) {
            node.createPriorityLabel(exit).setAreaPlacementData.from(LEFT, 0, -0.8f, TOP, 0, 0.1f)
        }

        // Draw the optimized node priority IDs
        if (exit.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)) {
            node.createOptimizedPriorityLabel(exit).setAreaPlacementData.from(LEFT, 0, 0.8f, TOP, 0, 0.1f)
        }
        return node
    }

    /**
     * This dispatch method is triggered when a fork must be synthesized.
     * 
     * @param fork
     *          the fork node in question.
     * @return Returns the top level KNode. 
     */
    def dispatch createComponentNode(Fork fork) {
        val node = fork.createNode().associateWith(fork)
        // Draw a fork triangle...
        if (topdown) {
            node.addPolygon().createTriangleShape()
        } else {
            node.addPolygon().createTriangleLandscapeShape();
        }
        node.initialiseFigure(SHOW_CAPTION.booleanValue ? "fork" : "")
        // Only add one port for incoming control flow edges.
        // Outgoing ports are added by the control flows.
        node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
        if (topdown) {
            val port = node.addPort(SCGraphSynthesisHelper.SCGPORTID_INCOMING, 36, 0, 1, PortSide::NORTH)
            port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.5)
        } else {
            val port = node.addPort(SCGraphSynthesisHelper.SCGPORTID_INCOMING, 0, 37.5f, 1, PortSide::WEST)
            port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.5)
        }

        // Draw the node priorities
        if (fork.hasAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION)) {
            node.createPriorityLabel(fork).setAreaPlacementData.from(LEFT, 0, -0.6f, TOP, 0, 0.6f)
        }

        // Draw the optimized node priority IDs
        if (fork.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)) {
            node.createOptimizedPriorityLabel(fork).setAreaPlacementData.from(LEFT, 0, 0.6f, TOP, 0, 0.6f)
        }
        return node
    }

    /**
     * This dispatch method is triggered when a join must be synthesized.
     * 
     * @param join
     *          the join node in question.
     * @return Returns the top level KNode. 
     */
    def dispatch createComponentNode(Join join) {
        val node = join.createNode().associateWith(join)
        // Draw a join triangle...
        if (topdown) {
            node.addPolygon().createTriangleShapeReversed()
        } else {
            node.addPolygon().createTriangleLandscapeShapeReversed()
        }
        node.initialiseFigure("join")
        // Only add one port for an outgoing control flow edge.
        // Incoming ports are added by the control flows.
        node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
        if (topdown) {
            val port = node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOING, 36, 25, 0, PortSide::SOUTH)
            port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -0.5)
        } else {
            val port = node.addPort(SCGraphSynthesisHelper.SCGPORTID_OUTGOING, 0, 37.5f, 0, PortSide::EAST)
            port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -0.5)
        }

        // Draw the node priorities
        if (join.hasAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION)) {
            node.createPriorityLabel(join).setAreaPlacementData.from(LEFT, 0, -0.6f, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0.6f)
        }

        // Draw the optimized node priority IDs
        if (join.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)) {
            node.createOptimizedPriorityLabel(join).setAreaPlacementData.from(LEFT, 0, 0.6f, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0.6f)
        }
        return node
    }
}
