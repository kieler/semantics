/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.prom.simulation.ui

import de.cau.cs.kieler.prom.common.FileData
import de.cau.cs.kieler.prom.common.SimulationLaunchData
import de.cau.cs.kieler.prom.launchconfig.ui.PromLaunchShortcut
import de.cau.cs.kieler.prom.simulation.SimulationLaunchConfig
import java.util.ArrayList
import java.util.List
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.ui.DebugUITools
import org.eclipse.ui.PlatformUI

class SimulationLaunchShortcut extends PromLaunchShortcut {

    /**
     * Data object for the files that are part of this launch shortcut.
     */
    val List<FileData> simulationFiles = newArrayList()
    
    /**
     * {@inheritDoc}
     */
    override void launch() {
        println("simulation shortcut:" + files)
        
        // Guess which files are models that should be compiled (sct, esterel)
        // and which files are data for the simulation (eso)
        classifyFiles()
        
        // Find or create config that matches the specified files and settings
        val config = findLaunchConfiguration(mode)
        if (config != null) {
            // Show dialog only if the settings are new. Directly launch the config otherwise.
            if(isNewLaunchConfiguration) {
                // Open launch configuration dialog so the user can modify settings.
                DebugUITools.openLaunchConfigurationDialog(
                    PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                    config,
                    DebugUITools.getLaunchGroup(config, mode).getIdentifier(),
                    null)
            } else {
              DebugUITools.launch(config, mode)
            }
        }
    }
    
    /**
     * Guesses which files should be compiled via KiCo
     * and which files are only providing values for the simulation (e.g. ESO files).
     */
    private def void classifyFiles() {
        simulationFiles.clear()
        for(file : files) {
            val path = file.projectRelativePath
            val fileExtension = path.fileExtension
            
            val f = new FileData(path.toOSString)
            simulationFiles += f
            switch(fileExtension.toLowerCase) {
                case "eso": {
                    f.providesInputs = true                    
                }
                default: {
                    // Model files that ends with "environment" are assumed to provide values for the simulation. 
                    val nameWithoutExtension = path.removeFileExtension.lastSegment
                    if(nameWithoutExtension.toLowerCase.endsWith("environment")) {
                        f.providesInputs = true
                    }                                     
                }       
            }          
        }
    }

    /**
     * {@inheritDoc}
     */
    override def ILaunchConfiguration createNewConfiguration() {
        return createNewConfiguration(SimulationLaunchConfig.LAUNCH_CONFIGURATION_TYPE_ID)
    }
    
     /**
     * {@inheritDoc}
     */
    override def void initializeConfiguration(ILaunchConfigurationWorkingCopy config) {
        val launchData = new SimulationLaunchData()
        
        // Set project
        launchData.projectName = project.name

        // Set files
        launchData.files = simulationFiles

        // TODO: set simulator
        // TODO: set environment
        
        // Flush to configuration 
        SimulationLaunchData.saveToConfiguration(config, launchData)
    }

    /**
     * {@inheritDoc}
     */
    override def ArrayList<ILaunchConfiguration> getLaunchConfigurations() {
        return getLaunchConfigurations(SimulationLaunchConfig.LAUNCH_CONFIGURATION_TYPE_ID)
    }

    /**
     * {@inheritDoc}
     */
    override def boolean isGoodMatch(ILaunchConfiguration configuration) {
        val launchData = SimulationLaunchData.loadFromConfiguration(configuration)
        // The launch configuration must have the same number of files 
        if(simulationFiles.size != launchData.files.size) {
            return false            
        }
        // The files must be equal
        for(var i=0; i < simulationFiles.size; i++) {
            if(!simulationFiles.get(i).equals(launchData.files.get(i))) {
                return false
            }
        }
        // The project must be equal
        return launchData.projectName == project.name
    }
}