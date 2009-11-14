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
package de.cau.cs.kieler.krep.compiler.klp.instructions;

import de.cau.cs.kieler.krep.compiler.ceq.Variable;
import de.cau.cs.kieler.krep.compiler.lustre.Operator;

/**
 * @author ctr Binary operation
 */
public class BinOp extends Instruction {
    private Variable to;
    private Read r1, r2;
    private Operator op;

    /**
     * @param to
     *            variable that stores the result
     * @param r1
     *            first parameter
     * @param r2
     *            second parameter
     * @param op
     *            operator
     */
    public BinOp(Variable to, Read r1, Read r2, Operator op) {
        super();
        this.to = to;
        this.r1 = r1;
        this.r2 = r2;
        this.op = op;
    }

    @Override
    public String toString() {
        return "  " + op.toKlp() + "\t" + to.getName() + "\t" + r1.toString() + "\t"
                + r2.toString();
    }

    // @Override
    // public String getObj() {
    // return writeObj(toObj(), 2*to.getId(), r1.getId(), r2.getId() );// toObj() + " " +
    // to.getObj() + " " + r1.getObj() + " " + r2.getObj();
    // }
    //    
    // private int toObj() {
    // int res = 0;
    // switch (op) {
    // case AND:
    // res = Opcode.AND.getCode();
    // break;
    // case OR:
    // res = Opcode.OR.getCode();
    // break;
    // case XOR:
    // res = Opcode.XOR.getCode();
    // break;
    // case LT:
    // res = Opcode.LT.getCode();
    // break;
    // case LE:
    // res = Opcode.LE.getCode();
    // break;
    // case EQ:
    // res = Opcode.EQ.getCode();
    // break;
    // case GE:
    // res = Opcode.GE.getCode();
    // break;
    // case GT:
    // res = Opcode.GT.getCode();
    // break;
    // case NEQ:
    // res = Opcode.NEQ.getCode();
    // break;
    // case ADD:
    // res = Opcode.ADD.getCode();
    // break;
    // case SUB:
    // res = Opcode.SUB.getCode();
    // break;
    // case MUL:
    // res = Opcode.MUL.getCode();
    // break;
    // case DIV:
    // res = Opcode.DIV.getCode();
    // break;
    // }
    // return res;
    // }
}
