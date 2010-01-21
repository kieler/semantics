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

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.TransitionType;
import de.cau.cs.kieler.synccharts.codegen.sc.Dependency;
import de.cau.cs.kieler.synccharts.codegen.sc.Graph;
import de.cau.cs.kieler.synccharts.codegen.sc.Tuple;

public class Helper {

    private static ArrayList<Dependency> dependencyList = new ArrayList<Dependency>();
    private static ArrayList<String> threadListSorted = new ArrayList<String>();
    private static ArrayList<Tuple<State, Integer>> realStateList = new ArrayList<Tuple<State, Integer>>();
    private static ArrayList<String> childThreadList = new ArrayList<String>();
    private static ArrayList<State> checkedStateList = new ArrayList<State>();
    private static final int NORMAL_EDGE = 1;
    private static final int WEAK_EDGE = -1;
    private static final int WEAK_STATE = 1;
    private static final int STRONG_STATE = 2;
    private static final int SIMPLE_STATE = 0;
    private static final int MAX_PRIO = 64;

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
        for (Dependency dependency : dependencyList) {
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
                if (!dependencyList.contains(dependency)) {
                    dependencyList.add(dependency);
                    if (!checkedStateList.contains(targetState)) {
                        fillDependencyList(targetState);
                    }
                }
            }
        }

        if (sourceStateTupel.getO2() > SIMPLE_STATE) {
            for (Region region : state.getRegions()) {
                for (State innerState : region.getInnerStates()) {
                    if (state.getParentRegion().getParentState() != null) {
                        if (innerState.isIsInitial()) {
                            // unterscheidung zwischen weak und strong bei parent und child
                            // beide möglichkeiten einfügen in dependency liste
                            Dependency depOne = new Dependency();
                            Dependency depTwo = new Dependency();
                            Tuple<State, Integer> parentStateTupelWeak = new Tuple<State, Integer>(
                                    state, WEAK_STATE);
                            Tuple<State, Integer> childStateTupel = getStatePropertyTupel(innerState);
                            depOne = builtDependency(parentStateTupelWeak, childStateTupel,
                                    NORMAL_EDGE);
                            if (!dependencyList.contains(depOne)) {
                                dependencyList.add(depOne);
                            }
                            Tuple<State, Integer> parentStateTupelStrong = new Tuple<State, Integer>(
                                    state, STRONG_STATE);
                            depTwo = builtDependency(childStateTupel, parentStateTupelStrong,
                                    NORMAL_EDGE);
                            if (!dependencyList.contains(depTwo)) {
                                dependencyList.add(depTwo);
                            }
                        }
                    }
                    if (!checkedStateList.contains(innerState)) {
                        fillDependencyList(innerState);
                    }
                }
            }
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

    private static void fillSortedThreadList() {
        // Build a unsorted list of all threads.
        ArrayList<Tuple<State, Integer>> threadListUnsorted = new ArrayList<Tuple<State, Integer>>();
        for (Dependency dependency : dependencyList) {
            if (!isInTupelList(threadListUnsorted, dependency.getFirstStateTupel())) {
                threadListUnsorted.add(dependency.getFirstStateTupel());
            }
            if (!isInTupelList(threadListUnsorted, dependency.getSecondStateTupel())) {
                threadListUnsorted.add(dependency.getSecondStateTupel());
            }
        }
        System.out.print("threadListUnsorted: ");
        printTupelList(threadListUnsorted);

        // Build a Graph with the dependencies of all threads.
        Graph dependencyGraph = new Graph(threadListUnsorted.size(), true);
        Tuple<State, Integer> sourceState;
        Tuple<State, Integer> targetState;
        int sourceInt;
        int targetInt;
        int edgeType;
        for (Dependency dependency : dependencyList) {
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
        System.out.println("threadListTopologicalSorted: " + threadListTopologicalSorted);
        // Remove all pseudo threads and fill the
        // thread list with threads in their right priority order.
        for (int i = 0; i < threadListTopologicalSorted.size(); i++) {
            int threadInt = threadListTopologicalSorted.get(i);
            Tuple<State, Integer> stateTupel = threadListUnsorted.get(threadInt);
            if (realStateList.contains(stateTupel)) {
                threadListSorted.add(stateTupel.getO1().getId());
            }
        }
    }

    /**
     * Computes the priority of the state. This is similar to the thread priority, if the state
     * represents a new thread
     * 
     * @param state
     *            the state, you want to get the priority for
     * @return the priority of the state
     */
    public static final int computeChangePriority(final State state) {
        childThreadList.clear();
        listAllChildThreads(state);
        LinkedList<Integer> intList = new LinkedList<Integer>();
        int mainThreadPriority = threadListSorted.size() + 1;
        for (String s : childThreadList) {
            if (threadListSorted.contains(s)) {
                intList.add(mainThreadPriority - 1 - threadListSorted.indexOf(s));
            }
        }
        return getMax(intList);
    }

    private static int getMax(final LinkedList<Integer> intList) {
        int out = MAX_PRIO;
        for (int minInt : intList) {
            if (minInt < out) {
                out = minInt;
            }
        }
        return out - 1;
    }

    private static List<String> listAllChildThreads(final State state) {
        for (Region r : state.getRegions()) {
            for (State s : r.getInnerStates()) {
                childThreadList.add(s.getId());
                if (!s.getRegions().isEmpty()) {
                    listAllChildThreads(s);
                }
            }
        }
        return childThreadList;
    }

    /**
     * Computes a list with all states in the right order of their priority.
     * 
     * @param state
     *            the root state to start with
     * @return a sorted list (by priority) of states
     */
    public static final List<String> computeThreadPriorities(final State state) {
        dependencyList.clear();
        realStateList.clear();
        threadListSorted.clear();
        fillDependencyList(state);
        printDependencyList();
        fillSortedThreadList();
        System.out.println("threadListSorted: " + threadListSorted.toString());
        return threadListSorted;
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
}
