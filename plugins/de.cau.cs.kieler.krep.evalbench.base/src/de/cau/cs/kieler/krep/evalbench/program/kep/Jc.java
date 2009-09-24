package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Jc extends AddrInstruction{

	public Jc(Label addr, SCLine sc){
	super(Constants.JC.getOpcode(),Constants.JC.getInfo() ,addr,sc);
	}
}
