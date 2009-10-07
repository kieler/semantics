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
 * @author ctr Receive a value
 */
public class Recv extends Statement {

	String name;
	Integer id = 0;
	Integer reg = 0;

	/**
	 * @param name
	 *            name of the register to send
	 */
	public Recv(final String name) {
		super();
		this.name = name;
	}

	@Override
	public int[] getBytes() {
		int b[] = { OPCODE.RECV, reg, id, 0 };
		return b;
	}

	@Override
	public String toString() {
		return "RECV " + reg + " " + id + " (" + name + ")";
	}

	@Override
	public void allocateRegs(Map<String, Integer> regs) {
		reg = regs.size() + 1;
		regs.put(name, reg);
	}

	@Override
	public void setBusID(Map<String, Integer> ids) {
		id = ids.get(name);
		if (id == null) {
			id = ids.size() + 1;
			ids.put(name, id);
		}
	}

}
