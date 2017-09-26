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
 * Base implementation structure for a simulation listener.
 * Implementing classes can easily overwrite the methods to react to the simulation.
 * 
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
        if(e instanceof SimulationControlEvent) {
            onSimulationControlEvent(e)
            switch(e.operation) {
                case INITIALIZED :
                    onSimulationInitialized(e)
                case STOP : 
                    onSimulationStopped(e)
                default : { 
                    onSimulationStepped(e)    
                }
            }
        }
        if(e instanceof VariableUserValueEvent)
            onUserValueChanged(e)
        if(e instanceof VariableEvent)
            onVariableEvent(e)
        if(e instanceof DataPoolEvent)
            onDataPoolEvent(e)
    }

    /**
     * Callback for error events.
     * 
     * @param e The event
     */
    protected def void onErrorEvent(ErrorEvent e) {
    }
    
    /**
     * Callback for trace mismatch events.
     * 
     * @param e The event
     */
    protected def void onTraceMismatch(TraceMismatchEvent e) {
    }
    
    /**
     * Callback for trace events in general.
     * This is also fired for trace mismatch events.
     * 
     * @param e The event
     */
    protected def void onTraceEvent(TraceEvent e) {
    }
    
    /**
     * Callback for simulation control events.
     * 
     * @param e The event
     */
    protected def void onSimulationControlEvent(SimulationControlEvent e) {
    }
    
    /**
     * Callback for a changed user value in a variable.
     * 
     * @param e The event
     */
    protected def void onUserValueChanged(VariableUserValueEvent e) {
    }
    
    /**
     * Callback for variable events in general.
     * This is also fired for a VariableUserValueEvent and TraceEvent.
     * 
     * @param e The event
     */
    protected def void onVariableEvent(VariableEvent e) {
    }
    
    /**
     * Callback for data pool events in general.
     * This is also fired for simulation control events.
     * 
     * @param e The event
     */
    protected def void onDataPoolEvent(DataPoolEvent e) {
    }
    
    /**
     * This is fired when a new simulation has been initialized.
     * 
     * @param e The event
     */
    protected def void onSimulationInitialized(SimulationControlEvent e) {
    }
    
    /**
     * This is fired when a simulation has been stopped.
     * 
     * @param e The event
     */
    protected def void onSimulationStopped(SimulationControlEvent e) {
    }
    
    /**
     * This is fired when a new simulation has is performing a step.
     * 
     * @param e The event
     */
    protected def void onSimulationStepped(SimulationControlEvent e) {
    }
}