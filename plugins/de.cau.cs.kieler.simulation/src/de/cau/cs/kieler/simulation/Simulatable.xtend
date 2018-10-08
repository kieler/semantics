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

import de.cau.cs.kieler.kicool.compilation.VariableStore

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
interface Simulatable {

    /**
     * The uniqie identifier of the Simulatable in a SimulationContext.
     */   
    def String getId()

    /**
     * Initializes this Simulatable and sets its state to running.
     */       
    def void initialize(SimulationContext context, DataPool pool)
    
    /**
     * Stops this Simulatable and frees all its resources.
     */       
    def void stop()
 
    /**
     * True if this Simulatable is initialized and ready to step.
     */   
    def boolean isRunning()
    
    /**
     * Performs on reaction of this Simulatable.
     */ 
    def void doStep(DataPool pool)

    /**
     * OPTIONAL: Resets this Simulatable to its initial state.
     * 
     * @returns success
     */    
    def boolean reset()
    
    /**
     * Provides infomation about the communiaction variables.
     */
    def VariableStore getVariableInformation()
    
}