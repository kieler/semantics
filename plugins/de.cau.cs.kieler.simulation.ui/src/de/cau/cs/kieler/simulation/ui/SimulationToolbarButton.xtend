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

import de.cau.cs.kieler.simulation.core.SimulationManager
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException

/**
 * @author aas
 *
 */
class SimulationToolbarButton extends AbstractHandler {
    
    override execute(ExecutionEvent event) throws ExecutionException {
        if(simulation == null || simulation.isStopped) {
            SimulationConsole.writeToConsole("No simulation running")
        }
        return null
    }
    
    override isEnabled() {
        return (simulation != null) && (!simulation.isStopped)
    }

    public def SimulationManager getSimulation() {
        return SimulationManager.instance
    }
}