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

import de.cau.cs.kieler.simulation.core.SimulationEvent
import de.cau.cs.kieler.simulation.core.SimulationEventType
import org.eclipse.core.resources.IFile

/**
 * Base class for events that are fired by traces.
 * 
 * @author aas
 *
 */
abstract class TraceEvent extends SimulationEvent {
    /**
     * The file from which the trace was loaded
     */
    public IFile traceFile
    /**
     * The number of the trace (in case there are multiple traces in the loaded file)
     */
    public int traceNumber
    /**
     * The tick for which the event occurs
     */
    public int tickNumber
    
    /**
     * Constructor
     */
    new() {
        type = SimulationEventType.TRACE
    }
}