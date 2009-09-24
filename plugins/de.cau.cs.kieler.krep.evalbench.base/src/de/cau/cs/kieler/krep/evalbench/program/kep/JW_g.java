package de.cau.cs.kieler.krep.evalbench.program.kep;


public class JW_g extends AddrInstruction{

	public JW_g(Label addr, SCLine sc){
	super(Constants.JW_G.getOpcode(),Constants.JW_G.getInfo() ,addr,sc);
	}
}
