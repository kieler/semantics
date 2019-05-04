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
import de.cau.cs.kieler.klighd.kgraph.KLabel
import de.cau.cs.kieler.klighd.kgraph.KLabeledGraphElement
import de.cau.cs.kieler.kexpressions.OperatorType
import org.eclipse.elk.alg.layered.options.LayerConstraint
import de.cau.cs.kieler.kexpressions.Value
import org.eclipse.elk.core.options.Alignment
import org.eclipse.elk.alg.layered.options.NodePlacementStrategy
import de.cau.cs.kieler.sccharts.State
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property
import de.cau.cs.kieler.klighd.krendering.KPolygon
import de.cau.cs.kieler.klighd.krendering.KText

/**
 * @author ssm
 * @kieler.design 2017-09-26 proposed
 * @kieler.rating 2017-09-26 proposed yellow
 * 
 */
@ViewSynthesisShared
class EquationSynthesis extends SubSynthesis<Assignment, KNode> {

    public static val SynthesisOption AUTOMATIC_INLINE = SynthesisOption.createCheckOption("Automatic inline", false).
        setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption UNIQUE_WIRES = SynthesisOption.createCheckOption("Unique Wires", false).
        setCategory(GeneralSynthesisOptions::DATAFLOW)        
    public static val SynthesisOption ALIGN_INPUTS_OUTPUTS = SynthesisOption.createCheckOption("Align inputs/outputs", true).
        setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption ALIGN_CONSTANTS = SynthesisOption.createCheckOption("Align constants", false).
        setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption SHOW_WIRE_LABELS = SynthesisOption.createCheckOption("Show Wire Labels", true).
        setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption SHOW_EXPRESSION_PORT_LABELS = SynthesisOption.createCheckOption("Show Expression Port Labels", false).
        setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption SHOW_REFERENCED_PORT_LABELS = SynthesisOption.createCheckOption("Show Referenced Port Labels", true).
        setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption REFERENCED_PORT_LABELS_OUTSIDE = SynthesisOption.createCheckOption("Outside Referenced Port Labels", false).
        setCategory(GeneralSynthesisOptions::DATAFLOW)

    public static final IProperty<Boolean> INLINED_REFERENCE = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.inlinedReference", false);        
    public static final IProperty<Boolean> INPUT_FLAG = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.inputFlag", false);        
    public static final IProperty<Boolean> OUTPUT_FLAG = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.outputFlag", false);        

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
    @Inject extension StateSynthesis
    @Inject StateSynthesis stateSynthesis
    @Inject Injector injector
    
//    public static final IProperty<String> PROPAGATED_SKINPATH = new Property<String>(
//        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.propagatedSkinPath", "");

    
    static val ANNOTATION_FIGURE = "figure"
    
    static val PORT_LABEL_FONT_SIZE = 5
    static val INPUT_OUTPUT_TEXT_SIZE = 9
    static val PADDING_INPUT_LEFT = 2
    static val PADDING_INPUT_RIGHT = 4
    static val PADDING_OUTPUT_LEFT = 4
    static val PADDING_OUTPUT_RIGHT = 2
    
    protected static val PORT_IN_PREFIX = "in"
    protected static val PORT0_IN_PREFIX = "in0"
    protected static val PORT1_IN_PREFIX = "in1"
    protected static val PORT_OUT_PREFIX = "out"
    protected static val INPUT_ID = "Input"
    protected static val OUTPUT_ID = "Output"
    protected static val INPUT_OUTPUT_ID = "InputOutput"
    protected static val LOCAL_ID = "Local"
    protected static val IN_PORT = "in"
    protected static val OUT_PORT = "out"
    protected static val INOUT_PORT = "inout"
    
    protected static val DEFAULT_FIGURE_KEY = "OperatorExpression"
    protected static val UNARY_FIGURE_KEY = "OperatorExpressionUnary"
    protected static val ARITHMETICAL_FIGURE_KEY = "OperatorExpressionArithmetical"
    protected static val EXTERNAL_FUNCTION_KEY = "ExternalFunction"
    
