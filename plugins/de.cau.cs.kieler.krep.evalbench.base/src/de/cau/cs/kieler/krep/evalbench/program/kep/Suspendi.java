package de.cau.cs.kieler.krep.evalbench.program.kep;



public class Suspendi extends AddrSigWatchInstruction {

	public Suspendi(KepSignal sig, Label addr, Watcher watch, SCLine sc) {
		super(Constants.SUSPENDI.getOpcode(),Constants.SUSPENDI.getInfo(),sig,addr,watch, sc);

	}
}
