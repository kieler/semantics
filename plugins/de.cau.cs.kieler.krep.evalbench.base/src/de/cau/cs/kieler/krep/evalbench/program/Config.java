package de.cau.cs.kieler.krep.evalbench.program;

/**
 * @author ctr Configuration of the different processors
 */
public abstract class Config {
	protected enum Kind {
		KEP, KRP, KLP
	}

	protected Kind kind;

	/**
	 * @return true if the current processor is a Lustre processor
	 */
	public boolean isKLP() {
		return kind == Kind.KLP;
	}

	/**
	 * @return true if the current processor is a Kiel Esterel processor
	 */
	public boolean isKEP() {
		return kind == Kind.KEP;
	}

	/**
	 * 
	 * @return true if the current processor is a Multicore reactive processor
	 */
	public boolean isKRP() {
		return kind == Kind.KRP;
	}

}
