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
 * Implement the possible immediate access to a Lustre variable.
 * 
 * @author ctr
 * 
 */
public class VarAccess extends Expression {

    private final Variable var;

    /**
     * @param name
     *            name of the read variable
     */
    public VarAccess(final String name) {
        this(Variable.get(name));
    }

    /**
     * @param v
     *            variable to read
     */
    public VarAccess(final Variable v) {
        super(v.getName());
        this.var = v;
        this.type = var.getType();
        this.clock = var.getClock().clone();
    }

    /**
     * @param clock
     *            on which the variable shall run
     */
    public void setClock(final String clock) {
        if (clock != null) {
            this.clock.addClock(clock);
        }
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Expression propagatePre(final HashMap<String, Expression> eqs) {
        return new Pre("pre_" + this.name, this);
    }

    @Override
    public boolean isAtom() {
        return true;
    }

    @Override
    protected void inferType() throws TypeException {
        // Noting to do, type defined by constructor
    }

    @Override
    public ClockList inferClock(final HashMap<String, Variable> env) throws ClockException {
        clock = var.getClock().clone();// new ClockList();
        return new ClockList();
    }

    @Override
    public void propagateClock(final ClockList l) {
        clock = l.clone();
        Debug.low(clock.toString() + " " + this.toString());
    }

    @Override
    public de.cau.cs.kieler.krep.compiler.ceq.Equation declock(final String basename,
            final int stage, final String c,
            final LinkedList<de.cau.cs.kieler.krep.compiler.ceq.Equation> aux) {
        return new de.cau.cs.kieler.krep.compiler.ceq.Equation(name,
                new de.cau.cs.kieler.krep.compiler.ceq.VarAccess(
                        de.cau.cs.kieler.krep.compiler.ceq.Variable.get(var.getName()), false));
    }

    @Override
    public Expression liftClock() {
        if (!clock.isBase()) {
            return new When(this.name, this, new VarAccess(Variable.get(clock.getClock())));
        } else {
            return this;
        }
    }

    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof VarAccess)) {
            return false;
        }
        VarAccess v = (VarAccess) o;
        return v.var.equals(var);
    }

    @Override
    public Expression extractPre(final HashMap<String, Expression> eqs) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
