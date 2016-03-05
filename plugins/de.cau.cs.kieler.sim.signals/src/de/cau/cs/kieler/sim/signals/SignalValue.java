/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.signals;

/**
 * The class Signal value represents a synchronous pure and valued signal's status and value.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-07-25 proposed yellow 
 */
public class SignalValue {
    
    /** The present. */
    private boolean present;
    
    /** The value. */
    private Object value;
    
    //-------------------------------------------------------------------------

    /**
     * Instantiates a new signal value.
     *
     * @param present the present
     * @param value the value
     */
    public SignalValue(final boolean present, final Object value) {
        this.present = present;
        this.value = value;
    }
    
    //-------------------------------------------------------------------------

    /**
     * Checks if Signal is present.
     *
     * @return true, if is present
     */
    public boolean isPresent() {
        return present;
    }

    //-------------------------------------------------------------------------

    /**
     * Sets Signal to be present.
     *
     * @param present the new present
     */
    public void setPresent(final boolean present) {
        this.present = present;
    }

    //-------------------------------------------------------------------------

    /**
     * Gets the value of the Signal. Returns NULL if pure signal.
     *
     * @return the value
     */
    public Object getValue() {
        return value;
    }

    //-------------------------------------------------------------------------

    /**
     * Sets the value of a Signal. Set to NULL for pure signals.
     *
     * @param value the new value
     */
    public void setValue(final Object value) {
        this.value = value;
    }
    
    //-------------------------------------------------------------------------

}
