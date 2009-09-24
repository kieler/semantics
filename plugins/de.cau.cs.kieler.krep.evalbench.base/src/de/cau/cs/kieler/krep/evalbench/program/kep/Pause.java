package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Pause extends Instruction {

	public Pause(SCLine sc){
		super(Constants.PAUSE.getOpcode(),Constants.PAUSE.getInfo(),sc);
	}

}

