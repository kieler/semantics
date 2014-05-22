/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import java.util.ArrayList

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * SCCharts ComplexFinalState Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class ComplexFinalState {

    @Inject
    extension KExpressionsExtension

    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"


    //-------------------------------------------------------------------------
    //--              C O M P L E X   F I N A L   S T A T E                  --
    //-------------------------------------------------------------------------
    // ...
    // Optimizations: 
    // (1)   In transitions from one ComplexFinalState (CFS) to another CFS
    //       optimize: Do not set term to false and to true again later
    //       (-> .filter[!complexFinalStates.contains(sourceState)])
    //  ATTENTION: if using this optimization make sure that if there is a
    //  final&INITIAL-state, the term-variable is initialized with TRUE!!! (not FALSE as usual) ***
    // (2)   Share a unique final state if possible (-> retrieveFinalState())
    // (3)   If just one regions: No watcher region is needed, no abort signal and
    //       only a single term signal 
    //       (TODO)                
    def State transform(State rootState) {
        var targetRootState = rootState.fixAllPriorities;

        // Traverse all states
        for (targetState : targetRootState.getAllContainedStates) {
            targetState.transformComplexFinalState(rootState);
        }
        targetRootState.fixAllTextualOrdersByPriorities;
    }

    def void transformComplexFinalState(State state, State targetRootState) {
        val complexFinalStates = state.allContainedStates.filter(
            e|
                e.parentRegion.parentState == state && e.isFinal && (!e.outgoingTransitions.nullOrEmpty ||
                    e.allContainedStates.size > 0 || e.entryActions.size > 0 || e.duringActions.size > 0 ||
                    e.exitActions.size > 0)).toList()

        if (!complexFinalStates.nullOrEmpty) {

            var abortFlag = state.createVariable(GENERATED_PREFIX + "abort").setTypeBool.uniqueName
            abortFlag.setInitialValue(FALSE)

            var ArrayList<ValuedObject> termVariables = new ArrayList

            for (region : state.regions) {
                val termVariable = state.createVariable(GENERATED_PREFIX + "term").setTypeBool.uniqueName
                termVariable.setInitialValue(FALSE)
                if (region.initialState.final) {

                    //***
                    termVariable.setInitialValue(TRUE)
                }
                termVariables.add(termVariable)

                val finalStates = region.states.filter[final && incomingTransitions.size > 0]

                for (finalState : finalStates) {
                    for (transition : finalState.incomingTransitions.filter[!complexFinalStates.contains(sourceState)]) {
                        transition.addEffect(termVariable.assign(TRUE))
                    }
                    for (transition : finalState.outgoingTransitions.filter[!complexFinalStates.contains(targetState)]) {
                        transition.addEffect(termVariable.assign(FALSE))
                    }
                }

            }

            //Add Watcher Region
            val watcherRegion = state.createRegion(GENERATED_PREFIX + "Watch").uniqueName
            val watcherTransition = watcherRegion.createInitialState(GENERATED_PREFIX + "Watch").
                createImmediateTransitionTo(watcherRegion.createFinalState(GENERATED_PREFIX + "Aborted"))
            watcherTransition.addEffect(abortFlag.assign(TRUE))
            for (termVariable : termVariables) {
                watcherTransition.setTrigger(watcherTransition.trigger.and2(termVariable.reference))
            }

            //Add additional final state
            for (complexFinalState : complexFinalStates) {
                complexFinalState.setFinal(false)
                val finalState = complexFinalState.parentRegion.retrieveFinalState(GENERATED_PREFIX + "Final")
                complexFinalState.createImmediateTransitionTo(finalState).setTrigger(abortFlag.reference)
            }

        }

    }

}
