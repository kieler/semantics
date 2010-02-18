/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package template;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.synccharts.Effect;
import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.SignalReference;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.TransitionType;
import de.cau.cs.kieler.synccharts.codegen.sc.Dependency;
import de.cau.cs.kieler.synccharts.codegen.sc.Graph;
import de.cau.cs.kieler.synccharts.codegen.sc.StateAndSignals;
import de.cau.cs.kieler.synccharts.codegen.sc.StatePlusTransition;

/**
 * The Helper class provides some helping functions for the generation of code.
 * 
 * @author tam
 * 
 */
public final class Helper {

    private Helper() {
        /*
         * To avoid the chekstyle warning we need a private constructor
         */
    }

    private static ArrayList<Dependency> stateDependencies = new ArrayList<Dependency>();
    private static ArrayList<StatePlusTransition> sortedStates = new ArrayList<StatePlusTransition>();
    private static ArrayList<StatePlusTransition> realStates = new ArrayList<StatePlusTransition>();
    private static ArrayList<StateAndSignals> stateSignalDependencies = new ArrayList<StateAndSignals>();
    private static ArrayList<State> neighborStates = new ArrayList<State>();
    private static ArrayList<Region> neighborRegions = new ArrayList<Region>();
    private static ArrayList<State> checkedStates = new ArrayList<State>();
    private static ArrayList<Signal> allSignals = new ArrayList<Signal>();
    private static ArrayList<Signal> triggerSignals = new ArrayList<Signal>();
    private static ArrayList<Signal> effectSignals = new ArrayList<Signal>();
    private static final int HIERARCHY_EDGE = 1;
    private static final int CONTROL_FLOW_EDGE = -1;
    private static final int SIGNAL_FLOW_EDGE = 2;
    private static final int TRANSITION_PRIO_EDGE = 0;
    private static final int WEAK_STATE = 1;
    private static final int STRONG_STATE = 2;
    private static final int SIMPLE_STATE = 0;
    private static final int LABEL_ANY_ID = 1;
    private static final int LABEL_SHORTEST_HIERARCHIE = 2;
    private static final int LABEL_COMPLETE_HIERARCHIE = 3;
    private static final int MAX_PRIORITY = 256;

    /**
     * Computes a list with all states in the right order of their priority.
     * 
     * @param state
     *            the root state to start with
     * @return a sorted list (by priority) of states
     */
    public static List<StatePlusTransition> computeThreadPriorities(final State state) {
        stateSignalDependencies.clear();
        stateDependencies.clear();
        realStates.clear();
        sortedStates.clear();
        fillStateSignalList(state);
        fillDependencyList(state);
        printDependencyList();
        fillSortedThreadList();
        System.out.print("threadListSorted: ");
        printStatePlusTransitionList(sortedStates);
        return sortedStates;
    }

    /**
     * Computes the real priority of the given state.
     * 
     * @param state
     *            the state you want to get the priority
     * @return priority of the state
     */
    public static int getRealThreadPriority(final State state) {
        return getThreadPriority(state, false);
    }

    /**
     * Computes the weak priority of the given state.
     * 
     * @param state
     *            the state you want to get the priority
     * @return priority of the state
     */
    public static int getWeakThreadPriority(final State state) {
        return getThreadPriority(state, true);
    }

    /**
     * A simple method to print debug information.
     * 
     * @param s
     *            debug information
     */
    public static void debug(final String s) {
        System.out.println(s);
    }

    /**
     * A method to throw an error.
     * 
     * @param s
     *            error information
     * @throws KiemInitializationException
     *             for error handling
     */
    public static void error(final String s) throws KiemInitializationException {
        System.out.println("hier");
        throw new KiemInitializationException("Error while generating SC code", true,
                new Exception(s));
    }

