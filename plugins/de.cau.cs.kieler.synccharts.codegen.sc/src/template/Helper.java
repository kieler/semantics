package template;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.codegen.sc.Graph;

public class Helper {

    private static ArrayList<String> dependencyList = new ArrayList<String>();
    private static ArrayList<String> threadList = new ArrayList<String>();

    private static void fillDependencyList(State state) {
        if (state.isIsInitial()) {
            if (state.getParentRegion().getParentState().getParentRegion().getParentState() != null) {
                dependencyList.add(state.getParentRegion().getParentState().getId() + "_weak<"
                        + state.getId() + "_weak");
                dependencyList.add(state.getId() + "_strong<"
                        + state.getParentRegion().getParentState().getId() + "_strong");
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
        threadList.clear();
        // TODO Liste von Signalen aus Abhängigkeiten erstellen
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

        // TODO Graph zusammen bauen
        Graph dependencyGraph = new Graph(threadListUnsorted.size());
        String sourceString;
        String targetString;
        int sourceInt;
        int targetInt;
        for (String s : dependencyList) {
            if (s.contains("=")) {
                sourceString = s.split("<=")[0];
                targetString = s.split("<=")[1];
                sourceInt = threadListUnsorted.indexOf(sourceString);
                targetInt = threadListUnsorted.indexOf(targetString);
                dependencyGraph.addEdge(sourceInt, targetInt, -1);
            } else {
                sourceString = s.split("<")[0];
                targetString = s.split("<")[1];
                sourceInt = threadListUnsorted.indexOf(sourceString);
                targetInt = threadListUnsorted.indexOf(targetString);
                dependencyGraph.addEdge(sourceInt, targetInt, 1);
            }
        }
        System.out.println(threadListUnsorted.toString());
        dependencyGraph.print();
        for (int i = 0; i < threadListUnsorted.size(); i++) {
            System.out.print(threadListUnsorted.get(i) + "\t :");
            System.out.println(dependencyGraph.successorList()[i]);
        }
        // TODO Topologische Sortierung
        // TODO threadlist füllen
    }

    public final static List<String> computeThreadPriorities(State state) {
        dependencyList.clear();
        fillDependencyList(state);
        fillSortedThreadList();
        return dependencyList;
    }

}
