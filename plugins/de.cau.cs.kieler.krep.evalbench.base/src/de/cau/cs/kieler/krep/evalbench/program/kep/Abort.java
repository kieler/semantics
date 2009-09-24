package de.cau.cs.kieler.krep.evalbench.program.kep;



public class Abort extends AddrSigWatchInstruction {

	public Abort(KepSignal sig, Label addr, Watcher watch, SCLine sc) {
		super(Constants.ABORT.getOpcode(),Constants.ABORT.getInfo(),sig,addr,watch, sc);

	}
}
