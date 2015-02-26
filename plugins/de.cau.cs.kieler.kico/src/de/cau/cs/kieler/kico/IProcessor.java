/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;


import org.eclipse.emf.ecore.EObject;

/**
 * Interface for a processor which could run before of after a transformation.
 * 
 * @author cmot
 * @kieler.design 2015-02-11 proposed
 * @kieler.rating 2015-02-11 proposed yellow
 * 
 */
public interface IProcessor {

    /**
     * Must supply a unique ID to identify this transformation.
     * 
     * @return the string
     */
    public String getId();

    // -------------------------------------------------------------------------

    /**
     * Optionally supply a name for this transformation. If null is returned then the id will be
     * used inplace of the name.
     * 
     * @return the string
     */
    public String getName();

    // -------------------------------------------------------------------------

    /**
     * Central transform method that implements the transformation. It should return an EObject if
     * there are any following transformations. A code generation will finally return a String
     * object.
     * 
     * @param eObject
     *            the e object
     * @return the e object
     */
    public Object transform(EObject eObject);

    // -------------------------------------------------------------------------

}
