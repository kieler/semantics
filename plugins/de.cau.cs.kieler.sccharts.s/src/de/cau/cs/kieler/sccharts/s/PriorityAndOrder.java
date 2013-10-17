/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
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
    
    private int priority;
    private int order;

    // Creates a new tuple of priority and order.
    public PriorityAndOrder(int priority, int order) {
        this.priority = priority;
        this.order = order;
    }

    // Creates a new tuple of priority and order as a copy of another tuple.
    public PriorityAndOrder(PriorityAndOrder priorityAndOrder) {
        this.priority = priorityAndOrder.getPriority();
        this.order = priorityAndOrder.getOrder();
    }
    
    // Gets the priority.
    public int getPriority() {
        return priority;
    }

    // Gets the order.
    public int getOrder() {
        return order;
    }
    
    // Increments the priority.
    public PriorityAndOrder incrementPriority() {
        this.priority++;
        return this;
    }

    // Increments the order.
    public PriorityAndOrder incrementOrder() {
        this.order++;
        return this;
    }

}
