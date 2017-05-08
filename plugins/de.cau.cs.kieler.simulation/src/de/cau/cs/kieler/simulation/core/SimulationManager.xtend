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
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class SimulationManager {
    
    public static var SimulationManager instance
    
    @Accessors
    private var boolean isPlaying
    @Accessors
    private var boolean isStopped
    
    // TODO: make private
    public val List<DataHandler> dataHandlers = newArrayList()
    // TODO: make private
    public val List<StepAction> actions = newArrayList()
    private val List<StepState> states = newArrayList()
    
    private var StepState currentState
    
    new() {
        if(instance != null) {
            instance.stop()
        }
        instance = this
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
        states.add(currentState)
        
        println("Initilized simulation")
    }
    
    public def void stepSingle() {
        if(isStopped) {
            System.err.println("Simulation was stopped")
            return
        }
        
        // Create following state
        val DataPool pool = currentState.pool.clone()   
        // Perform action on this new state
        currentAction.apply(pool)
        // Save new state
        currentState = new StepState(pool, currentState.actionIndex + 1)
        states.add(currentState)
        
        println("Stepped simulation")
    }
    
    public def void stepMacroTick() {
        if(isStopped) {
            System.err.println("Simulation was stopped")
            return
        }
        
        // Create following state
        val DataPool pool = currentState.pool.clone()  
        
        // Perform action on this new state
        // Round action index up to next fully done macro tick
        val macroTickActionCount = actions.size()
        val currentActionIndex = currentState.actionIndex
        val nextActionIndex = ((currentActionIndex + macroTickActionCount) / macroTickActionCount) * macroTickActionCount
        for(var i = currentActionIndex; i < nextActionIndex; i++) {
            // Apply all data handlers up to next fully done macro tick
            getActionStep(i).apply(pool)
        }
        
        // Save new state
        currentState = new StepState(pool, nextActionIndex)
        states.add(currentState)
        
        println("Stepped simulation macro tick")
    }
    
    public def void stepBack() {
        if(isStopped) {
            System.err.println("Simulation was stopped")
            return
        }
        
        // TODO: implement
        System.err.println("Not yet implemented")
    }
        
    public def void play() {
        if(isStopped) {
            System.err.println("Simulation was stopped")
            return
        }
        if(!isPlaying) {
            isPlaying = true
            
            // TODO: implement
            System.err.println("Not yet implemented")
        }
    }
    
    public def void pause() {
        if(isStopped) {
            System.err.println("Simulation was stopped")
            return
        }
        if(isPlaying) {
            isPlaying = false        
            // TODO: implement
            System.err.println("Not yet implemented")
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
            if(handler instanceof Simulator) {
                handler.stop()
            }
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
}