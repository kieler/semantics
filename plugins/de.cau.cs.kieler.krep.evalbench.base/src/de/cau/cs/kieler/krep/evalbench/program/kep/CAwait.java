package de.cau.cs.kieler.krep.evalbench.program.kep;


public class CAwait extends AddrSigInstruction{

	public CAwait(KepSignal sig, Label addr, SCLine sc){
	super(Constants.CAWAIT.getOpcode(),Constants.CAWAIT.getInfo() ,sig,addr,sc);
	}
}
