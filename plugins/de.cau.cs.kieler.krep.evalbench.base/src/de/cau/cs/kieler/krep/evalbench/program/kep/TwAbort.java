package de.cau.cs.kieler.krep.evalbench.program.kep;



public class TwAbort extends AddrSigWatchInstruction {

	public TwAbort(KepSignal sig, Label addr, Watcher watch, SCLine sc) {
		super(Constants.TWABORT.getOpcode(),Constants.TWABORT.getInfo(),sig,addr,watch, sc);

	}
}
