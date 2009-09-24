package de.cau.cs.kieler.krep.evalbench.program.kep;



public class Suspend extends AddrSigWatchInstruction {

	public Suspend(KepSignal sig, Label addr, Watcher watch, SCLine sc) {
		super(Constants.SUSPEND.getOpcode(),Constants.SUSPEND.getInfo(),sig,addr,watch, sc);

	}
}
