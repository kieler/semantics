package de.cau.cs.kieler.krep.evalbench.program.kep;



public class CAwaits extends Instruction{

	public CAwaits(SCLine sc){
	super(Constants.CLRC.getOpcode(),Constants.CLRC.getInfo() ,sc);
	}
}
