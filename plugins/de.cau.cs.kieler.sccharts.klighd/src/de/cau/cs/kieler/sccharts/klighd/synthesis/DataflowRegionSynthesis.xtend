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
package de.cau.cs.kieler.sccharts.klighd.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kitt.klighd.tracing.TracingVisualizationProperties
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.klighd.krendering.KPolygon
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.CallNode
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.DefineNode
import de.cau.cs.kieler.sccharts.Equation
import de.cau.cs.kieler.sccharts.Node
import de.cau.cs.kieler.sccharts.ReferenceNode
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtension
import de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.ShadowHook
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.ControlflowRegionStyles
import org.eclipse.elk.alg.layered.p4nodes.NodePlacementStrategy
import org.eclipse.elk.alg.layered.properties.LayeredOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.core.options.NodeLabelPlacement
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortLabelPlacement
import org.eclipse.elk.core.options.PortSide

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Transforms {@link DataflowRegion} into {@link KNode} diagram elements.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class DataflowRegionSynthesis extends SubSynthesis<DataflowRegion, KNode> {

    @Inject 
    extension KNodeExtensions

    @Inject
    extension KEdgeExtensions

    @Inject
    extension KLabelExtensions

    @Inject
    extension KPortExtensions

    @Inject
    extension KRenderingExtensions

    @Inject
    extension KContainerRenderingExtensions

    @Inject
    extension KPolylineExtensions

    @Inject
    extension KColorExtensions

    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension ControlflowRegionStyles
    
    @Inject
    extension SCChartsSerializeHRExtension
    
    @Inject
    extension StateSynthesis
     
    override performTranformation(DataflowRegion region) {
        val node = region.createNode().associateWith(region);

        // Set KIdentifier for use with incremental update
        if (!region.id.nullOrEmpty) {
            node.data += KGraphFactory::eINSTANCE.createKIdentifier => [it.id = region.id]
        }

        node.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.layered");
        node.addLayoutParam(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
        node.addLayoutParam(CoreOptions::DIRECTION, Direction::RIGHT);
        node.addLayoutParam(LayeredOptions::THOROUGHNESS, 100);
        node.addLayoutParam(LayeredOptions::NODE_PLACEMENT_STRATEGY, NodePlacementStrategy::BRANDES_KOEPF);

        node.setLayoutOption(KlighdProperties::EXPAND, true);

        val label = if(region.label.nullOrEmpty) "" else " " + region.label;

        // Expanded
        node.addRegionFigure => [
            setAsExpandedView
            if (region.declarations.empty) {
                addStatesArea(label.nullOrEmpty);
            } else {
                addStatesAndDeclarationsArea();
                // Add declarations
                // TODO display declaration otherwise
                for (declaration : region.declarations) {
                    addDeclarationLabel(declaration.serializeHighlighted(true)) => [
                        setProperty(TracingVisualizationProperties.TRACING_NODE, true);
                        associateWith(declaration);
                        children.forEach[associateWith(declaration)];
                    ]
                }
            }
            // Add Button after area to assure correct overlapping
            addButton("[-]" + label).addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
        ]

        // Collapsed
        node.addRegionFigure => [
            setAsCollapsedView
            addButton("[+]" + label).addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
        ]
        

        // Add inner dataflow nodes
        for (dNode : region.nodes) {
            if (dNode instanceof DefineNode) {
                //skip
            } else {
                // translate reference/call nodes
                node.children += dNode.translate;
            }
        }
        // translate all direct dataflow equations
        for (equation: region.equations) {
            val vo = equation.valuedObject
            // create output node and shape for every valued object (output variable) described
            node.children += vo.createNode(node) => [
                it.addPolygon.createOutputNodeShape
                it.setMinimalNodeSize(MINIMALNODEWIDTH * 1.5f, MINIMALNODEHEIGHT / 2)
                it.addDefaultLayoutParameter
                //add Port
                it.addPort(vo.reference, PortSide::WEST) => [
                    it.addLayoutParam(CoreOptions.PORT_BORDER_OFFSET, -2.0)
                ]
                it.createLabel(it).configureInsideTopCenteredNodeLabel(
                    vo.reference.serialize as String,
                    LABELFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                // translate the expression which belongs to the valued object
                val expr = equation.expression
                node.children += expr.translate(region.equations.indexOf(equation), node, region)
            ]
        }

        return node;
    }
    
    private static val int MINIMALNODEWIDTH = 40
    private static val int MINIMALNODEHEIGHT = 40
    private var regionCounter = 0
    private static val int PORTFONTSIZE = 10
    private static val int LABELFONTSIZE = 10

    // -------------------------------------------------------------------------
    // create collapse and expand functionality
    private def KNode addCollapseExpand(KNode n, String label) { // Dataflow d
        var regionLabelVar = label //d.label
        val regionLabel = regionLabelVar
        n.addRectangle() => [
                it.setProperty(KlighdProperties::EXPANDED_RENDERING, true);
                it.setBackgroundGradient("#fff".color, "#fff".color, 90);
                it.setSurroundingSpace(2, 0);
                it.invisible = false;
                it.foreground = "gray".color
                it.lineWidth = 1
                it.addText("[-]" + if(regionLabel.nullOrEmpty) "" else " " + regionLabel) => [
                    it.foreground = "dimGray".color
                    it.fontSize = 10
                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                ];
                if (true) {
                    it.addChildArea().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
                }
            ];
            n.addRectangle() => [
                it.setProperty(KlighdProperties::COLLAPSED_RENDERING, true);
                it.setBackground("white".color);
                it.setSurroundingSpace(2, 0) //(4, 0);
                it.invisible = false;
                it.foreground = "gray".color
                it.lineWidth = 1
                it.addText("[+]" + if(regionLabel.nullOrEmpty) "" else " " + regionLabel) => [
                    it.foreground = "dimGray".color
                    it.fontSize = 10
                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                ];
                if (true) {
                    it.addRectangle().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0).invisible = true;
                }
            ]
        return n
    }
    
    // list of commutative operators to reduce port constraints (just fixed side, not fixed order)
    val commutativeOps = newArrayList("+", "*", "&", "|", "==", "<>")
    
    private def dispatch KNode translate(Expression expr, int index, KNode parentNode, DataflowRegion d) {
        val nNode = expr.createNode(parentNode).associateWith(expr)
        // translate the expression according to it's type
        switch(expr) {
            OperatorExpression: {
                val op = expr.operator
                nNode.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT)
                nNode.createDefaultNodeShape
                nNode.addDefaultLayoutParameter
                // in case of a commutative operator reduce port constraint to fixed side
                if (commutativeOps.contains(op.toString)) {
                    nNode.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE)
                }
                nNode.createLabel(nNode).configureInsideTopCenteredNodeLabel(
                    op.toString(), LABELFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME 
                )
                // traverse all subexpressions
                expr.subExpressions.forEach[ se|
                    nNode.addPort(se, PortSide::WEST)
                    // if it's a ValuedObjectReference, it's just another variable
                    if (se instanceof ValuedObjectReference) {
                        val subVo = (se as ValuedObjectReference).valuedObject
                        val decl = (subVo.eContainer as Declaration)
                        // differ between input/output type of variable
                        if (decl.isInput) {
                            // create input node and shape
                            val inputNode = subVo.createNode(parentNode) => [
                                it.addPolygon.createInputNodeShape
                                it.addDefaultLayoutParameter
                                it.setMinimalNodeSize(MINIMALNODEWIDTH * 1.5f, MINIMALNODEHEIGHT / 2)
                                it.addPort(subVo, PortSide::EAST)
                                  .addLayoutParam(CoreOptions.PORT_BORDER_OFFSET, -2.0)
                                it.createLabel(it).configureInsideTopCenteredNodeLabel(
                                    subVo.serialize as String,
                                    LABELFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                                // create edge
                                it.createEdge(se) => [
                                    it.source = subVo.getNode(parentNode)
                                    it.target = nNode
                                    it.sourcePort = subVo.getNode(parentNode).getPort(subVo.reference.portMap)
                                    it.targetPort = nNode.getPort(se.portMap)
                                    it.createEdgeStyle
                                ]
                            ]
                            parentNode.children += inputNode
                        } else if (decl.isOutput) {
                            // get the index of the dataflow equation which is the cource of the output 
                            var eqIndex = 0
                            for (eq: d.equations) {
                                if (eq.valuedObject.equals(subVo)) {
                                    eqIndex = d.equations.indexOf(eq)
                                }
                            }
                            // get the source node and port of the output node
                            // (should only be one incoming edge, so take this one)
                            // and create edge
                            val refVo = d.equations.get(eqIndex).valuedObject
                            nNode.createEdge(se) => [
                                it.source = refVo.getNode(parentNode).incomingEdges.get(0).source 
                                it.target = nNode
                                it.sourcePort = refVo.getNode(parentNode).incomingEdges.get(0).sourcePort
                                it.targetPort = nNode.getPort(se.portMap)
                                it.createEdgeStyle
                            ]
                        } else {
                            // the current subVo is ValuedObjectReference,
                            // but not an input or output (maybe "nothing" or both)
                            var eqIndex = 0
                            for (eq: d.equations) {
                                if (eq.valuedObject.equals(subVo)) {
                                    eqIndex = d.equations.indexOf(eq)
                                }
                            }
                            // get input node
                            val inputNode = subVo.createNode(parentNode) => [
                                it.addPolygon.createInputNodeShape
                                it.addDefaultLayoutParameter
                                it.setMinimalNodeSize(MINIMALNODEWIDTH * 1.5f, MINIMALNODEHEIGHT / 2)
                                it.addPort(subVo, PortSide::EAST)
                                  .addLayoutParam(CoreOptions.PORT_BORDER_OFFSET, -2.0)
                                it.createLabel(it).configureInsideTopCenteredNodeLabel(
                                    subVo.serialize as String,
                                    LABELFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                                // and create edge
                                it.createEdge(se) => [
                                    it.source = subVo.getNode(parentNode)
                                    it.target = nNode
                                    it.sourcePort = subVo.getNode(parentNode).getPort(subVo.reference.portMap)
                                    it.targetPort = nNode.getPort(se.portMap)
                                    it.createEdgeStyle
                                ]
                            ]
                            parentNode.children += inputNode
                        }
                    // handle subexpressions which are not a ValuedObjectReference in else case
                    // => more subexpressions are (internally) modeled
                    } else {
                        parentNode.children += se.translate(index, parentNode, d)
                    }
                ]
                // if it's an operator expression, but there are no subexpressions
                // get the corresponding nodes and create edges
                if (expr.eContainer instanceof Equation) {
                    val vo = d.equations.get(index).valuedObject
                    nNode.addPort(vo, PortSide::EAST)
                    nNode.createEdge(parentNode) => [
                        it.source = nNode
                        it.target = vo.getNode(parentNode)
                        it.sourcePort = nNode.getPort(vo.reference.portMap)
                        it.targetPort = vo.getNode(parentNode).getPort(vo.reference.portMap)
                        it.createEdgeStyle
                    ]
                } else {
                    nNode.addPort(expr, PortSide::EAST)
                    nNode.createEdge(parentNode) => [
                        it.source = nNode
                        it.target = (expr.eContainer).getNode(parentNode)
                        it.sourcePort = nNode.getPort(expr.portMap)
                        it.targetPort = (expr.eContainer).getNode(parentNode).getPort(expr.portMap) 
                        it.createEdgeStyle
                    ]
                }
            }
            // translate constant values
            IntValue: {
                nNode.translateConstExpression(expr, parentNode)
            }
            FloatValue: {
                nNode.translateConstExpression(expr, parentNode)
            }
            BoolValue: {
                nNode.translateConstExpression(expr, parentNode)
            }
            // translate direct ValuedObjectReferences, that means the equation is of type:
            // outputVariable = inputVariable
            ValuedObjectReference: {
                // expr = ValuedObjectReference: it.valuedObject = current input
                val vo = expr.valuedObject
                val voRef = d.equations.get(index).valuedObject
                val equation = d.equations.get(index)
                // current equation (expression) is not attached to a call/reference node
                if (equation.node == null) {
                    // get the input node and create edge
                    val inputNode = vo.createNode(parentNode) => [
                        it.addPolygon.createInputNodeShape
                        it.addDefaultLayoutParameter
                        it.setMinimalNodeSize(MINIMALNODEWIDTH * 1.5f, MINIMALNODEHEIGHT / 2)
                        it.addPort(vo, PortSide::EAST)
                            .addLayoutParam(CoreOptions.PORT_BORDER_OFFSET, -2.0)
                        it.createLabel(it).configureInsideTopCenteredNodeLabel(
                            vo.serialize as String, LABELFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                        it.createEdge(vo) => [
                            it.source = vo.getNode(parentNode)
                            it.target = voRef.getNode(parentNode)
                            it.sourcePort = vo.getNode(parentNode).getPort(vo.reference.portMap)
                            it.targetPort = voRef.getNode(parentNode).getPort(voRef.reference.portMap)
                            it.createEdgeStyle
                        ]
                    ]
                    parentNode.children += inputNode
                    return inputNode
                // current equation is attached to a call/reference node
                } else {
                    // get the corresponding call/reference node
                    val eqNode = d.equations.get(index).node
                    var KNode node = null
                    if (eqNode instanceof CallNode) {
                        node = (eqNode as CallNode).getNode()
                    } else if (eqNode instanceof ReferenceNode) {
                        node = (eqNode as ReferenceNode).getNode()
                    }
                    // correct rendering style, because nodes where already transformed, and inputs now
                    // have to get an output node shape
                    val KNode srcNode = node 
                    voRef.getNode(parentNode).KRendering.remove
                    voRef.getNode(parentNode).addPolygon.createOutputNodeShape
                    voRef.getNode(parentNode).addDefaultLayoutParameter
                    // and create edge
                    srcNode.createEdge(expr) => [
                        it.source = srcNode//.getNode()
                        it.target = voRef.getNode(parentNode)
                        it.sourcePort = srcNode.getPort(expr.valuedObject.reference.portMap)
                        it.targetPort = voRef.getNode(parentNode).getPort(voRef.reference.portMap)
                        it.createEdgeStyle
                    ]
                    // return eqNode instead of nNode, because it is not used and would create
                    // needles whitespace in klighd
                    return eqNode.node
                }
            }
            // there should be nothing missing, but just in case....
            default: {
                println("default case ...missing expr: " + expr)
            }
        }
        return nNode
    }
    
    // -------------------------------------------------------------------------
    private def dispatch KNode translate(Expression expr, int voIndex, Node callNode) {
        val nNode = expr.createNode(callNode).associateWith(expr)
        // translate the expressions the call node gets from it's define node
        switch(expr) {
            OperatorExpression: {
                val op = expr.operator
                nNode.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT)
                nNode.createDefaultNodeShape
                nNode.addDefaultLayoutParameter
                // in case of a commutative operator reduce port constraint to fixed side
                if (commutativeOps.contains(op.toString)) {
                    nNode.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE)
                }
                nNode.createLabel(nNode)
                     .configureInsideTopCenteredNodeLabel(op.toString(),
                                                          LABELFONTSIZE,
                                                          KlighdConstants::DEFAULT_FONT_NAME
                )
                // get the valuedObject (expression output) of the current expression
                val dNode = (callNode as CallNode).callReference as DefineNode
                val vo = dNode.valuedObjects.get(voIndex)
                
                expr.subExpressions.forEach[ se|
                    // add input ports
                    nNode.addPort(se, PortSide::WEST)
                    if (se instanceof ValuedObjectReference) {
                        //check for edges between subExpressions
                        val subVo = (se as ValuedObjectReference).valuedObject
                        if (dNode.valuedObjects.contains(subVo)) {
                            val refVo = dNode.valuedObjects.get(dNode.valuedObjects.indexOf(subVo))
                            val callExpr = dNode.expressions.get(dNode.valuedObjects.indexOf(subVo))
                            //create Edge
                            nNode.createEdge() => [
                                it.source = callExpr.getNode(callNode)
                                it.target = nNode
                                it.sourcePort = callExpr.getNode(callNode).getPort(refVo.reference.portMap)
                                it.targetPort = nNode.getPort(se.portMap)
                                it.createEdgeStyle
                            ]
                            // else: input edges!!!!
                        } else {
                            nNode.createEdge(se) => [
                                it.source = getNode(callNode)
                                it.target = nNode
                                it.sourcePort = getNode(callNode).getPort(se.portMap)
                                it.targetPort = nNode.getPort(se.portMap)
                                it.createEdgeStyle
                            ]
                        }
                    } else {
                        // recursive call to transform subExpressions
                        (callNode as CallNode).node.children += se.translate(voIndex, callNode)
                    }
                ]
                // eContainer is the define node, but not fpr subexpressions
                if (expr.eContainer instanceof DefineNode) {
                    // port for expression output, create edge
                    nNode.addPort(vo, PortSide::EAST)
                    nNode.createEdge(callNode) => [
                        it.source = nNode
                        it.target = getNode(callNode)
                        it.sourcePort = nNode.getPort(vo.reference.portMap)
                        it.targetPort = getNode(callNode).getPort(vo.reference.portMap)
                        it.createEdgeStyle
                    ]
                } else {
                    // port for another subExpression output
                    nNode.addPort(expr, PortSide::EAST)
                    // create edge
                    nNode.createEdge(callNode) => [
                        it.source = nNode
                        it.target = (expr.eContainer).getNode(callNode)
                        it.sourcePort = nNode.getPort(expr.portMap)
                        it.targetPort = (expr.eContainer).getNode(callNode).getPort(expr.portMap) 
                        it.createEdgeStyle
                    ]
                }
            }
            // translate constant values
            IntValue: {
                nNode.translateConstExpression(expr, callNode)
            }
            FloatValue: {
                nNode.translateConstExpression(expr, callNode)
            }
            BoolValue: {
                nNode.translateConstExpression(expr, callNode)
            }
            ValuedObjectReference: {
                // expr = ValuedObjectReference: it.valuedObject = current input
                val vo = expr.valuedObject
                val voRef = (callNode as CallNode).callReference.valuedObjects.get(voIndex)
                /*  add ports to dummy node (nNode) to create an edge from input to output
                 * inside(!) the call node
                 * (klighd would draw the edge around the call node, if the dummy node is not used)
                 */
                nNode.addPort(vo, PortSide::EAST, 1)
                nNode.addPort(voRef, PortSide::WEST, 1)
                // first part of the edge
                nNode.createEdge(nNode) => [
                    it.source = getNode(callNode)
                    it.target = nNode
                    it.sourcePort = getNode(callNode).getPort(vo.reference.portMap)
                    it.targetPort = nNode.getNode(callNode).getPort(vo.reference.portMap)
                    it.addRoundedBendsPolyline(4, 1) 
                ]
                // second part of the edge
                nNode.createEdge(callNode) => [
                    it.source = nNode
                    it.target = getNode(callNode)
                    it.sourcePort = nNode.getNode(callNode).getPort(voRef.reference.portMap)
                    it.targetPort = getNode(callNode).getPort(voRef.reference.portMap)
                    it.createEdgeStyle
                ]
            }
            default: {
                println("default case...missing expression: " + expr)
            }
        }
        return nNode
    }
    // translate a constant expression: just create input node an edge
    public def dispatch KNode translateConstExpression(KNode n, Expression expr, KNode parentNode) {
        n.addPolygon.createInputNodeShape
        n.setMinimalNodeSize(MINIMALNODEWIDTH * 1.5f, MINIMALNODEHEIGHT / 2)
        n.addDefaultLayoutParameter
        n.addPort(expr, PortSide::EAST) => [
            addLayoutParam(CoreOptions.PORT_BORDER_OFFSET, -2.0)
        ]
        n.createLabel(n).configureInsideTopCenteredNodeLabel(expr.serialize as String, LABELFONTSIZE,
                                                             KlighdConstants::DEFAULT_FONT_NAME)
        
        n.createEdge(parentNode) => [
            it.source = n
            it.sourcePort = n.getPort(expr.portMap)
            // getting the target node/port depends on
            // if the eContainer is the dataflow or another operator expression
            if (expr.eContainer instanceof Equation) {
                val eq = (expr.eContainer as Equation)
                val voRef = eq.valuedObject
                it.target = voRef.getNode(parentNode)
                it.targetPort = voRef.getNode(parentNode).getPort(voRef.reference.portMap)
            } else {
                it.target = (expr.eContainer).getNode(parentNode)
                it.targetPort = (expr.eContainer).getNode(parentNode).getPort(expr.portMap)
            }
            it.createEdgeStyle
        ]
        return n
    }
    // translate a const expression: just create input node an edge
    public def dispatch KNode translateConstExpression(KNode n, Expression expr, Node callNode) {
        n.addPolygon.createInputNodeShape
        n.setMinimalNodeSize(MINIMALNODEWIDTH * 1.5f, MINIMALNODEHEIGHT / 2)
        n.addDefaultLayoutParameter
        n.addPort(expr, PortSide::EAST) => [
            addLayoutParam(CoreOptions.PORT_BORDER_OFFSET, -2.0)
        ]
        n.createLabel(n).configureInsideTopCenteredNodeLabel(expr.serialize as String, LABELFONTSIZE,
                                                             KlighdConstants::DEFAULT_FONT_NAME)
        // there's only the call node, so there's no need to differ like before
        n.createEdge(callNode) => [
            it.source = n
            it.target = (expr.eContainer).getNode(callNode)
            it.sourcePort = n.getPort(expr.portMap)
            it.targetPort = (expr.eContainer).getNode(callNode).getPort(expr.portMap) 
            it.createEdgeStyle
        ]
        return n
    }
    
    // Transform a Node
    public def dispatch KNode translate(Node n) {
        val nNode = n.createNode().associateWith(n)
        // translate specific ReferenceNode elements
        if (n instanceof ReferenceNode) {
            nNode.setMinimalNodeSize(MINIMALNODEWIDTH * 2, MINIMALNODEHEIGHT * 1.5f)
            nNode.createDefaultNodeShape
            // create label and ports according to input/output variables of the reference
            val refNode = (n as ReferenceNode)
            val refedScope = refNode.referencedScope as State
            nNode.createLabel(nNode).configureInsideTopCenteredNodeLabel(
                if(n.label.nullOrEmpty) refedScope.id else " " + n.label,
                LABELFONTSIZE,
                KlighdConstants::DEFAULT_FONT_NAME
            )
            refedScope.declarations.filter[it.input].forEach[valuedObjects.forEach[ vo|
                nNode.addPort(vo.reference, PortSide::WEST) => [
                    it.createLabel(it).configureInsideCenteredNodeLabel(
                       vo.name, PORTFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                ]
            ]]
            refedScope.declarations.filter[it.output].forEach[valuedObjects.forEach[ vo|
                nNode.addPort(vo.reference, PortSide::EAST) => [
                    it.createLabel(it).configureInsideCenteredNodeLabel(
                       vo.name, PORTFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                ]
            ]]
            // create input nodes for call parameters
            // dNode is the dataflow KNode containing the reference node
            val dNode = refNode.eContainer.node
            val refInputs = <ValuedObject>newArrayList
            refedScope.declarations.filter[it.input].forEach[
                refInputs += valuedObjects
            ]
            val refInputSize = refInputs.size
            refNode.parameters.forEach[ p|
                if (refNode.parameters.indexOf(p) < refInputSize) {
                    // create child nodes only if the parameter count is less then
                    // the referred input count size 
                    if (p instanceof ValuedObjectReference) {
                        val param = (p as ValuedObjectReference).valuedObject 
                        dNode.children += param.createNode(dNode) => [ inNode|
                            inNode.addPolygon.createInputNodeShape
                            inNode.setMinimalNodeSize(MINIMALNODEWIDTH * 1.5f, MINIMALNODEHEIGHT / 2)
                            inNode.addDefaultLayoutParameter
                            inNode.addPort(param.reference, PortSide::EAST) => [
                                it.addLayoutParam(CoreOptions.PORT_BORDER_OFFSET, -2.0)
                            ]
                            inNode.createLabel(inNode).configureInsideTopCenteredNodeLabel(param.serialize as String,
                                LABELFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                            //create Edge
                            inNode.createEdge(refNode) => [
                                it.source = inNode
                                it.target = nNode
                                it.sourcePort = inNode.getPort(param.reference.portMap)
                                it.targetPort = nNode.ports.get(refNode.parameters.indexOf(p))
                                it.createEdgeStyle
                            ]
                        ]
                    }
                }
            ]
        // translate specific CallNode elements
        } else if (n instanceof CallNode) {
            val call = n as CallNode
            val refID = call.callReference.id
            nNode.setMinimalNodeSize(MINIMALNODEWIDTH * 2, MINIMALNODEHEIGHT * 2)
            nNode.createCallNodeShape(refID)
            
            //set up orthogonal edge routing inside call nodes
            nNode.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
            
            if (call.callReference instanceof DefineNode) {
                val ref = call.callReference as DefineNode
                // add ChildNodes for called Reference
                for (expr : ref.expressions) {
                    val index = ref.expressions.indexOf(expr)
                    nNode.children +=  expr.translate(index, call)
                }
                //create input and output ports for callReference
                ref.inputs.forEach[valuedObjects.forEach[ vo|
                    nNode.addPort(vo.reference, PortSide::WEST) => [
                        it.addLayoutParam(CoreOptions.PORT_BORDER_OFFSET, -3.0)
                        it.createLabel(it).configureInsideCenteredNodeLabel(
                            vo.reference.serialize as String,
                            PORTFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                    ]
                ]]
                ref.outputs.forEach[valuedObjects.forEach[ vo|
                    nNode.addPort(vo.reference, PortSide::EAST) => [
                        it.addLayoutParam(CoreOptions.PORT_BORDER_OFFSET, -3.0)
                        it.createLabel(it).configureInsideCenteredNodeLabel(
                            vo.reference.serialize as String,
                            PORTFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                    ]
                ]]
                // translate states if control flow is defined instead of dataflow
                if (!ref.states.nullOrEmpty) {
                    // use delegate method so if the define node is called more then once,
                    // all elements where displayed another time (instead of only reference the old ones)
                    // TODO check if it works
//                    val synthesis = delegate.get()
//                    synthesis.use(usedContext)
                    for (s: ref.states) {
                        // translate states using the already existing method
                        nNode.children += s.transform()
                    }
                }
            }
            
            // create input nodes for call parameters
            val dNode = call.eContainer.node
            val refInputs = <ValuedObject>newArrayList
            val callRef = call.callReference as DefineNode
            callRef.inputs.forEach[
                refInputs += valuedObjects
            ]
            val refInputSize = refInputs.size
            call.parameters.forEach[ p|
                if (call.parameters.indexOf(p) < refInputSize) {
                    /* add child nodes and edges if not already craeted
                     * only if the index of the parameter 
                     * is less then the number of inputs of the define node 
                     */
                    if (p instanceof ValuedObjectReference) {
                        val param = (p as ValuedObjectReference).valuedObject 
                        dNode.children += param.createNode(dNode) => [ inNode|
                            inNode.addPolygon.createInputNodeShape
                            inNode.setMinimalNodeSize(MINIMALNODEWIDTH * 1.5f, MINIMALNODEHEIGHT / 2)
                            inNode.addDefaultLayoutParameter
                            inNode.addPort(param.reference, PortSide::EAST) => [
                                it.addLayoutParam(CoreOptions.PORT_BORDER_OFFSET, -2.0)
                            ]
                            inNode.createLabel(inNode).configureInsideTopCenteredNodeLabel(param.serialize as String,
                                LABELFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                            //create Edge
                            inNode.createEdge(call) => [
                                it.source = inNode
                                it.target = nNode
                                it.sourcePort = inNode.getPort(param.reference.portMap)
                                it.targetPort = nNode.ports.get(call.parameters.indexOf(p))
                                it.createEdgeStyle
                            ]
                        ]
                    }
                }
            ]
            // set call nodes to initially collapsed
            nNode.initiallyCollapse
            if (ShadowHook.SHOW_SHADOW.booleanValue) {
                nNode.KRendering.shadow = "black".color;
                nNode.KRendering.shadow.XOffset = 4;
                nNode.KRendering.shadow.YOffset = 4;
            }
        }
         // the "default" else, in case something is missing
        else {
            nNode.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT)
            nNode.createDefaultNodeShape
            nNode.createLabel(nNode).configureInsideTopCenteredNodeLabel(
                if(n.label.nullOrEmpty) "" else " " + n.label,
                LABELFONTSIZE,
                KlighdConstants::DEFAULT_FONT_NAME
            )
        }
        // set up some default layout parameters
        nNode.addDefaultLayoutParameter
        return nNode
    }
    
    // -------------------------------------------------------------------------
    // -- Helper: Ports 
    // -------------------------------------------------------------------------
    def KPort addPort(KNode node, String text, float x, float y, int size, PortSide side) {
        node.createPort() => [
            it.addLayoutParam(CoreOptions::PORT_SIDE, side);
            it.setPortSize(size, size)
            node.ports += it
        ]
    }
        
    def KPort addPort(KNode node, Expression expression, float x, float y, int size, PortSide side) {
      var text = ""
      var Object obj = null
      if (expression instanceof ValuedObjectReference) {
          text = (expression as ValuedObjectReference).valuedObject.name
          obj = (expression as ValuedObjectReference).valuedObject
        } else {
          text = expression.serialize as String
          obj = expression
          }
        node.createPort(obj) => [
            it.addLayoutParam(CoreOptions::PORT_SIDE, side);
            it.setPortSize(size, size)
            node.ports += it
        ]    
    }    

    def KPort addPort(KNode node, Expression expression, PortSide side) {
      node.addPort(expression, 0, 0, 2, side) => [
      ]
    }
    // new helper for valuedObject instead of Expression
    def KPort addPort(KNode node, ValuedObject vo, PortSide side) {
        node.createPort(vo) => [
            it.addLayoutParam(CoreOptions::PORT_SIDE, side)
            it.setPortSize(2, 2)
            node.ports += it
        ]
    }
    def KPort addPort(KNode node, ValuedObject vo, PortSide side, int size) {
        node.createPort(vo) => [
            it.addLayoutParam(CoreOptions::PORT_SIDE, side)
            it.setPortSize(size, size)
            node.ports += it
        ]
    }
    def KPort addPort(KNode node, Expression expr, PortSide side, int size) {
        node.createPort(expr) => [
            it.addLayoutParam(CoreOptions::PORT_SIDE, side)
            it.setPortSize(size, size)
            node.ports += it
        ]
    }
    
    def Object portMap(Expression expression) {
      var Object obj = null
          if (expression instanceof ValuedObjectReference) {
          obj = (expression as ValuedObjectReference).valuedObject
        } else {
          obj = expression
          }
          obj
  }
  /*
   * some helper methods for node shapes and layout
   */
  private def KNode createDefaultNodeShape(KNode n) {
        n.addRoundedRectangle(3, 3) => [
            it.setBackgroundGradient("#ff8".color, "#ff8".color, 90)
            it.setSurroundingSpace(0, 0)
            it.invisible = false
            it.foreground = "black".color
            it.lineWidth = 1
        ]
        return n
    }
    private def KNode createCallNodeShape(KNode n, String label){
        n.addRoundedRectangle(3, 3) => [
            it.setProperty(KlighdProperties::EXPANDED_RENDERING, true)
            it.setBackgroundGradient("#fff".color, "#fff".color, 90)
            it.setSurroundingSpace(2, 0)
            it.invisible = false
            it.foreground = "black".color
            it.lineWidth = 1
            it.addText("[-] " + label) => [
                it.foreground = "dimGray".color
                it.fontSize = 10
                it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
            ]
            if (true) {
               it.addChildArea().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
            }
        ]
        n.addDefaultLayoutParameter
        n.addRoundedRectangle(3, 3) => [
            it.setProperty(KlighdProperties::COLLAPSED_RENDERING, true)
            it.setBackground("white".color)
            it.setSurroundingSpace(2, 0)
            it.invisible = false
            it.lineWidth = 1
            it.addText("[+] " + label) => [
                it.foreground = "dimGray".color
                it.fontSize = 10
                it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
            ];
            if (true) {
                it.addRectangle().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0).invisible = true;
            }
        ]
        n.addDefaultLayoutParameter
        return n
    }
    
    private def KNode addDefaultLayoutParameter(KNode n) {
        n.addLayoutParam(CoreOptions::NODE_LABELS_PLACEMENT, NodeLabelPlacement::insideTopCenter)
        n.addLayoutParam(CoreOptions::PORT_LABELS_PLACEMENT, PortLabelPlacement::INSIDE)
        n.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER);
        
        // add shadow if option is checked
        if (ShadowHook.SHOW_SHADOW.booleanValue) {
            n.KRendering.shadow = "black".color;
            n.KRendering.shadow.XOffset = 4;
            n.KRendering.shadow.YOffset = 4;
        }
        return n
    }
    
    def KPolygon createInputNodeShape(KPolygon poly) {
        poly => [
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0.0f);
            it.points += createKPosition(LEFT,  0, 0.75f, TOP,  0, 0.0f);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 0.5f);
            it.points += createKPosition(LEFT,  0, 0.75f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0.0f);
            it.background = "white".color
        ];
    }  

    def KPolygon createOutputNodeShape(KPolygon poly) {
        poly => [
            it.points += createKPosition(LEFT,  0, 0.25f, TOP,  0, 0);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 0);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.25f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0.5f);
            it.points += createKPosition(LEFT,  0, 0.25f, TOP,  0, 0);
            it.background = "white".color
        ];
    }
    // Edgestyle
    def KEdge createEdgeStyle(KEdge edge) {
        edge.addRoundedBendsPolyline(4, 1) => [
            it.addArrowDecorator
            it.addJunctionPointDecorator
        ]
        return edge
    }
}