package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Sub_Reg extends RegisterRegInst {
	
	
	public Sub_Reg(Register target, Register source, SCLine sc) {
		super(Constants.SUB_REG.getOpcode(),Constants.SUB_REG.getInfo(), target,source, sc);
	}
	
}
