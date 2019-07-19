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
package de.cau.cs.kieler.simulation.ui

import de.cau.cs.kieler.simulation.ide.CentralSimulation
import de.cau.cs.kieler.simulation.ui.view.SimulationControlButtons
import de.cau.cs.kieler.simulation.ui.view.pool.DataPoolView
import org.eclipse.swt.widgets.Display
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.simulation.ide.preferences.SimulationPreferences

/**
 * Handles UI integration of .
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SimulationUI extends CentralSimulation {

    @Accessors
    static var boolean canRestartSimulation = false
    
    @Accessors(PUBLIC_GETTER)
    static val environmentDefaults = new SimulationPreferences
    
    // ---------------------------------------------------------------------------
    
    static def getCurrentSimulation() {
        return CentralSimulation.currentSimulation
    }
    
    static def setCanRestartSimulation(boolean enableRestart) {
        canRestartSimulation = enableRestart
        updateUI[
            SimulationControlButtons.instances.forEach[updateButtons(null)]
            DataPoolView.instance?.updateToolbar
        ]
    }
    
    static def setCanRestartSimulationSilent(boolean enableRestart) {
        canRestartSimulation = enableRestart
    }

    static def updateUI(() => void task) {
        updateUI(true, task)
    }

    static def updateUI(boolean async, () => void task) {
        val runnable = new Runnable() {
            override run() {
                task.apply
            }
        }
        if (async) {
            Display.getDefault().asyncExec(runnable)
        } else {
            Display.getDefault().syncExec(runnable)
        }
    }
    
}