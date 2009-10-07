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
package de.cau.cs.kieler.krep.evalbench.trace;

/**
 * @author ctr Interface for listeners that are notified when he current trace
 *         is changed
 */
public interface ITraceListener {

	/**
	 * the current trace has changed
	 * 
	 * @param newTrace
	 *            true if the table has changed, false if only the current index
	 *            changed
	 */
	public void traceChanged(boolean newTrace);

}
