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
 * A data handler can read an modify data pools.
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
     * Read the content of the data pool.
     */
    public def void read(DataPool pool)
    /**
     * Read the content of the data pool and modify it as desired.
     */
    public def void write(DataPool pool)
    
    /**
     * Stop everything and clean up
     */
    public def void stop()
}