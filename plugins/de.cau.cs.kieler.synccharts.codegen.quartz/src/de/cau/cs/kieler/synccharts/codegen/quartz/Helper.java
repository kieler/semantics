package de.cau.cs.kieler.synccharts.codegen.quartz;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import de.cau.cs.kieler.synccharts.State;


public class Helper {

	
	public static List<State> sortStates(List<State> states){
		LinkedList<State> res = new LinkedList<State>();
		HashSet<State> todo = new HashSet<State>(states);
		while(!todo.isEmpty()){
			State s = todo.iterator().next();
			res.addFirst(s);
			todo.remove(s);
			//TODO add successors by BFS
		}
		return res;
	}
	
}
