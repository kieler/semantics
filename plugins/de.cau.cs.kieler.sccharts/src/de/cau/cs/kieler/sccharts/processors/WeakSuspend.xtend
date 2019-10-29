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
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.DeferredType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions

/**
 * SCCharts WeakSuspend Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class WeakSuspend extends SCChartsProcessor implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.weakSuspend"
    }

    override getName() {
        "Weak Suspend"
    }

    override process() {
        setModel(model.transform)
    }

    // -------------------------------------------------------------------------
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsComplexCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsCoreExtensions

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    // -------------------------------------------------------------------------
    // --                     W E A K   S U S P E N D                         --
    // -------------------------------------------------------------------------
    // ...
    def State transform(State rootState) {
        // Traverse all transitions
        for (targetTransition : rootState.getAllStates.toList) {
            targetTransition.transformWeakSuspend(rootState)
        }
        rootState
    }

    def void transformWeakSuspend(State state, State targetRootState) {
        val weakSuspends = state.suspendActions.filter[weak].toList
        weakSuspends.setDefaultTrace

        if (!weakSuspends.nullOrEmpty) {
            val weakSuspendFlag = state.createValuedObject(GENERATED_PREFIX + "wsFlag", createBoolDeclaration).
                uniqueName
            weakSuspendFlag.setInitialValue(FALSE)
            voStore.update(weakSuspendFlag, SCCHARTS_GENERATED)

            for (weakSuspend : weakSuspends.immutableCopy) {
                weakSuspend.setDefaultTrace
                val duringAction = state.createDuringAction
                duringAction.setImmediate(weakSuspend.immediate)
                duringAction.addEffect(weakSuspendFlag.createAssignment(weakSuspend.trigger.copy))
                state.actions.remove(weakSuspend)
            }

            weakSuspends.setDefaultTrace
            for (region : state.allContainedControlflowRegions.toList) {
                val subStates = region.states.immutableCopy
                val wsState = region.createState(GENERATED_PREFIX + "WS").uniqueName
                val stateBookmark = state.createValuedObject(GENERATED_PREFIX + region.parentState.name,
                    createIntDeclaration).uniqueName
                // Set the initial value to the (original) initial state
                stateBookmark.setInitialValue(createIntValue(0))
                voStore.update(stateBookmark, SCCHARTS_GENERATED)

                var counter = 0
                val lastWishDone = state.createValuedObject(GENERATED_PREFIX + "lastWishDone", createBoolDeclaration).
                    uniqueName
                voStore.update(lastWishDone, SCCHARTS_GENERATED)
                // In each tick reset the lastWish to FALSE
                val resetLastWishDoneduringAction = state.createDuringAction
                resetLastWishDoneduringAction.setImmediate(true)
                resetLastWishDoneduringAction.addAssignment(lastWishDone.createAssignment(FALSE))

                // wsState sets lastWishDone to true
                val wsStateEntryAction = wsState.createEntryAction
                wsStateEntryAction.addAssignment(lastWishDone.createRelativeAssignmentWithOr(TRUE))

                // Auxiliary initial state for re-entry
                val initState = region.createState(GENERATED_PREFIX + "Init").uniqueName
                initState.setInitial(true)
                val initWSTransition = initState.createTransitionTo(wsState).setImmediate
                initWSTransition.setTrigger(weakSuspendFlag.reference.and(lastWishDone.reference))

                for (subState : subStates) {

                    if (subState.exitActions.size > 0) {
                        // transform exit actions into immediate outgoing transitions
                        for (t : subState.outgoingTransitions) {
                            val exitState = subState.parentRegion.createState(GENERATED_PREFIX + "_exit").uniqueName
                            for (action : subState.exitActions)
                                exitState.actions.add(action.copy)
                            val exitTransition = exitState.createTerminationTo(t.targetState)
                            exitTransition.history = t.history
                            exitTransition.deferred = t.deferred
                            exitTransition.delay = DelayType::IMMEDIATE
                            exitTransition.preemption = t.preemption
                            while (t.effects.size > 0)
                                exitTransition.addEffect(t.effects.get(0))
                            t.history = HistoryType::RESET
                            t.deferred = DeferredType::NONE
                            t.targetState = exitState
                        }
                        while (subState.exitActions.size > 0)
                            subState.exitActions.get(0).remove
                    }
                    val reEnterTransition = wsState.createImmediateTransitionTo(subState)
                    reEnterTransition.setTrigger(stateBookmark.reference.eq(counter.createIntValue))
                    reEnterTransition.setDeferred(DeferredType::SHALLOW)

                    val entryAction = subState.createEntryAction
                    entryAction.addEffect(stateBookmark.createAssignment(counter.createIntValue))
                    entryAction.setTrigger(not(weakSuspendFlag.reference))
                    counter = counter + 1

                    // Only if not a final state OR a  final state on top-level-scope of WeakSuspend
                    // NEW: || subState.parentRegion.parentState == state            
                    if (!subState.final || subState.parentRegion.parentState == state) {
                        val weakSuspendTransition = subState.createImmediateTransitionTo(wsState)
                        weakSuspendTransition.setTrigger(weakSuspendFlag.reference)
                        weakSuspendTransition.setLowestPriority
                    }

                    // Modify the original initial state
                    if (subState.initial) {
                        subState.setInitial(false)
                        initState.createTransitionTo(subState).setImmediate
                    }
                }
            }

            // NEW:            
            // WS Termination region (IF state can be left by termination!)
            // should only terminate if no WS trigger holds
            // If the state has outgoing terminations, we need to finalize the during
            // actions in case we end the states over these transitions
            val needAuxTermRegion = ((state.outgoingTransitions.filter[isTermination].length > 0 ||
                state.isRootState) && state.regionsMayTerminate)
            if (needAuxTermRegion) {
                val auxTermRegion = state.createControlflowRegion(GENERATED_PREFIX + "wsAuxTermination");
                val noTermS = auxTermRegion.createInitialState(GENERATED_PREFIX + "wsNoTerm");
                val termS = auxTermRegion.createFinalState(GENERATED_PREFIX + "wsTerm");
                val t1 = noTermS.createImmediateTransitionTo(termS);
                val t2 = termS.createTransitionTo(noTermS);
                t1.trigger = not(weakSuspendFlag.reference)
                t2.trigger = weakSuspendFlag.reference
            }

        }
    }

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [rootStates.forEach[transform]]
    }

}
