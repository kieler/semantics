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
package de.cau.cs.kieler.simulation.handlers

/**
 * Event that is fired when the current simulation diverges from a previous trace.
 * 
 * @author aas
 *
 */
class TraceMismatchEvent extends TraceEvent {
    /**
     * The value expected by the trace
     */
    public Object expectedValue
    
    /**
     * {@inheritDoc}
     */
    override toString() {
        return message
    }
}