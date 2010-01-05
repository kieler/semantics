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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.krep.compiler.klp.instructions.IMov;
import de.cau.cs.kieler.krep.compiler.klp.instructions.Instruction;
import de.cau.cs.kieler.krep.compiler.prog.Type;

/**
 * Constant, can either be an integer number or a boolean.
 * 
 * @kieler.rating 2010-01-05 proposed yellow ctr
 * 
 * @author ctr
 */
public class Const extends Expression {
    private int val;
    private Type type;

    /**
     * new integer constant.
     * 
     * @param name
     *            name of the constant
     * @param value
     *            integer value
     */
    public Const(final String name, final int value) {
        super(name);
        this.val = value;
        type = Type.INT;
    }

    /**
     * new boolean constant.
     * 
     * @param name
     *            name of the constant
     * @param value
     *            boolean value
     */
    public Const(final String name, final boolean value) {
        super(name);
        this.val = value ? 1 : 0;
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
    public Expression flatten(final String name, final HashMap<String, Variable> vars,
            final LinkedList<Expression> es) {
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
    public LinkedList<Instruction> toKlp(final Variable r) {
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
    public Expression padDelay(final HashMap<String, Integer> delay, final int n) {
        return this;
    }

    @Override
    public Const propagateConst(final HashMap<String, Const> con) {
        return this;
    }

    @Override
    public Expression staticEval() {
        return this;
    }

    @Override
    public void replaceVar(final HashMap<String, Variable> equiv) {
        // nothing to do

    }

    @Override
    public int wcrt() {
        return 1;
    }

    @Override
    public Expression replace(final String var, final Expression expr) {
        return this;
    }
}
