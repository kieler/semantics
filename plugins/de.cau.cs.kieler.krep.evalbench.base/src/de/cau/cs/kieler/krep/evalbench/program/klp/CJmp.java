package de.cau.cs.kieler.krep.evalbench.program.klp;

import java.util.HashMap;

import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.program.Instruction;


/**
 * @author ctr
 * Conditional Jump
 */
public class CJmp extends Instruction {
    
    /**
     * @author ctr
     * Condition on which a jump can be based
     */
    public enum Cond {
    	/**
    	 * jump when true
    	 */
    	T, 
    	/**
    	 * jump when false
    	 */
    	F, 
    	/**
    	 * jump when zero
    	 */
    	Z, 
    	/**
    	 * jump when not zero
    	 */
    	NZ;
    }


    private Read reg;

    private Cond cond;

    private String label;
    private int pos;



    /**
     * @param cond condition
     * @param reg register to check
     * @param l label of the target
     */
    public CJmp(Cond cond, Read reg, String l) {
	super();
	this.cond = cond;
	this.reg = reg;
	label = l;
    }

    @Override
    public String toString() {

	return "JF\t" + reg.toString() + "\t" + label;
    }

    @Override
    public int[] getObj() {
	return new int[]{getOp(), pos>>8, pos & 0xFF, reg.getId()};
    }

    private int getOp() {
	int res = 0;
	switch (cond) {
	case T: res = Opcode.JT.getCode(); break;
	case F: res = Opcode.JF.getCode(); break;
	case Z: res = Opcode.JZ.getCode(); break;
	case NZ: res = Opcode.JNZ.getCode(); break;

	}
	return res;
    }

    @Override
    public void asmLabel(HashMap<String, Integer> label2addr) throws ParseException {
	Integer p = label2addr.get(label);
	if(p==null){
	    throw new ParseException("unknown label " + label);
	}
	pos=p;
    }

    
    
}
