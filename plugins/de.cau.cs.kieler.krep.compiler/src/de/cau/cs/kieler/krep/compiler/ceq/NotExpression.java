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

import de.cau.cs.kieler.krep.compiler.klp.IBinOpInstruction;
import de.cau.cs.kieler.krep.compiler.klp.AbstractInstruction;
import de.cau.cs.kieler.krep.compiler.klp.RegAccess;
import de.cau.cs.kieler.krep.compiler.lustre.Operator;
import de.cau.cs.kieler.krep.compiler.util.Type;

/**
 * A boolean not.
 * 
 * @kieler.rating 2010-02-05 yellow review by cmot, msp, tam
 * 
 * @author ctr
 */
public class NotExpression extends Expression {
    private Expression expr;

    /**
     * @param name
     *            name of the expression
     * @param e
     *            sub-expression that is negated
     * @param p
     *            program that contains the expression
     */
    public NotExpression(final String name, final Expression e, final Program p) {
        super(name, p);
        this.expr = e;
    }

    @Override
    public List<String> getVars() {
        return expr.getVars();
    }

    @Override
    public List<Variable> getDeps() {
        return expr.getDeps();
    }

    @Override
    public String toString() {
        return "(not " + expr.toString() + ")";
    }

    @Override
    public Expression flatten(final String name, final HashMap<String, Variable> vars,
            final LinkedList<Expression> es) {
        if (expr.isAtom()) {
            return this;
        } else {
            expr = expr.flatten(name, vars, es);
            Variable t = getProg().getTemp(name, expr.getType());
            es.add(expr);
            return new NotExpression(t.getName(), new VarAccessExpression(t, false, getProg()), getProg());
        }
    }

    @Override
    public boolean isAtom() {
        return false;
    }

    @Override
    public LinkedList<AbstractInstruction> toKlp(final Variable r) {
        LinkedList<AbstractInstruction> instr = new LinkedList<AbstractInstruction>();
        if (!(expr instanceof VarAccessExpression)) {
            // Variable v = Variable.getTemp(name, e.getType());
            // VarAccess va = new VarAccess(v, false);
            instr.addAll(expr.toKlp(r));
            instr.add(new IBinOpInstruction(r, new RegAccess(new VarAccessExpression(r, false, getProg())), 1,
                    Operator.XOR));
            // System.err.println("Non trivial not:" + e.toString());
        } else {
            VarAccessExpression v = (VarAccessExpression) expr;
            instr.add(new IBinOpInstruction(r, new RegAccess(v), 1, Operator.XOR));
        }
        return instr;
    }

    @Override
    public Type getType() {
        return Type.BOOL;
    }

    @Override
    public Expression padDelay(final HashMap<String, Integer> delay, final int n) {
        expr = expr.padDelay(delay, n);
        return this;
    }

    @Override
    public ConstExpression propagateConst(final HashMap<String, ConstExpression> con) {
        ConstExpression c = expr.propagateConst(con);
        if (c == null) {
            return null;
        } else {
            return new ConstExpression(c.getName(), c.getVal() == 0 ? 1 : 0, getProg());
        }
    }

    @Override
    public Expression staticEval() {
        expr = expr.staticEval();
        if (expr instanceof ConstExpression) {
            ConstExpression c = (ConstExpression) expr;
            return new ConstExpression(c.getName(), c.getVal() == 0 ? 1 : 0, getProg());
        } else {
            return this;
        }

    }

    @Override
    public void replaceVar(final HashMap<String, Variable> equiv) {
        expr.replaceVar(equiv);
    }

    @Override
    public int wcrt() {
        if (expr instanceof VarAccessExpression) {
            return 1;
        } else {
            return 1 + expr.wcrt();
        }
    }

    @Override
    public Expression replace(final String var, final Expression e) {
        expr = expr.replace(var, e);
        return this;
    }

}
