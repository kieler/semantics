/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * @author cmot
 * @kieler.design 2014-03-11 proposed
 * @kieler.rating 2014-03-11 proposed yellow
 * 
 */
public interface ITransformation {

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
     * Optionally supply a list of transformation IDs whose features this transformation produces.
     * This means that for a full compilation these features must be transformed afterwards. Be
     * advised to use the minimal set of transformation IDs here. Transformations specified here
     * will be forced to run afterwards. If null is returned then this means there are no produces
     * dependencies.
     * 
     * @return the list
     */
    public List<String> getProducesDependencies();

    // -------------------------------------------------------------------------

    /**
     * Optionally supply a list of transformation IDs whose features cannot be handled by this
     * transformation. Be advised to use the minimal set of transformation IDs here. Transformations
     * specified here will be forced to run before. If null is returned then this means there are no
     * not handles dependencies.
     * 
     * @return the list
     */
    public List<String> getNotHandlesDependencies();

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

    /**
     * Define a list of post processor IDs that can or must run in the defined order AFTER this
     * transformation is applied. If null is returned then no post processors should run.
     * 
     * @return the list
     */
    public List<ProcessorOption> postProcessors();

    // -------------------------------------------------------------------------

    /**
     * Define a list of pre processor IDs that can or must run in the defined order BEFORE the
     * transformation is applied. If null is returned then no post processors should run.
     * 
     * @return the list
     */
    public List<ProcessorOption> preProcessors();

}
