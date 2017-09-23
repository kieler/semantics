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

import de.cau.cs.kieler.prom.ModelImporter
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.simulation.core.DataHandler
import de.cau.cs.kieler.simulation.core.SimulationManager
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IPath

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
     * The path must be either an absolute path in the workspace (i.e. /PROJECT_NAME/SOME/FOLDERS/THE_FILE.txt)
     * or a project relative path in the project of which a configuration is currently used to run the simulation.
     * 
     * @param path The path
     * @return the file handle of the path, or null if none
     */
    protected def IFile getFile(IPath path) {
        var IFile file = PromPlugin.findFile(path.toOSString)
        if (file == null || !file.exists) {
            val simMan = SimulationManager.instance
            if(simMan != null && simMan.usedConfiguration != null) {
                val configurationFile = ModelImporter.toPlatformResource(simMan.usedConfiguration.eResource) as IFile
                file = configurationFile?.project.getFile(path)
            } else {
                return null
            }
        }
        return file
    }
}