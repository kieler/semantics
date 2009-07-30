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
 * The Interface IJSONObjectDataComponent. If the DataComponent extends this
 * extension point it can handle JSON objects in String notation.
 * A JSON implementation for Java that can be found on 
 * {@link "www.json.org/java"}.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public interface IJSONStringDataComponent  {
	
	//-------------------------------------------------------------------------
	
	/**
	 * Step method for a DataObserver and a DataPrroducer.
	 * 
	 * For a producer only the argument will always be null.
	 * For an observer only this method will be called asynchronous. This
	 * may mean that in case the observer is slow, it may be skipped at
	 * some consecutive steps until it becomes ready again. If this is
	 * not desired and the observer *MUST NOT* be skipped, then the
	 * DataComponent should also be a DataProducer but return just null.
	 * 
	 * If an error occurs during the execution of the step method, a
	 * DataComponent should raise a {@link KiemExecutionException} that is
	 * then catched by the execution manager an brought to the user's
	 * attention.
	 * 
	 * @param JSONString the concrete JSONString of input data (if observer) 
	 * 
	 * @return the JSONString with the output data (if producer)
	 * 
	 * @throws KiemExecutionException the kiem execution exception
	 */
	public String step(String JSONString)
										throws KiemExecutionException;   

}
