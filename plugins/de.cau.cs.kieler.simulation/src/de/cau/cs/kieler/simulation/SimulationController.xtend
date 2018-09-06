/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation

import com.google.inject.Binder
import com.google.inject.Guice
import com.google.inject.Module
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationControlEvent.SimulationOperation
import de.cau.cs.kieler.simulation.mode.SimulationMode
import de.cau.cs.kieler.simulation.mode.SimulationModes
import java.util.concurrent.ArrayBlockingQueue
import java.util.concurrent.BlockingQueue
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.ICoreRunnable
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.xtend.lib.annotations.Accessors

import static com.google.common.base.Preconditions.*

/**
 * @author als
 */
class SimulationController implements SimulationControls {
        
    val SimulationContext context
    
    @Accessors(PUBLIC_GETTER)
    var boolean running = false
    @Accessors(PUBLIC_GETTER)
    var boolean asynchronous = false
    
    @Accessors(PUBLIC_GETTER)
    var SimulationMode mode
    
    // Async worker
    val BlockingQueue<SimulationControlEvent> asyncJobQueue
    val Job asyncJob
    
    new(SimulationContext context) {
        this.context = context
        this.mode = SimulationModes.MANUAL
        
        asyncJobQueue = new ArrayBlockingQueue(10)
        this.asyncJob = Job.create("Simulation", new ICoreRunnable() {
            
            override run(IProgressMonitor monitor) throws CoreException {
                monitor.beginTask("Waiting", IProgressMonitor.UNKNOWN)
                while(!monitor.canceled) {
                    monitor.taskName = "Waiting"
                    val event = asyncJobQueue.take()
                    if (!monitor.canceled) {
                        switch(event.operation) {
                            case STOP: {
                                monitor.done
                                return
                            }
                            case STEP: {
                                monitor.taskName = "Stepping"
                                context.performInternalStep
                                context.notify(event)
                            }
                        }
                    }
                }
                monitor.done()
            }
            
        })
        this.asyncJob.user = true
        this.asyncJob.priority = Job.INTERACTIVE
    }

    /**
     * Starts simulation.<br>
     * The context must be never started or stopped for this operation.
     * If this context was already started before this the new run will use the current cofiguration (newly populated) 
     * but will continue simulation the previous state.
     * Use @link{reset()} to reset the data pool.
     */
    override void start(boolean async) {
        if (running) {
            throw new IllegalStateException("Simulation already running")
        }
        this.running = true
        this.asynchronous = async
        
        context.initialize()
        context.models.forEach[initialize(context, context.dataPool)]
        
        if (async) {
            asyncJob.schedule()
        }
        
        mode.start(async)
        context.notify(new SimulationControlEvent(context, SimulationOperation.START))
    }
    
    /**
     * Stops simulation.<br>
     * 
     */
    override void stop() {
        // stop processes
        context.models.forEach[stop]
        mode.stop()
        
        if (asynchronous) {
            asyncJob.cancel
            asyncJobQueue.offer(new SimulationControlEvent(context, SimulationOperation.STOP))
        }
        
        running = false
        context.notify(new SimulationControlEvent(context, SimulationOperation.STOP))        
    }
    
    /**
     * Resets the simulation to its inital state.
     * May fail if running and some models do not support a reset.
     */
    override reset() {
        context.resetState
        if (running) {
            val success = context.models.fold(true)[success, model | model.reset && success]
            if (!success) {
                throw new UnsupportedOperationException("One of the Simulatables does not support a reset while running")
            }
        }
        
        context.notify(new SimulationControlEvent(context, SimulationOperation.RESET))
    }
    
    override setMode(Class<? extends SimulationMode> m) {
        checkNotNull(m, "Mode class is null")
        if (mode !== null) mode.stop
        mode = Guice.createInjector(new Module() {
            
            override configure(Binder binder) {
                binder.bind(SimulationContext).toInstance(context)
            }
            
        }).getInstance(m)
        context.notify(new SimulationControlEvent(context, SimulationOperation.MODE))
        if (running) mode.start(asynchronous)
    }
    
    override play() {
        if (running) {
            mode.play
            context.notify(new SimulationControlEvent(context, SimulationOperation.PLAY))
        }
    }
    
    override isPlaying() {
        if (running) mode.isPlaying else false
    }
    
    override pause() {
        if (running) {
            mode.pause
            context.notify(new SimulationControlEvent(context, SimulationOperation.PAUSE))
        }
    }
    
    override isPaused() {
        if (running) mode.isPaused else false
    }
    
    override step() {
        if (running) mode.step else false
    }
    
    def boolean performInternalStep() {
        if (running) {
            val event = new SimulationControlEvent(context, SimulationOperation.STEP)
            if (asynchronous) {
                return asyncJobQueue.offer(event)
            } else {
                context.performInternalStep
                context.notify(event)
                return true
            }
        } else {
            return false
        }
    }

}

interface SimulationControls {

    // General
    def void start(boolean async) 
    def void stop()
    def void reset()
    def boolean isRunning()
    def boolean isAsynchronous()
    
    // Modes
    def void setMode(Class<? extends SimulationMode> m)
    def SimulationMode getMode()
    
    // Mode control
    def void play()
    def boolean isPlaying()
    def void pause()
    def boolean isPaused()
    def boolean step()
    
}