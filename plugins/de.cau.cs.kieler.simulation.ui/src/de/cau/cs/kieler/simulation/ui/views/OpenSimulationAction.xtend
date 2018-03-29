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
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.SimulationManager
import java.io.File
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.dialogs.ResourceSelectionDialog

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
        if(dialog.result !== null) {
            val file = dialog.result.get(0)
            if(file !== null && file instanceof IFile) {
                return file as IFile
            }
        }
        return null
    }
    
    override run() {
        val file = openDialog()
        if(file !== null && file.exists) {
            loadSimulation(file)
        }
    }
    
    public static def void loadSimulation(IFile file) {
        if(SimulationManager.instance !== null && !SimulationManager.instance.isStopped) {
            // Read data pools from file
            val lines = Files.readLines(new File(file.location.toOSString), Charsets.UTF_8)
            if(!lines.isNullOrEmpty) {
                // Load the data pools
                val pools = <DataPool>newArrayList()
                for(line : lines) {
                    val pool = DataPool.createFromJson(line)
                    pools.add(pool)
                }
                // Set pools as new simulation state
                SimulationManager.instance.loadSimulation(pools)
            }
        }
    }
}