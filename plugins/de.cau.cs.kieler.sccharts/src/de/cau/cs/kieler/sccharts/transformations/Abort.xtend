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

import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import de.cau.cs.kieler.sccharts.features.SCChartsFeature
import java.util.HashMap

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*

/**
 * SCCharts Abort Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Abort extends AbstractExpansionTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::ABORT_ID
    }

    override getName() {
        return SCChartsTransformation::ABORT_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::ABORT_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::INITIALIZATION_ID, SCChartsFeature::ENTRY_ID,
            SCChartsFeature::CONNECTOR_ID)
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::COUNTDELAY_ID, SCChartsFeature::COMPLEXFINALSTATE_ID, SCChartsFeatureGroup::EXPANSION_ID)
    }

    //-------------------------------------------------------------------------
    //-------------------------------------------------------------------------
    @Inject
    extension KExpressionsExtension

    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    private val nameCache = <String>newArrayList("_term")

    // FIXME: Delayed weak aborts need to be treated with a watcher region and a
    // delaying auxiliary signal there.
    //-------------------------------------------------------------------------
    //--               A B O R T   A L T E R N A T I V E    N O    W T O     --
    //-------------------------------------------------------------------------
    // Transforming Aborts.
    def State transform(State rootState) {
        val targetRootState = rootState.fixAllPriorities;

        nameCache.clear

        // Traverse all states
        var done = false;
        for (targetState : targetRootState.getAllContainedStatesList) {
            if (!done) {
                targetState.transformAbortNoWTO(targetRootState);
            }

        //done = true;
        }
        targetRootState.fixAllTextualOrdersByPriorities;
    }

    // Traverse all states 
    def void transformAbortNoWTO(State state, State targetRootState) {

        // (a) more than one transitions outgoing OR
        // (b) ONE outgoing transition AND
        //     + not a termination transition without any trigger
        val stateHasUntransformedTransitions = ((state.outgoingTransitions.size > 1) || ((state.outgoingTransitions.size ==
            1) && (!(state.outgoingTransitions.filter[typeTermination].filter[trigger == null].size == 1))))

        val stateHasUntransformedAborts = (!(state.outgoingTransitions.filter[!typeTermination].nullOrEmpty))

        //        if (state.hierarchical && stateHasUntransformedAborts && state.label != "WaitAandB") {
        if ((state.hasInnerStatesOrControlflowRegions || state.hasInnerActions) && stateHasUntransformedTransitions) { // && state.label != "WaitAB") {
            state.outgoingTransitions.setDefaultTrace;
            val transitionTriggerVariableMapping = new HashMap<Transition, ValuedObject>

            // Remember all outgoing transitions and regions (important: do not consider regions without inner states! => regions2)
            val outgoingTransitions = state.outgoingTransitions.immutableCopy
            val regions = state.controlflowRegions2.immutableCopy

            // Only create a control region in the WTO case if there is at least one conditional termination
            // or a delayed termination
            val notCoreTerminations = outgoingTransitions.filter[e|
                (e.typeTermination && (!(e.immediate2) || (e.trigger != null)))]
            val delayedWeekAborts = outgoingTransitions.filter[e|e.typeWeakAbort && !e.immediate2]
            val finalStates = state.regions.filter(ControlflowRegion).filter[e|e.states.filter[ee|ee.final].size > 0].size > 0
            val termination = outgoingTransitions.filter[e|e.typeTermination && e.trigger == null].size > 0

            val terminationHandlingNeeded = (notCoreTerminations.size > 0)
            val delayedWeakAbortHandlingNeeded = (delayedWeekAborts.size > 0)
            val anyFinalStatesButNoTermination = finalStates && !termination
            val needCtrlRegion = terminationHandlingNeeded || delayedWeakAbortHandlingNeeded ||
                anyFinalStatesButNoTermination

            // .. || stateHasUntransformedTransitions : for conditional terminations!
            if (stateHasUntransformedAborts || stateHasUntransformedTransitions) {
            
                // Only create a control region in the WTO case if there is at least one conditional termination
                // or a delayed termination
                var State doneState
                var State runState
                if (needCtrlRegion) {
                    val ctrlRegion = state.createControlflowRegion(GENERATED_PREFIX + "Ctrl").uniqueNameCached(nameCache)
                    runState = ctrlRegion.createInitialState(GENERATED_PREFIX + "Run").uniqueNameCached(nameCache)
                    doneState = ctrlRegion.createFinalState(GENERATED_PREFIX + "Done").uniqueNameCached(nameCache)
                }

                // Build up weak and strong abort triggers
                var Expression strongAbortTrigger = null;
                var strongImmediateTrigger = false;
                var Expression weakAbortTrigger = null;
                for (transition : outgoingTransitions) {
                    transition.setDefaultTrace;
                    if (transition.typeStrongAbort) {
                        strongAbortTrigger = strongAbortTrigger.or2(transition.trigger.copy)
                        strongImmediateTrigger = strongImmediateTrigger || transition.immediate2
                    } else if (transition.typeWeakAbort) {
                        if (transition.immediate2) {
                            weakAbortTrigger = weakAbortTrigger.or2(transition.trigger.copy)
                        } else {
                            // In case of a delayed weak abort, we need to take care of the delay in
                            // the watcher region and create an auxiliarv variable
                            // Create a new _transitionTrigger valuedObject
                            val transitionTriggerVariable = state.parentRegion.parentState.createVariable(
                                GENERATED_PREFIX + "trig").setTypeBool.uniqueNameCached(nameCache)
                            state.createEntryAction.addEffect(transitionTriggerVariable.assign(FALSE))
                            transitionTriggerVariableMapping.put(transition, transitionTriggerVariable)
                            weakAbortTrigger = weakAbortTrigger.or2(transitionTriggerVariable.reference)
                        }
                    }
                }

                var Expression terminationTrigger;

                state.outgoingTransitions.setDefaultTrace;
                // For each region encapsulate it into a _Main state and add a _Term variable
                // also to the terminationTrigger
                for (region : regions) {
                    if (terminationHandlingNeeded) {
                        val mainRegion = state.createControlflowRegion(GENERATED_PREFIX + "Main").uniqueNameCached(nameCache)
                        val mainState = mainRegion.createInitialState(GENERATED_PREFIX + "Main").
                            uniqueNameCached(nameCache)
                        mainState.regions.add(region)
                        val termState = mainRegion.createFinalState(GENERATED_PREFIX + "Term").
                            uniqueNameCached(nameCache)
                        val termVariable = state.createVariable(GENERATED_PREFIX + "termRegion").setTypeBool.
                            uniqueNameCached(nameCache)
                        mainState.createTransitionTo(termState).addEffect(termVariable.assign(TRUE)).setTypeTermination
                        if (terminationTrigger != null) {
                            terminationTrigger = terminationTrigger.and(termVariable.reference)
                        } else {
                            terminationTrigger = termVariable.reference
                        }
                        state.createEntryAction.addEffect(termVariable.assign(FALSE))
                    }

                    // Inside every region create a _Aborted
                    val abortedState = region.retrieveFinalState(GENERATED_PREFIX + "Aborted").
                        uniqueNameCached(nameCache)
                    for (innerState : region.states.filter[!final]) {
                        if (innerState != abortedState) {
                            if (strongAbortTrigger != null) {
                                val strongAbort = innerState.createTransitionTo(abortedState, 0)
                                if (innerState.hasInnerStatesOrControlflowRegions || innerState.hasInnerActions) {
                                    strongAbort.setTypeStrongAbort
                                }
                                strongAbort.setPriority(0)
                                strongAbort.setTrigger(strongAbortTrigger.copy)
                                strongAbort.setImmediate(strongImmediateTrigger)
                            }
                            if (weakAbortTrigger != null) {
                                val weakAbort = innerState.createTransitionTo(abortedState)
                                weakAbort.setTrigger(weakAbortTrigger.copy)
                                weakAbort.setLowestPriority;
                                // ALL weak aborts MUST be immediate, otherwise they might be overruled
                                // by other transitions and would NEVER be executed. This way it is made
                                // sure that a weak abort is taken if control would rest otherwise
                                weakAbort.setImmediate(true)
                            }
                        }
                    }
                }

                if (terminationTrigger == null) {
                    terminationTrigger = TRUE;
                }

                // Only consider termination transitions here, in the WTO version
                // we do not need a ctrlRegion iff there are no conditional terminations or
                // delayed terminations
                for (transition : outgoingTransitions) {
                    transition.setDefaultTrace;
                    if (needCtrlRegion) {
                        //(transition.typeTermination && (!(transition.immediate2) || (transition.trigger != null)))
                        //||
                        //(transition.typeWeakAbort && !transition.immediate2)) {
                        // Create a ctrlTransition in the ctrlRegion
                        val ctrlTransition = runState.createTransitionTo(doneState)
                        if (transition.immediate2) {
                            // if the transition was immediate then set the ctrl transition to be immediate
                            ctrlTransition.setImmediate(true)
                        }

                        if (transition.typeTermination) {
                            if (transition.trigger != null) {
                                ctrlTransition.setTrigger(terminationTrigger.copy.and(transition.trigger.copy))
                            } else {
                                ctrlTransition.setTrigger(terminationTrigger.copy)
                            }
                        } else {

                            // this is the fallback were we copy in a NO WTO fashion the triggers
                            ctrlTransition.setTrigger(transition.trigger.copy)

                            if (transition.typeWeakAbort && !transition.immediate2) {

                                // in this case we have to take care of getting the auxiliary variable for the
                                // original delayed weak abort trigger
                                // Get the _transitionTrigger that was created earlier
                                val transitionTriggerVariable = transitionTriggerVariableMapping.get(transition)
                                ctrlTransition.addEffect(transitionTriggerVariable.assign(TRUE))
                            }
                        }

                    }
                }

            }

            state.outgoingTransitions.setDefaultTrace;
            // Create a single outgoing normal termination to a new connector state
            val outgoingConnectorState = state.parentRegion.createState(GENERATED_PREFIX + "C").
                uniqueNameCached(nameCache).setTypeConnector
            state.createTransitionTo(outgoingConnectorState).setTypeTermination

            // Be careful to NOT create a trigger for the LAST (lowest priorized) outgoing transition from a connector, this must
            // be the DEFAULT transition that has NO trigger ***
            val defaultTransition = outgoingTransitions.last

            for (transition : outgoingTransitions) {
                transition.setDefaultTrace;
                
                // Modify the outgoing transition
                transition.setSourceState(outgoingConnectorState)

                if (transition != defaultTransition) {

                  // Get the _transitionTrigger that was created earlier
                  if (transition.typeWeakAbort && !transition.immediate2) {
                    val transitionTriggerVariable = transitionTriggerVariableMapping.get(transition)
                    if (transitionTriggerVariable != null) {
                        // This case for delayed termination transitions only
                        transition.setTrigger2(transitionTriggerVariable.reference)
                    }
                  } 
                  else {
                      // Fall back to this case when we did not create a trigger variable
                      // Take the original trigger here (before for the actual ABORT in the main region take a copy, also for the watcher take a copy
                      transition.setTrigger2(transition.trigger)
                  }
                } 

                transition.setTypeWeakAbort
            }

            // OPTIMIZATION
            // if the connector has to just one outgoing transition, erase it
            if (outgoingConnectorState.outgoingTransitions.size == 1) {
                val transition = outgoingConnectorState.outgoingTransitions.get(0)
                transition.setImmediate(true)
                transition.setTypeTermination
                transition.setTrigger(null)
                val transitionToDelete = outgoingConnectorState.incomingTransitions.get(0)
                transitionToDelete.trace(transition)
                state.outgoingTransitions.remove(transitionToDelete)
                state.outgoingTransitions.add(transition)
                outgoingConnectorState.trace(transition)
                state.parentRegion.states.remove(outgoingConnectorState)
            }

        }

    }

}
