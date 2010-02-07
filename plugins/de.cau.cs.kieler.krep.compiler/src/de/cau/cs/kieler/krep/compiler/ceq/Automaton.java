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

import de.cau.cs.kieler.krep.compiler.ceq.Variable.Kind;
import de.cau.cs.kieler.krep.compiler.dependencies.DepGraph;
import de.cau.cs.kieler.krep.compiler.klp.CommentInstruction;
import de.cau.cs.kieler.krep.compiler.klp.DeclareRegInstruction;
import de.cau.cs.kieler.krep.compiler.klp.InitRegInstruction;
import de.cau.cs.kieler.krep.compiler.klp.AbstractInstruction;
import de.cau.cs.kieler.krep.compiler.klp.LabelInstruction;
import de.cau.cs.kieler.krep.compiler.klp.PrioInstruction;

/**
 * Implement automaton as part of clocked equations. An automaton contains other automata and
 * dataflow equations.
 * 
 * @kieler.rating 2010-02-05 yellow review by cmot, msp, tam
 * 
 * @author ctr
 * 
 */
public class Automaton {
    private String name;

    private State initial;

    private LinkedList<State> states = new LinkedList<State>();

    private LinkedList<Variable> inputs = new LinkedList<Variable>();

    private LinkedList<Variable> outputs = new LinkedList<Variable>();

    /**
     * Get all inputs for the automaton.
     * 
     * @return inputs
     */
    public LinkedList<Variable> getInputs() {
        return inputs;
    }

    /**
     * Get all output signals for the automaton.
     * 
     * @return outputs
     */
    public LinkedList<Variable> getOutputs() {
        return outputs;
    }

    /**
     * Generate an empty automaton.
     * 
     * @param n
     *            name of the automaton
     */
    public Automaton(final String n) {
        this.name = n;
    }

    /**
     * Get name of the automaton.
     * 
     * @return unique name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuffer res = new StringBuffer("automaton " + name + "\n");
        for (State s : states) {
            res.append(s.toString() + "\n");
        }
        return res.toString();
    }

    /**
     * Add a new state to the automaton.
     * 
     * @param s
     *            the new state
     */
    public void add(final State s) {
        states.add(s);
        if (s.isInitial()) {
            initial = s;
        }
    }

    /**
     * Compile an automaton into KLP assembler.
     * 
     * @param prioOffset
     *            minimal priority that can be used
     * @return klp assembler that implements the automaton
     */
    public LinkedList<AbstractInstruction> compile(final int prioOffset) {
        LinkedList<AbstractInstruction> res = new LinkedList<AbstractInstruction>();
        HashMap<String, State> name2state = new HashMap<String, State>();
        for (State s : states) {
            name2state.put(s.getName(), s);
        }

        // Controller
        for (State s : states) {
            res.add(LabelInstruction.get(name + "_" + s.getName()));
            res.getLast().setComment("Controller for state " + s.getName());
            res.addAll(s.compileCtrl(name, name2state, prioOffset));
        }

        // State Body
        for (State s : states) {
            res.add(new CommentInstruction("Equations inside " + s.getName()));
            res.addAll(s.compileBody());
        }

        return res;
    }

    /**
     * propagate constant values in equations.
     */
    public void propagateConst() {
        for (final State s : states) {
            s.propagateConst();
        }

    }

    /**
     * simply the automaton by simplifying each state.
     */
    public void simplify() {
        for (final State s : states) {
            s.simplify();
        }

    }

    /**
     * Extract io of the automaton from the initial state.
     */
    public void setIO() {
        for (final State s : states) {
            s.setIO();
        }
        inputs.addAll(initial.getInputs());
        outputs.addAll(initial.getOutputs());

    }

    /**
     * Generate initialization code for the klp, which initializes the registers.
     * 
     * @param setInputs
     *            should input registered be initialized?
     * @param setOutputs
     *            should output registered be initialized?
     * @param prioOffset
     *            minimal priority that can be used.
     * @return Klp instructions to initialize the register required by the automaton
     */
    public LinkedList<AbstractInstruction> compileInit(final boolean setInputs,
            final boolean setOutputs, final int prioOffset) {
        LinkedList<AbstractInstruction> res = new LinkedList<AbstractInstruction>();
        if (setInputs) {
            res.add(new DeclareRegInstruction(name, Kind.LOCAL));
            res.add(new InitRegInstruction(name, Kind.LOCAL, name + "_" + initial.getName(), null));
        }
        res.add(new PrioInstruction(name, initial.getMaxPrio()));
        res.addAll(initial.compileInit(setInputs, setOutputs, prioOffset));
        return res;
    }

    void init() {
        for (State s : states) {
            s.init();
        }
    }

    /**
     * Get the dependency graph from the initial state.
     * 
     * @return dependency graph of the initial state
     */
    public DepGraph getDepGraph() {
        return initial.getDepGraph();
    }

    /**
     * Replace a Variable by another, equivalent variable.
     * 
     * @param equiv
     *            map of equivalent variables
     */
    public void replace(final HashMap<String, Variable> equiv) {
        LinkedList<Variable> tmp = new LinkedList<Variable>();
        for (Variable v : inputs) {
            if (equiv.containsKey(v.getName())) {
                tmp.add(equiv.get(v.getName()));
            } else {
                tmp.add(v);
            }
        }
        inputs = tmp;
        tmp = new LinkedList<Variable>();
        for (Variable v : outputs) {
            if (equiv.containsKey(v.getName())) {
                tmp.add(equiv.get(v.getName()));
            } else {
                tmp.add(v);
            }
        }
        outputs = tmp;
        for (State s : states) {
            s.replace(equiv);
        }
    }

}
