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
 * @author ctr uncondintional jump
 */
public class Jmp extends Instruction {

    private String label;
    private int pos;

    /**
     * @param label
     *            to jump to
     */
    public Jmp(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "  " + "JMP\t" + label;
    }

    @Override
    public int[] getObj() {
        return new int[] { Opcode.JMP.getCode(), pos >> 8, pos & 0xFF, 0 };
    }

    @Override
    public void asmLabel(HashMap<String, Integer> label2addr)
            throws ParseException {
        Integer p = label2addr.get(label);
        if (p == null) {
            throw new ParseException("unknown label " + label);
        }
        pos = p;
    }

}
