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
 * An event about the handling of the simulation
 * 
 * @author aas
 *
 */
class SimulationControlEvent extends DataPoolEvent {
    /**
     * The operation that was executed when controling the simulation.
     */
    public var SimulationOperation operation
    
    /**
     * Constructor
     * 
     * @param operation The operation
     * @param newPool The new data pool in the simulation
     */  
    new(SimulationOperation operation, DataPool newPool) {
        super(newPool)
        this.operation = operation
    }
}