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
import de.cau.cs.kieler.krep.compiler.helper.Type;

/**
 * Abstract superclass for Lustre(ec) expression.
 * 
 * @kieler.rating 2010-01-05 proposed yellow ctr
 * 
 * @author ctr
 */
public abstract class Expression {
    /** type of this expression. */
    private Type type = null;

    /**
     * @param t type of the expression
     */
    protected void setType(final Type t) {
        type = t;
    }

    /** unique name of the expression. */
    private String name;
    private Expression init;

    /**
     * @param n
     *            unique name of the expression
     */
    protected Expression(final String n) {
        this.setName(n);
    }

    /**
     * make sure only simple variables are inside of pre operators.
     * 
     * @param eqs
     *            additionally added equations
     * @return simplified expression
     */
    public abstract Expression propagatePre(HashMap<String, Expression> eqs);

    /**
     * @param eqs
     *            add auxiliary equations
     * @return expression without multiple pres
     */
    public abstract Expression extractPre(HashMap<String, Expression> eqs);

    /**
     * 
     * @return true if expression does not contain any subexpressions
     */
    public abstract boolean isAtom();

    /**
     * clock for this expression, null if on base clock.
     */
    private ClockList clock;

    /**
     * Compute clock on which this expression runs.
     * 
     * @param vars
     *            list of all defined variables
     * @return list of all sub-clocks
     * @throws ClockException
     *             thrown if any clock error occurs
     */
    public abstract ClockList inferClock(HashMap<String, Variable> vars) throws ClockException;

    /**
     * Propagate to each expression, on which clock it runs. The clock vector should be computed by
     * inferClock before.
     * 
     * @param l
     *            clock-vector for the expression
     */
    public abstract void propagateClock(ClockList l);

    /** declock fresh clocked equation. */
    public static final int STAGE_NEW = 0;
    /** declock clocked equation when current has been seen. */
    public static final int STAGE_CURRENT = 1;
    /** declock clocked equation when "when" has been seen. */
    public static final int STAGE_WHEN = 2;
    /** declock clocked equation when init has been seen. */
    public static final int STAGE_INIT = 3;

    /**
     * remove all clock operators inside.
     * 
     * @param basename
     *            name of the expression, used for auxiliary expressions
     * @param stage
     *            indicate what clock operators have already been in this equation: 0: on top level
     *            1: beyond current 2: beyond when 3: beyond ->
     * @param c
     *            clock
     * @param aux
     *            additional equations
     * @return new expression, without current, ->, and when
     */
    public abstract de.cau.cs.kieler.krep.compiler.ceq.Equation declock(String basename, int stage,
            String c, LinkedList<de.cau.cs.kieler.krep.compiler.ceq.Equation> aux);

    /**
     * 
     * @return name of the clock on which this expression runs
     */
    public ClockList getClock() {
        return clock;
    }

    /**
     * compute types and set type member recursively in all sub-expressions.
     * 
     * @throws TypeException
     *             thrown if any type problem occurs
     */
    protected abstract void inferType() throws TypeException;

    /**
     * 
     * @return type of the expression
     */
    public Type getType() {
        return type;
    }

    /**
     * @return unique Name of this expression
     */
    public String getName() {
        return name;
    }

    /**
     * @param e
     *            expression to initialize this variable
     */
    public void setInit(final Expression e) {
        init = e;
    }

    /**
     * @return expression to initialize this variable
     */
    public Expression getInit() {
        return init;
    }

    /**
     * 
     * @return equivalent expression with clocks lifted as much as possible.
     */
    public abstract Expression liftClock();

    /**
     * @param c
     *            additional clock for this expression.
     */
    public void addClock(final String c) {
        clock.addClock(c);

    }

    /**
     * @param n the name to set
     */
    protected void setName(final String n) {
        this.name = n;
    }

    /**
     * @param clk the clock to set
     */
    protected void setClock(final ClockList clk) {
        this.clock = clk;
    }
}
