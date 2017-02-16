/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.extensions

import com.google.common.collect.ImmutableList
import com.google.common.collect.Iterators
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Effect
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.kexpressions.keffects.HostcodeEffect
import de.cau.cs.kieler.kexpressions.keffects.KEffectsFactory
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.Binding
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.IterateAction
import de.cau.cs.kieler.sccharts.LocalAction
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.SuspendAction
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.TransitionType
import java.util.ArrayList
import java.util.Iterator
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import static extension de.cau.cs.kieler.sccharts.iterators.StateIterator.*
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsReplacementExtensions

import static extension de.cau.cs.kieler.sccharts.iterators.ScopeIterator.*
import de.cau.cs.kieler.kexpressions.CombineOperator
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.sccharts.SCCharts

/**
 * SCCharts Extensions.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class SCChartsExtension {

    @Inject
    extension KExpressionsValuedObjectExtensions

    @Inject
    extension KExpressionsComplexCreateExtensions

    @Inject
    extension KExpressionsReplacementExtensions
    
    @Inject
    extension KExpressionsDeclarationExtensions       

    // This prefix is used for namings of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //    public val Injector i = ActionsStandaloneSetup::doSetup();
    //    public val ActionsScopeProvider scopeProvider = i.getInstance(typeof(ActionsScopeProvider));
    //    public val ISerializer serializer = i.getInstance(typeof(ISerializer));
    //-------------------------------------------------------------------------
    //--             B A S I C   C R E A T I O N   M E T H O D S             --
    //-------------------------------------------------------------------------
    // Create an immutable copy
    def <E> ImmutableList<E> immutableCopy(Iterator<E> iterable) {
        iterable.toList.immutableCopy
    }

    //def ImmutableList<?> immutableCopy(TreeIterator<?> iterable) {
    //    iterable.immutableCopy
    //}
    def <E> ImmutableList<E> immutableCopy(List<E> list) {
        ImmutableList::copyOf(list) as ImmutableList<E>
    }

    //    def Region getRegions(Concurrency concurrency) {
    //        concurrency as Region
    //    }
    //    def List<Controlflow> getControlflows(State state) {
    //        state.regions.filter(typeof(Controlflow)).toList
    //    }
    def List<ControlflowRegion> getControlflowRegions(State state) {
        state.regions.filter(typeof(ControlflowRegion)).toList
    }

    //    def List<Dataflow> getDataflows(State state) {
    //        state.regions.filter(typeof(Dataflow)).toList
    //    }
    def List<DataflowRegion> getDataflowRegions(State state) {
        state.regions.filter(typeof(DataflowRegion)).toList
    }

    def static <T> T convertInstanceOfObject(Object o, Class<T> clazz) {
        try {
            return clazz.cast(o);
        } catch (ClassCastException e) {
            return null;
        }
    }
    
    
    def SCCharts getSCCharts(Scope scope) {
        if (scope.eContainer != null) {
            return (scope.eContainer as Scope).getSCCharts as SCCharts
        } else {
            return scope as SCCharts
        }
    }    
    

    //====== GENERAL MODEL ELEMENTS =====
    // Get the single normal termination Transition. Return null if there is 
    // no outgoing normal termination Transition.
    def Transition getTerminationTransitions(State state) {
        val allTerminationTransitions = state.outgoingTransitions.filter[ type == TransitionType::TERMINATION ]
        if (allTerminationTransitions.size == 0) {
            return null;
        }
        allTerminationTransitions.head;
    }

    // Return the list of all contained States.
    def Iterator<State> getAllContainedStates(Scope scope) {
        //TODO:  getAllContainedStates iterator
        //scope.sccAllContainedStates; 
        scope.eAllContents().filter(typeof(State))
    //        scope.eAllContents().filter(typeof(State))
    }

    // Return the list of all contained Regions.
    def Iterator<ControlflowRegion> getAllContainedRegions(Scope scope) {
        //TODO: sccAllRegions iterator
        scope.eAllContents().filter(typeof(ControlflowRegion))
    }


    // Returns a list of all contained States.
    def List<State> getAllContainedStatesList(State state) {
        <State>newLinkedList => [ l |
            state.regions.filter(ControlflowRegion).forEach [ r |
                r.states.forEach [ s |
                    l += s;
                    l += s.getAllContainedStatesList
                ]
            ]
        ]
    }

    // Return the list of all contained States and the root state if the scope is already a state.
    def Iterator<State> getAllStates(Scope scope) {
        if (scope instanceof State) {
            return Iterators.singletonIterator(scope as State) + scope.getAllContainedStates
        } else {
            return scope.getAllContainedStates
        }
    }
    
    def Iterator<Scope> getAllScopes(Scope scope) {
        scope.sccAllScopes
    }

    // Return the list of all contained Regions.
    def List<ControlflowRegion> getAllContainedControlflowRegions(Scope scope) {
        scope.eAllContents().filter(typeof(ControlflowRegion)).toList()
    }

    // Return the list of all contained Transitions.
    def List<Transition> getAllContainedTransitions(Scope scope) {
        scope.eAllContents().filter(typeof(Transition)).toList()
    }

    // Return the list of all contained Actions.
    def List<Action> getAllContainedActions(Scope scope) {
        scope.eAllContents().filter(typeof(Action)).toList()
    }

    // Return the list of contained Emissions.
    def List<Emission> getAllContainedEmissions(Action action) {
        action.eAllContents().filter(typeof(Emission)).toList();
    }

    // Return the list of contained Assignments.
    def List<Assignment> getAllContainedAssignments(Action action) {
        action.eAllContents().filter(typeof(Assignment)).toList();
    }

    def getAllValuedObjects(State state) {
        <ValuedObject>newLinkedList => [ ll |
            state.declarations.forEach[d|d.valuedObjects.forEach[ll += it]]
        ]
    }

    // Return the list of pure signals of a state.
    def List<ValuedObject> getPureSignals(State state) {
        state.valuedObjects.filter[e|e.isSignal && e.type == ValueType::PURE].toList
    }

    // Return the list of valued signals of a state.
    def List<ValuedObject> getValuedSignals(State state) {
        state.valuedObjects.filter[e|e.isSignal && e.type != ValueType::PURE].toList
    }

    // Return the list of all signals of a state.
    def List<ValuedObject> getSignals(State state) {
        state.valuedObjects.filter[e|e.isSignal].toList
    }

    // Return true if the valued Object is a pure signal
    def boolean isPureSignal(ValuedObject valuedObject) {
        valuedObject.isSignal && valuedObject.type == ValueType::PURE
    }

    // FIXME
    // Due to the SCCharts grammar changes SCCharts do not have a root region anymore.
    // The top-most element is an SCChart which is a State.
    // If necessary, these function should be re-implemented.
    // Checks if all regions have at least one final state. Note that the final
    // state may not be reachable and this method conservatively still returns
    // true. It only returns fals iff there is at least one region without
    // a final state.
    def boolean regionsMayTerminate(State state) {
        for (region : state.regions.filter(ControlflowRegion)) {
            if (region.allFinalStates.nullOrEmpty) {
                return false;
            }
        }
        return true;
    }

    def boolean isRootState(State state) {
        state.parentRegion == null 
    }

    def dispatch State getRootState(State state) {
        if(state.parentRegion == null) return state;
        state.parentRegion.rootState
    }

    // Return the root state.
    def dispatch State getRootState(ControlflowRegion region) {

        // There should exactly be one state in the root region
        region.parentState.getRootState
    }
    
    
    def EObject getRoot(EObject eObject) {
        if (eObject.eContainer == null) return eObject 
            else eObject.eContainer.root
    }

    // Returns true iff the state contains regions.
    def boolean isHierarchical(State state) {
        state.regions.size > 0;
    }

    def State createSCChart() {
        val state = SCChartsFactory::eINSTANCE.createState();
        return state;
    }

    // Gets the list of non-empty regions
    def List<ControlflowRegion> getControlflowRegions2(State state) {
        val list = state.regions.filter(ControlflowRegion).filter[!empty].toList
        list
    }

    //========== TRANSITIONS ===========
    def Transition setTypeTermination(Transition transition) {
        transition.setType(TransitionType::TERMINATION)
        transition
    }

    def Transition setTypeStrongAbort(Transition transition) {
        transition.setType(TransitionType::STRONGABORT)
        transition
    }

    def Transition setTypeWeakAbort(Transition transition) {
        transition.setType(TransitionType::WEAKABORT)
        transition
    }

    def boolean isTypeTermination(Transition transition) {
        return transition.type == TransitionType::TERMINATION
    }

    def boolean isTypeStrongAbort(Transition transition) {
        return transition.type == TransitionType::STRONGABORT
    }

    def boolean isTypeWeakAbort(Transition transition) {
        return transition.type == TransitionType::WEAKABORT
    }

    //========== STATES ===========
    def State createState(String id) {
        val state = SCChartsFactory::eINSTANCE.createState();
        state.setId(id)
        state.setLabel("")
        state
    }

    def State createState(ControlflowRegion region, String id, String label) {
        val state = createState(id) => [ it.label = label ]
        region.states.add(state)
        state
    }

    def State createState(ControlflowRegion region, String id) {
        val state = createState(id)
        state.setLabel(id)
        region.states.add(state)
        state
    }

    //========== UNIQUE NAMES ===========
    def private dispatch boolean uniqueNameTest(State state, String newName) {
        state.parentRegion.states.filter[it != state && id == newName].size == 0
    }

    def private dispatch boolean uniqueNameTest(ControlflowRegion region, String newName) {
        region.parentState.regions.filter[it != region && id == newName].size == 0
    }

    def private boolean uniqueNameTest(ValuedObject valuedObject, State state, String newName) {
        if (state == null) { 
            // is unique
            return true
        }
        
        val notFoundOtherValuedObjectInState = state.valuedObjects.filter[it != valuedObject && name == newName].size == 0
        return notFoundOtherValuedObjectInState
    }

    def private dispatch boolean uniqueNameTest(ValuedObject valuedObject, String newName) {
        if (valuedObject.eContainer == null) {
            // is unique
            return true
        }
        val scope = (valuedObject.eContainer.eContainer as Scope);
        val rootState = scope.rootState
        var notFound = valuedObject.uniqueNameTest(rootState, newName)
        for (innerState : rootState.allContainedStatesList) {
            if (notFound && !valuedObject.uniqueNameTest(innerState, newName)) {
                notFound = false
            }
        }
        notFound
    }

    def private dispatch boolean uniqueNameTest(EObject eObject, String newName) {
        false
    }

    def private String uniqueNameHelper(EObject eObject, String originalId) {
        var String newName = null
        var c = 1
        if (eObject.uniqueNameTest(originalId)) {
            return originalId
        }
        while (newName == null) {
            c = c + 1
            val tmpNewName = originalId + c
            if (eObject.uniqueNameTest(tmpNewName)) {
                newName = tmpNewName
            }
        }
        return newName
    }

    def private String uniqueNameHelperCached(EObject eObject, String originalId, List<String> uniqueNameCache) {
        var String newName = null
        var c = 1
        if (!uniqueNameCache.contains(originalId)) {
            uniqueNameCache.add(originalId)
            return originalId
        }
        while (newName == null) {
            c = c + 1
            val tmpNewName = originalId + c
            if (!uniqueNameCache.contains(tmpNewName)) {
                newName = tmpNewName
            }
        }
        uniqueNameCache.add(newName)
        return newName
    }

    def State uniqueName(State state) {
        val originalId = state.id
        var String newName = state.uniqueNameHelper(originalId)
        if (newName != originalId) {
            state.setId(newName)
            state.setLabel2(newName)
        }
        state
    }

    def State uniqueNameCached(State state, List<String> uniqueNameCache) {
        val originalId = state.id
        var String newName = state.uniqueNameHelperCached(originalId, uniqueNameCache)
        if (newName != originalId) {
            state.setId(newName)
            state.setLabel2(newName)
        }
        state
    }

    def ControlflowRegion uniqueName(ControlflowRegion region) {
        val originalId = region.id
        var String newName = region.uniqueNameHelper(originalId)
        if (originalId != newName) {
            region.setId(newName)
            region.setLabel2(newName)
        }
        region
    }

    def ControlflowRegion uniqueNameCached(ControlflowRegion region, List<String> uniquieNameCache) {
        val originalId = region.id
        var String newName = region.uniqueNameHelperCached(originalId, uniquieNameCache)
        if (originalId != newName) {
            region.setId(newName)
            region.setLabel2(newName)
        }
        region
    }

    def ValuedObject uniqueName(ValuedObject valuedObject) {
        var originalId = valuedObject.name
        if (originalId == null) {
            originalId = "NULL"
        }
        var String newName = valuedObject.uniqueNameHelper(originalId)
        if (newName != originalId) {
            valuedObject.setName(newName)
        }
        valuedObject
    }

    def ValuedObject uniqueNameCached(ValuedObject valuedObject, List<String> uniqueNameCache) {
        val originalId = valuedObject.name
        var String newName = valuedObject.uniqueNameHelperCached(originalId, uniqueNameCache)
        if (newName != originalId) {
            valuedObject.setName(newName)
        }
        valuedObject
    }

    def State setInitial(State state) {
        state.setInitial(true)
        state
    }

    def State setNotInitial(State state) {
        state.setInitial(false)
        state
    }

    def State setFinal(State state) {
        state.setFinal(true)
        state
    }

    def State setNotFinal(State state) {
        state.setFinal(false)
        state
    }

    def State createInitialState(String id) {
        createState(id).setInitial
    }

    def State createFinalState(String id) {
        createState(id).setFinal
    }

    def State createInitialState(ControlflowRegion region, String id) {
        region.createState(id).setInitial
    }

    def State createFinalState(ControlflowRegion region, String id) {
        region.createState(id).setFinal
    }

    def State getInitialState(ControlflowRegion region) {
        var initialStates = region.states.filter[isInitial]
        if (initialStates.size > 0) {
            return initialStates.get(0)
        }
        return null
    }

    def State[] getAllFinalStates(ControlflowRegion region) {
        region.states.filter[isFinal]
    }

    def State[] getFinalStates(ControlflowRegion region) {
        region.allFinalStates.filter[
            outgoingTransitions.size == 0 && !hasInnerStatesOrControlflowRegions && entryActions.size == 0 &&
                duringActions.size == 0 && exitActions.size == 0]
    }

    // Get the first (simple) final state if the region contains any, otherwise return null.
    def State getFinalState(ControlflowRegion region) {
        val finalStates = region.getFinalStates
        if (finalStates.size > 0)
            return finalStates.get(0)
        else
            return null
    }

    // Get any final state if the region already contains a final state, otherwise create a final state.
    def State retrieveFinalState(ControlflowRegion region, String id) {
        val finalState = region.getFinalState
        if (finalState != null) {
            return finalState
        }
        region.createState(id).setFinal
    }

    def State setLabel2(State state, String label) {
        state.setLabel(label)
        state
    }

    def State setDefaultLabel(State state) {
        state.setLabel2(state.id)
    }

    def State setTypeConnector(State state) {
        state.connector = true
        state
    }

    def State setTypeNormal(State state) {
        state.connector = false
        state
    }

    // REF
    def boolean isReferencedState(State state) {
        state.referencedScope != null
    }

    //========== REGIONS ===========
    private def ControlflowRegion createControlflowRegion(String id) {
        val controlflow = SCChartsFactory::eINSTANCE.createControlflowRegion();
        controlflow.setId(id)
        controlflow.setLabel("")
        controlflow
    }

//    def ControlflowRegion createControlflowRegion(State state, String id) {
//        val region = createControlflowRegion(id)
//        // ATTENTION: if this is the first region and there already is an IMPLICIT region,
//        // e.g., because of inner actions, then return THIS region only!
//        if (state.regions.size == 1 && state.regions.get(0).allContainedStates.size == 0 &&
//            state.regions.get(0) instanceof ControlflowRegion) {
//            return state.regions.get(0) as ControlflowRegion
//        }
//        state.regions += region
//        region
//    }

    /**
     * Creates and adds controlflow region. If the state already contains an implicit region the 
     * empty implicit region is returned.
     */
    def ControlflowRegion createControlflowRegion(State state, String id) {
        val region = createControlflowRegion(id)
        // ATTENTION: if this is the first region and there already is an IMPLICIT region,
        // e.g., because of inner actions, then return THIS region only!
        if (state.regions.size == 1 &&
            state.regions.head instanceof ControlflowRegion && 
            state.regions.head.allContainedStates.size == 0) {
            val implicitRegion = state.regions.get(0) as ControlflowRegion;
            implicitRegion.id = id;
            return implicitRegion;
        }
        state.regions += region
        region
    }

    def ControlflowRegion setLabel2(ControlflowRegion region, String label) {
        region.setLabel(label)
        region
    }

    def boolean controlflowRegionsNotEmpty(State state) {
        for (r : state.regions.filter(ControlflowRegion)) {
            if(r.states.size > 0) return true
        }
        false
    }

    def boolean empty(ControlflowRegion region) {
        region.states.size == 0
    }

    def boolean hasInnerStatesOrControlflowRegions(State state) {
        return ((state.regions != null && state.regions.size != 0 && state.controlflowRegionsNotEmpty))
    }
    
    def boolean hasDataflowRegions(State state) {
        return state.regions != null && state.regions.size != 0 && !state.regions.filter(DataflowRegion).empty
    }

    // These are actions that expand to INNER content like during or exit actions.
    def boolean hasInnerActions(State state) {
        return (!state.duringActions.nullOrEmpty || !state.exitActions.nullOrEmpty || !state.entryActions.nullOrEmpty)
    }

    //========== TRANSITIONS ===========
    // A transition is a history transition if it is not a reset transition.
    def boolean isHistory(Transition transition) {
        transition.history != HistoryType::RESET
    }

    def boolean isDeepHistory(Transition transition) {
        transition.history == HistoryType::DEEP
    }

    def Transition createTransition() {
        val transition = SCChartsFactory::eINSTANCE.createTransition()
        transition.setPriority2(1)
    }

    def Transition createImmediateTransition() {
        createTransition.setImmediate
    }

    def Transition createTransitionTo(State sourceState, State targetState) {
        val transition = createTransition()
        transition.setTargetState(targetState)
        sourceState.outgoingTransitions.add(transition)

        //        targetState.incomingTransitions.add(transition)
        //val dummyTransition = createTransition()
        //sourceState.outgoingTransitions.add(dummyTransition)
        //sourceState.outgoingTransitions.remove(dummyTransition)
        transition.trimPriorities
    }

    def Transition createTransitionTo(State sourceState, State targetState, int index) {
        val transition = createTransition()
        transition.setTargetState(targetState)
        sourceState.outgoingTransitions.add(index, transition)

        //        targetState.incomingTransitions.add(transition)
        transition.trimPriorities
    }

    def Transition setTargetState2(Transition transition, State targetState) {

        //        transition.targetState.incomingTransitions.remove(transition)
        transition.setTargetState(targetState)

        //        targetState.incomingTransitions.add(transition)
        transition
    }

    def Transition setSourceState(Transition transition, State sourceState) {

        //        transition.sourceState.outgoingTransitions.remove(transition)
        sourceState.outgoingTransitions.add(transition)
        transition.trimPriorities
    }

    def Transition createImmediateTransitionTo(State sourceState, State targetState) {
        sourceState.createTransitionTo(targetState).setImmediate
    }

    def Transition setTrigger2(Transition transition, Expression expression) {
        transition.setTrigger(expression)
        transition
    }

    def Transition addEffect(Transition transition, Effect effect) {
        transition.effects.add(effect)
        transition
    }

    def Transition clearEffects(Transition transition) {
        transition.effects.clear
        transition
    }

    def Transition setPriority2(Transition transition, int priority) {
        transition.setPriority(priority)
        transition
    }

    def Transition setLowestPriority(Transition transition) {
        val maxPriority = transition.sourceState.outgoingTransitions.length + 1
        transition.setPriority2(maxPriority).trimPriorities
    }

    def Transition setHighestPriority(Transition transition) {
        transition.setPriority2(0).trimPriorities
    }

    def State fixAllPriorities(State state) {
        for (containedState : state.allContainedStatesList) {
            var prio = 1
            for (transition : containedState.outgoingTransitions) {
                transition.setPriority(prio)
                prio = prio + 1
            }
        }
        state
    }

    //    def State fixAllEmptyRegions(State rootState) {
    //        val regions = rootState.allContainedRegions.filter(e | e.allContainedStates == 0).immutableCopy
    //        for (region : regions) {
    //            val parent = region.parentState
    //            parent.regions.remove(region)
    //        }
    //        rootState
    //    }
    def State fixAllTextualOrdersByPriorities(State state) {
        for (containedState : state.allContainedStatesList) {

            //Old implementation unnecessarily touching every element every causing decresing tracing performance
            val transitions = containedState.outgoingTransitions.sortBy[priority].immutableCopy;
            for (transition : transitions) {

                //System.out.println(transition.sourceState.id + "->" + transition.targetState.id + " : " + transition.priority)
                containedState.outgoingTransitions.remove(transition)
                containedState.outgoingTransitions.add(transition)
                transition.setPriority(0)
            }

        //als: New implementation avoids calls of remove and add
        // This throws an exception because EList seems not sortable
        //java.lang.IllegalArgumentException: The 'no duplicates' constraint is violated
        //    at org.eclipse.emf.common.util.AbstractEList.set(AbstractEList.java:264)
        //    at org.eclipse.emf.common.util.AbstractEList$EListIterator.doSet(AbstractEList.java:959)
        //    at org.eclipse.emf.common.util.AbstractEList$EListIterator.set(AbstractEList.java:937)
        //    at java.util.Collections.sort(Collections.java:221)
        //containedState.outgoingTransitions.sort([first, second | first.priority - second.priority ]);
        }
        state
    }

    def Transition trimPriorities(Transition transition) {
        var prio = 1
        val transitions = transition.sourceState.outgoingTransitions.toList.sortBy[priority]
        for (outgoingTransition : transitions) {
            outgoingTransition.setPriority(prio)
            prio = prio + 1
        }
        transition
    }

    def Transition setImmediate(Transition transition) {
        transition.setImmediate(true)
        transition
    }

    def Transition setNotImmediate(Transition transition) {
        transition.setImmediate(false)
        transition
    }

    //========== STATE ACTIONS ===========
    // Return wether a transition is immediate. This should return the
    // immediate flag of a transition unless
    // 1. the source state is a connector node, then the transition is always (implicityly) immediate OR
    // 2. the transition is a normal termination and has NOT trigger, then it is also (implicityly) immediate.
    def Boolean isImmediate2(Transition transition) {
        (transition.immediate) || (transition.sourceState.isConnector) || (transition.type ==
            TransitionType::TERMINATION && transition.trigger == null
        )
    }

    // Apply attributes from one local action to another
    def LocalAction applyAttributes(LocalAction localAction, LocalAction locationActionWithAttributes) {
        localAction.setImmediate(locationActionWithAttributes.isImmediate)
        localAction.setDelay(locationActionWithAttributes.delay)
        localAction.setLabel(locationActionWithAttributes.label)
        localAction.setTrigger(locationActionWithAttributes.trigger)
        localAction.effects.clear
        for (effect : locationActionWithAttributes.effects) {
            localAction.addEffect(effect.copy)
        }
        localAction
    }

    // Create a during action for a state.
    def DuringAction createDuringAction(State state) {
        val action = SCChartsFactory::eINSTANCE.createDuringAction
        state.localActions.add(action);
        action
    }

    // Retrieves the first during action if there is any or returns a new one
    def DuringAction retrieveDuringAction(State state, boolean immediate) {
        val duringActions = state.duringActions.filter(e|e.immediate == immediate)
        if (!duringActions.empty) {
            return duringActions.get(0)
        }
        val newDuringAction = state.createDuringAction
        newDuringAction.setImmediate(immediate)
        newDuringAction
    }

    // Create an immediate during action for a state.
    def DuringAction createImmediateDuringAction(State state) {
        val action = state.createDuringAction
        action.setImmediate(true);
        action
    }

    // Create a entry action for a state.
    def EntryAction createEntryAction(State state) { 
        val action = SCChartsFactory::eINSTANCE.createEntryAction
        state.localActions.add(action);
        action
    }
    
    // Create a entry action for a state at a certain index.
    def EntryAction createEntryAction(State state, int index) {
        val action = SCChartsFactory::eINSTANCE.createEntryAction
        state.localActions.add(index, action);
        action
    }    

    // Create an immediate entry action for a state.
    def EntryAction createImmediateEntryAction(State state) {
        val action = state.createEntryAction
        action.setImmediate(true);
        action
    }
    
    // Create an immediate entry action for a state at a certain index.
    def EntryAction createImmediateEntryAction(State state, int index) {
        val action = state.createEntryAction(index)
        action.setImmediate(true);
        action
    }    

    // Create a exit action for a state.
    def ExitAction createExitAction(State state) {
        val action = SCChartsFactory::eINSTANCE.createExitAction
        state.localActions.add(action);
        action
    }

    // Create an immediate exit action for a state.
    def ExitAction createImmediateExitAction(State state) {
        val action = state.createExitAction
        action.setImmediate(true);
        action
    }

    // Create a suspend action for a state.
    def SuspendAction createSuspendAction(State state) {
        val action = SCChartsFactory::eINSTANCE.createSuspendAction
        state.localActions.add(action);
        action
    }

    // Create an immediate suspend action for a state.
    def SuspendAction createImmediateSuspendAction(State state) {
        val action = state.createSuspendAction
        action.setImmediate(true);
        action
    }

    // Create an iterate action for a state.
    def IterateAction createIterateAction(State state) {
        val action = SCChartsFactory::eINSTANCE.createIterateAction
        state.localActions.add(action);
        action
    }

    // Create an immediate iterate action for a state.
    def IterateAction createImmediateIterateAction(State state) {
        val action = state.createIterateAction
        action.setImmediate(true);
        action
    }

    // Return all EntryAction actions of a state.
    def List<EntryAction> getEntryActions(State state) {
        state.localActions.filter(typeof(EntryAction)).toList
    }

    // Return all DuringAction actions of a state.
    def List<DuringAction> getDuringActions(State state) {
        state.localActions.filter(typeof(DuringAction)).toList
    }

    // Return all ExitAction actions of a state.
    def List<ExitAction> getExitActions(State state) {
        state.localActions.filter(typeof(ExitAction)).toList
    }

    // Return all SuspendAction actions of a state.
    def List<SuspendAction> getSuspendActions(State state) {
        state.localActions.filter(typeof(SuspendAction)).toList
    }

    //========== ASSIGNMENTS ============
    //Create a during action for a state.
    def Emission createEmission() {
        val emission = KEffectsFactory::eINSTANCE.createEmission
        emission
    }

    // Create an Assignment.
    def Assignment assign(ValuedObject valuedObject) {
        val assignment = KEffectsFactory::eINSTANCE.createAssignment()
        assignment.setValuedObject(valuedObject)
        assignment
    }

    // Create an Assignment and add it sequentially to an action's effects list.
    def Assignment createAssignment(Action action, ValuedObject valuedObject) {
        val assignment = valuedObject.assign
        action.addAssignment(assignment)
        assignment
    }

    // Create an Assignment and add it sequentially to an action's effects list.
    def Assignment addAssignment(Action action, Assignment assignment) {

        // An Assignment is a specialized Effect with a new value and a ValuedObject
        action.addEffect(assignment)
        assignment
    }

    // Create a valued Assignment. 
    def Assignment assign(ValuedObject valuedObject, Expression newValue) {
        val assignment = valuedObject.assign
        assignment.setValuedObject(valuedObject)
        assignment.setExpression(newValue);
        assignment
    }

    // Create a valued relative Assignment. 
    def Assignment assignRelative(ValuedObject valuedObject, Expression newValue) {
        valuedObject.assign(valuedObject.reference.or(newValue))
    }
    
    
    // Create a valued relative AND Assignment. 
    def Assignment assignRelativeAnd(ValuedObject valuedObject, Expression newValue) {
        valuedObject.assign(valuedObject.reference.and(newValue))
    }    
    
    // Creates a combine assignment if a combination function is given, otherwise
    // it creates a normal (fallback) assignment
    def Assignment assingCombined(ValuedObject valuedObject, Expression newValue) {
        if (valuedObject.combineOperator == CombineOperator::AND) {
            return valuedObject.assign(valuedObject.reference.and(newValue))
        } else if (valuedObject.combineOperator == CombineOperator::OR) {
            return valuedObject.assign(valuedObject.reference.or(newValue))
        } else if (valuedObject.combineOperator == CombineOperator::ADD) {
            return valuedObject.assign(valuedObject.reference.add(newValue))
        } else if (valuedObject.combineOperator == CombineOperator::MULT) {
            return valuedObject.assign(valuedObject.reference.mult(newValue))
        } else if (valuedObject.combineOperator == CombineOperator::MAX) {
            return valuedObject.assign(valuedObject.reference.max(newValue))
        } else if (valuedObject.combineOperator == CombineOperator::MIN) {
            return valuedObject.assign(valuedObject.reference.min(newValue))
        }
        // Fallback if no operator is defined
        return valuedObject.assign(newValue)
    }
    

    // Create a valued Assignment and add it sequentially to an action's effects list. 
    def Assignment createAssignment(Action action, ValuedObject valuedObject, Expression newValue) {
        val assignment = valuedObject.assign(newValue)
        action.addAssignment(assignment)
        assignment
    }

    //=========== EMISSIONS =============
    // Create a TextEffect.
    def HostcodeEffect createHostcodeEffect(String text) {
        val extEffect = KEffectsFactory::eINSTANCE.createHostcodeEffect
        extEffect.setText(text)
        extEffect
    }

    // Create an Emission.
    def Emission emit(ValuedObject valuedObject) {
        val emission = KEffectsFactory::eINSTANCE.createEmission()
        emission.setValuedObject(valuedObject)
        emission
    }

    // Create an Emission and add it sequentially to an action's effects list.
    def Emission createEmission(Action action, ValuedObject valuedObject) {
        val emission = valuedObject.emit
        action.addEmission(emission)
        emission
    }

    // Create an Emission and add it sequentially to an action's effects list.
    def Emission addEmission(Action action, Emission emission) {

        // An Emission is a specialized Effect with a new value and a ValuedObject
        action.addEffect(emission)
        emission
    }

    // Create an Effect (supertype of Emission) and add it sequentially to an action's effects list.
    def Effect addEffect(Action action, Effect effect) {
        action.effects.add(effect)
        effect
    }

    // Create a valued Emission. 
    def Emission emit(ValuedObject valuedObject, Expression newValue) {
        val emission = valuedObject.emit
        emission.setValuedObject(valuedObject)
        emission.setNewValue(newValue);
        emission
    }

    // Create a valued Emission and add it sequentially to an action's effects list. 
    def Emission createEmission(Action action, ValuedObject valuedObject, Expression newValue) {
        val emission = valuedObject.emit(newValue)
        action.addEmission(emission)
        emission
    }

    //-------------------------------------------------------------------------
    //--                     K E X P R E S S I O N S                         --
    //-------------------------------------------------------------------------
    //==  EXPRESSION MODIFICATIONS  ==
    def void replace(Action action, Expression searchExpression, Expression replaceExpression) {
        action.setTrigger(action.trigger.replace(searchExpression, replaceExpression))
    }

    //=========  VALUED OBJECT  =========
    // Creates a new ValuedObject in a scope.
