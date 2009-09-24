package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Subc_Data extends RegisterDataInst {

	public Subc_Data(Register target,Data data, SCLine sc) {
		super(Constants.SUBC_DATA.getOpcode(),Constants.SUBC_DATA.getInfo(),target, data, sc);
	}
	
}
