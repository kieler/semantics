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
package de.cau.cs.kieler.sjl;

import java.util.Hashtable;


/**
 * Fast and simple priority queue implementation (KISS principle).
 * 
 * @author cmot
 *
 */
public class PriorityQueue<T> {
    
    public int maxPrio;
    public T firstElement;
    public int firstPrio = -1;
    public Object[] elements;
    public int size;
    public Hashtable<T, Integer> elements2prio;
    
    public PriorityQueue(int maxPrio) {
        this.maxPrio = maxPrio + 1;
        elements = new Object[this.maxPrio];
        elements2prio = new Hashtable<T, Integer>();
    }
    
    public T getFirst() {
       return firstElement;
    }
    
    public int size() {
        return size;
    }
    
    public PriorityQueue<T> clone() {
        PriorityQueue clone = new PriorityQueue<T>(maxPrio);
        for (int prio = 0; prio < maxPrio; prio++) {
            clone.insert(prio, elements[prio]);
        }
        return clone;
    }
    
    public void update(int prio, T element) {
        int oldPrio = getPrio(element);
        remove(oldPrio);
        insert(prio, element);
    }
    
    public int getPrio(T element) {
        if (elements2prio.containsKey(element)) {
            return elements2prio.get(element);
        }
        return -1;
    }
    
    public void insert(int prio, T element) {
        if (element != null) {
            elements[prio] = element;
            elements2prio.put(element, prio);
            if (prio >= firstPrio) {
                updateFirst();
            }
            size++;
        }
    }

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
    
    public void remove(T element) {
        remove(getPrio(element));
    }    
     
    private void updateFirst() {
        for (int prio = maxPrio-1; prio >= 0; prio--) {
            if (elements[prio] != null) {
                firstElement = (T)elements[prio];
                firstPrio = prio;
                return;
            }
        }
    }

}
