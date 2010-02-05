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
package de.cau.cs.kieler.krep.compiler.ceq;

import java.util.HashMap;
import java.util.LinkedList;

import de.cau.cs.kieler.krep.compiler.dependencies.DepGraph;
import de.cau.cs.kieler.krep.compiler.klp.Klp;
import de.cau.cs.kieler.krep.compiler.klp.instructions.Comment;
import de.cau.cs.kieler.krep.compiler.klp.instructions.Done;
import de.cau.cs.kieler.krep.compiler.klp.instructions.Instruction;
import de.cau.cs.kieler.krep.compiler.klp.instructions.Jmp;
import de.cau.cs.kieler.krep.compiler.klp.instructions.Label;
import de.cau.cs.kieler.krep.compiler.klp.instructions.Prio;

/**
 * A state in a Safe State Machine, consisting of a name, a flag whether this is an initial state,
 * and outgoing transitions. Transitions are either weak or strong aborts, normal termination is not
 * supported.
 * 
 * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp, tam
 *   

 * @author ctr
 * 
 */
public class State implements Scope {

    /**
     * @param n
     *            unique name of the state
     * @param initial
     *            true if this is an initial state
     */
    public State(final String n, final boolean initial) {

        this.isInitial = initial;
        this.name = n;
        content = new Scade(n);
    }

    private boolean isInitial;

    private String name;

    private Scade content;

    private LinkedList<Transition> saborts = new LinkedList<Transition>();
    private LinkedList<Transition> waborts = new LinkedList<Transition>();

    /**
     * Add outgoing strong abort.
     * 
     * @param t
     *            new transitions
     */
    public void addSAbort(final Transition t) {
        saborts.add(t);
    }

    /**
     * Add outgoing weak abort.
     * 
     * @param t
     *            new transitions
     */
    public void addWAbort(final Transition t) {
        waborts.add(t);
    }

    @Override
    public String toString() {
        StringBuffer res = new StringBuffer((isInitial ? "initial " : "") + "state " + name + "\n");
        if (!saborts.isEmpty()) {
            res.append("unless\n");
            for (Transition t : saborts) {
                res.append(t.toString() + "\n");
            }
        }
        res.append(content.toLustre());
        if (!waborts.isEmpty()) {
            res.append("until\n");
            for (Transition t : waborts) {
                res.append(t.toString() + "\n");
            }
        }

        return res.toString();
    }

    /**
     * 
     * {@inheritDoc}
     */
    public void add(final LinkedList<Variable> vars) {
        if (vars != null) {
            for (Variable v : vars) {
                content.addVar(v);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public void add(final Automaton ssm) {
        content.add(ssm);
    }

    /**
     * {@inheritDoc}
     */
    public void add(final Equation eq) {
        content.add(eq);
    }

    /**
     * {@inheritDoc}
     */
    public void addEq(final LinkedList<Equation> eq) {
        content.addEq(eq);

    }

    /**
     * propagate constant values .
     */
    public void propagateConst() {
        content.propagateConst();
    }

    /**
     * simplify contained equations.
     */
    public void simplify() {
        content.simplify();

    }

    /**
     * @return name of the state
     */
    public String getName() {
        return name;
    }

    /**
     * @return true if the state is an initial state.
     */
    public boolean isInitial() {
        return isInitial;
    }

    /**
     * @return klp code that implements the body of the state
     */
    public LinkedList<Instruction> compileBody() {
        final Klp klp = new Klp(name, content);
        return klp.compile(true, name);
    }

    /**
     * 
     */
    public void setIO() {
        content.setIO();
    }

    /**
     * @param ssm
     *            the name of the ssm that constains this state
     * @param states
     *            all states in the fsm
     * @param prioOffset
     *            minimal priority to use
     * @return klp code that implemenst the controller, ie, checks for abortions
     */
    public LinkedList<Instruction> compileCtrl(final String ssm,
            final HashMap<String, State> states, final int prioOffset) {
        LinkedList<Instruction> res = new LinkedList<Instruction>();

        res.add(new Comment("check strong aborts"));
        for (Transition t : saborts) {
            res.addAll(t.compile(ssm, name, "S"));
        }
        Instruction i = new Prio(ssm, prioOffset + content.getDepGraph().getMaxPrio() + 1);
        i.setComment("Execute state");
        res.add(i);
        res.add(new Prio(ssm, prioOffset));
        res.add(new Comment("check weak aborts"));
        for (Transition t : waborts) {
            res.addAll(t.compile(ssm, name, "W"));
        }
        res.add(new Done(Label.get(ssm + "_" + name)));

        for (Transition t : saborts) {
            Label l = Label.get(name + "2" + t.getTarget() + "S");
            l.setComment("strong abort from " + name + " to " + t.getTarget());
            res.add(l);
            res.addAll(states.get(t.getTarget()).compileInit(false, false, prioOffset + 1));
            res.add(new Jmp(Label.get(ssm + "_" + t.getTarget())));
        }
        for (Transition t : waborts) {
            Label l = Label.get(name + "2" + t.getTarget() + "W");
            l.setComment("weak abort from " + name + " to " + t.getTarget());
            res.add(l);
            res.addAll(states.get(t.getTarget()).compileInit(false, false, prioOffset + 1));
            res.add(new Done(Label.get(ssm + "_" + t.getTarget())));
        }

        return res;
    }

    /**
     * @param setInputs
     *            initialize inputs?
     * @param setOutputs
     *            initialize outputs?
     * @param prioOffset
     *            minimal priority to use
     * @return klp instructions to initialize the used registers
     */
    public LinkedList<Instruction> compileInit(final boolean setInputs, final boolean setOutputs,
            final int prioOffset) {
        Klp klp = new Klp(name, content);
        return klp.compileInit(true, name, false, setOutputs, prioOffset);
    }

    /**
     * @return maximal used priority
     */
    public int getMaxPrio() {
        return content.getDepGraph().getMaxPrio();
    }

    /**
     * @return all input signals of the state
     */
    public LinkedList<Variable> getInputs() {
        return content.getInputs();
    }

    /**
     * @return all output signals of the state
     */
    public LinkedList<Variable> getOutputs() {
        return content.getOutputs();
    }

    void init() {
        content.init();
    }

    /**
     * @return dependency graph
     */
    public DepGraph getDepGraph() {
        return content.getDepGraph();
    }

    /**
     * @param equiv
     *            list of equivalent variables
     */
    public void replace(final HashMap<String, Variable> equiv) {
        content.replace(equiv);
        for (Transition t : waborts) {
            t.replace(equiv);
        }
        for (Transition t : saborts) {
            t.replace(equiv);
        }
    }

}
