package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Andr_Data extends RegisterDataInst {

	public Andr_Data(Register target,Data data, SCLine sc) {
		super(Constants.ANDR_DATA.getOpcode(),Constants.ANDR_DATA.getInfo(),target, data, sc);
	}
	
}
