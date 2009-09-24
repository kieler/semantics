package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Orr_Sig extends SigRegInst {

	public Orr_Sig(Register reg,KepSignal sig, SCLine sc) {
		super(Constants.ORR_SIG.getOpcode(),Constants.ORR_SIG.getInfo(),reg, sig, sc);

	}
}
