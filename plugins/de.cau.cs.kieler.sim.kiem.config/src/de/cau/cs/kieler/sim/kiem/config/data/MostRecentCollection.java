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

package de.cau.cs.kieler.sim.kiem.config.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/**
 * <p>
 * This implements a collection that can update according to most recent use.
 * New items will be added at index 0 and all items already in it will be pushed
 * down. The oldest item may be deleted if the list is already at capacity.
 * </p>
 * <p>
 * If an item is added that is already in the list it will be moved to the top
 * of the list.
 * </p>
 * <p>
 * Removing an item from the list has the same behavior as in a normal linked
 * list.
 * </p>
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 * 
 * @param <T>
 *            The type of the items contained in the list.
 */
public class MostRecentCollection<T> implements Collection<T>, RandomAccess,
        Cloneable, Serializable {

    /** Id for serialization. */
    private static final long serialVersionUID = 2058407694657397097L;

    /** The default capacity for the list. */
    private static final int DEFAULT_CAPACITY = 10;

    /** Maximum capacity of the list. */
    private int capacity;

    /** The data in the list. */
    private List<T> data;

    // --------------------------------------------------------------------------

    /**
     * Creates a new list with default capacity 10.
     */
    public MostRecentCollection() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Create a new list.
     * 
     * @param newCapacity
     *            the maximum capacity of the list.
     */
    public MostRecentCollection(final int newCapacity) {
        this.capacity = newCapacity;
        data = new ArrayList<T>(capacity);
    }

    /**
     * Creates a new handler for a given list.
     * 
     * @param list
     *            the new list
     * @param capacityParam
     *            the maximum capacity of the list
     */
    public MostRecentCollection(final List<T> list, final int capacityParam) {
        this.data = list;
        this.capacity = capacityParam;
    }

    // --------------------------------------------------------------------------

    /**
     * Add an item at the top of the list and move all other items down one
     * index. If the list grows beyond the predefined capacity the last element
     * is deleted.
     * 
     * @param item
     *            the item to push.
     */
    private void pushItem(final T item) {
        if (!isEmpty()) {
            // add the last item in the list to the end of it
            data.add(data.get(data.size() - 1));
            // move all items down one index
            for (int i = size() - 2; i > 0; i--) {
                data.set(i, data.get(i - 1));
            }
            // add the new item at the front of the list
            data.set(0, item);
            // remove last item if list is at capacity
            if (data.size() > capacity) {
                data.remove(data.size() - 1);
            }
        } else {
            data.add(item);
        }
    }

    /**
     * <p>
     * Add a new item to the head of the list.
     * </p>
     * <p>
     * If the list already contains the new item it will be moved to the head
     * and the rest of the list pushed down.
     * </p>
     * 
     * @param e
     *            the new element
     * @return true if the element was added successfully
     */
    public boolean add(final T e) {
        if (data.contains(e)) {
            data.remove(e);
        }
        pushItem(e);
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean addAll(final Collection<? extends T> c) {
        for (T e : c) {
            add(e);
        }
        return true;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void clear() {
        data = new ArrayList<T>(capacity);
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean contains(final Object o) {
        return data.contains(o);
    }

    /**
     * {@inheritDoc}
     */
    public boolean containsAll(final Collection<?> c) {
        return data.containsAll(c);
    }

    // --------------------------------------------------------------------------

    /**
     * Get the element at the specified index.
     * 
     * @param index
     *            index of the element to get.
     * @return the element at the specified index.
     */
    public T get(final int index) {
        return data.get(index);
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Iterator<T> iterator() {
        return data.iterator();
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean remove(final Object o) {
        if (data.contains(o)) {
            data.remove(o);
            return true;
        }
        return false;

    }

    /**
     * {@inheritDoc}
     */
    public boolean removeAll(final Collection<?> c) {
        boolean result = data.removeAll(c);
        return result;
    }

    /**
     * {@inheritDoc}
     */
    public boolean retainAll(final Collection<?> c) {
        boolean result = data.retainAll(c);
        return result;
    }

    // --------------------------------------------------------------------------

    /**
     * Replaces the given element with the new one.
     * 
     * @param oldElement
     *            the element to be replaced
     * @param newElement
     *            the replacement element
     */
    public void replace(final T oldElement, final T newElement) {
        int index = data.indexOf(oldElement);
        if (index != -1) {
            data.set(index, newElement);
        }
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public int size() {
        return data.size();
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Object[] toArray() {
        return data.toArray();
    }

    /**
     * {@inheritDoc}
     */
    public <Type> Type[] toArray(final Type[] a) {
        return data.toArray(a);
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return data.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MostRecentCollection<T> clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MostRecentCollection<T> result = new MostRecentCollection<T>(capacity);
        for (T element : data) {
            result.data.add(element);
        }
        return result;
    }
}
