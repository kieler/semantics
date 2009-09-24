package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Mul_Sig extends SigRegInst {

	public Mul_Sig(Register reg,KepSignal sig, SCLine sc) {
		super(Constants.MUL_SIG.getOpcode(),Constants.MUL_SIG.getInfo(),reg, sig, sc);

	}
}
