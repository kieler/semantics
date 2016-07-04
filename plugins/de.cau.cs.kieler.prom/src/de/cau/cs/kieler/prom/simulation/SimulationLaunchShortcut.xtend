package de.cau.cs.kieler.prom.simulation

import de.cau.cs.kieler.prom.common.SimulationFileData
import de.cau.cs.kieler.prom.common.SimulationLaunchData
import de.cau.cs.kieler.prom.launchconfig.PromLaunchShortcut
import java.util.ArrayList
import java.util.List
import org.eclipse.core.runtime.CoreException
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.ui.DebugUITools
import org.eclipse.ui.PlatformUI

class SimulationLaunchShortcut extends PromLaunchShortcut {

    /**
     * Data object for the files that are part of this launch shortcut.
     */
    val List<SimulationFileData> simulationFiles = newArrayList()
    
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
            
            val f = new SimulationFileData(path.toOSString)
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