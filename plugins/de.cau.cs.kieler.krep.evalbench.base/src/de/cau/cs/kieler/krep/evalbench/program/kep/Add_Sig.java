package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Add_Sig extends SigRegInst {

	public Add_Sig(Register reg,KepSignal sig, SCLine sc) {
		super(Constants.ADD_SIG.getOpcode(),Constants.ADD_SIG.getInfo(),reg, sig, sc);

	}
}
