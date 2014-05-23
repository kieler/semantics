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
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * SCCharts During Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class During {

    @Inject
    extension KExpressionsExtension

    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //-------------------------------------------------------------------------
    //--                     D U R I N G       A C T I O N                   --
    //-------------------------------------------------------------------------
    // Transforming During Actions.
    def State transform(State rootState) {
        val targetRootRegion = rootState.copy.fixAllPriorities;

        // Traverse all states
        for (targetState : targetRootRegion.getAllStates) {
            targetState.transformDuring(targetRootRegion);
        }
        targetRootRegion.fixAllTextualOrdersByPriorities;
    }

    // Traverse all states and transform macro states that have actions to transform
    def void transformDuring(State state, State targetRootRegion) {

        // DURING ACTIONS : 
        // For each action create a separate region in the state. 
        // Put the action into an transition within the macro state.
        // Add a loop back to the initial state of the added region.
        // In case the during action is immediate, the looping transition is non-immediate.
        // In case the during action is non-immediate, the looping transition is immediate.
        if (state.duringActions != null && state.duringActions.size > 0) {
            val term = state.createVariable(GENERATED_PREFIX + "term").setTypeBool.uniqueName
            term.setInitialValue(FALSE)

            val mainRegion = state.createRegion(GENERATED_PREFIX + "Main").uniqueName
            val mainState = mainRegion.createState(GENERATED_PREFIX + "Main").setInitial
            for (region : state.regions.filter(e|e != mainRegion).toList.immutableCopy) {
                mainState.regions.add(region)
            }
            val termTransition = mainState.createTransitionTo(mainRegion.createState(GENERATED_PREFIX + "Term").setFinal)
            termTransition.setTypeTermination
            termTransition.addEffect(term.assign(TRUE))

            // Create the body of the dummy state - containing the during action
            // For every during action: Create a region
            for (duringAction : state.duringActions.immutableCopy) {
                val region = state.createRegion(GENERATED_PREFIX + "During").uniqueName
                val initialState = region.createInitialState(GENERATED_PREFIX + "I")
                val middleState = region.createState(GENERATED_PREFIX + "S").setTypeConnector
                val finalState = region.createFinalState(GENERATED_PREFIX + "F")
                val transition1 = initialState.createTransitionTo(middleState)
                transition1.setDelay(duringAction.delay);
                transition1.setImmediate(duringAction.isImmediate);
                transition1.setTrigger(duringAction.trigger.copy);
                for (action : duringAction.effects) {
                    transition1.addEffect(action.copy);
                }
                val transition2 = middleState.createTransitionTo(initialState)
                transition2.setImmediate(!duringAction.isImmediate);
                var Transition transition3
                if (duringAction.immediate) {
                    transition3 = middleState.createImmediateTransitionTo(finalState)
                } else {
                    transition3 = initialState.createImmediateTransitionTo(finalState)
                }
                transition3.setTrigger(term.reference)
                transition3.setHighestPriority

                // After transforming during actions, erase them
                state.localActions.remove(duringAction)
            }
        }
    }

}
