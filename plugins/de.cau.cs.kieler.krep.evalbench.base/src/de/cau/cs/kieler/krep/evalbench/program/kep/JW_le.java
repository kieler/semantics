package de.cau.cs.kieler.krep.evalbench.program.kep;

public class JW_le extends AddrInstruction{

	public JW_le(Label addr, SCLine sc){
	super(Constants.JW_LE.getOpcode(),Constants.JW_LE.getInfo() ,addr,sc);
	}
}
