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
package de.cau.cs.kieler.simulation.ui.launch

import de.cau.cs.kieler.prom.ModelImporter
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.build.CSimulationCompiler
import de.cau.cs.kieler.prom.build.KiCoModelCompiler
import de.cau.cs.kieler.prom.build.SimulationTemplateProcessor
import de.cau.cs.kieler.prom.console.PromConsole
import de.cau.cs.kieler.simulation.SimulationPlugin
import de.cau.cs.kieler.simulation.core.DataHandler
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.Simulator
import de.cau.cs.kieler.simulation.core.StepAction
import de.cau.cs.kieler.simulation.handlers.ExecutableSimulator
import de.cau.cs.kieler.simulation.handlers.SimulationInputFileHandler
import de.cau.cs.kieler.simulation.handlers.SimulationOutputFileHandler
import de.cau.cs.kieler.simulation.kisim.SimulationConfiguration
import de.cau.cs.kieler.simulation.ui.SimulationUiPlugin
import de.cau.cs.kieler.simulation.ui.views.DataPoolView
import java.util.List
import org.eclipse.core.internal.resources.WorkspaceRoot
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.preferences.InstanceScope
import org.eclipse.debug.ui.ILaunchShortcut
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.ide.ResourceUtil
import org.eclipse.ui.statushandlers.StatusManager
import java.nio.file.Files
import java.nio.file.Paths
import java.io.File

/**
 * @author aas
 *
 */
class SimulationLaunchShortcut implements ILaunchShortcut {
    
    /**
     * The file handle from which this launch shortcut has been startet.
     */
    protected List<IFile> files = newArrayList()
    /**
     * The mode in which the shortcut was used. This is either 'run' or 'debug'.
     */
    protected String mode = ""
    /**
     * The file handle from which this launch shortcut has been startet.
     */
    protected IProject project
    
    /**
     * {@inheritDoc}
     */
    override void launch(IEditorPart editor, String mode) {
        val file = ResourceUtil.getFile(editor.editorInput)
        if (file != null) {
            this.files = #[file]
            this.project = file.project
            this.mode = mode
            launch()
        }
    }

    /**
     * {@inheritDoc}
     */
    override void launch(ISelection selection, String mode) {
        this.mode = mode
        if (selection instanceof IStructuredSelection) {
            val structuredSelection = selection as IStructuredSelection
            if (structuredSelection.firstElement instanceof IFile) {
                val file = structuredSelection.firstElement as IFile
                if(file != null) {
                    this.files = structuredSelection.toList
                    this.project = file.project
                    this.mode = mode
                    try {
                        launch()
                    } catch (Exception e){
                        val status = new Status(Status.ERROR, SimulationPlugin.PLUGIN_ID, "There was an error during simulation.", e)
                        StatusManager.getManager().handle(status, StatusManager.SHOW);
                        SimulationManager.instance.stop()
                        throw e
                    }
                }
            }    
        }
    }
    
    public def void launchLastSelection() {
        val files = loadLaunchSelection
        if(!files.isNullOrEmpty) {
            launch(files)
        }
    }
    
    private def void launch(List<IFile> files) {
        if(!files.isNullOrEmpty) {
            this.project = files.get(0).project
            this.files = files
            this.mode = "run"
            launch
        }
    }
    
    private def void launch() {
        // Save launch settings
        saveLaunchSelection()
        
        // Show data pool view
        if(DataPoolView.instance != null) {
            PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().bringToTop(DataPoolView.instance);
        }
        
        // Create simulation based on selection
        if(files.size == 1) {
            val file = files.get(0)
            var Simulator simulator
            var simMan = SimulationManager.instance
            switch(file.fileExtension) {
            case "kisim": {
                // Create simulation based on configuration
                val model = ModelImporter.load(file)
                if(model instanceof SimulationConfiguration) {
                    simMan = new SimulationManager(model)
                    simMan.initializeSimulation
                }
            }
            case "simout": {
                 // Create simulation output handler
                val outputFileHandler = new SimulationOutputFileHandler
                outputFileHandler.file = file
                if(simMan != null && !simMan.isStopped) {
                    simMan.appendAction(StepAction.Method.WRITE, outputFileHandler)
                }
            }
            case "simin": {
                // Create simulation input handler
                val inputFileHandler = new SimulationInputFileHandler
                simulator = inputFileHandler
                inputFileHandler.file = file
            }
            case "exe",
            case "jar",
            case "",
            case null: {
                // Create simulation from executable
                val exeSimulator = new ExecutableSimulator
                simulator = exeSimulator
                exeSimulator.executableFile = file
            }
            case "sct": {
                compileAndSimulateModel(file)
            }
            case "link": {
                val path = Paths.get(file.location.toOSString)
                val lines = Files.readAllLines(path)
                if(!lines.isNullOrEmpty) {
                    compileAndSimulateModel(lines.get(0))
                }
            }
            default: {
                throw new Exception("The file '"+file.name+"' cannot be simulated.")
            }
            }
            // Create simulation with the simulator
            // or append the simulator to a running simulation
            if(simulator != null) {
                if(simMan == null || simMan.isStopped) {
                    // Create new simulation
                    simMan = new SimulationManager()
                    simMan.addAction(StepAction.Method.WRITE, simulator)
                    simMan.initializeSimulation
                } else {
                    // Append to runnning simulation
                    simMan.appendSimulator(simulator)
                }
            }
        } else {
            throw new Exception("Only a single file can be used to start a simulation.\n"
                              + "For complex simulation configurations, please run a kisim file.")
        }
    }
    
