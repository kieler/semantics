package de.cau.cs.kieler.sccharts.launchconfig

import de.cau.cs.kieler.sccharts.environments.Initializer
import de.cau.cs.kieler.sccharts.launchconfig.common.EnvironmentData
import de.cau.cs.kieler.sccharts.launchconfig.common.SCTCompilationData
import java.util.ArrayList
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.CoreException
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.ui.DebugUITools
import org.eclipse.debug.ui.ILaunchShortcut
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.window.Window
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.dialogs.ElementListSelectionDialog
import org.eclipse.ui.dialogs.ResourceSelectionDialog
import org.eclipse.ui.ide.ResourceUtil

class SCTLaunchShortcut implements ILaunchShortcut {

    /**
     * The file handle from which this launch shortcut has been startet.
     */
    private IFile file
    /**
     * The project handle from which this launch shortcut has been startet.
     */
    private IProject project

    /**
     * The extension id of this launch shortcut set in the plugin.xml.
     */
    val launchConfigurationTypeId = "de.cau.cs.kieler.sccharts.launchconfig.scchartsLaunchConfiguration"

    /**
     * {@inheritDoc}
     */
    override void launch(IEditorPart editor, String mode) {
        val file = ResourceUtil.getFile(editor.editorInput)
        if (file != null)
            launch(file, mode)
    }

    /**
     * {@inheritDoc}
     */
    override void launch(ISelection selection, String mode) {
        if (selection instanceof IStructuredSelection) {
            val structuredSelection = selection as IStructuredSelection
            if (structuredSelection.firstElement instanceof IFile)
                launch(structuredSelection.firstElement as IFile, mode)
        }
    }

    /**
     * Launch the sct file by adding it to an existing launch config of this project
     * or creating a new one if none yet.
     * If a new config is created the main file and environment used to initialize it
     * will be fetched from the project preferences if possible or from a user dialog if not.
     */
    def launch(IFile file, String mode) {
        this.file = file
        this.project = file.project

        // Find launch config for the project or initialize new one.
        val configuration = findLaunchConfiguration(mode)
        if (configuration != null) {
            // Add the input file to the list of sct files which should be compiled
            // unless it is already in the list
            val datas = SCTCompilationData.loadAllFromConfiguration(configuration)

            // Check if already in list
            var alreadyInList = false
            for (data : datas) {
                if (data.projectRelativePath == file.projectRelativePath.toOSString)
                    alreadyInList = true
            }

            // Add if not in list
            if (!alreadyInList) {
                val workingCopy = configuration.getWorkingCopy()

                val data = new SCTCompilationData(file.projectRelativePath.toOSString, file.name)
                datas += data
                SCTCompilationData.saveAllToConfiguration(workingCopy, datas)
                workingCopy.doSave()
            }

            // Launch 
            DebugUITools.launch(configuration, mode)
        }
    }

    /**
     * Searches for a sct launch configuration in the project. Creates a new one if none found.
     * @return sct launch configuration for the project. 
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
     * Creates and initializes a new sct launch config for the project.
     */
    private def ILaunchConfiguration createNewConfiguration() {
        try {
            val lm = DebugPlugin.getDefault().getLaunchManager()
            val type = lm.getLaunchConfigurationType(launchConfigurationTypeId)
            val name = project.name
            val wc = type.newInstance(null, name)
            initializeConfiguration(wc)
            return wc.doSave()
        } catch (CoreException ce) {
        }
        return null
    }

    /**
     * Initializes a new sct launch config for the project.
     * The main file and environment used are loaded from the project's properties
     * if possible or from dialogs if not.
     */
    private def initializeConfiguration(ILaunchConfigurationWorkingCopy config) {
        // Set project
        config.setAttribute(LaunchConfiguration.ATTR_PROJECT, project.name)

        // Set main file of launch config as main file of project
        var mainFile = project.getPersistentProperty(LaunchConfigPlugin.MAIN_FILE_QUALIFIER)
        if (mainFile == null)
            mainFile = getMainFileFromDialog()
        config.setAttribute(LaunchConfiguration.ATTR_MAIN_FILE, mainFile)

        // Initialize launch config with environment
        var EnvironmentData env
        
        // Get environment from project properties if possible
        val environmentName = project.getPersistentProperty(LaunchConfigPlugin.ENVIRIONMENT_QUALIFIER)
        if (environmentName != null)
            env = EnvironmentData.loadFromPreferenceStore(LaunchConfigPlugin.^default.preferenceStore, environmentName)
        else
            env = getEnvironmentFromDialog()

        if (env != null)
            // Copy values from environment
            env.applyToLaunchConfiguration(config)
    }

    /**
     * Opens a dialog such that the user can select this project's main file.
     * @return the project relative path of the selected file.  
     */
    private def String getMainFileFromDialog() {
        val dialog = new ResourceSelectionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
            project, "Select the main file of the project or cancel if the project does not need one.")
        dialog.title = "Main File Selection"

        val returnCode = dialog.open()
        if (returnCode == Window.OK) {
            val results = dialog.result
            if (results != null && results.size > 0) {
                val result = results.get(0) as IResource
                return result.projectRelativePath.toOSString
            }
        }
        return ""
    }

    /**
     * Opens a dialog such that the user can select an SCChart environment for this launch.
     * @return the selected EnvironmentData.
     */
    private def EnvironmentData getEnvironmentFromDialog() {
        // Load environments
        val store = LaunchConfigPlugin.^default.preferenceStore
        var environments = EnvironmentData.loadAllFromPreferenceStore(store)
        if(environments.isEmpty){
            environments = Initializer.getDefaultEnvironments()
            EnvironmentData.saveAllToPreferenceStore(store, environments)
        }
        
        // Label provider to display environment
        val labelProvider = new LabelProvider() {
            override getText(Object o) {
                return (o as EnvironmentData).name
            }
        }
    
        // Selection dialog
        val dialog = new ElementListSelectionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
            labelProvider)
        dialog.title = "Environment selection"
        dialog.message = "Select the environment which will be used to initialize the launch configuration."
        dialog.setElements(environments)

        val returnCode = dialog.open()
        if (returnCode == Window.OK) {
            val results = dialog.result
            if (results != null && results.size > 0) {
                val result = results.get(0) as EnvironmentData
                return result
            }
        }
        return null
    }

    /**
     * Searches for all sct launch configurations for this project.
     * @return list with the launch configurations.
     */
    private def getLaunchConfigurations() {
        val result = new ArrayList<ILaunchConfiguration>()
        try {
            val manager = DebugPlugin.getDefault().getLaunchManager()
            val type = manager.getLaunchConfigurationType(launchConfigurationTypeId)
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
     * Checks if the launch configuration is for this project.
     */
    private def boolean isGoodMatch(ILaunchConfiguration configuration) {
        val projectName = configuration.getAttribute(LaunchConfiguration.ATTR_PROJECT, "")
        return projectName == project.name
    }
}

