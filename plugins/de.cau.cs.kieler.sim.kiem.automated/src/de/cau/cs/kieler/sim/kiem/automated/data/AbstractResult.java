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

package de.cau.cs.kieler.sim.kiem.automated.data;

import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * An abstract result. It has a list of resulting values and can have a list of
 * children results to implement a tree structure.
 * 
 * @author soh
 * @kieler.rating 2010-01-29 proposed yellow
 */
public abstract class AbstractResult {

    /** Start tag for the the entire result. */
    private static final String RESULT_START_TAG = "<RESULT>";
    /** End tag for the the entire result. */
    private static final String RESULT_END_TAG = "</RESULT>";
    /** Start tag for the list of results inside a parent result. */
    private static final String RESULTS_START_TAG = "<RESULTS>";
    /** End tag for the list of results inside a parent result. */
    private static final String RESULTS_END_TAG = "</RESULTS>";
    /** Start tag for a single property. */
    private static final String PROPERTY_START_TAG = "<PROPERTY>";
    /** End tag for a single property. */
    private static final String PROPERTY_END_TAG = "</PROPERTY>";
    /** Start tag for the list of children results. */
    private static final String CHILDREN_START_TAG = "<CHILDREN>";
    /** End tag for the list of children results. */
    private static final String CHILDREN_END_TAG = "</CHILDREN>";

    // --------------------------------------------------------------------------

    /** A list of children result, may be null. */
    private List<AbstractResult> children;

    /** A list of results, may be null. */
    private List<KiemProperty> results;

    // --------------------------------------------------------------------------

    /**
     * 
     */
    public AbstractResult() {

    }

    // --------------------------------------------------------------------------

    /**
     * Add a new child.
     * 
     * @param child
     *            the child to add
     */
    public void addChild(final AbstractResult child) {
        if (this.children == null) {
            this.children = new LinkedList<AbstractResult>();
        }
        this.children.add(child);
    }

    /**
     * Getter for the list of children.
     * 
     * @return the children
     */
    public List<AbstractResult> getChildren() {
        return children;
    }

    // --------------------------------------------------------------------------

    /**
     * Add a new result.
     * 
     * @param result
     *            the result to add.
     */
    public void addResult(final KiemProperty result) {
        if (this.results == null) {
            this.results = new LinkedList<KiemProperty>();
        }
        this.results.add(result);
    }

    /**
     * Getter for the list of results.
     * 
     * @return the results
     */
    public List<KiemProperty> getResults() {
        return results;
    }

    /**
     * Set the list of results.
     * 
     * @param resultsParam
     *            the new list of results.
     */
    public void setResults(final List<KiemProperty> resultsParam) {
        this.results = resultsParam;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(RESULT_START_TAG);

        if (results != null && !results.isEmpty()) {
            result.append(RESULTS_START_TAG);

            for (KiemProperty prop : results) {
                result.append(PROPERTY_START_TAG);
                result.append(prop.getKey() + "," + prop.getValue());
                result.append(PROPERTY_END_TAG);
            }

            result.append(RESULTS_END_TAG);
        }

        if (children != null && !children.isEmpty()) {
            result.append(CHILDREN_START_TAG);

            for (AbstractResult child : children) {
                result.append(child.toString());
            }

            result.append(CHILDREN_END_TAG);
        }
        result.append(RESULT_END_TAG);

        return result.toString();
    }
}
