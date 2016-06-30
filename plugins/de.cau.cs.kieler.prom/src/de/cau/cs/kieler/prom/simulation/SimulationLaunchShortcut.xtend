package de.cau.cs.kieler.prom.simulation

import de.cau.cs.kieler.prom.common.SimulationFileData
import de.cau.cs.kieler.prom.common.SimulationLaunchData
import java.util.ArrayList
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.core.ILaunchManager
import org.eclipse.debug.ui.DebugUITools
import org.eclipse.debug.ui.ILaunchShortcut
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.ide.ResourceUtil

class SimulationLaunchShortcut implements ILaunchShortcut {
        
    var IProject project
    
    val List<SimulationFileData> simulationFiles = newArrayList()
    var boolean isNewLaunchConfiguration = false
    
    /**
     * {@inheritDoc}
     */
    override void launch(IEditorPart editor, String mode) {
        val file = ResourceUtil.getFile(editor.editorInput)
        if (file != null)
            launch(#[file], mode)
    }

    /**
     * {@inheritDoc}
     */
    override void launch(ISelection selection, String mode) {
        if (selection instanceof IStructuredSelection) {
            val structuredSelection = selection as IStructuredSelection
            if (structuredSelection.firstElement instanceof IFile)
                launch(structuredSelection.toList, mode)
        }
    }
    
    private def void launch(List<IFile> files, String mode) {
        println("simulation shortcut:" + files)
        
        // A launch shortcut is performed on files, so that there is at least one.
        project = files.get(0).project
        
        // Guess which files are models that should be compiled (sct, esterel)
        // and which files are data for the simulation (eso)
        classifyFiles(files)
        
        // Find or create config that matches the specified files and settings
        val config = findLaunchConfiguration(mode)
        if (config != null) {
            // Show dialog only if settings new. Directly launch the config otherwise.
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
    
    private def void classifyFiles(List<IFile> files) {
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
     * Searches for a launch configuration in the project. Creates a new one if none found.
     * 
     * @param mode The mode the launch should be performed in (e.g. 'run' or 'debug')
     * @return launch configuration for the project. 
     */
    private def ILaunchConfiguration findLaunchConfiguration(String mode) {
        val configs = getLaunchConfigurations()
        if (configs.isEmpty) {
            return createNewConfiguration()
        } else { 
            return configs.get(0)
            
        }
    }

    /**
     * Creates and initializes a new launch config for the project.
     * 
     * @return the new launch configuration
     */
    private def ILaunchConfiguration createNewConfiguration() {
        try {
            isNewLaunchConfiguration = true
            val lm = DebugPlugin.getDefault().getLaunchManager()
            val type = lm.getLaunchConfigurationType(SimulationLaunchConfig.LAUNCH_CONFIGURATION_TYPE_ID)
            val name = getUniqueNameForLaunchConfig(lm, project.name + " ("+type.name+")", -1)
            val wc = type.newInstance(null, name)
            initializeConfiguration(wc)
            return wc.doSave()
        } catch (CoreException ce) {
            ce.printStackTrace()
        }
        return null
    }
    
    private def String getUniqueNameForLaunchConfig(ILaunchManager lm, String name, int suffixNumber) {
        val uniqueName = if(suffixNumber > 0)
            name + " ("+suffixNumber+")"
        else 
            name
            
        // Check if name is really unique
        for(config : lm.launchConfigurations) {
            // Name is not unique. Increase suffix number and check again.
            if(config.name.equals(uniqueName)) {
                return getUniqueNameForLaunchConfig(lm, name, suffixNumber+1)
            }
        }
        // Return unique name
        return uniqueName
    }

    private def void initializeConfiguration(ILaunchConfigurationWorkingCopy config) {
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
     * Searches for all applicable launch configurations for this project.
     * 
     * @return list with the launch configurations.
     */
    private def ArrayList<ILaunchConfiguration> getLaunchConfigurations() {
        val result = new ArrayList<ILaunchConfiguration>()
        try {
            val manager = DebugPlugin.getDefault().getLaunchManager()
            val type = manager.getLaunchConfigurationType(SimulationLaunchConfig.LAUNCH_CONFIGURATION_TYPE_ID)
            val configurations = manager.getLaunchConfigurations(type)
            for (var i = 0; i < configurations.length; i++) {
                val config = configurations.get(i)
                if (!DebugUITools.isPrivate(config) && isGoodMatch(config)) {
                    result.add(config)
                }
            }
        } catch (CoreException e) {
        }
        return result
    }

    /**
     * Checks if the launch configuration is for this project and the files.
     * 
     * @param configuration The configuration to be checked
     */
    private def boolean isGoodMatch(ILaunchConfiguration configuration) {
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