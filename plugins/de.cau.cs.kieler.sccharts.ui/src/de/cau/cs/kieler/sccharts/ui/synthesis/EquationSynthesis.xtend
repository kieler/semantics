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
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.IgnoreValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.StaticAccessExpression
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.kext.DeclarationScope
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.ui.synthesis.KGTLoader
import de.cau.cs.kieler.kicool.ui.synthesis.KiCoolSynthesis
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KIdentifier
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KPolygon
import de.cau.cs.kieler.klighd.krendering.KPolyline
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsReferenceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.ui.SCChartsUiModule
import de.cau.cs.kieler.sccharts.ui.synthesis.actions.ReferenceExpandAction
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.EquationStyles
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.TransitionStyles
import java.util.EnumSet
import java.util.HashMap
import java.util.List
import org.eclipse.elk.alg.layered.options.LayerConstraint
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.alg.layered.options.NodePlacementStrategy
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.math.KVector
import org.eclipse.elk.core.options.Alignment
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.EdgeType
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortLabelPlacement
import org.eclipse.elk.core.options.PortSide
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

import static de.cau.cs.kieler.sccharts.ide.synthesis.EquationSynthesisProperties.*

import static extension de.cau.cs.kieler.annotations.ide.klighd.CommonSynthesisUtil.*
import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.sccharts.impl.StateImpl
import de.cau.cs.kieler.klighd.kgraph.impl.KNodeImpl
import de.cau.cs.kieler.klighd.kgraph.impl.KGraphFactoryImpl
import de.cau.cs.kieler.klighd.krendering.impl.KPolylineImpl
import java.util.ArrayList
import de.cau.cs.kieler.annotations.TagAnnotation

/**
 * @author ssm
 * @kieler.design 2017-09-26 proposed
 * @kieler.rating 2017-09-26 proposed yellow
 * 
 */
@ViewSynthesisShared
class EquationSynthesis extends SubSynthesis<Assignment, KNode> {

    public static val SynthesisOption AUTOMATIC_INLINE = SynthesisOption.createCheckOption(
        EquationSynthesis, "Automatic inline", false). setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption SEPARATED_ASSIGNMENTS = SynthesisOption.createCheckOption(
        EquationSynthesis, "Separated Assignments", false).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption ALIGN_INPUTS_OUTPUTS = SynthesisOption.createCheckOption(
        EquationSynthesis, "Inputs/Outputs Alignment", true).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption ALIGN_CONSTANTS = SynthesisOption.createCheckOption(
        EquationSynthesis, "Constant Alignment", false).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption SHOW_WIRE_LABELS = SynthesisOption.createCheckOption(
        EquationSynthesis, "Wire Labels", true).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption SHOW_EXPRESSION_PORT_LABELS = SynthesisOption.createCheckOption(
        EquationSynthesis, "Expression Port Labels", false).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption SHOW_REFERENCED_PORT_LABELS = SynthesisOption.createCheckOption(
        EquationSynthesis, "Referenced Port Labels", true).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption REFERENCED_PORT_LABELS_OUTSIDE = SynthesisOption.createCheckOption(
        EquationSynthesis, "Outside Referenced Port Labels", false).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption ALL_SEQUENTIAL_CONSTRAINTS = SynthesisOption.createCheckOption(
        EquationSynthesis, "All Sequential Constraints", false).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption SEQUENTIAL_CONSTRAINTS = SynthesisOption.createCheckOption(
        EquationSynthesis, "Sequential Constraints", true).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption INSTANCE_CONSTRAINTS = SynthesisOption.createCheckOption(
        EquationSynthesis, "Connect Instances", true).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption SHOW_LOCALS = SynthesisOption.createCheckOption(
        EquationSynthesis, "Local Variables", true).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption PRE_CICLES = SynthesisOption.createCheckOption(EquationSynthesis,
        "Allow Pre Cicles", false).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption COMBINE_ALL_DATA_ACCESS = SynthesisOption.createCheckOption(
        EquationSynthesis, "Combine all Data Access Nodes", false).setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption SHOW_ARROWS = SynthesisOption.createCheckOption(EquationSynthesis,
        "Arrows", false).setCategory(GeneralSynthesisOptions::DATAFLOW)

    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KLabelExtensions
    @Inject extension KPortExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension SCChartsSynthesis
    @Inject extension EquationStyles
    @Inject extension KExtDeclarationExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension KRenderingExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsReferenceExtensions
    @Inject extension EquationSynthesisHelper
    @Inject extension EquationSimplification
    @Inject extension TransitionStyles
    @Inject StateSynthesis stateSynthesis

    val HashMap<State, KNode> referenceNodes = newHashMap
    
    protected static val PORT_ANNOTATION = "toPort"

