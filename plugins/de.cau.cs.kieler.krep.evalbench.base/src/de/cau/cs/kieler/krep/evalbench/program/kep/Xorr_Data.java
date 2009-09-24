package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Xorr_Data extends RegisterDataInst {

	public Xorr_Data(Register target,Data data, SCLine sc) {
		super(Constants.XORR_DATA.getOpcode(),Constants.XORR_DATA.getInfo(),target, data, sc);
	}
	
}
