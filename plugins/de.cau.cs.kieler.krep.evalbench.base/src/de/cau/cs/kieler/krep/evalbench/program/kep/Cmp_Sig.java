package de.cau.cs.kieler.krep.evalbench.program.kep;



public class Cmp_Sig extends SigRegInst {

	public Cmp_Sig(Register reg, KepSignal sig, SCLine sc) {
		super(Constants.CMP_SIG.getOpcode(),Constants.CMP_SIG.getInfo(), reg ,sig, sc);

	}
}
