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
 * Combination of a data handler and a method (e.g. write / verify) to be performed by that handler.
 * 
 * @author aas
 *
 */
class StepAction {
    
    /**
     * The handler that should perform an operation
     */
    @Accessors(PUBLIC_GETTER)
    private var DataHandler handler
    
    /**
     * The loaded operation from the handler
     */
    @Accessors(PUBLIC_GETTER)
    private var DataPoolOperation operation
    
    /**
     * Constructor for handlers that only have a single action they can perform
     * 
     * @param handler The handler that should perform its operation
     */
    new(DataHandler handler) {
        this.handler = handler
        // Get the operation object and check that it is unique
        if(handler.operations.size == 1) {
            operation = handler.operations.get(0)
        } else {
            throw new Exception("The operation to use of the '"+handler.name+"' data handler is ambiguous'\n"
                              + "Please specify the operation name to use.\n"
                              + "Available operations are: "+handler.operationNames)
        }
    }
    
    /**
     * Constructor
     * 
     * @param operation The operation
     * @param handler The handler
     */
    new(String operationName, DataHandler handler) {
        this.handler = handler
        // Get the operation object and check that it exists
        this.operation = handler.getOperation(operationName)
        if(operation == null) {
            throw new Exception("The '"+handler.name+"' data handler does not have an operation '"+operationName+"'\n"
                              + "Available operations are: "+handler.operationNames)
        }
    }
    
    /**
     * Performs the method by the data handler on the given pool.
     */
    public def void apply(DataPool pool) {
        if(operation != null) {
            operation.apply(pool)
        }
    }
}