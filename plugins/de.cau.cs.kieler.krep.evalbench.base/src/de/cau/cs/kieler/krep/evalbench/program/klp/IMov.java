package de.cau.cs.kieler.krep.evalbench.program.klp;

import java.util.HashMap;

import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.program.Instruction;


/**
 * @author ctr immediate move
 */
public class IMov extends Instruction {
	/**
	 * @author ctr types of immediate moves
	 */
	public enum Type {
		/**
		 * immediate to clock
		 */
		IC,
		/**
		 * immediate to value
		 */
		IV;
	}

	private Type t;
	private Register to;
	// private Type type;
	private int val;

	/**
	 * move integer value to register
	 * @param t 
	 * 			  type of movement
	 * @param to
	 *            register that stores the value
	 * @param val
	 *            constant value to move
	 */
	public IMov(final Type t, String to, int val) {
		this.t = t;
		this.to = Register.get(to);
		this.val = val; // new Read(Register.get(v.toString()), pre);
	}

	@Override
	public String toString() {
		String res = "I";
		switch (t) {
		case IC:
			res += "C";
			break;
		case IV:
			res += "V";
			break;
		}
		res += "MOV\t" + to.toString() + "\t" + String.valueOf(val);

		return res;
	}

	@Override
	public int[] getObj() {
		Opcode op = null;
		switch (t) {
		case IC:
			op = Opcode.ICMOV;
			break;
		case IV:
			op = Opcode.IVMOV;
			break;
		}
		return new int[] { op.getCode(), 2 * to.getId(), val, 0 };
	}

	    @Override
	    public void asmLabel(HashMap<String, Integer> label2addr) throws ParseException {
		// nothing to do
	    }
	
}
