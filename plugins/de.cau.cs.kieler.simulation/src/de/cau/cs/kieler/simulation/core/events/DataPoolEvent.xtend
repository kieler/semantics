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

import de.cau.cs.kieler.simulation.core.DataPool

/**
 * Simulation event with a data pool.
 * 
 * @author aas
 *
 */
class DataPoolEvent extends SimulationEvent {
    /**
     * The pool of the event.
     */
    public var DataPool pool

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
     * @param pool The pool
     */    
    new(DataPool pool) {
        this.pool = pool
    }
    
    /**
     * Constructor
     * 
     * @param message The message
     * @param pool The pool
     */
    new(String message, DataPool pool) {
        super(message)
        this.pool = pool
    }
}