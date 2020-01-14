/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ui

import de.cau.cs.kieler.kicool.KiCoolFactory
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.ui.console.Consoles
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.ui.internal.processor.UserValues
import de.cau.cs.kieler.simulation.ui.view.pool.SimulationModeMenu
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.ui.statushandlers.StatusManager
import de.cau.cs.kieler.simulation.ide.ISimulationListenerProvider
import de.cau.cs.kieler.simulation.events.ISimulationListener

/**
 * @author als
 */
class UISimulationListenerProvider implements ISimulationListenerProvider {
    
    public static val SIMULATION_CONSOLE_NAME = "KIELER Simulation"
    
    static val UI_LISTENER = new ISimulationListener() {

        override getName() {
            "UI"
        }
    
        override update(SimulationContext context, SimulationEvent e) {
            if (e instanceof SimulationControlEvent) {
                switch (e.operation) {
                    case START:
                        SimulationUI.setCanRestartSimulationSilent(true)
                    case STEP: {
                        if (context.hasErrors) {
                            for (error : context.allErrors) {
                                StatusManager.getManager().handle(new Status(IStatus.ERROR, SimulationUIPlugin.PLUGIN_ID,
                                    "Error in simulation:\n " + error.message), StatusManager.SHOW)
                            }
                        }
                    }
                    default: { // nothing
                    }
                }
            }
        }
    
    }
    
    override getListeners() {
        return newArrayList(UI_LISTENER)
    }

    override handleError(Exception e) {
        if (e !== null) {
            StatusManager.getManager().handle(
                new Status(IStatus.ERROR, SimulationUIPlugin.PLUGIN_ID, e.getMessage(), e.getCause()),
                StatusManager.SHOW.bitwiseOr(StatusManager.LOG))
        }
    }
    
    override prepareNewSimulation(SimulationContext simulation) {
        // TODO connect to preference page
        simulation.startEnvironment.copyProperties(SimulationUI.environmentDefaults)
        val console = Consoles.getConsole(SIMULATION_CONSOLE_NAME)
        simulation.outputStream = console.getInfoStream()
        simulation.errorStream = console.getErrorStream()
        simulation.mode = SimulationModeMenu.currentMode
        
        // Add user value processor
        val root = simulation.system.processors as ProcessorGroup
        root.processors.add(0, KiCoolFactory.eINSTANCE.createProcessorReference => [
            id = UserValues.ID
        ])
    }

}
