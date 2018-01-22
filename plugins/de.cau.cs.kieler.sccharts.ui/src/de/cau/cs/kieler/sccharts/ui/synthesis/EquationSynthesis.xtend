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
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.EquationStyles
import java.util.List
import java.util.Set
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.PortAlignment
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortLabelPlacement
import org.eclipse.elk.core.options.PortSide

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import org.eclipse.elk.core.math.ElkPadding
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.KlighdConstants
import org.eclipse.xtext.xbase.lib.Functions.Function1
import com.google.inject.Injector
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.actions.ReferenceExpandAction
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.annotations.Annotatable
import de.cau.cs.kieler.kicool.ui.synthesis.KiCoolSynthesis
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.klighd.kgraph.KIdentifier
import org.eclipse.emf.ecore.EObject
import java.util.EnumSet
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.alg.layered.options.NodeFlexibility

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

    @Inject extension KRenderingExtensions
    @Inject extension KNodeExtensionsReplacement
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensionsReplacement
    @Inject extension KLabelExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension SCChartsSynthesis
    @Inject extension EquationStyles
    @Inject Injector injector
    
    static val ANNOTATION_FIGURE = "figure"
    
    private val PORT_LABEL_FONT_SIZE = 6
    
    protected val referenceNodes = <KNode> newHashSet

    override performTranformation(Assignment element) {
        null
    }

    def performTranformation(List<Assignment> elements) {
        val nodes = <KNode>newLinkedList
        val usedNodes = <KNode>newHashSet
        referenceNodes.clear
        
        val wiring = injector.getInstance(Wiring)

        wiring.createWires(elements)

        wiring.createSources(nodes)
        wiring.createSinks(nodes, usedNodes)
        wiring.connectWires(usedNodes)

        return nodes
    }

    protected def createSources(Wiring wiring, List<KNode> nodes) {
        for (wire : wiring.wires) {
            val nodeExists = wire.semanticSource.nodeExists
            var KNode node = wire.semanticSource.createNode
            if (!nodeExists) {
                if (wire.semanticSourceReferenceDeclaration != null) {
                    node = node.createReferenceNode(wire.semanticSource, wire, (wire.semanticSource as ValuedObjectReference).valuedObject.serializeHR.removeCardinalities.toString, wire.semanticSourceReferenceDeclaration)
                } else {
                    var text = wire.semanticSource.serializeHR.toString
                    if (wire.source instanceof OperatorExpression) {
                        node.addOperatorNodeFigure.associateWith(wire.semanticSource)
                        text = wire.semanticSource.asOperatorExpression.operator.toString
                    } else {
                        node.addInputNodeFigure.associateWith(wire.source)
                    }
                    node.addLayoutParam(CoreOptions::PORT_ALIGNMENT_DEFAULT, PortAlignment.CENTER)
                    node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
                    val port = wire.semanticSource.createPort("out") => [
                        addLayoutParam(CoreOptions::PORT_SIDE, PortSide.EAST)
                    ]   
                    node.ports += port       
                    port.associateWith(wire.semanticSource)
                    node.addNodeLabel(text)
                }            
            }
            nodes += node
        }
    }
    
    protected def createSinks(Wiring wiring, List<KNode> nodes, Set<KNode> usedNodes) {
        for (wire : wiring.wires) {
            val nodeExists = wire.semanticSink.nodeExists
            var node = wire.semanticSink.createNode
            
            if (!nodeExists) {
                if (wire.semanticSinkReferenceDeclaration != null) {
                    node = node.createReferenceNode(wire.semanticSink, wire, (wire.semanticSink as ValuedObjectReference).valuedObject.serializeHR.removeCardinalities.toString, wire.semanticSinkReferenceDeclaration)
                } else { 
                    node.addOutputNodeFigure.associateWith(wire.sink)
                    node.addNodeLabel(wire.semanticSink.serializeHR.toString)
                }
                
            }

            nodes += node
        }
    }

    protected def connectWires(Wiring wiring, Set<KNode> usedNodes) {
        for (wire : wiring.wires) {
            var sourceNode = wire.semanticSource.getNode
            var sourcePort = wire.semanticSource.getPort("out")
            var targetNode = wire.semanticSink.getNode
            var targetPort = null as KPort
            if (wire.semanticSinkReferenceDeclaration != null) {
                // If it is a reference, connect it to the specific port
                if (wire.sink.asValuedObjectReference.subReference !== null) {
                    targetPort = targetNode.getPort(wire.sink.asValuedObjectReference.subReference.valuedObject)
                }
            }
            if (wire.semanticSourceReferenceDeclaration != null) {
                sourcePort = sourceNode.getPort(wire.source.asValuedObjectReference.subReference.valuedObject)
            }
            if (targetPort === null) {
                targetPort = targetNode.getPort(wire) => [
                    addLayoutParam(CoreOptions::PORT_SIDE, PortSide.WEST)
                ]
                targetNode.ports += targetPort
            }
            
            // Only label operator expressions and only do it once.
            var String label = null 
            if (wire.source == wire.semanticSource && wire.source instanceof OperatorExpression) {
                label = wire.source.serializeHR.toString
            }
            
            wire.source.createWireEdge(sourceNode, sourcePort, targetNode, targetPort, label)
        }
    }

    protected def createWireEdge(Object association, KNode sourceNode, KPort sourcePort, KNode targetNode, KPort targetPort, String label) { 
        val edge = createEdge.associateWith(association)
        edge.setLayoutOption(LayeredOptions.INSIDE_SELF_LOOPS_YO, true)
        edge.source = sourceNode
        edge.sourcePort = sourcePort
        edge.target = targetNode
        if (targetPort != null) edge.targetPort = targetPort
        edge.addWireFigure
        if (!label.nullOrEmpty) {
            edge.createLabel.configureTailEdgeLabel(label, 5, KlighdConstants::DEFAULT_FONT_NAME)
        }
    }
    
    protected def KNode createReferenceNode(KNode node, Object association, Wire wire, String label, ReferenceDeclaration referenceDeclaration) {
        if (association.nodeExists) {
            val oldNode = association.getNode
            if (referenceNodes.contains(oldNode)) return oldNode
        }
        
        node.associateWith(association)
        
        node.setLayoutOption(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER) 
        node.setLayoutOption(CoreOptions.PORT_LABELS_PLACEMENT, PortLabelPlacement.INSIDE) 
        node.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 10d); //10.5 // 8f
        node.setLayoutOption(CoreOptions::PADDING, new ElkPadding(4d));
