package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Setc extends Instruction {

	public Setc(SCLine sc){
		super(Constants.SETC.getOpcode(),Constants.SETC.getInfo(),sc);
	}

}