    /**
     * Computes a sorted list with states. The order of the list is the control flow of all states
     * in a region beginning with the initial one.
     * 
     * @param state
     *            the initial state to start with
     * @return a list, sorted by the control flow in the SyncChart
     */
    public static List<State> sortStateControlFlow(final State state) {
        List<State> listToSort = new LinkedList<State>();
        return sortStateControlFlowHelp(listToSort, state);
    }

    /**
     * Computes a list of all signals (global and local) that are used in the state and his
     * child-states.
     * 
     * @param state
     *            the state in which signals should be listed
     * @return a list of all signals in the states and child-states
     */
    public static List<Signal> allSignals(final State state) {
        allSignals.clear();
        allSignalsHelp(state);
        return allSignals;
    }

    /**
     * Returns unique a label for a state independent on the flag.
     * 
     * @param state
     *            the state for which a label should be generated
     * @param flag
     *            what kind of label is desired
     * @return unique label for a state
     */
    public static String getStateNameByFlag(final State state, final Integer flag) {
        String out = "";
        switch (flag) {
        case LABEL_ANY_ID:
            out = getStateNameAnyID(state);
            break;
        case LABEL_COMPLETE_HIERARCHIE:
            out = getStateNameCompleteHierarchie(state);
            break;
        case LABEL_SHORTEST_HIERARCHIE:
            out = getStateNameShortestHierarchie(state);
            break;
        default:
            out = getStateNameCompleteHierarchie(state);
            break;
        }
        return out;
    }

    /**
     * Not used?
     * 
     * @param state
     *            nut used?
     * @return not used?
     */
    public static List<StateAndSignals> getStateSignals(final State state) {
        stateSignalDependencies.clear();
        fillStateSignalList(state);
        return stateSignalDependencies;
    }

    /**
     * Computes the priority to change the thread priority depending on signal dependencies.
     * 
     * @param state
     *            the state for the priority
     * @return priority to change
     */
    public static int getChangePriority(final State state) {
        int out = MAX_PRIORITY;
        int newPrio = 0;
        ArrayList<StatePlusTransition> dependentStates = getSignalDependentStates(state);
        for (StatePlusTransition tuple : dependentStates) {
            newPrio = sortedStates.indexOf(tuple);
            if (newPrio < out) {
                out = newPrio;
            }
        }
        return out;
    }

    /**
     * Computes if the given state has signal dependent states.
     * 
     * @param state
     *            state to search for dependencies
     * @return true if the state has signal dependencies otherwise false
     */
    public static boolean hasDependentState(final State state) {
        return (!getSignalDependentStates(state).isEmpty());
    }

    /**
     * Computes if the given state has signal dependent states.
     * 
     * @param transition
     *            transition to search for dependencies
     * @return true if the transition is signal dependent otherwise false
     */
    public static boolean isSignalDependent(final Transition transition) {
        return (!getDependencyOwner(transition.getSourceState()).isEmpty());
    }

    private static String getStateNameAnyID(final State state) {
        String out = "";
        return out;
    }

    private static String getStateNameCompleteHierarchie(final State state) {
        String regionPrefix = "";
        if (state.getParentRegion().getParentState() != null) {
            if (state.getParentRegion().getParentState().getRegions().size() > 1) {
                regionPrefix = state.getParentRegion().getId() + "_";
            }
        }
        if (state.getParentRegion().getParentState() != null) {
            return getStateNameCompleteHierarchie(state.getParentRegion().getParentState()) + "_"
                    + regionPrefix + state.getId();
        } else {
            return regionPrefix + state.getId();
        }
    }

    private static String getStateNameShortestHierarchie(final State state) {
        String out = "";
        return out;
    }

    private static ArrayList<StatePlusTransition> getSignalDependentStates(final State state) {
        ArrayList<StatePlusTransition> out = new ArrayList<StatePlusTransition>();
        for (Dependency dep : stateDependencies) {
            if (dep.getSecondState().getState().equals(state)
                    && dep.getDependencyType() == SIGNAL_FLOW_EDGE) {
                out.add(dep.getFirstState());
            }
        }
        return out;
    }

