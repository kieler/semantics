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
package de.cau.cs.kieler.krep.evalbench.program.klp;

import java.util.HashMap;

import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.program.Instruction;

/**
 * @author ctr immediate move
 */
public class IMov extends Instruction {
    /**
     * @author ctr types of immediate moves
     */
    public enum Type {
        /**
         * immediate to clock.
         */
        IC,
        /**
         * immediate to value.
         */
        IV;
    }

    private Type t;
    private Register to;
    // private Type type;
    private int val;

    /**
     * move integer value to register.
     * 
     * @param t
     *            type of movement
     * @param to
     *            register that stores the value
     * @param val
     *            constant value to move
     */
    public IMov(final Type t, final String to, final int val) {
        this.t = t;
        this.to = Register.get(to);
        this.val = val; // new Read(Register.get(v.toString()), pre);
    }

    @Override
    public String toString() {
        String res = "I";
        switch (t) {
        case IC:
            res += "C";
            break;
        default:
            res += "V";
            break;
        }
        res += "MOV\t" + to.toString() + "\t" + String.valueOf(val);

        return res;
    }

    @Override
    public int[] getObj() {
        Opcode op = null;
        switch (t) {
        case IC:
            op = Opcode.ICMOV;
            break;
        default:
            op = Opcode.IVMOV;
            break;
        }
        return new int[] { op.getCode(), 2 * to.getId(), val, 0 };
    }

    @Override
    public void asmLabel(final HashMap<String, Integer> label2addr)
            throws ParseException {
        // nothing to do
    }

}
