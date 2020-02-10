/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.testsuite

import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.deploy.Logger
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import org.eclipse.emf.ecore.EObject

/**
 * @author mek
 *
 */
class TestsuiteCompilationData {
    public Logger logger = new Logger
    public String root               = null
    public String destination        = null
    public String generatedFolder    = null
    public String fileEndsWithFilter = ""
    public System system             = null
    public boolean localCompilation  = true
    
    /**
     * Checks whether a file should be compiled or not.
     */
    def validFile(Path file) {
        return file.fileName.toString.endsWith(fileEndsWithFilter)
    }
    
    /**
     * Gets the relative path from root if given otherwise the empty path.
     */
    def relativePath(Path path) {
        if (root !== null) {
            return Paths.get(root).relativize(path)
        } else {
            return Paths.get("")
        }
    }
    
    /**
     * Resolves a path from destination if given.
     */
    def destinationPath(Path path) {
        if (destination !== null) {
            return Paths.get(destination).resolve(path)
        } else {
            return path
        }
    }
    
    /**
     * Gets the destination folder for a model.
     */
    def targetFolder(Path modelFile) {
        return destinationPath(relativePath(modelFile.parent))
                .resolve(modelFile.fileName.toString.split("\\.", 2).get(0).replace(' ', '_'))
    }
    
    /**
     * Returns a compilation context if a valid path is supplied with destination data already
     * set in the environment.
     */
    def getCompilationContext(EObject compileModel, Path modelFile) {
        if (!Files.exists(modelFile)) {
            return null
        }
        
        // create compilation context
        val cc = Compile.createCompilationContext(system, compileModel)
        val env = cc.startEnvironment
        
        // get path_variable map
        val path_variables = env.getPropertyComputeIfAbsent(
            ProjectInfrastructure.PATH_VARIABLES, [newHashMap]
        )
        
        // fill environment with path specific informations
        if (localCompilation) {
            val targetFolder = targetFolder(modelFile)
            Files.createDirectories(targetFolder)
            val localModelFile = targetFolder.resolve(modelFile.fileName)
            // copy file if original != local and local doesn't exist or is older/same age
            if (!modelFile.equals(localModelFile) &&
                (!Files.exists(localModelFile) ||
                    Files.getLastModifiedTime(modelFile)
                    .compareTo(Files.getLastModifiedTime(localModelFile)) >= 0)) {
                Files.copy(modelFile, localModelFile, StandardCopyOption.REPLACE_EXISTING);
            }
            
            env.setProperty(ProjectInfrastructure.MODEL_FILE_PATH, localModelFile.toString)
            env.setProperty(ProjectInfrastructure.OWN_MODEL_FOLDER, false)
            
        } else {
            env.setProperty(ProjectInfrastructure.MODEL_FILE_PATH, modelFile.toString)
            env.setProperty(ProjectInfrastructure.OWN_MODEL_FOLDER, true)
            if (root !== null) {
                path_variables.put("SRC_ROOT", root)
            }
            if (destination !== null) {
                path_variables.put("DST_ROOT", destination)
            }
        }
        
        // never use a temporary project
        env.setProperty(ProjectInfrastructure.USE_TEMPORARY_PROJECT, false)
        
        // set the generated folder acording to the current config
        if (generatedFolder !== null && generatedFolder != "") {
            env.setProperty(ProjectInfrastructure.USE_GENERATED_FOLDER, true)
            env.setProperty(ProjectInfrastructure.GENERATED_NAME, generatedFolder)
        } else {
            env.setProperty(ProjectInfrastructure.USE_GENERATED_FOLDER, false)
        }
        
        return cc
    }
}