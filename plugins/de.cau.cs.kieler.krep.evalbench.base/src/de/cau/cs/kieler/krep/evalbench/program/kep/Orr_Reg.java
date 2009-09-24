package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Orr_Reg extends RegisterRegInst {
	
	
	public Orr_Reg(Register target, Register source, SCLine sc) {
		super(Constants.ORR_REG.getOpcode(),Constants.ORR_REG.getInfo(), target,source, sc);
	}
	
}
