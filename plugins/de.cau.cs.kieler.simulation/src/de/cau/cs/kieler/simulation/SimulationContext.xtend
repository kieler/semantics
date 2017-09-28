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

import de.cau.cs.kieler.prom.KiBuildExtensions
import de.cau.cs.kieler.prom.ModelImporter
import de.cau.cs.kieler.prom.build.BuildProblem
import de.cau.cs.kieler.prom.build.KielerModelingBuilder
import de.cau.cs.kieler.prom.build.compilation.KiCoModelCompiler
import de.cau.cs.kieler.prom.console.PromConsole
import de.cau.cs.kieler.prom.data.EnvironmentData
import de.cau.cs.kieler.prom.templates.ModelAnalyzer
import de.cau.cs.kieler.simulation.backends.SimulationBackend
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.core.events.SimulationEvent
import de.cau.cs.kieler.simulation.core.events.SimulationListener
import de.cau.cs.kieler.simulation.core.events.SimulationOperation
import de.cau.cs.kieler.simulation.handlers.ExecutableSimulator
import de.cau.cs.kieler.simulation.handlers.Redirect
import de.cau.cs.kieler.simulation.handlers.SimulationInputFileHandler
import de.cau.cs.kieler.simulation.handlers.TraceHandler
import de.cau.cs.kieler.simulation.kisim.SimulationConfiguration
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.preferences.InstanceScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors
import org.osgi.service.prefs.Preferences
import de.cau.cs.kieler.prom.PromPlugin

/**
 * @author aas
 *
 */
class SimulationContext {
    static extension KiBuildExtensions kiBuildExtensions = new KiBuildExtensions
    
    public static val TEMPORARY_PROJECT_NAME = "TEMPORARY_SIM_PROJECT"
    
    public static val DELETE_TEMPORARY_PROJECT_ATTR = "deleteTemporarySimulationProject"
    
    // Fields for starting the simulation
    public var IFile kisimFile
    
    public var IFile traceFile
    
    public var IFile simInFile
    
    public var List<IFile> executableFiles = newArrayList
    
    // Fields for model compilation to executables, which are used to start the simulation afterwards
    @Accessors(PUBLIC_GETTER)
    private var EObject model
    @Accessors(PUBLIC_GETTER)
    private var IFile modelFile
    
    private var ModelAnalyzer modelAnalyzer
    
    @Accessors(PUBLIC_GETTER)
    private var SimulationBackend simulationBackend
    
    private var boolean initializedProject
    
    /**
     * Simulation listener to delete the temporary simulation project after the simulation.
     */
    private static val listener = new SimulationListener() {
        override update(SimulationEvent e) {
            // Delete the temporary project if it is configured this way
            if(!deleteTemporaryProject) {
                return
            }
            if(e instanceof SimulationControlEvent) {
                if(e.operation == SimulationOperation.STOP) {
                    val root = ResourcesPlugin.getWorkspace.getRoot
                    val project = root.getProject(SimulationContext.TEMPORARY_PROJECT_NAME)
                    project.delete(false, null)
                }
            }
        }
    }
    
    public static def setDeleteTemporaryProject(boolean value) {
        preferences.putBoolean(DELETE_TEMPORARY_PROJECT_ATTR, value)
    }
    
    public static def getDeleteTemporaryProject() {
        preferences.getBoolean(DELETE_TEMPORARY_PROJECT_ATTR, true)
    }
    
    /**
     * Constructor
     */
    new() {
        SimulationManager.instance?.stop
    }
    
    public def void start() {
        // Add simulation listener if not done yet
        SimulationManager.addListener(listener)
        // Compile models if required
        compileModels
        startSimulation
    }
    
    public def void setSimulationBackend(SimulationBackend simulationBackend) {
        this.simulationBackend = simulationBackend
        initializedProject = false
    }
    
    public def void setModel(EObject value) {
        if(value == null) {
            model = null
            modelFile = null
            return
        }
        // Find a suited model analyzer
        modelAnalyzer = ModelAnalyzer.analyzers.findFirst[it.isSupported(value)]
        if(modelAnalyzer != null) {
            model = value
            // Create a (virtual) file for the source model
            modelFile = temporaryProject.getFile("model."+modelAnalyzer.supportedFileExtensions.get(0))
            PromPlugin.createResource(modelFile)
        } else {
            throw new Exception("Cannot create a simulation. No model analyzer was found for "+model)    
        }
    }
    
    public def void setModelFile(IFile value) {
        if(value == null) {
            model = null
            modelFile = null
            return
        }
        val loadedModel = ModelImporter.load(value)
        setModel(loadedModel)
    }
    
