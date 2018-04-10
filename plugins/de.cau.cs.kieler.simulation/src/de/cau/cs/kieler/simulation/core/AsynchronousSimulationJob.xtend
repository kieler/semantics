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

import de.cau.cs.kieler.simulation.core.events.ErrorEvent
import de.cau.cs.kieler.simulation.core.events.SimulationOperation
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import de.cau.cs.kieler.prom.configurable.AttributeExtensions

/**
 * Job that executes macro ticks in a separate thread.
 * 
 * @author aas
 *
 */
class AsynchronousSimulationJob extends Job {
    private static extension AttributeExtensions attributeExtensions = new AttributeExtensions
    
    /**
     * The simulation manager that created this job and for which this job executes macro ticks.
     */
    private var SimulationManager sim
    
    /**
     * Constructor
     * 
     * @param title The title of the job
     * @param sim The simulation to step through
     */
    new(String title, SimulationManager sim) {
        super(title)
        this.sim = sim
    }
    
    /**
     * {@inheritDoc}
     */
    override protected run(IProgressMonitor monitor) {
        var int currentTime = System.currentTimeMillis.intValue
        var int nextTickTime = currentTime
        while(sim.isPlaying) {
            currentTime = System.currentTimeMillis.intValue
            if(nextTickTime > currentTime) {
                // Wait until next tick time reached
                val pause = nextTickTime - currentTime 
                Thread.sleep(pause);
            }
            // Save time BEFORE the tick is executed
            val int timeBeforeTick = System.currentTimeMillis.intValue
            
            // Notify listeners that a tick is going to happen
            sim.fireEvent(SimulationOperation.BEFORE_STEPPING)
            
            // Create following state
            val DataPool pool = sim.createNextPool()
            // Apply user made changes
            pool.applyUserValues
            // Set variable of model to current time if needed
            if(!SimulationManager.currentTimeVariable.isNullOrEmpty) {
                val variable = pool.getVariable(SimulationManager.currentTimeVariable)
                if(variable !== null) {
                    variable.value = System.currentTimeMillis.intValue    
                } else {
                    throw new Exception("Current time variable '"+SimulationManager.currentTimeVariable+"' was not found in the data pool. "
                                      + "You can clear this setting in the context menu of the data pool view (right click).")
                }
            }
            // Perform actions on this new state
            val nextActionIndex = sim.applyMacroTickActions(pool)
            // Save new state
            sim.setNewState(pool, nextActionIndex)
            
            // Set absolute time for next tick (possibly from a variable in the data pool)
            if(!SimulationManager.nextTickTimeVariable.isNullOrEmpty) {
                val variable = sim.currentPool.getVariable(SimulationManager.nextTickTimeVariable)
                if(variable !== null) {
                    nextTickTime = variable.value.doubleValue.intValue    
                } else {
                    throw new Exception("Next tick time variable '"+SimulationManager.nextTickTimeVariable+"' was not found in the data pool. "
                                      + "You can clear this setting in the context menu of the data pool view (right click).")
                }
            } else {
                nextTickTime = timeBeforeTick + SimulationManager.desiredTickPause
            }
            
            // Notify listeners of new state
            sim.fireEvent(SimulationOperation.PLAYING)
            
            currentTime = System.currentTimeMillis.intValue
            
            // Check desired tick pause.
            // If the nextTickTime is already smaller than the currentTime,
            // the tick took more time than desired. Thus it is too slow and an error is fired here.
            if(nextTickTime < currentTime) {
                val message = "Tick needed longer than desired. "
                              + "(needed: "+(currentTime-timeBeforeTick)+" ms, "
                              + "desired: "+(nextTickTime-timeBeforeTick)+ " ms)"
                val event = new ErrorEvent(message)
                sim.fireEvent(event)
            }
        }
        // Fire one additional event after the playmode ends
        sim.fireEvent(SimulationOperation.MACRO_STEP)
        return Status.OK_STATUS
    }
}