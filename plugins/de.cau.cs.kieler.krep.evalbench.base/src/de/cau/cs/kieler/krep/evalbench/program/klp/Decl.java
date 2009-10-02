package de.cau.cs.kieler.krep.evalbench.program.klp;

import java.util.HashMap;

import de.cau.cs.kieler.krep.evalbench.comm.Signal;
import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.program.Instruction;


/**
 * @author ctr Declare register as input, output or local
 */
public class Decl extends Instruction {

	/**
	 * @author ctr scope of the sgnal
	 */
	public enum Kind {
		/**
		 * input signal
		 */
		INPUT,
		/**
		 * output signal
		 */
		OUTPUT,
		/**
		 * local signal
		 */
		LOCAL;
	}

	private final Kind kind;
	private int id;

	private static int nIn = 0;

	private static int nOut = 0;

	// private boolean isIn;

	private final Register reg;

	/**
	 * @param io
	 *            scope of the signal (input, output, local)
	 * @param reg
	 *            unique name of the register
	 */
	public Decl(final Kind io, final String reg) {
		this.reg = Register.get(reg);
		this.kind = io;
		if (io == Kind.INPUT) {
			id = nIn++;
		} else if (io == Kind.OUTPUT) {
			id = nOut++;
		}
	}

	@Override
	protected int[] getObj() {
		Opcode op;
		if (kind == Kind.INPUT) {
			op = Opcode.INPUT;
		} else if (kind == Kind.OUTPUT) {
			op = Opcode.OUTPUT;
		} else {
			return null;
		}
		return new int[] { op.getCode(), id, reg.getId(), 0 };
	}

	@Override
	public String toString() {
		String res = "";
		switch (kind) {
		case INPUT:
			res = "INPUT";
			break;
		case OUTPUT:
			res = "OUTPUT";
			break;
		case LOCAL:
			res = "LOCAL";
			break;
		}
		res += "\t" + reg.toString();

		return res;
	}

	
	/**
	 * @return get signal for this declaration
	 */
	public Signal getSignal() {
		final Signal res = new Signal(reg.toString(), false, 0, id);
		return res;
	}

	/**
	 * @return true if input declaration
	 */
	public boolean isInput() {
		return kind == Kind.INPUT;
	}

	/**
	 * @return true if output declaration
	 */
	public boolean isOutput() {
		return kind == Kind.OUTPUT;
	}

	/**
	 * reset number of io signals
	 */
	public static void clear() {
		nIn = 0;
		nOut = 0;
	}

	@Override
	public void asmLabel(HashMap<String, Integer> label2addr)
		throws ParseException {
	   //nothing to do 
	}

}
