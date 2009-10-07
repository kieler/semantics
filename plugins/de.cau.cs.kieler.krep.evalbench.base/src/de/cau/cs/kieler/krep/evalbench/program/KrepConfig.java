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
package de.cau.cs.kieler.krep.evalbench.program;

/**
 * @author ctr configuration of the Kiel Reactive Processor
 * 
 */
public class KrepConfig extends Config {

	private final int cores;

	private final int io;

	private final int regs;

	private final int irom;

	/**
	 * @param kind
	 *            of the processor: KEP, KRP, KLP
	 * @param cores
	 *            number of cores (for KRP)
	 * @param io
	 *            (number of IO signals)
	 * @param regs
	 *            (number of registers)
	 * @param irom
	 *            (size of instruction ROM)
	 */
	public KrepConfig(final int kind, final int cores, final int io,
			final int regs, final int irom) {
		switch (kind) {
		case 0:
			this.kind = Kind.KEP;
			break;
		case 1:
			this.kind = Kind.KRP;
			break;
		case 2:
			this.kind = Kind.KLP;
			break;
		}
		this.cores = cores;
		this.io = io;
		this.regs = regs;
		this.irom = irom;
	}

	/**
	 * @return length of one word
	 */
	public int getLWord() {
		return 32;
	}

	/**
	 * @return number of cores
	 */
	public int getCores() {
		return cores;
	}

	/**
	 * @return number of IO signals
	 */
	public int getIo() {
		return io;
	}

	/**
	 * @return number of registers
	 */
	public int getRegs() {
		return regs;
	}

	/**
	 * @return size of the instruction ROM
	 */
	public int getIrom() {
		return irom;
	}

}
