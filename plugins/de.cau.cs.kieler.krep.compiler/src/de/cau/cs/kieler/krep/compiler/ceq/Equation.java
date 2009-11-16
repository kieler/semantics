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
import java.util.List;

import de.cau.cs.kieler.krep.compiler.helper.Debug;
import de.cau.cs.kieler.krep.compiler.klp.instructions.CJmp;
import de.cau.cs.kieler.krep.compiler.klp.instructions.Done;
import de.cau.cs.kieler.krep.compiler.klp.instructions.Instruction;
import de.cau.cs.kieler.krep.compiler.klp.instructions.Label;
import de.cau.cs.kieler.krep.compiler.klp.instructions.Read;
import de.cau.cs.kieler.krep.compiler.prog.Type;

/**
 * @author ctr A clocked equation
 */
public class Equation {
    private String id;

    private Expression expr;

    private Expression init;

    private Type type;

    private String clock;

    private int prio;

    /**
     * Construct a new clocked equation
     * 
     * @param id
     *            name of the value that is computed
     * @param init
     *            expression to compute the initial value
     * @param expr
     *            expression to compute the value during runtim
     * @param clk
     *            the clock on which the equation is evaluated
     * @param type
     *            type of the result
     */
    public Equation(final String id, final Expression init, final Expression expr,
            final String clk) {
        super();
        this.clock = clk;
        this.expr = expr;
        this.init = init;
        this.id = id;
        this.type = expr.getType();
    }

    /**
     * generate Equation without initializer which runs on the base clock
     * 
     * @param id
     * @param expr
     */
    public Equation(final String id, final Expression expr) {
        this(id, null, expr, null);
    }

    @Override
    public String toString() {
        String res = id + " = ";
        if (clock != null) {
            res += " current((";
        }
        if (init != null) {
            res += init.toString() + "->";
        }

        res += expr.toString();
        if (clock != null) {
            res += ") when " + clock + ")";
        }
        res += ";\n";
        return res;
    }

    /**
     * @return true if this expression computes a clock, ie, a boolean stream
     */
    public boolean isClock() {
        return type == Type.BOOL;
    }

    /**
     * compute List of all variables, on which current value the expression depends. This is the
     * same as getVars without the variables which pre value is used.
     * 
     * @return list of variables this expression depends on
     */
    public List<Variable> getDeps() {
        return expr.getDeps();
    }

    /**
     * @return name of the value that is computed
     */
    public String getName() {
        return id;
    }

    public Expression getInit() {
        return init;
    }

    /**
     * @param name
     *            of the variable that is computed by this equation
     */
    public void setName(final String name) {
        this.id = name;
    }

    /**
     * @return clock on which this equation runs
     */
    public String getClock() {
        return clock;
    }

    public boolean hasClock() {
        return clock != null;
    }

    /**
     * @param vars
     * @return replace complex expressions
     */
    public LinkedList<Equation> flatten(final HashMap<String, Variable> vars) {
        LinkedList<Expression> es = new LinkedList<Expression>();
        LinkedList<Equation> res = new LinkedList<Equation>();
        if (init != null && !init.isAtom()) {
            init.flatten(id, vars, es);
            init = es.getFirst();

            for (Expression e : es) {
                res.add(new Equation(e.getName(), null, e, clock));
            }
            es.clear();
        }
        return res;
    }

    /**
     * generate KLP code to compute this equation
     * 
     * @param vars
     * @return list ofKLP instructions to compute the value
     */
    public LinkedList<Instruction> toKlp(final boolean useClocks, final String scope,
            final HashMap<String, Variable> vars) {
        Debug.low("to KLP: " + id);
        Debug.low(toString());
        LinkedList<Instruction> instr = new LinkedList<Instruction>();
        LinkedList<Expression> es = new LinkedList<Expression>();
        Label l = Label.get(id + scope);
        Label lInit = Label.get(id + "_init" + scope);
        Label lRun = Label.get(id + "_run" + scope);
        Label lDone = Label.get(id + "_done" + scope);

        instr.add(l);
        if (!useClocks && hasClock()) {
            instr.add(new CJmp(CJmp.Cond.T, new Read(Variable.get(clock), false), lInit));
            instr.add(new Done(l));
            instr.add(lInit);
        }
        if (init != null) {
            // init.flatten(id, vars, es);

            for (Expression e : es) {
                instr.addAll(e.toKlp(Variable.get(e.name)));
                Debug.low(e.toString());
            }
            instr.addAll(init.toKlp(Variable.get(id)));
            es.clear();
            instr.add(new Done(lRun));
        }
        instr.add(lRun);
        if (!useClocks && hasClock()) {
            instr.add(new CJmp(CJmp.Cond.F, new Read(Variable.get(clock), false), lDone));
        }
        // expr.flatten(id, vars, es);
        for (Expression e : es) {
            instr.addAll(e.toKlp(Variable.get(e.name)));
            Debug.low(e.toString());
        }
        instr.addAll(expr.toKlp(Variable.get(id)));
        if (!useClocks && hasClock()) {
            instr.add(lDone);
        }
        return instr;
    }

