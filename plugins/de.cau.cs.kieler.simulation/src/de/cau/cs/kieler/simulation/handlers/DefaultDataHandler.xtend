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
package de.cau.cs.kieler.simulation.handlers

import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.simulation.core.DataHandler
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.simulation.core.SimulationManager
import java.io.File
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject

/**
 * Default implementation for a data handler.
 * Does nothing to initialize and stop.
 * 
 * @author aas
 *
 */
abstract class DefaultDataHandler implements DataHandler {
    /**
     * {@inheritDoc}
     */
    override initialize() {
    }
    
    /**
     * {@inheritDoc}
     */
    override stop() {
    }
    
    /**
     * Returns the file handle of the given path.
     * The path must be either an absolute path in the workspace (i.e. /Project/Some/Folders/MyFile.txt)
     * or a project relative path in the project of the currently running simulation configuration file.
     * 
     * @param path The path
     * @return the file handle of the path, or null if none
     */
    protected def IFile getIFile(String path) {
        val project = SimulationManager.instance?.usedConfigurationFile?.project
        return getIFile(path, project)
    }
    
    /**
     * Returns the java file handle of the given path.
     * The path can be either an absolute file system path, an absolute workspace path,
     * or a project relative path in the project of the currently running simulation configuration file.
     * 
     * @param path The path
     * @param project The project in case a project relative path is used
     * @return the file handle of the path, or null if none
     */
    protected def IFile getIFile(String path, IProject project) {
        var IFile file = PromPlugin.findFile(path)
        if (file == null || !file.exists && project != null) {
            file = project.getFile(path)
        }
        return file
    }
    
    protected def File getJavaFile(String path) {
        val project = SimulationManager.instance?.usedConfigurationFile?.project
        return getJavaFile(path, project)
    }
    
    /**
     * Returns a Java file handle for the given path.
     * The path can be either an absolute file system path, an absolute workspace path,
     * or a project relative path in the given project.
     * 
     * @param filePath The path or location of the file
     * @param project The project in case a project relative path is used
     * @return a java file handle to the file with the given path.
     */
    protected def File getJavaFile(String path, IProject project) {
        var File jFile
        var isFileSystemPath = false
        try {
            jFile = new File(path)
            if(jFile.exists) {
                isFileSystemPath = true
            }
        } catch(Exception e) {
            return null
        }
        if(!isFileSystemPath) {
            val iFile = getIFile(path, project)
            if(iFile != null && iFile.exists) {
                jFile = new File(iFile.location.toOSString)
            }
        }
        return jFile
    }
    
    /**
     * Returns the model with the given name in the data pool.
     * 
     * @param pool The pool
     * @param name The name
     * @return the first model in the pool with the given name 
     */
    protected def Model findModel(DataPool pool, String name) {
        val model = pool.models.findFirst[it.name == name]
        return model
    }
}