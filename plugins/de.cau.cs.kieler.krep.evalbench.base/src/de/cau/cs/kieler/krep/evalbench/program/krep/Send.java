package de.cau.cs.kieler.krep.evalbench.program.krep;

import java.util.Map;

/**
 * @author ctr
 *
 * Send a value to another core
 */
public class Send extends Statement {

    String name; 
    Integer id=0;
    Integer reg=0;  
    
        
    /**
     * @param name name of the register to send
     */
    public Send(String name) {
	super();
	this.name = name;
    }

    @Override
    public int[] getBytes() {
	int b[] = {OPCODE.SEND, reg, id, 0};
	return b;
    }
    
    @Override
    public String toString(){
	return "SEND " + reg + " " + id + " (" + name + ")";
    }
    
    @Override
    public void allocateRegs(Map<String, Integer> regs){
	reg=regs.size()+1;
	regs.put(name, reg);	
    }
    
    @Override
    public void setBusID(Map<String, Integer> ids){
	id = ids.get(name);
	if(id==null){
	    id=ids.size()+1;
	    ids.put(name, id);
	}
    }
	
}
