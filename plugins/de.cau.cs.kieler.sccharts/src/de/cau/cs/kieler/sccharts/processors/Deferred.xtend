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
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DeferredType
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*

/**
 * @author kolja
 * @author als
 * 
 */
class Deferred extends SCChartsProcessor implements Traceable {
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.deferred"
    }

    override getName() {
        "Deferred"
    }

    override process() {
        setModel(model.transform)
    }

    // -------------------------------------------------------------------------
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExpressionsComplexCreateExtensions
    @Inject extension AnnotationsExtensions

    // This prefix is used for naming of all generated signals, states and regions
    public static val GENERATED_PREFIX = "_deferred_"
    public static val DO_NOT_DEFER = "DoNotDefer"

    // ------------------------------------------------------------------------
    // --             D E F E R R E D    T R A N S I T I O N                 --
    // ------------------------------------------------------------------------
    // A quite complex transformation
    def State transform(State state) {
        // It is important, that deferred transition inside of sub states are transformed first
        // because maybe the result state needs to be copied
        for (s : state.allContainedStates.toList) {
            s.transform
        }
        // check if the state has incoming deferred transitions that needs to be transformed
        if (state.needTransform) {
            if (state.isSimpleDelayTransformable) { // check if a simple delay transformation is possible
                state.transformSimpleDelay // add a delayed entry
            } else if (state.isSimpleGuardTransformable) { // check if a simple guard transformation is possible
                state.transformSimpleGuard // add a deferred guard variable
            } else {
                state.transformComplex // copy the target state of the deferred transition
            }
            if (environment.inDeveloperMode) snapshot
        } else {
            // Remove deferred if no transformation is necessary
            for (t : state.incomingTransitions) {
                if (t.deferred != DeferredType::NONE) {
                    t.deferred = DeferredType::NONE
                }
            }
        }
        // when transforming a deferred transition in some cases new deferred transitions where generated 
        // (before the initial states of the child regions of a target state of a deferred transition) 
        for (s : state.allContainedStates.toList) {
            s.transform
        }
        state
    }

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [rootStates.forEach[transform]]
    }

    def hasShallowDeferred(State s) {
        for (t : s.incomingTransitions) {
            if (t.deferred == DeferredType::SHALLOW) {
                return true
            }
        }
        return false;
    }

    def hasDeepDeferred(State s) {
        for (t : s.incomingTransitions) {
            if (t.deferred == DeferredType::DEEP) {
                return true
            }
        }
        return false;
    }

    // make one copy of the state s for all shallow deferred transitions with s as target state
    //  all outgoing transitions of the copy are made delayed
    // and make one copy of the state s for all deep deferred transitions with s as target state
    //  all outgoing transitions of the copy are made delayed,
    //  entry actions are removed from the copy
    //  immediate during actions are made delayed
    //  for each sub region with instantaneous behavior create a new initial state and make a immediate deep deferred transition from this state to the original initial state
    def transformComplex(State s) {
        s.makeVariablesPublic(s.parentRegion)
        // shallow deferred
        if (s.hasShallowDeferred) {
            val shallow = s.copy // copy the whole state
            // the incoming and outgoing transitions are copied wrong so they need to be corrected
            shallow.incomingTransitions.clear
            shallow.outgoingTransitions.clear
            shallow.name = GENERATED_PREFIX + s.name
            s.parentRegion.states.add(shallow)
            // shallow needs the same outgoing transitions like s, but all of them should be delayed
            for (outTransition : s.outgoingTransitions) {
                var nT = outTransition.copy
                nT.sourceState = shallow
                nT.targetState = outTransition.targetState
                nT.delay = DelayType.DELAYED
                shallow.outgoingTransitions.add(nT)
            }
            // shallow has all the deferred transitions with target state s as incoming non deferred transitions
            val inTransitions = s.incomingTransitions.clone;
            for (inTransition : inTransitions) {
                if (inTransition.deferred == DeferredType::SHALLOW) {
                    inTransition.deferred = DeferredType::NONE
                    inTransition.targetState = shallow
                }
            }
            // remove all entry actions of the copy for deep deferred transitions
            shallow.entryActions.filter[!hasAnnotation(DO_NOT_DEFER)].toList.forEach[remove]
            // each immediate during action in _S will be set to delayed
            for (during : shallow.duringActions) {
                during.delay = DelayType.DELAYED
            }
            
            // Clean up
            if (!s.initial && s.incomingTransitions.empty) {
                s.remove
            }
        }
        // deep deferred
        if (s.hasDeepDeferred) {
            val deep = s.copy
            deep.incomingTransitions.clear
            deep.outgoingTransitions.clear
            deep.name = GENERATED_PREFIX + s.name
            s.parentRegion.states.add(deep)
            // deep needs the same outgoing transitions like s, but all of them should be delayed
            for (outTransition : s.outgoingTransitions) {
                var nT = outTransition.copy
                nT.sourceState = deep
                nT.targetState = outTransition.targetState
                nT.delay = DelayType.DELAYED
                deep.outgoingTransitions.add(nT)
            }
            // deep has all the deferred transitions with target state s as incoming non deferred transitions
            val inTransitions = s.incomingTransitions.clone;
            for (inTransition : inTransitions) {
                if (inTransition.deferred == DeferredType::DEEP) {
                    inTransition.deferred = DeferredType::NONE
                    inTransition.targetState = deep
                }
            }
            // remove all entry actions of the copy for deep deferred transitions
            deep.entryActions.filter[!hasAnnotation(DO_NOT_DEFER)].toList.forEach[remove]
            // each immediate during action in _S will be set to delayed
            for (during : deep.duringActions) {
                during.delay = DelayType.DELAYED
            }
            // if deep has sub regions with immediate behavior of the initial state,
            // then create a new initial state with a immediate deferred transition to the old initial state and transform it later
            for (subRegion : deep.allContainedControlflowRegions.toList) {
                if (subRegion.states.size > 0) {
                    for (state : subRegion.states.filter[it.initial].toList) {
                        if (state.hasInstantaneousBehavior(true)) {
                            val newState = state.parentRegion.createState(GENERATED_PREFIX + state.name)
                            newState.initial = true
                            state.initial = false
                            val trans = newState.createTransitionTo(state)
                            trans.delay = DelayType.IMMEDIATE
                            trans.deferred = DeferredType::DEEP
                        }
                    }
                }
            }
            
            // Clean up
            if (!s.initial && s.incomingTransitions.empty) {
                s.remove
            }
        }
    }

    // check if a state has instantaneous behavior 
    // if deep is true, then inner instantaneous behavior is also checked
    private def boolean hasInstantaneousBehavior(State s, boolean deep) {
        for (t : s.outgoingTransitions) {
            if (t.delay == DelayType.IMMEDIATE) {
                return true
            }
        }
        if (!s.entryActions.filter[!hasAnnotation(DO_NOT_DEFER)].empty) {
            return true
        }
        for (a : s.duringActions) {
            if (a.delay == DelayType.IMMEDIATE) {
                return true
            }
        }
        if (deep) {
            for (subRegion : s.allContainedControlflowRegions.toList) {
                if (subRegion.states.size > 0) {
                    for (state : subRegion.states.filter[it.initial].toList) {
                        if (state.hasInstantaneousBehavior(deep)) {
                            return true
                        }
                    }
                }
            }
        }
        return false
    }

    // checks if a state has a incoming deferred transition which needs to be transformed
    private def needTransform(State s) {
        for (t : s.incomingTransitions) {
            if (t.deferred != DeferredType::NONE) {
                if (s.hasInstantaneousBehavior(t.deferred == DeferredType::DEEP)) {
                    return true
                }
            }
        }
        return false
    }
    
    // makes all variables defined inside of a state and its sub regions and sub states visible in the parent region
    private def void makeVariablesPublic(State s, ControlflowRegion parent) {
        while (s.declarations.size > 0) {
            var d = s.declarations.get(0);
            parent.declarations.add(d)
            for (o : d.valuedObjects) {
                o.uniqueName;
            }
        }
        for (subState : s.allContainedStates.toList) {
            subState.makeVariablesPublic(parent)
        }
        for (region : s.allContainedDataflowRegions.toList) {
            while (region.declarations.size > 0) {
                var d = region.declarations.get(0);
                parent.declarations.add(d)
                for (o : d.valuedObjects) {
                    o.uniqueName;
                }
            }
        }
        for (region : s.allContainedControlflowRegions.toList) {
            while (region.declarations.size > 0) {
                var d = region.declarations.get(0);
                parent.declarations.add(d)
                for (o : d.valuedObjects) {
                    o.uniqueName;
                }
            }
        }
    }

    // checks if a transition is part of an immediate loop
    private def findImmediateLoop(Transition t, boolean canBeDelayed) {
        val visited = new LinkedList<Transition>
        val next = new LinkedList<Transition>
        next.add(t)
        while (next.size > 0) {
            val n = next.pop
            visited.add(n)
            for (transition : n.targetState.outgoingTransitions) {
                if (canBeDelayed && transition == t) return true // In this case an immediate loop is detected even it t is not immediate
                if (transition.delay == DelayType.IMMEDIATE) {
                    if (transition == t) return true
                    if (!visited.contains(transition) && !next.contains(transition)) {
                        next.add(transition)
                    }
                }
            }
        }
        return false
    }

    // the simple guard transformation can only handle shallow deferred transition which are not part of an immediate loop
    // checks if all incoming deferred transitions of a state are simple transformable 
    private def isSimpleGuardTransformable(State s) {
        var hasDeepDeferred = false
        for (t : s.incomingTransitions) {
            if (t.deferred == DeferredType::DEEP) {
                hasDeepDeferred = true;
            }
            if (t.deferred != DeferredType::NONE && t.findImmediateLoop(false)) {
                return false
            }
        }
        if (hasDeepDeferred) {
            for (subRegion : s.allContainedControlflowRegions.toList) {
                if (subRegion.states.size > 0) {
                    for (state : subRegion.states.filter[it.initial].toList) {
                        if (state.outgoingTransitions.filter[it.immediate].exists[it.findImmediateLoop(false)]) {
                            return false
                        }
                    }
                }
            }
        }
        return true
    }

    // add a guard variable to all outgoing transition which ensures that they can not be taken in the first tick when entered over a deferred transition
    // this function can only be used if there are no deep deferred transitions with s as target state
    private def transformSimpleGuard(State state) {
        val incomingShallowDeferredTransitions = state.incomingTransitions.filter[deferred == DeferredType::SHALLOW].toList;
        val incomingDeepDeferredTransitions = state.incomingTransitions.filter[deferred == DeferredType::DEEP].toList;
        val incomingNonDeferredTransitions = state.incomingTransitions.filter[deferred == DeferredType::NONE].toList;

        if (isTracingActive) {
            val List<EObject> sources = newLinkedList()
            sources.addAll(incomingShallowDeferredTransitions)
            sources.addAll(incomingDeepDeferredTransitions)
            sources.add(state)
            sources.setDefaultTrace
        }
        
        var shallowDeferVariable = createValuedObject(GENERATED_PREFIX + "shallow")
        var deepDeferVariable = createValuedObject(GENERATED_PREFIX+"deep")
        var used = newHashSet()
        
        // Collect states to transform
        val handleBehavior = newArrayList(state)
        if (!incomingDeepDeferredTransitions.empty) { // deep
            var i = 0
            while (i < handleBehavior.size) {
                val s = handleBehavior.get(i)
                handleBehavior.addAll(s.initialStates)
                i++
            }
        }
        
        for (s : handleBehavior) {
            val deferVariable = if (s == state) {
                shallowDeferVariable
            } else {
                deepDeferVariable
            }
            
            // Only do this for outgoing immediate transitions!
            for (transition : s.outgoingTransitions) {
                if (transition.immediate) {
                    if (transition.trigger === null) {
                        val deferTest = not(deferVariable.reference)
                        transition.setTrigger(deferTest)
                    } else {
                        val deferTest = not(deferVariable.reference)
                        transition.setTrigger(deferTest.and(transition.trigger.copy))
                    }
                    used += deferVariable
                }
            }
            // add guard to all entry actions of the state
            for (a : s.entryActions.filter[!hasAnnotation(DO_NOT_DEFER)]){
                if (a.trigger === null) {
                    val deferTest = not(deferVariable.reference)
                    a.setTrigger(deferTest)
                } else {
                    val deferTest = not(deferVariable.reference)
                    a.setTrigger(deferTest.and(a.trigger.copy))
                }
                used += deferVariable
            }
            // add guard to immediate during action of the state
            for (a : s.duringActions.filter[it.delay == DelayType.IMMEDIATE]){
                if (a.trigger === null) {
                    val deferTest = not(deferVariable.reference)
                    a.setTrigger(deferTest)
                } else {
                    val deferTest = not(deferVariable.reference)
                    a.setTrigger(deferTest.and(a.trigger.copy))
                }
                used += deferVariable
            }
        }
        
        // Add a new deferVariable to the outer state, set it initially to FALSE and
        // add a during action in the state to reset it to FALSE
        val decl = createBoolDeclaration()
        if (used.contains(shallowDeferVariable)) {
            shallowDeferVariable.uniqueName
            decl.valuedObjects += shallowDeferVariable
            state.parentRegion.parentState.declarations.add(decl)
            voStore.update(shallowDeferVariable, SCCHARTS_GENERATED)
            shallowDeferVariable.setInitialValue(FALSE)
            var resetDeferSignalAction = state.createDuringAction
            resetDeferSignalAction.addEffect(shallowDeferVariable.createAssignment(FALSE))
        } else {
            shallowDeferVariable = null
        }
        if (used.contains(deepDeferVariable)) {
            deepDeferVariable.uniqueName
            decl.valuedObjects += deepDeferVariable
            state.parentRegion.parentState.declarations.add(decl)
            voStore.update(deepDeferVariable, SCCHARTS_GENERATED)
            deepDeferVariable.setInitialValue(FALSE)
            var resetDeferSignalAction = state.createDuringAction
            resetDeferSignalAction.addEffect(deepDeferVariable.createAssignment(FALSE))
        } else {
            deepDeferVariable = null
        }       
        
        // For all incoming deferred transitions, reset the defer flag and add an assignment
        // setting the deferVariable to true when entering the state 
        for (transition : incomingShallowDeferredTransitions) {
            transition.setDeferred(DeferredType::NONE)
            if (shallowDeferVariable !== null) {
                transition.addEffect(shallowDeferVariable.createAssignment(TRUE)).trace(state, transition)
            }
        }
        for (transition : incomingDeepDeferredTransitions) {
            transition.setDeferred(DeferredType::NONE)
            if (shallowDeferVariable !== null) {
                transition.addEffect(shallowDeferVariable.createAssignment(TRUE)).trace(state, transition)
            }
            if (deepDeferVariable !== null) {
                transition.addEffect(deepDeferVariable.createAssignment(TRUE)).trace(state, transition)
            }
        }
        // Set all others to false explicitly (just to make sure in case the superstate was strongly immediate aborted)
        for (transition : incomingNonDeferredTransitions) {
            if (shallowDeferVariable !== null) {
                transition.addEffect(shallowDeferVariable.createAssignment(FALSE))
            }
            if (deepDeferVariable !== null) {
                transition.addEffect(deepDeferVariable.createAssignment(FALSE))
            }
        }
    }
        
    // The simple delay transformation can only handle states with ONLY deferred incoming transitions
    private def isSimpleDelayTransformable(State state) {
        val onlyDeepDeferred = state.incomingTransitions.forall[it.deferred == DeferredType::DEEP]
        val onlyShallowDeferred = state.incomingTransitions.forall[it.deferred == DeferredType::SHALLOW]
                
        // Collect states to transform
        val handleBehavior = newArrayList(state)
        if (onlyDeepDeferred) {
            var i = 0
            while (i < handleBehavior.size) {
                val s = handleBehavior.get(i)
                handleBehavior.addAll(s.initialStates)
                i++
            }
        }
        // Check if handling of transitions would introduce instantaneous cycle
        for (s : handleBehavior) {
            for (t : s.outgoingTransitions) {
                if (t.targetState == s || t.findImmediateLoop(true)) {
                    return false
                }
            }
        }
        
        return onlyDeepDeferred || onlyShallowDeferred
    }
    
    // This transformation will enter the deferred state with a REAL delay (new intermediate state)
    // This state tends to break instantaneous cycles and eases scheduling
    // All non-immediate behavior will become instantaneous as the state is considered active before.
    // All previously immediate behavior will be removed or suppressed by a guard if this is an initial state.
    private def transformSimpleDelay(State state) {
        if (isTracingActive) {
            state.incomingTransitions.setDefaultTrace
        }
        
        // Collect states to transform
        val handleBehavior = newArrayList(state)
        // Mixing deep and shallow is not supported yet
        if (state.incomingTransitions.forall[it.deferred == DeferredType::DEEP]) {
            var i = 0
            while (i < handleBehavior.size) {
                val s = handleBehavior.get(i)
                handleBehavior.addAll(s.initialStates)
                i++
            }
        }
        
        // Create new delayed entry state
        val delayedEntryState = state.parentRegion.createState(GENERATED_PREFIX + "entry").uniqueName
        for (t : state.incomingTransitions.immutableCopy) {
            t.setTargetState(delayedEntryState)
            t.deferred = DeferredType::NONE
        }
        val entryTransition = delayedEntryState.createTransitionTo(state)
        
        // Transform behavior
        var ValuedObject initialVariable
        if (state.initial) {
            // If initial we have to keep the entry actions and distinguish initial and deferred entry
            // This is done in the same was as in the simple guard transformation
            
            // Add a new deferVariable to the outer state, set it initially to FALSE and
            // add a during action in the state to reset it to FALSE
            val parent = state.parentRegion.parentState
            initialVariable = parent.createValuedObject(GENERATED_PREFIX+"initial", createBoolDeclaration).uniqueName
            voStore.update(initialVariable, SCCHARTS_GENERATED)
            initialVariable.setInitialValue(TRUE)
            val resetDeferSignalAction = parent.createDuringAction
            //resetDeferSignalAction.addTagAnnotation(DO_NOT_DEFER)
            resetDeferSignalAction.addEffect(initialVariable.createAssignment(FALSE))
            
            entryTransition.addEffect(initialVariable.createAssignment(FALSE))
        }
        for (s : handleBehavior) {
            // Make all outgoing transitions immediate
            for (t : s.outgoingTransitions) {
                if (!t.immediate) {
                    t.immediate = true
                    if (state.initial) { // Suppress reaction in initial case
                        if (t.trigger === null) {
                            val deferTest = not(initialVariable.reference)
                            t.setTrigger(deferTest)
                        } else {
                            val deferTest = not(initialVariable.reference)
                            t.setTrigger(deferTest.and(t.trigger.copy))
                        }
                    }
                }
            }
            
            // Make all during actions immediate
            for (a : s.duringActions.filter[!it.immediate]){
                a.immediate = true
                if (state.initial) { // Suppress reaction in initial case
                    if (a.trigger === null) {
                        val deferTest = not(initialVariable.reference)
                        a.setTrigger(deferTest)
                    } else {
                        val deferTest = not(initialVariable.reference)
                        a.setTrigger(deferTest.and(a.trigger.copy))
                    }
                }
            }
            
            if (state.initial) {
                // guard all entry actions to execute only in initial execution
                for (a : s.entryActions.filter[!hasAnnotation(DO_NOT_DEFER)]){
                    if (a.trigger === null) {
                        val deferTest = initialVariable.reference
                        a.setTrigger(deferTest)
                    } else {
                        val deferTest = initialVariable.reference
                        a.setTrigger(deferTest.and(a.trigger.copy))
                    }
                }
            } else {
                // Remove all entry actions as they will never be executed
                s.actions.removeIf[it instanceof EntryAction && !it.hasAnnotation(DO_NOT_DEFER)]
            }
        }
    }
}
