package de.cau.cs.kieler.krep.evalbench.program.kep;



public class Setv extends SigDataInstruction {

	public Setv (KepSignal sig,  SCLine sc){
		super(Constants.SETV.getOpcode(),Constants.SETV.getInfo(),sig, sc);
	}
	public Setv (KepSignal sig,Data data , SCLine sc){
		super(Constants.SETV.getOpcode(),Constants.SETV.getInfo(),sig,data, sc);
	}
}
