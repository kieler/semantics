package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Addc_Sig extends SigRegInst {

	public Addc_Sig(Register reg,KepSignal sig, SCLine sc) {
		super(Constants.ADDC_SIG.getOpcode(),Constants.ADDC_SIG.getInfo(),reg, sig, sc);

	}
}
