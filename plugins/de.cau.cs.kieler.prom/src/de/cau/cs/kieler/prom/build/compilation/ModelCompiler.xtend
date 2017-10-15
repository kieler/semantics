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
package de.cau.cs.kieler.prom.build.compilation

import com.google.common.io.Files
import de.cau.cs.kieler.prom.ModelImporter
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.build.DependencyGraph
import de.cau.cs.kieler.prom.build.templates.SimulationTemplateProcessor
import de.cau.cs.kieler.prom.configurable.Configurable
import de.cau.cs.kieler.prom.configurable.ConfigurableAttribute
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.Assert
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.jdt.core.JavaCore
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Compiles a models (EObjects) to target code.
 * Thereby a suited simulation may be generated, because the model compiler knows the model as well as the
 * code, which is generated for it.
 * 
 * @author aas
 *
 */
abstract class ModelCompiler extends Configurable {
    /**
     * The listeners
     */
    protected static val listeners = <ModelCompilerListener> newArrayList
    
    /**
     * Regex to filter models that should be compiled.
     * The regex is matched against the location of a model. If it does not match then it is not compiled.
     */
    public val whitelist = new ConfigurableAttribute("whitelist", null, #[String])
    /**
     * Regex to filter models that should be compiled
     * The regex is matched against the location of a model. If it does match then it is not compiled.
     */
    public val blacklist = new ConfigurableAttribute("blacklist", null, #[String])
    /**
     * The name of the folder in which the generated files are saved.
     * The folder structure of models is retained in this directory, except for a starting java source directory.
     */
    public val outputFolder = new ConfigurableAttribute("outputFolder", "kieler-gen", #[String])
    /**
     * The file extension of generated output.
     * Note that both '.c' and 'c' will be taken as '.c'
     */
    public val outputFileExtension = new ConfigurableAttribute("outputFileExtension", "c", #[String])
    
    /**
     * Optional progess monitor to show the compilation state to the end user.
     */
    @Accessors(PUBLIC_SETTER, PUBLIC_GETTER)
    protected var IProgressMonitor monitor
    
    /**
     * Optional simulation template processor in case that a suited simulation for the compiled models should be generated
     * as part of the model compilation.
     */
    @Accessors(PUBLIC_SETTER)
    protected var SimulationTemplateProcessor simulationProcessor
    
    /**
     * Main method to really compile the given model.
     * Models which should not be compiled have been filtered already when this is called.
     * 
     * @param file The file handle of the model. This may only be used for path operations to calculate the output file
     * @param model The model
     */
    abstract protected def ModelCompilationResult doCompile(IFile file, EObject model)
    
    /**
     * The model that is compiled
     */
    protected var EObject model
    
    /**
     * The file handle of the model that is compiled.
     */
    protected var IFile file
    
    /**
     * Adds the listener.
     * 
     * @param listener The listener
     */
    public static def void registerListener(ModelCompilerListener listener) {
        if(!listeners.contains(listener))
            listeners.add(listener)
    }
    
    /**
     * Removes the listener.
     * 
     * @param listener The listener
     */
    public static def void removeListener(ModelCompilerListener listener) {
        listeners.remove(listener)
    }
    
    /**
     * Constructor
     */
    new() {
        super()
    }
    
    /**
     * Compiles the model.
     * 
     * @param file The file handle of the model.
     *        It is only used for path operations and to add error/warning markers.
     *        The output will be saved in the project of this file.
     * @param model The model
     * @return the compilation result
     */
    public def ModelCompilationResult compile(IFile file, EObject model) {
        Assert.isNotNull(file)
        Assert.isNotNull(model)
        // Remember the file that should be compiled
        this.file = file
        this.model = model
        
        // Check if the file is filtered by some regex
        val whiteListRegex = whitelist.stringValue
        val blackListRegex = blacklist.stringValue
        if(!whiteListRegex.isNullOrEmpty && !file.location.toOSString.matches(".*("+whiteListRegex+").*")) {
            return new ModelCompilationResult
        }
        if(!blackListRegex.isNullOrEmpty && file.location.toOSString.matches(".*("+blackListRegex+").*")) {
            return new ModelCompilationResult
        }
        
        // Create folder for output
        createOutputFolder()
        
        // Compile the model
        return doCompile(file, model)
    }
    
    /**
     * Configures this instance according to the given configuration.
     * 
     * @param config The configuration
     */
    public def void initialize(de.cau.cs.kieler.prom.kibuild.ModelCompiler config) {
        this.updateConfigurableAttributes(config.attributes)
        
        // Add simulation template processor to model compiler
        if(config.simulationProcessor != null) {
            val processor = new SimulationTemplateProcessor
            simulationProcessor = processor
            processor.initialize(config.simulationProcessor)
        }
    }
    
    /**
     * Compiles the model. 
     * 
     * @param model The model
     */
    public def ModelCompilationResult compile(EObject model) {
        val file = ModelImporter.toPlatformResource(model.eResource)
        return compile(file, model)
    }
    
     /**
     * Compiles the model that is saved in the given file. 
     * 
     * @param file The file holding the model to be built. The EObject is loaded from this file.
     */
    public def ModelCompilationResult compile(IFile file) {
        val model = ModelImporter.load(file)
        return compile(file, model)
    }
    
    /**
     * Returns true if the monitor was canceled.
     */
    protected def boolean isCanceled() {
        return monitor != null && monitor.isCanceled
    }
    
    /**
     * Creates the folder in which compilation results will be saved.
     */
    protected def void createOutputFolder() {
        val folderPath = outputFolder.stringValue
        if(!folderPath.isNullOrEmpty()) {
            val folder = project.getFolder(folderPath)
            if(!folder.exists) {
                folder.create(false, true, null)
                // Add folder to java class path if it is a java project
                if (PromPlugin.isJavaProject(project)) {
                    val javaProject = JavaCore.create(project);
                    PromPlugin.addFolderToJavaClasspath(javaProject, folder)
                }                
            }
        }
    }
    
    /**
     * Returns the file that will be created as compilation result.
     * 
     * @return the target file handle
     */
    protected def IFile computeTargetFile() {
        val targetBaseFolder = project.getFolder(outputFolder.stringValue)
        // Remove leading java source folder if any
        var sourceWithoutJavaFolders = file
        if(PromPlugin.isJavaProject(project)) {
            val firstFolderOfSource = file.projectRelativePath.segment(0)
            if(PromPlugin.isJavaSourceDirectory(JavaCore.create(project), firstFolderOfSource)) {
                val projectRelativePathWithoutSourceFolder = file.projectRelativePath.removeFirstSegments(1)
                sourceWithoutJavaFolders = project.getFile(projectRelativePathWithoutSourceFolder)
            }
        }
        // Compute target resource inside target directory but with same folder structure as before
        val nameWithoutExtension = Files.getNameWithoutExtension(sourceWithoutJavaFolders.name)
        var targetPath = sourceWithoutJavaFolders.projectRelativePath.removeLastSegments(1).append(nameWithoutExtension+"."+targetFileExtension)
        val targetFile = targetBaseFolder.getFile(targetPath)
        return targetFile
    }
    
    /**
     * Returns the file extension for the created file.
     * 
     * @return the file extension
     */
    protected def String getTargetFileExtension() {
        // Remove leading dot if any
        var String fileExt = outputFileExtension.stringValue
        if(fileExt.startsWith(".")) {
            return fileExt.substring(1)
        } else {
            return fileExt    
        }
    }
    
    /**
     * Returns the project of the compiled file
     * 
     * @return the project
     */
    protected def IProject getProject() {
        return file?.project
    }
}