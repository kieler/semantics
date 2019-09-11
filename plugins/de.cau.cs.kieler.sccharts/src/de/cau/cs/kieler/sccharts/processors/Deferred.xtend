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
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import java.util.List
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import java.util.LinkedList
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.sccharts.DeferredType

/**
 * @author kolja
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

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_deferred_"

    // ------------------------------------------------------------------------
    // --             D E F E R R E D    T R A N S I T I O N                 --
    // ------------------------------------------------------------------------
    // A quite complex transformation
    def State transform(State state) {
        // It is important, that deferred transition inside of sub states are transformed first
        // because maybe the result state needs to be copied
        for (s : state.allContainedStates.toList)
            s.transform
        // check if the state has incoming deferred transitions that needs to be transformed
        if (state.needTransform) {
            // check if a simple transformation is possible
            if (state.isSimpleTransformable)
                state.transformSimple // add a deferred guard variable
            else
                state.transformComplex // copy the target state of the deferred transition
        }
        // when transforming a deferred transition in some cases new deferred transitions where generated 
        // (before the initial states of the child regions of a target state of a deferred transition) 
        for (s : state.allContainedStates.toList)
            s.transform
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
            val shallow = s.copy // copy the hole state
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
            while (deep.entryActions.size > 0)
                deep.entryActions.get(0).remove
            // each immediate during action in _S will be set to delayed
            for (during : deep.duringActions)
                during.delay = DelayType.DELAYED
            // if deep has sub regions with immediate behavior of the initial state,
            // then create a new initial state with a immediate deferred transition to the old initial state and transform it later
            for (subRegion : deep.allContainedControlflowRegions.toList) {
                if (subRegion.states.size > 0) {
                    for (state : subRegion.states.filter[it.initial].toList) {
                        if (state.hasInstantaneousBehavior(true)) {
                            val newState = state.parentRegion.createState(GENERATED_PREFIX + state.ID)
                            newState.initial = true
                            state.initial = false
                            val trans = newState.createTransitionTo(state)
                            trans.delay = DelayType.IMMEDIATE
                            trans.deferred = DeferredType::DEEP
                        }
                    }
                }
            }
        }
    }

    // check if a state has instantaneous behavior 
    // if deep is true, then inner instantaneous behavior is also checked
    private def boolean hasInstantaneousBehavior(State s, boolean deep) {
        for (t : s.outgoingTransitions) {
            if (t.delay == DelayType.IMMEDIATE)
                return true
        }
        if (deep) {
            if (s.entryActions.size > 0)
                return true
            for (a : s.duringActions) {
                if (a.delay == DelayType.IMMEDIATE)
                    return true
            }
            for (subRegion : s.allContainedControlflowRegions.toList) {
                if (subRegion.states.size > 0) {
                    for (state : subRegion.states.filter[it.initial].toList) {
                        if (state.hasInstantaneousBehavior(deep))
                            return true
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
                if (s.hasInstantaneousBehavior(t.deferred == DeferredType::DEEP))
                    return true
            }
        }
        return false
    }

    // checks if a transition is part of an immediate loop
    private def findImmediateLoop(Transition t) {
        val visited = new LinkedList<Transition>
        val next = new LinkedList<Transition>
        next.add(t)
        while (next.size > 0) {
            val n = next.pop
            visited.add(n)
            for (transition : n.targetState.outgoingTransitions) {
                if (transition.delay == DelayType.IMMEDIATE) {
                    if (transition == t)
                        return true
                    if (!visited.contains(transition) && !next.contains(transition))
                        next.add(transition)
                }
            }
        }
        return false
    }

    // the simple transformation can only handle shallow deferred transition which are not part of an immediate loop
    // checks if all incoming deferred transitions of a state are simple transformable 
    private def isSimpleTransformable(State s) {
        var hasDeepDeferred = false
        for (t : s.incomingTransitions) {
            if (t.deferred == DeferredType::DEEP)
                hasDeepDeferred = true;
            if (t.deferred != DeferredType::NONE && t.findImmediateLoop)
                return false
        }
        if (hasDeepDeferred) {
            if (s.entryActions.size > 0)
                return false
            for (a : s.duringActions) {
                if (a.delay == DelayType.IMMEDIATE)
                    return false
            }
            for (subRegion : s.allContainedControlflowRegions.toList) {
                if (subRegion.states.size > 0) {
                    for (state : subRegion.states.filter[it.initial].toList) {
                        if (state.hasInstantaneousBehavior(true))
                            return false
                    }
                }
            }
        }
        return true
    }

    // add a guard variable to all outgoing transition which ensures that they can not be taken in the first tick when entered over a deferred transition
    // this function can only be used if there are no deep deferred transitions with s as target state
    private def transformSimple(State s) {
        val incomingDeferredTransitions = s.incomingTransitions.filter[deferred != DeferredType::NONE].toList;
        val incomingNonDeferredTransitions = s.incomingTransitions.filter[deferred == DeferredType::NONE].toList;

        if (isTracingActive) {
            val List<EObject> sources = newLinkedList()
            sources.addAll(s.incomingTransitions.filter[deferred != DeferredType::NONE])
            sources.add(s)
            sources.setDefaultTrace
        }
        // Add a new deferVariable to the outer state, set it initially to FALSE and
        // add a during action in the state to reset it to FALSE
        val deferVariable = s.parentRegion.parentState.createValuedObject(GENERATED_PREFIX,
            createBoolDeclaration).uniqueName
        voStore.update(deferVariable, SCCHARTS_GENERATED)
        deferVariable.setInitialValue(FALSE)
        val resetDeferSignalAction = s.createDuringAction
        resetDeferSignalAction.addEffect(deferVariable.createAssignment(FALSE))

        // For all incoming deferred transitions, reset the defer flag and add an assignment
        // setting the deferVariable to true when entering the state 
        for (transition : incomingDeferredTransitions) {
            transition.setDeferred(DeferredType::NONE)
            transition.addEffect(deferVariable.createAssignment(TRUE)).trace(s, transition)
        }
        // Set all others to false explicitly (just to make sure in case the superstate was strongly immediate aborted)
        for (transition : incomingNonDeferredTransitions) {
            transition.addEffect(deferVariable.createAssignment(FALSE)).trace(s, transition)
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
            }
        }
    }

    // makes all variables defined inside of a state and its sub regions and sub states visible in the parent region
    def void makeVariablesPublic(State s, ControlflowRegion parent) {
        while (s.declarations.size > 0) {
            var d = s.declarations.get(0);
            parent.declarations.add(d)
            for (o : d.valuedObjects)
                o.uniqueName;
        }
        for (subState : s.allContainedStates.toList)
            subState.makeVariablesPublic(parent)
        for (region : s.allContainedDataflowRegions.toList) {
            while (region.declarations.size > 0) {
                var d = region.declarations.get(0);
                parent.declarations.add(d)
                for (o : d.valuedObjects)
                    o.uniqueName;
            }
        }
        for (region : s.allContainedControlflowRegions.toList) {
            while (region.declarations.size > 0) {
                var d = region.declarations.get(0);
                parent.declarations.add(d)
                for (o : d.valuedObjects)
                    o.uniqueName;
            }
        }
    }
}
