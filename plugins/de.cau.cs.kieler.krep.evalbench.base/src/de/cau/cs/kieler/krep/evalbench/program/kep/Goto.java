package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Goto extends AddrInstruction{

	public Goto(Label addr, SCLine sc){
	super(Constants.GOTO.getOpcode(),Constants.GOTO.getInfo() ,addr,sc);
	}
}
