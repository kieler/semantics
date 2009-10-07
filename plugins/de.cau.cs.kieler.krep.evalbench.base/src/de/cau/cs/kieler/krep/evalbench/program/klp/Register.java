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
package de.cau.cs.kieler.krep.evalbench.program.klp;

import java.util.HashMap;

/**
 * @author ctr Access to a register. Implements Singleton to ensure that all
 *         registers are unique
 */
public class Register {

	/*
	 * private enum Kind { INPUT, OUTPUT, LOCAL, TEMP; }
	 */

	private final String name;

	private static HashMap<String, Register> regs = new HashMap<String, Register>();

	// private boolean isClock;
	// private final Kind kind;

	private final int id; // 

	private Register(final String name) {
		this.name = name;
		// this.isClock = false;
		// this.kind = Kind.TEMP;
		// Reg 0 is always true!
		id = regs.size() + 1;
	}

	/**
	 * @param name
	 *            of the register
	 * @return unique register with this name
	 */
	public static Register get(final String name) {
		Register r = regs.get(name);
		if (r == null) {
			r = new Register(name);
			regs.put(name, r);
		}
		return r;
	}

	/**
	 * @param t
	 *            type of the register
	 */
	/*
	 * public void setType(final Init.Type t) { switch (t) { case C: isClock =
	 * true; break; case V: isClock = false; break; } }
	 */

	/*
	 * public static void allocate(Config conf) { if (conf instanceof
	 * KrepConfig) { KrepConfig c = (KrepConfig) conf; int input = 0; int output
	 * = c.getIo(); int local = output + c.getIo(); int temp = (c.getRegs() -
	 * local)/2; for (Register r : regs.values()) { if(r.kind==null){ r.id =
	 * temp; temp++; }else{ switch (r.kind) { case INPUT: r.id = input; input++;
	 * break; case OUTPUT: r.id = output; input++; break; case LOCAL: r.id =
	 * local; input++; break; } } } }
	 * 
	 * }
	 */

	/**
	 * @return unique id of the register
	 */
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return name;
	}

	/**
	 * remove all registers
	 */
	public static void clear() {
		regs = new HashMap<String, Register>();
	}

	/**
	 * @return number of used registers
	 */
	public static int getMax() {
		return regs.size();
	}
}
