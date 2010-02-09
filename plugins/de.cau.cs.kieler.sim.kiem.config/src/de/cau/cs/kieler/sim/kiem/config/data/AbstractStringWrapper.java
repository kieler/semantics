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
 */
package de.cau.cs.kieler.sim.kiem.config.data;

import java.io.Serializable;

/**
 * A wrapper for a string.
 * <p>
 * Can be used to ensure type safety of operations that would normally get a
 * String as parameter and that String really encodes an identifier.
 * </p>
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 * 
 */
public abstract class AbstractStringWrapper implements Comparable<Object>,
        Serializable {

    /** Id for serialization. */
    private static final long serialVersionUID = -6938469797661062126L;
    /** The string contained in this component. */
    private String containedString;

    // --------------------------------------------------------------------------

    /**
     * 
     * Creates a new AbstractStringWrapper.
     * 
     * @param string
     *            the string that should be wrapped.
     */
    public AbstractStringWrapper(final String string) {
        this.containedString = string;
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the contained string.
     * 
     * @return the contained string.
     */
    public String getString() {
        return containedString;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public int compareTo(final Object another) {
        int result = Integer.MIN_VALUE;
        if (another instanceof String) {
            result = containedString.compareTo((String) another);
        }
        if (another instanceof AbstractStringWrapper) {
            result = containedString
                    .compareTo(((AbstractStringWrapper) another).containedString);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(final Object another) {
        if (another == null) {
            return false;
        }
        if (another instanceof AbstractStringWrapper) {
            return this.containedString
                    .equals(((AbstractStringWrapper) another).containedString);
        }
        if (another instanceof String) {
            // working as intended, convenience for saving conversion
            return containedString.equals(another);
        }
        return another.equals(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return containedString.hashCode();
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return containedString;
    }
}
