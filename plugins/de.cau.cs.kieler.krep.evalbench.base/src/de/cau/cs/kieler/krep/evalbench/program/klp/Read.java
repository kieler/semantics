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
///**
// * @author ctr Reading access to a register. Can read either previous or current
// *         value.
// */
//public class Read {
//    private Register reg;
//
//    private boolean pre;
//
//    /**
//     * @param v
//     *            variable to read from
//     * @param isPre
//     *            true if previous value should be read
//     */
//    public Read(final String v, final boolean isPre) {
//        super();
//        this.pre = isPre;
//        this.reg = Register.get(v);
//    }
//
//    @Override
//    public String toString() {
//        if (pre) {
//            return "pre(" + reg.toString() + ")";
//        } else {
//            return reg.toString();
//        }
//    }
//
//    /**
//     * @return KLP id under which the value is stored. The first bits are the
//     *         register id, followed by the pre flag.
//     * 
//     */
//    public int getId() {
//        return 2 * reg.getId() + (pre ? 1 : 0);
//    }
//
//}
