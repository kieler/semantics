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
import de.cau.cs.kieler.annotations.Annotatable
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.keffects.Dependency
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KColor
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.KRoundedBendsPolyline
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGSerializeHRExtensions
import de.cau.cs.kieler.scg.processors.priority.PriorityAuxiliaryData
import java.util.List
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortSide
import org.eclipse.elk.graph.properties.Property
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.serializer.ISerializer

import static de.cau.cs.kieler.scg.klighd.ColorStore.Color.*
import static de.cau.cs.kieler.scg.processors.SCGAnnotations.*
import static de.cau.cs.kieler.scg.klighd.SCGraphSynthesisOptions.*

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author kolja
 * 
 */
@ViewSynthesisShared
class SCGraphSynthesisHelper {

    @Inject extension KNodeExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KColorExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension KPortExtensions
    @Inject extension SCGSerializeHRExtensions
    @Inject extension KEdgeExtensions
    @Inject extension ColorStore

    protected var AbstractDiagramSynthesis<SCGraph> synthesis

    protected SCGraph SCGraph
    protected KNode rootNode;
    protected boolean isGuardSCG
    /** current selected orientation */
    protected int orientation

    protected static val float CORNERRADIUS = 2.0f
    protected static val float LINEWIDTH = 1.0f
    static val int MINIMALWIDTH = 75
    static val int MINIMALHEIGHT = 25

    /** Constants for semantic object mapping */
    protected static val String SCGPORTID_INCOMING = "incoming"
    protected static val String SCGPORTID_OUTGOING = "outgoing"
    protected static val String SCGPORTID_OUTGOING_THEN = "outgoingThen"
    protected static val String SCGPORTID_OUTGOING_ELSE = "outgoingElse"
    protected static val String SCGPORTID_HIERARCHYPORTS = "hierarchyPorts"
    protected static val String SCGPORTID_INCOMINGDEPENDENCY = "incomingDependency"
    protected static val String SCGPORTID_OUTGOINGDEPENDENCY = "outgoingDependency"
    protected static val String ANNOTATIONRECTANGLE = "caRectangle"

    public static val NODE_PRIO_PROPERTY = new Property<Boolean>("scgPriority.NodePriority", false)
    public static val OPT_PRIO_PROPERTY = new Property<Boolean>("scgPriority.OptNodePriority", false)

    /** Constants for the graph orientation */
    protected static val int ORIENTATION_PORTRAIT = 0
    protected static val int ORIENTATION_LANDSCAPE = 1

    def getBooleanValue(SynthesisOption option) {
        synthesis.getBooleanValue(option)
    }

    def getFloatValue(SynthesisOption option) {
        synthesis.getFloatValue(option)
    }

    def getObjectValue(SynthesisOption option) {
        synthesis.getObjectValue(option)
    }

    def <T extends EObject> T associateWith(T derived, Object source) {
        synthesis.associateWith(derived, source)
    }