    private static ArrayList<StatePlusTransition> getDependencyOwner(final State state) {
        ArrayList<StatePlusTransition> out = new ArrayList<StatePlusTransition>();
        for (Dependency dep : stateDependencies) {
            if (dep.getSecondState().getState().equals(state)
                    && dep.getDependencyType() == SIGNAL_FLOW_EDGE) {
                out.add(dep.getSecondState());
            }
        }
        return out;
    }

    private static void putSignalDependencies(final StatePlusTransition statePlusTransition) {
        // get signals of the state
        ArrayList<Signal> stateTriggerSignals = new ArrayList<Signal>();
        ArrayList<Signal> stateEffectSignals = new ArrayList<Signal>();
        for (StateAndSignals s : stateSignalDependencies) {
            if (statePlusTransition.equals(s.getStatePlusTransition().getState())) {
                stateTriggerSignals = s.getTriggerSignals();
                stateEffectSignals = s.getEffectSignals();
                break;
            }
        }

        neighborRegions.clear();
        neighborStates.clear();
        getNeighborRegions(statePlusTransition.getState());
        addNeighbors(neighborRegions);
        for (State neighborState : neighborStates) {
            // get signals of neighbor states and their child states
            if (!statePlusTransition.equals(neighborState)) {
                ArrayList<Signal> neighborEffectSignals = new ArrayList<Signal>();
                ArrayList<Signal> neighborTriggerSignals = new ArrayList<Signal>();
                for (StateAndSignals s : stateSignalDependencies) {
                    if (neighborState.equals(s.getStatePlusTransition().getState())) {
                        neighborEffectSignals = s.getEffectSignals();
                        neighborTriggerSignals = s.getTriggerSignals();
                        break;
                    }
                }
                StatePlusTransition neighborStatePlusTransition = null;
                neighborStatePlusTransition = getStateProperties(neighborState);
                // one direction
                if (!disjunkt(stateTriggerSignals, neighborEffectSignals)) {
                    // in dependency list eintragen
                    putDependencyList(statePlusTransition, neighborStatePlusTransition,
                            SIGNAL_FLOW_EDGE);
                }
                // other direction
                if (!disjunkt(stateEffectSignals, neighborTriggerSignals)) {
                    // in dependency list eintragen
                    putDependencyList(neighborStatePlusTransition, statePlusTransition,
                            SIGNAL_FLOW_EDGE);
                }
            }
        }
    }

    private static boolean disjunkt(final List<Signal> firstList, final List<Signal> secondList) {
        boolean out = true;
        if (firstList.isEmpty() || secondList.isEmpty()) {
            return out;
        } else {
            for (Signal firstSignal : firstList) {
                for (Signal secondSignal : secondList) {
                    if (firstSignal.equals(secondSignal)) {
                        out = false;
                        break;
                    }
                }
            }
        }
        return out;
    }

    private static int getThreadPriority(final State state, final boolean weak) {
        int out = 0;
        StatePlusTransition priorityState;
        if (weak) {
            priorityState = new StatePlusTransition(state, WEAK_STATE, null);
        } else {
            priorityState = getStateProperties(state);
        }
        out = sortedStates.indexOf(priorityState) + 1;
        return out;
    }

    private static void allSignalsHelp(final State state) {
        EList<Signal> tmp = state.getSignals();
        addSignalsToList(tmp);
        for (Region region : state.getRegions()) {
            for (State innerState : region.getInnerStates()) {
                if (!state.getRegions().isEmpty()) {
                    allSignalsHelp(innerState);
                }
            }
        }
    }

    private static void addSignalsToList(final List<Signal> signalList) {
        for (Signal signal : signalList) {
            if (!allSignals.contains(signal)) {
                allSignals.add(signal);
            }
        }
    }

