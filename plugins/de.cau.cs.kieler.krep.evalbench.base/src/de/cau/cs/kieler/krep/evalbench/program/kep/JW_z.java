package de.cau.cs.kieler.krep.evalbench.program.kep;

public class JW_z extends AddrInstruction{

	public JW_z(Label addr, SCLine sc){
	super(Constants.JW_Z.getOpcode(),Constants.JW_Z.getInfo() ,addr,sc);
	}
}
