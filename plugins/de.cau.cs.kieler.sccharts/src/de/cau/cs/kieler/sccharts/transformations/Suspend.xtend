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
import de.cau.cs.kieler.sccharts.SuspendAction
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension

import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
/**
 * SCCharts Suspend Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Suspend {

    @Inject
    extension KExpressionsExtension

    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //-------------------------------------------------------------------------
    //--                          S U S P E N D                              --
    //-------------------------------------------------------------------------
    //@requires: during
    //@run-before: entry (because these are considered here)
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
        targetRootState.getAllStates.forEach[ targetState |
            targetState.transformSuspend(targetRootState);
        ]
        targetRootState.fixAllTextualOrdersByPriorities;
    }

    def void transformSuspend(State state, State targetRootState) {
        for (suspension : state.suspendActions.filter[!weak].toList.immutableCopy) {
            suspension.setDefaultTrace
            val suspendTrigger = suspension.trigger;
            val notSuspendTrigger = not(suspendTrigger)
            val immediateSuspension = suspension.isImmediate;

            val suspendFlag = state.createVariable(GENERATED_PREFIX + "enabled").setTypeBool.uniqueName
            suspendFlag.setInitialValue(TRUE)

            // Do not consider other suspends as actions
            val allInnerActions = state.allContainedActions.filter(e|!(e instanceof SuspendAction))
            for (action : allInnerActions) {
                action.setTrigger(action.trigger.and2(suspendFlag.reference))
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
