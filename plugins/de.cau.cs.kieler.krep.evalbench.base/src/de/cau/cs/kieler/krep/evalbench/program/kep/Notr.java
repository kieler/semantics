package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Notr extends RegisterInst {

	public Notr(Register reg, SCLine sc) {
		super(Constants.NOTR.getOpcode(),Constants.NOTR.getInfo(),reg, sc);

	}
}
