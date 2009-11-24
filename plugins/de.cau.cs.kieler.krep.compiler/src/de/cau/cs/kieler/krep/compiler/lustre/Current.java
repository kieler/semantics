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
 * Lustre clock operator current.
 * 
 * @author ctr
 * 
 */
public class Current extends Expression {
    private Expression expr;

    /**
     * @param name
     *            unique name of this expression
     * @param e
     *            body of current expression
     */
    public Current(final String name, final Expression e) {
        super(name);
        this.expr = e;
    }

    @Override
    public String toString() {
        return "(current " + expr.toString() + ")";
    }

    @Override
    public boolean isAtom() {
        return true;
    }

    @Override
    public Expression propagatePre(final HashMap<String, Expression> eqs) {
        return expr.propagatePre(eqs);
    }

    @Override
    protected void inferType() throws TypeException {
        expr.inferType();
        setType(expr.getType());
    }

    @Override
    public ClockList inferClock(final HashMap<String, Variable> env) throws ClockException {
        setClock(expr.inferClock(env).clone());
        getClock().removeClock();
        return getClock();
    }

    @Override
    public void propagateClock(final ClockList l) {
        setClock(l.clone());
        expr.propagateClock(getClock());
        Debug.low(getClock().toString() + " " + this.toString());
    }

    @Override
    public de.cau.cs.kieler.krep.compiler.ceq.Equation declock(final String basename,
            final int stage, final String c,
            final LinkedList<de.cau.cs.kieler.krep.compiler.ceq.Equation> aux) {
        de.cau.cs.kieler.krep.compiler.ceq.Equation res = expr.declock(basename, 1, c, aux);
        if (stage == 0) {
            if (!(expr instanceof When)) {
                System.err.println("internal error: no when inside current");
            }
            return res;
        } else {
            de.cau.cs.kieler.krep.compiler.ceq.Variable v = de.cau.cs.kieler.krep.compiler.ceq.Variable
                    .getTemp(basename, getType());
            res.setName(v.getName());
            aux.add(res);
            return new de.cau.cs.kieler.krep.compiler.ceq.Equation(getName(),
                    new de.cau.cs.kieler.krep.compiler.ceq.VarAccess(v, false));
        }
    }

    @Override
    public Expression liftClock() {
        expr = expr.liftClock();
        return this;
    }

    @Override
    public Expression extractPre(final HashMap<String, Expression> eqs) {
        expr = expr.extractPre(eqs);
        return this;
    }
}
