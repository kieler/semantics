package de.cau.cs.kieler.synccharts.codegen.sc;

import de.cau.cs.kieler.synccharts.State;

public class Dependency {
    private Tuple<State, Integer> firstStateTupel;
    private Tuple<State, Integer> secondStateTupel;
    private Integer dependencyType;

    public Dependency(Tuple<State, Integer> firstState, Tuple<State, Integer> secondState, int type) {
        firstStateTupel = firstState;
        secondStateTupel = secondState;
        dependencyType = type;
    }
    
    public Dependency(){
        firstStateTupel = null;
        secondStateTupel = null;
        dependencyType = 0;
    }

    public Tuple<State, Integer> getFirstStateTupel() {
        return firstStateTupel;
    }

    public Tuple<State, Integer> getSecondStateTupel() {
        return secondStateTupel;
    }
    
    public int getDependencyType() {
        return dependencyType;
    }
    
    public void setFirstStateTupel(Tuple<State, Integer> stateTupel) {
        firstStateTupel = stateTupel;
    }
    
    public void setSecondStateTupel(Tuple<State, Integer> stateTupel) {
        secondStateTupel = stateTupel;
    }
    
    public void setDependencyType(int type) {
        dependencyType = type;
    }
}
