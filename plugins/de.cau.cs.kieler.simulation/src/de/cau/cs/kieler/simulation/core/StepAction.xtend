/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
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
     * The method to perform on the handler.
     */
    @Accessors
    private var Method method
    
    /**
     * Possible methods to perform.
     */
    public enum Method {
        READ, WRITE
    }
    
    /**
     * Constructor
     */
    new(Method method, DataHandler handler) {
        this.method = method
        this.handler = handler
    }
    
    /**
     * Performs the method on the data handler.
     */
    public def void apply(DataPool pool) {
//        println("Performing "+method + " on "+handler)
        switch(method) {
            case StepAction.Method.READ : handler.read(pool)
            case StepAction.Method.WRITE : handler.write(pool)    
        }
    }
}