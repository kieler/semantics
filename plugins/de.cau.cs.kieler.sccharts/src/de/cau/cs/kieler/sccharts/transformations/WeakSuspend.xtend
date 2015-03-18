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
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.sccharts.features.SCChartsFeature
import com.google.common.collect.Sets
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup

/**
 * SCCharts WeakSuspend Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class WeakSuspend extends Transformation {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::WEAKSUSPEND_ID
    }

    override getName() {
        return SCChartsTransformation::WEAKSUSPEND_NAME
    }

    override getHandleFeatureId() {
        return SCChartsFeature::WEAKSUSPEND_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::DEFERRED_ID, SCChartsFeature::STATIC_ID, SCChartsFeature::DURING_ID,
            SCChartsFeature::COMPLEXFINALSTATE_ID, SCChartsFeature::INITIALIZATION_ID, SCChartsFeature::ENTRY_ID)
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet()
    }

    //-------------------------------------------------------------------------
    @Inject
    extension KExpressionsExtension

    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //-------------------------------------------------------------------------
    //--                     W E A K   S U S P E N D                         --
    //-------------------------------------------------------------------------
    // ...
    def State transform(State rootState) {
        var targetRootState = rootState.fixAllPriorities;

        // Traverse all transitions
        for (targetTransition : targetRootState.getAllContainedStates.immutableCopy) {
            targetTransition.transformWeakSuspend(targetRootState);
        }
        targetRootState.fixAllTextualOrdersByPriorities;
    }

    def void transformWeakSuspend(State state, State targetRootState) {

        val weakSuspends = state.suspendActions.filter[weak].toList

        if (!weakSuspends.nullOrEmpty) {
            val weakSuspendFlag = state.createVariable(GENERATED_PREFIX + "weakSuspend").setTypeBool.uniqueName
            weakSuspendFlag.setInitialValue(FALSE)

            for (weakSuspend : weakSuspends.immutableCopy) {
                val duringAction = state.createDuringAction
                duringAction.setImmediate(weakSuspend.immediate)
                duringAction.setTrigger(weakSuspend.trigger.copy)
                duringAction.addEffect(weakSuspendFlag.assign(TRUE))
                state.localActions.remove(weakSuspend)
            }

            for (region : state.allContainedRegions.immutableCopy) {
                val subStates = region.states.immutableCopy
                val wsState = region.createState(GENERATED_PREFIX + "WS").uniqueName
                val stateEnum = state.createVariable(GENERATED_PREFIX + "stateEnum").setTypeInt.uniqueName
                var counter = 0

                for (subState : subStates) {
                    val reEnterTransition = wsState.createImmediateTransitionTo(subState)
                    reEnterTransition.setTrigger(stateEnum.reference.isEqual(counter.createIntValue))
                    reEnterTransition.setDeferred(true)
                    val entryAction = subState.createEntryAction
                    entryAction.addEffect(stateEnum.assign(counter.createIntValue))
                    entryAction.setTrigger(not(weakSuspendFlag.reference))
                    counter = counter + 1
                    val weakSuspendTransition = subState.createImmediateTransitionTo(wsState)
                    weakSuspendTransition.setTrigger(weakSuspendFlag.reference)
                }
            }
        }
    }

}
