package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Await extends SigInstruction {

	public Await(KepSignal sig, SCLine sc) {
		super(Constants.AWAIT.getOpcode(),Constants.AWAIT.getInfo(),sig, sc);

	}
}
