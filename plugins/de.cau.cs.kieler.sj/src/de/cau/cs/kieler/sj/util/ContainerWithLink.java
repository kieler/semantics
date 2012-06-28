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
 * A container with a single link. This class is needed to build some data structures.
 * 
 * @author mhei
 * 
 * @param <T>
 */
class ContainerWithLink<T> {
    private T item;
    private ContainerWithLink<T> successor;

    protected ContainerWithLink(final T t, final ContainerWithLink<T> s) {
        item = t;
        successor = s;
    }

    protected T getItem() {
        return item;
    }

    protected void setItem(final T o) {
        item = o;
    }

    protected ContainerWithLink<T> getSuccessor() {
        return successor;
    }

    protected void setSuccessor(final ContainerWithLink<T> c) {
        successor = c;
    }

    protected void insertAfter(final T t) {
        if (successor == null) {
            successor = new ContainerWithLink<T>(t, null);
        } else {
            successor = new ContainerWithLink<T>(t, getSuccessor());
        }
    }
}
