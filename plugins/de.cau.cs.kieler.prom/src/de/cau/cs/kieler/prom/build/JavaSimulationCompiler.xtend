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
import java.io.File
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path

/**
 * @author aas
 *
 */
class JavaSimulationCompiler extends SimulationCompiler {
    
    new(IProgressMonitor monitor) {
        super(monitor)
    }
    
    override compile(IFile file) {
        if(result == null) {
            result = new SimulationGenerationResult()
        }
        
        monitor.subTask("Compiling simulation jar file:" + file.name)
        
        // Create jar file
        // Example command: jar cvfe ../output.jar JavaSimulationJSimple *.class
        val project = file.project
        val fileNameNoExtension = Files.getNameWithoutExtension(file.name)
        val executableName = fileNameNoExtension + ".jar"
        val directory = file.projectRelativePath.removeLastSegments(1)
        val parentDir = ".." + File.separator
        // The directory in which the code file is saved
        val codeDirectory = file.projectRelativePath.removeLastSegments(1)
        // The directory for all simulation related files
        val simDirectory = codeDirectory.removeLastSegments(1)
        
        createJavaJsonLibrary(project, simDirectory)
        
        // Delete old executable
        val executableFile = project.getFile(directory.removeLastSegments(1).toOSString + File.separator + executableName)
        KiCoBuilder.deleteMarkers(executableFile)
        if(executableFile.exists)
            executableFile.delete(true, null)
        
        // Search for all class files in the bin directory
        val classFiles = PromPlugin.findFiles(project.getFolder("bin").members, "class")
        val classFilePaths = classFiles.map[it.projectRelativePath.removeFirstSegments(1).toOSString]
        
        // Create process builder to compile jar
        val mainClassWithoutSourceDirectoryAndFileExtension = file.projectRelativePath.removeFirstSegments(1).removeFileExtension.toOSString
        val pBuilder = new ProcessBuilder(#["jar", "cvfe", parentDir+executableFile.projectRelativePath.toOSString, mainClassWithoutSourceDirectoryAndFileExtension] + classFilePaths)
        pBuilder.directory(project.location.append(new Path(File.separator + "bin")).toFile)
        pBuilder.redirectErrorStream(true)
        val p = pBuilder.start()
        // Wait until the process finished
        val errorCode = p.waitFor()
        var Exception exception
        if(errorCode != 0) {
            exception = new Exception("jar has issues:" + errorCode + " (" + pBuilder.command + " in " + pBuilder.directory + ")")
        }
        // Print output of process
        if(p.inputStream.available > 0) {
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
     * Copies the cJSON.c and cJSON.h files from the plugin to the directory.
     * @param projectRelativeDirectory the directory to copy the files into
     */
    private def void createJavaJsonLibrary(IProject project, IPath simTargetPath) {
        val libPath = simTargetPath.removeLastSegments(1).append("org/json")
        PromPlugin.initializeFolder(project, libPath.toOSString, "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/java/json")
    }
}