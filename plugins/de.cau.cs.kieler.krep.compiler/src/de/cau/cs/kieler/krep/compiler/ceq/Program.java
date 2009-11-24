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
    private String name;

    /**
     * all used variables.
     */
    private HashMap<String, Variable> vars = new HashMap<String, Variable>();

    /**
     * input signals.
     */
    private LinkedList<Variable> inputs = new LinkedList<Variable>();

    /**
     * output signals.
     */
    private LinkedList<Variable> outputs = new LinkedList<Variable>();

    /**
     * local variables.
     */
    private LinkedList<Variable> locals = new LinkedList<Variable>();

    /**
     * equations.
     */
    private LinkedList<Equation> eqs = new LinkedList<Equation>();

    /**
     * safe state machines.
     */
    private LinkedList<Automaton> ssms = new LinkedList<Automaton>();

    /**
     * dependency graph.
     */
    private DepGraph depGraph = null;

    /**
     * generate empty program.
     * 
     * @param n
     *            of the main node
     */
    public Program(final String n) {
        this.setName(n);
    }

    /**
     * generate program from an existing one.
     * 
     * @param n name of the new program
     * @param p program to copy.
     */
    public Program(final String n, final Program p) {
        this.setName(n);
        this.setVars(p.getVars());
        this.setInputs(p.getInputs());
        this.setOutputs(p.getOutputs());
        this.setLocals(p.getLocals());
        this.setEqs(p.getEqs());
        this.setDepGraph(p.getDepGraph());
        this.setSsms(p.getSsms());
    }

    /**
     * initialize program.
     */
    public void init() {
        HashMap<String, LinkedList<String>> deps = new HashMap<String, LinkedList<String>>();
        for (Equation e : getEqs()) {
            LinkedList<String> d = new LinkedList<String>();
            for (Variable v : e.getDeps()) {
                d.add(v.getName());
            }
            if (e.getClock() != null) {
                d.add(e.getClock());
            }
            deps.put(e.getName(), d);
        }

        for (Automaton a : getSsms()) {
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

        setDepGraph(new DepGraph(deps));
        for (Automaton ssm : getSsms()) {
            getDepGraph().addSubGraph(ssm.getName(), ssm.getDepGraph());
        }
        // make sure that outputs are not reordered
     
        LinkedList<Equation> tmp = new LinkedList<Equation>();
        List<String> sort = getDepGraph().sort();
        for (String s : sort) {
            for (Equation e : getEqs()) {
                if (s.equals(e.getName())) {
                    tmp.add(e);
                }
            }
        }
        setEqs(tmp);
    }

    /**
     * replace complex expression by temporary computations.
     */
    public void flatten() {
        final LinkedList<Equation> aux = new LinkedList<Equation>();
        for (final Equation eq : getEqs()) {
            aux.addAll(eq.flatten(getVars()));
        }
        getEqs().addAll(aux);
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
        for (Variable v : getVars().values()) {
            if (!v.isInput() && !v.isOutput() && !getLocals().contains(v)) {
                getLocals().add(v);
            }
        }

        return Ceq.toLustre(getName(), getInputs(), getOutputs(), getLocals(), getEqs(), getSsms());
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
            for (final Equation e : getEqs()) {
                final Const c = e.propagateConst(con);
                if (c != null && !con.containsKey(e.getName())) {
                    con.put(e.getName(), c);
                    done = false;
                }
            }
        }
        final LinkedList<Equation> keep = new LinkedList<Equation>();
        final HashSet<String> out = new HashSet<String>();
        for (final Variable o : getOutputs()) {
            out.add(o.getName());
        }
        for (final Equation e : getEqs()) {
            if (con.containsKey(e.getName()) && !out.contains(e.getName())) {
                getVars().remove(e.getName());
            } else {
                Const c = con.get(e.getClock());
                if (c != null) {
                    e.setClock(null);
                }
                keep.add(e);
            }
        }
        setEqs(keep);
        for (Automaton ssm : getSsms()) {
            ssm.propagateConst();
        }

    }

    /**
     * perform static evaluation.
     */
    public void staticEval() {
        for (final Equation e : getEqs()) {
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
        getVars().put(v.getName(), v);
        if (v.isInput()) {
            getInputs().add(v);
        } else if (v.isOutput()) {
            getOutputs().add(v);
        } else {
            getLocals().add(v);
        }
    }

    /**
     * @param eq
     *            additional equation
     */
    public void addEq(final Equation eq) {
        getEqs().add(eq);
    }

    /**
     * remove equivalent equations.
     */
    public void removeEquiv() {
        Debug.low("remove equivalent equations");

        HashMap<String, Variable> equiv = new HashMap<String, Variable>();
        for (Equation e : getEqs()) {
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
        for (Variable v : getOutputs()) {
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
            for (Equation eq : getEqs()) {
                eq.replaceVar(equiv);
                if (!equiv.containsKey(eq.getName())) {
                    keep.add(eq);
                } else {
                    Variable v = Variable.get(eq.getName());
                    getVars().remove(eq.getName());
                    getLocals().remove(v);
                }
            }
            setEqs(keep);

            for (Automaton ssm : getSsms()) {
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
        for (final Equation e : getEqs()) {
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
        getLocals().add(v);
    }

    /**
     * @param v new output variable
     */
    public void addOutput(final Variable v) {
        getOutputs().add(v);
    }

    /**
     * @param v new input variable
     */
    public void addInput(final Variable v) {
        getInputs().add(v);
    }

    /**
     * simplify all equations.
     */
    public void simplify() {
        // Count number of readers for each flow
        final HashMap<String, Integer> index = new HashMap<String, Integer>();
        int i = 0;
        for (final Equation eq : getEqs()) {
            index.put(eq.getName(), i);
            i++;
        }

        final int[] nReader = new int[getEqs().size()];

        for (final Equation eq : getEqs()) {
            for (final String v : eq.getPDeps()) {
                final Integer k = index.get(v);
                if (k != null) {
                    nReader[k]++;
                }
            }
        }

        final LinkedList<Equation> keep = new LinkedList<Equation>();
        for (i = 0; i < getEqs().size(); i++) {
            final Equation eq = getEqs().get(i);
            if (nReader[i] == 1 && getLocals().contains(Variable.get(eq.getName()))) {
                Debug.low("replace " + eq.getName());
                boolean ok = true;
                for (final Equation e : getEqs()) {
                    if (!e.replace(eq)) {
                        keep.add(eq);
                        ok = false;
                    }
                }
                if (ok) {
                    getVars().remove(Variable.get(eq.getName()).getName());
                }
            } else {
                keep.add(eq);
            }
        }

        setEqs(keep);

        for (final Automaton ssm : getSsms()) {
            ssm.simplify();
        }

        removeEquiv();
    }

    /**
     * @param dG the depGraph to set
     */
    protected void setDepGraph(final DepGraph dG) {
        this.depGraph = dG;
    }

    /**
     * @return the depGraph
     */
    protected DepGraph getDepGraph() {
        return depGraph;
    }

    /**
     * @param s the ssms to set
     */
    protected void setSsms(final LinkedList<Automaton> s) {
        this.ssms = s;
    }

    /**
     * @return the ssms
     */
    protected LinkedList<Automaton> getSsms() {
        return ssms;
    }

    /**
     * @param equations the eqs to set
     */
    protected void setEqs(final LinkedList<Equation> equations) {
        this.eqs = equations;
    }

    /**
     * @return the eqs
     */
    protected LinkedList<Equation> getEqs() {
        return eqs;
    }

    /**
     * @param loc the locals to set
     */
    protected void setLocals(final LinkedList<Variable> loc) {
        this.locals = loc;
    }

    /**
     * @return the locals
     */
    protected LinkedList<Variable> getLocals() {
        return locals;
    }

    /**
     * @param outs the outputs to set
     */
    protected void setOutputs(final LinkedList<Variable> outs) {
        this.outputs = outs;
    }

    /**
     * @param i the inputs to set
     */
    protected void setInputs(final LinkedList<Variable> i) {
        this.inputs = i;
    }

    /**
     * @param v the vars to set
     */
    protected void setVars(final HashMap<String, Variable> v) {
        this.vars = v;
    }

    /**
     * @return the vars
     */
    protected HashMap<String, Variable> getVars() {
        return vars;
    }
}
