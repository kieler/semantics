package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Andr_Sig extends SigRegInst {

	public Andr_Sig(Register reg,KepSignal sig, SCLine sc) {
		super(Constants.ANDR_SIG.getOpcode(),Constants.ANDR_SIG.getInfo(), reg, sig, sc);

	}
}
