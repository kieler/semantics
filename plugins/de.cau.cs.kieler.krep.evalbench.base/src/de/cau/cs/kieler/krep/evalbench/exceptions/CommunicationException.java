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
 * Exception used by the communication protocols.
 * 
 * @author msp
 */
public class CommunicationException extends Exception {

	/** The serial version UID */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates a communication exception with given message.
	 * 
	 * @param message
	 *            message to be stored
	 */
	public CommunicationException(String message) {
		super(message);
	}

}
