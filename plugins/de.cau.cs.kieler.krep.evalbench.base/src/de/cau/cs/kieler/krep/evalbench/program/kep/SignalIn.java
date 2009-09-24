package de.cau.cs.kieler.krep.evalbench.program.kep;


public class SignalIn extends SigInstruction {

	public SignalIn(KepSignal sig, SCLine sc) {
		super(Constants.SIGNALIN.getOpcode(),Constants.SIGNALIN.getInfo(),sig, sc);

	}
}
