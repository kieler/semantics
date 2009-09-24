package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Mul_Reg extends RegisterRegInst {
	
	
	public Mul_Reg(Register target, Register source, SCLine sc) {
		super(Constants.MUL_REG.getOpcode(),Constants.MUL_REG.getInfo(), target,source, sc);
	}
	
}
