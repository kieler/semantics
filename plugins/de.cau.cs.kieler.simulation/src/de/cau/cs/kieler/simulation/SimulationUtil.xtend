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

import de.cau.cs.kieler.prom.FileExtensions
import de.cau.cs.kieler.prom.KiBuildExtensions
import de.cau.cs.kieler.prom.ModelImporter
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.build.FileGenerationResult
import de.cau.cs.kieler.prom.console.PromConsole
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.Simulator
import de.cau.cs.kieler.simulation.handlers.ExecutableSimulator
import de.cau.cs.kieler.simulation.handlers.Redirect
import de.cau.cs.kieler.simulation.handlers.SimulationInputFileHandler
import de.cau.cs.kieler.simulation.handlers.TraceHandler
import de.cau.cs.kieler.simulation.kisim.SimulationConfiguration
import java.io.File
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.emf.ecore.EObject

/**
 * @author aas
 *
 */
class SimulationUtil {
    static extension KiBuildExtensions kiBuildExtensions = new KiBuildExtensions
    
    public static def void startSimulation(List<IFile> files) {
        if(files.isNullOrEmpty) {
            return
        }
        if(files.size == 1) {
            val file = files.get(0)
            switch(file.fileExtension) {
                case "kisim": {
                    startKiSimFile(file)
                }
                case "simin": {
                    startSimInFile(file)
                }
                case "exe",
                case "jar",
                case "",
                case null: {
                    startExecutableFile(file)
                }
                case "sctx": {
                    compileAndSimulateModel(file)
                }
                default: {
                    throw new Exception("The file '"+file.name+"' cannot start a simulation.")
                }
            }
        } else if(files.size == 2) {
            val fileA = files.get(0)
            val fileB = files.get(1)
            if(fileA.isExecutableFile && fileB.isExecutableFile) {
                startExecutablesWithRedirect(fileA, fileB)
            } else if(fileA.isExecutableFile && fileB.isTraceFile
                   || fileB.isExecutableFile && fileA.isTraceFile) {
                // Start executable with trace
                var IFile execFile = files.findFirst[it.isExecutableFile]
                var IFile traceFile = files.findFirst[it.isTraceFile]
                if(execFile != null && traceFile != null) {
                    startExecutableWithTraceFile(execFile, traceFile)
                }
            } else {
                throw new Exception("Cannot create simulation from files "+files+"\n"
                                  + "For complex simulation configurations, please run a kisim file.")
            }
        } else {
            throw new Exception("Only one or two files can be used to start a simulation.\n"
                              + "For more complex simulation configurations, please run a kisim file.")
        }
    }
    
    public static def void startExecutablesWithRedirect(IFile fileA, IFile fileB) {
        // Start executables with redirection of inputs/outputs
        val exeA = new ExecutableSimulator
        exeA.executableFile = fileA
        
        val redirectAB = new Redirect
        redirectAB.from.value = fileA.name
        redirectAB.to.value = fileB.name
        
        val exeB = new ExecutableSimulator
        exeB.executableFile = fileB
        
        val redirectBA = new Redirect
        redirectBA.from.value = fileB.name
        redirectBA.to.value = fileA.name
        // Create simulation manager
        val simMan = new SimulationManager
        simMan.addAction(exeA)
        simMan.addAction(redirectAB)
        simMan.addAction(exeB)
        simMan.addAction(redirectBA)
        simMan.initializeSimulation
    }
    
    public static def void startExecutableWithTraceFile(IFile exeFile, IFile traceFile) {
        // Create simulation from executable
        val exeSimulator = new ExecutableSimulator
        exeSimulator.executableFile = exeFile
        
        // Create trace from eso file
        val traceHandler = new TraceHandler()
        traceHandler.tracePath.value = traceFile.fullPath.toOSString
        
        // Create new simulation with the trace
        val simMan = new SimulationManager
        simMan.addAction("write", traceHandler)
        simMan.addAction(exeSimulator)
        simMan.addAction("verify", traceHandler)
        simMan.addAction("loadNextTick", traceHandler)
        simMan.initializeSimulation
    }
    
    public static def void startKiSimFile(IFile file) {
        // Create simulation based on configuration
        val model = ModelImporter.load(file)
        if(model instanceof SimulationConfiguration) {
            val simMan = new SimulationManager(model)
            simMan.initializeSimulation
        }
    }
    
    public static def void startSimInFile(IFile file) {
        // Create simulation input handler
        val inputFileHandler = new SimulationInputFileHandler
        inputFileHandler.file = file
        startSimulator(inputFileHandler)
    }
    
    public static def void startExecutableFile(IFile file) {
        // Create simulation from executable
        val exeSimulator = new ExecutableSimulator
        exeSimulator.executableFile = file
        startSimulator(exeSimulator)
    }
    
    public static def void compileAndSimulateModel(String location) {
        val file = PromPlugin.findFile(location)
        if(file != null) {
            // The file is already inside the eclipse workspace
            compileAndSimulateModel(file)
        } else {
            throw new IllegalArgumentException("Cannot file model in location: "+location)
        }
    }
    
    public static def void compileAndSimulateModel(IFile file) {
        // Compile model (C configuration), then simulate result
        val model = ModelImporter.load(file)
        val result = compileModelForSimulation(file, model)
        startSimulationCompilationResult(result)
    }
    
    private static def void startSimulator(Simulator simulator) {
        val simMan = new SimulationManager()
        simMan.addAction(simulator)
        simMan.initializeSimulation
    }
    
    private static def void initializeSimulation(SimulationManager simMan) {
        simMan.initialize()
        PromConsole.print("\n\nNew simulation")
    }
    
    private static def boolean isExecutableFile(IFile file) {
        val jFile = new File(file.location.toOSString)
        try {
            return jFile.canExecute
        } catch(SecurityException e) {
            // The access to the file was denied, thus it cannot be executed.
            return false    
        }
    }
    
    private static def boolean isTraceFile(IFile file) {
        return FileExtensions.TRACES.contains(file.fileExtension)
    }
    
    private static def void startSimulationCompilationResult(FileGenerationResult result) {
        if(result != null && !result.createdFiles.isNullOrEmpty) {
            startSimulation(result.createdFiles)
        }
    }
    
    private static def FileGenerationResult compileModelForSimulation(IFile file, EObject model) {
        val env = StandaloneSimulationEnvironment.createCSimulationEnvironment
        env.modelFile = file
        env.build(model)
        return env.buildResult
    }
    
}