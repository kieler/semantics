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

import com.google.common.io.Files
import de.cau.cs.kieler.prom.KiBuildExtensions
import de.cau.cs.kieler.prom.ModelImporter
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.build.FileGenerationResult
import de.cau.cs.kieler.prom.console.PromConsole
import de.cau.cs.kieler.prom.kibuild.BuildConfiguration
import de.cau.cs.kieler.prom.templates.TemplateManager
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.Simulator
import de.cau.cs.kieler.simulation.core.StepAction
import de.cau.cs.kieler.simulation.handlers.ExecutableSimulator
import de.cau.cs.kieler.simulation.handlers.Redirect
import de.cau.cs.kieler.simulation.handlers.SimulationInputFileHandler
import de.cau.cs.kieler.simulation.handlers.Trace
import de.cau.cs.kieler.simulation.kisim.SimulationConfiguration
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.XtextResourceSet

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
        simMan.addAction(StepAction.Method.WRITE, exeA)
        simMan.addAction(StepAction.Method.WRITE, redirectAB)
        simMan.addAction(StepAction.Method.WRITE, exeB)
        simMan.addAction(StepAction.Method.WRITE, redirectBA)
        simMan.initializeSimulation
    }
    
    public static def void startExecutableWithTrace(IFile exeFile, EObject trace) {
        // Create simulation from executable
        val exeSimulator = new ExecutableSimulator
        exeSimulator.executableFile = exeFile
        
        // Create trace from eso file
        val traceHandler = new Trace()
        traceHandler.traceModel = trace
        
        // Create new simulation with the trace
        val simMan = new SimulationManager
        simMan.addAction(StepAction.Method.WRITE, traceHandler)
        simMan.addAction(StepAction.Method.WRITE, exeSimulator)
        simMan.addAction(StepAction.Method.READ, traceHandler)
        simMan.initializeSimulation
    }
    
    public static def void startExecutableWithTraceFile(IFile exeFile, IFile traceFile) {
        // Create simulation from executable
        val exeSimulator = new ExecutableSimulator
        exeSimulator.executableFile = exeFile
        
        // Create trace from eso file
        val traceHandler = new Trace()
        traceHandler.tracePath.value = traceFile.fullPath.toOSString
        
        // Create new simulation with the trace
        val simMan = new SimulationManager
        simMan.addAction(StepAction.Method.WRITE, traceHandler)
        simMan.addAction(StepAction.Method.WRITE, exeSimulator)
        simMan.addAction(StepAction.Method.READ, traceHandler)
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
            val monitor = null
            // Create temporary project and link file into it, to simulate it
            val tmpProject = createTemporarySimulationProject
            val location_path = new Path(location)
            val newFile = tmpProject.getFile(location_path.lastSegment)
            newFile.createLink(location_path, IResource.REPLACE, monitor)
            
            // Compile and simulate
            compileAndSimulateModel(newFile)
            // Delete temporary project
            tmpProject.delete(true, true, monitor)
        }
    }
    
    public static def void compileAndSimulateModel(IFile file) {
        // Compile model (C configuration), then simulate result
        val model = ModelImporter.load(file)
        val result = compileModelForSimulation(file, model)
        startSimulationCompilationResult(result)
    }
    
    public static def void compileAndSimulateModel(EObject model) {
        // Create temporary project
        val tmpProject = createTemporarySimulationProject
        // Create dummy file for the model.
        // Note that it is not necessary to save the model in the file
        // because it is only used for path and location operations.
        var modelName = TemplateManager.getModelName(model)
        if(modelName == null) {
            modelName = "SimulatedEObject.sctx"
        } else if(Files.getFileExtension(modelName).isNullOrEmpty){
            modelName = modelName+".sctx"
        }
        val file = tmpProject.getFile(modelName)
        
        // Compile model (C configuration), then simulate result
        val result = compileModelForSimulation(file, model)
        startSimulationCompilationResult(result)
        
        // Delete temporary project
        tmpProject.delete(true, null)
    }
    
    public static def void compileAndSimulateModelWithTrace(EObject model, EObject trace) {
        // Create temporary project
        val tmpProject = createTemporarySimulationProject
        // Create dummy file for the model.
        // Note that it is not necessary to save the model in the file
        // because it is only used for path and location operations.
        val file = tmpProject.getFile("SimulatedEObject.sctx")
        
        // Compile model, then simulate result
        val result = compileModelForSimulation(file, model)
        if(result != null && !result.createdFiles.isNullOrEmpty) {
            val exeFile = result.createdFiles.get(0)
            startExecutableWithTrace(exeFile, trace)
        }
        
        // Delete temporary project
        tmpProject.delete(true, null)
    }
    
    public static def void compileAndSimulateModelWithTraceFile(EObject model, IFile traceFile) {
        // Create temporary project
        val tmpProject = createTemporarySimulationProject
        // Create dummy file for the model.
        // Note that it is not necessary to save the model in the file
        // because it is only used for path and location operations.
        val file = tmpProject.getFile("SimulatedEObject.sctx")
        
        // Compile model (C configuration), then simulate result
        val result = compileModelForSimulation(file, model)
        if(result != null && !result.createdFiles.isNullOrEmpty) {
            val executableAndTrace = newArrayList
            executableAndTrace.addAll(result.createdFiles)
            executableAndTrace.add(traceFile)
            startSimulation(executableAndTrace)
        }
        
        // Delete temporary project
        tmpProject.delete(true, null)
    }
    
    private static def void startSimulator(Simulator simulator) {
        val simMan = new SimulationManager()
        simMan.addAction(StepAction.Method.WRITE, simulator)
        simMan.initializeSimulation
    }
    
    private static def void initializeSimulation(SimulationManager simMan) {
        simMan.initialize()
        PromConsole.print("\n\nNew simulation")
    }
    
    private static def boolean isExecutableFile(IFile file) {
        if(file.fileExtension == null) {
            return true
        } else {
            return #["", "exe", "jar"].contains(file.fileExtension)
        }
    }
    
    private static def boolean isTraceFile(IFile file) {
        return #["eso", "sim"].contains(file.fileExtension)
    }
    
    private static def IProject createTemporarySimulationProject() {
        val root = ResourcesPlugin.getWorkspace.getRoot
        val temporaryProjectName = "TEMPORARY_SIM_PROJECT"
        val newProject = root.getProject(temporaryProjectName)
        if(!newProject.exists) {
            newProject.create(null)
            newProject.open(null)
        }
        return newProject
    }
    
    private static def void startSimulationCompilationResult(FileGenerationResult result) {
        if(result != null && !result.createdFiles.isNullOrEmpty) {
            startSimulation(result.createdFiles)
        }
    }
    
    private static def FileGenerationResult compileModelForSimulation(IFile file, EObject model) {
        val result = new FileGenerationResult
        // Create required resources if there are none yet
        createResourcesForSimulation(file.project)

        // Load default kibuild file
        val defaultKiBuildFile = "platform:/plugin/de.cau.cs.kieler.prom/resources/default.kibuild"
        val uri = URI.createURI(defaultKiBuildFile);
        val resourceSet = new XtextResourceSet
        val resource = resourceSet.getResource(uri, true);
        if(resource != null && !resource.contents.isEmpty) {
            val buildConfig = resource.contents.get(0) as BuildConfiguration
            val modelCompilers = buildConfig.createModelCompilers
            val simulationCompilers = buildConfig.createSimulationCompilers
            
            // Compile model
            for(modelCompiler : modelCompilers) {
                val modelCompilationResult = modelCompiler.compile(file, model)
                if(!modelCompilationResult.createdSimulationFiles.isNullOrEmpty) {
                    // Compile simulation code to executable
                    for(simulationCompiler : simulationCompilers) {
                        for(simFile : modelCompilationResult.createdSimulationFiles) {
                            val simCompilationResult = simulationCompiler.compile(simFile)
                            result.createdFiles.addAll(simCompilationResult.createdFiles)
                            result.problems.addAll(simCompilationResult.problems)
                        }
                    }
                }
            }
        }
        return result
    }
    
    private static def void createResourcesForSimulation(IProject project) {
        // Create resources for simulation
        val simTemplate = project.getFile("CSimulation.ftl")
        val assetsFolder = project.getFolder("assets")
        if(!simTemplate.exists) {
            // Create templates for simulation of C code
            val simTemplatePlatformURI = "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/CSimulation.ftl"
            val createdFile = PromPlugin.initializeFile(project, "assets/CSimulation.ftl", simTemplatePlatformURI)
            createdFile.project.refreshLocal(1, null)
        }
        if(!assetsFolder.exists) {
            val snippetTemplatePlatformURI = "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/SimulationSnippets.ftl"
            val createdFile = PromPlugin.initializeFile(project, "assets/CSimulationSnippets.ftl", snippetTemplatePlatformURI)
            createdFile.project.refreshLocal(1, null)
        }
    }
}