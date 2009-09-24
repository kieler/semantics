package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Sub_Data extends RegisterDataInst {

	public Sub_Data(Register target,Data data, SCLine sc) {
		super(Constants.SUB_DATA.getOpcode(),Constants.SUB_DATA.getInfo(),target, data, sc);
	}
	
}
