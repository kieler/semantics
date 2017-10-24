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
 * Interface that notifies about the simulation.
 * 
 * @author aas
 *
 */
interface SimulationListener {
    /**
     * Notifies about a simulation event.
     * Implementing classes should check the type of the event via instanceof to filter for the relevant events.
     * 
     * @param e The event
     */
    public def void update(SimulationEvent e)
}