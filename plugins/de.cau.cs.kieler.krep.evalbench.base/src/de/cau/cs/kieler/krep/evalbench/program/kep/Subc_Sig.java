package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Subc_Sig extends SigRegInst {

	public Subc_Sig(Register reg,KepSignal sig, SCLine sc) {
		super(Constants.SUBC_SIG.getOpcode(),Constants.SUBC_SIG.getInfo(),reg, sig, sc);

	}
}
