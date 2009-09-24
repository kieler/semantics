package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Prio extends Instruction{

	ThreadID thread;

	public Prio(ThreadID thread, SCLine sc){
	super(Constants.PRIO.getOpcode(),Constants.PRIO.getInfo() ,sc);
	this.thread=thread;
	}

	@Override
	public String encode(){
		return ""+super.encode()+thread.encode()+thread.getPrio().encode();
	}

	@Override
	public String toString(){
		return super.toString() + " " + thread.getPrio();
	}

	@Override
	public String info() {
		return super.info()+" "+thread.info() +" "+thread.getPrio().info();
	}

	/* (non-Javadoc)
	 * @see kasm.classes.Instruction#length()
	 */
	@Override
	public int length() {
		return super.length()+thread.length()+thread.getPrio().length();
	}
}
