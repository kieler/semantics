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
import de.cau.cs.kieler.krep.compiler.helper.Debug;
import de.cau.cs.kieler.krep.compiler.prog.Type;

/**
 * @author ctr Lustre IF Expression
 */
public class If extends Expression {
    private Expression expr1, expr2, expr3;

    /**
     * @param name
     *            unique name of this expression
     * @param e1
     *            boolean expression to test
     * @param e2
     *            expression to evaluate in then case
     * @param e3
     *            expression to evaluate in else case
     */
    public If(final String name, final Expression e1, final Expression e2, final Expression e3) {
        super(name);
        this.expr1 = e1;
        this.expr2 = e2;
        this.expr3 = e3;
    }

    @Override
    public String toString() {
        return "if " + expr1.toString() + " then " + expr2.toString() + " else " + expr3.toString();
    }

    @Override
    public Expression propagatePre(final HashMap<String, Expression> eqs) {
        expr1 = expr1.propagatePre(eqs);
        expr2 = expr2.propagatePre(eqs);
        expr3 = expr3.propagatePre(eqs);
        return this;
    }

    @Override
    public boolean isAtom() {
        return false;
    }

    // @Override
    // public ceq.Expression toCEQ() {
    // return new ceq.If(name, e1.toCEQ(), e2.toCEQ(), e3.toCEQ());
    // }

    @Override
    protected void inferType() throws TypeException {
        expr1.inferType();
        expr2.inferType();
        expr3.inferType();
        if (expr1.type != Type.BOOL) {
            throw new TypeException(expr1, Type.BOOL.toString(), expr1.type.toString());
        }
        if (expr2.type != expr3.type) {
            throw new TypeException(this, "BOOL x T x T", expr1.type.toString() + " x "
                    + expr2.type.toString() + " x " + expr3.type.toString());
        }
        type = expr2.type;
    }

    @Override
    public ClockList inferClock(final HashMap<String, Variable> env) throws ClockException {
        ClockList l1 = expr1.inferClock(env);
        ClockList l2 = expr2.inferClock(env);
        ClockList l3 = expr3.inferClock(env);
        if (!l1.equals(l2)) {
            throw new ClockException(this, l1, l2);
        }
        if (!l1.equals(l3)) {
            throw new ClockException(this, l1, l3);
        }
        clock = l1;
        return clock;
    }

    @Override
    public void propagateClock(final ClockList l) {
        clock = l.clone();
        expr1.propagateClock(clock);
        expr2.propagateClock(clock);
        expr3.propagateClock(clock);
        Debug.low(clock.toString() + " " + this.toString());
    }

    @Override
    public de.cau.cs.kieler.krep.compiler.ceq.Equation declock(final String basename,
            final int stage, final String c,
            final LinkedList<de.cau.cs.kieler.krep.compiler.ceq.Equation> aux) {
        de.cau.cs.kieler.krep.compiler.ceq.Equation eq1 = expr1.declock(basename,
                Expression.STAGE_INIT, c, aux);
        de.cau.cs.kieler.krep.compiler.ceq.Equation eq2 = expr2.declock(basename,
                Expression.STAGE_INIT, c, aux);
        de.cau.cs.kieler.krep.compiler.ceq.Equation eq3 = expr3.declock(basename,
                Expression.STAGE_INIT, c, aux);
        return new de.cau.cs.kieler.krep.compiler.ceq.Equation(name,
                new de.cau.cs.kieler.krep.compiler.ceq.If(name, eq1.getExpr(), eq2.getExpr(), eq3
                        .getExpr()));
    }

    @Override
    public Expression liftClock() {
        expr1 = expr1.liftClock();
        expr2 = expr2.liftClock();
        expr3 = expr3.liftClock();
        if (expr1 instanceof When && expr2 instanceof When && expr3 instanceof When) {
            When w1 = (When) expr1;
            When w2 = (When) expr2;
            When w3 = (When) expr3;
            if (w1.sameClock(w2) && w1.sameClock(w3)) {
                expr1 = w1.getExpression();
                expr2 = w2.getExpression();
                expr3 = w3.getExpression();
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
        expr3 = expr3.extractPre(eqs);
        return this;
    }

}
