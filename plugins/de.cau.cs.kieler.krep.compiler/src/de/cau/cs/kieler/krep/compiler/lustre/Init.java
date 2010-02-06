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
package de.cau.cs.kieler.krep.compiler.lustre;

import java.util.HashMap;
import java.util.LinkedList;

import de.cau.cs.kieler.krep.compiler.exceptions.ClockException;
import de.cau.cs.kieler.krep.compiler.exceptions.TypeException;
import de.cau.cs.kieler.krep.compiler.util.Debug;
import de.cau.cs.kieler.krep.compiler.util.Type;

/**
 * Initialization of Lustre flows.
 * 
 * @kieler.rating 2010-01-05 proposed yellow ctr
 * 
 * @author ctr
 */
public class Init extends Expression {
    private Expression expr1, expr2;

    /**
     * generate new initial operation.
     * 
     * @param name
     *            of the expression
     * @param e1
     *            initial expression
     * @param e2
     *            runtime expression
     */
    public Init(final String name, final Expression e1, final Expression e2) {
        super(name);
        this.expr1 = e1;
        this.expr2 = e2;
    }

    @Override
    public String toString() {
        return "(" + expr1.toString() + " -> " + expr2.toString() + ")";
    }

    @Override
    public boolean isAtom() {
        return false;
    }

    // @Override
    // public ceq.Expression toCEQ() {
    // ceq.Expression res = null;
    // System.err.println("found nested init in ceq: " + toString());
    // System.exit(1);
    // return null;
    // }

    @Override
    protected void inferType() throws TypeException {
        expr1.inferType();
        Type t1 = expr1.getType();
        expr2.inferType();
        Type t2 = expr2.getType();
        if (t1 == t2) {
            setType(t1);
        } else {
            throw new TypeException(this, "T x T", t1.toString() + " x " + t2.toString());
        }
    }

    @Override
    public Expression propagatePre(final HashMap<String, Expression> eqs) {
        expr1 = expr1.propagatePre(eqs);
        expr2 = expr2.propagatePre(eqs);
        return this;
    }

    @Override
    public ClockList inferClock(final HashMap<String, Variable> env) throws ClockException {
        ClockList l1 = expr1.inferClock(env);
        ClockList l2 = expr2.inferClock(env);
        if (!l1.equals(l2)) {
            throw new ClockException(this, l1, l2);
        }
        setClock(l1);
        return getClock();
    }

    @Override
    public void propagateClock(final ClockList l) {
        setClock(l.clone());
        expr1.propagateClock(getClock());
        expr2.propagateClock(getClock());
        Debug.low(getClock().toString() + " " + this.toString());
    }

    @Override
    public de.cau.cs.kieler.krep.compiler.ceq.Equation declock(final String basename,
            final int stage, final String c,
            final LinkedList<de.cau.cs.kieler.krep.compiler.ceq.Equation> aux) {
        de.cau.cs.kieler.krep.compiler.ceq.Equation eq1 = expr1.declock(basename,
                Expression.STAGE_INIT, c, aux);
        de.cau.cs.kieler.krep.compiler.ceq.Equation eq2 = expr2.declock(basename,
                Expression.STAGE_INIT, c, aux);
        if (expr1.isAtom()) {
            eq2.setInit(eq1.getExpr());
            // e2.clock = this.clock;
        } else {
            de.cau.cs.kieler.krep.compiler.ceq.Variable v = de.cau.cs.kieler.krep.compiler.ceq.Variable
                    .getTemp(basename, getType());
            if (c != null) {
                eq1.setClock(c);
            }
            eq1.setName(v.getName());
            aux.add(eq1);
            eq2.setInit(new de.cau.cs.kieler.krep.compiler.ceq.VarAccessExpression(v, false));
        }
        if (stage < STAGE_INIT) { // not inside init
            return eq2;
        } else {
            de.cau.cs.kieler.krep.compiler.ceq.Variable v = de.cau.cs.kieler.krep.compiler.ceq.Variable
                    .getTemp(basename, getType());
            if (c != null) {
                eq2.setClock(c);
            }
            eq2.setName(v.getName());
            aux.add(eq2);
            return new de.cau.cs.kieler.krep.compiler.ceq.Equation(getName(),
                    new de.cau.cs.kieler.krep.compiler.ceq.VarAccessExpression(v, false));
        }
    }

    @Override
    public Expression liftClock() {
        expr1 = expr1.liftClock();
        expr2 = expr2.liftClock();
        if (expr1 instanceof When && expr2 instanceof When) {
            When w1 = (When) expr1;
            When w2 = (When) expr2;
            if (w1.sameClock(w2)) {
                expr1 = w1.getExpression();
                expr2 = w2.getExpression();
                w1.setExpression(this);
                return w1;
            } else {
                return this;
            }
        } else {
            return this;
        }
    }

    @Override
    public Expression extractPre(final HashMap<String, Expression> eqs) {
        expr1 = expr1.extractPre(eqs);
        expr2 = expr2.extractPre(eqs);
        return this;
    }
}
