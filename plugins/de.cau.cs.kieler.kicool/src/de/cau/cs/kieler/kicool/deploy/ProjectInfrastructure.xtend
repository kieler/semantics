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
package de.cau.cs.kieler.kicool.deploy

import de.cau.cs.kieler.annotations.Nameable
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.environments.Environment
import java.io.File
import java.io.PrintStream
import java.util.List
import java.util.Set
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer
import org.eclipse.xtend.lib.annotations.AccessorType
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.kicool.environments.Environment.*

import static extension org.eclipse.xtend.lib.annotations.AccessorType.*

/**
 * 
 * @author als
 * @kieler.design 2018-05-18 proposed
 * @kieler.rating 2018-05-18 proposed yellow  
 */
class ProjectInfrastructure {

    public static val IProperty<ProjectInfrastructure> PROJECT_INFRASTRUCTURE = 
        new Property<ProjectInfrastructure>("de.cau.cs.kieler.kicool.deploy.project", null)
    
    public static val IProperty<String> MODEL_FILE_PATH = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.project.file.path", null)
        
    public static val IProperty<Boolean> USE_TEMPORARY_PROJECT = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.deploy.project.use", true)

    public static val IProperty<String> TEMPORARY_PROJECT_NAME = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.project.name", "KIELER-Temp")
        
    public static val IProperty<Boolean> USE_GENERATED_FOLDER = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.deploy.project.generated.use", true)

    public static val IProperty<String> GENERATED_NAME = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.project.generated.name", "kieler-gen")

    public static val Set<IProject> createdTemporaryProjects = newHashSet

    @Accessors(AccessorType.PUBLIC_GETTER)
    var IProject project = null
    @Accessors(AccessorType.PUBLIC_GETTER)
    var File modelFile = null        
    @Accessors(AccessorType.PUBLIC_GETTER)
    var File modelFolder = null
    @Accessors(AccessorType.PUBLIC_GETTER)
    var File generatedCodeFolder = null
    @Accessors(AccessorType.PUBLIC_GETTER)
    var List<File> sourceCodeFiles = newArrayList
    @Accessors
    var CodeContainer sourceCode = null

    static def getProjectInfrastructure(Environment environment) {
        var projectInfrastructure = environment.getProperty(PROJECT_INFRASTRUCTURE)
        if (projectInfrastructure === null) {
            projectInfrastructure = new ProjectInfrastructure(environment)
            environment.setProperty(PROJECT_INFRASTRUCTURE, projectInfrastructure)
        }
        return projectInfrastructure
    }
    
    /**
     * Returns the temporary project.
     * If the project does not exist yet, it is created beforehand.
     * 
     * @return The temporary project
     */
    static def IProject getTemporaryProject() { 
        return getTemporaryProject(null)
    }
     
    static def IProject getTemporaryProject(Environment environment) {
        val root = ResourcesPlugin.getWorkspace.getRoot
        val name = if (environment !== null) environment.getProperty(TEMPORARY_PROJECT_NAME) else TEMPORARY_PROJECT_NAME.^default
        val project = root.getProject(name)
        if (!project.exists) {
            project.create(null)
        }
        if(!project.open) {
            project.open(null)
        }
        // Store project for cleanup
        createdTemporaryProjects.add(project)
        return project
    }
    
    new(Environment environment) {
        var Resource resource = null
        
        // Check if compilation is based on input file
        val inputModelPath = environment.getProperty(MODEL_FILE_PATH)
        if (inputModelPath !== null) {
            modelFile = new File(inputModelPath)
            if (!modelFile.isFile) {
                modelFile = null
            }
        }
        if (modelFile === null) {
            val inputModel = environment.getProperty(ORIGINAL_MODEL)
            if (inputModel instanceof EObject) {
                resource = inputModel.eResource
                if (resource !== null) {
                    modelFile = resource.findResourceLocation
                }
            }
        }
        
        if (environment.getProperty(USE_TEMPORARY_PROJECT)) {
            // initialize project
            project = environment.temporaryProject
            
            // Find name
            var name = "unknown"
            if (resource !== null && resource.URI !== null && resource.URI.platform) {
                name = resource.URI.toPlatformString(true)
            } else if (modelFile !== null) {
                name = modelFile.toString
            }
            name = name.replaceAll("/|\\\\", "-")
            name = name.replaceAll(" |\\.", "-")
            
            // Create Folder
            val folder = project.getFolder(name)
            if (!folder.exists) {
                folder.create(true, true, null)
            }
            modelFolder = folder.rawLocation.toFile
        } else if (modelFile !== null && modelFile.exists) {
            modelFolder = modelFile.parentFile
        } else {
            environment.warnings.add("Can not detect model location to create project infrastructure.")
        }
        
        // Create kieler-gen folder
        if (modelFolder !== null) {
            if (environment.getProperty(USE_GENERATED_FOLDER)) {
                if (hasProject) {
                    val gen = project.getFolder(modelFolder.name).getFolder(environment.getProperty(GENERATED_NAME))
                    if (!gen.exists) {
                        gen.create(true, true, null)
                    }
                    generatedCodeFolder = gen.rawLocation.toFile
                } else {
                    generatedCodeFolder = new File(modelFolder, environment.getProperty(GENERATED_NAME))
                    if (!generatedCodeFolder.exists) {
                        generatedCodeFolder.mkdir
                    }
                }
            } else {
                generatedCodeFolder = modelFolder
            }
        }
    }
    
    def getProjectRelativeFile(File file) {
        if (hasProject) {
            val root = project.workspace.root.rawLocation
            if (root !== null) {
                return root.toFile.toPath.relativize(file.toPath).toFile
            } else {
                return file
            }
        } else {
            return file
        }
    }
    
    def hasProject() {
        return project !== null
    }
    
    def refresh() {
        if (hasProject) project.refreshLocal(IResource.DEPTH_INFINITE, null)
    }
    
    def log(PrintStream logger) {
        logger.println("== Project Infrastructure ==")
        logger.println("Model file: " + modelFile)
        logger.println("Base folder: " + modelFolder)
        logger.println("Generated code folder: " + generatedCodeFolder)
        logger.println
    }
    
    def findResourceLocation(Resource resource) {
        return WorkspaceSynchronizer.getFile(resource)?.rawLocation?.toFile
    }
    
}
