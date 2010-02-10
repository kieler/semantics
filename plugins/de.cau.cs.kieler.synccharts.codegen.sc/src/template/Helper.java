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
import de.cau.cs.kieler.synccharts.codegen.sc.StateSignalDependency;
import de.cau.cs.kieler.synccharts.codegen.sc.Tuple;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

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
    private static ArrayList<Tuple<State, Integer>> sortedStates = new ArrayList<Tuple<State, Integer>>();
    private static ArrayList<Tuple<State, Integer>> realStates = new ArrayList<Tuple<State, Integer>>();
    private static ArrayList<StateSignalDependency> stateSignalDependencies = new ArrayList<StateSignalDependency>();
    private static ArrayList<State> childStates = new ArrayList<State>();
    private static ArrayList<State> checkedStates = new ArrayList<State>();
    private static ArrayList<Signal> allSignals = new ArrayList<Signal>();
    private static final int HIERARCHY_EDGE = 1;
    private static final int CONTROL_FLOW_EDGE = -1;
    private static final int SIGNAL_FLOW_EDGE = 2;
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
    public static List<Tuple<State, Integer>> computeThreadPriorities(final State state) {
        stateSignalDependencies.clear();
        stateDependencies.clear();
        realStates.clear();
        sortedStates.clear();
        fillStateSignalList(state);
        fillDependencyList(state);
        printDependencyList();
        fillSortedThreadList();
        System.out.print("threadListSorted: ");
        printTupelList(sortedStates);
        return sortedStates;
    }

    /**
     * Computes the real priority of the given state.
     * 
     * @param state
     *            the state you want to get the priority
     * @return priority of the state
     */
    public static int computeRealThreadPriority(final State state) {
        return computeThreadPriority(state, false);
    }

    /**
     * Computes the weak priority of the given state.
     * 
     * @param state
     *            the state you want to get the priority
     * @return priority of the state
     */
    public static int computeWeakThreadPriority(final State state) {
        return computeThreadPriority(state, true);
    }

    /**
     * A simple method to print debug information.
     * 
     * @param s
     *            debug information
     */
    public static void debug(final String s) {
        System.out.println(s);
        // return s;
    }
    
    /**
     * A method to throw an error.
     * 
     * @param s
     *            error information
     * @throws KiemInitializationException 
     */
    public static void error(final String s) throws KiemInitializationException {
        System.out.println("hier");
        throw new KiemInitializationException("Error while generating SC code", true, new Exception(s));
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
    public static List<StateSignalDependency> getStateSignals(final State state) {
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
        ArrayList<Tuple<State, Integer>> dependentStates = getSignalDependentStates(state);
        for (Tuple<State, Integer> tuple : dependentStates) {
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

    private static ArrayList<Tuple<State, Integer>> getSignalDependentStates(final State state) {
        ArrayList<Tuple<State, Integer>> out = new ArrayList<Tuple<State, Integer>>();
        for (Dependency dep : stateDependencies) {
            if (dep.getSecondStateTupel().getO1().equals(state)
                    && dep.getDependencyType() == SIGNAL_FLOW_EDGE) {
                out.add(dep.getFirstStateTupel());
            }
        }
        return out;
    }

    private static void putSignalDependencies(final State state) {
        // get signals of the state
        ArrayList<Signal> stateTriggerSignals = new ArrayList<Signal>();
        ArrayList<Signal> stateEffectSignals = new ArrayList<Signal>();
        for (StateSignalDependency s : stateSignalDependencies) {
            if (state.equals(s.getState())) {
                stateTriggerSignals = s.getTriggerSignals();
                stateEffectSignals = s.getEffectSignals();
                break;
            }
        }

        childStates.clear();
        listAllChildStates(state.getParentRegion().getParentState());
        for (State neighborState : childStates) {
            // get signals of neighbor states and their child states
            if (!state.equals(neighborState)) {
                ArrayList<Signal> neighborEffectSignals = new ArrayList<Signal>();
                ArrayList<Signal> neighborTriggerSignals = new ArrayList<Signal>();
                for (StateSignalDependency s : stateSignalDependencies) {
                    if (neighborState.equals(s.getState())) {
                        neighborEffectSignals = s.getEffectSignals();
                        neighborTriggerSignals = s.getTriggerSignals();
                        break;
                    }
                }
                // one direction
                if (!disjunkt(stateTriggerSignals, neighborEffectSignals)) {
                    // in dependency list eintragen
                    Tuple<State, Integer> firstTuple = getStatePropertyTupel(state);
                    Tuple<State, Integer> secondTuple = getStatePropertyTupel(neighborState);
                    Dependency signalDependency = builtDependency(firstTuple, secondTuple,
                            SIGNAL_FLOW_EDGE);
                    System.out.println("added " + state.getId() + " -> " + neighborState.getId());
                    stateDependencies.add(signalDependency);
                }
                // other direction
                if (!disjunkt(stateEffectSignals, neighborTriggerSignals)) {
                    // in dependency list eintragen
                    Tuple<State, Integer> firstTuple = getStatePropertyTupel(neighborState);
                    Tuple<State, Integer> secondTuple = getStatePropertyTupel(state);
                    Dependency signalDependency = builtDependency(firstTuple, secondTuple,
                            SIGNAL_FLOW_EDGE);
                    System.out.println("added " + neighborState.getId() + " -> " + state.getId());
                    stateDependencies.add(signalDependency);
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

    private static int computeThreadPriority(final State state, final boolean weak) {
        int out = 0;
        Tuple<State, Integer> priorityState;
        if (weak) {
            priorityState = new Tuple<State, Integer>(state, WEAK_STATE);
        } else {
            priorityState = getStatePropertyTupel(state);
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

    private static void listAllChildStates(final State state) {
        for (Region r : state.getRegions()) {
            for (State s : r.getInnerStates()) {
                if (!childStates.contains(s)) {
                    childStates.add(s);
                }
                if (!s.getRegions().isEmpty()) {
                    listAllChildStates(s);
                }
            }
        }
    }

    private static void printTupelList(final ArrayList<Tuple<State, Integer>> list) {
        System.out.print("[");
        for (Tuple<State, Integer> tupel : list) {
            String weakStrong = "";
            weakStrong = stateType2String(tupel.getO2());
            System.out.print(tupel.getO1().getId() + weakStrong + " , ");
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
            weakStrongFirst = stateType2String(dependency.getFirstStateTupel().getO2());
            weakStrongSecond = stateType2String(dependency.getSecondStateTupel().getO2());
            if (dependency.getDependencyType() == CONTROL_FLOW_EDGE) {
                rel = " <c< ";
            } else if (dependency.getDependencyType() == HIERARCHY_EDGE) {
                rel = " <h< ";
            } else {
                rel = " <s<";
            }
            first = dependency.getFirstStateTupel().getO1().getId();
            second = dependency.getSecondStateTupel().getO1().getId();
            System.out.print(first + weakStrongFirst + rel + second + weakStrongSecond + " , ");

        }
        System.out.println("] ");
    }

    private static Dependency builtDependency(final Tuple<State, Integer> firstState,
            final Tuple<State, Integer> secondState, final int edgeType) {
        Dependency out = new Dependency(firstState, secondState, edgeType);
        return out;
    }

    // Build a list of all possible dependencies in the SyncChart.
    private static void fillDependencyList(final State state) {
        System.out.println(state.getId());
        if (state.getParentRegion().getParentState() != null) {
            putSignalDependencies(state);
        }
        // add state to the checked State list
        checkedStates.add(state);
        Tuple<State, Integer> sourceStateTupel = getStatePropertyTupel(state);
        // add tuple to the real state list
        realStates.add(sourceStateTupel);
        for (Transition transition : state.getOutgoingTransitions()) {
            if (!transition.getSourceState().equals(transition.getTargetState())) {
                State targetState = transition.getTargetState();
                Tuple<State, Integer> targetStateTupel = getStatePropertyTupel(targetState);
                Dependency dependency = new Dependency(targetStateTupel, sourceStateTupel,
                        CONTROL_FLOW_EDGE);
                if (!stateDependencies.contains(dependency)) {
                    stateDependencies.add(dependency);
                    if (!checkedStates.contains(targetState)) {
                        fillDependencyList(targetState);
                    }
                }
            }
        }

        if (sourceStateTupel.getO2() > SIMPLE_STATE) {
            for (Region region : state.getRegions()) {
                for (State innerState : region.getInnerStates()) {
                    int innerStateStatus = getStatePropertyTupel(innerState).getO2();
                    // state as weak state
                    putDependencyList(state, WEAK_STATE, innerState, innerStateStatus,
                            HIERARCHY_EDGE);
                    // state as strong state
                    putDependencyList(innerState, innerStateStatus, state, STRONG_STATE,
                            HIERARCHY_EDGE);

                    // inner state is hierarchical
                    if (innerStateStatus > SIMPLE_STATE) {
                        // inner state is concurrent
                        if (innerStateStatus == WEAK_STATE) {
                            // dependency for strong state
                            putDependencyList(state, WEAK_STATE, innerState, STRONG_STATE,
                                    HIERARCHY_EDGE);
                            putDependencyList(innerState, STRONG_STATE, state, STRONG_STATE,
                                    HIERARCHY_EDGE);
                        } else {
                            // dependency for weak state
                            putDependencyList(state, WEAK_STATE, innerState, WEAK_STATE,
                                    HIERARCHY_EDGE);
                            putDependencyList(innerState, WEAK_STATE, state, STRONG_STATE,
                                    HIERARCHY_EDGE);
                        }
                    }
                    if (!checkedStates.contains(innerState)) {
                        fillDependencyList(innerState);
                    }
                }
            }
        }

    }

    private static void putDependencyList(final State stateOne, final int typeOne,
            final State stateTwo, final int typeTwo, final int dependency) {
        Tuple<State, Integer> first = new Tuple<State, Integer>(stateOne, typeOne);
        Tuple<State, Integer> second = new Tuple<State, Integer>(stateTwo, typeTwo);
        Dependency put = builtDependency(first, second, dependency);
        if (!stateDependencies.contains(put)) {
            stateDependencies.add(put);
        }
    }

    private static Tuple<State, Integer> getStatePropertyTupel(final State state) {
        Tuple<State, Integer> out = new Tuple<State, Integer>();
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
        out.setO1(state);
        out.setO2(stateProperty);
        return out;
    }

    private static boolean isInTupelList(final ArrayList<Tuple<State, Integer>> tupelList,
            final Tuple<State, Integer> tupel) {
        boolean out = false;
        for (Tuple<State, Integer> listTupel : tupelList) {
            if (listTupel.equals(tupel)) {
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

    private static void fillStateSignalList(final State state) {
        // every region
        for (Region region : state.getRegions()) {
            // every state
            for (State innerState : region.getInnerStates()) {
                StateSignalDependency stateAndSignals = new StateSignalDependency();
                ArrayList<Signal> triggerSignals = new ArrayList<Signal>();
                ArrayList<Signal> effectSignals = new ArrayList<Signal>();
                // every outgoing transition
                for (Transition transition : innerState.getOutgoingTransitions()) {
                    // simple signals
                    if (transition.getTrigger() instanceof SignalReference) {
                        // put trigger signal into the list
                        Signal triggerSignal = ((SignalReference) transition.getTrigger())
                                .getSignal();
                        if (!triggerSignals.contains(triggerSignal)) {
                            triggerSignals.add(triggerSignal);
                        }
                    }
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
                }
                if (!(triggerSignals.isEmpty() && effectSignals.isEmpty())) {
                    stateAndSignals.setState(innerState);
                    stateAndSignals.setTriggerSignals(triggerSignals);
                    stateAndSignals.setEffectSignals(effectSignals);
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

    private static void fillSortedThreadList() {
        // Build a unsorted list of all threads.
        ArrayList<Tuple<State, Integer>> threadListUnsorted = new ArrayList<Tuple<State, Integer>>();
        for (Dependency dependency : stateDependencies) {
            if (!isInTupelList(threadListUnsorted, dependency.getFirstStateTupel())) {
                threadListUnsorted.add(dependency.getFirstStateTupel());
            }
            if (!isInTupelList(threadListUnsorted, dependency.getSecondStateTupel())) {
                threadListUnsorted.add(dependency.getSecondStateTupel());
            }
        }

        // Build a Graph with the dependencies of all threads.
        Graph dependencyGraph = new Graph(threadListUnsorted.size(), true);
        Tuple<State, Integer> sourceState;
        Tuple<State, Integer> targetState;
        int sourceInt;
        int targetInt;
        int edgeType;
        for (Dependency dependency : stateDependencies) {
            sourceState = dependency.getFirstStateTupel();
            targetState = dependency.getSecondStateTupel();
            edgeType = dependency.getDependencyType();
            sourceInt = threadListUnsorted.indexOf(sourceState);
            targetInt = threadListUnsorted.indexOf(targetState);
            /*
             * TODO for control flow edges too?, but first handle circles
             */
            if (edgeType != CONTROL_FLOW_EDGE) {
                dependencyGraph.addEdge(sourceInt, targetInt, edgeType);
            }
        }

        // Make a topological sort of the dependency graph.
        LinkedList<Integer> threadListTopologicalSorted = dependencyGraph.topologicalSort();
        // Remove all pseudo threads and fill the
        // thread list with threads in their right priority order.
        for (int i = 0; i < threadListTopologicalSorted.size(); i++) {
            int threadInt = threadListTopologicalSorted.get(i);
            Tuple<State, Integer> stateTupel = threadListUnsorted.get(threadInt);
            sortedStates.add(stateTupel);
        }
    }

}
