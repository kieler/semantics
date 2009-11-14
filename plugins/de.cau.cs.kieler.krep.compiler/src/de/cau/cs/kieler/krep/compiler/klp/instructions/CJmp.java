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

/**
 * @author ctr Conditional Jump
 */
public class CJmp extends Instruction {

    private Read reg;

    private Cond cond;

    private Label label;

    /**
     * @author ctr Condition on which a jump can be based
     */
    public enum Cond {
        /**
         * jump when true
         */
        T,
        /**
         * jump when false
         */
        F,
        /**
         * jump when zero
         */
        Z,
        /**
         * jump when not zero
         */
        NZ;
    }

    /**
     * @param cond
     *            condition
     * @param reg
     *            register to check
     * @param l
     *            label of the target
     */
    public CJmp(Cond cond, Read reg, Label l) {
        super();
        this.cond = cond;
        this.reg = reg;
        label = l;
    }

    @Override
    public String toString() {
        String res = "  ";
        switch (cond) {
        case T:
            res += "JT";
            break;
        case F:
            res += "JF";
            break;
        case Z:
            res += "JZ";
            break;
        case NZ:
            res += "JNZ";
            break;
        }
        res += "\t" + reg.toString() + "\t" + label.getName();
        return res;
    }

}
