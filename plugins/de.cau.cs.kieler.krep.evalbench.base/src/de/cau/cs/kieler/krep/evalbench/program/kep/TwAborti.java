package de.cau.cs.kieler.krep.evalbench.program.kep;



public class TwAborti extends AddrSigWatchInstruction {

	public TwAborti(KepSignal sig, Label addr, Watcher watch, SCLine sc) {
		super(Constants.TWABORTI.getOpcode(),Constants.TWABORTI.getInfo(),sig,addr,watch, sc);

	}
}
