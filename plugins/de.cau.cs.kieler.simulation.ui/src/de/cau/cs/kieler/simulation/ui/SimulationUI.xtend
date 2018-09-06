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

import de.cau.cs.kieler.core.model.ui.console.Consoles
import de.cau.cs.kieler.kicool.KiCoolFactory
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.events.SimulationListener
import de.cau.cs.kieler.simulation.ui.internal.processor.UserValues
import de.cau.cs.kieler.simulation.ui.preferences.SimulationPreferences
import de.cau.cs.kieler.simulation.ui.view.SimulationControlButtons
import de.cau.cs.kieler.simulation.ui.view.pool.DataPoolView
import de.cau.cs.kieler.simulation.ui.view.pool.SimulationModeMenu
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.IJobFunction
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.statushandlers.StatusManager
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Handles the one simulation that should be shown in the UI.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SimulationUI {
    
    public static val SIMULATION_CONSOLE_NAME = "KIELER Simulation"
    
    @Accessors(PUBLIC_GETTER)
    static var SimulationContext currentSimulation
    
    @Accessors(PUBLIC_GETTER)
    static val environmentDefaults = new SimulationPreferences
    
    private static val errorReporter = new SimulationListener() {
        
        override update(SimulationContext context, SimulationEvent e) {
            if (e instanceof SimulationControlEvent) {
                switch (e.operation) {
                    case STEP: {
                        if (context.hasErrors) {
                            for (error : context.allErrors) {
                                StatusManager.getManager().handle(new Status(IStatus.ERROR, SimulationUIPlugin.PLUGIN_ID,
                                    "Error in simulation:\n " + error.message), StatusManager.SHOW)
                            }
                        }
                    }
                    default: { //nothing
                    }
                }
            }
        }
        
        override getName() {
            "Error Reporter"
        }
        
    }
    
    
    private static val cleaner = new SimulationListener() {
        
        override update(SimulationContext context, SimulationEvent e) {
            if (e instanceof SimulationControlEvent) {
                switch (e.operation) {
                    case STOP: {
                        context.reset
                    }
                    default: { //nothing
                    }
                }
            }
        }
        
        override getName() {
            "Clean up"
        }
        
    }
    
    private static val listeners = <SimulationListener>newHashSet(cleaner, errorReporter)
    @Accessors
    private static var boolean canRestartSimulation = false
    
    // ---------------------------------------------------------------------------
    
    static def setCanRestartSimulation(boolean enableRestart) {
        canRestartSimulation = enableRestart
        updateUI[
            SimulationControlButtons.instances.forEach[updateButtons(null)]
            DataPoolView.instance?.updateToolbar
        ]
    }
    
    static def stopAndRemoveSimulation() {
        // Stop
        if (currentSimulation !== null) {
            if (currentSimulation.running) {
                currentSimulation.stop
            }
        
            // Remove Listeners
            for (listener : listeners) {
                currentSimulation.deleteObserver(listener)
            }
        }
        
        currentSimulation = null
        canRestartSimulation = false
    }
    
    static def startSimulation(SimulationContext context) {
        stopAndRemoveSimulation
        
        currentSimulation = context
        
        // Add Listeners
        for (listener : listeners) {
            currentSimulation.addObserver(listener)
        }
        
        // TODO connect to preference page
        currentSimulation.startEnvironment.copyProperties(environmentDefaults)
        val console = Consoles.getConsole(SIMULATION_CONSOLE_NAME)
        currentSimulation.outputStream = console.getInfoStream()
        currentSimulation.errorStream = console.getErrorStream()
        currentSimulation.mode = SimulationModeMenu.currentMode
        
        // Add user value processor
        val root = currentSimulation.system.processors as ProcessorGroup
        root.processors.add(0, KiCoolFactory.eINSTANCE.createProcessorReference => [
            id = UserValues.ID
        ])
        
        currentSimulation.start(true)
    }
    
    static def compileAndStartSimulation(String system, Object model) {
        Job.create("Simulation Compilation", new IJobFunction() {
            
            override run(IProgressMonitor monitor) {
                monitor.beginTask("Compiling", IProgressMonitor.UNKNOWN)
                if (monitor.canceled) {return Status.CANCEL_STATUS}
                
                try {
                    val context = Compile.createCompilationContext(system, model)
                    context.startEnvironment.setProperty(Environment.INPLACE, true)
                    context.compile
                    
                    if (monitor.canceled) {return Status.CANCEL_STATUS}
                
                    if (!context.result.errors.empty) {
                        for (error : context.result.errors?.get(Environment.REPORT_ROOT)) {
                            StatusManager.getManager().handle(new Status(IStatus.ERROR, SimulationUIPlugin.PLUGIN_ID,
                                "Error in compilation for simulation:\n " + error.message), StatusManager.SHOW)
                        }
                        return Status.CANCEL_STATUS
                    }
                    
                    if (!context.result.warnings.empty) {
                        for (waring : context.result.warnings?.get(Environment.REPORT_ROOT)) {
                            StatusManager.getManager().handle(new Status(IStatus.WARNING, SimulationUIPlugin.PLUGIN_ID,
                                "Warning in compilation for simulation:\n " + waring.message), StatusManager.LOG)
                        }
                    }
                    
                    if (monitor.canceled) {return Status.CANCEL_STATUS}
                    
                    val sim = context.result.model
                    if (sim instanceof SimulationContext) {
                        monitor.taskName = "Starting Simulation"
                        sim.startSimulation()
                    } else {
                        StatusManager.getManager().handle(new Status(IStatus.ERROR, SimulationUIPlugin.PLUGIN_ID,
                            "Error in compilation for simulation:\n Resulting model is not a simulation context"), StatusManager.SHOW)
                    }
                } catch (Exception e) {
                    StatusManager.getManager().handle(new Status(IStatus.ERROR, SimulationUIPlugin.PLUGIN_ID,
                        e.getMessage(), e.getCause()), StatusManager.SHOW)
                    return Status.CANCEL_STATUS
                }
                return Status.OK_STATUS
            }
            
        }) => [
            user = true
            priority = Job.INTERACTIVE
            schedule()
        ]
    }
    
    static def registerObserver(SimulationListener listener) {
        listeners += listener
    }
    
    static def getObservers() {
        listeners.unmodifiableView
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