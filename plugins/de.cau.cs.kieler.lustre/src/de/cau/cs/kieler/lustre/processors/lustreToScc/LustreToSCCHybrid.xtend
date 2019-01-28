/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
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
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State

/**
 * @author lgr
 *
 */
class LustreToSCCHybrid extends LustreToSCCDataFlow {

    extension SCChartsFactory = SCChartsFactory.eINSTANCE
    
    override getId() {
        return "de.cau.cs.kieler.lustre.processors.lustreToSCC.hybrid"
    }

    override getName() {
        return "Lustre to SCCharts"
    }

    override ProcessorType getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }

    override processAutomaton(Automaton automaton, State state) {
        var controlflowRegion = createControlflowRegion => [
        ]
        state.regions += controlflowRegion
        var initialState = true;
        for (AState lusState : automaton.states) {
            var newState = createState => [
                name = lusState.name
            ]
            if (initialState) {
                newState.initial = true
                initialState = false
            }
            controlflowRegion.states += newState
            lustreStateToScchartsStateMap.put(lusState, newState)
        }
        
        for (AState lusState : automaton.states) {
            processState(lusState, lustreStateToScchartsStateMap.get(lusState))
        }
    }
    
    protected def processState(AState lusState, State state) {
        
        for (Assignment equation : lusState.equations) {
            processEquation(equation, state)
        }
        
        for (Expression assertion : lusState.assertions) {
            processAssertion(assertion, state)
        }
        
        for (Automaton automaton : lusState.automatons) {
            processAutomaton(automaton, state)
        }
        
        for (ATransition transition : lusState.transitions) {
            processTransition(transition, state)
        }
    }    
    
    protected def processTransition(ATransition transition, State source) {
        var newTransition = createTransition => [
            sourceState = source
            targetState = lustreStateToScchartsStateMap.get(transition.nextState)
        ]
        
        var trigger = transformExpression(transition.condition, source)
        if (trigger !== null) {
            newTransition.trigger = trigger
        }
        if (transition.strong) {
            newTransition.preemption = PreemptionType.STRONGABORT
        }
        if (transition.history) {
            newTransition.history = HistoryType.DEEP
        }
        
    }
    
}