    /** 
     * Prefix for the resource location when loading KGTs from the bundle 
     */
    static val SKIN_BUNDLE_FOLDER = "resources/skins/"
    static val SKIN_PREFIX_DEFAULT = "default/"
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

    protected val defaultFigures = #{
        OperatorType.NOT.getName ->
            #["OperatorExpressionNOT.kgt", "OperatorExpressionUnary.kgt", "OperatorExpression.kgt"],
        OperatorType.EQ.getName ->
            #["OperatorExpressionEQ.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.LT.getName ->
            #["OperatorExpressionLT.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.LEQ.getName ->
            #["OperatorExpressionLEQ.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.LOGICAL_AND.getName -> #["OperatorExpressionLOGICAL_AND.kgt", "OperatorExpression.kgt"],
        OperatorType.LOGICAL_OR.getName -> #["OperatorExpressionLOGICAL_OR.kgt", "OperatorExpression.kgt"],
        OperatorType.ADD.getName ->
            #["OperatorExpressionADD.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.SUB.getName ->
            #["OperatorExpressionSUB.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.MULT.getName ->
            #["OperatorExpressionMULT.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.DIV.getName ->
            #["OperatorExpressionDIV.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.GEQ.getName ->
            #["OperatorExpressionGEQ.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.PRE.getName ->
            #["OperatorExpressionPRE.kgt", "OperatorExpressionUnary.kgt", "OperatorExpression.kgt"],
        OperatorType.GT.getName ->
            #["OperatorExpressionGT.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.MOD.getName ->
            #["OperatorExpressionMOD.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.NE.getName ->
            #["OperatorExpressionNE.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.VAL.getName ->
            #["OperatorExpressionVAL.kgt", "OperatorExpressionUnary.kgt", "OperatorExpression.kgt"],
        OperatorType.BITWISE_AND.getName ->
            #["OperatorExpressionBITWISE_AND.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.BITWISE_OR.getName ->
            #["OperatorExpressionBITWISE_OR.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.POSTFIX_ADD.getName ->
            #["OperatorExpressionPOSTFIX_ADD.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.POSTFIX_SUB.getName ->
            #["OperatorExpressionPOSTFIX_SUB.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.SHIFT_LEFT.getName ->
            #["OperatorExpressionSHIFT_LEFT.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.SHIFT_RIGHT.getName ->
            #["OperatorExpressionSHIFT_RIGHT.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.SHIFT_RIGHT_UNSIGNED.getName ->
            #["OperatorExpressionSHIFT_RIGHT_UNSIGNED.kgt", "OperatorExpressionArithmetical.kgt",
                "OperatorExpression.kgt"],
        OperatorType.BITWISE_XOR.getName ->
            #["OperatorExpressionBITWISE_XOR.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.BITWISE_NOT.getName ->
            #["OperatorExpressionBITWISE_NOT.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        OperatorType.CONDITIONAL.getName -> #["OperatorExpressionCONDITIONAL.kgt", "OperatorExpression.kgt"],
        OperatorType.FBY.getName -> #["OperatorExpressionFBY.kgt", "OperatorExpression.kgt"],
        OperatorType.CURRENT.getName -> #["OperatorExpressionCURRENT.kgt", "OperatorExpression.kgt"],
        OperatorType.WHEN.getName -> #["OperatorExpressionWHEN.kgt", "OperatorExpression.kgt"],
        OperatorType.INIT.getName -> #["OperatorExpressionINIT.kgt", "OperatorExpression.kgt"],
        OperatorType.ATMOSTONEOF.getName -> #["OperatorExpressionATMOSTONEOF.kgt", "OperatorExpression.kgt"],
        OperatorType.NOR.getName -> #["OperatorExpressionNOR.kgt", "OperatorExpression.kgt"],
        OperatorType.IMPLIES.getName -> #["OperatorExpressionIMPLIES.kgt", "OperatorExpression.kgt"],
        OperatorType.SFBY.getName -> #["OperatorExpressionSFBY.kgt", "OperatorExpression.kgt"],
        OperatorType.LAST.getName -> #["OperatorExpressionLAST.kgt", "OperatorExpression.kgt"],
        "CLASS_INPUT" -> #["InputClass.kgt", "Class.kgt"],
        "CLASS_OUTPUT" -> #["InputClass.kgt", "Class.kgt"],
        "ARRAY_INPUT" -> #["InputArray.kgt", "Array.kgt"],
        "ARRAY_OUTPUT" -> #["InputArray.kgt", "Array.kgt"],
        "OPERATOR" -> #["OperatorExpression.kgt"],
        "FUNCTION" -> #["FunktionExpression.kgt", "OperatorExpression.kgt"],
        "UNARY_SUB" -> #["OperatorExpressionUnarySUB.kgt", "OperatorExpressionUnary.kgt", "OperatorExpression.kgt"],
        "ARITHMETICAL_SUB" ->
            #["OperatorExpressionArithmeticalSUB.kgt", "OperatorExpressionArithmetical.kgt", "OperatorExpression.kgt"],
        "CONDITIONAL_UPDATE" -> #["OperatorExpressionUPDATE.kgt", "OperatorExpression.kgt"],
        "INPUT" -> #["Input.kgt", "OperatorExpression.kgt"],
        "OUTPUT" -> #["Output.kgt", "OperatorExpression.kgt"],
        "INPUT_OUTPUT" -> #["InputOutput.kgt", "OperatorExpression.kgt"],
        "LOCAL" -> #["Local.kgt", "OperatorExpression.kgt"],
        "EXTERNAL_FUNCTION" -> #["OperatorExpressionUnary.kgt", "OperatorExpression.kgt"]
    }

    override getDisplayedSynthesisOptions() {
        val options = newArrayList(
            SEPARATED_ASSIGNMENTS,
            ALL_SEQUENTIAL_CONSTRAINTS,
            SEQUENTIAL_CONSTRAINTS,
            INSTANCE_CONSTRAINTS,
            SHOW_LOCALS,
            PRE_CICLES,
            COMBINE_ALL_DATA_ACCESS,
            AUTOMATIC_INLINE,
            ALIGN_INPUTS_OUTPUTS,
            ALIGN_CONSTANTS,
            SHOW_WIRE_LABELS,
            SHOW_EXPRESSION_PORT_LABELS,
            SHOW_REFERENCED_PORT_LABELS,
            REFERENCED_PORT_LABELS_OUTSIDE,
            SHOW_ARROWS
        )

        return options
    }

    /**
     * creates an equation graph for a list of assignments and returns a list of created nodes
     * @param elements A list of assignments
     * @param rootNode The parent node which should be associated with a dataflow Region
     */
    def List<KNode> performTranformation(List<Assignment> elements, KNode rootNode) {
        sequentials.clear
        alignInputOutputs = ALIGN_INPUTS_OUTPUTS.booleanValue
        showLocals = SHOW_LOCALS.booleanValue
        preCicles = PRE_CICLES.booleanValue
        showWireLabels = SHOW_WIRE_LABELS.booleanValue
        combineAllDataAccessNodes = COMBINE_ALL_DATA_ACCESS.booleanValue
        showArrows = SHOW_ARROWS.booleanValue
        currentRegions.push(rootNode.sourceElement as DataflowRegion)
        var nodes = <KNode>newLinkedList
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
        nodes.addInstanceEdges.addSequentialEdges.simplifyAndCombine(rootNode)
        for (n : nodes) {
            if (n.sourceElement instanceof ValuedObjectReference && (n.sourceElement as ValuedObjectReference).valuedObject.name.equals("multiplexer")) {
                val nrInputPs = (n.ports.size -1) * (2/3.0)
                n.height = (nrInputPs * rootNode.getProperty(LayeredOptions.SPACING_PORT_PORT)) as float
                sortPorts(n)
            }
            n.addLayoutParam(CoreOptions.NODE_SIZE_MINIMUM, new KVector(0, 0))
            n.addLayoutParam(CoreOptions.PADDING, new ElkPadding(0, 0, 0, 0))
        }
        currentRegions.pop
        return nodes.reWireInlining.addMissingReferenceInputs
    }
    
    def sortPorts(KNode node) {
        var grp1 = new ArrayList();
        var grp2 = new ArrayList();
        for (port : node.ports.filter [sourceElement !== null]) {
            val VO = (port.sourceElement as ValuedObjectReference).valuedObject
            if (!VO.annotations.empty) {
                val tag = (VO.annotations.get(0) as TagAnnotation).name
                if (tag.equals("pos")) {
                    grp1.add(port)
                } else if (tag.equals("neg")) {
                    grp2.add(port)
                }
            }
        }
        for (port : grp1) {
            port.ypos = 0
        }
        for (port : grp2) {
            port.ypos = 100
        }
    }

    /**
     * transform assignments like += or *= to = assignments
     */
    def transformToEqual(Assignment element) {
        if (element.operator == AssignOperator.ASSIGN) {
            return element
        }
        val e = element.copy
        e.expression = createOperatorExpression => [
            if (element.operator == AssignOperator.POSTFIXADD) {
                operator = OperatorType.ADD
                subExpressions += createIntValue(1)
            } else if (element.operator == AssignOperator.POSTFIXSUB) {
                operator = OperatorType.SUB
                subExpressions += createIntValue(1)
            } else if (element.operator == AssignOperator.ASSIGNMIN) {
                operator = OperatorType.CONDITIONAL
                subExpressions += createOperatorExpression => [
                    operator = OperatorType.LEQ
                    subExpressions += element.expression.copy
                    subExpressions += element.reference.copy
                ]
                subExpressions += element.expression.copy
            } else if (element.operator == AssignOperator.ASSIGNMAX) {
                operator = OperatorType.CONDITIONAL
                subExpressions += createOperatorExpression => [
                    operator = OperatorType.GEQ
                    subExpressions += element.expression.copy
                    subExpressions += element.reference.copy
                ]
                subExpressions += element.expression.copy
            } else if (element.operator.getName.startsWith("ASSIGN")) {
                var op = OperatorType.getByName(element.operator.getName.substring(6))
                if (op === null) {
                    op = OperatorType.getByName("BITWISE_" + element.operator.getName.substring(6))
                }
                if (op === null) {
                    op = OperatorType.getByName(element.operator.getName.substring(6) + "T")
                }
                if (element.operator == AssignOperator.ASSIGNSHIFTLEFT) {
                    op = OperatorType.SHIFT_LEFT
                }
                if (element.operator == AssignOperator.ASSIGNSHIFTRIGHT) {
                    op = OperatorType.SHIFT_RIGHT
                }
                if (element.operator == AssignOperator.ASSIGNSHIFTRIGHTUNSIGNED) {
                    op = OperatorType.SHIFT_RIGHT_UNSIGNED
                }
                operator = op
                subExpressions += element.expression.copy
            }
            subExpressions += element.reference.copy
        ]
        return e
    }

    /**
     * Creates an equation graph for an assignment and returns the list of created nodes.
     * To create a graph from more then one assignment performTranformation(List<Assignment>, KNode) should be used
     * @param element The assignment
     */
    override performTranformation(Assignment element) {
        var assignment = element.transformToEqual
        if (assignment.reference.isReferenceDeclarationReference && assignment.expression instanceof VectorValue) {
            // special case for vector assignments for referenced valued objects
            val nodes = <KNode>newLinkedList
            val sources = (assignment.expression as VectorValue).values.map[performTransformation(nodes, false)]
            val target = assignment.reference.performTransformation(nodes, true)
            val inputs = (assignment.reference.valuedObject.declaration as ReferenceDeclaration).getInputs.map [
                reference
            ]
            var index = 0
            var portIndex = 0
            // connect the inputs with labeled ports
            for (source : sources) {
                if (source !== null) {
                    val sourcePort = source.findPortById(OUT_PORT)
                    val targetPort = target.getInputPortWithNumber(portIndex++)
                    val ref = if(inputs.size >= index) inputs.get(index) else null
                    if (ref !== null) {
                        targetPort.setLabel(ref.serializeHR.toString, true)
                        targetPort.associateWith(ref)
                    }
                    sourcePort.connectWith(targetPort, assignment.expression.serializeHR.toString)
                }
                index++
            }
            if (portIndex == 0) {
                target.getInputPortWithNumber(0).remove
            }
            return nodes
        }

        val nodes = <KNode>newLinkedList
        val source = assignment.expression.performTransformation(nodes, false)
        if (assignment.expression instanceof VectorValue) {
            source.associateWith(assignment.reference)
            source.setProperty(OUTPUT_FLAG, true)
            source.setProperty(DATA_ACCESS_FLAG, true)
            for (p : source.ports.filter[edges.size > 0]) {
                val ref = assignment.reference.copy
                ref.indices.add(p.sourceElement as IntValue)
                p.associateWith(ref)
            }
        }
        val sourcePort = source.findPortById(OUT_PORT)
        val target = assignment.reference.performTransformation(nodes, true)
        var targetPortID = PORT0_IN_PREFIX
        val anno = assignment.getAnnotation(PORT_ANNOTATION)
        if (anno !== null) {
            targetPortID = anno.asStringAnnotation.values.get(0)
        }
        val targetPort = target.findPortById(targetPortID)
        sourcePort.connectWith(targetPort, assignment.expression.serializeHR.toString)
        return nodes
    }

    /**
     * combines the graphs for the assignments to a simplified connected Graph
     * @param nodes List of nodes of each assignments
     * @param rootNode The root node witch is associated with the dataflow region
     */
    private def List<KNode> simplifyAndCombine(List<KNode> nodes, KNode rootNode) {
        if (SEPARATED_ASSIGNMENTS.booleanValue) {
            return nodes
        }
        return nodes.simplify
    }

    /**
     * creates an equation tree graph from an expression and returns the root node of the tree
     * @param reference The valued object reference to which the tree should be generated
     * @param nodes All created nodes are added to this list
     * @param output Should be true if output nodes should be generated
     */
    private def dispatch KNode performTransformation(ValuedObjectReference reference, List<KNode> nodes,
        boolean output) {
        if (!reference.isModelReference &&
            ((reference.isClassReference && reference.subReference !== null) || reference.isArrayReference)) {
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
                    currentNode.setProperty(DATA_ACCESS_FLAG, true)
                    currentNode.setProperty(output ? OUTPUT_FLAG : INPUT_FLAG, true)
                } else {
                    currentNode = ref.createKGTNode(output ? "CLASS_OUTPUT" : "CLASS_INPUT", "")
                    currentNode.setProperty(DATA_ACCESS_FLAG, true)
                    currentNode.setProperty(output ? OUTPUT_FLAG : INPUT_FLAG, true)
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
                        currentNode.findPortById(PORT0_IN_PREFIX).associateWith(ref)
                    } else {
                        currentNode.findPortById(OUT_PORT).setLabel(ref.lastSubReferenceLabel, false)
                        currentNode.findPortById(OUT_PORT).associateWith(ref)
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
            for (i : reference.indices) {
                text += "[" + i.serializeHR.toString + "]"
            }
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
            var ref = reference.valuedObject.reference
            for (i : reference.indices) {
                ref.indices += i.copy
            }
            node.associateWith(ref)
        } else {
            node.associateWith(reference)
            node.addNodeLabelWithPadding(text, INPUT_OUTPUT_TEXT_SIZE,
                output ? PADDING_OUTPUT_LEFT : PADDING_INPUT_LEFT, output ? PADDING_OUTPUT_RIGHT : PADDING_INPUT_RIGHT)

            if (reference.valuedObject.array) {
                node.setProperty(DATA_ARRAY_FLAG, true)
            }
        }
        node.setProperty(output ? OUTPUT_FLAG : INPUT_FLAG, true)
        if (ALIGN_INPUTS_OUTPUTS.booleanValue) {
            node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT,
                output ? LayerConstraint::LAST : LayerConstraint::FIRST)
            node.addLayoutParam(CoreOptions::ALIGNMENT, output ? Alignment.RIGHT : Alignment.LEFT)
        }
        nodes += node
        return node
    }

    /**
     * creates an equation tree graph from an expression and returns the root node of the tree
     * create one node for each value inside of a Vector Value and connect them to a Vector node
     * @param e The VectorValue to which the tree should be generated
     * @param nodes All created nodes are added to this list
     * @param output Should be true if output nodes should be generated
     */
    private def dispatch KNode performTransformation(VectorValue e, List<KNode> nodes, boolean output) {
        val node = e.createKGTNode(output ? "ARRAY_OUTPUT" : "ARRAY_INPUT", "")
        for (value : e.values) {
            if (!(value instanceof IgnoreValue)) {
                val valueNode = value.performTransformation(nodes, false)
                val sourcePort = valueNode.findPortById(OUT_PORT)
                val targetPort = node.getInputPortWithNumber(e.values.indexOf(value))
                sourcePort.connectWith(targetPort, valueNode.sourceElement?.serializeHR?.toString)
                targetPort.setLabel(e.values.indexOf(value).toString, false)
                targetPort.associateWith(createIntValue(e.values.indexOf(value)))
            }
        }
        node.setProperty(DATA_ARRAY_FLAG, true)
        node.associateWith(e)
        nodes += node
        return node
    }

    private def dispatch KNode performTransformation(IgnoreValue e, List<KNode> nodes, boolean output) {
        return null
    }

    /**
     * creates an equation tree graph from an expression and returns the root node of the tree
     * create an input node for constant values
     * @param e The Value to which the tree should be generated
     * @param nodes All created nodes are added to this list
     * @param output Will be ignored in this case
     */
    private def dispatch KNode performTransformation(Value e, List<KNode> nodes, boolean output) {
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
    
    /**
     * creates an equation tree graph from an expression and returns the root node of the tree
     * create an input node for constant values
     * @param e The StaticAccessExpression to which the tree should be generated
     * @param nodes All created nodes are added to this list
     * @param output Will be ignored in this case
     */
    private def dispatch KNode performTransformation(StaticAccessExpression e, List<KNode> nodes, boolean output) {
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

    /**
     * creates an equation tree graph from an expression and returns the root node of the tree
     * @param operatorExpr The OperatorExpression to which the tree should be generated
     * @param nodes All created nodes are added to this list
     * @param output Should be true if output nodes should be generated
     */
    private def dispatch KNode performTransformation(OperatorExpression operatorExpr, List<KNode> nodes,
        boolean output) {
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

    /**
     * creates an equation tree graph from an expression and returns the root node of the tree
     * @param functionCall The FunctionCall to which the tree should be generated
     * @param nodes All created nodes are added to this list
     * @param output Should be true if output nodes should be generated
     */
    private def dispatch KNode performTransformation(FunctionCall functionCall, List<KNode> nodes, boolean output) {
        var figureId = "FUNCTION"
        var text = functionCall.functionName
        // create kgt node
        val node = functionCall.createKGTNode(figureId, text)
        for (subExpr : functionCall.parameters.map[expression]) {
            val source = subExpr.performTransformation(nodes, false)
            val sourcePort = source.findPortById(OUT_PORT)
            val targetPort = node.getInputPortWithNumber(functionCall.parameters.map[expression].indexOf(subExpr))
            sourcePort.connectWith(targetPort, subExpr.serializeHR.toString)
        }
        // show or hide port labels
        if (SHOW_EXPRESSION_PORT_LABELS.booleanValue) {
            for (p : node.ports) {
                val label = p.labels.head
                if (label !== null) {
                    label.text = functionCall.functionName
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
        node.associateWith(functionCall)
        nodes += node
        return node
    }

    /**
     * add instance edges for reference nodes which are the same instance if INSTANCE_CONSTRAINTS is true
     * @param nodes A list of nodes from the Graph
     */
    private def addInstanceEdges(List<KNode> nodes) {
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
                            KID = INSTANCE_OUT_PORT
                            setProperty(CoreOptions::PORT_SIDE, PortSide.EAST)
                            setPortSize(0, 0)
                        ]
                        source.ports.add(sourcePort)
                    }
                    var targetPort = target.findPortById(INSTANCE_IN_PORT)
                    if (targetPort === null) {
                        targetPort = createPort => [
                            KID = INSTANCE_IN_PORT
                            setProperty(CoreOptions::PORT_SIDE, PortSide.WEST)
                            setPortSize(0, 0)
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

    /**
     * add sequential edges for nodes which should be executed sequential if SEQUENTIAL_CONSTRAINTS is true
     * @param nodes A list of nodes from the Graph
     */
    private def addSequentialEdges(List<KNode> nodes) {
        if (SEQUENTIAL_CONSTRAINTS.booleanValue) {
            if (ALL_SEQUENTIAL_CONSTRAINTS.booleanValue) {
                for (seq : sequentials.reverse.filter [
                    key.isOutput && value.isInput && !key.isDataAccess && !value.isDataAccess
                ]) {
                    if (!seq.key.isInputForEquation(seq.value, false)) {
                        seq.key.connectSequential(seq.value)
                    }
                }
                for (seq : sequentials.reverse.filter [
                    (!key.isOutput || !value.isInput) && !key.isDataAccess && !value.isDataAccess
                ]) {
                    if (!seq.key.isInputForEquation(seq.value, false)) {
                        seq.key.connectSequential(seq.value)
                    }
                }
            } else {
                val outputs = nodes.filter[isOutput && !isDataAccess]
                var sequentialEnd = nodes.size
                for (var i = outputs.size - 1; i >= 0; i--) {
                    val pos = nodes.indexOf(outputs.get(i));
                    var needSequential = false
                    for (var j = 0; j <= pos; j++) {
                        for (var k = pos + 1; k < sequentialEnd; k++) {
                            needSequential = needSequential || nodes.get(j).isSequential(nodes.get(k))
                        }
                    }
                    if (needSequential) {
                        for (var k = pos + 1; k < sequentialEnd; k++) {
                            if (nodes.get(k).isInput && !nodes.get(k).isDataAccess &&
                                nodes.get(k).sourceEquals(nodes.get(pos)) && !nodes.get(k).incomingEdges.exists [
                                    isSequential
                                ]) {
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

    private def connectSequential(KNode before, KNode after) {
        val edge = createEdge
        var sourcePort = before.findPortById(SEQUENTIAL_OUT_PORT)
        if (sourcePort === null) {
            sourcePort = createPort => [
                KID = SEQUENTIAL_OUT_PORT
                setProperty(CoreOptions::PORT_SIDE, PortSide.EAST)
                setPortSize(0, 0)
            ]
            before.ports.add(sourcePort)
        }
        var targetPort = after.findPortById(SEQUENTIAL_IN_PORT)
        if (targetPort === null) {
            targetPort = createPort => [
                KID = SEQUENTIAL_IN_PORT
                setProperty(CoreOptions::PORT_SIDE, PortSide.WEST)
                setPortSize(0, 0)
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
        if (before.isOutput)
            before.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::NONE)
        if (after.isInput)
            after.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::NONE)
        if (showArrows) {
            edge.addDefaultDecorator
        }
    }

    private def KNode createReferenceNode(KNode node, ValuedObjectReference voRef, String label) {

        val list = node.data.filter[it instanceof KRendering].toList
        for (x : list) {
            node.data.remove(x)
        }
        var newNode = node

        node.setLayoutOption(LayeredOptions::NODE_PLACEMENT_STRATEGY, NodePlacementStrategy.SIMPLE)
        node.setLayoutOption(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER)
        node.setLayoutOption(CoreOptions.PORT_LABELS_PLACEMENT, EnumSet.of(PortLabelPlacement.INSIDE))
        node.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 10d); // 10.5 // 8f
        node.setLayoutOption(CoreOptions::PADDING, new ElkPadding(4d));
        node.addLayoutParam(KlighdProperties::EXPAND, false)
        node.addLayoutParam(LayeredOptions::SPACING_PORT_PORT, 20d)

        val referenceDeclaration = voRef.valuedObject.declaration as ReferenceDeclaration
        if (referenceDeclaration.hasAnnotation(ANNOTATION_FIGURE)) {
            newNode = referenceDeclaration.createKGTNode("OPERATOR", label)
            newNode.setProperty(SCChartsSynthesis.SKINPATH, getSkinPath(usedContext))
            newNode.addNodeLabelWithPadding(label, INPUT_OUTPUT_TEXT_SIZE, PADDING_INPUT_LEFT, PADDING_INPUT_RIGHT)
            newNode.setProperty(REFERENCE_NODE, true)
            val rendering = newNode.data.filter(KContainerRendering).head
            rendering.setProperty(EquationStyles.IS_CONTENT_CONTAINER, true);
            val expanded = rendering.copy
            rendering.setAsCollapsedView
            rendering.addDoubleClickAction(ReferenceExpandAction::ID)
            newNode.data.add(expanded)
            expanded.setAsExpandedView;
            expanded.addDoubleClickAction(ReferenceExpandAction::ID);
            newNode.setProperty(REFERENCE_NODE, true)
            if(newNode !== null) return newNode
        }
        if (referenceDeclaration.reference !== null &&
            referenceDeclaration.reference.asAnnotatable.hasAnnotation(ANNOTATION_FIGURE)) {
            newNode = referenceDeclaration.reference.createKGTNode("OPERATOR", label)
            newNode.setProperty(SCChartsSynthesis.SKINPATH, getSkinPath(usedContext))
            newNode.addNodeLabelWithPadding(label, INPUT_OUTPUT_TEXT_SIZE, PADDING_INPUT_LEFT, PADDING_INPUT_RIGHT)
            newNode.setProperty(REFERENCE_NODE, true)
            val rendering = newNode.data.filter(KContainerRendering).head
            rendering.setProperty(EquationStyles.IS_CONTENT_CONTAINER, true);
            val expanded = rendering.copy
            rendering.setAsCollapsedView
            rendering.addDoubleClickAction(ReferenceExpandAction::ID)
            newNode.data.add(expanded)
            expanded.setAsExpandedView;
            expanded.addDoubleClickAction(ReferenceExpandAction::ID);
            newNode.setProperty(REFERENCE_NODE, true)
            if(newNode !== null) return newNode
        }

        val declaration = voRef.valuedObject.referenceDeclaration
        if (AUTOMATIC_INLINE.booleanValue && declaration.reference !== null) {
            val state = declaration.reference as State
            if (referenceNodes.containsKey(state)) {
                newNode = referenceNodes.get(state).copy
            } else {
                val referenceNodeSchema = stateSynthesis.transform(state).head
                referenceNodes.put(state, referenceNodeSchema)
                newNode = referenceNodeSchema.copy
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
            newNode.addNodeLabel(label)
        }

        newNode.setLayoutOption(LayeredOptions::NODE_SIZE_CONSTRAINTS,
            EnumSet.of(SizeConstraint.PORTS, SizeConstraint.PORT_LABELS, SizeConstraint.MINIMUM_SIZE, 
                SizeConstraint.NODE_LABELS
            ))
        newNode.setProperty(SCChartsSynthesis.SKINPATH, getSkinPath(usedContext))
        newNode.setProperty(REFERENCE_NODE, true)
        return newNode
    }

    private def reWireInlining(List<KNode> nodes) {
        val inlinedNodes = nodes.filter[it.getProperty(INLINED_REFERENCE)].toList
        for (node : inlinedNodes) {

            for (child : node.eContents.filter(KNode).toList) {
                nodes += child
                child.setLayoutOption(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER)
                child.setLayoutOption(CoreOptions::PADDING, new ElkPadding(10))
                child.data.filter(KRendering).forEach [
                    placementData = null
                ]

                val inputNames = <String, KNode>newHashMap
                for (inputNode : child.children.filter(KNode).filter[getProperty(INPUT_FLAG)]) {
                    val inputFlag = inputNode.data.filter(KPolygon).head
                    // Some other elements other than the input flag KPolygon itself may have the INPUT_FLAG set,
                    // check for that here.
                    if (inputFlag !== null) {
                        val name = inputFlag.children.filter(KText).head.text
                        inputNames.put(name, inputNode)
                    }
                }
                val outputNames = <String, KNode>newHashMap
                for (outputNode : child.children.filter(KNode).filter[getProperty(OUTPUT_FLAG)]) {
                    val outputFlag = outputNode.data.filter(KPolygon).head
                    if (outputFlag !== null) {
                        val name = outputFlag.children.filter(KText).head.text
                        outputNames.put(name, outputNode)
                    }
                }

                for (port : node.ports.immutableCopy.reverseView) {
                    val portName = port.labels.head?.text
                    val portSide = port.portSide
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
        for (node : inlinedNodes) {
            nodes.betterRemove(node, null)
        }
        return nodes
    }
    
    private def addMissingReferenceInputs(List<KNode> nodes) {
        nodes.filter[isReference].forEach [ node |
            val refDec = (node.sourceElement as ValuedObjectReference).valuedObject.declaration as ReferenceDeclaration
            refDec.getInputs.forEach [ input |
                if (!node.ports.exists [
                    sourceElement !== null && (sourceElement as ValuedObjectReference).valuedObject == input
                ]) {
                    node.getInputPortWithNumber(node.incomingEdges.filter[!isInstance && !isSequential].size +
                        node.ports.filter[it.edges.empty].size, true).setLabel(input.serializeHR.toString, true).
                        associateWith(input)
                }
            ]
        ]
        return nodes
    }

    /**
     * create a single node from a kgt file
     */
    private def KNode createKGTNode(EObject obj, String figureId, String label) {
        if (obj instanceof Annotatable) {
            if (obj.hasAnnotation(ANNOTATION_FIGURE)) {
                val path = getSkinPath(usedContext)
                val kgt = path + if(!path.empty && !path.endsWith("/")) "/" + obj.getStringAnnotationValue(ANNOTATION_FIGURE)
                val uri = KGTLoader.createModelRelativeURI(obj, kgt)
                if (uri !== null) {
                    val node = KGTLoader.loadKGT(uri)
                    if (node !== null) {
                        var List<ValuedObject> valuedObjects = null
                        if (obj instanceof DeclarationScope) {
                            valuedObjects = obj.asDeclarationScope.valuedObjects.filter [
                                input || output
                            ].toList
                        } else if (obj instanceof ReferenceDeclaration) {
                            valuedObjects = (obj as ReferenceDeclaration).reference.
                                asDeclarationScope.valuedObjects.filter [
                                    input || output
                                ].toList
                        }
                        if (valuedObjects !== null) {
                            for (p : node.eAllContents.filter(KPort).toList) {
                                val id = p.data.filter(KIdentifier).head
                                val v = valuedObjects.filter[it.name.equals(id.id)].head
    
                                p.associateWith(v)
                                p.registerExistingPort(node, v)
                            }
                        }
                        return node
                    }
                } else {
                    // If there is a figure annotation but no model-relavite path can be found, try with a path relative
                    // to this bundle.
                    val node = KGTLoader.loadFromBundle(this, SCChartsUiModule.PLUGIN_ID, SKIN_BUNDLE_FOLDER + kgt)
                    if (node !== null) {
                        return node
                    }
                }
            }
        }
        var showLabel = false
        // check if a figure file in the skin folder exists
        if (obj.eResource !== null && obj.eResource.URI !== null) {
            var path = getSkinPath(usedContext)
            if (!path.nullOrEmpty) {
                path += if(!path.empty && !path.endsWith("/")) "/"
                for (figure : defaultFigures.get(figureId) ?: #[]) {
                    val uri = KGTLoader.createModelRelativeURI(obj, path + figure)
                    if (uri !== null) {
                        val node = KGTLoader.loadKGT(uri)
                        if (node !== null) {
                            if (!label.nullOrEmpty && showLabel) {
                                node.addNodeLabel(label, INPUT_OUTPUT_TEXT_SIZE)
                            }
                            return node
                        }
                    }
                }
            }
            showLabel = true
        }
        // check if the skin folder in inside of the plugin
        var skinPrefix = getSkinPath(usedContext)
        skinPrefix += if(!skinPrefix.empty && !skinPrefix.endsWith("/")) "/"
        showLabel = false
        for (figure : defaultFigures.get(figureId) ?: #[]) {
            val node = KGTLoader.loadFromBundle(this, SCChartsUiModule.PLUGIN_ID, SKIN_BUNDLE_FOLDER + skinPrefix + figure)
            if (node !== null) {
                if (!label.nullOrEmpty && showLabel) {
                    node.addNodeLabel(label, INPUT_OUTPUT_TEXT_SIZE)
                }
                return node
            } else {
                showLabel = true
            }
        }
        showLabel = false
        // fall back to default figures
        for (figure : defaultFigures.get(figureId) ?: #[]) {
            val node = KGTLoader.loadFromBundle(this, SCChartsUiModule.PLUGIN_ID, SKIN_BUNDLE_FOLDER + SKIN_PREFIX_DEFAULT + figure)
            if (node !== null) {
                if (!label.nullOrEmpty && showLabel) {
                    node.addNodeLabel(label, INPUT_OUTPUT_TEXT_SIZE)
                }
                return node
            } else {
                showLabel = true
            }
        }
        throw new IllegalArgumentException("Resource not found")
    }

    /**
     * set the label of a port
     */
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
}
