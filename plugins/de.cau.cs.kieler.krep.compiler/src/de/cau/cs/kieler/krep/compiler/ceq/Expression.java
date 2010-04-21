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

import de.cau.cs.kieler.krep.compiler.ceq.Variable.Kind;
import de.cau.cs.kieler.krep.compiler.klp.AbstractInstruction;
import de.cau.cs.kieler.krep.compiler.util.Type;

/**
 * Abstract superclass for all ceq Expressions. Note that every sub-expression should have a unique
 * name.
 * 
 * @kieler.rating 2010-02-05 yellow review by cmot, msp, tam
 * 
 * @author ctr
 */
public abstract class Expression {
    /**
     * unique name of the expression.
     */
    private String name;

    /** The program that contains this expression. */
    private Program prog;

    /**
     * Generate new named expression, the actual expression is defined by the actual subclass.
     * 
     * @param n
     *            name of the expression.
     * @param p
     *            the program that contains the expression
     */
    protected Expression(final String n, final Program p) {
        setProg(p);
        this.setName(n);
    }

    
    
    /**
     * @return program that contains the expression
     */
    public Program getProg() {
        return prog;
    }



   
    /**
     * @param prog program that contains the expression
     */
    protected void setProg(final Program p) {
        this.prog = p;
    }



    /**
     * Return the inferred type of the expression.
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

    /**
     * Show the expression in Lustre syntax.
     * 
     * @return textual description of the expression in Lustre
     */
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
    public abstract LinkedList<AbstractInstruction> toKlp(Variable to);

    /**
     * Get unique name of the expression.
     * 
     * @return name of the expression
     */
    public String getName() {
        return name;
    }

    /**
     * Propagate constant values, ie, replace all occurrences of a variable by a constant.
     * 
     * @param con
     *            mapping variable to constant values, if they can be evaluated
     * @return a constant when the expression can be completely evaluated
     */
    public abstract ConstExpression propagateConst(HashMap<String, ConstExpression> con);

    /**
     * Perform static evaluation, remove operations on constant values by the result of the
     * operation.
     * 
     * @return evaluate static expressions.
     */
    public abstract Expression staticEval();

    /**
     * Replace a variable by another one. This is useful for Scade programs, where each port
     * corresponds to one variable, but we want to have one variable per wire.
     * 
     * @param equiv
     *            list of equivalent variables.
     */
    public abstract void replaceVar(HashMap<String, Variable> equiv);

    /**
     * Compute upper bound for the reaction time.
     * 
     * @return estimated wcrt for the expression.
     */
    public abstract int wcrt();

    /**
     * Replace each occurrence of a variable by an expression.
     * 
     * @param var
     *            name of the expression to replace
     * @param expr
     *            expression by which the variable is replaced.
     * @return new expression
     */
    public abstract Expression replace(String var, Expression expr);

    /**
     * Set the unique name of the expression.
     * 
     * @param n
     *            the name to set
     */
    protected void setName(final String n) {
        this.name = n;
    }
    
    /**
     * Generate new variable. Implements singleton pattern.
     * 
     * @param name
     *            name of the variable
     * @return variable with same name if it exists, new temp variable otherwise
     */
    public Variable getVar(final String name) {
        return prog.getVar(name);
    }
    
    /**
     * Generate new, unique variable.
     * 
     * @param n
     *            name of the variable
     * @param k
     *            io kind of the variable
     * @param t
     *            type of the variable
     * @return variable with same name if it exists, new temp variable otherwise
     */
    public Variable getVar(final String n, final Kind k, final Type t) {
        return prog.getVar(n, k, t);
    }
}
