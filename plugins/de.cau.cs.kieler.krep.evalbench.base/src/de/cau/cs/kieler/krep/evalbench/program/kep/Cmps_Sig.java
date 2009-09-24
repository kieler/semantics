package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Cmps_Sig extends SigRegInst {

	public Cmps_Sig(Register reg,KepSignal sig, SCLine sc) {
		super(Constants.CMPS_SIG.getOpcode(),Constants.CMPS_SIG.getInfo(),reg, sig, sc);

	}
}
