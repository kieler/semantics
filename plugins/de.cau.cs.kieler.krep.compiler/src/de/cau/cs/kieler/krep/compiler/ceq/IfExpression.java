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

//import helper.TempName;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.krep.compiler.klp.CJmpInstruction;
import de.cau.cs.kieler.krep.compiler.klp.AbstractInstruction;
import de.cau.cs.kieler.krep.compiler.klp.JmpInstruction;
import de.cau.cs.kieler.krep.compiler.klp.LabelInstruction;
import de.cau.cs.kieler.krep.compiler.klp.RegAccess;
import de.cau.cs.kieler.krep.compiler.klp.CJmpInstruction.Cond;
import de.cau.cs.kieler.krep.compiler.util.TempName;
import de.cau.cs.kieler.krep.compiler.util.Type;

/**
 * Conditional: if e1 then e2 else e3.
 * 
 * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp, tam
 *   
* 
 * @author ctr
 */
public class IfExpression extends Expression {
    private Expression expr1, expr2, expr3;

    /**
     * @param name
     *            name of the expression
     * @param e1
     *            boolean test
     * @param e2
     *            expression for then case
     * @param e3
     *            expression for else case
     */
    public IfExpression(final String name, final Expression e1, final Expression e2, final Expression e3) {
        super(name);
        this.expr1 = e1;
        this.expr2 = e2;
        this.expr3 = e3;
    }

    @Override
    public List<String> getVars() {
        List<String> res = expr1.getVars();
        res.addAll(expr2.getVars());
        res.addAll(expr3.getVars());
        return res;
    }

    @Override
    public List<Variable> getDeps() {
        List<Variable> res = expr1.getDeps();
        res.addAll(expr2.getDeps());
        res.addAll(expr3.getDeps());
        return res;
    }

    @Override
    public String toString() {
        return "(if " + expr1.toString() + " then " + expr2.toString() + " else "
                + expr3.toString() + ")";
    }

    @Override
    public Expression flatten(final String name, final HashMap<String, Variable> vars,
            final LinkedList<Expression> es) {
        expr1 = expr1.flatten(name, vars, es);
        expr2 = expr2.flatten(name, vars, es);
        expr3 = expr3.flatten(name, vars, es);
        return this;
    }

    @Override
    public boolean isAtom() {
        return false;
    }

    @Override
    public LinkedList<AbstractInstruction> toKlp(final Variable r) {
        LinkedList<AbstractInstruction> instr = new LinkedList<AbstractInstruction>();

        LabelInstruction lElse = LabelInstruction.get(TempName.get("L"));
        LabelInstruction lEnd = LabelInstruction.get(TempName.get("L"));
        RegAccess test;
        if (expr1 instanceof VarAccessExpression) {
            test = new RegAccess((VarAccessExpression) expr1);
        } else {
            Variable v = Variable.getTemp(getName(), Type.BOOL);
            instr.addAll(expr1.toKlp(v));
            test = new RegAccess(v, false);
            Variable.destroyTemp(getName());
        }
        instr.add(new CJmpInstruction(Cond.F, test, lElse));
        instr.addAll(expr2.toKlp(r));
        instr.add(new JmpInstruction(lEnd));
        instr.add(lElse);
        instr.addAll(expr3.toKlp(r));
        instr.add(lEnd);
        return instr;
    }

    @Override
    public Type getType() {
        return expr2.getType();
    }

    @Override
    public Expression padDelay(final HashMap<String, Integer> delay, final int n) {

        expr1 = expr1.padDelay(delay, n);
        expr2 = expr2.padDelay(delay, n);
        expr3 = expr3.padDelay(delay, n);
        return this;
    }

    @Override
    public ConstExpression propagateConst(final HashMap<String, ConstExpression> con) {
        ConstExpression c1 = expr1.propagateConst(con);
        ConstExpression c2 = expr2.propagateConst(con);
        ConstExpression c3 = expr3.propagateConst(con);

        if (c2 != null) {
            expr2 = c2;
        }
        if (c3 != null) {
            expr3 = c3;
        }

        if (c1 != null) {
            expr1 = c1;
            return c1.getVal() != 0 ? c2 : c3;
        } else {
            return null;
        }
    }

    @Override
    public Expression staticEval() {
        expr1 = expr1.staticEval();
        expr2 = expr2.staticEval();
        expr3 = expr3.staticEval();
        if (expr1 instanceof ConstExpression) {
            ConstExpression c = (ConstExpression) expr1;
            if (c.getVal() != 0) {
                return expr2;
            } else {
                return expr3;
            }
        } else {
            return this;
        }
    }

    @Override
    public void replaceVar(final HashMap<String, Variable> equiv) {
        expr1.replaceVar(equiv);
        expr2.replaceVar(equiv);
        expr3.replaceVar(equiv);
    }

    @Override
    public int wcrt() {
        return expr1.wcrt() + 1 + Math.max(expr2.wcrt() + 1, expr3.wcrt());
    }

    @Override
    public Expression replace(final String var, final Expression expr) {
        expr1 = expr1.replace(var, expr);
        expr2 = expr2.replace(var, expr);
        expr3 = expr3.replace(var, expr);
        return this;
    }

}
