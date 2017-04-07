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
package de.cau.cs.kieler.sccharts.klighd.synthesis

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
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtension
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.EquationStyles
import java.util.EnumSet
import java.util.List
import java.util.Set
import org.eclipse.elk.alg.layered.properties.LayerConstraint
import org.eclipse.elk.alg.layered.properties.LayeredOptions
import org.eclipse.elk.core.klayoutdata.KIdentifier
import org.eclipse.elk.core.math.KVector
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.PortAlignment
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortLabelPlacement
import org.eclipse.elk.core.options.PortSide
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.graph.KEdge
import org.eclipse.elk.graph.KNode
import org.eclipse.elk.graph.KPort
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author ssm
 *
 */
@ViewSynthesisShared
class EquationSynthesis extends SubSynthesis<Assignment, KNode> {
    
    @Inject extension KNodeExtensionsReplacement
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensionsReplacement
    @Inject extension KLabelExtensions
    @Inject extension KExpressionsValueExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsSerializeHRExtension    
    @Inject extension EquationStyles
    @Inject extension DataflowRegionSynthesis
    @Inject extension SCChartsSynthesis
    @Inject extension KRenderingExtensions
    @Inject IResourceServiceProvider.Registry regXtext;    
    
    
    private val dataSources = <EObject> newHashSet
    private val dataSinks = <ValuedObject> newHashSet
    private val dataRefs = <ValuedObject> newHashSet
    
    val PORT_LABEL_FONT_SIZE = 7
    
    override performTranformation(Assignment equation) {
        val nodes = <KNode> newLinkedList
        
        nodes += equation.performDataSourceTransformation
        nodes += equation.performDataSinkTransformation
        
        val equationNodes = equation.expression.performEquationTransformation
        
        val node = equation.valuedObject.createNode
        
        val edge = equation.expression.performWireTransformation
        edge.target = node
        if (equation.valuedObject.eContainer instanceof ReferenceDeclaration) {
            if (equation.subReference != null) {
                if (DataflowRegionSynthesis.AUTOMATIC_INLINE.booleanValue) {
                    println("Searching port " + equation.valuedObject + " / " + equation.subReference.valuedObject)
                    edge.targetPort = equation.valuedObject.getPort(equation.subReference.valuedObject)
                } else {
                    edge.targetPort = equation.valuedObject.getPort(equation.subReference.valuedObject)
                }
            } 
        }        
        
        nodes += equationNodes
        nodes += node
        
        nodes
    }
    
    private def KPort getPortFromReference(ValuedObject referenceVO, ValuedObject correspondingVO) {
        val reference = (referenceVO.eContainer as ReferenceDeclaration).reference as Scope
        
        for(d : reference.declarations) {
            for(vo : d.valuedObjects) {
                if (correspondingVO.name.equals(vo.name)) {
                    return referenceVO.getPort(vo)            
                }
            }
        }
        
        return null   
    }
    
    private def dispatch Set<KNode> performEquationTransformation(Value value) {
        <KNode> newHashSet
    }
    
    private def dispatch Set<KNode> performEquationTransformation(ValuedObjectReference reference) {
        <KNode> newHashSet
    }
    
    private def dispatch Set<KNode> performEquationTransformation(OperatorExpression expression) {
        val result = <KNode> newHashSet
        val node = expression.createNode.associateWith(expression) => [ addOperatorNodeFigure ]
        node.addOperatorNodeLabel(expression.operator.serializeHR.removeCardinalities.toString)
        
        result += node
        
        for(se : expression.subExpressions) {
            val nodes = se.performEquationTransformation
            
            result += nodes
        }
        
        return result 
    }
    
    private def dispatch KEdge performWireTransformation(Value value) {
        val edge = createEdge.associateWith(value)
        edge.addWireFigure
        edge.source = value.getNode
        edge.sourcePort = value.getPort("out")
        edge
    }
    
