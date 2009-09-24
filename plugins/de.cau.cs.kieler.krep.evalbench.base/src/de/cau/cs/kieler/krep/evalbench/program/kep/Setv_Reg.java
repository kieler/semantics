package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Setv_Reg extends SigRegInst {

	public Setv_Reg(KepSignal sig, SCLine sc) {
		super(Constants.SETV_REG.getOpcode(),Constants.SETV_REG.getInfo(), sig, sc);

	}
}
