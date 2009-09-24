package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Cmp_Reg extends RegisterRegInst {
	
	
	public Cmp_Reg(Register target, Register source, SCLine sc) {
		super(Constants.CMP_REG.getOpcode(),Constants.CMP_REG.getInfo(), target,source, sc);
	}
	
}
