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
package de.cau.cs.kieler.simulation.ide

import de.cau.cs.kieler.core.services.KielerServiceLoader
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.simulation.SimulationContext
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.IJobFunction
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.simulation.events.ISimulationListener

/**
 * Handles the one central simulation that can be access in the regular UI.
 * 
 * @author als
 */
class CentralSimulation {

    @Accessors
    static var boolean canRestartSimulation = false


    @Accessors(PUBLIC_GETTER)
    static var SimulationContext currentSimulation
    static val PROVIDERS = KielerServiceLoader.load(de.cau.cs.kieler.simulation.ide.ISimulationListenerProvider)
    static val LISTENERS = <ISimulationListener>newLinkedHashSet(PROVIDERS.map[getListeners].filterNull.flatten.filterNull)
    
    static def addListener(ISimulationListener listener) {
        LISTENERS += listener
        if (currentSimulation !== null) {
            currentSimulation.addObserver(listener)
        }
    }
    
    static def removeListener(ISimulationListener listener) {
        LISTENERS -= listener
        if (currentSimulation !== null) {
            currentSimulation.deleteObserver(listener)
        }
    }
    
    static def getListeners() {
        return LISTENERS.unmodifiableView
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
    }
    
    static def startSimulation(SimulationContext context) {
        prepareSimulation(context)
        
        currentSimulation.start(true)
    }
    
    static def prepareSimulation(SimulationContext context) {
        
        stopAndRemoveSimulation
        
        currentSimulation = context
        
        for (listener : listeners) {
            // Add Listeners
            currentSimulation.addObserver(listener)
        }
        
        for (provider : PROVIDERS) {
            // Prepare context
            provider.prepareNewSimulation(currentSimulation)
        }
    }
    
    static def compileAndStartSimulation(String system, Object model) {
        compileAndStartSimulation(system, model, null)
    }
    
    static def compileAndStartSimulation(String system, Object model, Environment startEnvironment) {
        Job.create("Simulation Compilation", new IJobFunction() {
            
            override run(IProgressMonitor monitor) {
                monitor.beginTask("Compiling", IProgressMonitor.UNKNOWN)
                if (monitor.canceled) {return Status.CANCEL_STATUS}
                
                try {
                    val context = Compile.createCompilationContext(system, model)
                    context.startEnvironment.setProperty(Environment.INPLACE, true)
                    context.startEnvironment.copyProperties(startEnvironment)
                    context.compile
                    
                    if (monitor.canceled) {return Status.CANCEL_STATUS}
                
                    if (context.hasErrors) {
                        new Exception("Error(s) in compilation for simulation", new Throwable(context.allErrors.map[message].toSet.join("\n"))).handleError
                    }
                    
                    if (monitor.canceled) {return Status.CANCEL_STATUS}
                    
                    val sim = context.result.model
                    if (sim instanceof SimulationContext) {
                        monitor.taskName = "Starting Simulation"
                        sim.startSimulation()
                    } else {
                        new Exception("Error in compilation for simulation:\n Resulting model is not a simulation context").handleError
                    }
                } catch (Exception e) {
                    e.handleError
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
    
    private static def handleError(Exception e) {
        PROVIDERS.forEach[it.handleError(e)]
    }

}
