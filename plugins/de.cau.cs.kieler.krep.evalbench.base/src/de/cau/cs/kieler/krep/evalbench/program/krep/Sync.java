package de.cau.cs.kieler.krep.evalbench.program.krep;

import java.util.Map;

/**
 * @author ctr
 * 
 *         Synchronize with other cores
 */
public class Sync extends Statement {

    @Override
    public int[] getBytes() {
	int[] b = { OPCODE.SYNC, 0, 0, 0 };
	return b;
    }

    @Override
    public String toString() {
	return "SYNC";
    }

    @Override
    public void allocateRegs(Map<String, Integer> regs) {
	// no regs used
    }

}
