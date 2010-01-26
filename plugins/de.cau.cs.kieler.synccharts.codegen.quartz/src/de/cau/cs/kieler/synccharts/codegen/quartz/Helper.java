package de.cau.cs.kieler.synccharts.codegen.quartz;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;

public class Helper {
    public static List<State> sortStates(final List<State> states) {
        LinkedList<State> res = new LinkedList<State>();
        HashMap<State, Integer> todo = new HashMap<State, Integer>();
        // Initialize List
        
        for(State s: states){
            if(!todo.containsKey(s)){
                todo.put(s, 0);
            }
            for(Transition t: s.getOutgoingTransitions()){
                if(t.isIsImmediate()){
                    Integer value = todo.get(t.getTargetState());
                    if(value == null){
                        value=0;
                    }
                    value++;
                    if(todo.containsKey(t.getTargetState())){
                        todo.put(t.getTargetState(), value);
                    }
                }
            }
        }
        
        while (!todo.isEmpty()) {
            // search for state without unhandled, ingoing immediate transitions
            State s=null;
            for(Entry<State, Integer> e: todo.entrySet()){
                if(e.getValue()==0){
                    s=e.getKey();
                    break;
                }
            }
            if(s==null){
                // Cycle in immediate transitions, should be checked before
                break;
            }
            res.add(s);
            todo.remove(s);
            for(Transition t: s.getOutgoingTransitions()){
                if(t.isIsImmediate()){
                Integer value = todo.get(t.getTargetState());               
                value--;                
                todo.put(t.getTargetState(), value);
                }
            }
        }
        return res;
    }

}
