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
package de.cau.cs.kieler.krep.compiler.klp;

import de.cau.cs.kieler.krep.compiler.ceq.Variable;
import de.cau.cs.kieler.krep.compiler.lustre.Operator;

/**
 * Immediate binary operation.
 * 
 * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp, tam
 * 
 * @author ctr
 */
public class IBinOpInstruction extends AbstractInstruction {
    private Variable to;

    private RegAccess r1;

    private int val;

    private Operator op;

    /**
     * @param toVar
     *            variable that stores the result
     * @param read
     *            register that holds first parameter
     * @param c
     *            constant value as second parameter
     * @param operator
     *            operation
     */
    public IBinOpInstruction(final Variable toVar, final RegAccess read, final int c, final Operator operator) {
        super();
        this.to = toVar;
        this.r1 = read;
        this.val = c;
        this.op = operator;
    }

    @Override
    public String toString() {
        return "  I" + op.toKlp() + "\t" + to.getName() + "\t" + r1.toString() + "\t" + val;
    }

    // @Override
    // public String getObj() {
    // return writeObj(toObj(), 2*to.getId(), r1.getId(), val);
    // }
    //
    //
    // private int toObj() {
    // int res = 0;
    // switch (op) {
    // case AND:
    // res = Opcode.IAND.getCode();
    // break;
    // case OR:
    // res = Opcode.IOR.getCode();
    // break;
    // case XOR:
    // res = Opcode.IXOR.getCode();
    // break;
    // /*
    // * case LT: res = Opcode.ILT.getCode(); break; case LE: res =
    // * Opcode.ILE.getCode(); break; case EQ: res = Opcode.IEQ.getCode();
    // * break; case GE: res = Opcode.IGE.getCode(); break; case GT: res =
    // * Opcode.IGT.getCode(); break; case NEQ: res = Opcode.INEQ.getCode();
    // * break;
    // */
    // case ADD:
    // res = Opcode.IADD.getCode();
    // break;
    // case SUB:
    // res = Opcode.ISUB.getCode();
    // break;
    // case MUL:
    // res = Opcode.IMUL.getCode();
    // break;
    // case DIV:
    // res = Opcode.IDIV.getCode();
    // break;
    // }
    // return res;
    // }
}
