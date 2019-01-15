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
package de.cau.cs.kieler.lustre.processors.lustreToScc

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.lustre.extensions.LustreCreateExtension
import de.cau.cs.kieler.lustre.lustre.AState
import de.cau.cs.kieler.lustre.lustre.ATransition
import de.cau.cs.kieler.lustre.lustre.Automaton
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.lustre.lustre.NodeDeclaration
import de.cau.cs.kieler.lustre.lustre.PackBody
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import java.util.ArrayList
import java.util.Hashtable

/**
 * @author cpa
 */
class LustreToSCCControlFlow extends Processor<LustreProgram, SCCharts> {

    extension SCChartsFactory = SCChartsFactory.eINSTANCE
    @Inject extension LustreCreateExtension
    @Inject extension KExpressionsDeclarationExtensions

    var regionNameIdx = 0;
    var stateNameIdx = 0;

    override getId() {
        return "de.cau.cs.kieler.lustre.processors.lustreToSCC.controlFlow"
    }

    override getName() {
        return "Lustre to SCCharts Control-flow"
    }

    override ProcessorType getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }

    override process() {
        model = model.transform
    }

    def SCCharts transform(LustreProgram p) {
        regionNameIdx = 0
        stateNameIdx = 0

        // TODO: transform Includes and PackList
        createSCCharts => [
            rootStates += transformPackBody(p.packBody)
        ]
    }

    private def transformPackBody(PackBody packBody) {
        // TODO: transform TypeDeclaration and ExternalNodeDeclaration
        var state = createState

        for (constantDecl : packBody.constants) {
            state.variableDeclarations += createConstantDeclaration(constantDecl)
        }

        for (node : packBody.nodes) {
            if (node instanceof NodeDeclaration) {
                state.regions += transformNodeDeclaration(node)
            }
        }

        return state

    }

    private def transformNodeDeclaration(NodeDeclaration node) {

        val state = createState => [ root |
            root.label = node.valuedObjects.head.name
            root.name = root.label
        ]

        for (inputDecl : node.input.parameter) {
            state.declarations += createInputDeclaration(inputDecl)
        }

        for (outputDecl : node.output.parameter) {
            state.declarations += createOutputDeclaration(outputDecl)
        }

        for (constVariable : node.constants) {
            state.declarations += createConstantDeclaration(constVariable)
        }

        for (variable : node.variables) {
            state.declarations += createVariableDeclarationFromClockedVariableDeclaration(variable)
        }

        // Transform equations
        for (equation : node.equations) {
            // TODO: For simple equations, add an immediateDuringAction?
            state.regions += transformEquation(equation)
        }

        // Transform automatons
        for (automaton : node.automatons) {
            transformAutomaton(automaton, state)
        }

        // TODO: Transform assertions
        createControlflowRegion => [
            states += state
        ]
    }

    private def transformEquation(Assignment equation) {
        val region = createControlflowRegion => [
            name = "_r" + regionNameIdx++
            label = ""
        ]

        val initialState = createState => [
            name = "_s" + stateNameIdx++
            label = ""
            initial = true
        ]

        region.states += initialState
        val stateList = transformExpression(equation.expression)
        for (State s : stateList) {
            createTransition => [
                targetState = initialState
                s.outgoingTransitions += it
            ]
        }

        return region
    }

    private def transformExpression(Expression expression) {
        // TODO: Implement
        var arrayList = new ArrayList<State>
        arrayList += createState => [
            name = "test1"
        ]
        arrayList += createState => [
            name = "test2"
        ]

        return arrayList
    }

    def private void transformAutomaton(Automaton automaton, State superState) {
        val region = createControlflowRegion => [
            name = "_r" + regionNameIdx++
            label = ""
            superState.regions += it
        ]

        val stateList = new Hashtable<AState, State>
        for (AState astate : automaton.states) {
            val state = createState => [
                label = astate.name
                name = "_s" + stateNameIdx++
                initial = astate == automaton.states.head
                stateList.put(astate, it)
                region.states += it
            ]

            for (Assignment eq : astate.equations) {
                // TODO: If simple expression, use immediateDuringAction
//                if (eq.expression.isPureExpression)
//                    state.createImmediateDuringAction() => [
//                        effects += createAssignment(VO.get(eq.left.name), eq.right.toKexpression)
//                    ]
//                else {
                val r = createControlflowRegion => [
                    name = "_r" + regionNameIdx++
                    label = ""

                    state.regions += it
                ]

                val initialState = createState => [
                    name = "_s" + stateNameIdx++
                    label = ""
                    initial = true
                ]

                r.states += initialState

                val sList = transformExpression(eq.expression)
                for (State s : sList) {
                    createTransition => [
                        targetState = initialState
                        s.outgoingTransitions += it
                    ]
//                    }
                }
            }

            for (Automaton a : astate.automatons) {
                a.transformAutomaton(state)
            }
        }

        for (AState astate : automaton.states) {
            for (ATransition trans : astate.transitions) {
                createTransition => [
                    targetState = stateList.get(trans.nextState)
                    stateList.get(astate).outgoingTransitions += it
                    trigger = trans.condition
                    preemption = if(trans.strong) PreemptionType::STRONGABORT else PreemptionType::WEAKABORT
                    history = if(trans.history) HistoryType::DEEP else HistoryType::RESET
                ]
            }
        }
    }
}
