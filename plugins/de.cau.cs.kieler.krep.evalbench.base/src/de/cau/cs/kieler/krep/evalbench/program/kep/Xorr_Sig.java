package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Xorr_Sig extends SigRegInst {

	public Xorr_Sig(Register reg,KepSignal sig, SCLine sc) {
		super(Constants.XORR_SIG.getOpcode(),Constants.XORR_SIG.getInfo(),reg, sig, sc);

	}
}
