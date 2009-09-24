package de.cau.cs.kieler.krep.evalbench.program.kep;


public class CAwaiti extends AddrSigInstruction{

	public CAwaiti(KepSignal sig, Label addr, SCLine sc){
	super(Constants.CAWAITI.getOpcode(),Constants.CAWAITI.getInfo() ,sig,addr,sc);
	}
}
