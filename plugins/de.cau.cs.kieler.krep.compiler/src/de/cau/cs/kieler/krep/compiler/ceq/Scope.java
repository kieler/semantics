package de.cau.cs.kieler.krep.compiler.ceq;

import java.util.LinkedList;

public interface Scope {

    public void add(LinkedList<Variable> vars);

    public void add(Automaton ssm);

    public void add(Equation eq);

    public void addEq(LinkedList<Equation> eq);

}
