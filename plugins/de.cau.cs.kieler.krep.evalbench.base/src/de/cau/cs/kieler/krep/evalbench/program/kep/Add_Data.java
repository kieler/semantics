package de.cau.cs.kieler.krep.evalbench.program.kep;



public class Add_Data extends RegisterDataInst {

	public Add_Data(Register target,Data data, SCLine sc) {
		super(Constants.ADD_DATA.getOpcode(),Constants.ADD_DATA.getInfo(),target, data, sc);
	}
	
}
