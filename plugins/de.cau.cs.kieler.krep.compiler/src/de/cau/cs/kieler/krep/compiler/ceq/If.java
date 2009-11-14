package de.cau.cs.kieler.krep.compiler.ceq;

//import helper.TempName;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.krep.compiler.helper.TempName;
import de.cau.cs.kieler.krep.compiler.klp.instructions.*;
import de.cau.cs.kieler.krep.compiler.klp.instructions.CJmp.Cond;
import de.cau.cs.kieler.krep.compiler.prog.Type;

/**
 * @author ctr if expression: if e1 then e2 else e3
 */
public class If extends Expression {
    private Expression e1, e2, e3;

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
    public If(String name, Expression e1, Expression e2, Expression e3) {
        super(name);
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }

    @Override
    public List<String> getVars() {
        List<String> res = e1.getVars();
        res.addAll(e2.getVars());
        res.addAll(e3.getVars());
        return res;
    }

    @Override
    public List<Variable> getDeps() {
        List<Variable> res = e1.getDeps();
        res.addAll(e2.getDeps());
        res.addAll(e3.getDeps());
        return res;
    }

    @Override
    public String toString() {
        return "(if " + e1.toString() + " then " + e2.toString() + " else " + e3.toString() + ")";
    }

    @Override
    public Expression flatten(String name, HashMap<String, Variable> vars, LinkedList<Expression> es) {
        e1 = e1.flatten(name, vars, es);
        e2 = e2.flatten(name, vars, es);
        e3 = e3.flatten(name, vars, es);
        return this;
    }

    @Override
    public boolean isAtom() {
        return false;
    }

    @Override
    public LinkedList<Instruction> toKlp(Variable r) {
        LinkedList<Instruction> instr = new LinkedList<Instruction>();

        Label l_else = Label.get(TempName.get("L"));
        Label l_end = Label.get(TempName.get("L"));
        Read test;
        if (e1 instanceof VarAccess) {
            test = new Read((VarAccess) e1);
        } else {
            Variable v = Variable.getTemp(name, Type.BOOL);
            instr.addAll(e1.toKlp(v));
            test = new Read(v, false);
            Variable.destroyTemp(name);
        }
        instr.add(new CJmp(Cond.F, test, l_else));
        instr.addAll(e2.toKlp(r));
        instr.add(new Jmp(l_end));
        instr.add(l_else);
        instr.addAll(e3.toKlp(r));
        instr.add(l_end);
        return instr;
    }

    @Override
    public Type getType() {
        return e2.getType();
    }

    @Override
    public Expression padDelay(HashMap<String, Integer> delay, int n) {

        e1 = e1.padDelay(delay, n);
        e2 = e2.padDelay(delay, n);
        e3 = e3.padDelay(delay, n);
        return this;
    }

    @Override
    public Const propagateConst(HashMap<String, Const> con) {
        Const c1 = e1.propagateConst(con);
        Const c2 = e2.propagateConst(con);
        Const c3 = e3.propagateConst(con);

        if (c2 != null) {
            e2 = c2;
        }
        if (c3 != null) {
            e3 = c3;
        }

        if (c1 != null) {
            e1 = c1;
            return c1.getVal() != 0 ? c2 : c3;
        } else {
            return null;
        }
    }

    @Override
    public Expression staticEval() {
        e1 = e1.staticEval();
        e2 = e2.staticEval();
        e3 = e3.staticEval();
        if (e1 instanceof Const) {
            Const c = (Const) e1;
            if (c.getVal() != 0) {
                return e2;
            } else {
                return e3;
            }
        } else {
            return this;
        }
    }

    @Override
    public void replaceVar(HashMap<String, Variable> equiv) {
        e1.replaceVar(equiv);
        e2.replaceVar(equiv);
        e3.replaceVar(equiv);
    }

    @Override
    public int wcrt() {
        return e1.wcrt() + 1 + Math.max(e2.wcrt() + 1, e3.wcrt());
    }

    @Override
    public Expression replace(String var, Expression expr) {
        e1 = e1.replace(var, expr);
        e2 = e2.replace(var, expr);
        e3 = e3.replace(var, expr);
        return this;
    }

}
