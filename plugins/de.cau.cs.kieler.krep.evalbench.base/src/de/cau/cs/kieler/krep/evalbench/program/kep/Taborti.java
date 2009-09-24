package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Taborti extends AddrSigWatchInstruction {

	public Taborti(KepSignal sig, Label addr, Watcher watch, SCLine sc) {
		super(Constants.TABORTI.getOpcode(),Constants.TABORTI.getInfo(),sig,addr,watch, sc);

	}
}
