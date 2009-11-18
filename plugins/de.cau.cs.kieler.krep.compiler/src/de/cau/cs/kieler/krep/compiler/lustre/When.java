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
public class When extends Expression {
    private Expression expr;

    private VarAccess c;

    /**
     * generate new binary operation.
     * 
     * @param name
     *            of the expression
     * @param e
     * @param c
     */
    public When(final String name, final Expression e, final VarAccess c) {
        super(name);
        this.expr = e;
        this.c = c;
    }

    @Override
    public String toString() {
        return "(" + expr.toString() + " when " + c.toString() + ")";
    }

    @Override
    public boolean isAtom() {
        return false;
    }

    // @Override
    // public ceq.Expression toCEQ() {
    // ceq.Expression res = null;
    // System.err.println("found nestet when in ceq: " + toString());
    // System.exit(1);
    // return res;
    // }

    @Override
    protected void inferType() throws TypeException {
        expr.inferType();
        Type t1 = expr.type;
        c.inferType();
        Type t2 = c.type;

        if (t2 == Type.BOOL) {
            type = t1;
        } else {
            throw new TypeException(c, "BOOL", t2.toString());
        }

    }

    @Override
    public Expression propagatePre(final HashMap<String, Expression> eqs) {
        expr = expr.propagatePre(eqs);
        return this;
    }

    @Override
    public ClockList inferClock(final HashMap<String, Variable> env) throws ClockException {
        ClockList l1 = expr.inferClock(env);
        ClockList l2 = c.inferClock(env);
        if (!l1.equals(l2)) {
            throw new ClockException(this, l1, l2);
        }
        clock = l1.clone();
        clock.addClock(c.getName());
        return clock;
    }

    @Override
    public void propagateClock(final ClockList l) {
        clock = l.clone();
        ClockList c2 = clock.clone();
        c2.addClock(c.getName());
        expr.propagateClock(c2);
        c.propagateClock(clock);

        Debug.low(clock.toString() + " " + this.toString());
    }

    @Override
    public de.cau.cs.kieler.krep.compiler.ceq.Equation declock(final String basename, final int stage,
            final String C, final LinkedList<de.cau.cs.kieler.krep.compiler.ceq.Equation> aux) {
        de.cau.cs.kieler.krep.compiler.ceq.Equation res = expr.declock(basename, 2, c.getName(), aux);
        if (stage < 2) { // not inside when
            res.setClock(c.getName());
            return res;
        } else {
            de.cau.cs.kieler.krep.compiler.ceq.Variable v = de.cau.cs.kieler.krep.compiler.ceq.Variable
                    .getTemp(basename, type);

            res.setName(v.getName());
            aux.add(res);
            return new de.cau.cs.kieler.krep.compiler.ceq.Equation(name, null,
                    new de.cau.cs.kieler.krep.compiler.ceq.VarAccess(
                            de.cau.cs.kieler.krep.compiler.ceq.Variable.get(v.getName()), false), c
                            .getName());
        }
    }

    @Override
    public Expression liftClock() {
        expr = expr.liftClock();
        return this;
    }

    public void setExpression(final Expression e) {
        this.expr = e;
    }

    public Expression getExpression() {
        return expr;
    }

    public boolean sameClock(final When w) {
        return c.equals(w.c);
    }

    @Override
    public Expression extractPre(final HashMap<String, Expression> eqs) {
        expr = expr.extractPre(eqs);
        return this;
    }
}
