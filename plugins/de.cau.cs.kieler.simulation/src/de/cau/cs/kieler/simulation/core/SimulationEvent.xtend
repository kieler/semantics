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
package de.cau.cs.kieler.simulation.core

/**
 * @author aas
 *
 */
class SimulationEvent {
    
    /**
     * The type of the event.
     */
    public var SimulationEventType type
    /**
     * The new pool in the simulation.
     */
    public var DataPool pool
    /**
     * The modified variable or the variable on which a trace mismatch occured.
     */
    public var Variable variable
    
    /**
     * The modified variable or the variable on which a trace mismatch occured.
     */
    public var String message
 
    new() {
    }
    
    new(SimulationEventType type) {
        this.type = type
    }
    
    new(SimulationEventType type, DataPool pool) {
        this(type)
        this.pool = pool
    }
    
    new(SimulationEventType type, Variable variable) {
        this(type)
        this.variable = variable
    }
    
    new(SimulationEventType type, String message) {
        this(type)
        this.message = message
    }
}