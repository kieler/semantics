///*
// * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
// *
// * http://www.informatik.uni-kiel.de/rtsys/kieler/
// * 
// * Copyright 2009 by
// * + Christian-Albrechts-University of Kiel
// *   + Department of Computer Science
// *     + Real-Time and Embedded Systems Group
// * 
// * This code is provided under the terms of the Eclipse Public License (EPL).
// * See the file epl-v10.html for the license text.
// */
//package de.cau.cs.kieler.krep.evalbench.program.klp;
//
//import java.util.HashMap;
//
//import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
//import de.cau.cs.kieler.krep.evalbench.program.Instruction;
//
///**
// * @author ctr Immediate binary operation
// */
//public class IBinOp extends Instruction {
//    private Register to;
//
//    private Read r1;
//
//    private int val;
//
//    private OP op;
//
//    /**
//     * @param tTo
//     *            variable that stores the result
//     * @param reg
//     *            register that holds first parameter
//     * @param c
//     *            constant value as second parameter
//     * @param tOp
//     *            operation
//     */
//    public IBinOp(final String tTo, final Read reg, final int c, final OP tOp) {
//        super();
//        this.to = Register.get(tTo);
//        this.r1 = reg;
//        this.val = c;
//        this.op = tOp;
//    }
//
//    @Override
//    public String toString() {
//        return "I" + op.toString() + "\t" + to.toString() + "\t"
//                + r1.toString() + "\t" + val;
//    }
//
//    @Override
//    public int[] getObj() {
//        return new int[] { toObj(), 2 * to.getId(), r1.getId(), val };
//    }
//
//    private int toObj() {
//        int res = 0;
//        switch (op) {
//        case AND:
//            res = Opcode.IAND.getCode();
//            break;
//        case OR:
//            res = Opcode.IOR.getCode();
//            break;
//        case XOR:
//            res = Opcode.IXOR.getCode();
//            break;
//        case LT:
//            res = Opcode.ILT.getCode();
//            break;
//        case LE:
//            res = Opcode.ILE.getCode();
//            break;
//        case EQ:
//            res = Opcode.IEQ.getCode();
//            break;
//        case GE:
//            res = Opcode.IGE.getCode();
//            break;
//        case GT:
//            res = Opcode.IGT.getCode();
//            break;
//        case NEQ:
//            res = Opcode.INEQ.getCode();
//            break;
//        case ADD:
//            res = Opcode.IADD.getCode();
//            break;
//        case SUB:
//            res = Opcode.ISUB.getCode();
//            break;
//        case MUL:
//            res = Opcode.IMUL.getCode();
//            break;
//        default:
//            res = Opcode.IDIV.getCode();
//            break;
//        }
//        return res;
//    }
//
//    @Override
//    public void asmLabel(final HashMap<String, Integer> label2addr)
//            throws ParseException {
//        // nothing to do
//
//    }
//}
