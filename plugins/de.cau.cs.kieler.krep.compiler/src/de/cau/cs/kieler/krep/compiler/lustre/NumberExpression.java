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
 * Integer constant in a Lustre program.
 * 
 * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp, tam
 * 
 * @author ctr 
 */
public class NumberExpression extends Expression {
    private int value;

    /**
     * @param name
     *            unique name fo the expression
     * @param num
     *            constant value
     */
    public NumberExpression(final String name, final int num) {
        super(name);
        this.value = num;
        setType(Type.INT);
    }

    /**
     * @param name
     *            name of the expression
     * @param val
     *            value of the constant number
     */
    public NumberExpression(final String name, final boolean val) {
        super(name);
        this.value = val ? 1 : 0;
        setType(Type.BOOL);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public Expression propagatePre(final HashMap<String, Expression> eqs) {
        return this;
    }

    @Override
    public boolean isAtom() {
        return true;
    }

    @Override
    protected void inferType() throws TypeException {
        // nothing to do
    }

    @Override
    public ClockList inferClock(final HashMap<String, Variable> env) throws ClockException {
        setClock(new ClockList());
        return getClock();
    }

    @Override
    public void propagateClock(final ClockList l) {
        setClock(l.clone());
        Debug.low(getClock().toString() + " " + this.toString());
    }

    @Override
    public de.cau.cs.kieler.krep.compiler.ceq.Equation declock(final String basename,
            final int stage, final String c,
            final LinkedList<de.cau.cs.kieler.krep.compiler.ceq.Equation> aux) {
        return new de.cau.cs.kieler.krep.compiler.ceq.Equation(getName(),
                new de.cau.cs.kieler.krep.compiler.ceq.ConstExpression(getName(), value));
    }

    @Override
    public Expression liftClock() {
        return this;
    }

    @Override
    public Expression extractPre(final HashMap<String, Expression> eqs) {
        return this;
    }
}
