package de.cau.cs.kieler.krep.evalbench.program.kep;

public class LwAbort extends AddrSigWatchInstruction {

	public LwAbort(KepSignal sig, Label addr, Watcher watch, SCLine sc) {
		super(Constants.LWABORT.getOpcode(),Constants.LWABORT.getInfo(),sig,addr,watch, sc);

	}
}