    def applyAdaptiveZoom(KNode model) {
        model.eAllContents.filter(KNode).toList.forEach [
            setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.50)
            eAllContents.filter(KText).toList.forEach [
                setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70)
            ]
            labels.forEach [
                setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70)
            ]
        ]
    }

    def propagateAssociation(KNode model) {
        model.eAllContents.filter(KNode).toList.forEach [
            val association = node.getProperty(KlighdInternalProperties.MODEL_ELEMEMT)
            if (association !== null) {
                it.eAllContents.filter(de.cau.cs.kieler.klighd.krendering.KRendering).forEach [
                    if (getProperty(KlighdInternalProperties.MODEL_ELEMEMT) === null) {
                        associateWith(association)
                    }
                ]
            }
        ]
    }

    def initialiseFigure(KNode node, Object object) {
        node.setMinimalNodeSize(MINIMALWIDTH, MINIMALHEIGHT)
        val figure = node.data.filter(KContainerRendering).last
        if(SHOW_SHADOW.booleanValue) figure.shadow = "black".color
        var label = ""
        if (object instanceof Annotatable) {
            if (object.hasAnnotation(ANNOTATION_LABEL)) {
                label = object.getStringAnnotationValue(ANNOTATION_LABEL)
            } else if (object.hasAnnotation(ANNOTATION_RETURN_NODE)) {
                label = "return " + serializeHR(object)
            } else {
                label = serializeHR(object) as String
            }
        } else if (object instanceof String) {
            label = object
        }
        figure.children.filter(KText).head.text = label
    }

    /**
     * Draw a dotted line from the corresponding surface node to the given depth node.
     * 
     * @param depth
     *          the depth (target= node of the tick edge
     * @return Returns the KEdge.
     */
    def KEdge synthesizeTickEdge(Depth depth) {
        return depth.createNewEdge().associateWith(depth) => [ edge |
            edge.source = depth.surface?.node;
            edge.target = depth.node;
            edge.sourcePort = depth.surface?.node.getPort(SCGPORTID_OUTGOING)
            edge.targetPort = depth.node.getPort(SCGPORTID_INCOMING)
            edge.setProperty(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
            edge.addRoundedBendsPolyline(8, CONTROLFLOW_THICKNESS.floatValue) => [
                it.lineStyle = LineStyle::DOT;
            ]
            if (USE_ADAPTIVEZOOM.booleanValue)
                edge.setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
        ]
    }

    def KEdge createResetTickEdge(KNode resetExit, KNode entry) {
        entry.addHelperPort("resettick", PortSide::NORTH)
        resetExit.addHelperPort("resettick2", PortSide::SOUTH)
        entry.addHelperPort("resettick2", PortSide::NORTH)
        resetExit.addHelperPort("resettick", PortSide::SOUTH)

        val resetTickEdge = createNewEdge() => [ edge |
            edge.source = resetExit
            edge.target = entry
            edge.sourcePort = resetExit.getPort("resettick")
            edge.targetPort = entry.getPort("resettick")
            edge.setProperty(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
            edge.addLayoutParam(LayeredOptions::PRIORITY, 0);
            edge.addRoundedBendsPolyline(8, CONTROLFLOW_THICKNESS.floatValue) => [
                it.lineStyle = LineStyle::DOT;
                it.foreground = Colors.RED
            ]
            if (USE_ADAPTIVEZOOM.booleanValue)
                edge.setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
        ]

        return resetTickEdge
    }

    def createPriorityLabel(KNode node, Annotatable object) {
        val nodePrio = (object.getAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION) as IntAnnotation).value
        val txt = node.KContainerRendering.addText(nodePrio.toString)
        txt.setProperty(SCGraphSynthesisHelper.NODE_PRIO_PROPERTY, true)
        txt.setForeground(NODE_PRIORITY_COLOR.color)
        txt.setFontBold(true)
        txt.setFontSize(7)
    }

    def createOptimizedPriorityLabel(KNode node, Annotatable object) {
        val optNodePrio = (object.getAnnotation(
            PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) as IntAnnotation).value
        val txt = node.KContainerRendering.addText(optNodePrio.toString)
        txt.setProperty(SCGraphSynthesisHelper.OPT_PRIO_PROPERTY, true)
        txt.setForeground(OPT_PRIORITY_COLOR.color)
        txt.setFontBold(true)
        txt.setFontSize(7)
    }

    // -------------------------------------------------------------------------
    // -- Helper: Edges 
    // -------------------------------------------------------------------------
    /**
     * Re-color an existing control flow. All edges, even split up ones, are colored.
     * 
     * @param controlFlow
     *          the control flow in question
     * @param color
     *          the desired color
     * @return Returns the control flow 
     */
    def ControlFlow colorControlFlow(ControlFlow controlFlow, KColor color) {
        controlFlow => [
            allEdges.forEach [
                val polyline = it.getData(typeof(KRoundedBendsPolyline)).foreground = color.copy
                polyline.foreground.propagateToChildren = true
            ]
        ]
    }

    /**
     * Re-alpha an existing control flow. All alpha values, even on split up edges, are changed.
     * 
     * @param controlFlow
     *          the control flow in question
     * @param alpha 
     *          the desired alpha value
     * @return Returns the control flow 
     */
    def ControlFlow controlFlowAlpha(ControlFlow controlFlow, int alpha) {
        controlFlow => [
            allEdges.forEach [
                val polyline = it.getData(typeof(KRoundedBendsPolyline)) => [getForeground.alpha = alpha];
                polyline.foreground.propagateToChildren = true
            ]
        ]
    }

    /**
     * Re-thicken an existing control flow. All edges, even split up ones, are thicken.
     * 
     * @param controlFlow
     *          the control flow in question
     * @param width
     *          the desired edge width
     * @return Returns the control flow 
     */
    def ControlFlow thickenControlFlow(ControlFlow controlFlow, int width) {
        controlFlow => [
            allEdges.forEach [
                val polyline = it.getData(typeof(KRoundedBendsPolyline)).lineWidth = width
                polyline.lineWidth.propagateToChildren = true
            ]
        ]
    }

    /**
     * Re-color an existing tick edge.
     * 
     * @param depth
     *          the depth (target) node of the tick edge in question
     * @param color
     *          the desired color
     * @return Returns the depth. 
     */
    def Depth colorTickEdge(Depth depth, KColor color) {
        depth => [
            allEdges.forEach [
                val polyline = it.getData(typeof(KRoundedBendsPolyline)).foreground = color.copy
                polyline.foreground.propagateToChildren = true
            ]
        ]
    }

    /**
     * Re-thicken an existing tick edge.
     * 
     * @param depth
     *          the depth (target) node of the tick edge in question
     * @param width
     *          the desired edge width
     * @return Returns the depth. 
     */
    def Depth thickenTickEdge(Depth depth, int width) {
        depth => [
            allEdges.forEach [
                val polyline = it.getData(typeof(KRoundedBendsPolyline)).lineWidth = width
                polyline.lineWidth.propagateToChildren = true
            ]
        ]
    }

    /**
     * Re-color an existing dependency. All edges, even split up ones, are colored.
     * 
     * @param dependency
     *          the dependency in question
     * @param color
     *          the desired color
     * @return Returns the dependency 
     */
    def Dependency colorDependency(Dependency dependency, KColor color) {
        dependency => [
            allEdges.forEach [
                val polyline = it.getData(typeof(KRoundedBendsPolyline)).foreground = color.copy
                polyline.foreground.propagateToChildren = true
            ]
        ]
    }

    /**
     * Re-thicken an existing dependency. 
     * 
     * @param dependency
     *          the dependency in question
     * @param width
     *          the desired edge width
     * @return Returns the dependency 
     */
    def Dependency thickenDependency(Dependency dependency, int width) {
        dependency => [
            allEdges.forEach [
                val polyline = it.getData(typeof(KRoundedBendsPolyline)).lineWidth = width
                polyline.lineWidth.propagateToChildren = true
            ]
        ]
    }

    def Dependency dependencyAlpha(Dependency dependency, int alpha) {
        dependency => [
            allEdges.forEach [
                val polyline = it.getData(typeof(KRoundedBendsPolyline)) => [getForeground.alpha = alpha];
                polyline.foreground.propagateToChildren = true
            ]
        ]
    }

    def Node colorNode(Node node, KColor color) {
        node => [
            getNode => [
                val polyline = it.getData(typeof(KRoundedRectangle)).foreground = color.copy
                polyline.foreground.propagateToChildren = true
            ]
        ]
    }

    // -------------------------------------------------------------------------
    // -- Helper: Serialization Strings 
    // -------------------------------------------------------------------------
    def String removeParenthesis(String str) {
        if (str.contains("&")) {
            return str.replaceAll("\\(\\(", "(").replaceAll("\\)\\)", ")");
        }
        return str
    }

    def String serializeIndices(ISerializer serializer, List<Expression> indices) {
        var String indicesStr = ""
        for (index : indices) {
            indicesStr = indicesStr + "[" + serializer.serialize(index.copy) + "]"
        }
        indicesStr
    }

    def RenderingFactory() {
        KRenderingFactory.eINSTANCE
    }

    // -------------------------------------------------------------------------
    // -- Helper: Ports 
    // -------------------------------------------------------------------------
    def KPort addPort(KNode node, String mapping, float x, float y, int size, PortSide side) {
        node.createPort(mapping) => [
            it.addLayoutParam(CoreOptions::PORT_SIDE, side);
            it.setPortPos(x, y)
            it.setPortSize(size, size)
            it.addRectangle.invisible = true;
            node.ports += it
        ]
    }

    def KPort addPortFixedSide(KNode node, String mapping, PortSide side) {
        node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
        node.addPort(mapping, 37, 0, 3, side)
    }

    def KPort addHelperPort(KNode node, String mapping) {
        node.createPort(mapping) => [
            node.ports += it
        ]
    }

    def KPort addHelperPort(KNode node, String mapping, PortSide side) {
        node.createPort(mapping) => [
            it.addLayoutParam(CoreOptions::PORT_SIDE, side);
            node.ports += it
        ]
    }

    def boolean topdown() {
        orientation == ORIENTATION_PORTRAIT
    }

    def boolean leftright() {
        orientation == ORIENTATION_LANDSCAPE
    }
}
