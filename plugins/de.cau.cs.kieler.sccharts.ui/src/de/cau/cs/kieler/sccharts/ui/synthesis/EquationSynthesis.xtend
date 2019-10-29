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
import java.io.File
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties

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

    @Inject extension KRenderingExtensions
    @Inject extension KNodeExtensionsReplacement
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions
    @Inject extension KLabelExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension SCChartsSynthesis
    @Inject extension EquationStyles
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
    protected static val IN_PORT = "in"
    protected static val OUT_PORT = "out"
    protected static val INOUT_PORT = "inout"

    protected val defaultFigures = #{
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

    protected val referenceNodes = <KNode>newHashSet

    override getDisplayedSynthesisOptions() {
        val options = newArrayList(
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

    def KNode performTransformation(Expression e, List<KNode> nodes, boolean output) {
        if (e instanceof ValuedObjectReference) {
            val reference = (e as ValuedObjectReference)
            val node = reference.valuedObject.createKGTNode(output ? "OUTPUT" : "INPUT", "")
            val text = reference.serializeHR.toString
            node.addNodeLabelWithPadding(text, INPUT_OUTPUT_TEXT_SIZE,
                output ? PADDING_OUTPUT_LEFT : PADDING_INPUT_LEFT, output ? PADDING_OUTPUT_RIGHT : PADDING_INPUT_RIGHT)
            node.setProperty(output ? OUTPUT_FLAG : INPUT_FLAG, true)

            if (ALIGN_INPUTS_OUTPUTS.booleanValue) {
                node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT,
                    output ? LayerConstraint::LAST : LayerConstraint::FIRST)
                node.addLayoutParam(CoreOptions::ALIGNMENT, output ? Alignment.RIGHT : Alignment.LEFT)
            }
            node.associateWith(e)
            nodes += node
            return node
        }
        if (e instanceof Value) {
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
        if (e instanceof OperatorExpression) {
            val operatorExpr = e as OperatorExpression
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
            val node = e.createKGTNode(figureId, text)
            for (subExpr : operatorExpr.subExpressions) {
                val source = subExpr.performTransformation(nodes, false)
                val sourcePort = source.findPortById(OUT_PORT)
                val targetPort = node.getInputPortWithNumber(operatorExpr.subExpressions.indexOf(subExpr))
                val edge = createEdge
                edge.setLayoutOption(LayeredOptions.INSIDE_SELF_LOOPS_YO, true)
                edge.source = source
                edge.sourcePort = sourcePort
                edge.target = node
                edge.targetPort = targetPort
                edge.addWireFigure
                if (SHOW_WIRE_LABELS.booleanValue && !source.hasProperty(INPUT_FLAG)) {
                    edge.createLabel.configureTailEdgeLabel(
                        source.getProperty(KlighdInternalProperties.MODEL_ELEMEMT)?.serializeHR?.toString, 5,
                        KlighdConstants::DEFAULT_FONT_NAME)
                }
            }
            if (SHOW_EXPRESSION_PORT_LABELS.booleanValue) {
                for (p : node.ports) {
                    val label = p.labels.head
                    if (label !== null) {
                        if (operatorExpr.operator != OperatorType::CONDITIONAL)
                            label.text = operatorExpr.operator.serializeHR.toString
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
            node.associateWith(e)
            nodes += node
            return node
        }
        println("what should i do with: " + e + "?")
        return null
    }

    override performTranformation(Assignment element) {
        val nodes = <KNode>newLinkedList
        val target = element.reference.performTransformation(nodes, true)
        val targetPort = target.findPortById(PORT0_IN_PREFIX)
        nodes += target
        val source = element.expression.performTransformation(nodes, false)
        val sourcePort = source.findPortById(OUT_PORT)
        val edge = createEdge
        edge.setLayoutOption(LayeredOptions.INSIDE_SELF_LOOPS_YO, true)
        edge.source = source
        edge.sourcePort = sourcePort
        edge.target = target
        edge.targetPort = targetPort
        edge.addWireFigure
        if (SHOW_WIRE_LABELS.booleanValue && !source.hasProperty(INPUT_FLAG)) {
            edge.createLabel.configureTailEdgeLabel(
                source.getProperty(KlighdInternalProperties.MODEL_ELEMEMT)?.serializeHR?.toString, 5,
                KlighdConstants::DEFAULT_FONT_NAME)
        }
        nodes += source
        return nodes
    }

    def performTranformation(List<Assignment> elements, KNode rootNode) {
        val nodes = <KNode>newLinkedList
        elements.forEach[it.performTranformation.forEach[nodes += it]]
        return nodes
    }

    protected def KNode createKGTNode(
        EObject createExtensionObject,
        String figureId,
        String label
    ) {
        var showLabel = false
        // check if a figure file in the skin folder exists
        if (createExtensionObject.eResource !== null && createExtensionObject.eResource.URI !== null) {
            val sl = createExtensionObject.eResource.URI.segmentsList
            val nsl = sl.take(sl.length - 1).drop(1)
            val path = nsl.join("/") + "/" + getSkinPath(usedContext)
            for (figure : defaultFigures.get(figureId)) {
                val kgt = path + if(!path.endsWith("/")) "/" + figure
                val newURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(kgt, false)
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

    static def findPortById(KNode node, String id) {
        for (p : node.ports) {
            if (p.id == id)
                return p
        }
        return null
    }

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
