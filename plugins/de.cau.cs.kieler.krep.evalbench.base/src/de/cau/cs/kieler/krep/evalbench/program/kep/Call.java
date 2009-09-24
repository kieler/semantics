package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Call extends AddrInstruction{

	public Call(Label addr, SCLine sc){
	super(Constants.CALL.getOpcode(),Constants.CALL.getInfo() ,addr,sc);
	}
}
