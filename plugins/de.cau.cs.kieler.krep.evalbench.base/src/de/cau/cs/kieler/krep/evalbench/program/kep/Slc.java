package de.cau.cs.kieler.krep.evalbench.program.kep;



public class Slc extends RegisterInst {

	public Slc(Register reg, SCLine sc) {
		super(Constants.SLC.getOpcode(),Constants.SLC.getInfo(),reg, sc);

	}
}
