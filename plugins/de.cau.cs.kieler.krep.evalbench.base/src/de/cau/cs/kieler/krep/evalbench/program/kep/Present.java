package de.cau.cs.kieler.krep.evalbench.program.kep;



public class Present extends AddrSigInstruction{

	public Present(KepSignal sig, Label addr, SCLine sc){
	super(Constants.PRESENT.getOpcode(),Constants.PRESENT.getInfo() ,sig,addr,sc);
	}
}
