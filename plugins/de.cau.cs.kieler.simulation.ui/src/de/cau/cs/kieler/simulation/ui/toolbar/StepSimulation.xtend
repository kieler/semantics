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

import de.cau.cs.kieler.simulation.ui.SimulationConsole
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException

/**
 * @author aas
 *
 */
class StepSimulation extends SimulationToolbarButton {
    
    override execute(ExecutionEvent event) throws ExecutionException {
        super.execute(event)
        if(simulation != null) {
            SimulationConsole.writeToConsole("Step single (performing "
                + simulation.currentAction.method + " on " + simulation.currentAction.handler + ")")
            simulation.stepSingle()
//            SimulationConsole.writeToConsole("New pool:" + simulation.currentPool)
        }
        return null
    }
}