package de.cau.cs.kieler.krep.evalbench.program.klp;

import java.util.HashMap;

import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.program.Instruction;


public class Prio extends Instruction {

    
    private final Register reg;
    private final int val;
	
    public Prio(String reg, int val){
	super();
	this.reg = Register.get(reg);
	this.val = val;
    }
    
    @Override
    public void asmLabel(HashMap<String, Integer> label2addr)
	    throws ParseException {
	// Nothing to do
	
    }

    @Override
    protected int[] getObj() {
	Opcode op = Opcode.PRIO; 
	return new int[] { op.getCode(), reg.getId(), val, 0 };
    }

    @Override
    public String toString() {
	return "PRIO " + reg.toString() + " " + val;
    }

}
