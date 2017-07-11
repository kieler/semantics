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
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path

/**
 * @author aas
 *
 */
class CSimulationCompiler extends SimulationCompiler {
    
    private static val DEFAULT_GCC_COMMAND = "gcc ${file_path} -std=c99 -o \"./${outputFolder}/${executable_name}\""
    
    public val command = new ConfigurableAttribute("command", DEFAULT_GCC_COMMAND, true)
    public val outputFolder = new ConfigurableAttribute("outputFolder", "kieler-gen/sim/bin")
    public val libFolder = new ConfigurableAttribute("libFolder", "kieler-gen/sim/lib")
    
    new() {
    }
    
    new(IProgressMonitor monitor) {
        super(monitor)
    }
    
    override compile(IFile file) {
        result = new FileGenerationResult
        
        // Compile this file
        monitor.subTask("Compiling simulation via gcc:" + file.name)
        
        val project = file.project
        val isWindows = System.getProperty("os.name").toLowerCase.contains("win")
        // File name of the file to be compiled
        val codeFileName = file.name
        // The exectuable to be created
        val executableName = Files.getNameWithoutExtension(codeFileName) + if(isWindows) ".exe" else ""
        val executablePath = new Path(outputFolder.stringValue).append(executableName)
        val executableFile = project.getFile(executablePath)
        
        // Copy cJSON.c and cJSON.h to output directory of simulation
        createCJsonLibrary(project)
        
        // Remove markers from old simulation file
        KiCoBuilder.deleteMarkers(file)
        KiCoBuilder.deleteMarkers(executableFile)
        
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
        val pBuilder = new ProcessBuilder(processArguments)
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
            exception = new Exception("GCC has issues:" + p.exitValue + " (" + pBuilder.command + " in " + pBuilder.directory + ")\n\n"
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
    
    private def String replacePlaceholder(String text, String placeholder, String value) {
        if(value.contains(' ')) {
            return text.replacePlaceholder(placeholder, value, true)
        } else {
            return text.replacePlaceholder(placeholder, value, false)    
        }
    }
    
    private def String replacePlaceholder(String text, String placeholder, String value, boolean quoted) {
        var String replacement = value
        if(quoted) {
            replacement = '"'+replacement+'"'
        }
        return text.replace("${"+placeholder+"}", replacement)    
    }
    
    /**
     * Copies the cJSON.c and cJSON.h files from the plugin to the directory.
     * @param projectRelativeDirectory the directory to copy the files into
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