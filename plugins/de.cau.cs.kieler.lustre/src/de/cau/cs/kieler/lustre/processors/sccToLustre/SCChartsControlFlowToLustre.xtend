/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.lustre.processors.sccToLustre

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.lustre.lustre.LustreFactory
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.lustre.lustre.NodeDeclaration
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State

/**
 * @author ssm
 * @kieler.design 2018-05-28 proposed
 * @kieler.rating 2018-05-28 proposed yellow  
 */
class SCChartsControlFlowToLustre extends Processor<SCCharts, LustreProgram> {

    static extension LustreFactory lustre = LustreFactory.eINSTANCE

    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KEffectsExtensions

    override getId() {
        "de.cau.cs.kieler.lustre.processors.SCCToLustre.controlFlow"
    }

    override getName() {
        "SCCharts Control-flow to Lustre"
    }

    override getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }

    override process() {
        val model = getModel

        val program = createLustreProgram

        for (subModel : model.rootStates.filter[regions.head instanceof ControlflowRegion].toList) {
            subModel.processSuperState(model, program)
        }

        setModel(program)
    }

    def processSuperState(State state, SCCharts scc, LustreProgram program) {
        val controlFlowRegion = state.regions.filter(ControlflowRegion).head

        val node = createNodeDeclaration => [
            valuedObjects += createNodeValuedObject => [
                name = state.name
            ]
        ]

        for (inputVarDecl : state.variableDeclarations.filter[input]) {
            node.inputs += createVariableDeclaration(inputVarDecl)
        }

        for (outputVarDecl : state.variableDeclarations.filter[output]) {
            node.outputs += createVariableDeclaration(outputVarDecl)
        }

        val initial = controlFlowRegion.states.filter[initial].head

        if (initial.outgoingTransitions.size == 1) {
            initial.processAssignment(node)
        } else if (initial.outgoingTransitions.size == 2) {
            initial.processConditional(node)
        }

        program.nodes += node
    }

    protected def processAssignment(State state, NodeDeclaration node) {
        val t = state.outgoingTransitions.head
        val a = t.effects.head as Assignment

        if (a !== null) {
            node.equations += a
        }
    }

    protected def processConditional(State state, NodeDeclaration node) {
        val transitionThenCase = state.outgoingTransitions.head
        val transitionElseCase = state.outgoingTransitions.get(1)

        val assignemtThenCase = transitionThenCase.effects.head as Assignment
        val assignmentElseCase = transitionElseCase.effects.head as Assignment

        // TODO: check if asgn is the same for both tansitions
//        val asgn = assignemtThenCase.valuedObject
        val conditional = createConditionalExpression => [
            subExpressions += transitionThenCase.trigger
            subExpressions += assignemtThenCase.expression
            subExpressions += assignmentElseCase.expression
        ]

        node.equations += createAssignment => [
            reference = assignemtThenCase.reference
            operator = AssignOperator.ASSIGN
            expression = conditional
        ]
    }

}
