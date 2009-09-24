package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Exit extends AddrInstruction{
	Label fromAddr;
	public Exit(Label toAddr,Label fromAddr, SCLine sc){
	super(Constants.EXIT.getOpcode(),Constants.EXIT.getInfo() ,toAddr,sc);
	this.fromAddr=fromAddr;
	}
	@Override
	public String encode(){
		return ""+super.encode()+fromAddr.encode();
	}

	@Override
	public String info() {
		return super.info()+" "+fromAddr.info();
	}

	@Override
	public String toString(){
		return ""+super.toString()+"-"+fromAddr.toString();
	}

	/* (non-Javadoc)
	 * @see kasm.classes.Instruction#length()
	 */
	@Override
	public int length() {
		return super.length()+fromAddr.length();
	}
}
