package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Sustain_Reg extends SigRegInst {

	public Sustain_Reg(KepSignal sig, SCLine sc) {
		super(Constants.SUSTAIN_REG.getOpcode(),Constants.SUSTAIN_REG.getInfo(), sig, sc);

	}
}
