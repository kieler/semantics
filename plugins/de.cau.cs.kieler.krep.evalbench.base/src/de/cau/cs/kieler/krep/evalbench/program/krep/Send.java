package de.cau.cs.kieler.krep.evalbench.program.krep;

import java.util.Map;

/**
 * @author ctr
 *
 * Send a value to another core
 */
public class Send extends Statement {

    String Name; 
    Integer ID;
    Integer Reg;  
    
        
    /**
     * @param name name of the register to send
     */
    public Send(String name) {
	super();
	Name = name;
    }

    @Override
    public int[] getBytes() {
	int b[] = {OPCODE.SEND, Reg, ID, 0};
	return b;
    }
    
    @Override
    public String toString(){
	return "SEND " + Reg + " " + ID + " (" + Name + ")";
    }
    
    @Override
    public void allocateRegs(Map<String, Integer> regs){
	Reg=regs.size()+1;
	regs.put(Name, Reg);	
    }
    
    @Override
    public void setBusID(Map<String, Integer> ids){
	ID = ids.get(Name);
	if(ID==null){
	    ID=ids.size()+1;
	    ids.put(Name, ID);
	}
    }
	
}
