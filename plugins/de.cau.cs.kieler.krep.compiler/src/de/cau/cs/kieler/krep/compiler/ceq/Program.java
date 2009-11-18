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
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.krep.compiler.dependencies.DepGraph;
import de.cau.cs.kieler.krep.compiler.helper.Debug;

/**
 * @author ctr CEQ program, eg, a bunch of CEQ equation plus information on inputs and outputs
 */
public class Program {
    /**
     * name of the program.
     */
    protected String name;

    /**
     * all used variables.
     */
    protected HashMap<String, Variable> vars = new HashMap<String, Variable>();

    /**
     * input signals.
     */
    protected LinkedList<Variable> inputs = new LinkedList<Variable>();

    /**
     * output signals.
     */
    protected LinkedList<Variable> outputs = new LinkedList<Variable>();

    /**
     * local variables.
     */
    protected LinkedList<Variable> locals = new LinkedList<Variable>();

    /**
     * equations.
     */
    protected LinkedList<Equation> eqs = new LinkedList<Equation>();

    /**
     * safe state machines.
     */
    protected LinkedList<Automaton> ssms = new LinkedList<Automaton>();

    /**
     * dependency graph.
     */
    protected DepGraph depGraph = null;

    /**
     * generate empty program.
     * 
     * @param n
     *            of the main node
     */
    public Program(final String n) {
        this.name = n;
    }

    /**
     * generate program from an existing one.
     * 
     * @param n name of the new program
     * @param p program to copy.
     */
    public Program(final String n, final Program p) {
        this.name = n;
        this.vars = p.vars;
        this.inputs = p.inputs;
        this.outputs = p.outputs;
        this.locals = p.locals;
        this.eqs = p.eqs;
        this.depGraph = p.depGraph;
        this.ssms = p.ssms;
    }

    /**
     * initialize program.
     */
    public void init() {
        HashMap<String, LinkedList<String>> deps = new HashMap<String, LinkedList<String>>();
        for (Equation e : eqs) {
            LinkedList<String> d = new LinkedList<String>();
            for (Variable v : e.getDeps()) {
                d.add(v.getName());
            }
            if (e.getClock() != null) {
                d.add(e.getClock());
            }
            deps.put(e.getName(), d);
        }

        for (Automaton a : ssms) {
            LinkedList<String> d = new LinkedList<String>();
            for (Variable in : a.getInputs()) {
                d.add(in.getName());
            }
            deps.put(a.getName(), d);
            for (Variable out : a.getOutputs()) {
                d = deps.get(out.getName());
                if (d == null) {
                    d = new LinkedList<String>();
                }
                d.add(a.getName());
                deps.put(out.getName(), d);
            }
            a.init();
        }

        depGraph = new DepGraph(deps);
        for (Automaton ssm : ssms) {
            depGraph.addSubGraph(ssm.getName(), ssm.getDepGraph());
        }
        // make sure that outputs are not reordered
     
        LinkedList<Equation> tmp = new LinkedList<Equation>();
        List<String> sort = depGraph.sort();
        for (String s : sort) {
            for (Equation e : eqs) {
                if (s.equals(e.getName())) {
                    tmp.add(e);
                }
            }
        }
        eqs = tmp;
    }

    /**
     * replace complex expression by temporary computations.
     */
    public void flatten() {
        final LinkedList<Equation> aux = new LinkedList<Equation>();
        for (final Equation eq : eqs) {
            aux.addAll(eq.flatten(vars));
        }
        eqs.addAll(aux);
    }

    @Override
    public String toString() {
        return toLustre();
    }

    /**
     * @return Lustre code for the program
     */
    public String toLustre() {
        // LinkedList<Variable> local = new LinkedList<Variable>();
        for (Variable v : vars.values()) {
            if (!v.isInput() && !v.isOutput() && !locals.contains(v)) {
                locals.add(v);
            }
        }

        return Ceq.toLustre(name, inputs, outputs, locals, eqs, ssms);
    }

    /**
     * @param n
     *            of the program
     */
    public void setName(final String n) {
        this.name = n;

    }

    /**
     * propagate constant values.
     */
    public void propagateConst() {
        final HashMap<String, Const> con = new HashMap<String, Const>();
        boolean done = false;
        while (!done) {
            done = true;
            for (final Equation e : eqs) {
                final Const c = e.propagateConst(con);
                if (c != null && !con.containsKey(e.getName())) {
                    con.put(e.getName(), c);
                    done = false;
                }
            }
        }
        final LinkedList<Equation> keep = new LinkedList<Equation>();
        final HashSet<String> out = new HashSet<String>();
        for (final Variable o : outputs) {
            out.add(o.getName());
        }
        for (final Equation e : eqs) {
            if (con.containsKey(e.getName()) && !out.contains(e.getName())) {
                vars.remove(e.getName());
            } else {
                Const c = con.get(e.getClock());
                if (c != null) {
                    e.setClock(null);
                }
                keep.add(e);
            }
        }
        eqs = keep;
        for (Automaton ssm : ssms) {
            ssm.propagateConst();
        }

    }

