package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Pare extends AddrInstruction {

    PrioID prio;

    public Pare(Label addr, PrioID prio, SCLine sc) {
	super(Constants.PARE.getOpcode(), Constants.PARE.getInfo(), addr, sc);
	this.prio = prio;
    }

    @Override
    public String encode() {
	return "" + super.encode() + prio.encode();
    }

    @Override
    public String toString() {
	return super.toString() + ", " + prio.toString();
    }

    @Override
    public String info() {
	return super.info() + " " + prio.info();
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.Instruction#length()
     */
    @Override
    public int length() {
	return super.length() + prio.length();
    }
}
