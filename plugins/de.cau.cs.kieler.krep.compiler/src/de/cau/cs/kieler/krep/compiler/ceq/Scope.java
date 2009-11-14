package de.cau.cs.kieler.krep.compiler.ceq;

import java.util.LinkedList;

public interface Scope {

     void add(LinkedList<Variable> vars);

    void add(Automaton ssm);

    void add(Equation eq);

    void addEq(LinkedList<Equation> eq);

}
