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
import java.util.ArrayList;

import de.cau.cs.kieler.krep.compiler.klp.AbstractInstruction;
import de.cau.cs.kieler.krep.compiler.klp.MovInstruction;
import de.cau.cs.kieler.krep.compiler.klp.RegAccess;
import de.cau.cs.kieler.krep.compiler.util.Debug;
import de.cau.cs.kieler.krep.compiler.util.Type;


/**
 * A Variable access in ceq. This includes the information, if the current or previous value is
 * accessed
 * 
  * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp, tam
* 
 * @author ctr
 */
public class VarAccessExpression extends Expression {

    private Variable var;
    private int pre;

    /**
     * generate new Variable access.
     * 
     * @param v
     *            Variable that is read
     * @param previous
     *            access current or previous value
     */
    public VarAccessExpression(final Variable v, final boolean previous) {
        super(v.getName());
        this.var = v;
        this.pre = previous ? 1 : 0;
    }

    @Override
    public List<String> getVars() {
        List<String> res = new ArrayList<String>();
        res.add(getName());
        return res;
    }

    @Override
    public List<Variable> getDeps() {
        List<Variable> res = new ArrayList<Variable>();
        if (pre == 0) {
            res.add(Program.getVar(getName()));
        }
        return res;
    }

    @Override
    public String toString() {
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < pre; i++) {
            res.append("pre(");
        }
        res.append(getName());
        for (int i = 0; i < pre; i++) {
            res.append(")");
        }
        return res.toString();
    }

    @Override
    public Expression flatten(final String name, final HashMap<String, Variable> vars,
            final LinkedList<Expression> es) {
        return this;
    }

    @Override
    public boolean isAtom() {
        return true;
    }

    @Override
    public LinkedList<AbstractInstruction> toKlp(final Variable to) {
        LinkedList<AbstractInstruction> instr = new LinkedList<AbstractInstruction>();
        instr.add(new MovInstruction(to, new RegAccess(this)));
        return instr;
    }

    /**
     * @return true if the previous value is used
     */
    public boolean isPre() {
        return pre != 0;
    }

    @Override
    public Type getType() {
        return var.getType();
    }

    @Override
    public Expression padDelay(final HashMap<String, Integer> delay, final int n) {
        int d = delay.get(var.getName());

        if (d != n) {
            // on different core
            pre += n - d - 1; // reader - writer - communication
        }
        if (pre < 0) {
            Debug.high("try to access future value of " + getName());
        }
        return this;
    }

    @Override
    public ConstExpression propagateConst(final HashMap<String, ConstExpression> con) {
        return con.get(getName());
    }

    @Override
    public Expression staticEval() {
        return this;
    }

    @Override
    public void replaceVar(final HashMap<String, Variable> equiv) {
        Variable v = equiv.get(getName());
        if (v != null) {
            var = v;
            this.setName(v.getName());
        }

    }

    @Override
    public int wcrt() {
        return 1;
    }

    @Override
    public Expression replace(final String variable, final Expression expr) {
        if (variable.equals(getName())) {
            if (isPre()) {
                Debug.high("try to replace pre access to " + variable);
            }
            return expr;
        } else {
            return this;
        }
    }
}
