package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Andr_Reg extends RegisterRegInst {
	
	
	public Andr_Reg(Register target, Register source, SCLine sc) {
		super(Constants.ANDR_REG.getOpcode(),Constants.ANDR_REG.getInfo(), target,source, sc);
	}
	
}
