package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Emit_Reg extends SigRegInst {

	public Emit_Reg(KepSignal sig, SCLine sc) {
		super(Constants.EMIT_REG.getOpcode(),Constants.EMIT_REG.getInfo(), sig, sc);

	}
}
