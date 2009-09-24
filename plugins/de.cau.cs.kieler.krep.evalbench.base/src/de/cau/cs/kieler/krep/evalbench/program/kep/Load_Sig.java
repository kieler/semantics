package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Load_Sig extends SigRegInst {

	public Load_Sig(Register reg,KepSignal sig, SCLine sc) {
		super(Constants.LOAD_SIG.getOpcode(),Constants.LOAD_SIG.getInfo(),reg, sig, sc);

	}
}
