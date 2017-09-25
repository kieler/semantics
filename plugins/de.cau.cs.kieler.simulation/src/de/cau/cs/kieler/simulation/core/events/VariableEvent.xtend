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
 * Base class for an event that occurs in the context of a variable.
 * 
 * @author aas
 *
 */
class VariableEvent extends SimulationEvent {
    
    /**
     * The variable of the event.
     */
    public var Variable variable
    
    /**
     * Constructor
     */    
    new() {
        super()
    }
    
    /**
     * Constructor
     * 
     * @param message The message
     */    
    new(String message) {
        super(message)
    }
    
    /**
     * Constructor
     * 
     * @param message The message
     * @param variable The variable
     */
    new(String message, Variable variable) {
        super(message)
        this.variable = variable
    }
}