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
 * A subset of a classical LinkedList. Should be fast and use less resources.
 * 
 * @author mhei
 * 
 * @param <T>
 *            The type of the elements insert into the list.
 */
public class LinkedList<T> extends AbstractCollection<T> {

    /**
     * Creates a new and empty LinkedList.
     */
    public LinkedList() {
        super();
    }

    /**
     * Adds a given object into the list. The object must be from the same type as the class param.
     * 
     * @param o
     *            The object to add to the list.
     * 
     */
    public void add(final T o) {
        leftSentinel.insertAfter(o);
        size++;
        if (leftSentinel == lastContainer) {
            lastContainer = leftSentinel.getSuccessor();
        }
    }
}
