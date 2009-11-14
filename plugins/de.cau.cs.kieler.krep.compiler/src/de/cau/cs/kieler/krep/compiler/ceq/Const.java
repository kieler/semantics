package de.cau.cs.kieler.krep.compiler.ceq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.krep.compiler.klp.instructions.*;
import de.cau.cs.kieler.krep.compiler.prog.Type;

/**
 * @author ctr Constant, can either be an integer number or a boolean
 */
public class Const extends Expression {
    private int val;
    private Type type;

    /**
     * new integer constant
     * 
     * @param name
     *            name of the constant
     * @param val
     *            integer value
     */
    public Const(String name, int val) {
        super(name);
        this.val = val;
        type = Type.INT;
    }

    /**
     * new boolean constant
     * 
     * @param name
     *            name of the constant
     * @param val
     *            boolean value
     */
    public Const(String name, boolean val) {
        super(name);
        this.val = val ? 1 : 0;
        type = Type.BOOL;
    }

    @Override
    public List<String> getVars() {
        return new ArrayList<String>();
    }

    @Override
    public List<Variable> getDeps() {
        return new ArrayList<Variable>();
    }

    @Override
    public Expression flatten(String name, HashMap<String, Variable> vars, LinkedList<Expression> es) {
        return this;
    }

    @Override
    public boolean isAtom() {
        return true;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public LinkedList<Instruction> toKlp(Variable r) {
        LinkedList<Instruction> instr = new LinkedList<Instruction>();
        instr.add(new IMov(r, val));
        return instr;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }

    /**
     * @return value of the constant
     */
    public int getVal() {
        return val;
    }

    @Override
    public Expression padDelay(HashMap<String, Integer> delay, int n) {
        return this;
    }

    @Override
    public Const propagateConst(HashMap<String, Const> con) {
        return this;
    }

    @Override
    public Expression staticEval() {
        return this;
    }

    @Override
    public void replaceVar(HashMap<String, Variable> equiv) {
        // nothing to do

    }

    @Override
    public int wcrt() {
        return 1;
    }

    @Override
    public Expression replace(String var, Expression expr) {
        return this;
    }
}
