/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 *
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.codegen.sc;

/**
 * A simple implementation of a tuple type.
 * 
 * @kieler.rating 2010-06-14 yellow
 * @author tam
 * 
 * @param <T> type of the first tuple object
 * @param <V> type of the second tuple object
 */
public class Tuple<T, V> {
    private T object1;
    private V object2;

    /**
     * Constructor for the type "Tupel" with two objects as argument.
     * 
     * @param o1
     *            first object of the tuple
     * @param o2
     *            second object of the tuple
     */
    public Tuple(final T o1, final V o2) {
        object1 = o1;
        object2 = o2;
    }

    /**
     * Constructor of the type "Tupel" without arguments. This sets both objects of the tuple to
     * null.
     */
    public Tuple() {
        object1 = null;
        object2 = null;
    }

    /**
     * Getter for the first object of the tuple.
     * 
     * @return first object of the tuple
     */
    public T getO1() {
        return object1;
    }

    /**
     * Getter for the second object of the tuple.
     * 
     * @return second object of the tuple
     */
    public V getO2() {
        return object2;
    }

    /**
     * Setter for the first object of the tuple.
     * 
     * @param object
     *            to set the first object of the tuple
     */
    public void setO1(final T object) {
        object1 = object;
    }

    /**
     * Setter for the second object of the tuple.
     * 
     * @param object
     *            to set the second object of the tuple
     */
    public void setO2(final V object) {
        object2 = object;
    }

    /**
     * {@inheritDoc}
     */
    // CHECKSTYLEOFF Equals and HashCode
    // I don't need hash code for this
    @SuppressWarnings("unchecked")
    public boolean equals(final Object other) {
        if (other instanceof Tuple<?, ?>) {
            Tuple<T, V> tupel = (Tuple<T, V>) other;
            boolean boolObject1 = tupel.object1.equals(object1);
            boolean boolObject2 = tupel.object2.equals(object2);
            return (boolObject1 && boolObject2);
        } else {
            return false;
        }
    }
    // CHECKSTYLEON Equals and HashCode
}
