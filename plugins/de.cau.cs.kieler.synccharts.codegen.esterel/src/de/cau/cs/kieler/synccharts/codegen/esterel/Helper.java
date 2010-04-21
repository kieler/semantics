package de.cau.cs.kieler.synccharts.codegen.esterel;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * @author ctr
 * 
 */
public class Helper {
    /**
     * Sort the states inside a region according to their immediate transitions. An immediate
     * transitions may only occur from a state to a successor state
     * 
     * @param states
     *            all states of a region
     * @return sorted list x
     */
    public static List<State> sortStates(final List<State> states) {
        final LinkedList<State> res = new LinkedList<State>();
        final HashMap<State, Integer> todo = new HashMap<State, Integer>();
        // Initialize List

        for (final State s : states) {
            if (!todo.containsKey(s)) {
                todo.put(s, 0);
            }
            for (final Transition t : s.getOutgoingTransitions()) {
                if (t.isIsImmediate()) {
                    Integer value = todo.get(t.getTargetState());
                    if (value == null) {
                        value = 0;
                    }
                    value++;
                    todo.put(t.getTargetState(), value);
                }
            }
        }

        while (!todo.isEmpty()) {
            // search for state without unhandled, ingoing immediate transitions
            State s = null;
            for (final Entry<State, Integer> e : todo.entrySet()) {
                if (e.getValue() == 0) {
                    s = e.getKey();
                    break;
                }
            }
            if (s == null) {
                // Cycle in immediate transitions, should be checked before
                break;
            }
            res.add(s);
            todo.remove(s);
            for (final Transition t : s.getOutgoingTransitions()) {
                if (t.isIsImmediate()) {
                    Integer value = todo.get(t.getTargetState());
                    value--;
                    todo.put(t.getTargetState(), value);
                }
            }
        }
        return res;
    }

}
