package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Xorr_Reg extends RegisterRegInst {
	
	
	public Xorr_Reg(Register target, Register source, SCLine sc) {
		super(Constants.XORR_REG.getOpcode(),Constants.XORR_REG.getInfo(), target,source, sc);
	}
	
}
