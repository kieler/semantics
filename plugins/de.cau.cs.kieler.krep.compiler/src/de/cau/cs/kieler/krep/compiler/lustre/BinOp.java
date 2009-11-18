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
 * @author ctr Lustre binary expression this includes when and ->
 */
public class BinOp extends Expression {
    private Expression expr1, expr2;

    private final Operator oper;

    /**
     * generate new binary operation.
     * 
     * @param name
     *            of the expression
     * @param e1
     *            first expression
     * @param e2
     *            second expresssion
     * @param op
     *            operator to combine them
     */
    public BinOp(final String name, final Expression e1, final Expression e2, final Operator op) {
        super(name);
        this.oper = op;
        this.expr1 = e1;
        this.expr2 = e2;
    }

    @Override
    public String toString() {
        return "(" + expr1.toString() + " " + oper.toString() + " " + expr2.toString() + ")";
    }

    @Override
    public boolean isAtom() {
        return false;
    }

    @Override
    protected void inferType() throws TypeException {
        expr1.inferType();
        Type t1 = expr1.type;
        expr2.inferType();
        Type t2 = expr2.type;
        switch (oper) {
        case ADD:
        case SUB:
        case MUL:
        case DIV:
        case MOD:
            if (t1 == Type.INT && t2 == Type.INT) {
                type = Type.INT;
            } else {
                throw new TypeException(this, "INT x INT", t1.toString() + " x " + t2.toString());
            }
            break;
        case AND:
        case OR:
        case XOR:
        case IMPL:
            if (t1 == Type.BOOL && t2 == Type.BOOL) {
                type = Type.BOOL;
            } else {
                throw new TypeException(this, "BOOL x BOOL", t1.toString() + " x " + t2.toString());
            }
            break;

        case GE:
        case GT:
        case LE:
        case LT:
            if (t1 == Type.INT && t2 == Type.INT) {
                type = Type.BOOL;
            } else {
                throw new TypeException(this, "INT x INT", t1.toString() + " x " + t2.toString());
            }
            break;
        case EQ:
        case NEQ:
            if ((t1 == Type.INT && t2 == Type.INT) || (t1 == Type.BOOL && t2 == Type.BOOL)) {
                type = Type.BOOL;
            } else {
                throw new TypeException(this, "INT x INT", t1.toString() + " x " + t2.toString());
            }
            break;
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
        clock = l1;
        return clock;
    }

    @Override
    public void propagateClock(final ClockList l) {
        clock = l.clone();
        expr1.propagateClock(clock);
        expr2.propagateClock(clock);
        Debug.low(clock.toString() + " " + this.toString());
    }

    @Override
    public de.cau.cs.kieler.krep.compiler.ceq.Equation declock(final String basename,
            final int stage, final String clock,
            final LinkedList<de.cau.cs.kieler.krep.compiler.ceq.Equation> aux) {
        de.cau.cs.kieler.krep.compiler.ceq.Equation eq1 = expr1.declock(basename,
                Expression.STAGE_INIT, clock, aux);
        de.cau.cs.kieler.krep.compiler.ceq.Equation eq2 = expr2.declock(basename,
                Expression.STAGE_INIT, clock, aux);
        return new de.cau.cs.kieler.krep.compiler.ceq.Equation(name,
                new de.cau.cs.kieler.krep.compiler.ceq.BinOp(name, eq1.getExpr(), eq2.getExpr(),
                        oper));
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
