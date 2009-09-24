package de.cau.cs.kieler.krep.evalbench.program.krep;

import java.util.Map;

/**
 * @author ctr
 * 
 *         Abstract superclass for all KReP statements
 */
public abstract class Statement {
    /**
     * @return 4 bytes that decode the instruction (opcode to three arguments
     */
    public abstract int[] getBytes();

    @Override
    public abstract String toString();

    /**
     * @param regs
     *            maps register names to register ids
     */
    public abstract void allocateRegs(Map<String, Integer> regs);

    /**
     * @param labels maps label names to addresses 
     */
    public void setLabel(Map<String, Integer> labels) {
	  // no label by default
    }

    /**
     * @param ids map register name to bus identifier
     */
    public void setBusID(Map<String, Integer> ids) {
	// no bus used by default
    }

}
