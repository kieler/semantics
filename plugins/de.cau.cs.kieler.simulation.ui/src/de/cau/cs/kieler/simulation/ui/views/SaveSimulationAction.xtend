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
import de.cau.cs.kieler.simulation.SimulationUtil
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.trace.printer.TracePrinter
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IPath
import org.eclipse.ui.dialogs.SaveAsDialog
import de.cau.cs.kieler.prom.ModelImporter

/**
 * Base class for toolbar action to save the complete simulation run to a file format. 
 * 
 * @author aas
 *
 */
class SaveSimulationAction extends DataPoolViewToolbarAction {
    /**
     * The trace printer that turns the data pool of the current simulation to a trace file.
     */
    private var TracePrinter tracePrinter
    
    /**
     * Constructor
     * 
     * @param title The title of this action
     * @param imageName The name of an image file for this action. The image must be in the plugin's icons folder.
     */
    new(String title, String imageName, TracePrinter tracePrinter) {
        super(title, imageName)
        this.tracePrinter = tracePrinter
    }
    
    /**
     * Opens a select the file in which the simulation should be saved.
     * 
     * @return the path of the file to be created.
     */
    protected def IPath openSaveAsDialog() {
        val dialog = new SaveAsDialog(DataPoolView.instance.viewer.control.shell)
        dialog.blockOnOpen = true
        // Find file of current simulation
        var IFile lastFile = null
        val lastFiles = SimulationUtil.lastFiles
        if(!lastFiles.isNullOrEmpty) {
            lastFile = lastFiles.get(0)
        } else if(SimulationUtil.lastEObject !== null) {
            val eObject = SimulationUtil.lastEObject
            lastFile = ModelImporter.toPlatformResource(eObject.eResource)
        }
        // Open dialog in folder of simulated file
        if(lastFile !== null) {
            val newFileName = Files.getNameWithoutExtension(lastFile.name.replace("Sim_", ""))+"."+tracePrinter.fileExtension
            val newFile = lastFile.project.getFile(newFileName)
            dialog.originalFile = newFile
        }
        dialog.open
        return dialog.result
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
                val fileContent = tracePrinter.getFileContent(history)
                PromPlugin.createResource(selectedFile, fileContent, true)
            }
        }
    }
}