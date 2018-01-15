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
package de.cau.cs.kieler.simulation

import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.console.PromConsole
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.handlers.TraceHandler
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.SubMonitor
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.prom.FileExtensions.*

/**
 * @author aas
 *
 */
class SimulationUtil {
    
    @Accessors(PUBLIC_GETTER)
    private static List<IFile> lastFiles
    @Accessors(PUBLIC_GETTER)
    private static EObject lastEObject
    
    @Accessors(PUBLIC_GETTER)
    private static boolean startingSimulation
    
    /**
     * Restarts the last simulation.
     */
    public static def void restartLastSimulation() {
        if(lastFiles !== null || lastEObject !== null) {
            PromPlugin.execInJob("Restaring Simulation", [SubMonitor childMonitor |
                if(!lastFiles.isNullOrEmpty) {
                    startSimulation(lastFiles, childMonitor)
                } else if(lastEObject !== null) {
                    startSimulation(lastEObject, childMonitor)
                }
            ])    
        }
    }
    
    /**
     * @see startSimulation(List<IFile> files, IProgressMonitor monitor)
     */
    public static def void startSimulation(List<IFile> files) {
        PromPlugin.execInJob("Starting simulation", [monitor |
            startSimulation(files, monitor)
        ])
    }
    
    /**
     * Starts a simulation from the given files.
     * The files can contain a kisim file, simin file, trace file or executables.
     */
    public static def void startSimulation(List<IFile> files, IProgressMonitor monitor) {
        if(files.isNullOrEmpty) {
            return
        }
        // Remember this configuration for a restart
        lastFiles = files
        lastEObject = null
        synchronizedStart[
            // Start a new simulation
            val context = new SimulationContext
            context.monitor = monitor
            for(file : files) {
                if(isSimulationConfiguration(file)) {
                    context.kisimFile = file
                } else if(isTrace(file)) {
                    context.traceFile = file
                } else if(isSimulationInput(file)) {
                    context.simInFile = file
                } else if(isModel(file)) {
                    context.compileModelForSimulation(file)
                } else if(isExecutable(file)) {
                    // The check for executables has to be the last check, because Windows
                    // seems to recognize other files than an exe as executable.
                    context.executableFiles.add(file)
                }
            }
            context.start    
        ]
    }
    
    /**
     * @see startSimulation(EObject model, SubMonitor monitor)
     */
    public static def void startSimulation(EObject model) {
        PromPlugin.execInJob("Starting simulation", [monitor |
            startSimulation(model, monitor)
        ])
    }
    
    /**
     * Starts a simulation by compiling an EObject using a suited compile chain
     * and afterwards starting the executable result.
     */
    public static def void startSimulation(EObject model, SubMonitor monitor) {
        // Remember this configuration for a restart
        lastEObject = model
        lastFiles = null
        synchronizedStart[
            // Start simulation with the model
            val context = new SimulationContext
            context.monitor = monitor
            // Compile the model
            context.compileModelForSimulation(model)
            // Start the simulation
            context.start
        ]
    }
    
    /**
     * Add files to change a running simulation.
     * Can be used to add a trace to a running simulation.
     * 
     * @param files The files to be added to the simulation
     */
    public static def void appendToSimulation(List<IFile> files) {
        if(files.isNullOrEmpty) {
            return
        }
        if(files.size > 1) {
            throw new Exception("Only a single trace can be added to a running simulation.")
        }
        val file = files.get(0)
        
        if(isTrace(file)) {
            appendTraceToSimulation(file)
        } else {
            throw new Exception("Only a trace can be added to a running simulation.")    
        }
    }
    
    /**
     * Adds a trace file to a running simulation.
     * Reading the trace is done first, then comes the original simulation,
     * and afterwards its results are checked against the trace.
     * 
     * @param traceFile The trace file
     */
    private static def void appendTraceToSimulation(IFile traceFile) {
        val sim = SimulationManager.instance
        if(sim !== null && !sim.isStopped) {
            var TraceHandler traceHandler
            if(traceFile !== null && traceFile.exists) {
                traceHandler = new TraceHandler()
                traceHandler.tracePath.value = traceFile.fullPath.toOSString
                traceHandler.initialize
                sim.prependAction("write", traceHandler)
                sim.addAction("check", traceHandler)
                sim.addAction("loadNextTick", traceHandler)
                
                PromConsole.print("Added trace to running simulation")
            }
        }
    }
    
    /**
     * Executes the given procedure only if no other synchronizedStart is currently beeing executed.
     * This is used to finish starting one simulation before starting the next simulation.
     * Otherwise harsh bugs and exceptions can occur.
     * <br /><br />
     * Note that this is different from using Java's synchronized methods, because they are blocking,
     * queueing all simulation starts and then performing them one after the other.
     * Using synchronizedStart instead, the additional simulation starts are ignored until the currently running is fully started.
     * This is more useful for issues such as, clicking the start simulation button twice by accident. Starting it once is enough in this case. 
     */
    private static def void synchronizedStart(()=>void procedure) {
        if(!startingSimulation) {
            try {
                startingSimulation = true
                procedure.apply()    
            } finally {
                startingSimulation = false    
            }
        }
    }
}