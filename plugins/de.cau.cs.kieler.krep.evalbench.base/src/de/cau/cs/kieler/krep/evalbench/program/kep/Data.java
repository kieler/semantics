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

public class Data extends Identifer {

	public Data(String val) throws IllegalArgumentException {
		int value = Integer.parseInt(val.trim());
		if (value > Constants.max_data)
			throw new IllegalArgumentException("Data value (" + value
					+ ") is greater then" + Constants.max_data);
		this.id = value;

	}

	public Data(int val) throws IllegalArgumentException {
		if (val > Constants.max_data)
			throw new IllegalArgumentException("Data value (" + val
					+ ") is greater then" + Constants.max_data);
		this.id = val;

	}

	@Override
	public String toString() {
		return String.valueOf(id);
	}

	public String encode() {
		{
			String result = "";
			if (this.id != null) {
				result = super.encode(Constants.data_width);
			}
			// else while(result.length()<Constants.data_width) result+="0";
			assert result.length() == Constants.data_width : "Opcode length for data should be "
					+ Constants.data_width + " but is " + result.length() + "!";

			return result;
		}
	}

	public String info() {
		StringBuffer result = new StringBuffer();
		while (result.length() < Constants.data_width){
			result.append("N");
		}
		return result.toString();
	}

	public int length() {
		return Constants.data_width;
	}
}
