package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Sub_Sig extends SigRegInst {

	public Sub_Sig(Register reg,KepSignal sig, SCLine sc) {
		super(Constants.SUB_SIG.getOpcode(),Constants.SUB_SIG.getInfo(),reg, sig, sc);

	}
}
