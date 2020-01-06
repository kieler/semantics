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
package de.cau.cs.kieler.sccharts.processors

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.sccharts.ActivityType
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.DuringAction

/**
 * SCCharts During Transformation.
 * 
 * @author cmot ssm
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class During extends SCChartsProcessor implements Traceable {

    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsTransitionExtensions

    override getId() {
        "de.cau.cs.kieler.sccharts.processors.duringAction"
    }
    
    override getName() {
        "During Action"
    }

    override process() {
        setModel(model.transform)
    }

    static public final String GENERATED_PREFIX = "_"
    
    // PRODUCES: ComplexFinalStates (in the non-simple case)
    // Transforming During Actions.
    def State transform(State rootState) {
        // Traverse all states
        rootState.getAllStates.toList.forEach [ targetState |
            targetState.transformDuring(rootState)
        ]
        rootState
    }

    // Traverse all super states with outgoing terminations that have actions to transform. 
    // This default implementation will create / use a complex final state
    def void transformDuring(State state, State targetRootRegion) {

         val outgoingTerminations = state.outgoingTransitions.filter[ isTermination ]
         val hasOutgoingTerminations = outgoingTerminations.length > 0

        // If the state has outgoing terminations, we need to finalize the during
        // actions in case we end the states over these transitions
        // als 21-08-2019: BUT if the state has ONLY during actions, these actions are the only behavior and should not terminate
        val finalRegions = getProperty(FinalRegion.COMPILATION_SUPPORTS_FINAL_REGIONS)
        val complexDuring = ((hasOutgoingTerminations || state.isRootState) && 
            !state.regions.empty && state.regionsMayTerminate)
        val hasInnerBehavior = (state.controlflowRegions.exists[ !final ] || 
            state.actions.filter(DuringAction).exists[ activity == ActivityType.ACTIVE ]) ||
            // all other transitions create inner behavior.
            !state.outgoingTransitions.forall[ isImmediate && !termination && trigger === null ]

        // Create the body of the dummy state - containing the during action
        // For every during action: Create a region
        for (duringAction : state.duringActions.toList) {
            // Tracing
            duringAction.setDefaultTrace;
            
            val activeDuringAction = duringAction.activity === ActivityType.ACTIVE
            
            if (!activeDuringAction && !hasInnerBehavior) {
                // Passive during without inner behavior become entry actions if immediate or get discarded.
                if (duringAction.isImmediate) {
                    val entryAction = state.createEntryAction
                    entryAction.setTrigger(duringAction.trigger.copy)
                    for (action : duringAction.effects) {
                        entryAction.addEffect(action.copy)
                    }
                }                
            } else {
            
                val region = state.createControlflowRegion(GENERATED_PREFIX + "During")
                val initialState = region.createInitialState(GENERATED_PREFIX + "I")
                
                if (finalRegions && !activeDuringAction) {
                    region.final = finalRegions
                }
                
                var Transition duringTransition = null            
                if (duringAction.isImmediate) {
                    val secondState = region.createState(GENERATED_PREFIX + "S");
                    duringTransition = initialState.createTransitionTo(secondState)
    
                    // because we have a second state, we need another transition
                    secondState.createTransitionTo(initialState)
                    if (complexDuring && (!finalRegions || activeDuringAction)) {
                        secondState.setFinal
                    }
                } else {
                    // Self loop in the non-immediate case
                    duringTransition = initialState.createTransitionTo(initialState)
                }
        
                if (complexDuring && (!finalRegions || activeDuringAction)) {
                     initialState.setFinal
                }
    
                duringTransition.setDelay(duringAction.delay);
                duringTransition.setImmediate(duringAction.isImmediate);
                duringTransition.setTrigger(duringAction.trigger.copy);
                for (action : duringAction.effects) {
                    duringTransition.addEffect(action.copy);
                }
            
            }

            // After transforming during actions, erase them
            state.actions.remove(duringAction)
        }

    }
    
    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }
    
}
