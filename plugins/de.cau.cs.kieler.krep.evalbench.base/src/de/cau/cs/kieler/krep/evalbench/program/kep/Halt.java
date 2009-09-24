package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Halt extends Instruction {

	public Halt(SCLine sc){
		super(Constants.HALT.getOpcode(),Constants.HALT.getInfo(),sc);
	}

}

