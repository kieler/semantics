package de.cau.cs.kieler.krep.evalbench.program.klp;
//package krep.evalbench.program.klp;
//
//import java.util.HashMap;
//
//import krep.evalbench.exceptions.ParseException;
//import krep.evalbench.program.Instruction;
//
///**
// * @author ctr Assembler declaration to initialize a register
// */
//public class Init extends Instruction {
//
//    /*
//     * public enum Type { C, V; }
//     */
//
//    // private Type t;
//    private final Register reg;
//
//    private String label;
//
//    private int pos;
//
//    private Register clock = null;
//
//    /**
//     * @param name
//     *            unique name of the register
//     * @param label
//     *            label where the corresponding code starts
//     * @param clock
//     *            name of the clock register, null when on base clock
//     */
//    public Init(final String name, final String label, final String clock) {
//	super();
//	// this.t = t;
//	this.reg = Register.get(name);
//	// reg.setType(t);
//	this.label = label;
//	if (clock != null) {
//	    this.clock = Register.get(clock);
//	}
//
//    }
//
//    @Override
//    public String toString() {
//	String res = "INITC"; // + t.toString()
//	res += "\t" + reg.toString();
//	if (label != null) {
//	    res += "\t" + label;
//	}
//	if (clock != null) {
//	    res += "\t" + clock.toString();
//	}
//	return res;
//    }
//
//    @Override
//    protected int[] getObj() {
//	Opcode op;
//	// if (t == Type.C) {
//	op = Opcode.INITC;
//	// } else {
//	// op = Opcode.INITV;
//	// }
//	return new int[] { op.getCode(), reg.getId(),
//		(label == null) ? 0 : pos, (clock == null) ? 0 : clock.getId() };
//    }
//
//    @Override
//    public void asmLabel(HashMap<String, Integer> label2addr)
//	    throws ParseException {
//	if (label != null) {
//	    Integer p = label2addr.get(label);
//	    if (p == null) {
//		throw new ParseException("unknown label " + label);
//	    }
//	    pos = p;
//	}
//    }
//
//}