//        node.setLayoutOption(CoreOptions::EXPAND_NODES, false);   
        node.addLayoutParam(KlighdProperties::EXPAND, false)      
        node.setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.PORT_LABELS, SizeConstraint.PORTS))
//        node.setLayoutOption(LayeredOptions::NODE_PLACEMENT_NETWORK_SIMPLEX_NODE_FLEXIBILITY, NodeFlexibility.NODE_SIZE)
  
        
        if (referenceDeclaration.hasAnnotation(ANNOTATION_FIGURE)) {
            val newNode = loadFigureFromKGT(referenceDeclaration.reference as Annotatable, association, referenceDeclaration)
            if (newNode !== null) return newNode
        }
        if (referenceDeclaration.reference.asAnnotatable.hasAnnotation(ANNOTATION_FIGURE)) {
            val newNode = loadFigureFromKGT(referenceDeclaration.reference as Annotatable, association, referenceDeclaration.reference as Annotatable)
            if (newNode !== null) return newNode
        }
         
        node.addReferenceNodeFigure.associateWith(association) => [
            setAsCollapsedView;
            addDoubleClickAction(ReferenceExpandAction::ID)  
        ]
        node.addReferenceNodeFigure.associateWith(association) => [
            setAsExpandedView;
            addDoubleClickAction(ReferenceExpandAction::ID);
        ]
        node.addNodeLabel(label)
        
        val vor = wire.sink
        
        node.createReferenceNodePorts(wire.referenceDeclaration.reference as Scope, vor, [ input ], PortSide.WEST, true)
        node.createReferenceNodePorts(wire.referenceDeclaration.reference as Scope, vor, [ output ], PortSide.EAST, false)

        referenceNodes += node
        return node
    }
    
    protected def createReferenceNodePorts(KNode node, Scope scope, Object association, Function1<? super VariableDeclaration, Boolean> predicate, PortSide portSide, boolean reverse) {
        for(input : scope.declarations.filter(VariableDeclaration).filter(predicate)) {
            val declarationView = if (reverse) input.valuedObjects.reverseView else input.valuedObjects
            for(v : declarationView) {
                val port = node.createPort(v) => [
                    if (v.hasAnnotation("hidden")) {
                        addLayoutParam(CoreOptions::PORT_SIDE, PortSide.SOUTH)
                    } else {
                        addLayoutParam(CoreOptions::PORT_SIDE, portSide)
                    }
                    setPortSize(2, 2)
                    addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -3d)
                    createLabel().configureInsidePortLabel(v.serializeHR.removeCardinalities.toString, PORT_LABEL_FONT_SIZE)
                    node.ports += it
                ]          
                port.associateWith(v)              
            }
        }        
    }
    
    protected def KNode loadFigureFromKGT(EObject eObject, Object association, Annotatable annotationObject) {
        if (!annotationObject.hasAnnotation(ANNOTATION_FIGURE)) return null
        
        val path = getSkinPath 
        val kgt = path + if (!path.endsWith("/")) "/" + annotationObject.getStringAnnotationValue(ANNOTATION_FIGURE) 
        val sl = eObject.eResource.URI.segmentsList
        val nsl = sl.take(sl.length - 1).drop(1)
        val newURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(nsl.join("/") + "/" + kgt, false)

        val newResourceSet = KiCoolSynthesis.KGTInjector.getInstance(XtextResourceSet)
        newResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.FALSE)
        val res = newResourceSet.createResource(newURI)

        try {
            res.load(newResourceSet.loadOptions)
            val node = (res.getContents().get(0) as KNode).children.head
            node.associateWith(association)
            association.addNode(node)

            val valuedObjects = eObject.asDeclarationScope.valuedObjects.filter[ input || output ].toList        
        
            for(p : node.eAllContents.filter(KPort).toList) {
                val id = p.data.filter(KIdentifier).head
                val v = valuedObjects.filter[ it.name.equals(id.id) ].head
                
                p.associateWith(v)          
                node.addPort(v, p)  
            }

            return node
        } catch (Exception e) {
            // Display default reference actor
        }            
    }
}
