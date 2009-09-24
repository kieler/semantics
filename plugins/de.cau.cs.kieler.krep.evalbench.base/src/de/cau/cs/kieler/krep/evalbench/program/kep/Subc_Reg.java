package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Subc_Reg extends RegisterRegInst {
	
	
	public Subc_Reg(Register target, Register source, SCLine sc) {
		super(Constants.SUBC_REG.getOpcode(),Constants.SUBC_REG.getInfo(), target,source, sc);
	}
	
}
