/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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

package de.cau.cs.kieler.sim.kiem.extension;

/**
 * The Class KiemMasterException. This Exception is thrown by the 
 * DataComponent implementation if a non-master DataComponent tries
 * to access the master~ methods.
 * 
 * @author Christian Motika <cmot@informatik.uni-kiel.de>
 */
public class KiemMasterException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1645050957113020503L;
	
	/** The cause of this Exception. */
	private Exception cause;
	
	//-------------------------------------------------------------------------

	/**
	 * Instantiates a new kiem master exception.
	 * 
	 * @param message the message of this Exception to display to the user
	 * @param cause the cause of this Exception if any, or null otherwise
	 */
	public KiemMasterException(String message,
							   Exception cause) {
		super(message);
		this.cause = cause;
	}

	//-------------------------------------------------------------------------
	
	/**
	 * Gets the cause of this Exception.
	 * 
	 * @return the cause of this Exception, if any
	 */
	public Exception getCause() {
		return cause;
	}

}
