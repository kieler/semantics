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
package de.cau.cs.kieler.prom.build.simulation

import com.google.common.base.Charsets
import com.google.common.io.CharStreams
import com.google.common.io.Files
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.build.BuildProblem
import de.cau.cs.kieler.prom.build.FileGenerationResult
import de.cau.cs.kieler.prom.build.KielerModelingBuilder
import de.cau.cs.kieler.prom.configurable.Configurable
import de.cau.cs.kieler.prom.configurable.ConfigurableAttribute
import de.cau.cs.kieler.prom.configurable.ResourceSubstitution
import de.cau.cs.kieler.prom.configurable.Substitution
import de.cau.cs.kieler.prom.console.PromConsole
import java.io.File
import java.io.InputStreamReader
import java.util.List
import java.util.concurrent.TimeUnit
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.Assert
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Compiles generated code to an executable for use in the simulation.
 * The simulation communicates via JSON, thus a JSON library is typically required 
 * and must be linked with the main file for simulation.
 * 
 * @author aas
 *
 */
abstract class SimulationCompiler extends Configurable {
    
    /**
     * The listeners that are notified before an old executable is deleted to be replaced with a new one. 
     */
    protected static val listeners = <SimulationCompilerListener> newArrayList
    
    /**
     * The command that is executed to compile the simulation code.
     */
    public val command = new ConfigurableAttribute("command", null, #[String])
    /**
     * The output folder in which the simulation should be saved.
     */
    public val outputFolder = new ConfigurableAttribute("outputFolder", "kieler-gen/sim/bin", #[String])
    /**
     * A library folder required for the simulation that must be created if it does not exist yet. 
     */
    public val libFolder = new ConfigurableAttribute("libFolder", "kieler-gen/sim/lib", #[String])
    /**
     * The maximum allowed compilation time in seconds.
     * If the compilation takes longer than this, the process is terminated and an exception is thrown. 
     */
    public val timeout = new ConfigurableAttribute("timeout", 10, #[Integer])
    
    /**
     * Placeholder for the file to be compiled.
     */
    private val fileSubstitution = new ResourceSubstitution("file") {
        override getValue() {
            return file
        }
    }
    /**
     * Placeholder for the file to be created.
     */
    private val execFileSubstitution = new ResourceSubstitution("executable") {
        override getValue() {
            return executableFile
        }
    }
    /**
     * Placeholder for the output folder.
     */
    private val outputFolderSubstitution = new ResourceSubstitution("outputFolder") {
        override getValue() {
            return project.getFolder(outputFolder.stringValue)
        }
    }
    /**
     * Placeholder for the library folder.
     */
    private val libFolderSubstitution = new ResourceSubstitution("libFolder") {
        override getValue() {
            return project.getFolder(libFolder.stringValue)
        }
    }
    /**
     * A list of all placeholders
     */
    protected val substitutions = #[fileSubstitution, execFileSubstitution, outputFolderSubstitution, libFolderSubstitution]
    
    /**
     * The result of the compilation.
     */
    @Accessors(PUBLIC_GETTER)
    protected FileGenerationResult result
    /**
     * Optional monitor to show the progress of the compilation.
     */
    @Accessors(PUBLIC_SETTER)
    protected var IProgressMonitor monitor
    
    /**
     * The file to be compiled.
     */
    protected var IFile file
    /**
     * The output file that is created.
     */
    protected var IFile executableFile
    
    /**
     * Returns the file extensions of compatible files that can be compiled.
     * 
     * @return the file extensions of compatible files.
     */
    abstract public def String[] getSupportedFileExtensions()
    
    /**
     * Returns the origin (a URI using the platform protocol of eclipse) for the library to be created.
     * If null or an empty string is returned, then the lib folder will not be initialized.
     * 
     * @return the origin of the lib folder, e.g., "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/cJSON"
     */
    abstract protected def String getLibFolderOrigin()
    
    /** 
     * Adds a listener
     * 
     * @param listener The listener
     */
    public static def void addListener(SimulationCompilerListener listener) {
        if(!listeners.contains(listener)) {
            listeners.add(listener)    
        }
    }
    
    /**
     * Removes a listener
     * @param listener The listener
     */
    public static def void removeListener(SimulationCompilerListener listener) {
        listeners.remove(listener)
    }
    
    /**
     * Constructor
     */
    new() {
        super()
    }
    
    /**
     * Constructor
     * 
     * @param monitor The monitor
     */
    new(IProgressMonitor monitor) {
        this.monitor = monitor
    }
    
    /**
     * Compiles the given file
     * 
     * @param file The file to be compiled
     */
    public def FileGenerationResult compile(IFile file) {
        this.file = file
        // Create libraries and files required for compilation
        initializeCompilation
        
        // Run command on simulation code
        val processArguments = getProcessArguments
        val processDirectory = getProcessDirectory
        result = startProcess(processDirectory, processArguments)
        // Notify listeners
        for(l : listeners) {
            l.afterCompilation(this)
        }
        return result
    }
    
    /**
     * Configures this instance using the given configuration.
     * 
     * @param config The configuration
     */
    public def void initialize(de.cau.cs.kieler.prom.kibuild.SimulationCompiler config) {
        this.updateConfigurableAttributes(config.attributes)
    }
    
    /**
     * Checks whether the file can be compiled using this instance.
     * 
     * @param file The file to be compiled
     * @return true if the file can be compiled, false otherwise.
     */
    public def boolean canCompile(IFile file) {
        return supportedFileExtensions.contains(file.fileExtension)
    }
    
    /**
     * Returns the executable file to be created
     * 
     * @param the executable to be created
     */
    protected def IFile getExecutableFile() {
        val isWindows = System.getProperty("os.name").toLowerCase.contains("win")
        val executableName = Files.getNameWithoutExtension(file.name) + if(isWindows) ".exe" else ""
        val executablePath = new Path(outputFolder.stringValue).append(executableName)
        executableFile = project.getFile(executablePath)
    }
    
    /**
     * Returns the working directory of the compilation process.
     * 
     * @return the working directory of the compilation process.
     */
    protected def File getProcessDirectory() {
        return project.location.toFile
    }
    
    /**
     * Returns the single arguments for the compilation process.
     * 
     * @return the single arguments for the compilation process.
     */
    protected def Iterable<String> getProcessArguments() {
        val commandWithoutPlaceholders = Substitution.performSubstitutions(command.stringValue, substitutions)
        return PromPlugin.splitStringOnWhitespace(commandWithoutPlaceholders)
    }
    
    /**
     * Prepares the compilation.
     */
    protected def void initializeCompilation() {
        Assert.isNotNull(command.stringValue)
        Assert.isNotNull(outputFolder.stringValue)
        Assert.isNotNull(libFolder.stringValue)
        if(monitor != null) {
            monitor.subTask("Compiling simulation:" + file.name)
        }
        executableFile = getExecutableFile
        // Remove old file
        if(executableFile.exists) {
            // Notify listeners that the executable is going to be deleted
            val listenersCopy =  listeners.clone as List<SimulationCompilerListener>
            for(listener : listenersCopy) { 
                listener.preDelete(executableFile)
            }
            executableFile.delete(true, null)
        }
        // Remove markers from old simulation file
        KielerModelingBuilder.deleteMarkers(file)
        
        // Create output folder
        if(!outputFolder.stringValue.isNullOrEmpty) {
            val outputFolderResource = project.getFolder(outputFolder.stringValue)
            PromPlugin.createResource(outputFolderResource)
        }
        
        // Create lib folder
        createLibrary(project)
    }
    
    /**
     * Initializes the lib folder by copying some origin
     * @param project the project to copy the files into
     */
    protected def void createLibrary(IProject project) {
        val libFolderOrigin = getLibFolderOrigin
        if(!libFolderOrigin.isNullOrEmpty) {
            val libPath = new Path(libFolder.stringValue)
            val libFolder = project.getFolder(libPath)
            if(!libFolder.exists) {
                PromPlugin.initializeFolder(project, libPath.toOSString, libFolderOrigin)
                libFolder.parent.refreshLocal(1, null)
            }
        }
    }
        
    /**
     * Returns the project of the file to be compiled.
     * 
     * @return the project of the file to be compiled.
     */
    protected def IProject getProject() {
        return file.project
    }
    
    /**
     * Starts the process in the given directory with the given arguments.
     * 
     * @param directory The working directory for the process
     * @param arguments The arguments for the process
     * @return The result of the compilation
     */
    protected def FileGenerationResult startProcess(File directory, String... arguments) {
        val result = new FileGenerationResult
        val pBuilder = new ProcessBuilder(arguments)
        pBuilder.directory(directory)
        pBuilder.redirectErrorStream(true)
        val p = pBuilder.start()
        // Wait until the process finished
        var Exception exception
        if(!p.waitFor(timeout.intValue, TimeUnit.SECONDS)) {
            exception = new Exception("Simulation compiler took to long\n"
                                     + "(timeout: "+timeout.intValue+"s,\n"
                                     + "command: " + pBuilder.command + ",\n"
                                     + "in directory '" + pBuilder.directory + "')\n\n"
                              + "Please check the KIELER Console output.")
        }
        // Print output of process to eclipse console
        if(p.inputStream.available > 0) {
            PromConsole.print("Simulation compilation output for '" + file.name + "'")
            PromConsole.print("(command:"+arguments.toList+", in directory:'"+directory.path+"')")
            
            PromConsole.copy(p.inputStream)
            PromConsole.print("\n\n")
        }
        // Check that there was no error
        if(exception == null && p.exitValue != 0) {
            exception = new Exception("Simulation compilation had issues: " + p.exitValue + "\n"
                              + "(command: " + pBuilder.command + ",\n"
                              + "in directory '" + pBuilder.directory + "')\n",
                              new Exception(CharStreams.toString(new InputStreamReader(p.inputStream, Charsets.UTF_8))))
        }
        if(exception != null) {
            // Create build problem for the exception
            val problem = BuildProblem.createError(file, exception)
            result.addProblem(problem)
        } else {
            // Add the created file to the result
            result.addCreatedFile(executableFile)
            executableFile.refreshLocal(1, null)
        }
        return result
    }
    
    /**
     * Deletes all created files.
     */
    public def void clean() {
        val folders = newArrayList
        folders.add(project.getFolder(outputFolder.stringValue))
        folders.add(project.getFolder(libFolder.stringValue))
        for(folder : folders) {
            if(folder.exists) {
                folder.delete(false, null)
            }
        }
    }
}