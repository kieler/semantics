package de.cau.cs.kieler.krep.evalbench.program.kep;



public class Sl extends RegisterInst {

	public Sl(Register reg, SCLine sc) {
		super(Constants.SL.getOpcode(),Constants.SL.getInfo(),reg, sc);

	}
}
