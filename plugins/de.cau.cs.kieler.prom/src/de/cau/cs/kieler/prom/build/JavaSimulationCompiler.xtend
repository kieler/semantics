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
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResourceChangeListener
import org.eclipse.core.resources.IncrementalProjectBuilder
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.core.resources.IFile

/**
 * @author aas
 *
 */
class JavaSimulationCompiler extends SimulationCompiler {
    
    private static val DEFAULT_COMMAND = "jar cvfe \"../${outputFolder}/${executable_name}\""
    
    new() {
        command.value = DEFAULT_COMMAND
        libFolder.value = "kieler-gen/org/json"
    }
    
    new(IProgressMonitor monitor) {
        super(monitor)
    }
    
    override compile(IFile file) {
        this.file = file
        // Create JSON library
        initializeCompilation
        
        // Delay the compilation in another thread to ensure that the java builder
        // has compiled the generated simulation code to a class file
        val javaSimulationCompiler = this
        val job = new Job("Delayed Java Simulation Compilation") {
            override protected run(IProgressMonitor monitor) {
                // Wait for the current build to finish
                jobManager.join(ResourcesPlugin.FAMILY_AUTO_BUILD, monitor)
                // Restart java builder on changed files
                project.build(IncrementalProjectBuilder.INCREMENTAL_BUILD, monitor)
                // In the following, the class file for the simulation is up-to-date
                // Continue with compilation
                javaSimulationCompiler.doCompile(file)
                return Status.OK_STATUS
            }
        }
        job.schedule()
        return new FileGenerationResult
    }
    
    /**
     * Compile the simulation code to a java archive. 
     */
    private def void doCompile(IFile file) {
        super.compile(file)
    }
    
    override initializeCompilation() {
        super.initializeCompilation 
        // Create JSON library 
        createJavaJsonLibrary(project)
    }
    
    override getExecutableFile() {
        val executableName = Files.getNameWithoutExtension(file.name) + ".jar"
        val executablePath = new Path(outputFolder.stringValue).append(executableName)
        executableFile = project.getFile(executablePath)
    }
    
    override getProcessDirectory() {
        return project.getFolder("bin").location.toFile
    }
    
    override getProcessArguments() {
        // Search for all class files in the bin directory
        val classFiles = PromPlugin.findFiles(project.getFolder("bin").members, "class")
        val classFilePaths = classFiles.map[it.projectRelativePath.removeFirstSegments(1).toOSString]
        // Main class for the executable
        val mainClassWithoutSourceDirectoryAndFileExtension = file.projectRelativePath.removeFirstSegments(1).removeFileExtension.toOSString
        
        // Run command on simulation code
        // Example command: jar cvfe ../output.jar JavaSimulationJSimple *.class
        val commandArguments = super.processArguments
        return commandArguments + #[mainClassWithoutSourceDirectoryAndFileExtension] + classFilePaths
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