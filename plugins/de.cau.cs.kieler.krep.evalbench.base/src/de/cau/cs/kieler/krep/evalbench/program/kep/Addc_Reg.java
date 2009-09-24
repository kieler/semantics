package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Addc_Reg extends RegisterRegInst {
	
	
	public Addc_Reg(Register target, Register source, SCLine sc) {
		super(Constants.ADDC_REG.getOpcode(),Constants.ADDC_REG.getInfo(), target,source, sc);
	}
	
}
