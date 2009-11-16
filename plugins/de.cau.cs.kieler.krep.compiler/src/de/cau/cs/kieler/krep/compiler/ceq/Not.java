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

import de.cau.cs.kieler.krep.compiler.klp.instructions.IBinOp;
import de.cau.cs.kieler.krep.compiler.klp.instructions.Instruction;
import de.cau.cs.kieler.krep.compiler.klp.instructions.Read;
import de.cau.cs.kieler.krep.compiler.lustre.Operator;
import de.cau.cs.kieler.krep.compiler.prog.Type;

/**
 * @author ctr boolean not
 */
public class Not extends Expression {
    private Expression expr;

    /**
     * @param name
     *            name of the expression
     * @param e
     *            sub-expression that is negated
     */
    public Not(final String name, final Expression e) {
        super(name);
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
            Variable t = Variable.getTemp(name, expr.getType());
            es.add(expr);
            return new Not(t.getName(), new VarAccess(t, false));
        }
    }

    @Override
    public boolean isAtom() {
        return false;
    }

    @Override
    public LinkedList<Instruction> toKlp(final Variable r) {
        LinkedList<Instruction> instr = new LinkedList<Instruction>();
        if (!(expr instanceof VarAccess)) {
            // Variable v = Variable.getTemp(name, e.getType());
            // VarAccess va = new VarAccess(v, false);
            instr.addAll(expr.toKlp(r));
            instr.add(new IBinOp(r, new Read(new VarAccess(r, false)), 1, Operator.XOR));
            // System.err.println("Non trivial not:" + e.toString());
        } else {
            VarAccess v = (VarAccess) expr;
            instr.add(new IBinOp(r, new Read(v), 1, Operator.XOR));
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
    public Const propagateConst(final HashMap<String, Const> con) {
        Const c = expr.propagateConst(con);
        if (c == null) {
            return null;
        } else {
            return new Const(c.name, c.getVal() == 0 ? 1 : 0);
        }
    }

    @Override
    public Expression staticEval() {
        expr = expr.staticEval();
        if (expr instanceof Const) {
            Const c = (Const) expr;
            return new Const(c.name, c.getVal() == 0 ? 1 : 0);
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
        if (expr instanceof VarAccess) {
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
