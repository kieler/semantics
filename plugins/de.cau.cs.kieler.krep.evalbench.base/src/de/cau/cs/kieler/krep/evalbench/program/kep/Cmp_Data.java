package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Cmp_Data extends RegisterDataInst {

	public Cmp_Data(Register target,Data data, SCLine sc) {
		super(Constants.CMP_DATA.getOpcode(),Constants.CMP_DATA.getInfo(),target, data, sc);
	}
	
}
