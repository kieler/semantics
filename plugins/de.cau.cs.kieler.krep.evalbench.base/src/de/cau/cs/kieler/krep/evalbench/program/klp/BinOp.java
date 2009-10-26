/******************************************************************************
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
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.program.klp;

import java.util.HashMap;

import de.cau.cs.kieler.krep.evalbench.program.Instruction;

/**
 * @author ctr Binary operation
 */
public class BinOp extends Instruction {
    private Register to;
    private Read r1, r2;
    private OP op;

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
    public BinOp(String to, Read r1, Read r2, OP op) {
        super();
        this.to = Register.get(to);
        this.r1 = r1;
        this.r2 = r2;
        this.op = op;
    }

    @Override
    public String toString() {
        return op.toString() + "\t" + to + "\t" + r1.toString() + "\t"
                + r2.toString();
    }

    @Override
    public int[] getObj() {
        int[] res = { toObj(), 2 * to.getId(), r1.getId(), r2.getId() };
        return res;
    }

    private int toObj() {
        int res = 0;
        switch (op) {
        case AND:
            res = Opcode.AND.getCode();
            break;
        case OR:
            res = Opcode.OR.getCode();
            break;
        case XOR:
            res = Opcode.XOR.getCode();
            break;
        case LT:
            res = Opcode.LT.getCode();
            break;
        case LE:
            res = Opcode.LE.getCode();
            break;
        case EQ:
            res = Opcode.EQ.getCode();
            break;
        case GE:
            res = Opcode.GE.getCode();
            break;
        case GT:
            res = Opcode.GT.getCode();
            break;
        case NEQ:
            res = Opcode.NEQ.getCode();
            break;
        case ADD:
            res = Opcode.ADD.getCode();
            break;
        case SUB:
            res = Opcode.SUB.getCode();
            break;
        case MUL:
            res = Opcode.MUL.getCode();
            break;
        case DIV:
            res = Opcode.DIV.getCode();
            break;
        default:
            // nothing to do
            break;
        }
        return res;
    }

    @Override
    public void asmLabel(HashMap<String, Integer> label2addr) {
        // nothing to do;
    }
}
