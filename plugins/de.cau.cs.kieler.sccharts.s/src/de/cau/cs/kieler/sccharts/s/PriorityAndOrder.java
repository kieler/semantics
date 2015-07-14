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
 * This class holds a tuple of priority and order integers.
 * 
 * @author cmot
 * @kieler.design 2013-10-10 proposed
 * @kieler.rating 2013-10-10 proposed yellow
 * 
 */
public class PriorityAndOrder {

    /** The priority. */
    private int priority;

    /** The order. */
    private int order;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new tuple of priority and order.
     * 
     * @param priority
     *            the priority
     * @param order
     *            the order
     */
    public PriorityAndOrder(int priority, int order) {
        this.priority = priority;
        this.order = order;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new tuple of priority and order as a copy of another tuple.
     * 
     * @param priorityAndOrder
     *            the priority and order
     */
    public PriorityAndOrder(PriorityAndOrder priorityAndOrder) {
        this.priority = priorityAndOrder.getPriority();
        this.order = priorityAndOrder.getOrder();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the priority.
     * 
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the order.
     * 
     * @return the order
     */
    public int getOrder() {
        return order;
    }

    // -------------------------------------------------------------------------

    /**
     * Increments the priority.
     * 
     * @return the priority and order
     */
    public PriorityAndOrder incrementPriority() {
        this.priority++;
        return this;
    }

    // -------------------------------------------------------------------------

    /**
     * Increments the order.
     * 
     * @return the priority and order
     */
    public PriorityAndOrder incrementOrder() {
        this.order++;
        return this;
    }

    // -------------------------------------------------------------------------
    
    /**
     * Sets the order.
     *
     * @param order the new order
     */
    public void setOrder(int order) {
        this.order = order;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the priority.
     *
     * @param priority the new priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    // -------------------------------------------------------------------------
}
