package de.cau.cs.kieler.krep.evalbench.program.kep;


public class LAborti extends AddrSigWatchInstruction {

	public LAborti(KepSignal sig, Label addr, Watcher watch, SCLine sc) {
		super(Constants.LABORTI.getOpcode(),Constants.LABORTI.getInfo(),sig,addr,watch, sc);

	}
}
