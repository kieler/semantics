package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Cmps_Data extends RegisterDataInst {

	public Cmps_Data(Register target,Data data, SCLine sc) {
		super(Constants.CMPS_DATA.getOpcode(),Constants.CMPS_DATA.getInfo(),target, data, sc);
	}
	
}
