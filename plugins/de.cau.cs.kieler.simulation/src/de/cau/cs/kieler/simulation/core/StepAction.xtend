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

import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Combination of a data handler and a method (read / write) to perform on that handler.
 * 
 * @author aas
 *
 */
class StepAction {
    /**
     * The handler to perform the method on.
     */
    @Accessors
    private var DataHandler handler
    /**
     * The operation to perform by the handler.
     */
    @Accessors
    private var String operation
    
    /**
     * Constructor
     */
    new(String operation, DataHandler handler) {
        this.operation = operation
        this.handler = handler
    }
    
    /**
     * Performs the method on the data handler.
     */
    public def void apply(DataPool pool) {
        val op = handler.getOperation(operation)
        if(op != null) {
            op.apply(pool)
        }
    }
}