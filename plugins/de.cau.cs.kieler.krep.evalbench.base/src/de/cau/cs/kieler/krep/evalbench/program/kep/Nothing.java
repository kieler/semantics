package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Nothing extends Instruction {

	public Nothing(SCLine sc){
		super(Constants.NOTHING.getOpcode(),Constants.NOTHING.getInfo(),sc);
	}

}

