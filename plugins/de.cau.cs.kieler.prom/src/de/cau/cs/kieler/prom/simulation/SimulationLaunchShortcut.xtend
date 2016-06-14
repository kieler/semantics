package de.cau.cs.kieler.prom.simulation

import de.cau.cs.kieler.prom.common.SimulationLaunchData
import java.util.ArrayList
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Platform
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.core.ILaunchManager
import org.eclipse.debug.ui.DebugUITools
import org.eclipse.debug.ui.ILaunchShortcut
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.window.Window
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.dialogs.ElementListSelectionDialog
import org.eclipse.ui.ide.ResourceUtil

class SimulationLaunchShortcut implements ILaunchShortcut {
    
    private static String SIMULATOR_ID = "de.cau.cs.kieler.prom.simulator"
    
    var IProject project
    
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
        
        // TODO: guess which files are models that should be compiled (sct, esterel)
        // and which files are data for the simulation (eso)
        
        // Dialog to check and set settings if not obvious (e.g. environment and mapping which files are models / data)
        
        // Find or create config that matches the specified files
        val configuration = findLaunchConfiguration(mode)
        if (configuration != null) {
            // Launch the config
            DebugUITools.launch(configuration, mode)
        }
        
        // TODO (in launch config): compile via prom and get compilation result

        // TODO: Move to launch config start simulator        
        val simulator = getSimulatorFromDialog()
        if(simulator != null) {
            simulator.simulate(files, #[], #[]);
        }
    }
    
    private def ISimulator getSimulatorFromDialog() {
        // Get simulators from extensions
        val config = Platform.getExtensionRegistry().getConfigurationElementsFor(SIMULATOR_ID);
        
        // Label provider to display environment
        val labelProvider = new LabelProvider() {
            override getText(Object o) {
                return (o as IConfigurationElement).getAttribute("class")
            }
        }
        
        // Selection dialog
        val dialog = new ElementListSelectionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
            labelProvider)
        dialog.title = "Simulator selection"
        dialog.message = "Select a simulator."
        dialog.setElements(config)

        // Check result
        val returnCode = dialog.open()
        if (returnCode == Window.OK) {
            val results = dialog.result
            if (results != null && results.size > 0) {
                val result = results.get(0) as IConfigurationElement
                
                // Instantiate simulator
                try {
                    val o = result.createExecutableExtension("class");
                    if (o instanceof ISimulator) {
                        return o
                    }
                } catch (CoreException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
        return null
    }
    
    /**
     * Searches for a launch configuration in the project. Creates a new one if none found.
     * 
     * @param mode The mode the launch should be performed in (e.g. 'run' or 'debug')
     * @return launch configuration for the project. 
     */
    private def ILaunchConfiguration findLaunchConfiguration(String mode) {
        val configs = getLaunchConfigurations()
        var ILaunchConfiguration configuration
        if (configs.isEmpty) 
            configuration = createNewConfiguration()
        else 
            configuration = configs.get(0)
        
        return configuration
    }

    /**
     * Creates and initializes a new launch config for the project.
     * 
     * @return the new launch configuration
     */
    private def ILaunchConfiguration createNewConfiguration() {
        try {
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
        return launchData.projectName == project.name
    }
}