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
package de.cau.cs.kieler.sccharts.transformations

import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ValuedObject
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
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransformationExtension
import de.cau.cs.kieler.sccharts.StateType
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions

/**
 * SCCharts Abort Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Abort extends AbstractExpansionTransformation implements Traceable {

    protected static val ANNOTATION_IGNORETHREAD = "ignore"

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
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
        return Sets.newHashSet(SCChartsFeature::COUNTDELAY_ID, SCChartsFeature::COMPLEXFINALSTATE_ID,
            SCChartsFeatureGroup::EXPANSION_ID)
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    @Inject
    extension KExpressionsCreateExtensions

    @Inject
    extension KExpressionsComplexCreateExtensions

    @Inject
    extension KExpressionsDeclarationExtensions

    @Inject
    extension AnnotationsExtensions

    @Inject
    extension Termination

//    @Inject
//    extension KExpressionsValuedObjectExtensions   
    @Inject
    extension SCChartsTransformationExtension

    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    private val nameCache = <String>newArrayList("_term")

    // FIXME: Delayed weak aborts need to be treated with a watcher region and a
    // delaying auxiliary signal there.
    // -------------------------------------------------------------------------
    // --               A B O R T   A L T E R N A T I V E    N O    W T O     --
    // -------------------------------------------------------------------------
    // Transforming Aborts.
    def State transform(State rootState) {
        val targetRootState = rootState.fixAllPriorities;

        nameCache.clear

        // Traverse all states
        var done = false;
        for (targetState : targetRootState.getAllContainedStatesList) {
            if (!done) {
                // !!!CHANGED: optimization added, check if correct for all cases
                // The termination transformation is only necessary if there are delayed/conditional terminations or if
                // a termination is mixed with WEAK aborts
                // if a termination is mixed with strong aborts it does not matter because we do not
                // have a last wish to consider!
                val singleTermination = targetState.outgoingTransitions.filter [e|e.typeTermination && e.isImmediate2 && e.trigger == null].size == 1 
                                        && targetState.outgoingTransitions.filter[e|e.typeTermination].size == 1
                val noWeakAborts = targetState.outgoingTransitions.filter[e|e.typeWeakAbort].size == 0
                if (!(singleTermination && noWeakAborts)) {
                    // optimization: If this termination is the only outgoing then do not transform terminations first
                    targetState.transformTermination(targetRootState)
                }

                targetState.transformAbortNoWTO_NEW(targetRootState)
            }

        // done = true;
        }
        targetRootState.fixAllTextualOrdersByPriorities;
    }



















    // Traverse all states 
    def void transformAbortNoWTO_NEW(State state, State targetRootState) {

        // (a) more than one transitions outgoing OR
        // (b) ONE outgoing transition AND
        // + not a termination transition without any trigger
// ???  // + not a termination self loop?
        val stateHasUntransformedTransitions = ((state.outgoingTransitions.size > 1) ||
            ((state.outgoingTransitions.size == 1) && (!(state.outgoingTransitions.filter[typeTermination].filter [
                trigger == null
            ].size == 1))))

        val stateHasUntransformedAborts = (!(state.outgoingTransitions.filter[!typeTermination].nullOrEmpty))

        // if (state.hierarchical && stateHasUntransformedAborts && state.label != "WaitAandB") {
        // Code before: Entry & Exit actions should be handled correctly afterwards, during actions should be handled before!
        // if ((state.hasInnerStatesOrControlflowRegions || state.hasInnerActions) && stateHasUntransformedTransitions) { // && state.label != "WaitAB") {
        if ((state.hasInnerStatesOrControlflowRegions) && stateHasUntransformedTransitions) { // && state.label != "WaitAB") {
            state.outgoingTransitions.setDefaultTrace;
            val transitionTriggerVariableMapping = new HashMap<Transition, ValuedObject>

            // Remember all outgoing transitions and regions (important: do not consider regions without inner states! => regions2)
            val outgoingTransitions = state.outgoingTransitions.immutableCopy
            val regions = state.controlflowRegions2.immutableCopy

            val delayedWeakAborts = outgoingTransitions.filter[e|e.typeWeakAbort && !e.immediate2]
            val mixedDelayedStrongAborts = outgoingTransitions.filter[e|e.typeStrongAbort && !e.immediate2].size > 0 &&
                outgoingTransitions.filter[e|!e.typeStrongAbort && e.immediate2].size > 0
            val finalStates = state.regions.filter(ControlflowRegion).filter[e|e.states.filter[ee|ee.final].size > 0].
                size > 0

            // !!!CHANGED
            // Only create a control region in the WTO case if there is at least one conditional termination
            // or a delayed termination or self-loop
            // val notCoreTerminations = outgoingTransitions.filter [ e |
            // (e.typeTermination && (!(e.immediate2) || (e.trigger != null)))
            // ]
            // val terminationHandlingNeeded = (notCoreTerminations.size > 0)
            val delayedAbortHandlingNeeded = (delayedWeakAborts.size > 0) || mixedDelayedStrongAborts
            val termination = outgoingTransitions.filter[e|e.typeTermination && e.trigger == null].size > 0
            val anyFinalStatesButNoTermination = finalStates && !termination && !state.isRootState
            // !!!CHANGED
            // val needCtrlRegion = terminationHandlingNeeded || delayedAbortHandlingNeeded ||
            // anyFinalStatesButNoTermination
            val needCtrlRegion = delayedAbortHandlingNeeded || anyFinalStatesButNoTermination

            // .. || stateHasUntransformedTransitions : for conditional terminations!
            if (stateHasUntransformedAborts || stateHasUntransformedTransitions) {

                // Only create a control region in the WTO case if there is at least one conditional termination
                // or a delayed termination
                var State doneState
                var State runState
                if (needCtrlRegion) {
                    // Put information for smarter scheduling 
                    // TODO: check, may be superfluous in the future when depth-join is implemented
                    // for (region : state.regions) {
                    // region.createStringAnnotation(ANNOTATION_IGNORETHREAD, "")
                    // }
                    val ctrlRegion = state.createControlflowRegion(GENERATED_PREFIX + "Ctrl").
                        uniqueNameCached(nameCache)
                    runState = ctrlRegion.createInitialState(GENERATED_PREFIX + "Run").uniqueNameCached(nameCache)
                    doneState = ctrlRegion.createFinalState(GENERATED_PREFIX + "Done").uniqueNameCached(nameCache)
                }

                // Build up weak and strong abort triggers
                var Expression strongAbortTrigger = null;
                var Expression strongAbortImmediateTrigger = null;
                // var strongImmediateTrigger = false;
                var boolean weakAbortImmediateTriggerTermination = false;
                var Expression weakAbortImmediateTerminationTrigger = null; //!!!CHANGED
                var Expression weakAbortImmediateTrigger = null;
                for (transition : outgoingTransitions) {
                    transition.setDefaultTrace;
                    if (transition.typeStrongAbort) {
                        if (transition.immediate2) {
                            strongAbortImmediateTrigger = strongAbortImmediateTrigger.or(transition.trigger.copy).trace(
                                transition)
                        } else {
                            if (mixedDelayedStrongAborts) {
                                // strongAbortTrigger = strongAbortTrigger.or(transition.trigger.copy).trace(transition)
                                val transitionTriggerVariable = state.parentRegion.parentState.createVariable(
                                    GENERATED_PREFIX + "trig").setTypeBool.uniqueNameCached(nameCache)
                                state.createEntryAction.addEffect(transitionTriggerVariable.assign(FALSE))
                                transitionTriggerVariableMapping.put(transition, transitionTriggerVariable)
                                strongAbortTrigger = strongAbortTrigger.or(transitionTriggerVariable.reference).trace(
                                    transition)
                            } else {
                                strongAbortTrigger = strongAbortTrigger.or(transition.trigger.copy).trace(transition)
                            }
                        }
                    } else if (transition.typeWeakAbort) {
                        if (transition.immediate2) {
                            //!!!CHANGED
                            // TODO: check if optimization is correct in all cases!
                            if (transition.hasAnnotation(Termination.ANNOTATION_TERMINATIONTRANSITION)) {
                                weakAbortImmediateTerminationTrigger = weakAbortImmediateTerminationTrigger.or(transition.trigger.copy).trace(
                                transition)
                                weakAbortImmediateTriggerTermination = true
                            } else {
                                weakAbortImmediateTrigger = weakAbortImmediateTrigger.or(transition.trigger.copy).trace(
                                    transition)
                            }
                        } else {
                            // In case of a delayed weak abort, we need to take care of the delay in
                            // the watcher region and create an auxiliarv variable
                            // Create a new _transitionTrigger valuedObject
                            val transitionTriggerVariable = state.parentRegion.parentState.createVariable(
                                GENERATED_PREFIX + "trig").setTypeBool.uniqueNameCached(nameCache)
                            state.createEntryAction.addEffect(transitionTriggerVariable.assign(FALSE))
                            transitionTriggerVariableMapping.put(transition, transitionTriggerVariable)
                            weakAbortImmediateTrigger = weakAbortImmediateTrigger.or(
                                transitionTriggerVariable.reference).trace(transition)
                        }
                    }
                }

                var Expression terminationTrigger;

                state.outgoingTransitions.setDefaultTrace;
                // For each region encapsulate it into a _Main state and add a _Term variable
                // also to the terminationTrigger
                for (region : regions) {

//!!!CHANGED
//                    if (terminationHandlingNeeded) {
//                        val mainRegion = state.createControlflowRegion(GENERATED_PREFIX + "Main").
//                            uniqueNameCached(nameCache)
//                        val mainState = mainRegion.createInitialState(GENERATED_PREFIX + "Main").
//                            uniqueNameCached(nameCache)
//                        mainState.regions.add(region)
//                        val termState = mainRegion.createFinalState(GENERATED_PREFIX + "Term").
//                            uniqueNameCached(nameCache)
//                        //!!!NEW: parentRegion.parentState    
//                        termVariable = state.parentRegion.parentState.createVariable(GENERATED_PREFIX + "termRegion").setTypeBool.
//                            uniqueNameCached(nameCache)
//                        mainState.createTransitionTo(termState).addEffect(termVariable.assign(TRUE)).setTypeTermination
//                        if (terminationTrigger != null) {
//                            terminationTrigger = terminationTrigger.and(termVariable.reference)
//                        } else {
//                            terminationTrigger = termVariable.reference
//                        }
//                        state.createEntryAction.addEffect(termVariable.assign(FALSE))
//                    }
                    // Inside every region create an _Aborted
                    val abortedState = region.retrieveFinalState(GENERATED_PREFIX + "Aborted").
                        uniqueNameCached(nameCache)
                    for (innerState : region.states.filter[!final && type != StateType::CONNECTOR]) {
                        if (innerState != abortedState) {
                            if (strongAbortTrigger != null) {
                                val strongAbort = innerState.createTransitionTo(abortedState, 0)
                                if (innerState.hasInnerStatesOrControlflowRegions || innerState.hasInnerActions) {
                                    strongAbort.setTypeStrongAbort
                                }
                                strongAbort.setPriority(0)
                                strongAbort.setTrigger(strongAbortTrigger.copy)
                                strongAbort.setImmediate(false)
                            }
                            if (strongAbortImmediateTrigger != null) {
                                val strongAbort = innerState.createTransitionTo(abortedState, 0)
                                if (innerState.hasInnerStatesOrControlflowRegions || innerState.hasInnerActions) {
                                    strongAbort.setTypeStrongAbort
                                }
                                strongAbort.setPriority(0)
                                strongAbort.setTrigger(strongAbortImmediateTrigger.copy)
                                strongAbort.setImmediate(true)
                            }
                            if (weakAbortImmediateTrigger != null || weakAbortImmediateTerminationTrigger != null) {
                                //!!!CHANGED
                                // only create a weak abort immediate transition
                                var Expression trigger;
                                if ((innerState.hasAnnotation(Termination.ANNOTATION_FINALSTATE))) {
                                     trigger = null; //weakAbortImmediateTerminationTrigger.copy
                                     innerState.createTransitionTo(abortedState).setImmediate
                                }
                                else if (weakAbortImmediateTrigger != null) {
                                     trigger = trigger.or(weakAbortImmediateTrigger.copy)
                                }
                                if (trigger != null) {
//                                if (innerState.hasAnnotation(Termination.ANNOTATION_FINALSTATE) ||
//                                    !weakAbortImmediateTriggerTermination) {
                                    val weakAbort = innerState.createTransitionTo(abortedState)
                                    weakAbort.setTrigger(trigger.copy)
                                    weakAbort.setLowestPriority;
                                    // ALL weak aborts MUST be immediate, otherwise they might be overruled
                                    // by other transitions and would NEVER be executed. This way it is made
                                    // sure that a weak abort is taken if control would rest otherwise
                                    weakAbort.setImmediate(true)
                                }
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
                        // (transition.typeTermination && (!(transition.immediate2) || (transition.trigger != null)))
                        // ||
                        // (transition.typeWeakAbort && !transition.immediate2)) {
                        // Create a ctrlTransition in the ctrlRegion
                        val ctrlTransition = runState.createTransitionTo(doneState)
                        ctrlTransition.setLowestPriority
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

//                            if (transition.typeWeakAbort && !transition.immediate2) {
                            // in this case we have to take care of getting the auxiliary variable for the
                            // original delayed weak abort trigger
                            // Get the _transitionTrigger that was created earlier
                            //
                            // Do the following also in case of mixed delayed/immediate STRONG aborts!
                            val transitionTriggerVariable = transitionTriggerVariableMapping.get(transition)
                            if (transitionTriggerVariable != null) {
                                ctrlTransition.addEffect(transitionTriggerVariable.assign(TRUE))
                            }
//                            }
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
                    // if (transition.typeWeakAbort && !transition.immediate2) {
                    val transitionTriggerVariable = transitionTriggerVariableMapping.get(transition)
                    if (transitionTriggerVariable != null) {
                        // This case for delayed termination transitions only
                        transition.setTrigger2(transitionTriggerVariable.reference)
                    } else {
                        // Fall back to this case when we did not create a trigger variable
                        // Take the original trigger here (before for the actual ABORT in the main region take a copy, also for the watcher take a copy
                        transition.setTrigger2(transition.trigger)
                    }
                } else {
                    // Actively set the trigger of the termination to NULL
                    transition.setTrigger(null) // !!!CHANGED
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

        } else {
            // Because we do not have (abortable) internal controlflow, change all strong aborts to be "weak" aborts
            // This can only happen for entry or exit actions inside a state with no further internal behavior
            // because entry and exit actions (at this point) cannot be aborted (TODO: think about additional before and after actions!)
            for (transition : state.outgoingTransitions) {
                if (transition.isTypeStrongAbort) {
                    transition.setTypeWeakAbort
                }
            }
        }

    }













 ////////////////////////////////////////////////////////////////////////////
 ////                O   L   D
 ///////////////////////////////////////////////////////////////////////////

    // Traverse all states 
    def void transformAbortNoWTO(State state, State targetRootState) {

        // (a) more than one transitions outgoing OR
        // (b) ONE outgoing transition AND
        // + not a termination transition without any trigger
        val stateHasUntransformedTransitions = ((state.outgoingTransitions.size > 1) ||
            ((state.outgoingTransitions.size == 1) && (!(state.outgoingTransitions.filter[typeTermination].filter [
                trigger == null
            ].size == 1))))

        val stateHasUntransformedAborts = (!(state.outgoingTransitions.filter[!typeTermination].nullOrEmpty))

        // if (state.hierarchical && stateHasUntransformedAborts && state.label != "WaitAandB") {
        // Code before: Entry & Exit actions should be handled correctly afterwards, during actions should be handled before!
        // if ((state.hasInnerStatesOrControlflowRegions || state.hasInnerActions) && stateHasUntransformedTransitions) { // && state.label != "WaitAB") {
        if ((state.hasInnerStatesOrControlflowRegions) && stateHasUntransformedTransitions) { // && state.label != "WaitAB") {
            state.outgoingTransitions.setDefaultTrace;
            val transitionTriggerVariableMapping = new HashMap<Transition, ValuedObject>

            // Remember all outgoing transitions and regions (important: do not consider regions without inner states! => regions2)
            val outgoingTransitions = state.outgoingTransitions.immutableCopy
            val regions = state.controlflowRegions2.immutableCopy

            // Only create a control region in the WTO case if there is at least one conditional termination
            // or a delayed termination
            val notCoreTerminations = outgoingTransitions.filter [e|
                (e.typeTermination && (!(e.immediate2) || (e.trigger != null)))
            ]
            val delayedWeakAborts = outgoingTransitions.filter[e|e.typeWeakAbort && !e.immediate2]
            val mixedDelayedStrongAborts = outgoingTransitions.filter[e|e.typeStrongAbort && !e.immediate2].size > 0 &&
                outgoingTransitions.filter[e|!e.typeStrongAbort && e.immediate2].size > 0
            val finalStates = state.regions.filter(ControlflowRegion).filter[e|e.states.filter[ee|ee.final].size > 0].
                size > 0
            val termination = outgoingTransitions.filter[e|e.typeTermination && e.trigger == null].size > 0

            val terminationHandlingNeeded = (notCoreTerminations.size > 0)
            val delayedAbortHandlingNeeded = (delayedWeakAborts.size > 0) || mixedDelayedStrongAborts
            val anyFinalStatesButNoTermination = finalStates && !termination && !state.isRootState
            val needCtrlRegion = terminationHandlingNeeded || delayedAbortHandlingNeeded ||
                anyFinalStatesButNoTermination

            // .. || stateHasUntransformedTransitions : for conditional terminations!
            if (stateHasUntransformedAborts || stateHasUntransformedTransitions) {

                // Only create a control region in the WTO case if there is at least one conditional termination
                // or a delayed termination
                var State doneState
                var State runState
                if (needCtrlRegion) {
                    // Put information for smarter scheduling 
                    // TODO: check, may be superfluous in the future when depth-join is implemented
                    //                    for (region : state.regions) {
                    //                          region.createStringAnnotation(ANNOTATION_IGNORETHREAD, "")
                    //                     }
                    val ctrlRegion = state.createControlflowRegion(GENERATED_PREFIX + "Ctrl").
                        uniqueNameCached(nameCache)
                    runState = ctrlRegion.createInitialState(GENERATED_PREFIX + "Run").uniqueNameCached(nameCache)
                    doneState = ctrlRegion.createFinalState(GENERATED_PREFIX + "Done").uniqueNameCached(nameCache)
                }

                // Build up weak and strong abort triggers
                var Expression strongAbortTrigger = null;
                var Expression strongAbortImmediateTrigger = null;
                // var strongImmediateTrigger = false;
                var Expression weakAbortImmediateTrigger = null;
                for (transition : outgoingTransitions) {
                    transition.setDefaultTrace;
                    if (transition.typeStrongAbort) {
                        if (transition.immediate2) {
                            strongAbortImmediateTrigger = strongAbortImmediateTrigger.or(transition.trigger.copy).trace(
                                transition)
                        } else {
                            if (mixedDelayedStrongAborts) {
                                // strongAbortTrigger = strongAbortTrigger.or(transition.trigger.copy).trace(transition)
                                val transitionTriggerVariable = state.parentRegion.parentState.createVariable(
                                    GENERATED_PREFIX + "trig").setTypeBool.uniqueNameCached(nameCache)
                                state.createEntryAction.addEffect(transitionTriggerVariable.assign(FALSE))
                                transitionTriggerVariableMapping.put(transition, transitionTriggerVariable)
                                strongAbortTrigger = strongAbortTrigger.or(transitionTriggerVariable.reference).trace(
                                    transition)
                            } else {
                                strongAbortTrigger = strongAbortTrigger.or(transition.trigger.copy).trace(transition)
                            }
                        }
                    } else if (transition.typeWeakAbort) {
                        if (transition.immediate2) {
                            weakAbortImmediateTrigger = weakAbortImmediateTrigger.or(transition.trigger.copy).trace(
                                transition)
                        } else {
                            // In case of a delayed weak abort, we need to take care of the delay in
                            // the watcher region and create an auxiliarv variable
                            // Create a new _transitionTrigger valuedObject
                            val transitionTriggerVariable = state.parentRegion.parentState.createVariable(
                                GENERATED_PREFIX + "trig").setTypeBool.uniqueNameCached(nameCache)
                            state.createEntryAction.addEffect(transitionTriggerVariable.assign(FALSE))
                            transitionTriggerVariableMapping.put(transition, transitionTriggerVariable)
                            weakAbortImmediateTrigger = weakAbortImmediateTrigger.or(
                                transitionTriggerVariable.reference).trace(transition)
                        }
                    }
                }

                var Expression terminationTrigger;

                state.outgoingTransitions.setDefaultTrace;
                // For each region encapsulate it into a _Main state and add a _Term variable
                // also to the terminationTrigger
                for (region : regions) {
                    if (terminationHandlingNeeded) {
                        val mainRegion = state.createControlflowRegion(GENERATED_PREFIX + "Main").
                            uniqueNameCached(nameCache)
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

                    // Inside every region create an _Aborted
                    val abortedState = region.retrieveFinalState(GENERATED_PREFIX + "Aborted").
                        uniqueNameCached(nameCache)
                    for (innerState : region.states.filter[!final && type != StateType::CONNECTOR]) {
                        if (innerState != abortedState) {
                            if (strongAbortTrigger != null) {
                                val strongAbort = innerState.createTransitionTo(abortedState, 0)
                                if (innerState.hasInnerStatesOrControlflowRegions || innerState.hasInnerActions) {
                                    strongAbort.setTypeStrongAbort
                                }
                                strongAbort.setPriority(0)
                                strongAbort.setTrigger(strongAbortTrigger.copy)
                                strongAbort.setImmediate(false)
                            }
                            if (strongAbortImmediateTrigger != null) {
                                val strongAbort = innerState.createTransitionTo(abortedState, 0)
                                if (innerState.hasInnerStatesOrControlflowRegions || innerState.hasInnerActions) {
                                    strongAbort.setTypeStrongAbort
                                }
                                strongAbort.setPriority(0)
                                strongAbort.setTrigger(strongAbortImmediateTrigger.copy)
                                strongAbort.setImmediate(true)
                            }
                            if (weakAbortImmediateTrigger != null) {
                                val weakAbort = innerState.createTransitionTo(abortedState)
                                weakAbort.setTrigger(weakAbortImmediateTrigger.copy)
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
                        // (transition.typeTermination && (!(transition.immediate2) || (transition.trigger != null)))
                        // ||
                        // (transition.typeWeakAbort && !transition.immediate2)) {
                        // Create a ctrlTransition in the ctrlRegion
                        val ctrlTransition = runState.createTransitionTo(doneState)
                        ctrlTransition.setLowestPriority
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

//                            if (transition.typeWeakAbort && !transition.immediate2) {
                            // in this case we have to take care of getting the auxiliary variable for the
                            // original delayed weak abort trigger
                            // Get the _transitionTrigger that was created earlier
                            //
                            // Do the following also in case of mixed delayed/immediate STRONG aborts!
                            val transitionTriggerVariable = transitionTriggerVariableMapping.get(transition)
                            if (transitionTriggerVariable != null) {
                                ctrlTransition.addEffect(transitionTriggerVariable.assign(TRUE))
                            }
//                            }
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
                    // if (transition.typeWeakAbort && !transition.immediate2) {
                    val transitionTriggerVariable = transitionTriggerVariableMapping.get(transition)
                    if (transitionTriggerVariable != null) {
                        // This case for delayed termination transitions only
                        transition.setTrigger2(transitionTriggerVariable.reference)
                    } else {
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

        } else {
            // Because we do not have (abortable) internal controlflow, change all strong aborts to be "weak" aborts
            // This can only happen for entry or exit actions inside a state with no further internal behavior
            // because entry and exit actions (at this point) cannot be aborted (TODO: think about additional before and after actions!)
            for (transition : state.outgoingTransitions) {
                if (transition.isTypeStrongAbort) {
                    transition.setTypeWeakAbort
                }
            }
        }

    }











}
