/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.extensions

import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import java.util.List
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.annotations.extensions.UniqueNameExtensions
import de.cau.cs.kieler.annotations.extensions.UniqueNameCache

import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import java.util.ArrayList
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.Scope

/**
 * @author ssm
 * @kieler.design 2017-06-28 proposed 
 * @kieler.rating 2017-06-28 proposed yellow 
 *
 */
class SCChartsFixExtensions {

    @Inject extension UniqueNameExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsActionExtensions
    
    private def uniqueName(State scope, UniqueNameCache nameCache) { scope }

    //-------------------------------------------------------------------------
    //--  F I X   F O R   T E R M I N A T I O N S   / W    E F F E C T S     --
    //-------------------------------------------------------------------------
    // This fixes termination transitions that have effects
    def State fixTerminationWithEffects(State rootState, List<Transition> transitionList, UniqueNameCache nameCache) {
        val terminationTransitions = transitionList.filter[preemption == PreemptionType::TERMINATION].filter[
            !effects.nullOrEmpty].toList

        for (terminationTransition : terminationTransitions) {
            val originalSource = terminationTransition.sourceState
            val originalTarget = terminationTransition.targetState
            val region = originalSource.parentRegion
            val auxiliaryState = region.createState("_TE").uniqueName(nameCache).trace(terminationTransition)
            val auxliiaryTransition = auxiliaryState.createImmediateTransitionTo(originalTarget).trace(
                terminationTransition)
            for (effect : terminationTransition.effects.immutableCopy) {
                auxliiaryTransition.addEffect(effect)
            }
            terminationTransition.setTargetState(auxiliaryState)
        }
        rootState
    }

    //-------------------------------------------------------------------------
    //--                F I X   F O R   H A L T   S T A T E S                --
    //-------------------------------------------------------------------------
    // This fixes halt states and adds an explicit delayed self transition
    def State fixPossibleHaltStates(State rootState, List<State> stateList) {
        val haltStates = stateList.filter[
            !controlflowRegionsContainStates && outgoingTransitions.nullOrEmpty && !final]

        for (haltState : haltStates) {
            haltState.createTransitionTo(haltState).trace(haltState)
        }
        rootState
    }

    //-------------------------------------------------------------------------
    //--                F I X   F O R   D E A D    C O D E                   --
    //-------------------------------------------------------------------------
    // This fixes halt states and adds an explicit delayed self transition
    def State fixDeadCode(State rootState) {
        for (nonReachabledState : rootState.allContainedStates.filter[! isStateReachable ].toList.immutableCopy) {
            val parentRegion = (nonReachabledState.eContainer as ControlflowRegion)
            parentRegion.states.remove(nonReachabledState)
        }
        rootState
    }

    def boolean isStateReachable(State originalState) {

        // Must ensure not to loop forever when having cycles in the model
        val visited = new ArrayList<State>()
        isStateReachable(originalState, originalState, visited)
    }

    def boolean isStateReachable(State originalState, State state, List<State> visited) {
        if (visited.contains(state) || state == null) {
            return false
        }
        visited.add(state);
        if (originalState.parentRegion == null) {

            // Root states ARE reachable
            return true
        }
        if (state.isInitial()) {
            return true
        } else {
            for (Transition transition : state.getIncomingTransitions()) {
                if (isStateReachable(originalState, transition.getSourceState(), visited)) {
                    return true
                }
            }
        }
        return false
    }
    
    
    //-------------------------------------------------------------------------
    //--               L O C A L   V A L U E D O B J E C T S                 --
    //-------------------------------------------------------------------------
    def State transformLocalValuedObject(State rootState, List<State> stateList, UniqueNameCache nameCache) {

        // Traverse all states
        for (targetState : stateList) {
            targetState.transformExposeLocalValuedObject(rootState, false, nameCache);
        }
        rootState;
    }

    // Traverse all states and transform possible local valuedObjects.
    def void transformExposeLocalValuedObject(State state, State targetRootState, boolean expose, UniqueNameCache nameCache) {

        // EXPOSE LOCAL SIGNALS: For every local valuedObject create a global valuedObject
        // and wherever the local valuedObject is emitted, also emit the new global 
        // valuedObject.
        // Name the new global valuedObjects according to the local valuedObject's hierarchy. 
        // Exclude the top level state
        if (state == targetRootState) {
            for(valuedObject : state.valuedObjects.filter[!isInput && !isOutput].toList.immutableCopy) {
                valuedObject.variableDeclaration.output = true
            }
            return;
        }
        
        val declarations = state.variableDeclarations
        val hierarchicalStateName = state.getHierarchicalName("LOCAL");
        for(declaration : declarations.immutableCopy) {
            targetRootState.declarations += declaration
            if (expose) declaration.output = true
            for(valuedObject : declaration.valuedObjects.immutableCopy) {
                if (expose) {
                    valuedObject.name = hierarchicalStateName + "_" + valuedObject.name
                } else {
                    valuedObject.uniqueName(nameCache)
                }
            }
        }

    }

    def void transformLocalValuedObjectCached(List<Scope> scopeList, Scope targetScope, UniqueNameCache nameCache) {

        // Traverse all states
        for (scope : scopeList) {
            scope.transformExposeLocalValuedObjectCached(targetScope, false, nameCache);
        }
    }

    // Traverse all states and transform possible local valuedObjects.
    def void transformExposeLocalValuedObjectCached(Scope scope, Scope targetScope, boolean expose,
        UniqueNameCache nameCache) {

        // EXPOSE LOCAL SIGNALS: For every local valuedObject create a global valuedObject
        // and wherever the local valuedObject is emitted, also emit the new global 
        // valuedObject.
        // Name the new global valuedObjects according to the local valuedObject's hierarchy. 
        // Exclude the top level state
        if (scope == targetScope) {
            return;
        }

        var hierarchicalScopeName = targetScope.getHierarchicalName("local")
        val declarations = scope.variableDeclarations
        for(declaration : declarations) {
            targetScope.declarations.add(declaration)
            if (expose) declaration.output = true
            for(valuedObject : declaration.valuedObjects) {
                valuedObject.name = ("_" + hierarchicalScopeName + "_" + valuedObject.name)
                valuedObject.uniqueName(nameCache)
            }
        }
    }
    
    
}