package de.cau.cs.kieler.krep.evalbench.program.kep;


public class JW_ee extends AddrInstruction{

	public JW_ee(Label addr, SCLine sc){
	super(Constants.JW_EE.getOpcode(),Constants.JW_EE.getInfo() ,addr,sc);
	}
}
