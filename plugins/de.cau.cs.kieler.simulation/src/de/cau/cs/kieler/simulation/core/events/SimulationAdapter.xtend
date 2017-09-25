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

import de.cau.cs.kieler.simulation.handlers.TraceEvent
import de.cau.cs.kieler.simulation.handlers.TraceMismatchEvent

/**
 * @author aas
 *
 */
class SimulationAdapter implements SimulationListener {
    
    /**
     * Calls the corresponding methods for the given event.
     */
    override update(SimulationEvent e) {
        // Casting is done implicitly by Xtend
        if(e instanceof ErrorEvent)
            onErrorEvent(e)
        if(e instanceof TraceMismatchEvent)
            onTraceMismatch(e)
        if(e instanceof TraceEvent)
            onTraceEvent(e)
        if(e instanceof SimulationControlEvent)
            onSimulationControlEvent(e)
        if(e instanceof VariableUserValueEvent)
            onUserValueChanged(e)
        if(e instanceof VariableEvent)
            onVariableEvent(e)
        if(e instanceof DataPoolEvent)
            onDataPoolEvent(e)
    }

    protected def void onErrorEvent(ErrorEvent e) {
    }
    
    protected def void onTraceMismatch(TraceMismatchEvent e) {
    }
    
    protected def void onTraceEvent(TraceEvent e) {
    }
    
    protected def void onSimulationControlEvent(SimulationControlEvent e) {
    }
    
    protected def void onUserValueChanged(VariableUserValueEvent e) {
    }
    
    protected def void onVariableEvent(VariableEvent e) {
    }
    
    protected def void onDataPoolEvent(DataPoolEvent e) {
    }
}