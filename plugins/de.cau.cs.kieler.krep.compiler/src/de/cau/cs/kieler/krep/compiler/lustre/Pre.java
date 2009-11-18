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

/**
 * @author ctr Lustre previous expression
 */
public class Pre extends Expression {
    private Expression expr;

    /**
     * @param name
     *            unique name of the expression
     * @param e
     *            expression which previous value is computed
     */
    public Pre(final String name, final Expression e) {
        super(name);
        this.expr = e;
    }

    @Override
    public String toString() {
        return "(pre " + expr.toString() + ")";
    }

    @Override
    public Expression propagatePre(final HashMap<String, Expression> eqs) {
        Variable t = Variable.getTemp("pre_", expr.type, null);
        eqs.put(t.getName(), expr);
        return new Pre(t.getName(), new VarAccess(t));
    }

    @Override
    public boolean isAtom() {
        return false;
    }

    // @Override
    // public ceq.Expression toCEQ() {
    // if (e instanceof VarAccess) {
    // VarAccess v = (VarAccess) e;
    // return new ceq.VarAccess(ceq.Variable.get(v.toString()), true);
    // } else {
    // System.err.println("found non-trivial pre in ceq");
    // System.exit(1);
    // return null;
    // }
    //
    // }

    @Override
    protected void inferType() throws TypeException {
        expr.inferType();
        type = expr.type;
    }

    @Override
    public ClockList inferClock(final HashMap<String, Variable> env) throws ClockException {
        clock = expr.inferClock(env);
        return clock;
    }

    @Override
    public void propagateClock(final ClockList l) {
        clock = l.clone();
        expr.propagateClock(l);
        Debug.low(clock.toString() + " " + this.toString());
    }

    @Override
    public de.cau.cs.kieler.krep.compiler.ceq.Equation declock(final String basename,
            final int stage, final String c,
            final LinkedList<de.cau.cs.kieler.krep.compiler.ceq.Equation> aux) {
        if (expr instanceof VarAccess) {
            VarAccess v = (VarAccess) expr;

            return new de.cau.cs.kieler.krep.compiler.ceq.Equation(name,
                    new de.cau.cs.kieler.krep.compiler.ceq.VarAccess(
                            de.cau.cs.kieler.krep.compiler.ceq.Variable.get(v.getName()), true));
        } else {
            System.err.println("internal error: found nested pre");
            return null;
        }
    }

    @Override
    public Expression liftClock() {
        expr = expr.liftClock();
        if (expr instanceof When) {
            When w = (When) expr;
            expr = w.getExpression();
            w.setExpression(this);
            return w;
        } else {
            return this;
        }

    }

    @Override
    public Expression extractPre(final HashMap<String, Expression> eqs) {
        if (expr instanceof VarAccess) {
            return this;
        } else {
            Variable v = Variable.getTemp("pre_", expr.getType(), expr.getClock());
            eqs.put(v.getName(), expr.extractPre(eqs));
            expr = new VarAccess(v);
            return this;
        }
    }
}
