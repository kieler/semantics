package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Aborti extends AddrSigWatchInstruction {

	public Aborti(KepSignal sig, Label addr, Watcher watch, SCLine sc) {
		super(Constants.ABORTI.getOpcode(),Constants.ABORTI.getInfo(),sig,addr,watch, sc);

	}
}