//    def ValuedObject createValuedObject(Scope scope, String valuedObjectName) {
//        val valuedObject = createValuedObject(valuedObjectName)
//        scope.valuedObjects.add(valuedObject)
//        valuedObject
//    }
    
    def ValuedObject createValuedObject(Scope scope, String valuedObjectName, Declaration declaration) {
    	val valuedObject = createValuedObject(valuedObjectName);
    	declaration.valuedObjects += valuedObject
	  	if (!scope.declarations.contains(declaration)) {
    		scope.declarations += declaration
    	}
    	valuedObject
    }
    

    //===========  VARIABLES  ===========
    // Creates a new variable ValuedObject in a Scope.
//    def ValuedObject createVariable(Scope scope, String variableName) {
//        scope.createValuedObject(variableName)
//    }

    //============  SIGNALS  ============
    // Creates a new variable ValuedObject in a Scope.
// TODO: VERIFY: That's not the way it's meant to be.
//    def ValuedObject createSignal(Scope scope, String variableName) {
//        scope.createValuedObject(variableName).setIsSignal
//    }

    //-------------------------------------------------------------------------
    //--                           N A M I N G S                             --
    //-------------------------------------------------------------------------
    // Prefixes a name with the hash code of an eObject
    def int id(EObject eObject) {
        eObject.hashCode
    }

    // Prefixes a name with the hash code of an eObject
    def String id(EObject eObject, String string) {
        string + eObject.id
    }

    // Prefixes a name with the generated prefix string
    def String id(String string) {
        GENERATED_PREFIX + string;
    }

    // For C variables it is necessary to remove special characters, this may lead
    // to name clashes in unlikely cases. 
    def String removeSpecialCharacters(String string) {
        if (string == null) {
            return null;
        }
        return string.replace("-", "").replace("_", "").replace(" ", "").replace("+", "").replace("#", "").
            replace("$", "").replace("?", "").replace("!", "").replace("%", "").replace("&", "").replace("[", "").
            replace("]", "").replace("<", "").replace(">", "").replace(".", "").replace(",", "").replace(":", "").
            replace(";", "").replace("=", "");
    }

    // This helper method returns the hierarchical name of a state considering all hierarchical
    // higher states. A string is formed by the traversed state IDs.
    def String getHierarchicalName(Scope scope) {
        scope.getHierarchicalName(null)
    }

    def String getHierarchicalName(Scope scope, String decendingName) {
        if (scope == null)
            return decendingName
        else {
            var scopeId = "";
            if (scope.id != null) {
                scopeId = scope.id
            } else {
                val parent = (scope.eContainer as Scope);
                if (parent instanceof State) {
                    scopeId = "region" + parent.regions.indexOf(scope)
                }
            }
            return (scope.eContainer as Scope).getHierarchicalName(scopeId + "_" + decendingName)
        }
    }


    //-------------------------------------------------------------------------
    //--  F I X   F O R   T E R M I N A T I O N S   / W    E F F E C T S     --
    //-------------------------------------------------------------------------
    // This fixes termination transitions that have effects
    def State fixTerminationWithEffects(State rootState, List<Transition> transitionList) {
        val terminationTransitions = transitionList.filter[type == TransitionType::TERMINATION].filter[
            !effects.nullOrEmpty].toList

        for (terminationTransition : terminationTransitions) {
            val originalSource = terminationTransition.sourceState
            val originalTarget = terminationTransition.targetState
            val region = originalSource.parentRegion
            val auxiliaryState = region.createState("_TE").uniqueName.trace(terminationTransition)
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
            !hasInnerStatesOrControlflowRegions && outgoingTransitions.nullOrEmpty && !final]

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
        val nonReachabledStates = rootState.allContainedStates.filter[!isStateReachable].toList

        for (nonReachabledState : nonReachabledStates.immutableCopy) {
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
    def State transformLocalValuedObject(State rootState, List<State> stateList) {

        // Traverse all states
        for (targetState : stateList) {
            targetState.transformExposeLocalValuedObject(rootState, false);
        }
        rootState;
    }

    // Traverse all states and transform possible local valuedObjects.
    def void transformExposeLocalValuedObject(State state, State targetRootState, boolean expose) {

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
                    valuedObject.uniqueName
                }
            }
        }

    }

    def void transformLocalValuedObjectCached(List<Scope> scopeList, Scope targetScope, List<String> uniqueNameCache) {

        // Traverse all states
        for (scope : scopeList) {
            scope.transformExposeLocalValuedObjectCached(targetScope, false, uniqueNameCache);
        }
    }

    // Traverse all states and transform possible local valuedObjects.
    def void transformExposeLocalValuedObjectCached(Scope scope, Scope targetScope, boolean expose,
        List<String> uniqueNameCache) {

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
                valuedObject.uniqueNameCached(uniqueNameCache)
            }
        }
    }

    // -------------------------------------------------------------------------   
    def void replaceAllReferences(Scope scope, ValuedObject valuedObject, Expression expression) {
        for (obj : scope.eAllContents.immutableCopy) {
            if (obj instanceof ValuedObjectReference && (obj as ValuedObjectReference).valuedObject == valuedObject) {
                obj.replace(expression)
            }
        }
    }

    def void replaceAllReferencesWithCopy(Scope scope, ValuedObject valuedObject, Expression expression) {
        for (obj : scope.eAllContents.immutableCopy) {
            if (obj instanceof ValuedObjectReference && (obj as ValuedObjectReference).valuedObject == valuedObject) {
                obj.replace(expression.copy)
            }
        }
    }

    def void replaceAllOccurrences(Scope scope, ValuedObject valuedObject, ValuedObject replacement) {
        val relevantObjects = scope.eAllContents.filter(
            e|
                e instanceof ValuedObjectReference || e instanceof Assignment ||
                    e instanceof Emission || e instanceof Binding || e instanceof Assignment
        ).immutableCopy;
        for (obj : relevantObjects) {
            if (obj instanceof ValuedObjectReference && (obj as ValuedObjectReference).valuedObject == valuedObject) {
                val valuedObjectReference = (obj as ValuedObjectReference)
                val valuedObjectReferenceCopy = valuedObjectReference.nontracingCopy;
                val replacementValuedObjectReference = replacement.reference;
                obj.replace(replacementValuedObjectReference)
                replacementValuedObjectReference.indices.clear
                for (index : valuedObjectReferenceCopy.indices) {
                    replacementValuedObjectReference.indices.add(index.nontracingCopy);
                }
            } else if (obj instanceof Assignment && (obj as Assignment).valuedObject == valuedObject) {
                val assignment = (obj as Assignment)
                val assignmentCopy = assignment.nontracingCopy;
                assignment.valuedObject = replacement;
                assignment.indices.clear
                for (index : assignmentCopy.indices) {
                    assignment.indices.add(index.nontracingCopy);
                }
            } else if (obj instanceof Emission && (obj as Emission).valuedObject == valuedObject) {
                (obj as Emission).valuedObject = replacement;
            } else if (obj instanceof Binding) {
                if((obj as Binding).formal == valuedObject) (obj as Binding).formal = replacement
                if((obj as Binding).actual == valuedObject) (obj as Binding).actual = replacement
            } else if (obj instanceof Assignment && (obj as Assignment).valuedObject == valuedObject) {
                (obj as Assignment).valuedObject = replacement;
            }      

        }
    }

    def ValuedObject findValuedObjectByName(Declaration declaration, String name) {
        if (declaration.valuedObjects.filter[it.name == name].size > 0)
            declaration.valuedObjects.filter[it.name == name].head
        else
            null
    }

    def ValuedObject findValuedObjectByName(Scope scope, String name) {
        var EObject container = scope
        while (container != null) {
            var EList<Declaration> declarations = null
            if (container instanceof State)
                declarations = (container as State).declarations
            else if (container instanceof ControlflowRegion)
                declarations = (container as ControlflowRegion).declarations
            if (!declarations.nullOrEmpty)
                for (declaration : declarations) {
                    val valuedObject = declaration.findValuedObjectByName(name)
                    if(valuedObject != null) return valuedObject
                }
            container = container.eContainer
        }
        null
    }

    def State copyState(State state) {
        val newState = state.nontracingCopy

        // Fix valued object references
        state.valuedObjects.forEach [
            val newValuedObject = newState.findValuedObjectByName(it.name)
            if (newValuedObject != null) {
                newState.replaceAllOccurrences(it, newValuedObject)
            }
        ]
        newState
    }
    
    
    
    def asSCCharts(EObject eObject) {
        eObject as SCCharts
    }
    
    def asState(EObject eObject) {
        eObject as State
    }

    def asControlflowRegion(EObject eObject) {
        eObject as ControlflowRegion
    }
    
    def asDataflowRegion(EObject eObject) {
        eObject as DataflowRegion
    }
    
    def asTransition(EObject eObject) {
        eObject as Transition
    }
}
