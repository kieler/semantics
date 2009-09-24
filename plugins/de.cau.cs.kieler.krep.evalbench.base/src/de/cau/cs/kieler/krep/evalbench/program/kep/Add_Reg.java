package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Add_Reg extends RegisterRegInst {
	
	
	public Add_Reg(Register target, Register source, SCLine sc) {
		super(Constants.ADD_REG.getOpcode(),Constants.ADD_REG.getInfo(), target,source, sc);
	}
	
}
