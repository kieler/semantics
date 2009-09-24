package de.cau.cs.kieler.krep.evalbench.program.kep;


public class AddrSigWatchInstruction extends AddrSigInstruction {

	Watcher watch;

	public AddrSigWatchInstruction(String id, String name, KepSignal sig, Label addr, Watcher watch, SCLine sc) {
		super(id,name,sig,addr,sc);
		this.watch=watch;

	}

	@Override
	public String encode(){
		return ""+super.encode()+watch.encode();
	}
	@Override
	public String toString(){
		return super.toString() +", " + watch.toString();
	}
	@Override
	public String info() {
		return super.info()+" "+watch.info();
	}

	/* (non-Javadoc)
	 * @see kasm.classes.Instruction#length()
	 */
	@Override
	public int length() {
		return super.length()+watch.length();
	}

	public void setWatch(Watcher watch) {
		this.watch = watch;
	}

	public Watcher getWatch() {
		return watch;
	}



}
