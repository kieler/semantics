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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * This class is the extended version of the transformation result including intermediate results
 * and all processed transformation IDs. By convention the first intermediate result should always
 * be the source model.
 * 
 * @author cmot
 * @kieler.design 2014-05-21 proposed
 * @kieler.rating 2014-05-21 proposed yellow
 * 
 */
public class CompilationResult {

    private List<String> transformations = new ArrayList<String>();

    private List<Object> intermediateResults = new ArrayList<Object>();

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new compilation result. By convention the first intermediate 
     * result should always be the source model.
     * 
     * @param sourceModel
     *            the source model
     */
    public CompilationResult(EObject sourceModel) {
        intermediateResults.add(sourceModel);
    }

    // -------------------------------------------------------------------------

    /**
     * Access all intermediate results.
     * 
     * @return the intermediate results
     */
    public List<Object> getIntermediateResults() {
        return intermediateResults;
    }

    // -------------------------------------------------------------------------

    /**
     * Access the processed transformations in order.
     * 
     * @return the transformations
     */
    public List<String> getTransformations() {
        return transformations;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the last transformation result as an Object. Returns null if there is no transformation
     * result at all.
     * 
     * @return the e object
     */
    public Object getObject() {
        if (intermediateResults.size() > 0) {
            Object lastResult = intermediateResults.get(intermediateResults.size() - 1);
            return lastResult;
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the last transformation result as an EObject. Returns null if there is no transformation
     * result at all or if the last transformation result is not an EObject.
     * 
     * @return the EObject
     */
    public EObject getEObject() {
        Object lastResult = getObject();
        if (lastResult instanceof EObject) {
            return (EObject) lastResult;
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the last transformation result as an EObject. Returns null if there is no transformation
     * result at all or if the last transformation result is not an EObject.
     * 
     * @return the String
     */
    public String getString() {
        Object lastResult = getObject();
        if (lastResult instanceof String) {
            return (String) lastResult;
        }
        return null;
    }

    // -------------------------------------------------------------------------

}
