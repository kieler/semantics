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
// * @author ctr Conditional Jump
// */
//public class CJmp extends Instruction {
//
//    /**
//     * @author ctr Condition on which a jump can be based
//     */
//    public enum Cond {
//        /**
//         * jump when true.
//         */
//        T,
//        /**
//         * jump when false.
//         */
//        F,
//        /**
//         * jump when zero.
//         */
//        Z,
//        /**
//         * jump when not zero.
//         */
//        NZ;
//    }
//
//    private Read reg;
//
//    private Cond cond;
//
//    private String label;
//    private int pos;
//
//    private static final int BYTE_MASK = 0xFF;
//    private static final int BYTE_LEN = 8;
//
//    /**
//     * @param c
//     *            condition
//     * @param r
//     *            register to check
//     * @param l
//     *            label of the target
//     */
//    public CJmp(final Cond c, final Read r, final String l) {
//        super();
//        this.cond = c;
//        this.reg = r;
//        label = l;
//    }
//
//    @Override
//    public String toString() {
//
//        return "J\t" + reg.toString() + "\t" + label.toString();
//    }
//
//    @Override
//    public int[] getObj() {
//        return new int[] { getOp(), pos >> BYTE_LEN, pos & BYTE_MASK, reg.getId() };
//    }
//
//    private int getOp() {
//        int res = 0;
//        switch (cond) {
//        case T:
//            res = Opcode.JT.getCode();
//            break;
//        case F:
//            res = Opcode.JF.getCode();
//            break;
//        case Z:
//            res = Opcode.JZ.getCode();
//            break;
//        case NZ:
//            res = Opcode.JNZ.getCode();
//            break;
//        default:
//            break;
//        }
//        return res;
//    }
//
//    @Override
//    public void asmLabel(final HashMap<String, Integer> label2addr) throws ParseException {
//        Integer p = label2addr.get(label);
//        if (p == null) {
//            throw new ParseException("unknown label " + label);
//        }
//        pos = p;
//    }
//
//}
