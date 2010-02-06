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

import de.cau.cs.kieler.krep.compiler.klp.CJmpInstruction;
import de.cau.cs.kieler.krep.compiler.klp.DoneInstruction;
import de.cau.cs.kieler.krep.compiler.klp.AbstractInstruction;
import de.cau.cs.kieler.krep.compiler.klp.LabelInstruction;
import de.cau.cs.kieler.krep.compiler.klp.RegAccess;
import de.cau.cs.kieler.krep.compiler.util.Debug;
import de.cau.cs.kieler.krep.compiler.util.Type;

/**
 * A clocked equation, consisting of a name, a initial expression, a runtime expression, and a
 * clock.
 * 
 * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp, tam
 * 
 * @author ctr
 */
public class Equation {
    private String name;

    /** Expression that is evaluated at runtime. */
    private Expression expression;

    /** expression to initialize the equation. If this is null, the runtime expression is used */
    private Expression initialize;

    /** Computed type of this equation. */
    private Type type;

    /** Clock on which the equation runs, null for base clock. */
    private String clock;

    /** Computed priority. */
    private int prio;

    /**
     * Construct a new clocked equation.
     * 
     * @param id
     *            name of the value that is computed
     * @param i
     *            expression to compute the initial value
     * @param e
     *            expression to compute the value during runtim
     * @param clk
     *            the clock on which the equation is evaluated
     * 
     */
    public Equation(final String id, final Expression i, final Expression e, final String clk) {
        super();
        this.clock = clk;
        this.expression = e;
        this.initialize = i;
        this.name = id;
        this.type = e.getType();
    }

    /**
     * generate Equation without initializer which runs on the base clock.
     * 
     * @param id
     *            name of the equation
     * @param expr
     *            expres * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp, tamsion to compute the equation.
     */
    public Equation(final String id, final Expression expr) {
        this(id, null, expr, null);
    }

    /**
     * Show the equation in Lustre format: v=init -> current(e when c)
     * 
     * @return Lustre equation for the clocked equation.
     */
    @Override
    public String toString() {
        String res = name + " = ";
        if (clock != null) {
            res += " current((";
        }
        if (initialize != null) {
            res += initialize.toString() + "->";
        }

        res += expression.toString();
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
        return expression.getDeps();
    }

    /**
     * @return name of the value that is computed
     */
    public String getName() {
        return name;
    }

    /**
     * @return expression to initialize the equation
     */
    public Expression getInit() {
        return initialize;
    }

    /**
     * @param n
     *            name of the variable that is computed by this equation
     */
    public void setName(final String n) {
        this.name = n;
    }

    /**
     * @return clock on which this equation runs
     */
    public String getClock() {
        return clock;
    }

    /**
     * @return true if the equation has a clock
     */
    public boolean hasClock() {
        return clock != null;
    }

    /**
     * Replace complex expressions in the init expression and introduce auxiliary equations if
     * necessary.
     * 
     * @param vars
     *            list of new introduced variables
     * @return List of new introduced equations, the first element in the list is the original
     *         equation (this).
     * 
     */
    public LinkedList<Equation> flatten(final HashMap<String, Variable> vars) {
        LinkedList<Expression> es = new LinkedList<Expression>();
        LinkedList<Equation> res = new LinkedList<Equation>();
        if (initialize != null && !initialize.isAtom()) {
            initialize.flatten(name, vars, es);
            initialize = es.getFirst();

            for (Expression e : es) {
                res.add(new Equation(e.getName(), null, e, clock));
            }
            es.clear();
        }
        return res;
    }

