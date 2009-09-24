package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Mul_Data extends RegisterDataInst {

	public Mul_Data(Register target,Data data, SCLine sc) {
		super(Constants.MUL_DATA.getOpcode(),Constants.MUL_DATA.getInfo(),target, data, sc);
	}
	
}