    /**
     * perform static evaluation.
     */
    public void staticEval() {
        for (final Equation e : eqs) {
            e.staticEval();
        }
    }

    /**
     * @return name of the main node
     */
    public String getName() {
        return name;
    }

    /**
     * @return outputs of the program
     */
    public LinkedList<Variable> getOutputs() {
        return outputs;
    }

    /**
     * @return inputs of the program
     */
    public LinkedList<Variable> getInputs() {
        return inputs;
    }

    /**
     * @param v
     *            additional variable
     */
    public void addVar(final Variable v) {
        vars.put(v.getName(), v);
        if (v.isInput()) {
            inputs.add(v);
        } else if (v.isOutput()) {
            outputs.add(v);
        } else {
            locals.add(v);
        }
    }

    /**
     * @param eq
     *            additional equation
     */
    public void addEq(final Equation eq) {
        eqs.add(eq);
    }

    /**
     * remove equivalent equations.
     */
    public void removeEquiv() {
        Debug.low("remove equivalent equations");

        HashMap<String, Variable> equiv = new HashMap<String, Variable>();
        for (Equation e : eqs) {
            Expression expr = e.getExpr();
            if (expr instanceof VarAccess) {
                VarAccess v = (VarAccess) expr;
                if (e.getClock() == null && e.getInit() == null) {
                    equiv.put(e.getName(), Variable.get(v.getName()));
                    Debug.low("\t" + e.getName() + " = " + v.getName());
                }

            }
        }
        // make sure that outputs are not removed
        for (Variable v : outputs) {
            if (equiv.containsKey(v.getName())) {
                equiv.remove(v.getName());
            }
        }
        replace(equiv);

    }

    /**
     * @param equiv list of quivalent variables.
     */
    public void replace(final HashMap<String, Variable> equiv) {
        if (!equiv.isEmpty()) {
            LinkedList<Equation> keep = new LinkedList<Equation>();
            for (Equation eq : eqs) {
                eq.replaceVar(equiv);
                if (!equiv.containsKey(eq.getName())) {
                    keep.add(eq);
                } else {
                    Variable v = Variable.get(eq.getName());
                    vars.remove(eq.getName());
                    locals.remove(v);
                }
            }
            eqs = keep;

            for (Automaton ssm : ssms) {
                ssm.replace(equiv);
            }
        }
    }

    /**
     * @return estimated wcrt for this program.
     */
    public int wcrt() {
        Debug.low("WCRT:");
        int res = 0;
        for (final Equation e : eqs) {
            final int t = e.wcrt();
            Debug.low(e.getName() + "->" + t);
            res += t;
        }
        return res;
    }

    /**
     * @param v new local variable
     */
    public void addLocal(final Variable v) {
        locals.add(v);
    }

    /**
     * @param v new output variable
     */
    public void addOutput(final Variable v) {
        outputs.add(v);
    }

    /**
     * @param v new input variable
     */
    public void addInput(final Variable v) {
        inputs.add(v);
    }

    /**
     * simplify all equations.
     */
    public void simplify() {
        // Count number of readers for each flow
        final HashMap<String, Integer> index = new HashMap<String, Integer>();
        int i = 0;
        for (final Equation eq : eqs) {
            index.put(eq.getName(), i);
            i++;
        }

        final int[] nReader = new int[eqs.size()];

        for (final Equation eq : eqs) {
            for (final String v : eq.getPDeps()) {
                final Integer k = index.get(v);
                if (k != null) {
                    nReader[k]++;
                }
            }
        }

        final LinkedList<Equation> keep = new LinkedList<Equation>();
        for (i = 0; i < eqs.size(); i++) {
            final Equation eq = eqs.get(i);
            if (nReader[i] == 1 && locals.contains(Variable.get(eq.getName()))) {
                Debug.low("replace " + eq.getName());
                boolean ok = true;
                for (final Equation e : eqs) {
                    if (!e.replace(eq)) {
                        keep.add(eq);
                        ok = false;
                    }
                }
                if (ok) {
                    vars.remove(Variable.get(eq.getName()).getName());
                }
            } else {
                keep.add(eq);
            }
        }

        eqs = keep;

        for (final Automaton ssm : ssms) {
            ssm.simplify();
        }

        removeEquiv();
    }
}
