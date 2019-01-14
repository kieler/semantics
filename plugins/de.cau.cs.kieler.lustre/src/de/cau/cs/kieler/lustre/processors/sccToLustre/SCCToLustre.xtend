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
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
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
import de.cau.cs.kieler.lustre.lustre.impl.LustreFactoryImpl
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State

/**
 * @author ssm
 * @kieler.design 2018-05-28 proposed
 * @kieler.rating 2018-05-28 proposed yellow  
 */
class SCCToLustre extends Processor<SCCharts, LustreProgram> {

    static extension LustreFactory lustre = new LustreFactoryImpl

    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KEffectsExtensions

    override getId() {
        "de.cau.cs.kieler.lustre.processors.SCCToLustre"
    }

    override getName() {
        "Lustre"
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
        val cfr = state.regions.filter(ControlflowRegion).head

        val node = createNodeDeclaration => [
//            name = state.name
            input = createParams => []
            output = createParams => []
        ]

        val packageBody = createPackBody => [
            nodes += node
        ]

        for (input : state.variableDeclarations.filter[ input ]) {
            val newVar = createClockedVariableDeclaration => [
                // TODO: extract input set in valuedObject
//                vardecl = createVariableDeclaration => [
//                    type = input.type
//                    valuedObjects = createval
//                ]
                clockExpr = KExpressionsFactory.eINSTANCE.createBoolValue => [
                    value = true
                ]
            ]

            node.input.parameter += newVar
        }

        for (output : state.variableDeclarations.filter[ output ]) {
            val newVar = createClockedVariableDeclaration => [
                vardecl = output
                clockExpr = KExpressionsFactory.eINSTANCE.createBoolValue => [
                    value = true
                ]
            ]

            node.variables += newVar
            node.output.parameter += newVar
        }

        val initial = cfr.states.filter[initial].head

        if (initial.outgoingTransitions.size == 1) {
            initial.processAssignment(node)
        } else if (initial.outgoingTransitions.size == 2) {
            initial.processConditional(node)
        }

        program.packBody = packageBody
    }

    protected def processAssignment(State state, NodeDeclaration node) {
        val t = state.outgoingTransitions.head
        val a = t.effects.head as Assignment

        if (a != null) {
            node.equations += a
        }

    }

    protected def processConditional(State state, NodeDeclaration node) {
        val tThen = state.outgoingTransitions.head
        val tElse = state.outgoingTransitions.get(1)
        val aThen = tThen.effects.head as Assignment
        val aElse = tElse.effects.head as Assignment

        // TODO: check if asgn is the same for both tansitions
        val asgn = aThen.valuedObject

        val conditional = createConditionalExpression => [
            subExpressions += tThen.trigger
            subExpressions += aThen.expression
            subExpressions += aElse.expression
        ]

        node.equations += createAssignment => [
            // TODO: how do I get reference to an valuedObject
//            reference = asgn.reference
            operator = AssignOperator.ASSIGN
            expression = conditional
        ]
    }

}
