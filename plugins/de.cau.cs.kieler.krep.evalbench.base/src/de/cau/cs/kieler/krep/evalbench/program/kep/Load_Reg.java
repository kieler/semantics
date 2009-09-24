package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Load_Reg extends RegisterRegInst {


	public Load_Reg(Register target, Register source, SCLine sc) {
		super(Constants.LOAD_REG.getOpcode(),Constants.LOAD_REG.getInfo(), target,source, sc);
	}

}
