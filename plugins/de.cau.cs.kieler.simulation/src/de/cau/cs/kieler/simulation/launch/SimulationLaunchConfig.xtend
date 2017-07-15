/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.simulation.launch

import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.simulation.SimulationUtil
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.debug.core.ILaunch
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate

class SimulationLaunchConfig implements ILaunchConfigurationDelegate  {
    
    public static val FILES_ATTR = "files"
    
    /**
     * The extension id of this launch config type.
     * It is set in the plugin.xml.
     */
    public static String LAUNCH_CONFIGURATION_TYPE_ID = "de.cau.cs.kieler.simulation.simulationLaunchConfig"
    
    /**
     * Static field to re-start last configuration
     */
    private static var List<IFile> lastFiles = newArrayList()
    
    /**
     * The file handle from which this launch shortcut has been startet.
     */
    protected List<IFile> files = newArrayList()
    
    public static def void launchLastSelection() {
        SimulationUtil.startSimulation(lastFiles)
    }
    
    override launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
        // Load settings from configuration
        loadSettings(configuration)
        
        // Create simulation based on selection
        SimulationUtil.startSimulation(files)
        lastFiles = files
    }
    
    private def void loadSettings(ILaunchConfiguration config) {
        // Load files that should be launched
        files.clear
        val filePaths = config.getAttribute(FILES_ATTR, #[])
        if(!filePaths.isNullOrEmpty) {
            for(filePath : filePaths) {
                val file = PromPlugin.findFile(filePath)
                if(file != null) {
                    files.add(file)
                }
            }
        }
    }
}