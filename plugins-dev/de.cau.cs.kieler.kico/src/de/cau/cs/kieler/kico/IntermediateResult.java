/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;

import java.util.LinkedList;
import java.util.List;

/**
 * This class holds information about the intermediate results and the transformation or process
 * leading to this intermediate result together with performance measurements.
 * 
 * @kieler.design 2015-03-09 proposed
 * @kieler.rating 2015-03-09 proposed yellow
 * @author cmot
 * 
 */
public abstract class IntermediateResult {

    /** The id of the intermediate result. */
    private String id;

    /** The duration it took to produce it. */
    private long duration;

    /** The result of the intermediate result. */
    private Object result;
    
    /** The list of sub intermediate results this intermediate result consists of, may be an empty list. */
    private List<IntermediateResult> subIntermediateResults = new LinkedList<IntermediateResult>();

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new empty intermediate result.
     */
    public IntermediateResult() {
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new intermediate result.
     * 
     * @param id
     *            the id
     * @param result
     *            the result
     * @param duration
     *            the duration
     */
    public IntermediateResult(String id, Object result, long duration) {
        this.id = id;
        this.result = result;
        this.duration = duration;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the id of the intermediate result.
     * 
     * @param id
     *            the new id
     */
    public void setId(String id) {
        this.id = id;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the result of the intermediate result.
     * 
     * @param result
     *            the new result
     */
    public void setResult(Object result) {
        this.result = result;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the duration it took to produce the intermediate result.
     * 
     * @param duration
     *            the new duration
     */
    public void setDuration(long duration) {
        this.duration = duration;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the result of the intermediate result.
     * 
     * @return the result
     */
    public Object getResult() {
        return result;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the id of the intermediate result.
     * 
     * @return the id
     */
    public String getId() {
        return id;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the duration it took to produce the intermediate result.
     * 
     * @return the duration
     */
    public long getDuration() {
        return duration;
    }

    // -------------------------------------------------------------------------

    /**
     * Adds a sub intermediate result.
     *
     * @param intermediateResult the intermediate result
     */
    public void addSubIntermediateResult(IntermediateResult intermediateResult) {
        subIntermediateResults.add(intermediateResult);
    }

    // -------------------------------------------------------------------------

    /**
     * Adds an sub intermediate result.
     *
     * @return the sub intermediate results
     */
    public List<IntermediateResult> getSubIntermediateResults() {
        return subIntermediateResults;
    }

    // -------------------------------------------------------------------------
    
}
