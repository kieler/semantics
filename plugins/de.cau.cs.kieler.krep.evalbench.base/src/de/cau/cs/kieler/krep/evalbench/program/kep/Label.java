package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Label extends Identifer {
	int line;
	public Label(String name, Integer addr,int line) {
		super(name, addr);
		this.line=line;
	}

	public Label(String name, Integer addr) {
		super(name, addr);

	}

	public String toString(){
		return name;
	}

	public String encode(){
		return super.encode(Program.constants.addr_width);
	}

	public String info() {
		String  result ="";
		while (result.length()<Program.constants.addr_width) result+="A";
		return result;
	}
	public String print(){
		return super.print()+"\t["+this.line+"]";
	}
	
	public String printLabel(){
		String result =name;
		while (result.length()<Constants.max_LabelPrint) result+=" ";
		return result;
	}

	public int length(){
		return Program.constants.addr_width;
	}
}