    private static List<State> sortStateControlFlowHelp(final List<State> out, final State state) {
        out.add(state);
        for (Transition transition : state.getOutgoingTransitions()) {
            if (!out.contains(transition.getTargetState())) {
                sortStateControlFlowHelp(out, transition.getTargetState());
            }
        }
        return out;
    }

    private static void getNeighborRegions(final State state) {
        if (state.getParentRegion().getParentState() != null) {
            for (Region region : state.getParentRegion().getParentState().getRegions()) {
                if (!region.equals(state.getParentRegion())) {
                    neighborRegions.add(region);
                }
            }
            getNeighborRegions(state.getParentRegion().getParentState());
        }
    }

    private static void addNeighbors(final List<Region> regions) {
        for (Region region : regions) {
            for (State innerState : region.getInnerStates()) {
                if (!neighborStates.contains(innerState)) {
                    neighborStates.add(innerState);
                }
                if (!innerState.getRegions().isEmpty()) {
                    addNeighbors(innerState.getRegions());
                }
            }
        }
    }

    private static void printStatePlusTransitionList(final ArrayList<StatePlusTransition> list) {
        System.out.print("[");
        for (StatePlusTransition state : list) {
            String weakStrong = "";
            weakStrong = stateType2String(state.getType());
            System.out.print(state.getState().getId() + weakStrong + " , ");
        }
        System.out.println("]");
    }

    private static void printDependencyList() {
        System.out.print("dependencyList: [ ");
        for (Dependency dependency : stateDependencies) {
            String weakStrongFirst = "";
            String weakStrongSecond = "";
            String rel = "";
            String first = "";
            String second = "";
            weakStrongFirst = stateType2String(dependency.getFirstState().getType());
            weakStrongSecond = stateType2String(dependency.getSecondState().getType());
            if (dependency.getDependencyType() == CONTROL_FLOW_EDGE) {
                rel = " <c< ";
            } else if (dependency.getDependencyType() == HIERARCHY_EDGE) {
                rel = " <h< ";
            } else {
                rel = " <s< ";
            }
            first = dependency.getFirstState().getState().getId();
            second = dependency.getSecondState().getState().getId();
            System.out.print(first + weakStrongFirst + rel + second + weakStrongSecond + " , ");

        }
        System.out.println("] ");
    }

    private static Dependency builtDependency(final StatePlusTransition firstState,
            final StatePlusTransition secondState, final int edgeType) {
        Dependency out = new Dependency(firstState, secondState, edgeType);
        return out;
    }

