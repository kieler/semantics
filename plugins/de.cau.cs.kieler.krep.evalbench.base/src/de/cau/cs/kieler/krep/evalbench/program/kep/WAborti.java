package de.cau.cs.kieler.krep.evalbench.program.kep;


public class WAborti extends AddrSigWatchInstruction {

	public WAborti(KepSignal sig, Label addr, Watcher watch, SCLine sc) {
		super(Constants.WABORTI.getOpcode(),Constants.WABORTI.getInfo(),sig,addr,watch, sc);

	}
}
