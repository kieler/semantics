/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.program.kep;

public class PrioID extends Identifer {

	public PrioID(int val) throws IllegalArgumentException {

		if (val > Constants.max_prio)
			throw new IllegalArgumentException("Prio ID (" + val
					+ ") is greater then " + Constants.max_prio);
		this.id = val;

	}

	public String encode() {
		{
			String result = "";
			if (this.id != null) {
				result = super.encode(Constants.prio_width);
			}

			assert result.length() == Constants.prio_width : "Opcode length for prio should be "
					+ Constants.prio_width + " but is " + result.length() + "!";

			return result;
		}

	}

	public String toString() {
		return String.valueOf(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see kasm.classes.Identifer#info()
	 */
	@Override
	public String info() {
		StringBuffer result = new StringBuffer();
		while (result.length() < Constants.prio_width)
			result.append("p");
		return result.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see kasm.classes.Identifer#length()
	 */
	@Override
	public int length() {
		return Constants.prio_width;
	}

}