    private def void compileAndSimulateModel(String location) {
        val location_path = new Path(location)
        val root = ResourcesPlugin.workspace.root
        val file = root.getFileForLocation(location_path)
        if(file != null) {
            // The file is already inside the eclipse workspace
            compileAndSimulateModel(file)
        } else {
            val monitor = null
            // Create temporary project and link file into it, to simulate it
            val temporaryProjectName = "TEMPORARY_SIM_PROJECT"
            val newProject = root.getProject(temporaryProjectName)
            if(!newProject.exists) {
                newProject.create(monitor)
                newProject.open(monitor)
            }
            val newFile = newProject.getFile(location_path.lastSegment)
            newFile.createLink(location_path, IResource.REPLACE, monitor)
            
            // Compile and simulate
            compileAndSimulateModel(newFile)
            // Delete temporary project
            newProject.delete(true, true, monitor)
        }
    }
    
    private def void compileAndSimulateModel(IFile file) {
        // Create resources for simulation
        val simTemplate = file.project.getFile("Simulation.ftl")
        val snippetFolder = file.project.getFolder("snippets")
        if(!simTemplate.exists) {
            // Create templates for simulation of C code
            val simTemplatePlatformURI = "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/Simulation.ftl"
            val createdFile = PromPlugin.initializeFile(file.project, "Simulation.ftl", simTemplatePlatformURI)
            createdFile.project.refreshLocal(1, null)
        }
        if(!snippetFolder.exists) {
            val snippetTemplatePlatformURI = "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/SimulationSnippets.ftl"
            val createdFile = PromPlugin.initializeFile(file.project, "snippets/SimulationSnippets.ftl", snippetTemplatePlatformURI)
            createdFile.project.refreshLocal(1, null)
        }
        // Compile model (C configuration), then simulate result
        val model = ModelImporter.load(file)
        // Create Simulation compiler
        val cCompiler = new CSimulationCompiler
        val modelCompiler = new KiCoModelCompiler
        // Create simulation template processor
        val simProcessor = new SimulationTemplateProcessor
        simProcessor.template.value = simTemplate.projectRelativePath.toOSString
        modelCompiler.simulationProcessor = simProcessor
        // Compile model to C code
        val result = modelCompiler.compile(file, model)
        if(!result.createdSimulationFiles.isNullOrEmpty) {
            // Compile simulation code to executable
            val simFile = result.createdSimulationFiles.get(0)
            val simCompilationResult = cCompiler.compile(simFile)
            // Launch executable
            if(!simCompilationResult.createdFiles.isNullOrEmpty) {
                val executable = simCompilationResult.createdFiles.get(0)
                launch(#[executable])
            }
        }
    }
    
    private def void initializeSimulation(SimulationManager simMan) {
        simMan.initialize()
        PromConsole.print("\n\nNew simulation")
        PromConsole.print("Initial pool:"+simMan.currentPool)
    }
    
    private def void appendAction(SimulationManager simMan, StepAction.Method method, DataHandler handler) {
        simMan.addAction(method, handler)
        PromConsole.print("Appended "+handler)
    }
    
    private def void appendSimulator(SimulationManager simMan, Simulator simulator) {
        simMan.addAction(StepAction.Method.WRITE, simulator)
        simMan.append(simulator)
        PromConsole.print("Appended "+simulator)
        PromConsole.print("New pool:"+simMan.currentPool)
    }
    
    private def List<IFile> loadLaunchSelection() {
        val prefs = InstanceScope.INSTANCE.getNode(SimulationUiPlugin.PLUGIN_ID)
        val pathCSV = prefs.get(SimulationUiPlugin.LAST_LAUNCHED_SELECTION, "")
        val paths = pathCSV.split(",")
        val List<IFile> files = newArrayList
        val workspaceRoot = ResourcesPlugin.workspace.root
        for(path : paths){
            val file = workspaceRoot.findMember(path)
            if(file != null && file.exists && file.type == IResource.FILE){
                files.add(file as IFile)
            }
        }
        return files
    }
    
    private def void saveLaunchSelection() {
        val prefs = InstanceScope.INSTANCE.getNode(SimulationUiPlugin.PLUGIN_ID)
        var String pathCSV = ""
        for(f : files) {
            if(!pathCSV.isNullOrEmpty)
                pathCSV += ","
            pathCSV += f.fullPath
        }
        prefs.put(SimulationUiPlugin.LAST_LAUNCHED_SELECTION, pathCSV)
    }
}