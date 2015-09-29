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

import de.cau.cs.kieler.sccharts.State;

/**
 * This class holds a dependency representation of an SCCharts State.
 * 
 * @author cmot
 * @kieler.design 2013-10-10 proposed
 * @kieler.rating 2013-10-10 proposed yellow
 * 
 */
public class DependencyNode {

    /** The state. */
    private State state;

    /** The isJoin flag indicating a hierarchical state's join representation. */
    private boolean isJoin;

    /** The priority. */
    private int priority;

    /** The order. */
    private int order;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new dependency node representing an SCCharts state. If the state is
     * hierarchical then there should be two representing dependency nodes, one with isJoin set to
     * false and another one with isJoin set to true.
     */
    public DependencyNode() {
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new dependency node liked to an SCCharts state.
     * 
     * @param state
     *            the state
     */
    public DependencyNode(State state) {
        this.state = state;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the SCCharts state.
     * 
     * @return the state
     */
    public State getState() {
        return state;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the SCCharts state.
     * 
     * @param state
     *            the new state
     */
    public void setState(State state) {
        this.state = state;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the flag indicating that this represents the join part of a hierarchical SCCharts state.
     * 
     * @param isJoin
     *            the new checks if is join
     */
    public void setIsJoin(boolean isJoin) {
        this.isJoin = isJoin;
    }

    // -------------------------------------------------------------------------

    /**
     * Returns true iff this represents the join part of a hierarchical SCCharts state.
     * 
     * @return the checks if is join
     */
    public boolean getIsJoin() {
        return this.isJoin;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the calculated priority for the dependency node and its represented SCCharts state.
     * 
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the calculated priority for the dependency node and its represented SCCharts state.
     * 
     * @param priority
     *            the new priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the calculated order for the dependency node and its represented SCCharts state.
     * 
     * @return the order
     */
    public int getOrder() {
        return order;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the calculated order for the dependency node and its represented SCCharts state.
     * 
     * @param order
     *            the new order
     */
    public void setOrder(int order) {
        this.order = order;
    }

    // -------------------------------------------------------------------------

}