    protected val defaultFigures = #{
        DEFAULT_FIGURE_KEY -> 'OperatorExpression.kgt',
        UNARY_FIGURE_KEY -> 'OperatorExpressionUnary.kgt',
        ARITHMETICAL_FIGURE_KEY -> 'OperatorExpressionArithmetical.kgt',
        'OperatorExpressionCONDITIONAL' -> 'OperatorExpressionCONDITIONAL.kgt',
        'OperatorExpressionINIT' -> 'OperatorExpressionINIT.kgt',
        'OperatorExpressionPRE' -> 'OperatorExpressionPRE.kgt',
        'Input' -> 'Input.kgt',
        'Output' -> 'Output.kgt',
        'InputOutput' -> 'InputOutput.kgt',
        'Local' -> 'Local.kgt',
        EXTERNAL_FUNCTION_KEY -> "OperatorExpressionUnary.kgt"
    }
    
    protected val referenceNodes = <KNode> newHashSet
    
    override getDisplayedSynthesisOptions() {
        val options = newArrayList(AUTOMATIC_INLINE, ALIGN_INPUTS_OUTPUTS, ALIGN_CONSTANTS, SHOW_WIRE_LABELS, 
            SHOW_EXPRESSION_PORT_LABELS, SHOW_REFERENCED_PORT_LABELS, REFERENCED_PORT_LABELS_OUTSIDE
        )
        
        return options
    }   
    

    override performTranformation(Assignment element) {
        null
    }

    def performTranformation(List<Assignment> elements, KNode rootNode) {
        val nodes = <KNode>newLinkedList
        val usedNodes = <KNode>newHashSet
        referenceNodes.clear
        
        val wiring = injector.getInstance(Wiring)

        wiring.createWires(elements)

        wiring.createSources(nodes)
        wiring.createSinks(nodes)
        wiring.connectWires()
        if (AUTOMATIC_INLINE.booleanValue)
            wiring.reWireInlining(nodes, rootNode)

        return nodes
    }

    protected def createSources(Wiring wiring, List<KNode> nodes) {
        for (wire : wiring.wires) {
            wire.createSource(wiring, nodes)         
        }
    }
            
    protected def createSource(Wire wire, Wiring wiring, List<KNode> nodes) {    
        val nodeExists = wire.semanticSource.nodeExists(wire.externalSourceReferenceCounter, wire.sourceIsEquationTarget)
        if (!nodeExists) {
            if (wire.sourceIsDeclaredInEquationScope) return 
        }
                    
        var KNode node 
        if (!nodeExists) {
            if (wire.semanticSourceReferenceDeclaration !== null) {
                
                node = wire.semanticSource.createNode(wire.externalSourceReferenceCounter, wire.sourceIsEquationTarget)
                
                if (wire.externalSourceReferenceCounter > 0) {
                    node = wire.semanticSource.createKGTNodeFromObject(wire.externalSourceReferenceCounter, 
                        wire.sourceIsEquationTarget, EXTERNAL_FUNCTION_KEY, ""
                    )                        
                } else {
                    node = node.createReferenceNode(wire.semanticSource, wire.externalSourceReferenceCounter, 
                        wire, (wire.semanticSource as ValuedObjectReference).valuedObject.serializeHR.removeCardinalities.toString, wire.semanticSourceReferenceDeclaration
                    )
                    wire.semanticSource.addNode(wire.externalSourceReferenceCounter, wire.sourceIsEquationTarget, node)
                }
            } else {
                var text = wire.source.serializeHR.toString
                if (wire.source instanceof OperatorExpression) {
                    text = wire.semanticSource.asOperatorExpression.operator.toString
                    if (wire.semanticSource.asOperatorExpression.operator == OperatorType.CONDITIONAL) {
                        text = ""
                    }
                    node = wire.semanticSource.createKGTNodeFromObject(wire.externalSourceReferenceCounter, 
                        wire.sourceIsEquationTarget, wire.source, text
                    )
                    node.associateWith(wire.semanticSource)
                } else {
                    node = wire.semanticSource.createKGTNode(wire.externalSourceReferenceCounter,
                        wire.sourceIsEquationTarget,  
                        //if (wire.wireIsLocal) LOCAL_ID else 
                            INPUT_ID
                    )
                    wire.semanticSource.addPort(OUT_PORT, node.ports.head)
                    node.addNodeLabelWithPadding(text, INPUT_OUTPUT_TEXT_SIZE, PADDING_INPUT_LEFT, PADDING_INPUT_RIGHT)
                    node.setProperty(INPUT_FLAG, true)
                    
                    val isConstant = wire.semanticSource instanceof Value
                    if(ALIGN_INPUTS_OUTPUTS.booleanValue && !isConstant) {
                        node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::FIRST)
                        node.addLayoutParam(CoreOptions::ALIGNMENT, Alignment.LEFT)                        
                    }
                    if(ALIGN_CONSTANTS.booleanValue && isConstant) { 
                        node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::FIRST)
                        node.addLayoutParam(CoreOptions::ALIGNMENT, Alignment.LEFT)
                    }
                        
                    println("Source Port> KPort@" + node.ports.head.hashCode)
                }
            }            
            
            println("Source> KNode@" + node.hashCode + ": " + wire)
            
            nodes += node
        } 
    }
    

    
    protected def createSinks(Wiring wiring, List<KNode> nodes) {
        for (wire : wiring.wires) {
            wire.createSink(wiring, nodes)
        }
    }
    
    protected def createSink(Wire wire, Wiring wiring, List<KNode> nodes) {     
        val nodeExists = wire.semanticSink.nodeExists(wire.externalSinkReferenceCounter, false)
        
        if (!nodeExists) {
            if (wire.sinkIsDeclaredInEquationScope) return
        }
        
        var node = wire.semanticSink.createNode(wire.externalSinkReferenceCounter, false)
        
        if (!nodeExists) {
            if (wire.semanticSinkReferenceDeclaration !== null) {
                if (wire.externalSourceReferenceCounter > 0) {
                    node = wire.semanticSource.createKGTNode(wire.externalSourceReferenceCounter, false, EXTERNAL_FUNCTION_KEY)                        
                } else {
                    node = node.createReferenceNode(wire.semanticSink, wire.externalSinkReferenceCounter, 
                        wire, (wire.semanticSink as ValuedObjectReference).valuedObject.serializeHR.removeCardinalities.toString, wire.semanticSinkReferenceDeclaration
                    )
                    wire.semanticSink.addNode(wire.externalSinkReferenceCounter, wire.sourceIsEquationTarget, node)
                }
            } else { 
                node = wire.semanticSink.createKGTNode(wire.externalSinkReferenceCounter, false, 
//                    if (wire.wireIsLocal) LOCAL_ID else 
                        OUTPUT_ID
                )
                wire.semanticSink.addPort(IN_PORT, node.ports.head)
                val text = wire.semanticSink.serializeHR.toString
                node.addNodeLabelWithPadding(text, INPUT_OUTPUT_TEXT_SIZE, PADDING_OUTPUT_LEFT, PADDING_OUTPUT_RIGHT)
                node.setProperty(OUTPUT_FLAG, true)
                
                if(ALIGN_INPUTS_OUTPUTS.booleanValue) {
                    node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::LAST)
                    node.addLayoutParam(CoreOptions::ALIGNMENT, Alignment.RIGHT)
                }
                
                println("Target Port> KPort@" + node.ports.head.hashCode)
                
            }
            
            println("Target> KNode@" + node.hashCode +  ": " + wire)            
            
            nodes += node
        }
    }



    protected def connectWires(Wiring wiring) {
        for (wire : wiring.wires) {
            wire.connectWire(wiring)
        }
    }
    
    protected def connectWire(Wire wire, Wiring wiring) {
        val sourceNode = wire.semanticSource.getExistingNode(wire.externalSourceReferenceCounter, wire.sourceIsEquationTarget)
        var sourcePort = wire.semanticSource.getPort(OUT_PORT)
        val targetNode = wire.semanticSink.getExistingNode(wire.externalSinkReferenceCounter, false)
        
        if (sourceNode === null || targetNode === null) return;
        
        println("Wire> KNode@" + sourceNode.hashCode + " - " + "Node@" + targetNode.hashCode +  ": " + wire)
         
        var targetPort = null as KPort
        if (wire.semanticSinkReferenceDeclaration !== null) {
            // If it is a reference, connect it to the specific port
            if (wire.semanticSink.asValuedObjectReference.subReference !== null) {
                targetPort = targetNode.getPort(wire.semanticSinkSubReference.valuedObject)
            }
        }
        if (wire.semanticSourceReferenceDeclaration !== null) {
            if (wire.semanticSource.asValuedObjectReference.subReference !== null) {
                val p = sourceNode.getPort(wire.semanticSourceSubReference.valuedObject)
                println("Wire> Source Port@" + p.hashCode + " for " + wire.semanticSourceSubReference.valuedObject) 
                sourcePort = p
            }
        }
        
        if (wire.semanticSource instanceof OperatorExpression) {
            val p = sourceNode.ports.filter[ 
                    it.getId.startsWith(PORT_OUT_PREFIX)
                ].head
//            sourcePort = wire.semanticSource.getPort(OUT_PORT, p)
            sourcePort = p
            println("Port> " + wire.semanticSource + " " + PORT_OUT_PREFIX + " " + p + "@" + p.hashCode)    
        }
        
        if (wire.semanticSink instanceof OperatorExpression) {
            val exp = wire.semanticSink.asOperatorExpression.subExpressions.get(wire.sinkIndex)
            if (exp instanceof ValuedObjectReference) {
                val s = if (exp.subReference !== null) exp.subReference.valuedObject else null
                if (targetNode.portExists(exp.valuedObject, s)) {
                    targetPort = targetNode.getPort(exp.valuedObject, s)
                }
            }
            if (targetPort === null) {
                targetPort = targetNode.createDynamicInputPort(wire)
            }
        } else if (targetPort === null) {
//            targetPort = wire.sink.getPort(IN_PORT)
            targetPort = targetNode.ports.filter[
                    it.getId.startsWith(PORT_IN_PREFIX)
                ].head
            println("Port> " + targetPort + "@" + targetPort.hashCode)
        }
        if (targetPort === null) {
            targetPort = targetNode.getPort(wire) => [
                addLayoutParam(CoreOptions::PORT_SIDE, PortSide.WEST)
            ]
            targetNode.ports += targetPort
        } 
        
        // Only label operator expressions and only do it once.
        var String label = null 
        if (SHOW_WIRE_LABELS.booleanValue) {
            if (wire.source == wire.semanticSource && wire.source instanceof OperatorExpression) {
                label = wire.source.serializeHR.toString
            }
        }
        
        println("Wire> KNode@" + sourceNode.hashCode + " " + 
            "KPort@" + sourcePort.hashCode +
            " - " + "KNode@" + targetNode.hashCode + " " +
            "KPort@" + targetPort.hashCode +  
             ": " + wire)
        wire.source.createWireEdge(sourceNode, sourcePort, targetNode, targetPort, label)
    }

    protected def createWireEdge(Object association, KNode sourceNode, KPort sourcePort, KNode targetNode, KPort targetPort, String label) { 
        val edge = createEdge.associateWith(association)
        edge.setLayoutOption(LayeredOptions.INSIDE_SELF_LOOPS_YO, true)
        edge.source = sourceNode
        edge.sourcePort = sourcePort
        edge.target = targetNode
        if (targetPort !== null) edge.targetPort = targetPort
        edge.addWireFigure
        if (!label.nullOrEmpty) {
            edge.createLabel.configureTailEdgeLabel(label, 5, KlighdConstants::DEFAULT_FONT_NAME)
        }
    }


    
    protected def KNode createReferenceNode(KNode node, Object association, Object association2, Wire wire, String label, ReferenceDeclaration referenceDeclaration) {
        if (association.nodeExists(association2)) {
            val oldNode = association.getNode(association2)
            if (referenceNodes.contains(oldNode)) return oldNode
        }
        
        var newNode = node
        
        node.associateWith(association)
        
        node.setLayoutOption(LayeredOptions::NODE_PLACEMENT_STRATEGY, NodePlacementStrategy.SIMPLE)
        node.setLayoutOption(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER) 
        node.setLayoutOption(CoreOptions.PORT_LABELS_PLACEMENT, PortLabelPlacement.INSIDE) 
        node.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 10d); //10.5 // 8f
        node.setLayoutOption(CoreOptions::PADDING, new ElkPadding(4d));
        node.addLayoutParam(KlighdProperties::EXPAND, false)      
        node.addLayoutParam(LayeredOptions::SPACING_PORT_PORT, 20d)
  
        
        if (referenceDeclaration.hasAnnotation(ANNOTATION_FIGURE)) {
            newNode = loadFigureFromKGT(referenceDeclaration.reference as Annotatable, association, referenceDeclaration, wire)
            newNode.setProperty(SCChartsSynthesis.SKINPATH, getSkinPath(usedContext))
            if (newNode !== null) return newNode 
        }
        if (referenceDeclaration.reference !== null && referenceDeclaration.reference.asAnnotatable.hasAnnotation(ANNOTATION_FIGURE)) {
            newNode = loadFigureFromKGT(referenceDeclaration.reference as Annotatable, association, referenceDeclaration.reference as Annotatable, wire)
            newNode.setProperty(SCChartsSynthesis.SKINPATH, getSkinPath(usedContext))
            if (newNode !== null) return newNode
        }
        
        val associationVOR = association as ValuedObjectReference
        val declaration = associationVOR.valuedObject.referenceDeclaration      
        if (AUTOMATIC_INLINE.booleanValue && declaration.reference !== null) {
            val state = declaration.reference as State
            newNode = stateSynthesis.transform(state).head
            newNode.setProperty(INLINED_REFERENCE, true)
        } else { 
            newNode.addReferenceNodeFigure.associateWith(association) => [
                setAsCollapsedView;
                addDoubleClickAction(ReferenceExpandAction::ID)  
            ]
            newNode.addReferenceNodeFigure.associateWith(association) => [
                setAsExpandedView;
                addDoubleClickAction(ReferenceExpandAction::ID);
            ]
            newNode.addNodeLabel(label)
        }
        
        val vor = wire.sink       
        if (referenceDeclaration.reference !== null) {
            newNode.createReferenceNodePorts(referenceDeclaration.reference as Scope, vor, [ input ], PortSide.WEST, true)
            newNode.createReferenceNodePorts(referenceDeclaration.reference as Scope, vor, [ output ], PortSide.EAST, false)
        }

         
        newNode.setLayoutOption(LayeredOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.PORTS, SizeConstraint.MINIMUM_SIZE))
        newNode.setProperty(SCChartsSynthesis.SKINPATH, getSkinPath(usedContext))

        referenceNodes += newNode 
        return newNode
    }
    
    protected def createReferenceNodePorts(KNode node, Scope scope, Object association, Function1<? super VariableDeclaration, Boolean> predicate, PortSide portSide, boolean reverse) {
        val scopes = scope.declarations.filter(VariableDeclaration).filter(predicate).toList
        val scopeView = if (reverse) scopes.reverseView else scopes        
        for(input : scopeView) {
            val declarationView = if (reverse) input.valuedObjects.reverseView else input.valuedObjects
            for(v : declarationView) {
                val port = node.createPort(v) => [
                    if (v.hasAnnotation("hidden")) {
                        addLayoutParam(CoreOptions::PORT_SIDE, PortSide.SOUTH)
                    } else {
                        addLayoutParam(CoreOptions::PORT_SIDE, portSide)
                    }
                    setPortSize(2, 2)
                    if (SHOW_REFERENCED_PORT_LABELS.booleanValue) {
                        if (REFERENCED_PORT_LABELS_OUTSIDE.booleanValue) {
                            createLabel().configureOutsidePortLabel(v.serializeHR.removeCardinalities.toString, PORT_LABEL_FONT_SIZE)
                        } else {
//                            addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -3d)
                            createLabel().configureInsidePortLabel(v.serializeHR.removeCardinalities.toString, PORT_LABEL_FONT_SIZE)
                        }
                    }
                    node.ports += it
                ]          
                port.associateWith(v)   
                port.setProperty(if (portSide == PortSide.WEST) INPUT_FLAG else OUTPUT_FLAG, true)
            }
        }        
    }
    
    protected def KNode loadFigureFromKGT(EObject eObject, Object association, Annotatable annotationObject, Wire wire) {
        if (!annotationObject.hasAnnotation(ANNOTATION_FIGURE)) return null
        
        val path = getSkinPath(usedContext) 
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
            association.addNode(false, node)

            val valuedObjects = eObject.asDeclarationScope.valuedObjects.filter[ input || output ].toList        
        
            for(p : node.eAllContents.filter(KPort).toList) {
                val id = p.data.filter(KIdentifier).head
                val v = valuedObjects.filter[ it.name.equals(id.id) ].head
                
                p.associateWith(v)          
                node.addPort(v, p)  
                println("Figure Port> KPort@" + p.hashCode + " for " + v)
            }
            
            println("Figure Node> KNode@" + node.hashCode)

            return node
        } catch (Exception e) {
            // Display default reference actor
        }            
    }
    
    protected def KNode createKGTNode(Object createExtensionObject, Object createExtensionObject2, 
        Object createExtensionObject3, String figureId
    ) {
        val node = getKGTFromBundle(defaultFigures.get(figureId))
        createExtensionObject.addNode(createExtensionObject2, createExtensionObject3, node)
        return node    
    }
    
    protected def KNode createKGTNodeFromObject(Object createExtensionObject, Object createExtensionObject2, 
        Object createExtensionObject3, Object figureObject, String labelText
    ) {
        var figureId = DEFAULT_FIGURE_KEY
        var port1Label = null as String
        var text = labelText
        
        if (figureObject instanceof OperatorExpression) {
            switch(figureObject.operator) {
            case PRE: figureId = if (figureObject.subExpressions.size == 1) UNARY_FIGURE_KEY 
                else DEFAULT_FIGURE_KEY + figureObject.operator.getName.toString
            case VAL,
            case NE,
            case NOT: figureId = UNARY_FIGURE_KEY 
            
            case CONDITIONAL, 
            case INIT: {
                    figureId = DEFAULT_FIGURE_KEY + figureObject.operator.getName.toString
                    text = ""
                }
            
            case SUB: figureId = if (figureObject.subExpressions.size == 1) UNARY_FIGURE_KEY else ARITHMETICAL_FIGURE_KEY  
            case ADD,
            case MULT,
            case DIV,
            case SHIFT_LEFT,
            case SHIFT_RIGHT,
            case SHIFT_RIGHT_UNSIGNED,
            case MOD,
            case EQ,
            case GEQ,
            case GT,
            case LEQ,
            case LT: {
                figureId = ARITHMETICAL_FIGURE_KEY; port1Label = figureObject.operator.serializeHR.toString
            }
            
            
            default: {}  
            }
        } else if (figureObject instanceof String) {
            figureId = figureObject
        }
        
        val node = createExtensionObject.createKGTNode(createExtensionObject2, createExtensionObject3, figureId)
        
        for (p : node.ports) {
            val id = p.getId
            if (id !== null) {
                if (id.startsWith(PORT_IN_PREFIX)) {
                    if (figureObject instanceof OperatorExpression) {
                        try {
                            val n = Integer.parseInt(id.substring(2))
                            if (n < figureObject.subExpressions.size) {
                                val exp = figureObject.subExpressions.get(n)
                                if (exp instanceof ValuedObjectReference) {
                                    val v = exp.valuedObject
                                    val s = if (exp.subReference !== null) exp.subReference.valuedObject else null
                                    node.addPort(v, s, p)
                                }
                            }
                        } catch(NumberFormatException e) {
                            // abort at convert issues
                        }    
                        if (!port1Label.nullOrEmpty) {     
                            if (SHOW_EXPRESSION_PORT_LABELS.booleanValue) {               
                                if (id == PORT1_IN_PREFIX) {
                                    val label = p.labels.head
                                    if (label !== null) {
                                        label.text = port1Label 
                                    }
                                }
                            } else {
                                if (id.startsWith(PORT_IN_PREFIX)) {
                                    val label = p.labels.head
                                    if (label !== null) {
                                        label.text = ""
                                    }
                                }
                            }
                        }
                    } else {
                        createExtensionObject.addPort(id, p)
                    }
                } 
                else if (id.startsWith(PORT_OUT_PREFIX)) {
                    createExtensionObject.addPort(PORT_OUT_PREFIX, p)
                    println("Port> " + createExtensionObject + " " + PORT_OUT_PREFIX + " " + p + "@" + p.hashCode)
                }                   
            }
        }
        
        if (!text.nullOrEmpty) {
            node.addNodeLabel(text, INPUT_OUTPUT_TEXT_SIZE)
        }
        
        return node
    }
    
    protected def KPort createDynamicInputPort(KNode node, Wire wire) {
        var maxIndex = -1
        var KPort maxPort = null 
        for (p : node.ports) {
            val id = p.getId
            if (id !== null) {
                if (id.startsWith(PORT_IN_PREFIX)) {
                    
                    try {
                        val n = Integer.parseInt(id.substring(2))
                        if (n == wire.sinkIndex) return p
                        if (n > maxIndex) {
                            maxIndex = n
                            maxPort = p
                        }
                    } catch(NumberFormatException e) {
                        // abort at convert issues
                    }                        
                    
                }                    
            }
        }
        
        if (maxPort === null) return null
        
        var KPort result = null
        for (pi : (maxIndex + 1) .. wire.sinkIndex) {
            result = maxPort.copy
            
            result.setId(PORT_IN_PREFIX + pi)
            
            node.ports.add(0, result)
        }   
        return result     
    } 
    
    protected def void reWireInlining(Wiring wiring, List<KNode> nodes, KNode rootNode) {
        val inlinedNodes = nodes.filter[ it.getProperty(INLINED_REFERENCE) ].toList
        for (node : inlinedNodes) {
            val parent = if (node.parent === null) rootNode else node.parent
            
            for (child : node.eContents.filter(KNode)) {
                parent.children += child
                
                child.setLayoutOption(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER) 
                child.setLayoutOption(CoreOptions.PORT_LABELS_PLACEMENT, PortLabelPlacement.INSIDE) 
                child.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 10d); //10.5 // 8f
                child.setLayoutOption(CoreOptions::PADDING, new ElkPadding(18d, 7d, 7d, 7d))
                child.addLayoutParam(LayeredOptions::SPACING_PORT_PORT, 20d)
                
                val inputNames = <String, KNode> newHashMap
                for (inputNode : child.children.filter(KNode).filter[ getProperty(INPUT_FLAG) ]) {
                    val name = inputNode.data.filter(KPolygon).head.children.filter(KText).head.text
                    inputNames.put(name, inputNode)                                        
                }
                val outputNames = <String, KNode> newHashMap
                for (outputNode : child.children.filter(KNode).filter[ getProperty(OUTPUT_FLAG) ]) {
                    val name = outputNode.data.filter(KPolygon).head.children.filter(KText).head.text
                    outputNames.put(name, outputNode)                                        
                }
                
                
                for (port : node.ports.toList.reverseView) {
                    val portName = port.labels.head.text
                    val portSide = port.portSide

                    if ((portSide != PortSide.EAST && inputNames.containsKey(portName)) || 
                        (portSide == PortSide.EAST && outputNames.containsKey(portName))
                    ) {
                        val newPort = port.copy
                        
                        newPort.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0d)
                        child.ports += newPort

                        if (portSide != PortSide.EAST) {                    
                            for (edge : node.incomingEdges.filter[ targetPort == port ]) {
                                val newEdge = edge.copy
                                edge.source.outgoingEdges += newEdge
                                newEdge.target = child
                                newEdge.targetPort = newPort
                            }
                            val inputNode = inputNames.get(portName)
                            if (inputNode !== null) {
                                for (edge : inputNode.outgoingEdges.immutableCopy) {
                                    edge.source = child
                                    edge.sourcePort = newPort
                                }                            
                                inputNode.remove
                        }
                        }
                        
                        else if (portSide == PortSide.EAST) {                    
                            for (edge : node.outgoingEdges.filter[ sourcePort == port ]) {
                                val newEdge = edge.copy
                                newEdge.source = child
                                newEdge.sourcePort = newPort
                                newEdge.target = edge.target
                            }
                            val outputNode = outputNames.get(portName)
                            if (outputNode !== null) {
                                for (edge : outputNode.incomingEdges.immutableCopy) {
                                    edge.target = child
                                    edge.targetPort = newPort
                                }                            
                                outputNode.remove
                            }
                        }
                        
                    }
                }
                
                child.setLayoutOption(LayeredOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.PORTS, SizeConstraint.MINIMUM_SIZE))
            }
        }
        
        for (node : inlinedNodes) {
            node.incomingEdges.immutableCopy.forEach[ remove ]
            node.outgoingEdges.immutableCopy.forEach[ remove ]
            nodes.remove(node)
        }
    }
    
    static def getId(KLabeledGraphElement node) {
        node.eContents?.filter(KIdentifier)?.head?.id
    }    

    private def setId(KLabeledGraphElement node, String id) {
        node.getData(KIdentifier).id = id
        node
    }
    
    static def KLabel getLabel(KNode node) {
        node.eContents.filter(KLabel).head
    }
    
    static def PortSide getPortSide(KPort port) {
        port.getProperty(CoreOptions::PORT_SIDE)
    }
    
}