    private def dispatch KEdge performWireTransformation(ValuedObjectReference reference) {
        val edge = createEdge.associateWith(reference)
        edge.source = reference.valuedObject.getNode
        var isArray = reference.valuedObject.isArray
        
        edge.setLayoutOption(LayeredOptions.INSIDE_SELF_LOOPS_YO, true)
        if (reference.valuedObject.eContainer instanceof ReferenceDeclaration) {
            if (reference.subReference != null) {
                if (DataflowRegionSynthesis.AUTOMATIC_INLINE.booleanValue) {
                    edge.sourcePort = reference.valuedObject.getPort(reference.subReference.valuedObject)
                } else {
                    edge.sourcePort = reference.valuedObject.getPort(reference.subReference.valuedObject)
                }
                isArray = reference.subReference.valuedObject.isArray
            } 
        } else {
            edge.sourcePort = reference.valuedObject.getPort("out")
        }
        if (isArray) {
            edge.addWireBusFigure            
        } else {
            edge.addWireFigure
        }
        
        edge        
    }

    private def dispatch KEdge performWireTransformation(OperatorExpression expression) {
        val node = expression.getNode
        
        for(se : expression.subExpressions) {
            val edge = se.performWireTransformation
            edge.target = node
        }
        val edge = createEdge.associateWith(expression)
        edge.source = node
        edge.addWireFigure
        
        edge
    }
    
    
    protected def Set<KNode> performReferenceNodeTransformation(ValuedObject vo) {
        val result = <KNode> newHashSet
        if (dataRefs.contains(vo)) return result
        dataRefs += vo
        
        val reference = (vo.eContainer as ReferenceDeclaration).reference as State
        if (reference.hasAnnotation("actor")) {
            val path = getSkinPath 
            val kgt = path + if (!path.endsWith("/")) "/" + reference.getStringAnnotationValue("actor") 
            println(vo.eResource.URI)
            val sl = vo.eResource.URI.segmentsList
            val nsl = sl.take(sl.length - 1).drop(1)
            val newURI = URI.createPlatformResourceURI(nsl.join("/") + "/" + kgt, false)
            println(newURI)

            val provider = regXtext.getResourceServiceProvider(newURI)
            val newResourceSet = provider.get(XtextResourceSet)
            newResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.FALSE)
            val res = newResourceSet.createResource(newURI)

            try {
                res.load(newResourceSet.loadOptions)
                val node = (res.getContents().get(0) as KNode).children.head
                vo.addNode(node)
                result += node 
            
                val vos = <ValuedObject> newArrayList
                reference.declarations.forEach[ vos += valuedObjects ]
            
                for(p : node.eAllContents.filter(KPort).toList) {
                    val id = p.data.filter(KIdentifier).head
                    val obj = vos.filter[ it.name.equals(id.id) ].head
                
                    vo.addPort(obj, p)
                }

                return result
            } catch (Exception e) {
                // Display default reference actor
            }            
        }     
        
        if (DataflowRegionSynthesis.AUTOMATIC_INLINE.booleanValue) {
            
            if (vo instanceof ValuedObject) {
                val declaration = vo.eContainer
                if (declaration instanceof ReferenceDeclaration) {
                    // Due to the fact that we're calling the same synthesis again
                    // and Klighd will drop the context afterwards,
                    // we have to save the context and set it again after the 
                    // synthesis finsihed.
                    val myViewContext = usedContext
                    val diagramVC = LightDiagramServices.translateModel2(
                        reference, usedContext)
                    use(myViewContext)
                    
                    val rootNode = if (diagramVC.viewModel.children.head.children.nullOrEmpty) 
                        diagramVC.viewModel.children.head else
                        diagramVC.viewModel.children.head.children.head 
                    
                    rootNode.addToNodeMap(vo)
                    rootNode.data.removeIf[it instanceof KRendering]
                    rootNode.addInlindedReferenceNodeFigure
                    rootNode.addInsideTopLeftNodeLabel(reference.label, PORT_LABEL_FONT_SIZE) => [
                        eAllContents.filter(KText).head.fontItalic = true
                    ]
                    
                    rootNode.setLayoutOption(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE) 
                    rootNode.setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.PORT_LABELS, SizeConstraint.NODE_LABELS)) 
                    rootNode.setLayoutOption(CoreOptions::PORT_LABELS_PLACEMENT, PortLabelPlacement.INSIDE) 
                    rootNode.setLayoutOption(CoreOptions::INSIDE_SELF_LOOPS_ACTIVATE, true) 
                    
                    val SMTA = rootNode.eAdapters.findFirst[it instanceof SourceModelTrackingAdapter] as SourceModelTrackingAdapter
                    
                    for(input : reference.declarations.filter(VariableDeclaration).filter[ input ]) {
                        for(v : input.valuedObjects.reverseView) {
                            
                            println("Creating  port " + vo + " / " + v)
                            val port = vo.createPort(v) => [
                                if (v.hasAnnotation("hidden")) {
                                    addLayoutParam(CoreOptions::PORT_SIDE, PortSide.SOUTH)
                                } else {
                                    addLayoutParam(CoreOptions::PORT_SIDE, PortSide.WEST)
                                }
                                setPortSize(0, 0)
                                addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -3f)
                                createLabel().configureInsidePortLabel(v.serializeHR.removeCardinalities.toString, PORT_LABEL_FONT_SIZE)
                                rootNode.ports += it
                            ]          
                            port.associateWith(v)
                            
                            val sourceNode = SMTA.getTargetElements(v).filter(KNode).head
                            if (sourceNode != null) {
                                sourceNode.outgoingEdges.immutableCopy.forEach[
                                    source = rootNode
                                    sourcePort = port
                                ]    
                                sourceNode.remove
                            }        
                        }
                    }        
                    
