/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.program.kep;

public class AddrSigWatchInstruction extends AddrSigInstruction {

	Watcher watch;

	public AddrSigWatchInstruction(String id, String name, KepSignal sig,
			Label addr, Watcher watch, SCLine sc) {
		super(id, name, sig, addr, sc);
		this.watch = watch;

	}

	@Override
	public String encode() {
		return "" + super.encode() + watch.encode();
	}

	@Override
	public String toString() {
		return super.toString() + ", " + watch.toString();
	}

	@Override
	public String info() {
		return super.info() + " " + watch.info();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see kasm.classes.Instruction#length()
	 */
	@Override
	public int length() {
		return super.length() + watch.length();
	}

	public void setWatch(Watcher watch) {
		this.watch = watch;
	}

	public Watcher getWatch() {
		return watch;
	}

}
