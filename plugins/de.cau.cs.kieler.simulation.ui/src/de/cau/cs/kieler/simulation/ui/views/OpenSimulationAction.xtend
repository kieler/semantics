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

import com.google.common.base.Charsets
import com.google.common.io.Files
import de.cau.cs.kieler.simulation.core.Model
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.dialogs.ResourceSelectionDialog
import java.io.File
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.DataPool

/**
 * @author aas
 *
 */
class OpenSimulationAction extends DataPoolViewToolbarAction {
    
    /**
     * Constructor
     * 
     * @param title The title of this action
     * @param imageName The name of an image file for this action. The image must be in the plugin's icons folder.
     */
    new(String title, String imageName) {
        super(title, imageName)
    }
    
    protected def IFile openDialog() {
        val rootResource = ResourcesPlugin.getWorkspace().getRoot()
        val shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
        val msg = "Select the Data Pool to load."
        val dialog = new ResourceSelectionDialog(shell, rootResource, msg);
        dialog.open
        if(dialog.result != null) {
            val file = dialog.result.get(0)
            if(file != null && file instanceof IFile) {
                return file as IFile
            }
        }
        return null
    }
    
    override run() {
        val file = openDialog()
        if(file != null) {
            // Read data pool from file
            val lines = Files.readLines(new File(file.location.toOSString), Charsets.UTF_8)
            if(!lines.isNullOrEmpty) {
                // Set the variables of the current pool
                var String lastNonEmptyLine
                for(line : lines) {
                    if(!line.isNullOrEmpty) {
                        lastNonEmptyLine = line
                    }
                }
                // Load the data pool from json
                val loadedPool = DataPool.createFromJson(lastNonEmptyLine)
                val currentPool = SimulationManager.instance?.currentPool
                if(currentPool != null && loadedPool != null) {
                    // Load the variable values
                    if(loadedPool.models.size == 1) {
                        // Set variables of the model
                        for(loadedVariable : loadedPool.allVariables) {
                            val currentVariable = currentPool.getVariable(loadedVariable.name)
                            currentVariable.userValue = loadedVariable.value
                        }
                    } else if(loadedPool.models.size > 1) {
                        // Set variables of all models
                        for(loadedModel : loadedPool.models) {
                            for(loadedVariable : loadedModel.variables) {
                                val currentVariable = currentPool.getVariable(loadedModel.name, loadedVariable.name)
                                currentVariable.userValue = loadedVariable.value
                            }
                        }
                    }
                    // Load the action index for the simulation
                    if(loadedPool.actionIndex >= 0 && SimulationManager.instance != null) {
                        SimulationManager.instance.currentState.actionIndex = loadedPool.actionIndex
                    }
                }
            }
        }
    }
}