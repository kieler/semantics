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
package de.cau.cs.kieler.simulation.ui.toolbar

import de.cau.cs.kieler.prom.ui.console.PromConsole
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.ui.launch.SimulationLaunchShortcut
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException

/**
 * @author aas
 *
 */
class SimulationToolbarButton extends AbstractHandler {
    
    protected boolean restartSimulationIfStopped = true
    protected boolean justRestarted
    
    override execute(ExecutionEvent event) throws ExecutionException {
        justRestarted = false
        if(restartSimulationIfStopped && (simulation == null || simulation.isStopped)) {
            // Start last simulation
            justRestarted = true
            PromConsole.print("Restarting last simulation")
            new SimulationLaunchShortcut().launchLastSelection
        }
        return null
    }
    
    override isEnabled() {
        return true
    }

    public def SimulationManager getSimulation() {
        return SimulationManager.instance
    }
}