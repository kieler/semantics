/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.s;

/**
 * This class holds a dependency between an SCCharts State and another SCCharts State.
 * 
 * @author cmot
 * @kieler.design 2013-10-10 proposed
 * @kieler.rating 2013-10-10 proposed yellow
 * 
 */
public abstract class Dependency {

    /** The state dependeing. */
    private DependencyNode stateDependeing;

    /** The state to depend on. */
    private DependencyNode stateToDependOn;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new dependency edge between two dependency nodes each representing an SCCharts
     * state.
     */
    public Dependency() {
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new dependency edge between two dependency nodes each representing an SCCharts
     * state.
     * 
     * @param stateDependeing
     *            the state dependeing
     * @param stateToDependOn
     *            the state to depend on
     */
    public Dependency(DependencyNode stateDependeing, DependencyNode stateToDependOn) {
        this.stateDependeing = stateDependeing;
        this.stateToDependOn = stateToDependOn;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the dependency node that is depending on another dependency node.
     * 
     * @return the state depending
     */
    public DependencyNode getStateDepending() {
        return stateDependeing;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the dependency node that this dependency node depends on.
     * 
     * @return the state to depend on
     */
    public DependencyNode getStateToDependOn() {
        return stateToDependOn;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the dependency node that is depending on another dependency node.
     * 
     * @param stateDependeing
     *            the new state depending
     */
    public void setStateDepending(DependencyNode stateDependeing) {
        this.stateDependeing = stateDependeing;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the dependency node that this dependency node depends on.
     * 
     * @param stateToDependOn
     *            the new state to depend on
     */
    public void setStateToDependOn(DependencyNode stateToDependOn) {
        this.stateToDependOn = stateToDependOn;
    }

    // -------------------------------------------------------------------------
}
