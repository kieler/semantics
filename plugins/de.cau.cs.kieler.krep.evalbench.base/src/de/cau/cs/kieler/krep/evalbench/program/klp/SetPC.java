/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
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
public class SetPC extends Instruction {

    /*
     * public enum Type { C, V; }
     */

    // private Type t;
    private final Register reg;

    private String label;

    private int pos;

    /**
     * @param name
     *            unique name of the register
     * @param label
     *            label where the corresponding code starts
     * @param clock
     *            name of the clock register, null when on base clock
     */
    public SetPC(final String name, final String label) {
	super();
	this.reg = Register.get(name);
	this.label = label;
    }

    @Override
    public String toString() {
	String res = "SETPC"
	    + "\t" + reg.toString();
	if (label != null) {
	    res += "\t" + label;
	}
	return res;
    }

    @Override
    protected int[] getObj() {
	Opcode op = Opcode.SETPC;
	return new int[] { op.getCode(),  reg.getId(), pos>>8, pos& 0xFF };
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
