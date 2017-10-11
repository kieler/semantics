/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValueExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.EquationStyles
import java.util.EnumSet
import java.util.List
import java.util.Set
import org.eclipse.elk.alg.layered.properties.LayerConstraint
import org.eclipse.elk.alg.layered.properties.LayeredOptions
import org.eclipse.elk.core.math.KVector
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.PortAlignment
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortLabelPlacement
import org.eclipse.elk.core.options.PortSide
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KIdentifier
import org.eclipse.elk.core.math.ElkPadding
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.KlighdConstants
import org.eclipse.xtext.xbase.lib.Functions.Function1
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import com.google.inject.Injector

/**
 * @author ssm
 * @kieler.design 2017-09-26 proposed
 * @kieler.rating 2017-09-26 proposed yellow
 * 
 */
@ViewSynthesisShared
class EquationSynthesis extends SubSynthesis<Assignment, KNode> {

    public static val SynthesisOption UNIQUE_WIRES = SynthesisOption.createCheckOption("Unique Wires", false).
        setCategory(GeneralSynthesisOptions::DATAFLOW)        

    @Inject extension KNodeExtensionsReplacement
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensionsReplacement
    @Inject extension KLabelExtensions
    @Inject extension KExpressionsValueExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension EquationStyles
    @Inject extension DataflowRegionSynthesis
    @Inject extension SCChartsSynthesis
    @Inject extension KRenderingExtensions
    @Inject extension KEffectsExtensions
    @Inject IResourceServiceProvider.Registry regXtext;
    @Inject Injector injector
    
    private val PORT_LABEL_FONT_SIZE = 6

    override performTranformation(Assignment element) {
        null
    }

    def performTranformation(List<Assignment> elements) {
        val nodes = <KNode>newLinkedList
        val usedNodes = <KNode>newHashSet
        
        val wiring = injector.getInstance(Wiring)

        wiring.createWires(elements)

//        wiring.redirectWires
        wiring.createSources(nodes)
        wiring.createSinks(nodes, usedNodes)
        wiring.connectWires(usedNodes)
//        val nodes2 = <KNode> newLinkedList => [ l | 
//            nodes.filter[ usedNodes.contains(it)].forEach[ l += it ]]

        return nodes
    }

//    protected def createWires(Assignment equation, Wiring wiring) {
//        val equationValuedObjectReference = equation.valuedObject.reference
//        wiring.getWire(equationValuedObjectReference) => [ it.equation = equation; sink = true ]
//        wiring.getWire(equation.expression) => [ it.equation = equation ]
//    }

    protected def createSources(Wiring wiring, List<KNode> nodes) {
        for (wire : wiring.wires.filter[ source ]) {
            val node = wire.createNode(wire.source)
            var text = wire.firstExpression.serializeHR.removeCardinalities.toString
            if (wire.containsOperatorExpression) {
                node.addOperatorNodeFigure.associateWith(wire.firstExpression)
                text = wire.names.filter(OperatorExpression).head.operator.toString
            } else {
                node.addInputNodeFigure.associateWith(wire.firstExpression)
            }
           
            node.addNodeLabel(text)
            
            node.addLayoutParam(CoreOptions::PORT_ALIGNMENT_BASIC, PortAlignment.CENTER)
            node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
            val port = wire.createPort("out") => [
                addLayoutParam(CoreOptions::PORT_SIDE, PortSide.EAST)
                node.ports += it
            ]          
            port.associateWith(wire.firstExpression)            

            nodes += node
        }
    }
    
