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

import java.util.Iterator;

/**
 * A AbstactCollection as a basic implementation for lists, queues and more.
 * 
 * @author mhei
 * 
 * @param <T>
 */
public abstract class AbstractCollection<T> implements Iterable<T> {

    /**
     * The left sentinel of the collection. Just the container you usually start with itterating the
     * collection.
     */
    // SUPPRESS CHECKSTYLE NEXT VisibilityModifierCheck
    protected ContainerWithLink<T> leftSentinel;

    /**
     * The last container of the collection.
     */
    // SUPPRESS CHECKSTYLE NEXT VisibilityModifierCheck
    protected ContainerWithLink<T> lastContainer;

    /**
     * The size of the collection.
     */
    // SUPPRESS CHECKSTYLE NEXT VisibilityModifierCheck
    protected int size;

    /**
     * Cursor used to iterate through a collection.
     */
    // SUPPRESS CHECKSTYLE NEXT VisibilityModifierCheck
    protected ContainerWithLink<T> cursor;

    /**
     * Creates a empty AbstactCollection. Because of the reason this class is abstract this is
     * constructor normally used with super().
     */
    public AbstractCollection() {
        leftSentinel = new ContainerWithLink<T>(null, null);
        lastContainer = leftSentinel;
        cursor = leftSentinel;
        size = 0;
    }

    /**
     * Deletes all elements of the collection.
     */
    public void clear() {
        leftSentinel.setSuccessor(null);
        lastContainer = leftSentinel;
        cursor = leftSentinel;
        size = 0;
    }

    /**
     * Gives you an iterator of the collection.
     * 
     * @return the iterator of the collection
     */
    public Iterator<T> iterator() {
        return new Iter();
    }

    /**
     * Tests if the collection is empty.
     * 
     * @return <code>true</code> if empty else <code>false</code>.
     */
    public boolean isEmpty() {
        return leftSentinel == lastContainer;
    }

    /**
     * Tests if a given element is part of the collection. For this the method <code>equals</code>
     * is used.
     * 
     * @param o
     *            The element to test if it is part of the collection.
     * @return <code>true</code> if the given element is part of the collection else
     *         <code>false</code>.
     */
    public boolean contains(final T o) {
        for (T item : this) {
            if (item.equals(o)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Removes a given element from the collection.
     * 
     * @param o
     *            The element that shoud be removed.
     * @return Returns <code>true</code> if the element was in the collection and could be removed.
     */
    public boolean remove(final T o) {
        Iterator<T> myIter = iterator();
        T item;
        while (myIter.hasNext()) {
            item = myIter.next();
            if (item.equals(o)) {
                myIter.remove();
                return true;
            }
        }
        return false;
    }

    /**
     * Adds a given element to the collection.
     * 
     * @param o
     *            The element to add.
     */
    public abstract void add(T o);

    /**
     * Returns the size of the collection.
     * 
     * @return The size of the collection.
     */
    public int size() {
        return size;
    }

    /**
     * The iterator of the collection.
     * 
     */
    private final class Iter implements Iterator<T> {
        private Iter() {
            cursor = null;
        }

        public boolean hasNext() {
            if (isEmpty()) {
                // is the queue is empty we have no next element
                return false;

                // a other way to return true or false does not make it simpler in any way.
                // SUPPRESS CHECKSTYLE NEXT SimplifyBooleanReturn
            } else if (cursor != null && cursor.getSuccessor() == lastContainer) {
                // The cursor is only null if we did not start to iterate with
                // next(). So if the cursor is null and the queue is not empty (
                // the
                // first if) there must be next element. If not we just have to
                // check if the successor is the back of the queue.
                return false;
            } else {
                return true;
            }
        }

        public T next() {
            if (cursor == null) {
                cursor = leftSentinel;
            } else {
                cursor = cursor.getSuccessor();
            }
            return cursor.getSuccessor().getItem();
        }

        public void remove() {
            if (cursor.getSuccessor() == lastContainer) {
                lastContainer = cursor;
                size--;
            } else if (cursor.getSuccessor() != null) {
                cursor.setSuccessor(cursor.getSuccessor().getSuccessor());
                size--;
            }
        }
    }
}
