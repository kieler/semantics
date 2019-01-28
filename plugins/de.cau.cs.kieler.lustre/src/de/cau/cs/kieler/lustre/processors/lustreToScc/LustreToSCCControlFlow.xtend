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

import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.lustre.lustre.AState
import de.cau.cs.kieler.lustre.lustre.ATransition
import de.cau.cs.kieler.lustre.lustre.Automaton
import de.cau.cs.kieler.lustre.lustre.LustreProgram
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
class LustreToSCCControlFlow extends AbstractLustreToSCC {

    extension SCChartsFactory = SCChartsFactory.eINSTANCE

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
    
    override SCCharts transform(LustreProgram p) {
        regionNameIdx = 0
        stateNameIdx = 0
        
        super.transform(p)        
    }
    
    override processEquation(Assignment equation, State state) {
        // Each equation is own concurrent region
         //TODO: For simple equations, add an immediateDuringAction?
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
        val stateList = createExpressionStates(equation.expression)
        for (State s : stateList) {
            createTransition => [
                targetState = initialState
                s.outgoingTransitions += it
            ]
        }
        
        state.regions += region
    }
    
    override processAutomaton(Automaton automaton, State superState) {
        val region = createControlflowRegion => [
            name = "_r"+regionNameIdx++
            label = ""
            superState.regions += it
        ]
        
        val stateList = new Hashtable<AState, State>
        
        for (AState astate : automaton.states) {
            val state = createState => [
                label = astate.name
                name = "_s"+stateNameIdx++
                initial = astate == automaton.states.head
                stateList.put(astate, it)
                region.states += it
            ]
            
            for (Assignment eq : astate.equations) {
                
//                TODO: for simple assignments an immediate during action is sufficient
//                if (eq.right.isPureExpression)
//                    state.createImmediateDuringAction() => [
//                        effects += createAssignment(VO.get(eq.left.name), eq.right.toKexpression)
//                    ]
//                else {

                val r = createControlflowRegion => [
                    name = "_r"+regionNameIdx++
                    label = ""
                    state.regions += it
                ]
                
                val initialState = createState => [
                    name = "_s"+stateNameIdx++
                    label = ""
                    initial = true
                ]

                r.states += initialState
                
                val sList = createExpressionStates(eq.expression)
                for (State s : sList) {
                    createTransition => [
                        targetState = initialState
                        s.outgoingTransitions += it
                    ]
                }
//                }
            }
            
            for (Automaton a : astate.automatons) {                    
                    a.processAutomaton(state)
            }
        }
        
        for (AState astate : automaton.states) {
            for (ATransition trans : astate.transitions) {
                createTransition => [
                    targetState = stateList.get(trans.nextState)
                    stateList.get(astate).outgoingTransitions+=it
                    trigger = trans.condition
                    preemption = if (trans.strong) PreemptionType::STRONGABORT else PreemptionType::WEAKABORT
                    history = if (trans.history) HistoryType::DEEP else HistoryType::RESET
                ]
            }
        }
    }
    
    override processAssertion(Expression assertion, State state) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }


    def createExpressionStates(Expression expression) {
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
}
