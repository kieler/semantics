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
package de.cau.cs.kieler.krep.compiler.ceq;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.krep.compiler.klp.instructions.Instruction;
import de.cau.cs.kieler.krep.compiler.prog.Type;

/**
 * Abstract superclass for all ceq Expressions. Note that every sub-expression should have a unique
 * name.
 * 
 * @kieler.rating 2010-01-05 proposed yellow ctr
 * 
 * @author ctr
 */
public abstract class Expression {
    /**
     * unique name of the expression.
     */
    private String name;

    /**
     * 
     * @param n
     *            name of the expression.
     */
    protected Expression(final String n) {
        this.setName(n);
    }

    /**
     * 
     * @return type of the current expression
     */
    public abstract Type getType();

    /**
     * compute list of all variables that syntactically occur in the expression.
     * 
     * @return list of used variables
     */
    public abstract List<String> getVars();

    /**
     * compute List of all variables, on which current value the expression depends. This is the
     * same as getVars without the variables which pre value is used.
     * 
     * @return list of variables this expression depends on
     */
    public abstract List<Variable> getDeps();

    @Override
    public abstract String toString();

    /**
     * extract sub-expressions from operations.
     * 
     * @param n
     *            name of the expression
     * @param vars
     *            holds additionally added variables
     * @param es
     *            additionally added expression
     * @return expression without complex operations
     */
    public abstract Expression flatten(String n, HashMap<String, Variable> vars,
            LinkedList<Expression> es);

    /**
     * add additional pre operators, to use all variables with the right tick.
     * 
     * @param delay
     *            : delay for all variables
     * @param n
     *            : delay of the output
     * @return additional equation to store previous values
     */
    public abstract Expression padDelay(HashMap<String, Integer> delay, int n);

    /**
     * compute whether this is an atomic expression.
     * 
     * @return true if expression contains no sub-expression
     */
    public abstract boolean isAtom();

    /**
     * compute instructions to execute this expression on the KLP.
     * 
     * @param to
     *            Register to store the result
     * @return list of KLP instructions that compute this expression
     */
    public abstract LinkedList<Instruction> toKlp(Variable to);

    /**
     * @return name of the expression
     */
    public String getName() {
        return name;
    }

    /**
     * @param con
     *            mapping variable to constant values, if they can be evaluated
     * @return a constant when the expression can be completely evaluated
     */
    public abstract Const propagateConst(HashMap<String, Const> con);

    /**
     * @return evaluate static expressions.
     */
    public abstract Expression staticEval();

    /**
     * @param equiv
     *            list of equivalent variables.
     */
    public abstract void replaceVar(HashMap<String, Variable> equiv);

    /**
     * @return estimated wcrt for the expression.
     */
    public abstract int wcrt();

    /**
     * @param var
     *            name of the expression to replace
     * @param expr
     *            expression by which the variable is replaced.
     * @return new expression
     */
    public abstract Expression replace(String var, Expression expr);

    /**
     * @param n
     *            the name to set
     */
    protected void setName(final String n) {
        this.name = n;
    }
}