    /**
     * generate KLP code to compute this equation.
     * 
     * @param useClocks
     *            true if hardware clocks of the klp are used
     * @param scope
     *            scope of the equation
     * 
     * @param vars
     *            list of all used variables
     * @return list ofKLP instructions to compute the value
     */
    public LinkedList<AbstractInstruction> toKlp(final boolean useClocks, final String scope,
            final HashMap<String, Variable> vars) {
        Debug.low("to KLP: " + name);
        Debug.low(toString());
        LinkedList<AbstractInstruction> instr = new LinkedList<AbstractInstruction>();
        LinkedList<Expression> es = new LinkedList<Expression>();
        // generate labels
        LabelInstruction l = LabelInstruction.get(name + scope);
        LabelInstruction lInit = LabelInstruction.get(name + "_init" + scope);
        LabelInstruction lRun = LabelInstruction.get(name + "_run" + scope);
        LabelInstruction lDone = LabelInstruction.get(name + "_done" + scope);

        // init code
        instr.add(l);
        if (!useClocks && hasClock()) {
            instr.add(new CJmpInstruction(CJmpInstruction.Cond.T, new RegAccess(
                    Variable.get(clock), false), lInit));
            instr.add(new DoneInstruction(l));
            instr.add(lInit);
        }
        if (initialize != null) {
            for (Expression e : es) {
                instr.addAll(e.toKlp(Variable.get(e.getName())));
                Debug.low(e.toString());
            }
            instr.addAll(initialize.toKlp(Variable.get(name)));
            es.clear();
            instr.add(new DoneInstruction(lRun));
        }
        instr.add(lRun);
        if (!useClocks && hasClock()) {
            instr.add(new CJmpInstruction(CJmpInstruction.Cond.F, new RegAccess(
                    Variable.get(clock), false), lDone));
        }
        for (Expression e : es) {
            instr.addAll(e.toKlp(Variable.get(e.getName())));
            Debug.low(e.toString());
        }
        instr.addAll(expression.toKlp(Variable.get(name)));
        if (!useClocks && hasClock()) {
            instr.add(lDone);
        }
        return instr;
    }

    /**
     * @return type of these equation
     */
    public Type getType() {
        return expression.getType();
    }

    /**
     * @param con
     *            constant values.
     * @return propagate constant values
     */
    public ConstExpression propagateConst(final HashMap<String, ConstExpression> con) {
        Debug.low("propagate const");
        ConstExpression cInit = null;
        if (initialize != null) {
            cInit = initialize.propagateConst(con);
            if (cInit != null) {
                initialize = cInit;
            }
        }

        ConstExpression c = expression.propagateConst(con);
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
        this.expression = expr;
    }

    /**
     * @param init
     *            expression to initialize this equation
     */
    public void setInit(final Expression init) {
        this.initialize = init;
    }

    /**
     * @param clk
     *            new clock on which this equation runs
     */
    public void setClock(final String clk) {
        this.clock = clk;
    }

    /**
     * @return expression that computes this equation
     */
    public Expression getExpr() {
        return expression;
    }

    /**
     * static evaluation.
     */
    public void staticEval() {
        if (initialize != null) {
            initialize = initialize.staticEval();
        }
        expression = expression.staticEval();

    }

    /**
     * @param equiv
     *            list of equivalent variables.
     */
    public void replaceVar(final HashMap<String, Variable> equiv) {
        if (initialize != null) {
            initialize.replaceVar(equiv);
        }
        expression.replaceVar(equiv);
        Variable v = equiv.get(clock);
        if (v != null) {
            clock = v.getName();
        }
    }

    /**
     * @return estimated wcrt for the equation.
     */
    public int wcrt() {
        int res;
        if (initialize != null) {
            res = Math.max(initialize.wcrt(), expression.wcrt());
        } else {
            res = expression.wcrt();
        }

        return res + 1; // 1 for DONE
    }

    /**
     * @return priotrity for the equation.
     */
    public int getPrio() {
        return prio;
    }

    /**
     * @param pr
     *            priority
     */
    public void setPrio(final int pr) {
        this.prio = pr;
    }

    /**
     * @return all dependencies of the equation.
     */
    public List<String> getPDeps() {
        return expression.getVars();
    }

    /**
     * @param eq
     *            equation to replace.
     * @return true if the replacement was successful.
     */
    public boolean replace(final Equation eq) {
        if (eq.initialize != null) {
            // TODO: check for clocks
            // || !eq.clock.equals(clock)){

            return false;
        } else {
            expression = expression.replace(eq.getName(), eq.expression);
            return true;
        }

    }

}
