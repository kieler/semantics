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
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import de.cau.cs.kieler.sccharts.features.SCChartsFeature

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsUniqueNameExtensions
import de.cau.cs.kieler.annotations.extensions.UniqueNameCache
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions

/**
 * SCCharts WeakSuspend Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class WeakSuspend extends AbstractExpansionTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::WEAKSUSPEND_ID
    }

    override getName() {
        return SCChartsTransformation::WEAKSUSPEND_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::WEAKSUSPEND_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::DEFERRED_ID, SCChartsFeature::STATIC_ID, SCChartsFeature::DURING_ID,
            SCChartsFeature::COMPLEXFINALSTATE_ID, SCChartsFeature::INITIALIZATION_ID, SCChartsFeature::ENTRY_ID)
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCChartsFeatureGroup::EXPANSION_ID)
    }

    //-------------------------------------------------------------------------

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
    @Inject extension SCChartsUniqueNameExtensions
    
    private val nameCache = new UniqueNameCache

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //-------------------------------------------------------------------------
    //--                     W E A K   S U S P E N D                         --
    //-------------------------------------------------------------------------
    // ...
    def State transform(State rootState) {
        nameCache.clear
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
            val weakSuspendFlag = state.createValuedObject(GENERATED_PREFIX + "wsFlag", createBoolDeclaration).uniqueName(nameCache)
            weakSuspendFlag.setInitialValue(FALSE)
 
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
                val wsState = region.createState(GENERATED_PREFIX + "WS").uniqueName(nameCache)
                val stateBookmark = state.createValuedObject(GENERATED_PREFIX  + region.parentState.name, createIntDeclaration).uniqueName(nameCache)
                // Set the initial value to the (original) initial state
                stateBookmark.setInitialValue(createIntValue(0))
                var counter = 0
                val lastWishDone = state.createValuedObject(GENERATED_PREFIX + "lastWishDone", createBoolDeclaration).uniqueName(nameCache)

                // In each tick reset the lastWish to FALSE
                val resetLastWishDoneduringAction = state.createDuringAction
                resetLastWishDoneduringAction.setImmediate(true)
                resetLastWishDoneduringAction.addAssignment(lastWishDone.createAssignment(FALSE))
                
                // wsState sets lastWishDone to true
                val wsStateEntryAction = wsState.createEntryAction
                wsStateEntryAction.addAssignment(lastWishDone.createRelativeAssignmentWithOr(TRUE))
                
                // Auxiliary initial state for re-entry
                val initState = region.createState(GENERATED_PREFIX + "Init").uniqueName(nameCache)
                initState.setInitial(true)
                val initWSTransition = initState.createTransitionTo(wsState).setImmediate
                initWSTransition.setTrigger(weakSuspendFlag.reference.and(lastWishDone.reference)) 

                for (subState : subStates) {
                    val reEnterTransition = wsState.createImmediateTransitionTo(subState)
                    reEnterTransition.setTrigger(stateBookmark.reference.eq(counter.createIntValue))
                    reEnterTransition.setDeferred(true)
                    
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
            val needAuxTermRegion = ((state.outgoingTransitions.filter[ isTermination ].length > 0 || state.isRootState) && state.regionsMayTerminate)
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
        sccharts => [ rootStates.forEach[ transform ] ]
    }

}
