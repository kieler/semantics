/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem;

/**
 * The Interface IJSONObjectDataComponent. If the DataComponent extends this extension point it can
 * handle JSON objects in String notation. A JSON implementation for Java that can be found on
 * {@link "www.json.org/java"}.
 * 
 * @author cmot
 * @kieler.design 2009-12-08
 * @kieler.rating 2010-01-15 yellow
 * 
 */
public interface IJSONStringDataComponent {

    // -------------------------------------------------------------------------

    /**
     * Step method for a DataObserver and a DataProducer. <BR>
     * <BR>
     * For a producer only the argument will always be null. For an observer only this method will
     * be called asynchronous. This may mean that in case the observer is slow, it may be skipped at
     * some consecutive steps until it becomes ready again. If this is not desired and the observer
     * <B>MUST NOT</B> be skipped, then the DataComponent should also be a DataProducer but return
     * just null. <BR>
     * <BR>
     * If an error occurs during the execution of the step method, a DataComponent should raise a
     * {@link KiemExecutionException} that is then catched by the execution manager an brought to
     * the user's attention.
     * 
     * @param jSONString
     *            the concrete JSONString of input data (if observer)
     * 
     * @return the JSONString with the output data (if producer)
     * 
     * @throws KiemExecutionException
     *             a KiemExecutionException
     */
    String step(String jSONString) throws KiemExecutionException;

}
