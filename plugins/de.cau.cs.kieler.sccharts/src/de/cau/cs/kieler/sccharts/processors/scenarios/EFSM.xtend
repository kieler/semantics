/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2023 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors.scenarios

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import java.util.List

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * @author jep
 * 
 */
class EFSM extends SCChartsProcessor implements Traceable {

    override getId() {
        "de.cau.cs.kieler.sccharts.processors.efsm"
    }

    override getName() {
        "EFSM"
    }

    override process() {
        setModel(model.transform)
    }

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [rootStates.forEach[transform]]
    }

    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions

    def State transform(State rootState) {
        val topStates = rootState.regions.flatMap[region|(region as ControlflowRegion).states].toList
        flatten(topStates)
        return rootState
    }

    def void flatten(List<State> states) {
        for (state : states) {
            if (state.isHierarchical) {
                val children = state.regions.flatMap[region|(region as ControlflowRegion).states].toList

                val outgoing = state.outgoingTransitions
                val incoming = state.incomingTransitions
                for (child : children) {
                    for (out : outgoing) {
                        val transition = child.createTransitionTo(out.targetState)
                        transition.trigger = out.trigger.nontracingCopy
                    }
                    if (child.isInitial) {
                        for (in : incoming) {
                            val transition = in.nontracingCopy
                            transition.sourceState = in.sourceState
                            transition.targetState = child
                            // translate entry action from superstate
                            // TODO: check that the actions are really entry actions
                            val actions = state.actions.flatMap(action|action.effects.map(effect|effect.nontracingCopy))
                            transition.effects.addAll(actions)
                        // TODO: translate during and exit actions
                        }
                    }
                }

                state.parentRegion.states.addAll(children)
                state.parentRegion.states.remove(state)
                flatten(children)
            }
        }
    }

}
