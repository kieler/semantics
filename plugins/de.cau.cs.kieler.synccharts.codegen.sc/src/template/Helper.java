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

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.TransitionType;
import de.cau.cs.kieler.synccharts.codegen.sc.Dependency;
import de.cau.cs.kieler.synccharts.codegen.sc.Graph;
import de.cau.cs.kieler.synccharts.codegen.sc.Tuple;

public class Helper {

    private static ArrayList<Dependency> stateDependencies = new ArrayList<Dependency>();
    private static ArrayList<Tuple<State, Integer>> stateListSorted = new ArrayList<Tuple<State, Integer>>();
    private static ArrayList<Tuple<State, Integer>> realStateList = new ArrayList<Tuple<State, Integer>>();
    private static ArrayList<Signal> stateSignalList = new ArrayList<Signal>();
    private static ArrayList<String> childStateList = new ArrayList<String>();
    private static ArrayList<State> checkedStateList = new ArrayList<State>();
    private static ArrayList<Signal> allSignalsList = new ArrayList<Signal>();
    private static final int NORMAL_EDGE = 1;
    private static final int WEAK_EDGE = -1;
    private static final int WEAK_STATE = 1;
    private static final int STRONG_STATE = 2;
    private static final int SIMPLE_STATE = 0;

    /**
     * Computes the smallest priority of all child states in a macro state.
     * 
     * @param state
     *            the state, you want to get the priority for
     * @return the priority of the state
     */
    public static final int smallestChildPriority(final State state) {
        childStateList.clear();
        listAllChildThreads(state);
        int out = stateListSorted.size() + 1;
        for (String s : childStateList) {
            if (stateListSorted.contains(s)) {
                if ((stateListSorted.indexOf(s) + 1) < out) {
                    out = stateListSorted.indexOf(s) + 1;
                }
            }
        }
        return out;
    }

    /**
     * Computes a list with all states in the right order of their priority.
     * 
     * @param state
     *            the root state to start with
     * @return a sorted list (by priority) of states
     */
    public static final List<Tuple<State, Integer>> computeThreadPriorities(final State state) {
        stateDependencies.clear();
        realStateList.clear();
        stateListSorted.clear();
        fillDependencyList(state);
        printDependencyList();
        fillSortedThreadList();
        System.out.print("threadListSorted: ");
        printTupelList(stateListSorted);
        return stateListSorted;
    }

    /**
     * Computes the priority of the given state.
     * 
     * @param state
     *            the state you want to get the priority
     * @return priority of the state
     */
    public static final int computeRealThreadPriority(final State state) {
        return computeThreadPriority(state, false);
    }

    /**
     * Computes the priority of the given state.
     * 
     * @param state
     *            the state you want to get the priority
     * @return priority of the state
     */
    public static final int computeWeakThreadPriority(final State state) {
        return computeThreadPriority(state, true);
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
        List<State> sortedStates = new LinkedList<State>();
        return sortStateControlFlowHelp(sortedStates, state);
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
        allSignalsList.clear();
        allSignalsHelp(state);
        return allSignalsList;
    }

    private static int computeThreadPriority(final State state, final boolean weak) {
        int out = 0;
        Tuple<State, Integer> priorityState;
        if (weak) {
            priorityState = new Tuple<State, Integer>(state, WEAK_STATE);
        } else {
            priorityState = getStatePropertyTupel(state);
        }
        out = stateListSorted.indexOf(priorityState) + 1;
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
            if (!allSignalsList.contains(signal)) {
                allSignalsList.add(signal);
            }
        }
    }

    private static List<State> sortStateControlFlowHelp(final List<State> sortedStates,
            final State state) {
        sortedStates.add(state);
        for (Transition transition : state.getOutgoingTransitions()) {
            if (!sortedStates.contains(transition.getTargetState())) {
                sortStateControlFlowHelp(sortedStates, transition.getTargetState());
            }
        }
        return sortedStates;
    }

    private static List<String> listAllChildThreads(final State state) {
        for (Region r : state.getRegions()) {
            for (State s : r.getInnerStates()) {
                childStateList.add(s.getId());
                if (!s.getRegions().isEmpty()) {
                    listAllChildThreads(s);
                }
            }
        }
        return childStateList;
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
            if (dependency.getDependencyType() == WEAK_EDGE) {
                rel = " <= ";
            } else {
                rel = " < ";
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
        // add state to the checked State list
        checkedStateList.add(state);
        Tuple<State, Integer> sourceStateTupel = getStatePropertyTupel(state);
        // add tuple to the real state list
        realStateList.add(sourceStateTupel);
        for (Transition transition : state.getOutgoingTransitions()) {
            if (!transition.getSourceState().equals(transition.getTargetState())) {
                State targetState = transition.getTargetState();
                Tuple<State, Integer> targetStateTupel = getStatePropertyTupel(targetState);
                Dependency dependency = new Dependency(targetStateTupel, sourceStateTupel,
                        WEAK_EDGE);
                if (!stateDependencies.contains(dependency)) {
                    stateDependencies.add(dependency);
                    if (!checkedStateList.contains(targetState)) {
                        fillDependencyList(targetState);
                    }
                }
            }
        }

        if (sourceStateTupel.getO2() > SIMPLE_STATE) {
            for (Region region : state.getRegions()) {
                for (State innerState : region.getInnerStates()) {
                    // not the root state
                    if (state.getParentRegion().getParentState() != null) {
                        // if (innerState.isIsInitial()) {
                        int innerStateStatus = getStatePropertyTupel(innerState).getO2();
                        // state as weak state
                        putDependencyList(state, WEAK_STATE, innerState, innerStateStatus,
                                NORMAL_EDGE);
                        // state as strong state
                        putDependencyList(innerState, innerStateStatus, state, STRONG_STATE,
                                NORMAL_EDGE);
                        // inner state is hierarchical
                        if (innerStateStatus > SIMPLE_STATE) {
                            if (innerStateStatus == WEAK_STATE) {
                                // dependency for strong state
                                putDependencyList(state, WEAK_STATE, innerState, STRONG_STATE,
                                        NORMAL_EDGE);
                                putDependencyList(innerState, STRONG_STATE, state, STRONG_STATE,
                                        NORMAL_EDGE);
                            } else {
                                // dependency for weak state
                                putDependencyList(state, WEAK_STATE, innerState, WEAK_STATE,
                                        NORMAL_EDGE);
                                putDependencyList(innerState, WEAK_STATE, state, STRONG_STATE,
                                        NORMAL_EDGE);
                            }
                        }
                        // }
                    }
                    if (!checkedStateList.contains(innerState)) {
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
                // every outgoing transition
                for (Transition transition : innerState.getOutgoingTransitions()) {
                    // all signals from trigger and effect
                    // signalabh. in liste packen wenn noch nicht drin .....
                    System.out.println(transition.getTriggersAndEffects());
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
            if (edgeType == NORMAL_EDGE) {
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
            stateListSorted.add(stateTupel);
        }
    }

}
