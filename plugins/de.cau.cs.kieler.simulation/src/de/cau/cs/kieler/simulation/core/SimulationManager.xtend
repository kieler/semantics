/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.core

import java.util.List
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class SimulationManager {
    
    public static var SimulationManager instance
    
    private var Job steppingJob
    @Accessors
    private var boolean isPlaying
    @Accessors
    private var boolean isStopped
    
    // TODO: make private
    public val List<DataHandler> dataHandlers = newArrayList()
    // TODO: make private
    public val List<StepAction> actions = newArrayList()

    private var StepState currentState
    private var List<StepState> history = newArrayList()
    
    
    new() {
        if(instance != null) {
            instance.stop()
        }
        instance = this
    }
    
    public def void addHandler(DataHandler handler) {
        if(!dataHandlers.contains(handler))
            dataHandlers.add(handler)
    }
    
    public def void addAction(StepAction.Method method, DataHandler handler) {
        addHandler(handler)
        actions.add(new StepAction(method, handler))
    }
    
    public def void append(Simulator simulator) {
        simulator.initialize(currentPool)
        
        println("Appended simulator")
        updateHandlersAfterStep()
    }
    
    public def void initialize() {
        val pool = new DataPool()
        for(handler : dataHandlers) {
            if(handler instanceof Simulator) {
                handler.initialize(pool)
            }
        }
        
        // Save initial state
        currentState = new StepState(pool, 0)
        
        println("Initilized simulation")
        updateHandlersAfterStep()
    }
    
    public def void stepSingle() {
        if(isStopped) {
            System.err.println("Simulation was stopped")
            return
        } else if(isPlaying) {
            pause()
        }
        
        // Apply user values
        applyUserValues()
        
        // Create following state
        val DataPool pool = createNextPool()
        // Perform action on this new state
        currentAction.apply(pool)
        // Save new state
        setNewState(pool, currentState.actionIndex + 1)
        
        println("Stepped simulation")
        updateHandlersAfterStep()
    }
    
    public def void stepMacroTick() {
        if(isStopped) {
            System.err.println("Simulation was stopped")
            return
        } else if(isPlaying) {
            pause()
        }
        
        applyUserValues()
        
        // Create following state
        val DataPool pool = createNextPool()
        // Perform actions on this new state
        val nextActionIndex = applyMacroTickActions(pool)
        // Save new state
        setNewState(pool, nextActionIndex)
        
        println("Stepped simulation macro tick")
        updateHandlersAfterStep()
    }
    
    public def void stepBack() {
        if(isStopped) {
            System.err.println("Simulation was stopped")
            return
        } else if(isPlaying) {
            pause()
        }
        
        // Load state from history
        val previousState = history.last
        if(previousState != null) {
            history.remove(previousState)
            currentState = previousState
        }
        
        updateHandlersAfterStep()
    }

    public def void play() {
        if(isStopped) {
            System.err.println("Simulation was stopped")
            return
        }
        if(!isPlaying) {
            isPlaying= true
            
            steppingJob = new Job("Simulation Player") {
                override protected run(IProgressMonitor monitor) {
                    val delay = 10
                    val updateInterval = 500
                    var lastUpdate = System.currentTimeMillis
                    
                    // Create following state and set this one
                    // so following operations are performed on this one
                    val DataPool pool = createNextPool()
                    setNewState(pool, currentState.actionIndex)
                    
                    while(isPlaying) {
                        println("Playing simulation")
                        // Perform a step after a period of time
                        Thread.sleep(delay);
                        
                        // Update current pool
                        val newActionIndex = applyMacroTickActions(currentPool)
                        // Update index of current state
                        currentState.actionIndex = newActionIndex
                        
                        // Update data readers after a period of time
                        if((System.currentTimeMillis - lastUpdate) > updateInterval) {
                            lastUpdate = System.currentTimeMillis
                            updateHandlersAfterStep()
                        }
                    }
                    updateHandlersAfterStep()
                    return Status.OK_STATUS
                }
            }
            steppingJob.schedule()
        }
    }
    
    public def void pause() {
        if(isStopped) {
            System.err.println("Simulation was stopped")
            return
        }
        if(isPlaying) {
            isPlaying = false
        }
    }
    
    public def void stop() {
        if(isStopped) {
            System.err.println("Simulation was stopped")
            return
        }
        
        isStopped = true
        isPlaying = false
        for(handler : dataHandlers) {
            handler.stop()
        }
    }
    
    public def DataPool getCurrentPool() {
        return currentState.pool
    }
    
    public def StepAction getCurrentAction() {
        return getActionStep(currentState.actionIndex)
    }
    
    public def StepAction getActionStep(int index) {
        val relativeActionIndex = index % actions.size()
        return actions.get(relativeActionIndex)
    }
    
    private def void setNewState(DataPool newPool, int newActionIndex) {
        if(currentState != null) {
            history.add(currentState)
        }
        currentState = new StepState(newPool, newActionIndex)
    }
    
    private def DataPool createNextPool() {
        val pool = currentState.pool.clone()  
        pool.previousPool = currentPool
        return pool
    }
    
    private def int applyMacroTickActions(DataPool pool) {
        // Round action index up to next fully done macro tick
        val macroTickActionCount = actions.size()
        val currentActionIndex = currentState.actionIndex
        val nextActionIndex = ((currentActionIndex + macroTickActionCount) / macroTickActionCount) * macroTickActionCount
        // Apply all data handlers up to next fully done macro tick
        for(var i = currentActionIndex; i < nextActionIndex; i++) {
            getActionStep(i).apply(pool)
        }
        
        return nextActionIndex
    }
    
    private def void applyUserValues() {
        // Apply user made changes to variable values
        for(m : currentPool.models) {
            for(v : m.variables) {
                if(v.isDirty) {
                    v.value = v.userValue
                }
            }
        }
    }
    
    private def void updateHandlersAfterStep() {
        for(d : dataHandlers) {
            if(d.updateEachStep) {
                d.read(currentPool)
            }
        }
    }
}