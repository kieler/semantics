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
package de.cau.cs.kieler.simulation.internal.processor

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class Step extends SimulationProcessor {
    
    override getId() {
        "de.cau.cs.kieler.simulation.internal.step"
    }
    
    override getName() {
        "Step"
    }
    
    override process() {
        val context = simulationContext
        
        for (sim : context.models) {
            if (sim.running) {
                // Tick
                sim.doStep(dataPool)
            } else {
                environment.errors.add("Simulatable " + sim.id + " is no longer running")
            }
        }
        
    }
    
}