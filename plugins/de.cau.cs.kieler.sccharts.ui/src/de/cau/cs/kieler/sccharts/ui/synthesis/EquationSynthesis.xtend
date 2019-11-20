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
import com.google.inject.Injector
import de.cau.cs.kieler.annotations.Annotatable
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.IgnoreValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.ui.synthesis.KiCoolSynthesis
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import de.cau.cs.kieler.klighd.kgraph.KGraphElement
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.kgraph.KIdentifier
import de.cau.cs.kieler.klighd.kgraph.KLabel
import de.cau.cs.kieler.klighd.kgraph.KLabeledGraphElement
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KPolyline
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.actions.ReferenceExpandAction
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.EquationStyles
import java.util.EnumSet
import java.util.HashMap
import java.util.List
import org.eclipse.elk.alg.layered.options.LayerConstraint
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.alg.layered.options.NodePlacementStrategy
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.Alignment
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.EdgeType
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortLabelPlacement
import org.eclipse.elk.core.options.PortSide
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
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
    public static val SynthesisOption SEPARATED_ASSIGNMENTS = SynthesisOption.createCheckOption("Separated Assignments",
        false).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption ALIGN_INPUTS_OUTPUTS = SynthesisOption.createCheckOption(
        "Inputs/Outputs Alignment", true).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption ALIGN_CONSTANTS = SynthesisOption.createCheckOption("Constant Alignment", false).
        setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption SHOW_WIRE_LABELS = SynthesisOption.createCheckOption("Wire Labels", true).
        setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption SHOW_EXPRESSION_PORT_LABELS = SynthesisOption.createCheckOption(
        "Expression Port Labels", false).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption SHOW_REFERENCED_PORT_LABELS = SynthesisOption.createCheckOption(
        "Referenced Port Labels", true).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption REFERENCED_PORT_LABELS_OUTSIDE = SynthesisOption.createCheckOption(
        "Outside Referenced Port Labels", false).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption ALL_SEQUENTIAL_CONSTRAINTS = SynthesisOption.createCheckOption(
        "Show all Sequential Constraints", false).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption SEQUENTIAL_CONSTRAINTS = SynthesisOption.createCheckOption(
        "Show Sequential Constraints", false).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption INSTANCE_CONSTRAINTS = SynthesisOption.createCheckOption(
        "Connect Instances", false).setCategory(GeneralSynthesisOptions::DATAFLOW)

    public static final IProperty<Boolean> INLINED_REFERENCE = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.inlinedReference", false);
    public static final IProperty<Boolean> INPUT_FLAG = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.inputFlag", false);
    public static final IProperty<Boolean> OUTPUT_FLAG = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.outputFlag", false);
    public static final IProperty<Boolean> DATA_ARRAY_FLAG = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.dataArrayFlag", false);
    public static final IProperty<Boolean> REFERENCE_NODE = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.referenceNode", false);
    public static final IProperty<Boolean> SEQUENTIAL_EDGE = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.sequential", false);
    public static final IProperty<Boolean> INSTANCE_EDGE = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.instance", false);

    @Inject extension KNodeExtensionsReplacement
    @Inject extension KEdgeExtensions
    @Inject extension KLabelExtensions
    @Inject extension KPortExtensionsReplacement
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension SCChartsSynthesis
    @Inject extension EquationStyles
    @Inject extension KExtDeclarationExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension KRenderingExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension KExpressionsCompareExtensions
    @Inject StateSynthesis stateSynthesis
    @Inject Injector injector

    val HashMap<ReferenceDeclaration, KNode> referenceNodes = newHashMap

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
    protected static val IN_PORT = "in"
    protected static val SEQUENTIAL_IN_PORT = "in_seq"
    protected static val OUT_PORT = "out"
    protected static val SEQUENTIAL_OUT_PORT = "out_seq"
    protected static val INOUT_PORT = "inout"
    protected static val INSTANCE_IN_PORT = "in_inst"
    protected static val INSTANCE_OUT_PORT = "out_inst"

    protected val List<Pair<KNode, KNode>> sequentials = newArrayList

    protected val defaultFigures = #{
        "CLASS_INPUT" -> #["InputClass.kgt", "Class.kgt"],
        "CLASS_OUTPUT" -> #["InputClass.kgt", "Class.kgt"],
        "ARRAY_INPUT" -> #["InputArray.kgt", "Array.kgt"],
        "ARRAY_OUTPUT" -> #["InputArray.kgt", "Array.kgt"],
        "OPERATOR" -> #["OperatorExpression.kgt"],
        "PRE" -> #["OperatorExpressionPRE.kgt", "OperatorExpressionUnary.kgt", "OperatorExpression.kgt"],
        "NOT" -> #["OperatorExpressionNOT.kgt", "OperatorExpressionUnary.kgt", "OperatorExpression.kgt"],
        "EQ" -> #["OperatorExpressionEQ.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        "LT" -> #["OperatorExpressionLT.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        "LEQ" -> #["OperatorExpressionLEQ.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        "LOGICAL_AND" -> #["OperatorExpressionLOGICAL_AND.kgt", "OperatorExpression.kgt"],
        "LOGICAL_OR" -> #["OperatorExpressionLOGICAL_OR.kgt", "OperatorExpression.kgt"],
        "ADD" -> #["OperatorExpressionADD.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        "UNARY_SUB" -> #["OperatorExpressionUnarySUB.kgt", "OperatorExpressionUnary.kgt", "OperatorExpression.kgt"],
        "ARITHMETICAL_SUB" ->
            #["OperatorExpressionArithmeticalSUB.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        "VAL" -> #["OperatorExpressionVAL.kgt", "OperatorExpressionUnary.kgt", "OperatorExpression.kgt"],
        "NE" -> #["OperatorExpressionNE.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        "CONDITIONAL_UPDATE" -> #["OperatorExpressionUPDATE.kgt", "OperatorExpression.kgt"],
        "CONDITIONAL" -> #["OperatorExpressionCONDITIONAL.kgt", "OperatorExpression.kgt"],
        "INIT" -> #["OperatorExpressionINIT.kgt", "OperatorExpression.kgt"],
        "MULT" -> #["OperatorExpressionMULT.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        "DIV" -> #["OperatorExpressionDIV.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        "SHIFT_LEFT" ->
            #["OperatorExpressionSHIFT_LEFT.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        "SHIFT_RIGHT" ->
            #["OperatorExpressionSHIFT_RIGHT.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        "SHIFT_RIGHT_UNSIGNED" -> #["OperatorExpressionSHIFT_RIGHT_UNSIGNED.kgt", "OperatorExpressionArithmetical.kgt",
            "OperatorExpression.kgt"],
        "MOD" -> #["OperatorExpressionMOD.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        "GEQ" -> #["OperatorExpressionGEQ.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        "GT" -> #["OperatorExpressionGT.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        "INPUT" -> #["Input.kgt", "OperatorExpression.kgt"],
        "OUTPUT" -> #["Output.kgt", "OperatorExpression.kgt"],
        "INPUT_OUTPUT" -> #["InputOutput.kgt", "OperatorExpression.kgt"],
        "LOCAL" -> #["Local.kgt", "OperatorExpression.kgt"],
        "EXTERNAL_FUNCTION" -> #["OperatorExpressionUnary.kgt", "OperatorExpression.kgt"],
        "BITWISE_AND" ->
            #["OperatorExpresOperatorExpressionLOGICAL_AND.kgtsionBITWISE_AND.kgt",
                "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        "BITWISE_OR" ->
            #["OperatorExpressionBITWISE_OR.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"]
    }

    override getDisplayedSynthesisOptions() {
        val options = newArrayList(
            SEPARATED_ASSIGNMENTS,
            ALL_SEQUENTIAL_CONSTRAINTS,
            SEQUENTIAL_CONSTRAINTS,
            INSTANCE_CONSTRAINTS,
            AUTOMATIC_INLINE,
            ALIGN_INPUTS_OUTPUTS,
            ALIGN_CONSTANTS,
            SHOW_WIRE_LABELS,
            SHOW_EXPRESSION_PORT_LABELS,
            SHOW_REFERENCED_PORT_LABELS,
            REFERENCED_PORT_LABELS_OUTSIDE
        )

        return options
    }

    // combines the graphs for the assignments to a simplified connected Graph
    def List<KNode> simplifyAndCombine(List<KNode> nodes, KNode rootNode) {
        if (SEPARATED_ASSIGNMENTS.booleanValue) {
            return nodes
        }
        return new EquationSimplification(rootNode, injector).simplify(nodes)
    }

    // returns the label of the last index of the last sub reference or the label of the last sub reference
    def String lastSubReferenceLabel(ValuedObjectReference reference) {
        if (reference.subReference !== null) {
            return reference.subReference.lastSubReferenceLabel
        }
        if (reference.indices.size > 0) {
            return "[" + reference.indices.get(reference.indices.size - 1).serializeHR.toString + "]"
        }
        return reference.serializeHR.toString
    }

    // returns the last index of the last sub reference or the last sub reference
    def Expression lastSubReference(ValuedObjectReference reference) {
        if (reference.subReference !== null) {
            return reference.subReference.lastSubReference
        }
        if (reference.indices.size > 0) {
            return reference.indices.get(reference.indices.size - 1)
        }
        return reference
    }

    // returns true iff the last sub reference has indices
    def boolean lastSubReferenceIsArray(ValuedObjectReference reference) {
        if (reference.subReference !== null) {
            return reference.subReference.lastSubReferenceIsArray
        }
        return reference.indices.size > 0
    }

    // given a reference with sub references and indices
    // a copied reference is returned without the last index or sub reference
    def ValuedObjectReference removeLastReference(ValuedObjectReference reference) {
        val ref = reference.copy
        if (ref.subReference !== null) {
            ref.subReference = ref.subReference.removeLastReference
            return ref
        }
        if (ref.indices.size > 0) {
            ref.indices.remove(ref.indices.size - 1)
            return ref
        }
        return null
    }

    // performTransformation:
    // creates an equation tree graph from an expression and returns the root node of the tree
    // all created nodes are added to the nodes list
    // output should be true if output nodes should be generated
    // create input or output nodes for the valued object reference
    def dispatch KNode performTransformation(ValuedObjectReference reference, List<KNode> nodes, boolean output) {
        if ((reference.isClassReference && reference.subReference !== null) || reference.isArrayReference) {
            // go through the sub references and indices and create a data access node for each index of sub reference
            var ref = reference
            var KNode firstNode = null
            var KNode lastNode = null
            while (ref !== null) {
                var nextRef = ref.removeLastReference
                // create the dada access node
                var KNode currentNode = null
                if (ref.lastSubReferenceIsArray) {
                    currentNode = ref.createKGTNode(output ? "ARRAY_OUTPUT" : "ARRAY_INPUT", "")
                } else {
                    currentNode = ref.createKGTNode(output ? "CLASS_OUTPUT" : "CLASS_INPUT", "")
                }
                if (nextRef === null) {
                    // no more data access nodes are needed so a normal input or output node will be created
                    currentNode = ref.performTransformation(nodes, output)
                    currentNode.associateWith(ref)
                } else {
                    currentNode.associateWith(nextRef)
                    nodes += currentNode
                }
                if (firstNode === null) {
                    firstNode = currentNode
                }
                if (lastNode !== null) {
                    // connect the last data access node with the new data access node
                    currentNode.setProperty(DATA_ARRAY_FLAG, true)
                    if (output) {
                        val sourcePort = lastNode.findPortById(OUT_PORT)
                        sourcePort.connectWith(currentNode.findPortById(PORT0_IN_PREFIX), ref.lastSubReferenceLabel)
                    } else {
                        val sourcePort = currentNode.findPortById(OUT_PORT)
                        sourcePort.connectWith(lastNode.findPortById(PORT0_IN_PREFIX), ref.lastSubReferenceLabel)
                    }
                }
                if (nextRef !== null) {
                    // set the port labels of the new data access node
                    if (output) {
                        currentNode.findPortById(PORT0_IN_PREFIX).setLabel(ref.lastSubReferenceLabel, false)
                        currentNode.findPortById(PORT0_IN_PREFIX).associateWith(ref.lastSubReference)
                    } else {
                        currentNode.findPortById(OUT_PORT).setLabel(ref.lastSubReferenceLabel, false)
                        currentNode.findPortById(OUT_PORT).associateWith(ref.lastSubReference)
                    }
                }
                lastNode = currentNode
                ref = nextRef
            }
            return firstNode
        }
        var node = reference.valuedObject.createKGTNode(output ? "OUTPUT" : "INPUT", "")
        var text = reference.valuedObject.reference.serializeHR.toString
        if (reference.isModelReference) {
            // in case of a model reference the subreference should not be in the label of the node
            text = reference.valuedObject.reference.serializeHR.toString
        }
        if (reference.isModelReference && reference.subReference !== null) {
            node = node.createReferenceNode(reference, text)
            // write the subreferences to the port labels
            if (reference.subReference !== null) {
                if (output) {
                    node.getInputPortWithNumber(0).setLabel(reference.subReference.serializeHR.toString, true)
                    node.getInputPortWithNumber(0).associateWith(reference.subReference)
                } else {
                    node.findPortById(OUT_PORT)?.setLabel(reference.subReference.serializeHR.toString, true)
                    node.findPortById(OUT_PORT)?.associateWith(reference.subReference)
                }
            }
        } else {
            node.addNodeLabelWithPadding(text, INPUT_OUTPUT_TEXT_SIZE,
                output ? PADDING_OUTPUT_LEFT : PADDING_INPUT_LEFT, output ? PADDING_OUTPUT_RIGHT : PADDING_INPUT_RIGHT)
        }
        node.setProperty(output ? OUTPUT_FLAG : INPUT_FLAG, true)
        if (ALIGN_INPUTS_OUTPUTS.booleanValue) {
            node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT,
                output ? LayerConstraint::LAST : LayerConstraint::FIRST)
            node.addLayoutParam(CoreOptions::ALIGNMENT, output ? Alignment.RIGHT : Alignment.LEFT)
        }
        node.associateWith(reference)
        if (reference.valuedObject.array) {
            node.setProperty(DATA_ARRAY_FLAG, true)
        }
        nodes += node
        return node
    }

    // create one node for each value inside of a Vector Value and connect them to a Vector node
    def dispatch KNode performTransformation(VectorValue e, List<KNode> nodes, boolean output) {
        val node = e.createKGTNode(output ? "ARRAY_OUTPUT" : "ARRAY_INPUT", "")
        for (value : e.values) {
            if (!(value instanceof IgnoreValue)) {
                val valueNode = value.performTransformation(nodes, false)
                val sourcePort = valueNode.findPortById(OUT_PORT)
                val targetPort = node.getInputPortWithNumber(e.values.indexOf(value))
                sourcePort.connectWith(targetPort,
                    valueNode.getProperty(KlighdInternalProperties.MODEL_ELEMEMT)?.serializeHR?.toString)
                targetPort.setLabel(e.values.indexOf(value).toString, false)
            }
        }
        node.setProperty(DATA_ARRAY_FLAG, true)
        node.associateWith(e)
        nodes += node
        return node
    }

    // create an input node for constant values
    def dispatch KNode performTransformation(Value e, List<KNode> nodes, boolean output) {
        val node = e.createKGTNode("INPUT", "")
        val text = e.serializeHR.toString
        node.addNodeLabelWithPadding(text, INPUT_OUTPUT_TEXT_SIZE, PADDING_INPUT_LEFT, PADDING_INPUT_RIGHT)
        node.setProperty(INPUT_FLAG, true)

        if (ALIGN_CONSTANTS.booleanValue) {
            node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::FIRST)
            node.addLayoutParam(CoreOptions::ALIGNMENT, Alignment.LEFT)
        }
        node.associateWith(e)
        nodes += node
        return node
    }

    // create an input or output node for constant values
    def dispatch KNode performTransformation(OperatorExpression operatorExpr, List<KNode> nodes, boolean output) {
        var figureId = operatorExpr.operator.getName()
        if (operatorExpr.operator == OperatorType.SUB) {
            figureId = if(operatorExpr.subExpressions.size == 1) "UNARY_SUB" else "ARITHMETICAL_SUB"
        }
        if (operatorExpr.operator == OperatorType.CONDITIONAL && operatorExpr.subExpressions.size == 2) {
            figureId = "CONDITIONAL_UPDATE"
        }
        var text = operatorExpr.operator.toString
        if (operatorExpr.operator == OperatorType.CONDITIONAL) {
            text = ""
        }
        // create kgt node
        val node = operatorExpr.createKGTNode(figureId, text)
        for (subExpr : operatorExpr.subExpressions) {
            val source = subExpr.performTransformation(nodes, false)
            val sourcePort = source.findPortById(OUT_PORT)
            val targetPort = node.getInputPortWithNumber(operatorExpr.subExpressions.indexOf(subExpr))
            sourcePort.connectWith(targetPort, subExpr.serializeHR.toString)
        }
        // show or hide port labels
        if (SHOW_EXPRESSION_PORT_LABELS.booleanValue) {
            for (p : node.ports) {
                val label = p.labels.head
                if (label !== null) {
                    if (operatorExpr.operator != OperatorType::CONDITIONAL) {
                        label.text = operatorExpr.operator.serializeHR.toString
                    }
                }
            }
        } else {
            for (p : node.ports) {
                val label = p.labels.head
                if (label !== null) {
                    label.text = ""
                }
            }
        }
        node.associateWith(operatorExpr)
        nodes += node
        return node
    }

    // creates an equation graph for an assignment and returns the list of created nodes
    override performTranformation(Assignment element) {
        val nodes = <KNode>newLinkedList
        val source = element.expression.performTransformation(nodes, false)
        val sourcePort = source.findPortById(OUT_PORT)
        val target = element.reference.performTransformation(nodes, true)
        val targetPort = target.findPortById(PORT0_IN_PREFIX)
        sourcePort.connectWith(targetPort, element.expression.serializeHR.toString)
        return nodes
    }

    // creates an equation graph for a list of assignments and returns a list of created nodes
    def performTranformation(List<Assignment> elements, KNode rootNode) {
        sequentials.clear
        val nodes = <KNode>newLinkedList
        val List<KNode> lastKNodes = newArrayList
        for (assignment : elements) {
            val knodes = assignment.performTranformation
            nodes += knodes
            if (lastKNodes !== null) {
                for (n : knodes.filter[isInput || isOutput]) {
                    for (last : lastKNodes.
                        filter[sourceEquals(n) && (!isInput || !n.isInput) && (isInput || isOutput)]) {
                        sequentials.add(new Pair(last, n))
                    }
                }
            }
            if (assignment.sequential) {
                lastKNodes += knodes
            } else {
                lastKNodes.clear
            }
        }
        return nodes.addInstanceEdges.addSequentialEdges.simplifyAndCombine(rootNode).reWireInlining
    }

    // add instance edges for reference nodes witch are the same instance
    def addInstanceEdges(List<KNode> nodes) {
        if (INSTANCE_CONSTRAINTS.booleanValue) {
            for (n : nodes.filter[isReference]) {
                for (m : nodes.filter [
                    sourceEquals(n) && n != it && !incomingEdges.exists[source == n] && !outgoingEdges.exists [
                        target == n
                    ]
                ]) {
                    var source = n
                    var target = m
                    if (m.isSequential(n)) {
                        source = m
                        target = n
                    }
                    val edge = createEdge
                    var sourcePort = source.findPortById(INSTANCE_OUT_PORT)
                    if (sourcePort === null) {
                        sourcePort = createPort => [
                            data += KGraphFactory.eINSTANCE.createKIdentifier()
                            setId(INSTANCE_OUT_PORT);
                            setProperty(CoreOptions::PORT_SIDE, PortSide.EAST)
                        ]
                        source.ports.add(sourcePort)
                    }
                    var targetPort = target.findPortById(INSTANCE_IN_PORT)
                    if (targetPort === null) {
                        targetPort = createPort => [
                            data += KGraphFactory.eINSTANCE.createKIdentifier()
                            setId(INSTANCE_IN_PORT);
                            setProperty(CoreOptions::PORT_SIDE, PortSide.WEST)
                        ]
                        target.ports.add(targetPort)
                    }
                    edge.setLayoutOption(LayeredOptions.INSIDE_SELF_LOOPS_YO, true)
                    edge.source = source
                    edge.sourcePort = sourcePort
                    edge.target = target
                    edge.targetPort = targetPort
                    edge.addWireFigure
                    edge.data.filter(KRendering).get(0).foreground = Colors.GREEN
                    edge.setLayoutOption(CoreOptions.EDGE_TYPE, EdgeType.DEPENDENCY)
                    edge.getKContainerRendering as KPolyline => [
                        lineStyle = LineStyle::CUSTOM;
                        lineStyle.dashPattern.clear;
                        lineStyle.dashPattern += newArrayList(2 as float, 2 as float);
                    ]
                    edge.setProperty(INSTANCE_EDGE, true)
                    source.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::NONE)
                    target.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::NONE)
                }
            }
        }
        return nodes
    }

    def addSequentialEdges(List<KNode> nodes) {
        if (SEQUENTIAL_CONSTRAINTS.booleanValue) {
            if (ALL_SEQUENTIAL_CONSTRAINTS.booleanValue) {
                for (seq : sequentials.reverse.filter[key.isOutput && value.isInput]) {
                    if (!seq.key.isInputForEquation(seq.value)) {
                        seq.key.connectSequential(seq.value)
                    }
                }
                for (seq : sequentials.reverse.filter[!key.isOutput || !value.isInput]) {
                    if (!seq.key.isInputForEquation(seq.value)) {
                        seq.key.connectSequential(seq.value)
                    }
                }
            } else {
                val outputs = nodes.filter[isOutput]
                var sequentialEnd = nodes.size
                for (var i = outputs.size - 1; i >= 0; i--) {
                    val pos = nodes.indexOf(outputs.get(i));
                    val beforePos = if(i > 0) nodes.indexOf(outputs.get(i - 1)) else -1
                    var needSequential = false
                    for (var j = beforePos + 1; j <= pos; j++) {
                        for (var k = pos + 1; k < sequentialEnd; k++) {
                            needSequential = needSequential || nodes.get(j).isSequential(nodes.get(k))
                        }
                    }
                    if (needSequential) {
                        for (var k = pos + 1; k < sequentialEnd; k++) {
                            if (nodes.get(k).isInput && nodes.get(k).sourceEquals(nodes.get(pos)) &&
                                !nodes.get(k).incomingEdges.exists[isSequential]) {
                                nodes.get(pos).connectSequential(nodes.get(k))
                                needSequential = false
                            }
                        }
                        if (needSequential) {
                            nodes.get(pos).connectSequential(nodes.get(pos + 1))
                            needSequential = false
                        }
                    } else {
                        sequentialEnd = pos + 1
                    }
                }
            }
        }
        return nodes
    }

    def connectSequential(KNode before, KNode after) {
        val edge = createEdge
        var sourcePort = before.findPortById(SEQUENTIAL_OUT_PORT)
        if (sourcePort === null) {
            sourcePort = createPort => [
                data += KGraphFactory.eINSTANCE.createKIdentifier()
                setId(SEQUENTIAL_OUT_PORT);
                setProperty(CoreOptions::PORT_SIDE, PortSide.EAST)
            ]
            before.ports.add(sourcePort)
        }
        var targetPort = after.findPortById(SEQUENTIAL_IN_PORT)
        if (targetPort === null) {
            targetPort = createPort => [
                data += KGraphFactory.eINSTANCE.createKIdentifier()
                setId(SEQUENTIAL_IN_PORT);
                setProperty(CoreOptions::PORT_SIDE, PortSide.WEST)
            ]
            after.ports.add(targetPort)
        }
        edge.setLayoutOption(LayeredOptions.INSIDE_SELF_LOOPS_YO, true)
        edge.source = before
        edge.sourcePort = sourcePort
        edge.target = after
        edge.targetPort = targetPort
        edge.addWireFigure
        edge.data.filter(KRendering).get(0).foreground = Colors.RED
        edge.setLayoutOption(CoreOptions.EDGE_TYPE, EdgeType.DEPENDENCY)
        edge.getKContainerRendering as KPolyline => [
            lineStyle = LineStyle::CUSTOM;
            lineStyle.dashPattern.clear;
            lineStyle.dashPattern += newArrayList(2 as float, 2 as float);
        ]
        edge.setProperty(SEQUENTIAL_EDGE, true)
        before.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::NONE)
        after.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::NONE)
    }

    protected def KNode createReferenceNode(KNode node, ValuedObjectReference voRef, String label) {

        val list = node.data.filter[it instanceof KRendering].toList
        for (x : list) {
            node.data.remove(x)
        }
        var newNode = node

        node.setLayoutOption(LayeredOptions::NODE_PLACEMENT_STRATEGY, NodePlacementStrategy.SIMPLE)
        node.setLayoutOption(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER)
        node.setLayoutOption(CoreOptions.PORT_LABELS_PLACEMENT, PortLabelPlacement.INSIDE)
        node.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 10d); // 10.5 // 8f
        node.setLayoutOption(CoreOptions::PADDING, new ElkPadding(4d));
        node.addLayoutParam(KlighdProperties::EXPAND, false)
        node.addLayoutParam(LayeredOptions::SPACING_PORT_PORT, 20d)

        val referenceDeclaration = voRef.valuedObject.declaration as ReferenceDeclaration
        if (referenceDeclaration.hasAnnotation(ANNOTATION_FIGURE)) {
            newNode = referenceDeclaration.reference.createKGTNode("", label)
            newNode.setProperty(SCChartsSynthesis.SKINPATH, getSkinPath(usedContext))
            newNode.addNodeLabelWithPadding(label, INPUT_OUTPUT_TEXT_SIZE, PADDING_INPUT_LEFT, PADDING_INPUT_RIGHT)
            newNode.setProperty(REFERENCE_NODE, true)
            if(newNode !== null) return newNode
        }
        if (referenceDeclaration.reference !== null &&
            referenceDeclaration.reference.asAnnotatable.hasAnnotation(ANNOTATION_FIGURE)) {
            newNode = referenceDeclaration.reference.createKGTNode("", label)
            newNode.setProperty(SCChartsSynthesis.SKINPATH, getSkinPath(usedContext))
            newNode.addNodeLabelWithPadding(label, INPUT_OUTPUT_TEXT_SIZE, PADDING_INPUT_LEFT, PADDING_INPUT_RIGHT)
            newNode.setProperty(REFERENCE_NODE, true)
            if(newNode !== null) return newNode
        }

        val declaration = voRef.valuedObject.referenceDeclaration
        if (AUTOMATIC_INLINE.booleanValue && declaration.reference !== null) {
            if (referenceNodes.containsKey(declaration)) {
                newNode = referenceNodes.get(declaration).copy
            } else {
                val state = declaration.reference as State
                newNode = stateSynthesis.transform(state).head.trimReferenceNode
                referenceNodes.put(declaration, newNode.copy)
            }
            if (node.getInputPortWithNumber(0) !== null) {
                newNode.ports.add(node.getInputPortWithNumber(0).copy)
            }
            if (node.findPortById(OUT_PORT) !== null) {
                newNode.ports.add(node.findPortById(OUT_PORT).copy)
            }
            newNode.setProperty(INLINED_REFERENCE, true)
        } else {
            newNode.data.filter[it instanceof KRendering]
            newNode.addReferenceNodeFigure.associateWith(voRef) => [
                setAsCollapsedView;
                addDoubleClickAction(ReferenceExpandAction::ID)
            ]

            newNode.addReferenceNodeFigure.associateWith(voRef) => [
                setAsExpandedView;
                addDoubleClickAction(ReferenceExpandAction::ID);
            ]
            newNode.addNodeLabelWithPadding(label, INPUT_OUTPUT_TEXT_SIZE, PADDING_INPUT_LEFT, PADDING_INPUT_RIGHT)
        }

        newNode.setLayoutOption(LayeredOptions::NODE_SIZE_CONSTRAINTS,
            EnumSet.of(SizeConstraint.PORTS, SizeConstraint.MINIMUM_SIZE))
        newNode.setProperty(SCChartsSynthesis.SKINPATH, getSkinPath(usedContext))
        newNode.setProperty(REFERENCE_NODE, true)
        return newNode
    }

    def trimReferenceNode(KNode node) {
        var first = true
        for (dec : node.data.filter(KContainerRendering).get(0).children) {
            if (!first) {
                dec.remove
            }
            first = false
        }
        return node
    }

    protected def reWireInlining(List<KNode> nodes) {
        val inlinedNodes = nodes.filter[it.getProperty(INLINED_REFERENCE)].toList
        for (node : inlinedNodes) {

            for (child : node.eContents.filter(KNode).toList) {
                nodes += child
                child.setLayoutOption(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER)
                child.data.filter(de.cau.cs.kieler.klighd.krendering.KRendering).forEach [
                    placementData = null
                ]

                val inputNames = <String, KNode>newHashMap
                for (inputNode : child.children.filter(KNode).filter[getProperty(INPUT_FLAG)]) {
                    val name = inputNode.data.filter(KPolygon).head.children.filter(KText).head.text
                    inputNames.put(name, inputNode)
                }
                val outputNames = <String, KNode>newHashMap
                for (outputNode : child.children.filter(KNode).filter[getProperty(OUTPUT_FLAG)]) {
                    val name = outputNode.data.filter(KPolygon).head.children.filter(KText).head.text
                    outputNames.put(name, outputNode)
                }

                for (port : node.ports.immutableCopy.reverseView) {
                    val portName = port.labels.head?.text
                    val portSide = port.portSide
                    if ((portSide != PortSide.EAST && inputNames.containsKey(portName)) ||
                        (portSide == PortSide.EAST && outputNames.containsKey(portName)) || portName === null) {
                        val newPort = port.copy

                        newPort.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0d)
                        child.ports += newPort

                        if (portSide != PortSide.EAST) {
                            for (edge : node.incomingEdges.immutableCopy.filter[targetPort == port]) {
                                edge.target = child
                                edge.targetPort = newPort
                            }
                            if (portName !== null) {
                                val inputNode = inputNames.get(portName)
                                if (inputNode !== null) {
                                    for (edge : inputNode.outgoingEdges.immutableCopy) {
                                        edge.source = child
                                        edge.sourcePort = newPort
                                    }
                                    inputNode.remove
                                }
                            }
                        } else if (portSide == PortSide.EAST) {
                            for (edge : node.outgoingEdges.immutableCopy.filter[sourcePort == port]) {
                                edge.source = child
                                edge.sourcePort = newPort
                            }
                            if (portName !== null) {
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
                }
            }
        }
        for (node : inlinedNodes) {
            nodes.betterRemove(node)
        }
        return nodes
    }

    // removes a node from the list and from the graph
    def betterRemove(List<KNode> nodes, KNode node) {
        while (node.incomingEdges !== null && node.incomingEdges.size > 0) {
            node.incomingEdges.get(0).betterRemove
        }
        while (node.outgoingEdges !== null && node.outgoingEdges.size > 0) {
            node.outgoingEdges.get(0).betterRemove
        }
        node.remove
        nodes.remove(node)
    }

    // removes the edge and the ports if they are not needed anymore
    def void betterRemove(KEdge e) {
        val source = e.source
        val target = e.target
        if (e.sourcePort !== null && e.sourcePort.edges !== null && e.sourcePort.edges.size == 1) {
            e.sourcePort.remove
        }
        if (e.targetPort !== null && e.targetPort.edges !== null && e.targetPort.edges.size == 1) {
            e.targetPort.remove
        }
        e.remove
        source?.outgoingEdges?.remove(e)
        target?.incomingEdges?.remove(e)
    }

    // create a single node from a kgt file
    protected def KNode createKGTNode(
        EObject createExtensionObject,
        String figureId,
        String label
    ) {
        if (createExtensionObject instanceof Annotatable) {
            val annotationObject = createExtensionObject as Annotatable
            val path = getSkinPath(usedContext)
            val kgt = path + if(!path.endsWith("/")) "/" + annotationObject.getStringAnnotationValue(ANNOTATION_FIGURE)
            val sl = createExtensionObject.eResource.URI.segmentsList
            val nsl = sl.take(sl.length - 1).drop(1)
            val newURI = URI.createPlatformResourceURI(nsl.join("/") + "/" + kgt, false)

            val newResourceSet = KiCoolSynthesis.KGTInjector.getInstance(XtextResourceSet)
            newResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.FALSE)
            val res = newResourceSet.createResource(newURI)

            try {
                res.load(newResourceSet.loadOptions)
                val node = (res.getContents().get(0) as KNode).children.head
                val valuedObjects = createExtensionObject.asDeclarationScope.valuedObjects.filter[input || output].
                    toList
                for (p : node.eAllContents.filter(KPort).toList) {
                    val id = p.data.filter(KIdentifier).head
                    val v = valuedObjects.filter[it.name.equals(id.id)].head

                    p.associateWith(v)
                    node.addPort(v, p)
                }
                return node
            } catch (Exception e) {
            }
        }
        var showLabel = false
        // check if a figure file in the skin folder exists
        if (createExtensionObject.eResource !== null && createExtensionObject.eResource.URI !== null) {
            val sl = createExtensionObject.eResource.URI.segmentsList
            val nsl = sl.take(sl.length - 1).drop(1)
            val path = nsl.join("/") + "/" + getSkinPath(usedContext)
            for (figure : defaultFigures.get(figureId)) {
                val kgt = path + if(!path.endsWith("/")) "/" + figure
                val newURI = URI.createPlatformResourceURI(kgt, false)
                val newResourceSet = KiCoolSynthesis.KGTInjector.getInstance(XtextResourceSet)
                newResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.FALSE)
                val res = newResourceSet.createResource(newURI)
                try {
                    res.load(newResourceSet.loadOptions)
                    val node = (res.getContents().get(0) as KNode).children.head
                    if (!label.nullOrEmpty && showLabel) {
                        node.addNodeLabel(label, INPUT_OUTPUT_TEXT_SIZE)
                    }
                    return node
                } catch (Exception _) {
                    showLabel = true
                }
            }
        }
        // check if the skin folder in inside of the plugin
        val oldSkinPrefix = skinPrefix
        skinPrefix = getSkinPath(usedContext)
        skinPrefix += if(!skinPrefix.endsWith("/")) "/"
        showLabel = false
        for (figure : defaultFigures.get(figureId)) {
            if (doesKGTExist(figure)) {
                val node = getKGTFromBundle(figure)
                skinPrefix = oldSkinPrefix
                if (!label.nullOrEmpty && showLabel) {
                    node.addNodeLabel(label, INPUT_OUTPUT_TEXT_SIZE)
                }
                return node
            } else
                showLabel = true
        }
        skinPrefix = oldSkinPrefix
        showLabel = false
        // fall back to default figures
        for (figure : defaultFigures.get(figureId)) {
            if (doesKGTExist(figure)) {
                val node = getKGTFromBundle(figure)
                if (!label.nullOrEmpty && showLabel) {
                    node.addNodeLabel(label, INPUT_OUTPUT_TEXT_SIZE)
                }
                return node
            } else
                showLabel = true
        }
        throw new IllegalArgumentException("Resource not found")
    }

    // connects two ports with a wire
    def connectWith(KPort source, KPort target, String label) {
        if (source === null || target === null) {
            return
        }
        val edge = createEdge
        edge.setLayoutOption(LayeredOptions.INSIDE_SELF_LOOPS_YO, true)
        edge.source = source.node
        edge.sourcePort = source
        edge.target = target.node
        edge.targetPort = target
        if (source.node.hasProperty(DATA_ARRAY_FLAG) || target.node.hasProperty(DATA_ARRAY_FLAG)) {
            edge.addWireBusFigure
        } else {
            edge.addWireFigure
        }
        if (SHOW_WIRE_LABELS.booleanValue && !source.node.isInput && label !== null) {
            edge.createLabel.configureTailEdgeLabel(label, 5, KlighdConstants::DEFAULT_FONT_NAME)
        }
    }

    // set the label of a port
    private def setLabel(KPort port, String label, boolean reference) {
        var portLabel = port.labels.head
        if (reference) {
            if (SHOW_REFERENCED_PORT_LABELS.booleanValue) {
                if (REFERENCED_PORT_LABELS_OUTSIDE.booleanValue) {
                    if (portLabel !== null) {
                        port.labels.remove(0)
                    }
                    port.createLabel().configureOutsidePortLabel(label, PORT_LABEL_FONT_SIZE)
                } else {
                    if (portLabel !== null) {
                        port.labels.remove(0)
                    }
                    port.createLabel().configureInsidePortLabel(label, PORT_LABEL_FONT_SIZE)
                }
            }
        } else {
            if (portLabel === null) {
                port.createLabel.configureInsidePortLabel(label, PORT_LABEL_FONT_SIZE)
            } else {
                portLabel.text = label
            }
        }
    }

    static def getId(KLabeledGraphElement node) {
        node.eContents?.filter(KIdentifier)?.head?.id
    }

    def setId(KLabeledGraphElement node, String id) {
        node.getData(KIdentifier).id = id
        node
    }

    static def KLabel getLabel(KNode node) {
        node.eContents.filter(KLabel).head
    }

    static def PortSide getPortSide(KPort port) {
        port.getProperty(CoreOptions::PORT_SIDE)
    }

    def findPortById(KNode node, String id) {
        for (p : node.ports) {
            if (p.id == id) {
                return p
            }
        }
        return null
    }

    // returns the number-th input port of a node and creates it if it doesn't exist
    def getInputPortWithNumber(KNode node, int number) {
        var maxIndex = -1
        var KPort maxPort = null
        for (p : node.ports) {
            val id = p.id
            if (id !== null) {
                if (id.startsWith(PORT_IN_PREFIX)) {
                    try {
                        val n = Integer.parseInt(id.substring(2))
                        if(n == number) return p
                        if (n > maxIndex) {
                            maxIndex = n
                            maxPort = p
                        }
                    } catch (NumberFormatException e) {
                    }
                }
            }
        }

        if(maxPort === null) return null

        var KPort result = null
        for (pi : (maxIndex + 1) .. number) {
            result = maxPort.copy
            result.id = (PORT_IN_PREFIX + pi)
            node.ports.add(0, result)
        }
        return result
    }

    def isInput(KNode node) {
        node.getProperty(EquationSynthesis.INPUT_FLAG) as boolean
    }

    def isOutput(KNode node) {
        node.getProperty(EquationSynthesis.OUTPUT_FLAG) as boolean
    }

    def isReference(KNode node) {
        return node.getProperty(EquationSynthesis.REFERENCE_NODE) as boolean
    }

    def isSequential(KNode before, KNode after) {
        if (before.isInput && after.isInput) {
            return sequentials.exists [
                key == before && sequentials.filter[value == after].map[key].toList.contains(value)
            ]
        }
        return sequentials.exists[key == before && value == after]
    }

    def isSequential(KEdge edge) {
        edge.getProperty(EquationSynthesis.SEQUENTIAL_EDGE) as boolean
    }

    def isInstance(KEdge edge) {
        edge.getProperty(EquationSynthesis.INSTANCE_EDGE) as boolean
    }

    def getSourceElement(KGraphElement node) {
        return node.getProperty(KlighdInternalProperties.MODEL_ELEMEMT)
    }

    // given two KGraph elements the return value is true iff the elements are associated with the same source element
    // in case of associations with ValuedObjectReferences only the ValuedObject needs to be equal
    def sourceEquals(KGraphElement a, KGraphElement b) {
        if (a.sourceElement instanceof ValuedObjectReference && b.sourceElement instanceof ValuedObjectReference) {
            return (a.sourceElement as ValuedObjectReference).valuedObject ==
                (b.sourceElement as ValuedObjectReference).valuedObject
        }
        if (a.sourceElement instanceof Value && b.sourceElement instanceof Value &&
            a.sourceElement.serializeHR == b.sourceElement.serializeHR) {
            return true
        }
        if (a.sourceElement instanceof Expression && b.sourceElement instanceof Expression) {
            return (a.sourceElement as Expression).equals2(b.sourceElement as Expression)
        }
        return a.sourceElement == b.sourceElement
    }

    // returns true iff input is a node for the assignment equation of output
    // only usable when the equations are separated
    def isInputForEquation(KNode input, KNode output) {
        val List<KNode> queue = newArrayList
        queue.add(input)
        val List<KNode> visited = newArrayList
        while (queue.size > 0) {
            val current = queue.get(0)
            queue.remove(current)
            visited.add(current)
            if (current == output) {
                return true
            }
            for (e : current.outgoingEdges.filter[!isInstance]) {
                if (!visited.exists[it == e.target] && !queue.exists[it == e.target]) {
                    queue.add(e.target)
                }
            }
        }
        return false
    }
}
