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
package de.cau.cs.kieler.krep.evalbench.comm;

/**
 * Listener for communication events which occur when data is sent or received.
 * 
 * @author msp
 */
public interface ICommunicationListener {

	/**
	 * Executed when data is sent to the target.
	 * 
	 * @param data
	 */
	public void dataSent(String data);

	/**
	 * Executed when data is received from the target.
	 * 
	 * @param data
	 */
	public void dataReceived(String data);

}
