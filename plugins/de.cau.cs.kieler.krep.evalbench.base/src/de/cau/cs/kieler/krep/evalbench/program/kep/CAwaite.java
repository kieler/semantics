package de.cau.cs.kieler.krep.evalbench.program.kep;



public class CAwaite extends AddrInstruction{

	public CAwaite(Label addr, SCLine sc){
	super(Constants.CAWAITE.getOpcode(),Constants.CAWAITE.getInfo() ,addr,sc);
	}
}
