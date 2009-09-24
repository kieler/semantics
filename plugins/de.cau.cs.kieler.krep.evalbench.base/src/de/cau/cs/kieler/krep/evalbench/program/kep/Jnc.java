package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Jnc extends AddrInstruction{

	public Jnc(Label addr, SCLine sc){
	super(Constants.JNC.getOpcode(),Constants.JNC.getInfo() ,addr,sc);
	}
}
