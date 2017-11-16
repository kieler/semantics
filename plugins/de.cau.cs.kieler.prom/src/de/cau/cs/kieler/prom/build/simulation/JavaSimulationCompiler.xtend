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

import com.google.common.io.Files
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.configurable.ConfigurableAttribute
import de.cau.cs.kieler.prom.configurable.ResourceSubstitution
import de.cau.cs.kieler.prom.configurable.Substitution
import de.cau.cs.kieler.prom.data.FileData
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.jdt.core.JavaCore

/**
 * Compiles Java code for the simulation.
 * 
 * @author aas
 *
 */
class JavaSimulationCompiler extends SimulationCompiler {
    /**
     * The default command to compile java files into class files.
     */
    private static val DEFAULT_COMPILATION_COMMAND = "javac -cp \"kieler-gen\" -d bin \"${file_path}\" "
    
    /**
     * The default command to compile class files into a jar file.
     */
    private static val DEFAULT_JAR_COMMAND = "jar cvfe \"./${outputFolder}/${executable_name}\" sim.code.${file_basename} -C bin ."
    
    /**
     * The command that is executed to create an executable jar file from the class files.
     */
    public val jarCommand = new ConfigurableAttribute("jarCommand", null, #[String])
    
    /**
     * The library directory in which the SJ library should be saved.
     */
    public val sjLibFolder = new ConfigurableAttribute("sjLibFolder", null, #[String])
    
    /**
     * Placeholder for the SJ library folder.
     */
    private val sjLibFolderSubstitution = new ResourceSubstitution("sjLibFolder") {
        override getValue() {
            return project.getFolder(libFolder.stringValue)
        }
    }

    /**
     * Constructor
     */
    new() {
        command.value = DEFAULT_COMPILATION_COMMAND
        jarCommand.value = DEFAULT_JAR_COMMAND
        // The directory structure of the json lib must follow its package declaration
        libFolder.value = "kieler-gen/org/json"
        // Same for the SJ library folder
        sjLibFolder.value = "kieler-gen/de/cau/cs/kieler/scg/processors/transformators/priority"
    }
    
    /**
     * Constructor
     * 
     * @param monitor The monitor
     */
    new(IProgressMonitor monitor) {
        super(monitor)
    }
    
    /**
     * {@inheritDoc}
     */
    override compile(IFile file) {
        this.file = file
        // Create libraries and files required for compilation
        initializeCompilation
        
        // Run command on simulation code to create class files
        val processDirectory = getProcessDirectory
        val commandWithoutSubstitutions = Substitution.performSubstitutions(command.stringValue, substitutions)
        val compilationArguments = PromPlugin.splitStringOnWhitespace(commandWithoutSubstitutions)
        result = startProcess(processDirectory, compilationArguments)
        
        // Run command to create executable jar file from class files
        if(result.problems.isNullOrEmpty) {
            val jarCommandWithoutSubstitutions = Substitution.performSubstitutions(jarCommand.stringValue, substitutions)
            val jarArguments = PromPlugin.splitStringOnWhitespace(jarCommandWithoutSubstitutions)
            result = startProcess(processDirectory, jarArguments)
        }
        // Notify listeners
        for(l : listeners) {
            l.afterCompilation(this)
        }
        return result
    }
    
    /**
     * {@inheritDoc}
     */
    override initializeCompilation() {
        super.initializeCompilation
        // Create bin folder for class files
        val binFolder = project.getFolder("bin")
        if(!binFolder.exists) {
            binFolder.create(false, true, null);
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getExecutableFile() {
        val executableName = Files.getNameWithoutExtension(file.name) + ".jar"
        val executablePath = new Path(outputFolder.stringValue).append(executableName)
        executableFile = project.getFile(executablePath)
    }
    
    /**
     * {@inheritDoc}
     */
    override getSupportedFileExtensions() {
        return #["java"]
    }
    
    /**
     * {@inheritDoc}
     */
    override getLibFolderOrigin() {
        return "platform:/plugin/de.cau.cs.kieler.prom/resources/java/org/json"
    }
    
    /**
     * The origin of the SJ library.
     */
    private def getSJLibFolderOrigin() {
        return "platform:/plugin/de.cau.cs.kieler.prom/resources/java/lib"
    }
    
    /**
     * {@inheritDoc}
     */
    override getLibFolderDatas() {
        val sjLibFolderData = new FileData(sjLibFolder.stringValue, getSJLibFolderOrigin)
        val list = super.getLibFolderDatas
        list.add(sjLibFolderData)
        return list
    }
    
    /**
     * {@inheritDoc}
     */
    override getSubstitutions() {
        val list = super.getSubstitutions
        list.add(sjLibFolderSubstitution)
        return list
    }
    
    override createLibrary(IProject project) {
        super.createLibrary(project)
        // Exclude the sim folder from beeing built.
        // The files of the simulation are compiled independent of the Java project builder
        // and some projects (e.g. Mindstorms NXT) have issues in these files.
        if(PromPlugin.isJavaProject(project)) {
            val jProject = JavaCore.create(project);
            val simFolder = project.getFolder(new Path("kieler-gen/sim"))
            val libFolder = project.getFolder(new Path(libFolder.stringValue))
            PromPlugin.excludeFolderFromJavaClasspath(jProject, simFolder)
            PromPlugin.excludeFolderFromJavaClasspath(jProject, libFolder)
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override toString() {
        return "Java simulation compiler"
    }
}