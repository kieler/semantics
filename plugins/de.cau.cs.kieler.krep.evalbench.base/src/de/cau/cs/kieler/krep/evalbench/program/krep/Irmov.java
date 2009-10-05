package de.cau.cs.kieler.krep.evalbench.program.krep;

import java.util.Map;

/**
 * @author ctr
 * Move imediate value to a register
 */
public class Irmov extends Statement {

    String to;
    Integer val;
    Integer R_to=0;
    
    
    /**
     * @param to Name of the target register
     * @param val value
     */
    public Irmov(String to, Integer val) {
	super();
	this.to = to;
	this.val = val;
    }

    @Override
    public void allocateRegs(Map<String, Integer> regs) {
	R_to=regs.get(to);
	if (R_to==null){
	   R_to = regs.size()+1;
	   regs.put(to, R_to);
	} 
    }

    @Override
    public int[] getBytes() {
	int[] b = {OPCODE.IRMOV, R_to, val, 0};
	return b;
    }

    @Override
    public String toString() {
	return "IRMOV "+ R_to + " " + val+ " (" + to + "<-" + val + ")";
    }

}
