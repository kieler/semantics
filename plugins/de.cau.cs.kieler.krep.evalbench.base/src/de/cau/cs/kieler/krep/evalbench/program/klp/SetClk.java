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
 * @author ctr Assembler declaration to initialize a register
 */
public class SetClk extends Instruction {

    private final Register reg;

    private Register clock = null;

    /**
     * @param name
     *            unique name of the register
     * @param clock
     *            name of the clock register, null when on base clock
     */
    public SetClk(final String name, final String clock) {
        super();
        this.reg = Register.get(name);
        this.clock = Register.get(clock);

    }

    @Override
    public String toString() {
        String res = "SETClk" + "\t" + reg.toString() + "\t" + clock.toString();

        return res;
    }

    @Override
    protected int[] getObj() {
        Opcode op = Opcode.SETCLK;

        return new int[] { op.getCode(), reg.getId(), clock.getId(), 0 };
    }

    @Override
    public void asmLabel(HashMap<String, Integer> label2addr)
            throws ParseException {
        // Nothing to do
    }

}
