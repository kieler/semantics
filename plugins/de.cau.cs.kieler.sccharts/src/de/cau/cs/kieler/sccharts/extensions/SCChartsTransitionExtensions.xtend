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
package de.cau.cs.kieler.sccharts.extensions

import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.SCChartsFactory
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.keffects.Effect
import de.cau.cs.kieler.sccharts.DelayType

/**
 * @author ssm
 * @kieler.design 2017-06-28 proposed 
 * @kieler.rating 2017-06-28 proposed yellow 
 *
 */
class SCChartsTransitionExtensions {
    
    @Inject extension SCChartsActionExtensions
    
    // Previously only returned the first one
    def getTerminationTransitions(State state) { 
        state.outgoingTransitions.filter[ preemption == PreemptionType::TERMINATION ]
    }
    
    def setTypeTermination(Transition transition) {
        transition => [ preemption = PreemptionType::TERMINATION ]
    }

    def setTypeStrongAbort(Transition transition) {
        transition => [ preemption =  PreemptionType::STRONGABORT ]
    }

    def setTypeWeakAbort(Transition transition) {
        transition => [ preemption =  PreemptionType::WEAKABORT ]
    }

    // previously isTypeTermination
    def isTermination(Transition transition) {
        transition.preemption == PreemptionType::TERMINATION
    }
    
    // previously isTypeStrongAbort
    def isStrongAbort(Transition transition) {
        transition.preemption == PreemptionType::STRONGABORT
    }

    // previously isTypeWeakAbort
    def isWeakAbort(Transition transition) {
        transition.preemption == PreemptionType::WEAKABORT
    }    
    
    def isHistory(Transition transition) {
        transition.history != HistoryType::RESET
    }

    def isDeepHistory(Transition transition) {
        transition.history == HistoryType::DEEP
    }

    def createTransition() {
        SCChartsFactory::eINSTANCE.createTransition()
    }

    def createImmediateTransition() {
        createTransition.setImmediate as Transition
    }

    def createTransitionTo(State sourceState, State targetState) {
        createTransition => [
            setTargetState(targetState)
            sourceState.outgoingTransitions += it
        ]
    }

    def createTransitionTo(State sourceState, State targetState, int index) {
        createTransition => [
            setTargetState(targetState)
            sourceState.outgoingTransitions.add(index, it)
        ]
    }

    def setSourceState(Transition transition, State sourceState) {
        transition => [ sourceState.outgoingTransitions += it ]
    }

    def createImmediateTransitionTo(State sourceState, State targetState) {
        sourceState.createTransitionTo(targetState).setImmediate as Transition
    }

    def addEffect(Transition transition, Effect effect) {
        transition => [ effects += effect ]
    }

    def addEffectBefore(Transition transition, Effect effect) {
        transition => [ effects.add(0, effect) ]
    }
    
    def clearEffects(Transition transition) {
        transition => [ effects.clear ]
    }

    def Transition setLowestPriority(Transition transition) {
        val state = transition.sourceState
        state.outgoingTransitions.remove(transition)
        state.outgoingTransitions.add(transition)
        transition
    }

    def Transition setHighestPriority(Transition transition) {
        val state = transition.sourceState
        state.outgoingTransitions.remove(transition)
        state.outgoingTransitions.add(0, transition)
        transition
    }
    
    def isImplicitlyImmediate(Transition transition) {
        (transition.delay == DelayType.IMMEDIATE) || (transition.sourceState.isConnector) || 
        (transition.preemption == PreemptionType::TERMINATION && transition.trigger == null)
    }    
    
}