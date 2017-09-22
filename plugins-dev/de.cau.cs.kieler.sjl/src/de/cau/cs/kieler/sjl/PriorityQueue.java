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
package de.cau.cs.kieler.sjl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

/**
 * Fast and simple priority queue implementation (KISS principle).
 * 
 * @author cmot
 * @kieler.design 2013-05-23 proposed cmot
 * @kieler.rating 2013-05-23 proposed *
 */
public class PriorityQueue<T> implements Cloneable {

    public int maxPrio;
    public T firstElement;
    public int firstPrio = -1;
    public T[] elements;
    public int size;
    public Hashtable<T, Integer> elements2prio;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new priority queue. Unchecked type because Java does not support generic type
     * arrays (there would no runtime type information available which is necessary for Arrays).
     * 
     * @param maxPrio
     *            the max prio
     */
    @SuppressWarnings("unchecked")
    public PriorityQueue(int maxPrio) {
        this.maxPrio = maxPrio + 1;
        elements = (T[]) new Object[this.maxPrio];
        elements2prio = new Hashtable<T, Integer>();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the first element of the priority queue.
     * 
     * @return the first
     */
    public T getFirst() {
        return firstElement;
    }

    // -------------------------------------------------------------------------

    /**
     * Returns the size of the priority queue.
     * 
     * @return the int
     */
    public int size() {
        return size;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public PriorityQueue<T> cloneDeep() {
        PriorityQueue<T> clone = new PriorityQueue<T>(maxPrio);
        for (int prio = 0; prio < maxPrio; prio++) {
            
            Object o = elements[prio];
            if (o != null) {
                Object o_clone;
                try {
                    Class<? extends Object> class1 = o.getClass();
                    Method method = class1.getMethod("clone"); 
                    o_clone = method.invoke(o);
                    @SuppressWarnings("unchecked")
                    T element = (T) o_clone;
                    clone.insert(element, prio);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (SecurityException e) {
                    e.printStackTrace();
                } finally {
                }
            } else {
                clone.insert(null, prio);
            }
            
        }
        return clone;
    }

    // -------------------------------------------------------------------------

    public PriorityQueue<T> cloneShallow() {
        PriorityQueue<T> clone = new PriorityQueue<T>(maxPrio);
        for (int prio = 0; prio < maxPrio; prio++) {
            clone.insert(elements[prio], prio);
        }
        return clone;
    }

    // -------------------------------------------------------------------------

    /**
     * Updates the priority of an element in the priority queue. This might be a costly operation.
     * 
     * @param element
     *            the element to update
     * @param prio
     *            the new prio to set for the element
     */
    public void update(T element, int prio) {
        int oldPrio = getPrio(element);
        // Runtime optimization
        if (prio < oldPrio) {
            remove(oldPrio);
            insert(element, prio);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the priority of an element.
     * 
     * @param element
     *            the element to search for
     * @return the priority of the element
     */
    public int getPrio(T element) {
        if (elements2prio.containsKey(element)) {
            return elements2prio.get(element);
        }
        return -1;
    }

    // -------------------------------------------------------------------------

    /**
     * Insert an element with a specific priority into the queue. If the element was the first
     * element (head) of the priority queue, then the first element is updated.
     * 
     * @param element
     *            the element
     * @param prio
     *            the priority
     */
    public void insert(T element, int prio) {
        if (element != null) {
            elements[prio] = element;
            elements2prio.put(element, prio);
            if (prio >= firstPrio) {
                updateFirst();
            }
            size++;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Removes the element with the specific priority. If the element was the first element (head)
     * of the priority queue, then the first element is updated.
     * 
     * @param prio
     *            the priority of the element to be removed
     */
    public void remove(int prio) {
        if (prio > 0) {
            elements2prio.remove(elements[prio]);
            elements[prio] = null;
            if (prio >= firstPrio) {
                updateFirst();
            }
            size--;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Removes a specific element. If the priority of the element is known then remove(int prio)
     * should be used instead.
     * 
     * @param element
     *            the element to be removed
     */
    public void remove(T element) {
        remove(getPrio(element));
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the queue.
     * 
     * @return the queue
     */
    public List<T> getQueue() {
        LinkedList<T> queue = new LinkedList<T>();
        for (T element : this.elements) {
            queue.add(element);
        }
        return queue;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public String toString() {
        String debugString = "";
        for (int prio = maxPrio - 1; prio >= 0; prio--) {
            if (elements[prio] != null) {
                Object object = (Object) elements[prio];
                if (debugString.length() > 0) {
                    debugString += ", ";
                }
                debugString += object.toString();
            }
        }
        return debugString;
    }

    // -------------------------------------------------------------------------

    /**
     * Update firstElement. This method is used internally only. It searches for the first array
     * element that is not null - this represents the head (first) element which is then cached in
     * firstElement where firstPrio contains its specific priority. The search starts with the
     * maxPrio array index and then goes down to zero.
     */
    private void updateFirst() {
        firstPrio = -1;
        firstElement = null;
        for (int prio = maxPrio - 1; prio >= 0; prio--) {
            if (elements[prio] != null) {
                firstElement = (T) elements[prio];
                firstPrio = prio;
                return;
            }
        }
    }

    // -------------------------------------------------------------------------

}
