package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Sustain extends SigDataInstruction {

	public Sustain (KepSignal sig,  SCLine sc){
		super(Constants.SUSTAIN.getOpcode(),Constants.SUSTAIN.getInfo(),sig, sc);
	}
	public Sustain (KepSignal sig,Data data , SCLine sc){
		super(Constants.SUSTAIN.getOpcode(),Constants.SUSTAIN.getInfo(),sig,data, sc);
	}
}
