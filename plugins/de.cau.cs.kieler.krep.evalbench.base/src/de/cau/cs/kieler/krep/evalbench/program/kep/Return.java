package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Return extends Instruction {

	public Return(SCLine sc){
		super(Constants.RETURN.getOpcode(),Constants.RETURN.getInfo(),sc);
	}

}