    protected def createSinks(Wiring wiring, List<KNode> nodes, Set<KNode> usedNodes) {
        for (wire : wiring.wires.filter[ sink ]) {
            val expression = wire.firstExpression
            var node = wire.createNode(wire.sink)
            if (wire.referenceDeclaration != null) {
//                node = node.createReferenceNode(wire.equation.valuedObject, wire)
            } else { 
                node.addOutputNodeFigure.associateWith(wire.firstExpression)
            }
            node.addNodeLabel(wire.firstExpression.serializeHR.removeCardinalities.toString)
            val sourceNode = wiring.getWire(wire.firstExpression).getNode
            val sourcePort = wiring.getWire(wire.firstExpression).getPort("out")
            var KPort targetPort = null
//            if (expression instanceof ValuedObjectReference) {
//                if (wire.equation.subReference != null) {
//                    targetPort = node.getPort(wire.equation.subReference.valuedObject)
//                }
//            }
            
            var labelText = ""
            if (wire.firstExpression instanceof OperatorExpression) {
                labelText = wire.firstExpression.serializeHR.toString
            }
            
//            createWireEdge(wire.equation.expression, sourceNode, sourcePort, node, targetPort, labelText)
            
            usedNodes += sourceNode
            usedNodes += node
            nodes += node
        }
    }
//    
//    protected def redirectWires(Wiring wiring) {
//        for(wire : wiring.wires) {
//            val expression = wire.expression
//            if (expression instanceof ValuedObjectReference) {
//                for(w : wiring.wires.filter[ equation != null ]) {
//                    if (w != wire && w.equation.valuedObject.equals(expression.valuedObject)) {
//                        wire.redirectedWire = w
//                    }
//                }
//            }
//        }
//    }
//
    protected def connectWires(Wiring wiring, Set<KNode> usedNodes) {
        for (wire : wiring.wires) {
            var sourceNode = wire.getNode(wire.source)
            var sourcePort = wire.getPort("out")
            var targetNode = wire.getNode(wire.sink)
            var targetPort = wire.getPort("in")
            var label = "Test"
            
            wire.firstExpression.createWireEdge(sourceNode, sourcePort, targetNode, targetPort, label)
        }
    }
//    
//    protected def connectWires(OperatorExpression operatorExpression, Wiring wiring, Set<KNode> usedNodes) {
//        val targetNode = wiring.getWire(operatorExpression).getNode
//        usedNodes += targetNode
//        for (subExpression : operatorExpression.subExpressions) {
//            var sourceExpression = subExpression
//            var sourceWire = wiring.getWire(subExpression)
//            while (sourceWire.redirectedWire != null) {
//                sourceWire = sourceWire.redirectedWire
//                sourceExpression = sourceWire.expression
//            }
//            val sourceNode = sourceWire.getNode
//            usedNodes += sourceNode
//            
//            val sourcePort = sourceWire.getPort("out")
//            var targetPort = null
//            
//            var labelText = ""
//            if (sourceExpression instanceof OperatorExpression && sourceExpression === subExpression) {
//                labelText = sourceExpression.serializeHR.toString
//            }
//            
//            createWireEdge(sourceExpression, sourceNode, sourcePort, targetNode, targetPort, labelText)
//        }
//    }
//
    protected def createWireEdge(Object association, KNode sourceNode, KPort sourcePort, KNode targetNode, KPort targetPort, String label) { 
        val edge = createEdge.associateWith(association)
        edge.setLayoutOption(LayeredOptions.INSIDE_SELF_LOOPS_YO, true)
        edge.source = sourceNode
        edge.sourcePort = sourcePort
        edge.target = targetNode
        if (targetPort != null) edge.targetPort = targetPort
        edge.addWireFigure
        if (!label.nullOrEmpty) {
            edge.createLabel.configureTailEdgeLabel(label, 7, KlighdConstants::DEFAULT_FONT_NAME)
        }
    }
//    
//    protected def createReferenceNode(KNode node, Object association, Wire wire) {
//        node.setLayoutOption(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER) 
//        node.setLayoutOption(CoreOptions.PORT_LABELS_PLACEMENT, PortLabelPlacement.INSIDE) 
//        node.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 10d); //10.5 // 8f
//        node.setLayoutOption(CoreOptions::PADDING, new ElkPadding(4d));
//        node.setLayoutOption(CoreOptions::EXPAND_NODES, true);         
//  
//        node.addReferenceNodeFigure.associateWith(association)
//        
//        val vor = wire.expression
//        
//        node.createReferenceNodePorts(wire.reference, vor, [ input ], PortSide.WEST, true)
//        node.createReferenceNodePorts(wire.reference, vor, [ output ], PortSide.EAST, false)
//
//        return node
//    }
//    
//    protected def createReferenceNodePorts(KNode node, Scope scope, Object association, Function1<? super VariableDeclaration, Boolean> predicate, PortSide portSide, boolean reverse) {
//        for(input : scope.declarations.filter(VariableDeclaration).filter(predicate)) {
//            val declarationView = if (reverse) input.valuedObjects.reverseView else input.valuedObjects
//            for(v : declarationView) {
//                val port = node.createPort(v) => [
//                    if (v.hasAnnotation("hidden")) {
//                        addLayoutParam(CoreOptions::PORT_SIDE, PortSide.SOUTH)
//                    } else {
//                        addLayoutParam(CoreOptions::PORT_SIDE, portSide)
//                    }
//                    setPortSize(2, 2)
//                    addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -3d)
//                    createLabel().configureInsidePortLabel(v.serializeHR.removeCardinalities.toString, PORT_LABEL_FONT_SIZE)
//                    node.ports += it
//                ]          
//                port.associateWith(v)              
//            }
//        }        
//    }
}