    /**
     * generate KLP code to compute this equation
     * 
     * @param vars
     * @return list ofKLP instructions to compute the value
     */
    public LinkedList<Instruction> toKrp(final HashMap<String, Variable> vars) {
        Debug.low("to KLP: " + id);
        Debug.low(toString());
        LinkedList<Instruction> instr = new LinkedList<Instruction>();
        LinkedList<Expression> es = new LinkedList<Expression>();
        Label l_init = Label.get(id);
        Label l_run = Label.get(id + "_run");
        instr.add(l_init);
        if (init != null) {
            init.flatten(id, vars, es);

            for (Expression e : es) {
                instr.addAll(e.toKlp(Variable.get(e.name)));
                Debug.low(e.toString());
            }
            instr.addAll(init.toKlp(Variable.get(id)));
            es.clear();
            instr.add(new Done(l_run));
        }
        instr.add(l_run);
        expr.flatten(id, vars, es);
        for (Expression e : es) {
            instr.addAll(e.toKlp(Variable.get(e.name)));
            Debug.low(e.toString());
        }
        instr.addAll(expr.toKlp(Variable.get(id)));
        return instr;
    }

    /**
     * @return type of these equation
     */
    public Type getType() {
        return expr.getType();
    }


    /**
     * @param con
     * @return propagate constant values
     */
    public Const propagateConst(final HashMap<String, Const> con) {
        Debug.low("propagate const");
        Const cInit = null;
        if (init != null) {
            cInit = init.propagateConst(con);
            if (cInit != null) {
                init = cInit;
            }
        }

        Const c = expr.propagateConst(con);
        if (c == null) {
            return null;
        } else {
            if (cInit == null || (cInit.getVal() == c.getVal())) {
                return c;
            } else {
                return null;
            }

        }
    }

    /**
     * @param expr
     *            expression to compute this equation
     */
    public void setExpr(final Expression expr) {
        this.expr = expr;
    }

    /**
     * @param init
     *            expression to initialize this equation
     */
    public void setInit(final Expression init) {
        this.init = init;
    }

    /**
     * @param clock
     *            new clock on which this equation runs
     */
    public void setClock(final String clock) {
        this.clock = clock;
    }

    /**
     * @return expression that computes this equation
     */
    public Expression getExpr() {
        return expr;
    }

    public void staticEval() {
        if (init != null) {
            init = init.staticEval();
        }
        expr = expr.staticEval();

    }

    public void replaceVar(final HashMap<String, Variable> equiv) {
        if (init != null) {
            init.replaceVar(equiv);
        }
        expr.replaceVar(equiv);
        Variable v = equiv.get(clock);
        if (v != null) {
            clock = v.getName();
        }
    }

    public int wcrt() {
        int res;
        if (init != null) {
            res = Math.max(init.wcrt(), expr.wcrt());
        } else {
            res = expr.wcrt();
        }

        return res + 1; // 1 for DONE
    }

    public int getPrio() {
        return prio;
    }

    public void setPrio(final int prio) {
        this.prio = prio;
    }

    public List<String> getPDeps() {
        return expr.getVars();
    }

    public boolean replace(final Equation eq) {
        if (eq.init != null) {
            // TODO: check for clocks
            // || !eq.clock.equals(clock)){

            return false;
        } else {
            expr = expr.replace(eq.getName(), eq.expr);
            return true;
        }

    }

}
