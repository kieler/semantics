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

public class RegisterDataInst extends RegisterInst {

	Data data;

	public RegisterDataInst(String id, String name, Register target, Data data,
			SCLine sc) {
		super(id, name, target, sc);
		this.data = data;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see kasm.classes.RegisterExp#info()
	 */
	@Override
	public String info() {
		return super.info() + " " + data.info();
	}

	@Override
	public String toString() {
		return "" + super.toString() + ", #" + data.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see kasm.classes.RegisterExp#length()
	 */
	@Override
	public int length() {
		return super.length() + data.length();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see kasm.classes.RegisterExp#encode()
	 */
	@Override
	public String encode() {
		return super.encode() + data.encode();
	}

}
