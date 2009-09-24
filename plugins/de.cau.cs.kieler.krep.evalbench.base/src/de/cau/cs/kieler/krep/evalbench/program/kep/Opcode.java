package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Opcode {

	String opcode;
	String info;

	public Opcode(String opcode,String info){
		assert (opcode.length()==Constants.id_width) : "Opcode length is"+opcode.length()+"but should be"+Constants.id_width+"!";
		this.opcode=opcode;
		this.info=info;
	}

	public String getInfo() {
		return info;
	}

	public String getOpcode() {
		return opcode;
	}

}
