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
     * @param label
     *            label where the corresponding code starts
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
	String res = "SETClk" 
	    + "\t" + reg.toString()
	    + "\t" + clock.toString();

	return res;
    }

    @Override
    protected int[] getObj() {
	Opcode op = Opcode.SETCLK;

	return new int[] { op.getCode(), reg.getId(),
		clock.getId(), 0 };
    }

    @Override
    public void asmLabel(HashMap<String, Integer> label2addr)
	    throws ParseException {
	// Nothing to do
    }

}
