package de.cau.cs.kieler.krep.evalbench.program.klp;

import java.util.HashMap;

import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.program.Instruction;


/**
 * @author ctr Copy register value to another register
 */
public class Mov extends Instruction {

	/**
	 * @author ctr possible types of register to register move
	 */
	public enum Type {
		/**
		 * clock to values
		 */
		CV,
		/**
		 * value to clock
		 */
		VC,
		/**
		 * clock to clock
		 */
		CC,
		/**
		 * value to value
		 */
		VV;
	}

	private Type t;
	private Register to;
	private Read from;

	/**
	 * @param t
	 *            type of this register to register move
	 * @param to
	 *            target register
	 * @param from
	 *            source register
	 */
	public Mov(Type t, String to, Read from) {
		this.t = t;
		this.to = Register.get(to);
		this.from = from; // new Read(Register.get(v.toString()), pre);
	}

	@Override
	public String toString() {
		String res = "  ";
		switch (t) {
		case CV:
			res += "CV";
			break;
		case CC:
			res += "CC";
			break;
		case VC:
			res += "VC";
			break;
		case VV:
			res += "VV";
			break;
		}

		res += "MOV\t" + to.toString() + "\t" + from.toString();
		return res;
	}

	@Override
	public int[] getObj() {
		Opcode op = null;
		switch (t) {
		case CV:
			op = Opcode.INT;
			break;
		case CC:
			op = Opcode.CCMOV;
			break;
		case VC:
			op = Opcode.BOOL;
			break;
		case VV:
			op = Opcode.VVMOV;
			break;
		}
		return new int[] { op.getCode(), 2 * to.getId(), from.getId(), 0 };
	}

	@Override
	public void asmLabel(HashMap<String, Integer> label2addr)
		throws ParseException {
	    // TODO nothing to do
	}

}
