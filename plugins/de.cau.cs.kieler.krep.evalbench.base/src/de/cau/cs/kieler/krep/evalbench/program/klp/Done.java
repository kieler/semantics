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

import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.program.Instruction;

/**
 * @author ctr Done instruction to indicate the end of the tick
 */
public class Done extends Instruction {

    private String label;

    private int pos;

    /**
     * @param label
     *            label from where to start in the next tick
     */
    public Done(final String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        String res = "DONE";
        if (label != null) {
            res += "\t" + label;
        }
        return res;
    }

    @Override
    public int[] getObj() {
        return new int[] { Opcode.DONE.getCode(), label == null ? 0 : pos, 0, 0 };
    }

    @Override
    public void asmLabel(HashMap<String, Integer> label2addr)
            throws ParseException {
        if (label != null) {
            Integer p = label2addr.get(label);
            if (p == null) {
                throw new ParseException("unknown label " + label);
            }
            pos = p;
        }
    }
}
