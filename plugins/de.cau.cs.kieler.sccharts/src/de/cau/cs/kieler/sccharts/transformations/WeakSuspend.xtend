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
//import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtensionOLD
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.features.SCChartsFeature

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import java.util.ArrayList
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.HistoryType
import java.util.List
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtensionOLD
import de.cau.cs.kieler.sccharts.Scope

/**
 * SCCharts WeakSuspend Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class WeakSuspend extends AbstractExpansionTransformation implements Traceable {

    // HOTFIX DUE TO MODIFICATIONS IN SCCHARTSEXTENSION. THE FOLLOWING CODE SHOULD BE MOVED
    // BACK TO SCCHARTSEXTENSION
    
    def getValuedObjects(Scope scope) {
        <ValuedObject>newLinkedList => [ ll |
            scope.declarations.forEach[d|d.valuedObjects.forEach[ll += it]]
        ]
    }
    
    // Creates a new ValuedObject in a scope.
    def ValuedObject createValuedObject(Scope scope, String valuedObjectName) {
        val valuedObject = createValuedObject(valuedObjectName)
        scope.valuedObjects.add(valuedObject)
        valuedObject
    }
    
    //===========  VARIABLES  ===========
    // Creates a new variable ValuedObject in a Scope.
    def ValuedObject createVariable(Scope scope, String variableName) {
        scope.createValuedObject(variableName)
    }

    //============  SIGNALS  ============
    // Creates a new variable ValuedObject in a Scope.
    def ValuedObject createSignal(Scope scope, String variableName) {
        scope.createValuedObject(variableName).setIsSignal
    }

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
    @Inject
    extension KExpressionsExtensionOLD

//    @Inject
//    extension KExpressionsComplexCreateExtensions
//    
//    @Inject
//    extension KExpressionsDeclarationExtensions    
//    
//    @Inject
//    extension KExpressionsValuedObjectExtensions   

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
        weakSuspends.setDefaultTrace
        
        if (!weakSuspends.nullOrEmpty) {
            val weakSuspendFlag = state.createVariable(GENERATED_PREFIX + "wsFlag").setTypeBool.uniqueName
            weakSuspendFlag.setInitialValue(FALSE)

            for (weakSuspend : weakSuspends.immutableCopy) {
                weakSuspend.setDefaultTrace
                val duringAction = state.createDuringAction
                duringAction.setImmediate(weakSuspend.immediate)
                //duringAction.setTrigger(weakSuspend.trigger.copy)
                //duringAction.addEffect(weakSuspendFlag.assign(TRUE))
                duringAction.addEffect(weakSuspendFlag.assign(weakSuspend.trigger.copy))
                state.localActions.remove(weakSuspend)
            }

            weakSuspends.setDefaultTrace
            for (region : state.allContainedControlflowRegions.immutableCopy) {
                val subStates = region.states.immutableCopy
                val wsState = region.createState(GENERATED_PREFIX + "WS").uniqueName
                val stateBookmark = state.createVariable(GENERATED_PREFIX  + region.parentState.id).setTypeInt.uniqueName
                // Set the initial value to the (original) initial state
                stateBookmark.setInitialValue(createIntValue(0))
                var counter = 0
                val lastWishDone = state.createVariable(GENERATED_PREFIX + "lastWishDone").setTypeBool.uniqueName

                // In each tick reset the lastWish to FALSE
                val resetLastWishDoneduringAction = state.createDuringAction
                resetLastWishDoneduringAction.setImmediate(true)
                resetLastWishDoneduringAction.addAssignment(lastWishDone.assign(FALSE))
                
                // wsState sets lastWishDone to true
                val wsStateEntryAction = wsState.createEntryAction
                wsStateEntryAction.addAssignment(lastWishDone.assignRelative(TRUE))
                
                // Auxiliary initial state for re-entry
                val initState = region.createState(GENERATED_PREFIX + "Init").uniqueName
                initState.setInitial(true)
                val initWSTransition = initState.createTransitionTo(wsState).setImmediate
                initWSTransition.setTrigger(weakSuspendFlag.reference.and(lastWishDone.reference)) 

                for (subState : subStates) {
                    val reEnterTransition = wsState.createImmediateTransitionTo(subState)
                    reEnterTransition.setTrigger(stateBookmark.reference.isEqual(counter.createIntValue))
                    reEnterTransition.setDeferred(true)
                    
                    val entryAction = subState.createEntryAction
                    entryAction.addEffect(stateBookmark.assign(counter.createIntValue))
                    entryAction.setTrigger(not(weakSuspendFlag.reference))
                    counter = counter + 1
        
                    // Only if not a final state            
                    if (!subState.final) {
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
        }
    }



    def void transformWeakSuspendOld(State state, State targetRootState) {

        val weakSuspends = state.suspendActions.filter[weak].toList
        weakSuspends.setDefaultTrace
        
        if (!weakSuspends.nullOrEmpty) {
            val weakSuspendFlag = state.createVariable(GENERATED_PREFIX + "weakSuspend").setTypeBool.uniqueName
            weakSuspendFlag.setInitialValue(FALSE)

            for (weakSuspend : weakSuspends.immutableCopy) {
                weakSuspend.setDefaultTrace
                val duringAction = state.createDuringAction
                duringAction.setImmediate(weakSuspend.immediate)
                //duringAction.setTrigger(weakSuspend.trigger.copy)
                //duringAction.addEffect(weakSuspendFlag.assign(TRUE))
                duringAction.addEffect(weakSuspendFlag.assign(weakSuspend.trigger.copy))
                state.localActions.remove(weakSuspend)
            }

            weakSuspends.setDefaultTrace
            for (region : state.allContainedControlflowRegions.immutableCopy) {
                val subStates = region.states.immutableCopy
                val wsState = region.createState(GENERATED_PREFIX + "WS").uniqueName
                val stateBookmark = state.createVariable(GENERATED_PREFIX  + state.id).setTypeInt.uniqueName
                var counter = 0 

                for (subState : subStates) {
                    val reEnterTransition = wsState.createImmediateTransitionTo(subState)
                    reEnterTransition.setTrigger(stateBookmark.reference.isEqual(counter.createIntValue))
                    reEnterTransition.setDeferred(true)
                    val entryAction = subState.createEntryAction
                    entryAction.addEffect(stateBookmark.assign(counter.createIntValue))
                    entryAction.setTrigger(not(weakSuspendFlag.reference))
                    counter = counter + 1
                    val weakSuspendTransition = subState.createImmediateTransitionTo(wsState)
                    weakSuspendTransition.setTrigger(weakSuspendFlag.reference)
                }
            }
        }
    }

}
