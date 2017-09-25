/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.core.events

import de.cau.cs.kieler.simulation.core.Variable

/**
 * An event about the change of a variable's user value.
 * 
 * @author aas
 *
 */
class VariableUserValueEvent extends VariableEvent {
    /**
     * The old user value before the event
     */
    public var Object oldValue
    /**
     * The new user value after the event
     */
    public var Object newValue
    
    /**
     * Constructor
     * 
     * @param v The variable
     * @param oldValue The old value
     * @param newValue The new value
     */
    new(Variable v, Object oldValue, Object newValue) {
        super("The user value changed", v)
        this.oldValue = oldValue
        this.newValue = newValue
    }
}