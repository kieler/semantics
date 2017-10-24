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
package de.cau.cs.kieler.simulation.ui.views

import com.google.common.io.Files
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.launch.SimulationLaunchConfig
import java.util.List
import org.eclipse.core.runtime.IPath
import org.eclipse.ui.dialogs.SaveAsDialog

/**
 * Base class for toolbar action to save the complete simulation run to a file format. 
 * 
 * @author aas
 *
 */
abstract class SaveSimulationAction extends DataPoolViewToolbarAction {
    /**
     * The content of the file to be created for the given list of data pools.
     * 
     * @param history The history of data pools in this simulation run
     * @return the content of the file to be created
     */
    protected def String getFileContent(List<DataPool> history)
    
    /**
     * Returns the file extension of the file to be created.
     * 
     * @return the file extension of the file to be created
     */
    protected def String getFileExtension()
    
    /**
     * Constructor
     * 
     * @param title The title of this action
     * @param imageName The name of an image file for this action. The image must be in the plugin's icons folder.
     */
    new(String title, String imageName) {
        super(title, imageName)
    }
    
    /**
     * Opens a select the file in which the simulation should be saved.
     * 
     * @return the path of the file to be created.
     */
    protected def IPath openSaveAsDialog() {
        val dialog = new SaveAsDialog(DataPoolView.instance.viewer.control.shell)
        dialog.blockOnOpen = true
        val lastFiles = SimulationLaunchConfig.lastFiles
        if(!lastFiles.isNullOrEmpty) {
            val lastFile = lastFiles.get(0)
            val newFileName = Files.getNameWithoutExtension(lastFile.name.replace("Sim_", ""))+fileExtension
            val newFile = lastFile.project.getFile(newFileName)
            dialog.originalFile = newFile
        }
        dialog.open
        return dialog.result
    }
    
    /**
     * Determines if the simulation can be saved.
     * 
     * @return true if the simulation can be saved, false otherwise
     */
    protected def boolean isApplicable() {
        val simMan = SimulationManager.instance
        if(simMan == null || simMan.isStopped) {
            return false
        }
        if(simMan.currentPool.models.size > 1) {
            throw new Exception("Saving data pools with more than one model is not supported at the moment.")
        }
    }
    
    /**
     * Opens the save as dialog and saves the simulation to a file.
     */
    override run() {
        val result = openSaveAsDialog()
        if(result != null) {
            val selectedFile = PromPlugin.findFile(result)
            if(selectedFile != null) {
                val simMan = SimulationManager.instance
                val history = simMan.currentPool.history
                history.add(simMan.currentPool)
                // The first pool in the history is created after the initialization, not after the first tick.
                // Thus it should be removed from the history to create a valid trace of all ticks.
                history.remove(0)
                PromPlugin.createResource(selectedFile, getFileContent(history), true)
            }
        }
    }
}