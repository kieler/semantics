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
import org.eclipse.core.runtime.Assert

/**
 * @author aas
 *
 */
class JavaSimulationCompiler extends SimulationCompiler {
    
    private static val DEFAULT_COMMAND = "jar cvfe \"../${outputFolder}/${executable_name}\""
    
    public val command = new ConfigurableAttribute("command", DEFAULT_COMMAND)
    public val outputFolder = new ConfigurableAttribute("outputFolder", "kieler-gen/sim/bin")
    public val libFolder = new ConfigurableAttribute("libFolder", "kieler-gen/org/json")
    
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
            monitor.subTask("Compiling simulation jar file:" + file.name)
        }
        // Create jar file
        result = new FileGenerationResult
        // Example command: jar cvfe ../output.jar JavaSimulationJSimple *.class
        val project = file.project
        // The exectuable to be created
        val executableName = Files.getNameWithoutExtension(file.name) + ".jar"
        val executablePath = new Path(outputFolder.stringValue).append(executableName)
        val executableFile = project.getFile(executablePath)
        
        // Remove markers from old simulation file        
        KiCoBuilder.deleteMarkers(file)
        // Delete old executable
//        if(executableFile.exists)
//            executableFile.delete(true, null)
        
        // Create JSON library 
        createJavaJsonLibrary(project)
        
        // Search for all class files in the bin directory
        val classFiles = PromPlugin.findFiles(project.getFolder("bin").members, "class")
        val classFilePaths = classFiles.map[it.projectRelativePath.removeFirstSegments(1).toOSString]
        // Main class for the executable
        val mainClassWithoutSourceDirectoryAndFileExtension = file.projectRelativePath.removeFirstSegments(1).removeFileExtension.toOSString
        
        // Create process builder to compile jar
        val commandWithoutPlaceholders = command.stringValue
            .replacePlaceholder("file_name", file.location.toOSString)
            .replacePlaceholder("file_path", file.projectRelativePath.toOSString)
            .replacePlaceholder("file_loc", file.location.toOSString)
            .replacePlaceholder("executable_name", executableFile.name)
            .replacePlaceholder("executable_path", executableFile.projectRelativePath.toOSString)
            .replacePlaceholder("executable_loc", executableFile.location.toOSString)
            .replacePlaceholder("outputFolder", executableFile.parent.projectRelativePath.toOSString, false)
        val processArguments = splitStringOnWhitespace(commandWithoutPlaceholders)
        val pBuilder = new ProcessBuilder(processArguments + #[mainClassWithoutSourceDirectoryAndFileExtension] + classFilePaths)
        // JAR has to be executed in the bin directory where the class files are saved
        pBuilder.directory(project.location.append("bin").toFile)
        pBuilder.redirectErrorStream(true)
        val p = pBuilder.start()
        // Wait until the process finished
        var Exception exception
        if(!p.waitFor(60, TimeUnit.SECONDS)) {
            exception = new Exception("JAR took to long: (timeout: 60s, command: " + pBuilder.command + ", in directory " + pBuilder.directory + ")\n\n"
                              + "Please check the KIELER Console output.")
        }
        // Check that there was no error
        if(exception == null && p.exitValue != 0) {
            exception = new Exception("JAR had issues:" + p.exitValue + " (" + pBuilder.command + " in " + pBuilder.directory + ")\n\n"
                              + "Please check the KIELER Console output.")
        }
        // Print output of process
        if(exception != null && p.inputStream.available > 0) {
            // Print output of process to eclipse console
            PromConsole.print("JAR output for '" + file.name + "'")
            PromConsole.copy(p.inputStream)
            PromConsole.print("\n\n")
        }
        if(exception != null) {
            val problem = BuildProblem.createError(file, exception)
            result.addProblem(problem)
        } else {
            executableFile.refreshLocal(1, null)
            result.addCreatedFile(executableFile)
        }
        return result
    }
    
    override getSupportedFileExtensions() {
        return #["java"]
    }
    
    /**
     * Copies the JSON library from the plugin to the directory.
     * @param project the project to copy the files into
     */
    private def void createJavaJsonLibrary(IProject project) {
        val libPath = new Path(libFolder.stringValue)
        PromPlugin.initializeFolder(project, libPath.toOSString, "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/java/json")
    }
    
    override toString() {
        return "Java simulation compiler"
    }
}