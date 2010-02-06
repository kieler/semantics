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

import de.cau.cs.kieler.krep.compiler.ceq.Variable.Kind;
import de.cau.cs.kieler.krep.compiler.dependencies.DepGraph;
import de.cau.cs.kieler.krep.compiler.util.Debug;
import de.cau.cs.kieler.krep.compiler.util.Type;

/**
 * CEQ program, eg, a set of CEQ equation and Safe State Machines plus information on inputs and
 * outputs.
 * 
 * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp, tam
 *   
 * @author ctr
 * */
public class Program {
    /**
     * name of the program.
     */
    private String name;

    /**
     * all used variables.
     */
    private static HashMap<String, Variable> vars = new HashMap<String, Variable>();

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

   // private static HashMap<String, Variable> vars = new HashMap<String, Variable>();

    private static HashMap<String, Integer> temps = new HashMap<String, Integer>();
   
    private static  int labels;

  
    
    /**
     * generate empty program.
     * 
     * @param n
     *            of the main node
     */
    public Program(final String n) {
        vars.clear();
        temps.clear();
        labels =0;
        this.setName(n);
    }

    /**
     * generate program from an existing one.
     * 
     * @param n
     *            name of the new program
     * @param p
     *            program to copy.
     */
    public Program(final String n, final Program p) {
        vars.clear();
        temps.clear();
        labels =0;
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
     * 
     * @return Lustre code for the program
     */
    public String toLustre() {
        for (Variable v : getVars().values()) {
            if (!v.isInput() && !v.isOutput() && !getLocals().contains(v)) {
                getLocals().add(v);
            }
        }

        StringBuffer res = new StringBuffer("node " + name + " (\n");
        for (final Variable v : inputs) {
            res.append("    " + v.toString() + ";\n");
        }
        res.append(") returns (\n");
        for (final Variable v : outputs) {
            res.append("    " + v.toString() + ";\n");
        }
        res.append(");\n");
        if (!locals.isEmpty()) {
            res.append("var\n");
            for (final Variable v : locals) {
                res.append("    " + v.toString() + ";\n");
            }
        }
        res.append("let\n");
        for (final Equation eq : eqs) {
            res.append("  " + eq.toString());
        }
        res.append("\n");

        for (final Automaton ssm : ssms) {
            res.append(ssm.toString());
        }
        res.append("tel\n");
        return res.toString();
        
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
        final HashMap<String, ConstExpression> con = new HashMap<String, ConstExpression>();
        boolean done = false;
        while (!done) {
            done = true;
            for (final Equation e : getEqs()) {
                final ConstExpression c = e.propagateConst(con);
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
                ConstExpression c = con.get(e.getClock());
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
            if (expr instanceof VarAccessExpression) {
                VarAccessExpression v = (VarAccessExpression) expr;
                if (e.getClock() == null && e.getInit() == null) {
                    equiv.put(e.getName(), Program.getVar(v.getName()));
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
     * @param equiv
     *            list of quivalent variables.
     */
    public void replace(final HashMap<String, Variable> equiv) {
        if (!equiv.isEmpty()) {
            LinkedList<Equation> keep = new LinkedList<Equation>();
            for (Equation eq : getEqs()) {
                eq.replaceVar(equiv);
                if (!equiv.containsKey(eq.getName())) {
                    keep.add(eq);
                } else {
                    Variable v = Program.getVar(eq.getName());
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
     * @param v
     *            new local variable
     */
    public void addLocal(final Variable v) {
        getLocals().add(v);
    }

    /**
     * @param v
     *            new output variable
     */
    public void addOutput(final Variable v) {
        getOutputs().add(v);
    }

    /**
     * @param v
     *            new input variable
     */
    public void addInput(final Variable v) {
        getInputs().add(v);
    }

    /**
     * simplify all equations by replacing variables that are only read once. This is in partcular
     * necessary for code that is generated from graphical dataflow models.
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
            if (nReader[i] == 1 && getLocals().contains(Program.getVar(eq.getName()))) {
                Debug.low("replace " + eq.getName());
                boolean ok = true;
                for (final Equation e : getEqs()) {
                    if (!e.replace(eq)) {
                        keep.add(eq);
                        ok = false;
                    }
                }
                if (ok) {
                    getVars().remove(Program.getVar(eq.getName()).getName());
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
     * @param dG
     *            the dependency graph
     */
    protected void setDepGraph(final DepGraph dG) {
        this.depGraph = dG;
    }

    /**
     * @return the dependency graph
     */
    protected DepGraph getDepGraph() {
        return depGraph;
    }

    /**
     * @param s
     *            the Safe State Machines
     */
    protected void setSsms(final LinkedList<Automaton> s) {
        this.ssms = s;
    }

    /**
     * @return the Safe State Machines
     */
    protected LinkedList<Automaton> getSsms() {
        return ssms;
    }

    /**
     * @param equations
     *            the CEQ equations
     */
    protected void setEqs(final LinkedList<Equation> equations) {
        this.eqs = equations;
    }

    /**
     * @return the CEQ equations
     */
    protected LinkedList<Equation> getEqs() {
        return eqs;
    }

    /**
     * @param loc
     *            the new local variables
     */
    protected void setLocals(final LinkedList<Variable> loc) {
        this.locals = loc;
    }

    /**
     * @return the local variables
     */
    protected LinkedList<Variable> getLocals() {
        return locals;
    }

    /**
     * @param outs
     *            the outputs to set
     */
    protected void setOutputs(final LinkedList<Variable> outs) {
        this.outputs = outs;
    }

    /**
     * @param i
     *            the inputs to set
     */
    protected void setInputs(final LinkedList<Variable> i) {
        this.inputs = i;
    }

    /**
     * @param v
     *            the new variables of the program
     */
    protected void setVars(final HashMap<String, Variable> v) {
        this.vars = v;
    }

    /**
     * @return the variables of the program
     */
    protected HashMap<String, Variable> getVars() {
        return vars;
    }
    
    /**
     * Generate new variable. Implements singleton pattern.
     * 
     * @param name
     *            name of the variable
     * @return variable with same name if it exists, new temp variable otherwise
     */
    public static Variable getVar(final String name) {
        Variable v = vars.get(name);
        if (v == null) {
            System.err.println("variable " + name + " not defined");
        }
        return v;
    }

    /**
     * Generate new, unique variable. 
     * 
     * @param name
     *            name of the variable
     * @param kind
     *            io kind of the variable
     * @param type
     *            type of the variable
     * @return variable with same name if it exists, new temp variable otherwise
     */
    public static Variable getVar(final String name, final Kind kind, final Type type) {
        Variable v = vars.get(name);
        if (v == null) {
            v = new Variable(name, kind, type);

        }
        return v;
    }
    
    /**
     * @param prefix
     *            of the temporary variable
     * @param type
     *            of the new variable
     * @return new temporary variable
     */
    public static Variable getTemp(final String prefix, final Type type) {
        Integer i = temps.get(prefix);
        if (i == null) {
            i = 0;
        }
        String temp = prefix + "_" + i;
        i++;
        temps.put(prefix, i);
        Variable v = vars.get(temp);
        if (v != null) {
            return v;
        } else {
            return new Variable(temp, Kind.LOCAL, type);
        }
    }

    /**
     * Remove temporary variables.
     * 
     * @param prefix
     *            prefix of the variables to reset
     */
    public static void destroyTemp(final String prefix) {
        Integer i = temps.get(prefix);
        if (i == null) {
            i = 1;
        }
        i--;
        temps.put(prefix, i);
    }

    /**
     * @return number of defined variables
     */
    public static int getMax() {
        return vars.size();
    }

    public static void addVar(String n, Variable variable) {
        if (vars.containsKey(n)) {
            System.err.println("variable " + n + " already defined");
        }
        vars.put(n, variable);
     }
    
    /**
     * Generate a unique label
     * @return a unique name for a label
     */
    public static String getLabel() {
        labels ++;
        return "L_" + labels;
    }

}
