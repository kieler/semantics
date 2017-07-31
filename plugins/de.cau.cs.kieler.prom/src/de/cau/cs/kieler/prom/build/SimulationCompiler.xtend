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

import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.console.PromConsole
import java.util.ArrayList
import java.util.List
import java.util.concurrent.TimeUnit
import java.util.regex.Pattern
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.Assert
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.xtend.lib.annotations.Accessors
import java.io.File
import com.google.common.io.Files
import org.eclipse.core.runtime.Path

/**
 * @author aas
 *
 */
abstract class SimulationCompiler extends Configurable {
    
    public val command = new ConfigurableAttribute("command")
    public val outputFolder = new ConfigurableAttribute("outputFolder", "kieler-gen/sim/bin")
    public val libFolder = new ConfigurableAttribute("libFolder", "kieler-gen/sim/lib")
    public val timeout = new ConfigurableAttribute("timeout", 10)
    
    @Accessors(PUBLIC_GETTER)
    protected FileGenerationResult result
    @Accessors(PUBLIC_SETTER)
    protected var IProgressMonitor monitor
    
    protected var IFile file
    protected var IFile executableFile
    
    abstract public def String[] getSupportedFileExtensions()
    
    new() {
        super()
    }
    
    new(IProgressMonitor monitor) {
        this.monitor = monitor
    }
    
    public def FileGenerationResult compile(IFile file) {
        this.file = file
        // Create libraries and files required for compilation
        initializeCompilation
        
        // Run command on simulation code
        val processArguments = getProcessArguments
        val processDirectory = getProcessDirectory
        return startProcess(processDirectory, processArguments)
    }
    
    protected def IFile getExecutableFile() {
        val isWindows = System.getProperty("os.name").toLowerCase.contains("win")
        val executableName = Files.getNameWithoutExtension(file.name) + if(isWindows) ".exe" else ""
        val executablePath = new Path(outputFolder.stringValue).append(executableName)
        executableFile = project.getFile(executablePath)
    }
    
    protected def File getProcessDirectory() {
        return project.location.toFile
    }
    
    protected def Iterable<String> getProcessArguments() {
        val commandArguments = splitStringOnWhitespace(commandWithoutPlaceholders)
        return commandArguments
    }
    
    protected def void initializeCompilation() {
        Assert.isNotNull(command.stringValue)
        Assert.isNotNull(outputFolder.stringValue)
        Assert.isNotNull(libFolder.stringValue)
        if(monitor != null) {
            monitor.subTask("Compiling simulation:" + file.name)
        }
        executableFile = getExecutableFile
        
        // Remove markers from old simulation file
        KiCoBuilder.deleteMarkers(file)
        
        // Create output folder
        if(!outputFolder.stringValue.isNullOrEmpty) {
            val outputFolderResource = project.getFolder(outputFolder.stringValue)
            PromPlugin.createResource(outputFolderResource)
        }
    }
    
    public def void initialize(de.cau.cs.kieler.prom.kibuild.SimulationCompiler config) {
        this.updateConfigurableAttributes(config.attributes)
    }
    
    public def boolean canCompile(IFile file) {
        return supportedFileExtensions.contains(file.fileExtension)
    }
    
    protected def IProject getProject() {
        return file.project
    }
    
    protected def FileGenerationResult startProcess(File directory, String... arguments) {
        result = new FileGenerationResult
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
        // Check that there was no error
        if(exception == null && p.exitValue != 0) {
            exception = new Exception("Simulation compilation had issues: " + p.exitValue + "\n"
                              + "(command: " + pBuilder.command + ",\n"
                              + "in directory '" + pBuilder.directory + "')\n\n"
                              + "Please check the KIELER Console output.")
        }
        if(p.inputStream.available > 0) {
            // Print output of process to eclipse console
            PromConsole.print("Simulation compilation output for '" + file.name + "':")
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
    
    protected def String getCommandWithoutPlaceholders() {
        return command.stringValue
            .replacePlaceholder("file_name", file.location.toOSString)
            .replacePlaceholder("file_path", file.projectRelativePath.toOSString)
            .replacePlaceholder("file_loc", file.location.toOSString)
            .replacePlaceholder("executable_name", executableFile.name)
            .replacePlaceholder("executable_path", executableFile.projectRelativePath.toOSString)
            .replacePlaceholder("executable_loc", executableFile.location.toOSString)
            .replacePlaceholder("outputFolder", executableFile.parent.projectRelativePath.toOSString, false)
    }
    
    /**
     * Split input string on spaces, except if between double quotes (e.g. "hello world" would be one token.)
     * Surrounding double quotes are removed.
     * 
     * @param str The string to be splitted
     * @return List<String> containing slices of the input string.
     */
    protected def List<String> splitStringOnWhitespace(String str) {
        // Code from
        // http://stackoverflow.com/questions/7804335/split-string-on-spaces-except-if-between-quotes-i-e-treat-hello-world-as
        val list = new ArrayList<String>();
        val m = Pattern.compile("([^\"]\\S*|\".+?\")\\s*").matcher(str);
        while (m.find()) {
            // .replace(...) is to remove surrounding qoutes
            list.add(m.group(1).replace("\"", ""))
        }
        return list
    }
    
    protected def String replacePlaceholder(String text, String placeholder, String value) {
        if(value.contains(' ')) {
            return text.replacePlaceholder(placeholder, value, true)
        } else {
            return text.replacePlaceholder(placeholder, value, false)    
        }
    }
    
    protected def String replacePlaceholder(String text, String placeholder, String value, boolean quoted) {
        var String replacement = value
        if(quoted) {
            replacement = '"'+replacement+'"'
        }
        return text.replace("${"+placeholder+"}", replacement)    
    }
}