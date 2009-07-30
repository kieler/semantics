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
 * The Class KiemExecutionException. This exception is used by DataComponents
 * to flag errors within their step() method during the execution. If the
 * {@link #mustStop} flag is set to true, then this means the execution
 * *MUST* stop, and will be immediately stopped by the execution manager.
 * Note that the execution manager tries to stop all threads but cannot
 * guarantee that they really terminate (e.g., when a deadlock occurred). 
 * In the latter case there will be zombie threads but the execution manager
 * and the eclipse instance is not affected as long as the left memory
 * is still enough. 
 * 
 * @author Christian Motika <cmot@informatik.uni-kiel.de>
 */
public class KiemExecutionException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1645050957113020503L;
	
	/** The must stop indicating that the execution *MUST* be stopped. */
	private boolean mustStop;
	
	/** The cause of this Exception. */
	private Exception cause;
	
	//-------------------------------------------------------------------------
	
	/**
	 * Instantiates a new kiem execution exception.
	 * 
	 * @param message the message of this Exception to display to the user
	 * @param mustStop the must stop flag indicating if the execution must stop
	 * @param cause the cause of this Exception if any, or null otherwise
	 */
	public KiemExecutionException(String message, 
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
