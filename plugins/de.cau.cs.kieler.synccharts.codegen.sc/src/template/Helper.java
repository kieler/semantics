package template;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.TransitionType;
import de.cau.cs.kieler.synccharts.codegen.sc.Graph;

public class Helper {

    private static ArrayList<String> dependencyList = new ArrayList<String>();
    private static ArrayList<String> threadListSorted = new ArrayList<String>();
    private static ArrayList<String> realThreadList = new ArrayList<String>();
    private static ArrayList<String> childThreadList = new ArrayList<String>();
    private static final int NORMAL_EDGE = 1;
    private static final int WEAK_EDGE = -1;
    private static final int MAX_PRIO = 64;

    // Build a list of all possible dependencies in the SyncChart.
    private static void fillDependencyList(State state) {

        // set the parent and child state
        String parentState = "";
        String childState = "";

        if (state.getParentRegion().getParentState() != null) {
            parentState = state.getParentRegion().getParentState().getId();
            childState = state.getId();
        }

        if (state.isIsInitial()) {

            boolean strongAbort = false;
            for (Transition t : state.getOutgoingTransitions()) {
                if (t.getType() == TransitionType.STRONGABORT) {
                    strongAbort = true;
                    break;
                }
            }

            String realState = "";
            // add just the real states to the list
            if (!state.getRegions().isEmpty()) {
                if (strongAbort) {
                    realState = state.getId() + "@@strong";
                } else {
                    realState = state.getId() + "@@weak";
                }

                if (!realThreadList.contains(realState)) {
                    realThreadList.add(realState);
                }
            } else {
                realThreadList.add(state.getId());
            }

            if (state.getParentRegion().getParentState().getParentRegion().getParentState() != null) {
                if (!state.getRegions().isEmpty()) {
                    dependencyList.add(childState + "@@weak<" + parentState + "@@weak");
                    dependencyList.add(parentState + "@@strong<" + childState + "@@strong");
                } else {
                    dependencyList.add(childState + "<" + parentState + "@@weak");
                    dependencyList.add(parentState + "@@strong<" + childState);
                }
            }
        }
        for (Transition transition : state.getOutgoingTransitions()) {
            if (transition.getSourceState() != transition.getTargetState()) {
                dependencyList.add(transition.getSourceState().getId() + "<="
                        + transition.getTargetState().getId());
                fillDependencyList(transition.getTargetState());
            }
        }
        for (Region region : state.getRegions()) {
            for (State innerState : region.getInnerStates()) {
                if (innerState.isIsInitial()) {
                    fillDependencyList(innerState);
                }
            }
        }
    }

    private static void fillSortedThreadList() {
        // Build a unsorted list of all threads.
        LinkedList<String> threadListUnsorted = new LinkedList<String>();
        for (String s : dependencyList) {
            String tmp = s.replace("=", "");
            if (!threadListUnsorted.contains(tmp.split("<")[0])) {
                threadListUnsorted.add(tmp.split("<")[0]);
            }
            if (!threadListUnsorted.contains(tmp.split("<")[1])) {
                threadListUnsorted.add(tmp.split("<")[1]);
            }
        }

        // Build a Graph with the dependencies of all threads.
        Graph dependencyGraph = new Graph(threadListUnsorted.size(), true);
        String sourceString;
        String targetString;
        int sourceInt;
        int targetInt;
        int edgeType;
        for (String s : dependencyList) {
            if (s.contains("=")) {
                sourceString = s.split("<=")[0];
                targetString = s.split("<=")[1];
                edgeType = WEAK_EDGE;
            } else {
                sourceString = s.split("<")[0];
                targetString = s.split("<")[1];
                edgeType = NORMAL_EDGE;
            }
            sourceInt = threadListUnsorted.indexOf(sourceString);
            targetInt = threadListUnsorted.indexOf(targetString);
            dependencyGraph.addEdge(sourceInt, targetInt, edgeType);
        }
        // Make a topological sort of the dependency graph.
        LinkedList<Integer> threadListTopologicalSorted = dependencyGraph.topologicalSort();
        // Remove all pseudo threads and fill the
        // thread list with threads in their right priority order.
        for (int i = 0; i < threadListTopologicalSorted.size(); i++) {
            int threadInt = threadListTopologicalSorted.get(i);
            String thread = threadListUnsorted.get(threadInt);
            if (realThreadList.contains(thread)) {
                threadListSorted.add(thread.split("@@")[0]);
            }
        }
    }

    public final static int computeChangePriority(State state) {
        childThreadList.clear();
        listAllChildThreads(state);
        LinkedList<Integer> intList = new LinkedList<Integer>();
        int mainThreadPriority = threadListSorted.size() + 1;
        for (String s : childThreadList) {
            if (threadListSorted.contains(s)){
                intList.add(mainThreadPriority - 1 - threadListSorted.indexOf(s));
            }
        }
        return getMax(intList);
    }
    
    private static int getMax(LinkedList<Integer> intList){
        int out = MAX_PRIO;
        for (int minInt : intList) {
            if (minInt < out){
                out = minInt;
            }
        }
        return out - 1;
    }

    private static List<String> listAllChildThreads(State state) {
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

    public final static List<String> computeThreadPriorities(State state) {
        dependencyList.clear();
        realThreadList.clear();
        threadListSorted.clear();
        fillDependencyList(state);
        fillSortedThreadList();
        System.out.println("unsortiert: \t" + realThreadList.toString());
        System.out.println("sortiert: \t" + threadListSorted.toString());
        return threadListSorted;
    }

}
