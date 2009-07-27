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
 * The Interface IDataComponent.
 * @author delphino
 */
public interface IDataComponent {

	/**
	 * Initialize. Do some initializing prior to execution. 
	 */
	public void initialize() throws KiemInitializationException;
	
	//
	/**
	 * Wrapup. Do some wrapping-up after execution has finished.
	 */
	public void wrapup() throws KiemInitializationException;

	/**
	 * Checks if is producer. DataComponent is a producer and returns != null
	 * in step method.
	 * 
	 * @return true, if is producer
	 */
	public boolean isProducer();

	/**
	 * Checks if is observer. DataComponent is an Observer and needs a 
	 * parameter != null in step method.
	 * 
	 * @return true, if is observer
	 */
	public boolean isObserver();
	
}
