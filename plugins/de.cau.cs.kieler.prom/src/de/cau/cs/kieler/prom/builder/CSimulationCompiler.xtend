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
package de.cau.cs.kieler.prom.builder

import com.google.common.io.Files
import de.cau.cs.kieler.prom.common.PromPlugin
import de.cau.cs.kieler.prom.ui.console.PromConsole
import java.io.File
import java.util.concurrent.TimeUnit
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.resources.IProject

/**
 * @author aas
 *
 */
class CSimulationCompiler extends SimulationCompiler {
    
    new(IProgressMonitor monitor) {
        super(monitor)
    }
    
    override compile(IFile file) {
        result = new SimulationGenerationResult()
        
        // Compile this file
        monitor.subTask("Compiling simulation via gcc:" + file.name)
        
        val project = file.project
        val slash = File.separator
        val currentDir = "." + slash
        val isWindows = System.getProperty("os.name").toLowerCase.contains("win")
        // File name of the file to be compiled
        val codeFileName = file.projectRelativePath.lastSegment
        // File name of the exectuable to be created
        val executableName = Files.getNameWithoutExtension(codeFileName) + if(isWindows) ".exe" else ""
        // The directory in which the code file is saved
        val codeDirectory = file.projectRelativePath.removeLastSegments(1)
        // The directory for all simulation related files
        val simDirectory = codeDirectory.removeLastSegments(1)
        // The directory in which the executable should be created
        val executableDirectory = simDirectory.append(slash + "bin")
        // Project relative path to the executable 
        val executablePath = executableDirectory.append(slash + executableName)
        
        // Copy cJSON.c and cJSON.h to output directory of simulation
        createCJsonLibrary(project, simDirectory)
        
        // Delete old executable
        val executableFile = project.getFile(executablePath.toOSString)
        KiCoBuilder.deleteMarkers(executableFile)
        if(executableFile.exists)
            executableFile.delete(true, null)
        
        // Create bin directory
        PromPlugin.createResource(project.getFolder(executableDirectory))
        
        // Run gcc on simulation code
        // Example command to compile simulation code: "gcc -std=c99 SimulationCode.c -o SimulationCode"
        val pBuilder = new ProcessBuilder("gcc", "-std=c99",
                                          currentDir + "code" + slash + codeFileName,
                                          "-o", currentDir + executablePath.makeRelativeTo(simDirectory).toOSString)
        pBuilder.directory(project.location.append(simDirectory).toFile)
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
    
    /**
     * Copies the cJSON.c and cJSON.h files from the plugin to the directory.
     * @param projectRelativeDirectory the directory to copy the files into
     */
    private def void createCJsonLibrary(IProject project, IPath simDirectory) {
        val libPath = simDirectory.append("lib")
        val libFolder = project.getFolder(libPath)
        if(!libFolder.exists) {
            PromPlugin.initializeFolder(project, libPath.toOSString, "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/cJSON")
            libFolder.parent.refreshLocal(1, null)
        }
    }
}