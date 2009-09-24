package de.cau.cs.kieler.krep.evalbench.program.kep;



public class Emit extends SigDataInstruction {

	public Emit (KepSignal sig,  SCLine sc){
		super(Constants.EMIT.getOpcode(),Constants.EMIT.getInfo(),sig, sc);
	}
	public Emit (KepSignal sig,Data data , SCLine sc){
		super(Constants.EMIT.getOpcode(),Constants.EMIT.getInfo(),sig,data, sc);
	}
}
