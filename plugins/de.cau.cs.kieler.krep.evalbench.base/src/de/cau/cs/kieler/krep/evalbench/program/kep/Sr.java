package de.cau.cs.kieler.krep.evalbench.program.kep;



public class Sr extends RegisterInst {

	public Sr(Register reg, SCLine sc) {
		super(Constants.SR.getOpcode(),Constants.SR.getInfo(),reg, sc);

	}
}
