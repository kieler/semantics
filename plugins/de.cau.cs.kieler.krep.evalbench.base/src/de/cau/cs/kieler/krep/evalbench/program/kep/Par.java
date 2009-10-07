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

public class Par extends AddrInstruction {
    ThreadID thread;

    public Par(Label addr, ThreadID thread, SCLine sc) {
	super(Constants.PAR.getOpcode(), Constants.PAR.getInfo(), addr, sc);
	this.thread = thread;
    }

    @Override
    public String encode() {
	return "" + super.encode() + thread.encode()
		+ thread.getPrio().encode();
    }

    @Override
    public String info() {
	return super.info() + " " + thread.info() + thread.getPrio().info();
    }

    @Override
    public String toString() {
	return mnemonic + " " + thread.getPrio() + ", " + addr + ", " + thread;
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.Instruction#length()
     */
    @Override
    public int length() {
	return super.length() + thread.length() + thread.getPrio().length();
    }
}
