package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Orr_Data extends RegisterDataInst {

	public Orr_Data(Register target,Data data, SCLine sc) {
		super(Constants.ORR_DATA.getOpcode(),Constants.ORR_DATA.getInfo(),target, data, sc);
	}
	
}
