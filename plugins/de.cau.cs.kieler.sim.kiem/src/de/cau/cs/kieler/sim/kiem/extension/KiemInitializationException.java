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

package de.cau.cs.kieler.sim.kiem.extension;

/**
 * The Class KiemInitializationException. This exception is used by 
 * DataComponents to flag errors within their initialization() and their
 * wrapup() method during the initialization and wrap-up phase. 
 * If the {@link #mustStop} flag is set to true, then this means 
 * the execution <B>CANNOT</B> been started and the execution manager will
 * not do so if any DataComponent throws an error with this flag.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class KiemInitializationException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8183839879570123277L;

	/** The must stop. */
	private boolean mustStop;
	
	/** The cause of this Exception. */
	private Exception cause;
	
	//-------------------------------------------------------------------------

	/**
	 * Instantiates a new KiemInitializationException.
	 * 
	 * @param message the message of this Exception to display to the user
	 * @param mustStop the must stop flag indicating if the execution must stop
	 * @param cause the cause of this Exception if any, or null otherwise
	 */
	public KiemInitializationException(String message, 
									   boolean mustStop,
									   Exception cause) {
		super(message);
		this.mustStop = mustStop;
		this.cause = cause;
	}

	//-------------------------------------------------------------------------

	/**
	 * Checks if the execution must stop when this Exception occurs.
	 * 
	 * @return true, if execution must stop
	 */
	public boolean isMustStop() {
		return this.mustStop;
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
