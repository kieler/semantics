package de.cau.cs.kieler.krep.evalbench.program.kep;


public class WAbort extends AddrSigWatchInstruction {

	public WAbort(KepSignal sig, Label addr, Watcher watch, SCLine sc) {
		super(Constants.WABORT.getOpcode(),Constants.WABORT.getInfo(),sig,addr,watch, sc);

	}
}
