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
 *         Synchronize with other cores
 */
public class Sync extends Statement {

    @Override
    public int[] getBytes() {
	int[] b = { OPCODE.SYNC, 0, 0, 0 };
	return b;
    }

    @Override
    public String toString() {
	return "SYNC";
    }

    @Override
    public void allocateRegs(Map<String, Integer> regs) {
	// no regs used
    }

}
