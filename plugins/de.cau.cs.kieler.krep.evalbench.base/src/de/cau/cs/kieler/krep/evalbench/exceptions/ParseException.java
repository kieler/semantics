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
package de.cau.cs.kieler.krep.evalbench.exceptions;

/**
 * @author ctr
 * 
 *         Any exception that occurred while Parsing an Assembler file
 */
public class ParseException extends Exception {

	private String cause;

	/**
	 * @param cause
	 *            detailed cause for the exception
	 */
	public ParseException(final String cause) {
		super();
		this.cause = cause;
	}

	@Override
	public String getMessage() {
		return "Parser: " + cause;
	}

	/**
     * 
     */
	private static final long serialVersionUID = 1L;

}
