package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Cmps_Reg extends RegisterRegInst {
	
	
	public Cmps_Reg(Register target, Register source, SCLine sc) {
		super(Constants.CMPS_REG.getOpcode(),Constants.CMPS_REG.getInfo(), target,source, sc);
	}
	
}
