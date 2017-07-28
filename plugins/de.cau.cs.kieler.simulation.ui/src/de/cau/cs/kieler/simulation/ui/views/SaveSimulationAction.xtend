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
 * @author aas
 *
 */
abstract class SaveSimulationAction extends DataPoolViewToolbarAction {
    protected def String getFileContent(List<DataPool> history)
    protected def String getFileExtension()
    
    
    new(String title, String imageName) {
        super(title, imageName)
    }
    
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
    
    protected def boolean isApplicable() {
        val simMan = SimulationManager.instance
        if(simMan == null || simMan.isStopped) {
            return false
        }
        if(simMan.currentPool.models.size > 1) {
            throw new Exception("Saving data pools with more than one model is not supported at the moment.")
        }
    }
    
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