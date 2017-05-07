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
package de.cau.cs.kieler.simulation.ui

import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import de.cau.cs.kieler.simulation.core.SimulationManager

/**
 * @author aas
 *
 */
class StepSimulation extends AbstractHandler {
    
    override execute(ExecutionEvent event) throws ExecutionException {
        println("Step")
        if(SimulationManager.instance != null) {
            SimulationManager.instance.stepSingle()
        }
        return null
    }
}