                    for(output : reference.declarations.filter(VariableDeclaration).filter[ output ]) {
                        for(v : output.valuedObjects) {
                            val port = vo.createPort(v) => [
                                addLayoutParam(CoreOptions::PORT_SIDE, PortSide.EAST)
                                setPortSize(0, 0)
                                addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -3f)
                                createLabel().configureInsidePortLabel(v.serializeHR.removeCardinalities.toString, PORT_LABEL_FONT_SIZE)
                                rootNode.ports += it
                            ]          
                            port.associateWith(v)              

                            val targetNode = SMTA.getTargetElements(v).filter(KNode).head
                            if (targetNode != null) {
                                targetNode.incomingEdges.immutableCopy.forEach[
                                    target = rootNode
                                    targetPort = port
                                ]    
                                targetNode.remove
                            }  
                        }
                    }
                                
                    
                    
                    result += rootNode
                }
            }
            
            return result
        } 
        
        val node = vo.createNode => [ 
            addLayoutParam(CoreOptions::ALGORITHM, "de.cau.cs.kieler.box");
            setLayoutOption(CoreOptions::SPACING_BORDER, 5f);
            setLayoutOption(CoreOptions::SPACING_NODE, 1f);
//            setLayoutOption(SidebarOverrideLayoutConfig::FIXED_SPACING, 1f);
            setLayoutOption(CoreOptions::EXPAND_NODES, true);         
            setLayoutOption(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER) 
            setLayoutOption(CoreOptions.PORT_LABELS_PLACEMENT, PortLabelPlacement.INSIDE)   
             
            if (DataflowRegionSynthesis.CIRCUIT.booleanValue) {
                addCircuitReferenceNodeFigure
            } else {  
                addReferenceNodeFigure
            }
        ]
        node.associateWith(vo)
        node.addNodeLabel((vo as ValuedObject).serializeHR.removeCardinalities.toString)
        node.addRegionsArea
        
        if (DataflowRegionSynthesis.CIRCUIT.booleanValue) {
            // SPACE HOLDERS            
            node.ports += createPort => [
                addLayoutParam(CoreOptions::PORT_SIDE, PortSide.SOUTH)
                setPortSize(0, 2)
            ]
            node.ports += createPort => [
                addLayoutParam(CoreOptions::PORT_SIDE, PortSide.NORTH)
                setPortSize(0, 2)
            ]
        }
                
        node.children += (vo as ValuedObject).createReferenceDataflowRegion
        
        for(output : reference.declarations.filter(VariableDeclaration).filter[ output ]) {
            for(v : output.valuedObjects) {
                val port = vo.createPort(v) => [
                    addLayoutParam(CoreOptions::PORT_SIDE, PortSide.EAST)
                    setPortSize(0, 0)
                    addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -3f)
                    createLabel().configureInsidePortLabel(v.serializeHR.removeCardinalities.toString, PORT_LABEL_FONT_SIZE)
                    node.ports += it
                ]          
                port.associateWith(v)              
            }
        }
        for(input : reference.declarations.filter(VariableDeclaration).filter[ input ]) {
            for(v : input.valuedObjects.reverseView) {
                val port = vo.createPort(v) => [
                    if (v.hasAnnotation("hidden")) {
                        addLayoutParam(CoreOptions::PORT_SIDE, PortSide.SOUTH)
                    } else {
                        addLayoutParam(CoreOptions::PORT_SIDE, PortSide.WEST)
                    }
                    setPortSize(0, 0)
                    addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -3f)
                    createLabel().configureInsidePortLabel(v.serializeHR.removeCardinalities.toString, PORT_LABEL_FONT_SIZE)
                    node.ports += it
                ]          
                port.associateWith(v)              
            }
        }
        
        result += node
        
        result        
    }
    
    
    private def Set<KNode> performDataSourceTransformation(Assignment equation) {
        val result = <KNode> newHashSet
        val vors = equation.expression.getAllPrimaryReferences.map[ valuedObject ]
            + equation.expression.getAllValues
        for(vo : vors) {
            if (!dataSources.contains(vo)) {
                
                var isReference = false
                if (vo instanceof ValuedObject) {
                    if (vo.eContainer instanceof ReferenceDeclaration) {
                        if ((vo.eContainer as ReferenceDeclaration).extern == null) {
                            isReference = true
                        }
                    }
                }
                
                dataSources += vo
                if (!isReference) {
                    val node = vo.createNode => [ 
                        if (DataflowRegionSynthesis.CIRCUIT.booleanValue) {
                            addInvisibleNodeFigure
                        } else {
                            addInputNodeFigure
                        }
                    ]
                    node.associateWith(vo)
                    node.addNodeLabel(vo.serializeHR.removeCardinalities.toString);
                    if (vo instanceof ValuedObjectReference || vo instanceof ValuedObject) {
                        node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::FIRST)
                    }
                    node.addLayoutParam(CoreOptions::PORT_ALIGNMENT_BASIC, PortAlignment.CENTER)
                    node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
                    result += node
                    
                    val port = vo.createPort("out") => [
                        addLayoutParam(CoreOptions::PORT_SIDE, PortSide.EAST)
//                        setPortSize(3, 3)
//                        addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -3f)
//                        createLabel().configureInsidePortLabel(v.serializeHR.toString, 5)
                        node.ports += it
                    ]          
                    port.associateWith(vo)
                    
                    // Order inputs accoring to declarations.
                    if (vo instanceof ValuedObject) {
                        val prio = vo.getNodePriorityBasedOnDeclaration
                        node.setLayoutOption(CoreOptions.POSITION, new KVector(prio, prio))
                    }                      
                } else {
                    result += (vo as ValuedObject).performReferenceNodeTransformation
                }
            }
        }
        result 
    }
    
    private def Set<KNode> performDataSinkTransformation(Assignment equation) {
        val result = <KNode> newHashSet
        val vo = equation.valuedObject
        
        if (vo.eContainer instanceof ReferenceDeclaration) {
            if ((vo.eContainer as ReferenceDeclaration).extern == null) {
                return vo.performReferenceNodeTransformation
            }
        }
        
        if (!dataSinks.contains(vo)) {
            dataSinks += vo
            val node = vo.createNode => [  
                if (DataflowRegionSynthesis.CIRCUIT.booleanValue) {
                    addInvisibleNodeFigure
                } else {
                    addOutputNodeFigure
                }
            ]
            node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::LAST)
            node.associateWith(vo)
            node.addNodeLabel(vo.serializeHR.removeCardinalities.toString);
            result += node
            
            // Order inputs accoring to declarations.
            if (vo instanceof ValuedObject) {
                val prio = vo.getNodePriorityBasedOnDeclaration
                node.setLayoutOption(CoreOptions.POSITION, new KVector(prio, prio))
            }                      
            
        }
        result 
    }
    
    def List<ValuedObjectReference> getAllPrimaryReferences(Expression expression) {
        <ValuedObjectReference> newArrayList => [
            if (expression == null) {
            } else if (expression instanceof ValuedObjectReference) { 
                it += expression
            } else { 
                it += expression.eAllContents.filter(ValuedObjectReference).
                filter[ !(eContainer instanceof ValuedObjectReference) ].toList
            }
        ]  
    }

    private def getNodePriorityBasedOnDeclaration(ValuedObject vo) {
        var prio = 0
        val declaration = vo.variableDeclaration
        val declarationParent = declaration.eContainer
        if (declarationParent instanceof Scope) {
            var count = true
            for(d : declarationParent.declarations) {
                if (d == declaration) count = false
                if (count) prio += d.valuedObjects.size
            }
        }
        for(v : declaration.valuedObjects) {
            if (v == vo) return prio + 1
            prio++
        }
        
        return 0            
    }
    
}