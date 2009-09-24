package de.cau.cs.kieler.krep.evalbench.program.kep;


public class JW_ne extends AddrInstruction{

	public JW_ne(Label addr, SCLine sc){
	super(Constants.JW_NE.getOpcode(),Constants.JW_NE.getInfo() ,addr,sc);
	}
}
