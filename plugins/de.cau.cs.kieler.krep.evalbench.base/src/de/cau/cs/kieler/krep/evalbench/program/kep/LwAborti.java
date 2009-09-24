package de.cau.cs.kieler.krep.evalbench.program.kep;

public class LwAborti extends AddrSigWatchInstruction {

	public LwAborti(KepSignal sig, Label addr, Watcher watch, SCLine sc) {
		super(Constants.LWABORTI.getOpcode(),Constants.LWABORTI.getInfo(),sig,addr,watch, sc);

	}
}
