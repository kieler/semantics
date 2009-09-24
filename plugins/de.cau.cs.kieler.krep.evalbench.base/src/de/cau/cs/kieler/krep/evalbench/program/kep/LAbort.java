package de.cau.cs.kieler.krep.evalbench.program.kep;


public class LAbort extends AddrSigWatchInstruction {

	public LAbort(KepSignal sig, Label addr, Watcher watch, SCLine sc) {
		super(Constants.LABORT.getOpcode(),Constants.LABORT.getInfo(),sig,addr,watch, sc);

	}
}
