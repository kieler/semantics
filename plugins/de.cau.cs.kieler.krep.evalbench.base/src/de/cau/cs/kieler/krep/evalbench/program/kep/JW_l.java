package de.cau.cs.kieler.krep.evalbench.program.kep;


public class JW_l extends AddrInstruction{

	public JW_l(Label addr, SCLine sc){
	super(Constants.JW_L.getOpcode(),Constants.JW_L.getInfo() ,addr,sc);
	}
}
