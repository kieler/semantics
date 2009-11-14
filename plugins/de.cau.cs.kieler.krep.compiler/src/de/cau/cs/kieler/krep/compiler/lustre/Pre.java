package de.cau.cs.kieler.krep.compiler.lustre;

import java.util.HashMap;
import java.util.LinkedList;

import de.cau.cs.kieler.krep.compiler.exceptions.ClockException;
import de.cau.cs.kieler.krep.compiler.exceptions.TypeException;
import de.cau.cs.kieler.krep.compiler.helper.Debug;

/**
 * @author ctr Lustre previous expression
 */
public class Pre extends Expression {
    Expression e;

    /**
     * @param name
     *            unique name of the expression
     * @param e
     *            expression which previous value is computed
     */
    public Pre(String name, Expression e) {
        super(name);
        this.e = e;
    }

    @Override
    public String toString() {
        return "(pre " + e.toString() + ")";
    }

    @Override
    public Expression propagatePre(HashMap<String, Expression> eqs) {
        Variable t = Variable.getTemp("pre_", e.type, null);
        eqs.put(t.getName(), e);
        return new Pre(t.getName(), new VarAccess(t));
    }

    @Override
    public boolean isAtom() {
        return false;
    }

    // @Override
    // public ceq.Expression toCEQ() {
    // if (e instanceof VarAccess) {
    // VarAccess v = (VarAccess) e;
    // return new ceq.VarAccess(ceq.Variable.get(v.toString()), true);
    // } else {
    // System.err.println("found non-trivial pre in ceq");
    // System.exit(1);
    // return null;
    // }
    //
    // }

    @Override
    protected void inferType() throws TypeException {
        e.inferType();
        type = e.type;
    }

    @Override
    public ClockList inferClock(HashMap<String, Variable> env) throws ClockException {
        clock = e.inferClock(env);
        return clock;
    }

    @Override
    public void propagateClock(ClockList l) {
        clock = l.clone();
        e.propagateClock(l);
        Debug.low(clock.toString() + " " + this.toString());
    }

    @Override
    public de.cau.cs.kieler.krep.compiler.ceq.Equation declock(String basename, int stage,
            String C, LinkedList<de.cau.cs.kieler.krep.compiler.ceq.Equation> aux) {
        if (e instanceof VarAccess) {
            VarAccess v = (VarAccess) e;

            return new de.cau.cs.kieler.krep.compiler.ceq.Equation(name,
                    new de.cau.cs.kieler.krep.compiler.ceq.VarAccess(
                            de.cau.cs.kieler.krep.compiler.ceq.Variable.get(v.getName()), true));
        } else {
            System.err.println("internal error: found nested pre");
            return null;
        }
    }

    @Override
    public Expression liftClock() {
        e = e.liftClock();
        if (e instanceof When) {
            When w = (When) e;
            e = w.getExpression();
            w.setExpression(this);
            return w;
        } else {
            return this;
        }

    }

    @Override
    public Expression extractPre(HashMap<String, Expression> eqs) {
        if (e instanceof VarAccess) {
            return this;
        } else {
            Variable v = Variable.getTemp("pre_", e.getType(), e.getClock());
            eqs.put(v.getName(), e.extractPre(eqs));
            e = new VarAccess(v);
            return this;
        }
    }
}
