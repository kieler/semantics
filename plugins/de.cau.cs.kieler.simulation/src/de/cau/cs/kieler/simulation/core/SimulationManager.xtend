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

/**
 * @author aas
 *
 */
class SimulationManager {
    
    public static var SimulationManager instance
    
    // TODO: make private
    public val List<DataHandler> dataHandlers = newArrayList()
    // TODO: make private
    public val List<StepAction> actions = newArrayList()
    private val List<StepState> states = newArrayList()
    
    private var StepState currentState
    
    new() {
        if(instance != null)
            instance.stop()
            
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
        
        println("Initial pool:"+pool)
    }
    
    public def void stepSingle() {
        // Create following state
        val DataPool pool = currentState.pool.clone()   
        // Perform action on this new state
        val relativeActionIndex = currentState.actionIndex % actions.size()
        val action = actions.get(relativeActionIndex)
        println("Performing " + action.method + " on " + action.handler)
        switch(action.method) {
            case StepAction.Method.READ : action.handler.read(pool)
            case StepAction.Method.WRITE : action.handler.write(pool)
        }
        
        // Save new state
        currentState = new StepState(pool, currentState.actionIndex +1)
        states.add(currentState)
        
        println("New pool:"+pool)
    }
    
    public def void stepMacroTick() {
        // TODO: implement
        System.err.println("Not yet implemented")
    }
    
    public def void stepBack() {
        // TODO: implement
        System.err.println("Not yet implemented")
    }
        
    public def void play() {
        // TODO: implement
        System.err.println("Not yet implemented")
    }
    
    public def void pause() {
        // TODO: implement
        System.err.println("Not yet implemented")
    }
    
    public def void stop() {
        for(handler : dataHandlers) {
            if(handler instanceof Simulator) {
                handler.stop()
            }
        }
    }
}