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
    //
    // PRODUCES: ComplexFinalStates (in the non-simple case)
    //
    // Transforming During Actions.
    def State transform(State rootState) {
        val targetRootState = rootState.fixAllPriorities;

        // Traverse all states
        targetRootState.getAllStates.toList.forEach[ targetState |
            targetState.transformDuring(targetRootState);
        ]
        targetRootState.fixAllTextualOrdersByPriorities;
    }

    // Traverse all states and transform macro states that have actions to transform
    def void transformDuring(State state, State targetRootState) {

        // DURING ACTIONS : 
        // For each action create a separate region in the state. 
        // Put the action into an transition within the macro state.
        // Add a loop back to the initial state of the added region.
        // In case the during action is immediate, the looping transition is non-immediate.
        // In case the during action is non-immediate, the looping transition is immediate.
        
        // MODIFICATION 26.07.2014: Do during BEFORE abort transformation,
        // benefit: do not need to handle terminations of concurrent regions any more!
        
        // Modification 27.07.2014: We NEED to reaction to terminations, outgoing of the
        // current state (if present). In this case we add an auxiliary final state, and
        // a flag that is made absent when entering the state (entry) and made present 
        // when exiting it
        // calling transformDuringEx()
        
        
        if (state.duringActions != null && state.duringActions.size > 0) {
            val outgoingTerminations = state.outgoingTransitions.filter(e|e.typeTermination)
            val hasOutgoingTerminations = outgoingTerminations.length > 0
            
            // If the state has outgoing terminations, we need to finalize the during
            // actions in case we end the states over these transitions
            if (hasOutgoingTerminations) {
               state.transformDuringComplexFinalStates(targetRootState)
            } else {
              state.transformDuringSimple(targetRootState)
            }
            
          }
    }
            
    // Traverse all simple states or super states w/o outgoing terminations that have actions to 
    // transform
    def void transformDuringSimple(State state, State targetRootRegion) {
            
            // Create the body of the dummy state - containing the during action
            // For every during action: Create a region
            for (duringAction : state.duringActions.immutableCopy) {
                val immediateDuringAction = duringAction.isImmediate
                val region = state.createRegion(GENERATED_PREFIX + "During").uniqueName
                val initialState = region.createInitialState(GENERATED_PREFIX + "I")
                val middleState = region.createState(GENERATED_PREFIX + "S");
                if (!immediateDuringAction) {
                    // Only set this as a connector if it is not an immediate during action!
                    // Otherwise we like to rest here!
                    middleState.setTypeConnector
                }
                val transition1 = initialState.createTransitionTo(middleState)
                transition1.setDelay(duringAction.delay);
                transition1.setImmediate(immediateDuringAction);
                transition1.setTrigger(duringAction.trigger.copy);
                for (action : duringAction.effects) {
                    transition1.addEffect(action.copy);
                }
                val transition2 = middleState.createTransitionTo(initialState)
                transition2.setImmediate(!immediateDuringAction);

                // After transforming during actions, erase them
                state.localActions.remove(duringAction)
            }
    }
    
    
    // Traverse all super states with outgoing terminations that have actions to transform. 
    // This default implementation will create / use a complex final state
    def void transformDuringComplexFinalStates(State state, State targetRootRegion) {
            
            // Create the body of the dummy state - containing the during action
            // For every during action: Create a region
            for (duringAction : state.duringActions.immutableCopy) {
                val immediateDuringAction = duringAction.isImmediate
                val region = state.createRegion(GENERATED_PREFIX + "During").uniqueName
                val initialState = region.createInitialState(GENERATED_PREFIX + "I")
                val finalState = region.createFinalState(GENERATED_PREFIX + "F");
                val transition1 = initialState.createTransitionTo(finalState)
                transition1.setDelay(duringAction.delay);
                transition1.setImmediate(true);
                if (immediateDuringAction) {
                    // In case of immediate during action, copy the trigger and effect
                    if (duringAction.trigger != null) {
                        transition1.setTrigger(duringAction.trigger.copy);
                        // if the during action has a trigger we need a second immediate 
                        // default path to the final state!
                        val transition1b = initialState.createTransitionTo(finalState);  
                        transition1b.setImmediate(true);
                    }
                    
                    for (action : duringAction.effects) {
                        transition1.addEffect(action.copy);
                    }
                }
                val transition2 = finalState.createTransitionTo(finalState)
                transition2.setImmediate(false);
                transition2.setTrigger(duringAction.trigger.copy);
                for (action : duringAction.effects) {
                    transition2.addEffect(action.copy);
                }

                // After transforming during actions, erase them
                state.localActions.remove(duringAction)
            }
    }
        
    
    
    // Traverse all super states with outgoing terminations that have actions to transform. 
    // This alternative implementation will create a main region to detect termination
    def void transformDuringEx(State state, State targetRootRegion) {

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
                val immediateDuringAction = duringAction.isImmediate
                val region = state.createRegion(GENERATED_PREFIX + "During").uniqueName
                val initialState = region.createInitialState(GENERATED_PREFIX + "I")
                val middleState = region.createState(GENERATED_PREFIX + "S")
                if (!immediateDuringAction) {
                    middleState.setTypeConnector                
                }
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
                    transition3 = middleState.createImmediateTransitionTo(finalState).setLowestPriority
                } else {
                    transition3 = initialState.createImmediateTransitionTo(finalState).setLowestPriority
                }
                transition3.setTrigger(term.reference)
                transition3.setHighestPriority

                // After transforming during actions, erase them
                state.localActions.remove(duringAction)
            }
        }
    }
    

}
