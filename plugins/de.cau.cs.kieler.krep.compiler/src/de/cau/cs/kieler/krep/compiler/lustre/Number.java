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
 * @author ctr integer constant in a Lustre program
 */
public class Number extends Expression {
    int num;

    /**
     * @param name
     *            unique name fo the expression
     * @param num
     *            constant value
     */
    public Number(String name, final int num) {
        super(name);
        this.num = num;
        this.type = Type.INT;
    }

    public Number(String name, boolean val) {
        super(name);
        this.num = val ? 1 : 0;
        this.type = Type.BOOL;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

    @Override
    public Expression propagatePre(final HashMap<String, Expression> eqs) {
        return this;
    }

    @Override
    public boolean isAtom() {
        return true;
    }

    // @Override
    // public ceq.Expression toCEQ() {
    // ceq.Expression res = null;
    // switch(type){
    // case BOOL: res = new ceq.Const(name, num!=0); break;
    // case INT: res = new ceq.Const(name, num); break;
    // case REAL: break;
    // }
    // return res;
    // }

    @Override
    protected void inferType() throws TypeException {
        // nothing to do
    }

    @Override
    public ClockList inferClock(HashMap<String, Variable> env) throws ClockException {
        clock = new ClockList();
        return clock;
    }

    @Override
    public void propagateClock(ClockList l) {
        clock = l.clone();
        Debug.low(clock.toString() + " " + this.toString());
    }

    @Override
    public de.cau.cs.kieler.krep.compiler.ceq.Equation declock(final String basename, final int stage,
            final String C, final LinkedList<de.cau.cs.kieler.krep.compiler.ceq.Equation> aux) {
        return new de.cau.cs.kieler.krep.compiler.ceq.Equation(name,
                new de.cau.cs.kieler.krep.compiler.ceq.Const(name, num));
    }

    @Override
    public Expression liftClock() {
        return this;
    }

    @Override
    public Expression extractPre(HashMap<String, Expression> eqs) {
        return this;
    }
}
