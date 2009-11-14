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
 * @author ctr Abstract superclass for all ceq Expressions Not that every sub-expression should have
 *         a unique name
 */
abstract public class Expression {
    protected String name;

    protected Expression(String name) {
        this.name = name;
    }

    /**
     * 
     * @return type of the current expression
     */
    abstract public Type getType();

    /**
     * compute list of all variables that syntactically occur in the expression
     * 
     * @return list of used variables
     */
    abstract public List<String> getVars();

    /**
     * compute List of all variables, on which current value the expression depends. This is the
     * same as getVars without the variables which pre value is used.
     * 
     * @return list of variables this expression depends on
     */
    abstract public List<Variable> getDeps();

    @Override
    abstract public String toString();

    /**
     * extract sub-expressions from operations
     * 
     * @param name
     *            name of the expression
     * @param vars
     *            holds additionally added variables
     * @param vs
     *            auxiliary variables
     * @param es
     *            additionally added expression
     * @return expression without complex operations
     */
    abstract public Expression flatten(String name, HashMap<String, Variable> vars,
            LinkedList<Expression> es);

    /**
     * add additional pre operators, to use all variables with the right tick
     * 
     * @param delay
     *            : delay for all variables
     * @param n
     *            : delay of the output
     * @return additional equation to store previous values
     */
    abstract public Expression padDelay(HashMap<String, Integer> delay, int n);

    /**
     * compute whether this is an atomic expression
     * 
     * @return true if expression contains no sub-expression
     */
    abstract public boolean isAtom();

    /**
     * compute instructions to execute this expression on the KLP
     * 
     * @param to
     *            Register to store the result
     * @return list of KLP instructions that compute this expression
     */
    abstract public LinkedList<Instruction> toKlp(Variable to);

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
    abstract public Const propagateConst(HashMap<String, Const> con);

    abstract public Expression staticEval();

    abstract public void replaceVar(HashMap<String, Variable> equiv);

    abstract public int wcrt();

    abstract public Expression replace(String var, Expression expr);
}
