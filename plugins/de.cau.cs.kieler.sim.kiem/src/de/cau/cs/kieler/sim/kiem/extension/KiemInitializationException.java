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

// TODO: Auto-generated Javadoc
/**
 * The Class KiemInitializationException.
 * 
 * @author Christian Motika <cmot@informatik.uni-kiel.de>
 */
public class KiemInitializationException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8183839879570123277L;

	/** The must stop. */
	private boolean mustStop;
	
	/**
	 * Instantiates a new kiem initialization exception.
	 * 
	 * @param message the message
	 * @param mustStop the must stop
	 */
	public KiemInitializationException(String message, boolean mustStop) {
		super(message);
		this.mustStop = mustStop;
	}

	/**
	 * Checks if is must stop.
	 * 
	 * @return true, if is must stop
	 */
	public boolean isMustStop() {
		return this.mustStop;
	}

}
