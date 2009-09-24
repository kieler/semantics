package de.cau.cs.kieler.krep.evalbench.program.krep;
import java.util.Map;

/**
 * @author ctr
 * Unconditional  jump
 */
public class Jmp extends Statement {
   
    byte target=0;
    String label;
    
    /**
     * @param label target label for jump
     */
    public Jmp(String label){
	this.label=label;
    }
    
    /**
     * @param target target address
     */
    public Jmp(final byte target){
	this.target=target;
    }
    
    @Override
    public int[] getBytes() {
	int[] b = {0x40, target, 0, 0};
	return b;
    }
    
    @Override
    public void setLabel(Map<String,Integer> labels){
	target=labels.get(label).byteValue();
    }
    
    @Override
    public String toString(){
	return "JMP " + target + " (" + label + ")";
    }
    
    @Override
    public void allocateRegs(Map<String,Integer> regs){
	// no registers needed
    }
}
