package de.cau.cs.kieler.krep.evalbench.program.kep;




public class Clrc extends Instruction{

	public Clrc(SCLine sc){
	super(Constants.CAWAITS.getOpcode(),Constants.CAWAITS.getInfo() ,sc);
	}
}
