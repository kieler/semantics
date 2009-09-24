package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Load_Data extends RegisterDataInst {

	public Load_Data(Register target,Data data, SCLine sc) {
		super(Constants.LOAD_DATA.getOpcode(),Constants.LOAD_DATA.getInfo(),target, data, sc);
	}

}
