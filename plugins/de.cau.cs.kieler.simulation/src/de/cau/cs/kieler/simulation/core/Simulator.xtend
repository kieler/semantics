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
 * A simulator is a special data handler that communicates with a model to send, receive and update its state. 
 * 
 * @author aas
 *
 */
interface Simulator extends DataHandler {
    /**
     * Initialize the simulation and add variables of the simulation to the given pool.
     */
    public def void initialize(DataPool pool)
    
    public def void setBaseModelName(String value)
    public def String getBaseModelName()
}