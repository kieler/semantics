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
package de.cau.cs.kieler.simulation.ui.toolbar

import de.cau.cs.kieler.prom.console.PromConsole
import de.cau.cs.kieler.simulation.SimulationUtil
import de.cau.cs.kieler.simulation.core.SimulationManager
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException

/**
 * Base class for toolbar buttons that control the simulation.
 * 
 * @author aas
 *
 */
class SimulationToolbarButton extends AbstractHandler {
    
    /**
     * Determines if a press of the button should restart the last launched simulation,
     * if no simulation is running at the moment.
     */
    protected boolean restartSimulationIfStopped = true
    
    /**
     * Determines if the simulation has been restarted by a click of this button.
     * In this case, no other action should be performed by this button.
     * 
     * For instance, pressing the step button could restart the simulation
     * but it should not immediately perform a step of this new simulation as well.
     */
    protected boolean justRestarted
    
    /**
     * Tries to restart the simulation if desired.
     */
    override execute(ExecutionEvent event) throws ExecutionException {
        justRestarted = false
        if(restartSimulationIfStopped && (simulation == null || simulation.isStopped)) {
            // Start last simulation
            justRestarted = true
            SimulationUtil.restartLastSimulation
        }
        return null
    }

    /**
     * Returns the current simulation manager instance.
     * 
     * @return the current simulation manager instance.
     */
    public def SimulationManager getSimulation() {
        return SimulationManager.instance
    }
}