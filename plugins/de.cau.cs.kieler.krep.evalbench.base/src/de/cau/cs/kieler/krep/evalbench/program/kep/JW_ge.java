package de.cau.cs.kieler.krep.evalbench.program.kep;

public class JW_ge extends AddrInstruction{

	public JW_ge(Label addr, SCLine sc){
	super(Constants.JW_GE.getOpcode(),Constants.JW_GE.getInfo() ,addr,sc);
	}
}
