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
package de.cau.cs.kieler.prom.build

import com.google.common.io.Files
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.console.PromConsole
import java.util.concurrent.TimeUnit
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.Assert
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path

/**
 * @author aas
 *
 */
class CSimulationCompiler extends SimulationCompiler {
    
    private static val DEFAULT_COMMAND = "gcc -std=c99 -Werror=int-conversion -o \"./${outputFolder}/${executable_name}\""
    
    public val command = new ConfigurableAttribute("command", DEFAULT_COMMAND)
    public val outputFolder = new ConfigurableAttribute("outputFolder", "kieler-gen/sim/bin")
    public val libFolder = new ConfigurableAttribute("libFolder", "kieler-gen/sim/lib")
    
    new() {
    }
    
    new(IProgressMonitor monitor) {
        super(monitor)
    }
    
    override compile(IFile file) {
        Assert.isNotNull(command.stringValue)
        Assert.isNotNull(outputFolder.stringValue)
        Assert.isNotNull(libFolder.stringValue)
        
        if(monitor != null) {
            monitor.subTask("Compiling simulation via gcc:" + file.name)
        }
        // Compile this file
        result = new FileGenerationResult
        val project = file.project
        val isWindows = System.getProperty("os.name").toLowerCase.contains("win")
        // The exectuable to be created
        val executableName = Files.getNameWithoutExtension(file.name) + if(isWindows) ".exe" else ""
        val executablePath = new Path(outputFolder.stringValue).append(executableName)
        val executableFile = project.getFile(executablePath)
        
        // Copy cJSON.c and cJSON.h to output directory of simulation
        createCJsonLibrary(project)
        
        // Create output folder
        if(!outputFolder.stringValue.isNullOrEmpty) {
            val outputFolderResource = project.getFolder(outputFolder.stringValue)
            PromPlugin.createResource(outputFolderResource)
        }
        
        // Remove markers from old simulation file
        KiCoBuilder.deleteMarkers(file)
        
        // Run gcc on simulation code
        // Example command to compile simulation code: "gcc -std=c99 SimulationCode.c -o SimulationCode"
        val commandWithoutPlaceholders = command.stringValue
            .replacePlaceholder("file_name", file.location.toOSString)
            .replacePlaceholder("file_path", file.projectRelativePath.toOSString)
            .replacePlaceholder("file_loc", file.location.toOSString)
            .replacePlaceholder("executable_name", executableFile.name)
            .replacePlaceholder("executable_path", executableFile.projectRelativePath.toOSString)
            .replacePlaceholder("executable_loc", executableFile.location.toOSString)
            .replacePlaceholder("outputFolder", executableFile.parent.projectRelativePath.toOSString, false)
        val processArguments = splitStringOnWhitespace(commandWithoutPlaceholders)
        val pBuilder = new ProcessBuilder(processArguments + #[file.location.toOSString])
        pBuilder.directory(project.location.toFile)
        pBuilder.redirectErrorStream(true)
        val p = pBuilder.start()
        // Wait until the process finished
        var Exception exception
        if(!p.waitFor(60, TimeUnit.SECONDS)) {
            exception = new Exception("GCC took to long: (timeout: 60s, command: " + pBuilder.command + ", in directory " + pBuilder.directory + ")\n\n"
                              + "Please check the KIELER Console output.")
        }
        // Check that there was no error
        if(exception == null && p.exitValue != 0) {
            exception = new Exception("GCC had issues:" + p.exitValue + " (" + pBuilder.command + " in " + pBuilder.directory + ")\n\n"
                              + "Please check the KIELER Console output.")
        }
        if(p.inputStream.available > 0) {
            // Print output of process to eclipse console
            PromConsole.print("GCC output for '" + file.name + "'")
            PromConsole.copy(p.inputStream)
            PromConsole.print("\n\n")
        }
        if(exception != null) {
            val problem = BuildProblem.createError(file, exception)
            result.addProblem(problem)
        } else {
            result.addCreatedFile(executableFile)
            executableFile.refreshLocal(1, null)
        }
        return result
    }
    
    override getSupportedFileExtensions() {
        return #["c"]
    }
    
    /**
     * Copies the cJSON.c and cJSON.h files from the plugin to the directory.
     * @param project the project to copy the files into
     */
    private def void createCJsonLibrary(IProject project) {
        val libPath = new Path(libFolder.stringValue)
        val libFolder = project.getFolder(libPath)
        if(!libFolder.exists) {
            PromPlugin.initializeFolder(project, libPath.toOSString, "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/cJSON")
            libFolder.parent.refreshLocal(1, null)
        }
    }
    
    override toString() {
        return "C Simulation compiler"
    }
}