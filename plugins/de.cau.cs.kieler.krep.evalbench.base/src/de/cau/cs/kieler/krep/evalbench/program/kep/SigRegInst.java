package de.cau.cs.kieler.krep.evalbench.program.kep;


public class SigRegInst extends SigInstruction {

	Register reg;

	public SigRegInst(String id, String name, Register reg,KepSignal sig, SCLine sc) {
		super(id, name, sig, sc);
		this.reg=reg;
	}

	public SigRegInst(String id, String name, KepSignal sig, SCLine sc) {
		super(id, name, sig, sc);
		this.reg=sig.getReg();
	}

	/* (non-Javadoc)
	 * @see kasm.classes.RegisterInst#encode()
	 */
	@Override
	public String encode() {
		return super.encode()+reg.encode();
	}
	@Override
	public String toString(){
		return ""+super.toString()+reg.toString()+"_";
	}
	/* (non-Javadoc)
	 * @see kasm.classes.RegisterInst#info()
	 */
	@Override
	public String info() {
		return super.info()+" "+reg.info();
	}

	/* (non-Javadoc)
	 * @see kasm.classes.RegisterInst#length()
	 */
	@Override
	public int length() {
		return super.length()+reg.length();
	}

}
