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
// * @author ctr Copy register value to another register
// */
//public class Mov extends Instruction {
//
//    /**
//     * @author ctr possible types of register to register move
//     */
//    public enum Type {
//        /**
//         * clock to values.
//         */
//        CV,
//        /**
//         * value to clock.
//         */
//        VC,
//        /**
//         * clock to clock.
//         */
//        CC,
//        /**
//         * value to value.
//         */
//        VV;
//    }
//
//    private Type t;
//    private Register to;
//    private Read from;
//
//    /**
//     * @param type
//     *            type of this register to register move
//     * @param target
//     *            target register
//     * @param source
//     *            source register
//     */
//    public Mov(final Type type, final String target, final Read source) {
//        this.t = type;
//        this.to = Register.get(target);
//        this.from = source; // new Read(Register.get(v.toString()), pre);
//    }
//
//    @Override
//    public String toString() {
//        String res = "  ";
//        switch (t) {
//        case CV:
//            res += "CV";
//            break;
//        case CC:
//            res += "CC";
//            break;
//        case VC:
//            res += "VC";
//            break;
//        default:
//            res += "VV";
//            break;
//        }
//
//        res += "MOV\t" + to.toString() + "\t" + from.toString();
//        return res;
//    }
//
//    @Override
//    public int[] getObj() {
//        Opcode op = null;
//        switch (t) {
//        case CV:
//            op = Opcode.INT;
//            break;
//        case CC:
//            op = Opcode.CCMOV;
//            break;
//        case VC:
//            op = Opcode.BOOL;
//            break;
//        default:
//            op = Opcode.VVMOV;
//            break;
//        }
//        return new int[] { op.getCode(), 2 * to.getId(), from.getId(), 0 };
//    }
//
//    @Override
//    public void asmLabel(final HashMap<String, Integer> label2addr)
//            throws ParseException {
//        // TODO nothing to do
//    }
//
//}
