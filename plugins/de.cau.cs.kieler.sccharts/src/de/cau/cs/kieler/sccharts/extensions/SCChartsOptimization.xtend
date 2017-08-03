/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.State
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*

/**
 * SCCharts Optimization Extensions.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class SCChartsOptimization {

    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsTransitionExtensions

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //-------------------------------------------------------------------------
    //--     O P T I M I Z E : Immediate Transitions with no Trigger/Effect  --
    //-------------------------------------------------------------------------
    def State optimizeSuperflousImmediateTransitions(State rootState) {
        var targetStates = rootState.allContainedStatesList
        for (targetState : targetStates) {
            targetState.optimizeSuperflousImmediateTransitions(rootState);
        }
        rootState;
    }

    // TODO: at the moment this will not work with referenced valued objects    
    def void optimizeSuperflousImmediateTransitions(State state, State targetRootState) {
        if (state.outgoingTransitions.size == 1 && !state.controlflowRegionsContainStates) {
            val transition = state.outgoingTransitions.head
            val targetState = transition.targetState
            if (transition.implicitlyImmediate) {
                if (transition.trigger == null && transition.effects.nullOrEmpty) {
                    targetState.trace(transition) //KITT: Redirect tracing relations before removing
                    targetState.incomingTransitions.remove(transition)
                    state.outgoingTransitions.remove(transition)
                    targetState.setInitial(state.initial || targetState.initial)
                    targetState.setFinal(state.final || targetState.final)
                    for (incomingTransition : state.incomingTransitions.immutableCopy) {
                        incomingTransition.setTargetState(targetState)
                    }
                    targetState.setName(state.name)
                    targetState.setLabel(state.label)
                    targetState.trace(state) //KITT: Redirect tracing relations before removing
                    targetState.parentRegion.states.remove(state)
                }
            }
        }

    }

    //-------------------------------------------------------------------------
    //--     O P T I M I Z E :  Conditional  States  --
    //-------------------------------------------------------------------------
    // Optimize states with two outgoing transitions
    def State optimizeSuperflousConditionalStates(State rootState) {
        var targetStates = rootState.allContainedStatesList
        for (targetState : targetStates) {
            targetState.optimizeSuperflousConditionalStates(rootState);
        }
        rootState;
    }

    // TODO: at the moment this will not work with referenced valued objects    
    def void optimizeSuperflousConditionalStates(State state, State targetRootState) {
        if (state.outgoingTransitions.size == 2 && !state.controlflowRegionsContainStates) {
            val transition1 = state.outgoingTransitions.get(0)
            val transition2 = state.outgoingTransitions.get(1)
            val targetState2 = transition1.targetState
            if ((transition1.implicitlyImmediate) && (transition1.trigger == null)) {
                transition1.trace(transition2) //KITT: Redirect tracing relations before removing
                targetState2.incomingTransitions.remove(transition2)
                state.outgoingTransitions.remove(transition2)

            //targetState2.setInitial(state.initial || targetState2.initial)
            //targetState2.setFinal(state.final || targetState2.final)
            //targetState.setId(state.id)
            //targetState.setLabel(state.label)
            //targetState.parentRegion.states.remove(state)
            }
        }

    }

}
