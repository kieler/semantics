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
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.ui.synthesis.KiCoolSynthesis
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import de.cau.cs.kieler.klighd.kgraph.KIdentifier
import de.cau.cs.kieler.klighd.kgraph.KLabel
import de.cau.cs.kieler.klighd.kgraph.KLabeledGraphElement
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.actions.ReferenceExpandAction
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.EquationStyles
import java.util.EnumSet
import java.util.List
import org.eclipse.elk.alg.layered.options.LayerConstraint
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.alg.layered.options.NodePlacementStrategy
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.Alignment
import org.eclipse.elk.core.options.CoreOptions
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
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.DataflowRegion
import com.google.inject.Injector
import java.util.HashMap

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
    protected static val OUT_PORT = "out"
    protected static val INOUT_PORT = "inout"

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
            AUTOMATIC_INLINE,
            ALIGN_INPUTS_OUTPUTS,
            ALIGN_CONSTANTS,
            SEPARATED_ASSIGNMENTS,
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
        return new EquationSimplification(rootNode, this, injector).simplify(nodes)
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

    //returns true iff the last sub reference has indices
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
        node.setProperty(output ? OUTPUT_FLAG : INPUT_FLAG, true)
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

    def dispatch KNode performTransformation(Expression e, List<KNode> nodes, boolean output) {
        println("what should i do with: " + e + "?")
        return null
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
        val nodes = <KNode>newLinkedList
        elements.forEach[it.performTranformation.forEach[nodes += it]]
        return nodes.simplifyAndCombine(rootNode)
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
                newNode.ports.clear
            } else {
                val state = declaration.reference as State
                newNode = stateSynthesis.transform(state).head.trimReferenceNode
                referenceNodes.put(declaration, newNode)
            }
            if (node.getInputPortWithNumber(0) !== null) {
                newNode.ports.add(node.getInputPortWithNumber(0).copy)
            }
            if (node.findPortById(OUT_PORT) !== null) {
                newNode.ports.add(node.findPortById(OUT_PORT).copy)
            }
            newNode.setProperty(REFERENCE_NODE, true)
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
        // TODO: remove unneeded stuff like declarations
        return node
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
        if (SHOW_WIRE_LABELS.booleanValue && !source.hasProperty(INPUT_FLAG) && label !== null) {
            edge.createLabel.configureTailEdgeLabel(label, 5, KlighdConstants::DEFAULT_FONT_NAME)
        }
    }

    // set the label of a port
    private def setLabel(KPort port, String label, boolean reference) {
        var portLabel = port.labels.head
        if (reference) {
            if (SHOW_REFERENCED_PORT_LABELS.booleanValue) {
                if (REFERENCED_PORT_LABELS_OUTSIDE.booleanValue) {
                    port.createLabel().configureOutsidePortLabel(label, PORT_LABEL_FONT_SIZE)
                } else {
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

    static def findPortById(KNode node, String id) {
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
}
