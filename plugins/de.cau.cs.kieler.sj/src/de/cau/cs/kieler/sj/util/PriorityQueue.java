/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sj.util;

/**
 * A simple PriorityQueue how we need them for SJ.
 * 
 * @author mhei
 * 
 * @param <T>
 *            The type of the element inserts into the list.
 */
public class PriorityQueue<T extends Comparable<T>> extends AbstractCollection<T> {

    /**
     * Creates a new empty PriorityQueue.
     */
    public PriorityQueue() {
        super();
    }

    /**
     * Return the first value of the queue.
     * 
     * @return The first value of the queue.
     * @see #poll()
     */
    public T peek() {
        return leftSentinel.getSuccessor().getItem();
    }

    /**
     * Return and delete the first value of the queue.
     * 
     * @return The first value of the queue.
     * @see #peek()
     */
    public T poll() {
        // get return value
        T retVal = peek();
        // delete return value
        if (leftSentinel.getSuccessor() == lastContainer) {
            lastContainer = leftSentinel;
        } else if (leftSentinel.getSuccessor() != null) {
            leftSentinel.setSuccessor(leftSentinel.getSuccessor().getSuccessor());
        }
        return retVal;
    }

    @Override
    public void add(final T o) {
        cursor = leftSentinel;
        addItem(o);
    }

    private void addItem(final T o) {
        if (cursor == lastContainer) {
            cursor.insertAfter(o);
            lastContainer = cursor.getSuccessor();
            size++;
        } else if (cursor.getSuccessor().getItem().compareTo(o) > 0) {
            cursor.insertAfter(o);
            size++;
        } else {
            cursor = cursor.getSuccessor();
            addItem(o);
        }
    }
}
