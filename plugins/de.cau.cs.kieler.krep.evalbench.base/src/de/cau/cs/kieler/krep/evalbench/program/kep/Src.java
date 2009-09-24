package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Src extends RegisterInst {

	public Src(Register reg, SCLine sc) {
		super(Constants.SRC.getOpcode(),Constants.SRC.getInfo(),reg, sc);

	}
}
