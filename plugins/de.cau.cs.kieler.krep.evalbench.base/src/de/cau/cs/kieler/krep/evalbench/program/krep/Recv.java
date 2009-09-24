package de.cau.cs.kieler.krep.evalbench.program.krep;

import java.util.Map;

/**
 * @author ctr
 * Receive a value
 */
public class Recv extends Statement {

    String Name; 
    Integer ID;
    Integer Reg;  
    
        
    /**
     * @param name name of the register to send
     */
    public Recv(final String name) {
	super();
	Name = name;
    }

    @Override
    public int[] getBytes() {
	int b[] = {OPCODE.RECV, Reg, ID, 0};
	return b;
    }
    
    @Override
    public String toString(){
	return "RECV " + Reg + " " +  ID + " (" + Name + ")";
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
