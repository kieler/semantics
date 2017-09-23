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

import java.util.List

/**
 * A data handler can read and modify data pools.
 * They are called by the simulation manager.
 * If the simulation manager stops, the data handler is told to stop.
 * 
 * A data handler may request to call its read-method after every step of the simulation
 * to provide information to the user.
 * 
 * @author aas
 *
 */
interface DataHandler {
    /**
     * The name of this data handler.
     * This must match the name that is used to register the handler in the extension point.
     */
    public def String getName()
    
    /**
     * The operations that can be performed by this data handler.
     */
    public def List<DataPoolOperation> getOperations()
    
    /**
     * Initialize everything
     */
    public def void initialize()
    
    /**
     * Stop everything and clean up
     */
    public def void stop()
    
    /**
     * Searches for the operation with the given name.
     * 
     * @param operationName The name of the operation
     * @return The operation with that name, or null if none
     */
    public def DataPoolOperation getOperation(String operationName) {
        return operations.findFirst[it.name == operationName]
    }
    
    public def String getOperationNames() {
        return operations.map[it.name].join(", ")
    }
}