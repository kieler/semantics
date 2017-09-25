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

/**
 * Base class for simulation events
 * 
 * @author aas
 *
 */
class SimulationEvent {
    /**
     * A message for the user
     */
    public var String message
 
    /**
     * Constructor
     */
    new() {
    }
    
    /**
     * Constructor
     * 
     * @param message The message
     */
    new(String message) {
        this.message = message
    }
}