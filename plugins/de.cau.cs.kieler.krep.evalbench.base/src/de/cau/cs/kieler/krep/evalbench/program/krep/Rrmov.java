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
package de.cau.cs.kieler.krep.evalbench.program.krep;

import java.util.Map;

/**
 * @author ctr
 * 
 *         Register to register move
 */
public class Rrmov extends Statement {

	String to, from;

	Integer R_to = 0, R_from = 0;

	/**
	 * @param to
	 *            name of the target register
	 * @param from
	 *            name of the source register
	 */
	public Rrmov(String to, String from) {
		super();
		this.to = to;
		this.from = from;
	}

	@Override
	public void allocateRegs(Map<String, Integer> regs) {
		R_to = regs.get(to);
		if (R_to == null) {
			R_to = regs.size() + 1;
			regs.put(to, R_to);
		}
		R_from = regs.get(from);
		if (R_from == null) {
			R_from = regs.size() + 1;
			regs.put(from, R_from);
		}
	}

	@Override
	public int[] getBytes() {
		int[] b = { OPCODE.RRMOV, R_to, R_from, 0 };
		return b;
	}

	@Override
	public String toString() {
		return "RRMOV " + R_to + " " + R_from + " (" + to + "<-" + from + ")";
	}

}
