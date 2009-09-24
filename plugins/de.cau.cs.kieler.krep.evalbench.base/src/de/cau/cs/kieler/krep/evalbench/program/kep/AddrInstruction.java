package de.cau.cs.kieler.krep.evalbench.program.kep;


public class AddrInstruction extends Instruction {

	Label addr ;

	public AddrInstruction(String id, String name, Label addr, SCLine sc) {
		super(id,name,sc);
		this.addr = addr;
	}

	@Override
	public String encode(){
		return ""+super.encode()+addr.encode();
	}

	@Override
	public String info() {
		return super.info()+" "+addr.info();
	}
	@Override
	public String toString(){
		return super.toString() + addr.toString() + " ";
	}
	/* (non-Javadoc)
	 * @see kasm.classes.Instruction#length()
	 */
	@Override
	public int length() {
		return super.length()+addr.length();
	}

	public Label getAddr() {
		return addr;
	}

	public void setAddr(Label addr) {
		this.addr = addr;
	}






}
