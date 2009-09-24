package de.cau.cs.kieler.krep.evalbench.program.kep;



public class Join extends Instruction{

	PrioID prio;

	public Join(PrioID prio, SCLine sc){
	super(Constants.JOIN.getOpcode(),Constants.JOIN.getInfo() ,sc);
	this.prio=prio;
	}
	@Override
	public String encode(){
		return ""+super.encode()+prio.encode();

	}
	@Override
	public String toString(){
		return ""+super.toString()+" "+prio.toString();
	}
	@Override
	public String info() {
		return super.info()+" "+prio.info();
	}

	/* (non-Javadoc)
	 * @see kasm.classes.Instruction#length()
	 */
	@Override
	public int length() {
		return super.length()+prio.length();
	}
}
