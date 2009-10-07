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

public class SCLine {

	String content;
	int number;

	// int pos;

	public SCLine(String content, int number, int pos) {
		this.content = content.trim();
		this.number = number;
		// this.pos = pos;
	}

	public SCLine(String content, int number) {
		this.content = content;
		this.number = number;

	}

	public SCLine appendContent(String appendix) {
		this.content += appendix;
		return this;
	}

	public String toString() {
		String result = content;
		while (result.length() < Constants.instr_width)
			result += " ";
		// return "["+number+"]\t"+result;
		return result;
	}

	public String errorMsg() {
		return "In line " + number + ": near \"" + content + "\": ";
	}
}