    // Build a list of all possible dependencies in the SyncChart.
    private static void fillDependencyList(final State state) {
        if (state.getParentRegion().getParentState() != null) {
            for (Transition transition : state.getOutgoingTransitions()) {
                StatePlusTransition put = new StatePlusTransition();
                put.setState(state);
                put.setTransition(transition);
                put.setType(getStateProperties(state).getType());
                putSignalDependencies(put);
            }
        }
        // add state to the checked State list
        checkedStates.add(state);
        StatePlusTransition sourceStatePlusTrans = getStateProperties(state);
        // add tuple to the real state list
        realStates.add(sourceStatePlusTrans);
        for (Transition transition : state.getOutgoingTransitions()) {
            if (!transition.getSourceState().equals(transition.getTargetState())) {
                State targetState = transition.getTargetState();
                StatePlusTransition targetStatePlusTrans = getStateProperties(targetState);
                Dependency dependency = new Dependency(targetStatePlusTrans, sourceStatePlusTrans,
                        CONTROL_FLOW_EDGE);
                if (!stateDependencies.contains(dependency)) {
                    stateDependencies.add(dependency);
                    if (!checkedStates.contains(targetState)) {
                        fillDependencyList(targetState);
                    }
                }
            }
        }

        StatePlusTransition sptOne = new StatePlusTransition();
        StatePlusTransition sptTwo = new StatePlusTransition();

        // properties do not change
        sptOne.setState(state);
        sptOne.setTransition(null);
        sptTwo.setTransition(null);

        if (sourceStatePlusTrans.getType() > SIMPLE_STATE) {
            for (Region region : state.getRegions()) {
                for (State innerState : region.getInnerStates()) {
                    int innerStateStatus = getStateProperties(innerState).getType();
                    sptTwo.setState(innerState);
                    sptTwo.setType(innerStateStatus);
                    // state as weak state
                    sptOne.setType(WEAK_STATE);
                    putDependencyList(sptOne, sptTwo, HIERARCHY_EDGE);
                    // state as strong state
                    sptOne.setType(STRONG_STATE);
                    putDependencyList(sptTwo, sptOne, HIERARCHY_EDGE);

                    /**
                     * TODO TODO sptTwo und sptOne neu instanziieren! TODO TODO
                     */

                    // inner state is hierarchical
                    if (innerStateStatus > SIMPLE_STATE) {
                        // inner state is concurrent
                        if (innerStateStatus == WEAK_STATE) {
                            // dependency for strong state
                            sptOne.setType(WEAK_STATE);
                            sptTwo.setType(STRONG_STATE);
                            putDependencyList(sptOne, sptTwo, HIERARCHY_EDGE);
                            sptOne.setType(STRONG_STATE);
                            sptTwo.setType(STRONG_STATE);
                            putDependencyList(sptTwo, sptOne, HIERARCHY_EDGE);
                        } else {
                            // dependency for weak state
                            sptOne.setType(WEAK_STATE);
                            sptTwo.setType(WEAK_STATE);
                            putDependencyList(sptOne, sptTwo, HIERARCHY_EDGE);
                            sptOne.setType(STRONG_STATE);
                            sptTwo.setType(WEAK_STATE);
                            putDependencyList(sptTwo, sptOne, HIERARCHY_EDGE);
                        }
                    }
                    if (!checkedStates.contains(innerState)) {
                        fillDependencyList(innerState);
                    }
                }
            }
        }

    }

    private static void putDependencyList(final StatePlusTransition stateOne,
            final StatePlusTransition stateTwo, final int dependency) {
        Dependency put = builtDependency(stateOne, stateTwo, dependency);
        if (!stateDependencies.contains(put)) {
            stateDependencies.add(put);
        }
        printDependencyList();
    }

    private static StatePlusTransition getStateProperties(final State state) {
        StatePlusTransition out = new StatePlusTransition();
        int stateProperty = SIMPLE_STATE;
        if (!state.getRegions().isEmpty()) {
            stateProperty = WEAK_STATE;
            for (Transition transition : state.getOutgoingTransitions()) {
                if (transition.getType() == TransitionType.STRONGABORT) {
                    stateProperty = STRONG_STATE;
                    break;
                }
            }
        }
        out.setState(state);
        out.setType(stateProperty);
        out.setTransition(null);
        return out;
    }

    private static boolean isInTupelList(final ArrayList<StatePlusTransition> list,
            final StatePlusTransition state) {
        boolean out = false;
        for (StatePlusTransition listTupel : list) {
            if (listTupel.equals(state)) {
                out = true;
                break;
            }
        }
        return out;
    }

    private static String stateType2String(final int stateType) {
        String out = "";
        switch (stateType) {
        case WEAK_STATE:
            out = "_weak";
            break;
        case STRONG_STATE:
            out = "_strong";
            break;
        default:
            break;
        }
        return out;
    }

    private static void fillTriggerSignals(final Transition transition) {
        // simple signals
        if (transition.getTrigger() instanceof SignalReference) {
            // put trigger signal into the list
            Signal triggerSignal = ((SignalReference) transition.getTrigger()).getSignal();
            if (!triggerSignals.contains(triggerSignal)) {
                triggerSignals.add(triggerSignal);
            }
        }
    }

