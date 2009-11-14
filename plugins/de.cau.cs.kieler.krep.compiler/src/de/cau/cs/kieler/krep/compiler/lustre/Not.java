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
 * @author ctr Lustre "not" operator
 */
public class Not extends Expression {
    private Expression e;

    /**
     * @param name
     *            uniue name of the expression
     * @param e
     *            expression to negate
     */
    public Not(String name, Expression e) {
        super(name);
        this.e = e;
    }

    @Override
    public String toString() {
        return "(not " + e.toString() + ")";
    }

    @Override
    public Expression propagatePre(HashMap<String, Expression> eqs) {
        e = e.propagatePre(eqs);
        return this;
    }

    @Override
    public boolean isAtom() {
        return false;
    }

    // @Override
    // public ceq.Expression toCEQ() {
    // return new ceq.Not(name, e.toCEQ());
    // }

    @Override
    protected void inferType() throws TypeException {
        e.inferType();
        type = e.type;
        if (type != Type.BOOL) {
            throw new TypeException(e, Type.BOOL.toString(), e.type.toString());
        }
    }

    @Override
    public ClockList inferClock(HashMap<String, Variable> env) throws ClockException {
        clock = e.inferClock(env);
        return clock;
    }

    @Override
    public void propagateClock(ClockList l) {
        clock = l.clone();
        e.propagateClock(clock);
        Debug.low(clock.toString() + " " + this.toString());
    }

    @Override
    public de.cau.cs.kieler.krep.compiler.ceq.Equation declock(String basename, int stage,
            String C, LinkedList<de.cau.cs.kieler.krep.compiler.ceq.Equation> aux) {
        de.cau.cs.kieler.krep.compiler.ceq.Equation eq = e.declock(basename, 3, C, aux);
        return new de.cau.cs.kieler.krep.compiler.ceq.Equation(name,
                new de.cau.cs.kieler.krep.compiler.ceq.Not(name, eq.getExpr()));

    }

    @Override
    public Expression liftClock() {
        e = e.liftClock();
        if (e instanceof When) {
            When w = (When) e;
            e = w.getExpression();
            w.setExpression(this);
            return w;
        } else {
            return this;
        }
    }

    @Override
    public Expression extractPre(HashMap<String, Expression> eqs) {
        e = e.extractPre(eqs);
        return this;
    }
}