    private def void startSimulation() {
        // Check consistency
        if(kisimFile == null && executableFiles.isNullOrEmpty) {
            throw new Exception("No kisim file or executables are set to start a simulation.")
        }
        if(executableFiles.size > 2) {
            throw new Exception("Only one or two executables can be used to start a simulation.\n"
                              + "For more complex simulation configurations, please run a kisim file.")
        }
        if(traceFile != null && executableFiles.size > 1) {
            throw new Exception("A trace file can only be used together with a single executable.\n"
                              + "For more complex simulation configurations, please run a kisim file.")
        }
        
        // Configure simulation
        var sim = new SimulationManager
        // Create simulation input handler
        if(simInFile != null) {
            val simInHandler = new SimulationInputFileHandler
            simInHandler.file = simInFile
            sim.addAction(simInHandler)
        }
        // Add trace handler to set the inputs of the executable
        var TraceHandler traceHandler
        if(traceFile != null) {
            traceHandler = new TraceHandler()
            traceHandler.tracePath.value = traceFile.fullPath.toOSString
            sim.addAction("write", traceHandler)
        }
        // Add executables
        if(!executableFiles.isNullOrEmpty) {
            for(exeFile : executableFiles) {
                // Create handler for this executable
                val exeHandler = new ExecutableSimulator
                exeHandler.executableFile = exeFile
                sim.addAction(exeHandler)
                // Create redirect from this executable to all other executables
                for(exeFile2 : executableFiles) {
                    if(exeFile != exeFile2) {
                        val redirect = new Redirect
                        redirect.from.value = exeFile.name
                        redirect.to.value = exeFile2.name
                        sim.addAction(redirect)
                    }
                }
            }
        }
        // Check the trace after the executables performed their tick
        if(traceHandler != null) {
            sim.addAction("check", traceHandler)
            sim.addAction("loadNextTick", traceHandler)
        }
        // Configure simulation from kisim file. Note that configuration from the other fields is lost here.
        if(kisimFile != null) {
            val kisimModel = ModelImporter.load(kisimFile)
            if(kisimModel instanceof SimulationConfiguration) {
                sim = new SimulationManager(kisimModel)
            }
        }
        // Initialize simulation
        sim.initialize
        PromConsole.print("\n\nNew Simulation")
    }
    
    private def void compileModels() {
        if(model == null) { 
            return    
        }
        // Check consistency
        if(simulationBackend == null) {
            throw new Exception("Cannot create a simulation. No backend for compilation was set.")
        }
        
        // Initialize project
        if(!initializedProject) {
            if(projectDraft != null) {
                projectDraft.createInitialResources(modelFile.project)
                initializedProject = true
            }
        }
        
        // Prepare build configuration
        val buildConfig = simulationBackend.buildConfig
        val modelCompilers = buildConfig.createModelCompilers
        val simulationCompilers = buildConfig.createSimulationCompilers
        // Add frontend to model compiler
        if(!modelAnalyzer.simulationFrontend.isNullOrEmpty) {
            for(modelCompiler : modelCompilers) {
                if(modelCompiler instanceof KiCoModelCompiler) {
                    val oldCompileChain = modelCompiler.compilationSystem.value
                    // Create list from CSV of compilation system ids / processor ids
                    val frontend = newArrayList
                    frontend.addAll(modelAnalyzer.simulationFrontend.split(","))
                    if(oldCompileChain instanceof List) {
                        frontend.addAll(oldCompileChain)
                    } else if(oldCompileChain instanceof String) {
                        frontend.add(oldCompileChain)
                    }
                    // Set new compile chain
                    modelCompiler.compilationSystem.value = frontend 
                }
            }
        }
        
        // Compile model
        for (modelCompiler : modelCompilers) {
            val modelCompilationResult = modelCompiler.compile(modelFile, model)
            // Check result for errors
            checkErrors(modelCompilationResult.problems)
            
            // Compile simulation code to executable
            for (simulationCompiler : simulationCompilers) {
                for (simFile : modelCompilationResult.createdSimulationFiles) {
                    val simCompilationResult = simulationCompiler.compile(simFile)
                    // Check result for errors
                    checkErrors(simCompilationResult.problems)
                    
                    // Add the created executables to the executables that should be simulated
                    executableFiles.addAll(simCompilationResult.createdFiles)
                }
            }
        }
    }
    
    /**
     * Displays all problems in the workspace.
     * 
     * @return true if there is a build problem that is an error, false otherwise.
     */
    private def void checkErrors(List<BuildProblem> problems) {
        if(problems.isNullOrEmpty) {
            return
        }
        KielerModelingBuilder.showBuildProblems(problems)
        if(!problems.isNullOrEmpty) {
            throw new Exception("Errors occured when creating the simulation:\n"+problems.map[it.message].join("\n"))
        }
    }
    
    /**
     * Creates the temporary project for simulation if not done yet.
     * 
     * @return The temporary project for simulation
     */
    private def IProject getTemporaryProject() {
        val root = ResourcesPlugin.getWorkspace.getRoot
        val project = root.getProject(TEMPORARY_PROJECT_NAME)
        if (!project.exists) {
            project.create(null)
            project.open(null)
        }
        return project
    }
    
    /**
     * Returns the preferences in which the attributes are stored.
     */
    private static def Preferences getPreferences() {
        return InstanceScope.INSTANCE.getNode(SimulationPlugin.PLUGIN_ID)
    }
    
    /**
     * Returns the project draft from the simulation backend,
     * which is used to initialize the temporary simulation project with resources required for simulation compilation.
     */
    private def EnvironmentData getProjectDraft() {
        return simulationBackend?.projectDraft
    }
}