    private static void fillEffectSignals(final Transition transition) {
        EList<Effect> tmpEffectSignals = transition.getEffects();
        // put all effect signals into the list
        for (Effect effect : tmpEffectSignals) {
            if (effect instanceof Emission) {
                Signal effectSignal = ((Emission) effect).getSignal();
                if (!effectSignals.contains(effectSignal)) {
                    effectSignals.add(effectSignal);
                }
            }
        }
        // if the target state has an immediate
        // outgoing transition put its signals to the source state ones
        for (Transition targetTrans : transition.getTargetState().getOutgoingTransitions()) {
            if (targetTrans.isIsImmediate()) {
                fillEffectSignals(targetTrans);
            }
        }
    }

    private static void fillStateSignalList(final State state) {
        // every region
        for (Region region : state.getRegions()) {
            // every state
            for (State innerState : region.getInnerStates()) {
                for (Transition transition : innerState.getOutgoingTransitions()) {
                    StateAndSignals stateAndSignals = new StateAndSignals();
                    triggerSignals.clear();
                    effectSignals.clear();
                    // every outgoing transition
                    fillTriggerSignals(transition);
                    fillEffectSignals(transition);
                    ArrayList<Signal> triggers = copyFromList(triggerSignals);
                    ArrayList<Signal> effects = copyFromList(effectSignals);

                    if (!(triggers.isEmpty() && effects.isEmpty())) {
                        StatePlusTransition s = getStateProperties(innerState);
                        s.setTransition(transition);
                        stateAndSignals.setState(s);
                        stateAndSignals.setTriggerSignals(triggers);
                        stateAndSignals.setEffectSignals(effects);
                        if (!stateSignalDependencies.contains(stateAndSignals)) {
                            stateSignalDependencies.add(stateAndSignals);
                        }
                    }
                    if (!innerState.getRegions().isEmpty()) {
                        fillStateSignalList(innerState);
                    }
                }
            }
        }
    }

    private static ArrayList<Signal> copyFromList(final ArrayList<Signal> in) {
        ArrayList<Signal> out = new ArrayList<Signal>();
        for (Signal signal : in) {
            out.add(signal);
        }
        return out;
    }

    private static void fillSortedThreadList() {
        // Build a unsorted list of all threads.
        ArrayList<StatePlusTransition> threadListUnsorted = new ArrayList<StatePlusTransition>();
        for (Dependency dependency : stateDependencies) {
            if (!isInTupelList(threadListUnsorted, dependency.getFirstState())) {
                threadListUnsorted.add(dependency.getFirstState());
            }
            if (!isInTupelList(threadListUnsorted, dependency.getSecondState())) {
                threadListUnsorted.add(dependency.getSecondState());
            }
        }

        // Build a Graph with the dependencies of all threads.
        Graph dependencyGraph = new Graph(threadListUnsorted.size(), true);
        StatePlusTransition sourceState;
        StatePlusTransition targetState;
        int sourceInt;
        int targetInt;
        int edgeType;
        for (Dependency dependency : stateDependencies) {
            sourceState = dependency.getFirstState();
            targetState = dependency.getSecondState();
            edgeType = dependency.getDependencyType();
            sourceInt = threadListUnsorted.indexOf(sourceState);
            targetInt = threadListUnsorted.indexOf(targetState);
            dependencyGraph.addEdge(sourceInt, targetInt, edgeType);
        }

        // Make a topological sort of the dependency graph.
        LinkedList<Integer> threadListTopologicalSorted;
        threadListTopologicalSorted = dependencyGraph.topologicalSort();
        // Remove all pseudo threads and fill the
        // thread list with threads in their right priority order.
        for (int i = 0; i < threadListTopologicalSorted.size(); i++) {
            int threadInt = threadListTopologicalSorted.get(i);
            StatePlusTransition stateTupel = threadListUnsorted.get(threadInt);
            sortedStates.add(stateTupel);
        }
    }

}
