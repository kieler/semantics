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
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.SuspendAction
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import de.cau.cs.kieler.sccharts.features.SCChartsFeature

import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.kexpressions.ValuedObject

/**
 * SCCharts Suspend Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Suspend extends AbstractExpansionTransformation implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::SUSPEND_ID
    }

    override getName() {
        return SCChartsTransformation::SUSPEND_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::SUSPEND_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::DURING_ID, SCChartsFeature::INITIALIZATION_ID)
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCChartsFeatureGroup::EXPANSION_ID)
    }

    // -------------------------------------------------------------------------
    @Inject
    extension KExpressionsCreateExtensions

    @Inject
    extension KExpressionsComplexCreateExtensions

    @Inject
    extension KExpressionsDeclarationExtensions

    @Inject
    extension KExpressionsValuedObjectExtensions

    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    // -------------------------------------------------------------------------
    // --                          S U S P E N D                              --
    // -------------------------------------------------------------------------
    // @requires: during
    // @run-before: entry (because these are considered here)
    // For a suspend statement of state S create a new top-level region
    // with two states (NotSuspended (initial) and Suspended). Connect them
    // with the suspension trigger.
    // If the trigger is immediate, then connect them immediately and have
    // the transition back be non-immediate. If it is non immediate then
    // have the transition back be immediate.
    // Create an immediate during action of the Suspended state that emits
    // an auxiliaryDisableValuedObject that is added to all outgoing transitions
    // (within the disabledExpression) 
    // Transforming Suspends.
    def State transform(State rootState) {
        val targetRootState = rootState.fixAllPriorities;

        // Traverse all states
        targetRootState.getAllStates.forEach [ targetState |
            targetState.transformSuspend(targetRootState);
        ]
        targetRootState.fixAllTextualOrdersByPriorities;
    }

    def void transformSuspend(State state, State targetRootState) {
        state.setDefaultTrace
        val suspendList = state.suspendActions.filter[!weak].toList.immutableCopy

        if (suspendList.size == 0) {
            // No suspends, exit here
            return
        }

        // One unique suspend flag
        val suspendFlag = state.createValuedObject(GENERATED_PREFIX + "enabled", createBoolDeclaration).uniqueName

        // Do not consider other suspends as actions
        val allInnerActions = state.allContainedActions.filter(e|!(e instanceof SuspendAction))
        for (action : allInnerActions) {
            action.setTrigger(action.trigger.and(suspendFlag.reference))
        }

        // DO THE FOLLOWING ONLY _AFTER_ SUSPENDING ALL INNER ACTIONS!!! WE DO NOT WANT TO SUSPEND THE RESET ACTION!
        // Immediate during action setting suspend flag to (absolute) true in each tick!
        val resetDuringAction = state.createDuringAction
        resetDuringAction.setImmediate(true)
        resetDuringAction.setTrigger(null)
        resetDuringAction.addEffect(suspendFlag.assign(TRUE))

        for (suspension : suspendList) {
            suspension.setDefaultTrace
            val suspendTrigger = suspension.trigger;
            val notSuspendTrigger = not(suspendTrigger)
            val immediateSuspension = suspension.isImmediate;

            // add during action AFTER modifying allInnerActions so that we
            // do not modify our new during action
            val duringAction = state.createDuringAction
            duringAction.setImmediate(immediateSuspension)
            duringAction.setTrigger(null)
            duringAction.addEffect(suspendFlag.assignRelativeAnd(notSuspendTrigger))

            // remove suspend action
            state.localActions.remove(suspension)
        }
    }

    def void transformSuspendOld(State state, State targetRootState) {
        for (suspension : state.suspendActions.filter[!weak].toList.immutableCopy) {
            suspension.setDefaultTrace
            val suspendTrigger = suspension.trigger;
            val notSuspendTrigger = not(suspendTrigger)
            val immediateSuspension = suspension.isImmediate;

            val suspendFlag = state.createValuedObject(GENERATED_PREFIX + "enabled", createBoolDeclaration).uniqueName
            suspendFlag.setInitialValue(TRUE)

            // Do not consider other suspends as actions
            val allInnerActions = state.allContainedActions.filter(e|!(e instanceof SuspendAction))
            for (action : allInnerActions) {
                action.setTrigger(action.trigger.and(suspendFlag.reference))
            }

            // add during action AFTER modifying allInnerActions so that we
            // do not modify our new during action
            val duringAction = state.createDuringAction
            duringAction.setImmediate(immediateSuspension)
            duringAction.setTrigger(null)
            duringAction.addEffect(suspendFlag.assign(notSuspendTrigger))

            // remove suspend action
            state.localActions.remove(suspension)
        }
    }

}
