package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Addc_Data extends RegisterDataInst {

	public Addc_Data(Register target,Data data, SCLine sc) {
		super(Constants.ADDC_DATA.getOpcode(),Constants.ADDC_DATA.getInfo(),target, data, sc);
	}

}
