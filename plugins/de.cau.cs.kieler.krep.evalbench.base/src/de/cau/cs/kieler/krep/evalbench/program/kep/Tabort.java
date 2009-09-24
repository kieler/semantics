package de.cau.cs.kieler.krep.evalbench.program.kep;



public class Tabort extends AddrSigWatchInstruction {

	public Tabort(KepSignal sig, Label addr, Watcher watch, SCLine sc) {
		super(Constants.TABORT.getOpcode(),Constants.TABORT.getInfo(),sig,addr,watch, sc);

	}
}
