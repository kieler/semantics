/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.testing

import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.ISimulationListener
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.events.TraceFinishedEvent
import de.cau.cs.kieler.simulation.events.TraceMismatchEvent
import de.cau.cs.kieler.simulation.mode.ManualMode
import de.cau.cs.kieler.simulation.trace.ktrace.TraceFile
import java.io.PrintWriter
import java.io.StringWriter
import org.eclipse.xtend.lib.annotations.Accessors

import static com.google.common.base.Preconditions.*

/**
 * @author als
 */
class TraceSimulation implements ISimulationListener {
    
    @Accessors
    val SimulationContext context
    
    @Accessors
    val Iterable<TraceFile> traceFiles

    @Accessors
    var boolean checkOutput = true    
    @Accessors
    var boolean stopOnMismatch = true
    
    var SimulationEvent traceEvent = null
   
    new(SimulationContext context, TraceFile traceFile) {
        this(context, #[traceFile])
    }
    new(SimulationContext context, Iterable<TraceFile> traceFiles) {
        checkNotNull(context)
        checkNotNull(traceFiles)
        this.context = context
        this.traceFiles = traceFiles
    }
    
    def SimulationResult simulate() {
        checkArgument(!context.running, "Cannot simulate trace in simulation context that is already running.")
        
        // if max history is explicitly set then do not override otherwise set to maximum to produce sensible results
        if (!context.startEnvironment.propertyExists(SimulationContext.MAX_HISTORY_LENGTH)) {
            context.startEnvironment.setProperty(SimulationContext.MAX_HISTORY_LENGTH, Integer.MAX_VALUE)
        }
        
        val results = new SimulationResult(context)
        
        try {
            // Register for events
            context.addObserver(this)
                        
            for (traceFile : traceFiles) {
                // Run each trace in the trace file
                for (var i = 0; i < traceFile.traces.size; i++) {
                    val trace = traceFile.traces.get(i)
                    val result = results.createNewResult(traceFile, trace)
                    
                    // Configure trace
                    context.setTrace(trace, checkOutput, false)
                    context.mode = ManualMode
                    
                    // Start simulation
                    context.start(false)
                    
                    // Run simulation until end of trace
                    var doStep = true
                    while(doStep) {
                        if (context.hasErrors) {
                            context.stop
                            context.deleteObserver(this)
                            
                            result.history = context.history.clone()
                            result.errors += context.allErrors.map[ err |
                                if (err.exception !== null) {
                                   ((new StringWriter) => [err.exception.printStackTrace(new PrintWriter(it))]).toString()
                                } else {
                                   err.message
                                }
                            ]
                            return results
                        } else if (traceEvent instanceof TraceMismatchEvent) {
                            result.mismatch = traceEvent
                            
                            if (stopOnMismatch) {
                                context.stop
                                context.deleteObserver(this)
                                
                                result.history = context.history.clone()
                                return results
                            }
                        } else if (traceEvent instanceof TraceFinishedEvent) {
                            result.finished = true
                            result.history = context.history.clone()
                            
                            doStep = false // continue with next trace
                        } else {
                            context.step
                        }
                    }
                    
                    // Stop and reset the simulation
                    context.stop
                    context.reset
                }
            }
        } finally {
            context.stop
            context.deleteObserver(this)
        }
        return results
    }
    
    
    /**
     * Implementation of SimulationListener.
     * Looks for trace mismatches.
     */
    override update(SimulationContext ctx, SimulationEvent e) {
        if (e instanceof TraceMismatchEvent || e instanceof TraceFinishedEvent) {
            traceEvent = e
        }
    }
    
    /**
     * Implementation of SimulationListener.
     * Returns the name of this listener.
     */
    override getName() {
        return class.simpleName
    }
}