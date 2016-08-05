/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import java.util.HashMap

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransformationExtension
import de.cau.cs.kieler.sccharts.SCCharts

/**
 * SCCharts Abort WTO Transformation. This may require an advanced SCG compiler that can handle depth join.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class AbortWTODeep extends AbstractExpansionTransformation {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")

    //        return SCChartsTransformation::ABORTWTO_ID;
    }

    override getName() {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")

    //        return SCChartsTransformation::ABORTWTO_NAME;
    }

    override getExpandsFeatureId() {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")

    //        return SCChartsFeature::ABORT_ID;
    }

    override getProducesFeatureIds() {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")

    //        return Sets.newHashSet(SCChartsFeature::INITIALIZATION_ID, SCChartsFeature::ENTRYACTION_ID,
    //            SCChartsFeature::CONNECTOR_ID);
    }

    override getNotHandlesFeatureIds() {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")

    //        return Sets.newHashSet(SCChartsFeature::COUNTDELAY_ID, SCChartsFeature::COMPLEXFINALSTATE_ID);
    }

    //-------------------------------------------------------------------------
    //-------------------------------------------------------------------------
    @Inject
    extension KExpressionsCreateExtensions

    @Inject
    extension KExpressionsComplexCreateExtensions
    
    @Inject
    extension KExpressionsDeclarationExtensions    
    
//    @Inject
//    extension KExpressionsValuedObjectExtensions   

    @Inject
    extension SCChartsExtension
    
    @Inject
    extension SCChartsTransformationExtension
    

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //private val nameCache = <String>newArrayList("_term")

    //-------------------------------------------------------------------------
    //--     A B O R T     S P E C I A L      T R A N S F O R M A T I O N    --
    //-------------------------------------------------------------------------
    // Previously the ABORT DEFAULT transformation, will not work in
    // all cases. It tries to replace DEEP the abort trigger, this may fail
    // if there are weak&strong aborts mixed inside. for abro it works.
    // Transforming Aborts.
    def State transform(State rootState) {
        val targetRootState = rootState.fixAllPriorities;

        // Traverse all states
        var done = false;
        for (targetState : targetRootState.getAllContainedStatesList) {
            if (!done) {
                targetState.transformAbortSpecial(targetRootState);
            }

        //done = true;
        }
        targetRootState.fixAllTextualOrdersByPriorities;
    }

    // Traverse all states 
    //    def void preTransformAborts2(State state, Region targetRootState) {
    //        // For all normal hierarchical states, add a single connector
    //        // add
    //    }
    def void transformAbortSpecial(State state, State targetRootState) {

        // this for example could be several terminations, in this case we do not need the FULL abort transformation
        // and can only combine the terminations (using one termination and a connector node)
        val stateHasUntransformedTransitions = ((state.outgoingTransitions.size > 1) || ( (state.outgoingTransitions.
            size == 1) && ((!(state.outgoingTransitions.filter[typeTermination].filter[trigger == null].size == 1))
//                  ||
//                  !state.hasInnerActions && !state.hasInnerStatesOrRegions 
              ))
            )

        // in this case we need the FULL abort transformation
        val stateHasUntransformedAborts = (!(state.outgoingTransitions.filter[!typeTermination].nullOrEmpty))

        //        if (state.hierarchical && stateHasUntransformedAborts && state.label != "WaitAandB") {
        if ((state.hasInnerStatesOrControlflowRegions || state.hasInnerActions) && stateHasUntransformedTransitions) { // && state.label != "WaitAB") {
            val transitionTriggerVariableMapping = new HashMap<Transition, ValuedObject>

            // Remember all outgoing transitions and regions (important: do not consider regions without inner states! => regions2)
            val outgoingTransitions = state.outgoingTransitions.immutableCopy
            val regions = state.controlflowRegions2.toList.immutableCopy

            // .. || stateHasUntransformedTransitions : for conditional terminations!
            if (stateHasUntransformedAborts || stateHasUntransformedTransitions) {
                val ctrlRegion = state.createControlflowRegion(GENERATED_PREFIX + "Ctrl").uniqueName
                val runState = ctrlRegion.createInitialState(GENERATED_PREFIX + "Run").uniqueName
                val doneState = ctrlRegion.createFinalState(GENERATED_PREFIX + "Done").uniqueName

                // Build up weak and strong abort triggers
                var Expression strongAbortTrigger = null;
                var Expression weakAbortTrigger = null;
                for (transition : outgoingTransitions) {

                    // Create a new _transitionTrigger valuedObject
                    val transitionTriggerVariable = state.parentRegion.parentState.createVariable(
                        GENERATED_PREFIX + "trig").setTypeBool.uniqueName
                    state.createEntryAction.addEffect(transitionTriggerVariable.assign(FALSE))
                    transitionTriggerVariableMapping.put(transition, transitionTriggerVariable)
                    if (transition.typeStrongAbort) {
                        strongAbortTrigger = strongAbortTrigger.or(transitionTriggerVariable.reference)
                    } else if (transition.typeWeakAbort) {
                        weakAbortTrigger = weakAbortTrigger.or(transitionTriggerVariable.reference)
                    }
                }

                var Expression terminationTrigger;

                // Decides whether a _TERM signal and the necessary _Run, _Done state is needed
                // OPTIMIZATION
                val terminationHandlingNeeded = !outgoingTransitions.filter[typeTermination].nullOrEmpty

                // For each region encapsulate it into a _Main state and add a _Term variable
                // also to the terminationTrigger
                for (region : regions) {
                    if (terminationHandlingNeeded) {
                        val mainRegion = state.createControlflowRegion(GENERATED_PREFIX + "Main").uniqueName
                        val mainState = mainRegion.createInitialState(GENERATED_PREFIX + "Main").uniqueName
                        mainState.regions.add(region)
                        val termState = mainRegion.createFinalState(GENERATED_PREFIX + "Term").uniqueName
                        val termVariable = state.createVariable(GENERATED_PREFIX + "term").setTypeBool.uniqueName
                        mainState.createTransitionTo(termState).addEffect(termVariable.assign(TRUE)).setTypeTermination
                        if (terminationTrigger != null) {
                            terminationTrigger = terminationTrigger.and(termVariable.reference)
                        } else {
                            terminationTrigger = termVariable.reference
                        }
                        state.createEntryAction.addEffect(termVariable.assign(FALSE))
                    }

                    // Inside every region create a _Aborted
                    val abortedState = region.retrieveFinalState(GENERATED_PREFIX + "Aborted").uniqueName
                    for (innerState : region.states.filter[!final]) {
                        if (innerState != abortedState) {
                            if (strongAbortTrigger != null) {
                                val strongAbort = innerState.createTransitionTo(abortedState, 0)
                                if (innerState.hasInnerStatesOrControlflowRegions || innerState.hasInnerActions) {

                                    // HERE DIFFERENCE TO ABORT1()
                                    // We dig deep in the hierarchy and connect all states with immediate transitions
                                    // to a final state.
                                    // This leads to more transitions but avoids more variables.
                                    strongAbort.setTypeTermination
                                    val allInnerSimpleStates = innerState.allContainedStatesList.filter[
                                        !(hasInnerStatesOrControlflowRegions || hasInnerActions)].filter[!final]
                                    for (innerSimpleState : allInnerSimpleStates) {
                                        val innerFinalStates = innerSimpleState.parentRegion.states.filter[final]
                                        var State innerAbortedState;
                                        if (innerFinalStates.nullOrEmpty) {
                                            innerAbortedState = innerSimpleState.parentRegion.
                                                createFinalState(GENERATED_PREFIX + "Aborted").uniqueName
                                        } else {
                                            innerAbortedState = innerFinalStates.get(0)
                                        }
                                        val innerStrongAbort = innerSimpleState.createTransitionTo(innerAbortedState, 0)
                                        innerStrongAbort.setPriority(0)
                                        innerStrongAbort.setTrigger(strongAbortTrigger.copy)
                                    }

                                // END OF DIFFERENCE
                                }
                                strongAbort.setPriority(0)
                                strongAbort.setTrigger(strongAbortTrigger.copy)
                            }
                            if (weakAbortTrigger != null) {

                                // The following line is responsible for KISEMA 925 to fail                                 
                                //                                val weakAbort = innerState.createTransitionTo(abortedState) 
                                val weakAbort = innerState.createTransitionTo(abortedState, 0)
                                weakAbort.setTrigger(weakAbortTrigger.copy)
                            }
                        }
                    }
                }

                if (terminationTrigger == null) {
                    terminationTrigger = TRUE;
                }

                for (transition : outgoingTransitions) {

                    // Get the _transitionTrigger that was created earlier
                    val transitionTriggerVariable = transitionTriggerVariableMapping.get(transition)

                    // Create a ctrlTransition in the ctrlRegion
                    val ctrlTransition = runState.createTransitionTo(doneState)
                    if (transition.typeTermination) {
                        if (transition.trigger != null) {
                            ctrlTransition.setTrigger(terminationTrigger.copy.and(transition.trigger))
                        } else {
                            ctrlTransition.setTrigger(terminationTrigger.copy)
                        }
                    } else {
                        ctrlTransition.setTrigger(transition.trigger)
                    }

                    // ATTENTION: Test for ctrlTransition.immediate2 because transition's trigger has already been moved to ctrlTransition!!!
                    ctrlTransition.setImmediate(transition.immediate)
                    if (ctrlTransition.immediate2) {
                        ctrlTransition.setImmediate(true)
                    }
                    ctrlTransition.addEffect(transitionTriggerVariable.assign(TRUE))
                }

            }

            // Create a single outgoing normal termination to a new connector state
            val outgoingConnectorState = state.parentRegion.createState(GENERATED_PREFIX + "C").uniqueName.
                setTypeConnector
            state.createTransitionTo(outgoingConnectorState).setTypeTermination

            for (transition : outgoingTransitions) {

                // Modify the outgoing transition
                transition.setSourceState(outgoingConnectorState)

                // Get the _transitionTrigger that was created earlier
                val transitionTriggerVariable = transitionTriggerVariableMapping.get(transition)
                if (transitionTriggerVariable != null) {
                    transition.setTrigger2(transitionTriggerVariable.reference)
                } else {

                    // Fall back to this case when we did not create a trigger variable
                    // because there where NO strong or weak aborts but one or more triggered
                    // normal termination transitions.
                    transition.setTrigger2(transition.trigger)
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
                state.outgoingTransitions.remove(transitionToDelete)
                state.outgoingTransitions.add(transition)
                state.parentRegion.states.remove(outgoingConnectorState)
            }

        }
    }

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }

}
