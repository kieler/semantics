/*
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
 */

package de.cau.cs.kieler.sim.kiem.extension;

import de.cau.cs.kieler.sim.kiem.json.*;

/**
 * The Interface IJSONObjectDataComponent. If the DataComponent extends this
 * extension point it can handle JSONObject of the concrete Java
 * JSON implementation that can be found on {@link "www.json.org/java"}.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public interface IJSONObjectDataComponent  {
	
	//-------------------------------------------------------------------------
	
	/**
	 * Step method for a DataObserver and a DataPrroducer.
	 * <BR><BR>
	 * For a producer only the argument will always be null.
	 * For an observer only this method will be called asynchronous. This
	 * may mean that in case the observer is slow, it may be skipped at
	 * some consecutive steps until it becomes ready again. If this is
	 * not desired and the observer <B>MUST NOT</B> be skipped, then the 
	 * DataComponent should also be a DataProducer but return just null.
	 * <BR><BR>
	 * If an error occurs during the execution of the step method, a
	 * DataComponent should raise a {@link KiemExecutionException} that is
	 * then catched by the execution manager an brought to the user's 
	 * attention.
	 * 
	 * @param JSONobject the concrete JSONObject of input data (if observer) 
	 * 
	 * @return the JSONObject with the output data (if producer)
	 * 
	 * @throws KiemExecutionException a KiemExecutionException
	 */
	public JSONObject step(JSONObject JSONobject)
										throws KiemExecutionException;

}
