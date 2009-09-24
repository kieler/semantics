package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Awaiti extends SigInstruction {

	public Awaiti(KepSignal sig, SCLine sc) {
		super(Constants.AWAITI.getOpcode(),Constants.AWAITI.getInfo(),sig, sc);

	}
}
