package de.cau.cs.kieler.krep.evalbench.program.krep;

import java.util.Map;

/**
 * @author ctr
 * Jump when Zero
 */
public class Jz extends Statement {
    String label;
    String test;
     
    Integer R_test;
    Integer target=0;
    
    
    /**
     * @param test name of the register to test
     * @param label jump target
     */
    public Jz(String test, String label) {
	super();
	this.label = label;
	this.test = test;
    }
    
    @Override
    public void setLabel(Map<String,Integer> labels){
	target=labels.get(label);
    }

    @Override
    public void allocateRegs(Map<String, Integer> regs) {
	R_test=regs.get(test);
	if (R_test==null){
	   R_test = regs.size()+1;
	   regs.put(test, R_test);
	} 

    }

    @Override
    public int[] getBytes() {
	int[] b = {OPCODE.JZ, R_test, target, 0};
	return b;
    }

    @Override
    public String toString() {
	return "JZ " + R_test + " " +  target + "(" + test + " " + label + ")";
    }

}
