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
package de.cau.cs.kieler.prom.ui.launch

import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.data.EnvironmentData
import de.cau.cs.kieler.prom.data.FileData
import de.cau.cs.kieler.prom.data.KiCoLaunchData
import de.cau.cs.kieler.prom.environments.PromEnvironmentsInitializer
import de.cau.cs.kieler.prom.launch.KiCoLaunchConfig
import org.eclipse.core.resources.IResource
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.ui.DebugUITools
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.window.Window
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.dialogs.ElementListSelectionDialog
import org.eclipse.ui.dialogs.ResourceSelectionDialog

/**
 * An implementation for a launch shortcut
 * that will add a file to an existing KiCo launch configuration
 * if there is one for the project the file is in.
 * Otherwise a new launch configuration is created
 * using the environment and main file the project has been created with.
 * 
 * @author aas
 */
class KiCoLaunchShortcut extends PromLaunchShortcut {

    /**
     * Launch the file by adding it to an existing launch config of this project
     * or creating a new one if none yet.
     * If a new config is created the main file and environment used to initialize it
     * will be fetched from the project preferences if possible or from a user dialog if not.
     * 
     * @param file The file to be launched
     * @param mode The mode the launch should be performed in (e.g. 'run' or 'debug')
     */
    override def void launch() {
        val file = files.get(0)
        // Find launch config for the project or initialize new one.
        val configuration = findLaunchConfiguration(mode)
        if (configuration != null && file != null) {
            
            // Add the input file to the list of files which should be compiled
            // unless it is already in the list
            val datas = FileData.loadAllFromConfiguration(configuration)

            // Check if already in list
            var alreadyInList = false
            for (data : datas) {
                if (data.projectRelativePath == file.projectRelativePath.toOSString)
                    alreadyInList = true
            }

            // Add if not in list
            if (!alreadyInList) {
                val workingCopy = configuration.getWorkingCopy()

                val data = new FileData(file.projectRelativePath.toOSString)
                datas += data
                FileData.saveAllToConfiguration(workingCopy, datas)
                workingCopy.doSave()
            }

            // Launch 
            DebugUITools.launch(configuration, mode)
        }
    }

    /**
     * {@inheritDoc}
     */
    override ILaunchConfiguration createNewConfiguration() {
        return createNewConfiguration(KiCoLaunchConfig.LAUNCH_CONFIGURATION_TYPE_ID)
    }

    /**
     * {@inheritDoc}
     */
    override void initializeConfiguration(ILaunchConfigurationWorkingCopy config) {
        val launchData = new KiCoLaunchData()
        
        // Set project
        launchData.projectName = project.name

        // Set main file of launch config as main file of project
        launchData.mainFile = project.getPersistentProperty(PromPlugin.MAIN_FILE_QUALIFIER)
        if (launchData.mainFile.isNullOrEmpty()) {
            launchData.mainFile = getMainFileFromDialog()    
        }

        // Set KiCo target
        launchData.targetDirectory = PromPlugin.BUILD_DIRECTORY
        launchData.targetLanguage = "s.c"
        launchData.targetLanguageFileExtension = ".c"
        
        // Flush to configuration 
        KiCoLaunchData.saveToConfiguration(config, launchData)

        // Initialize launch config with environment
        var EnvironmentData env
        
        // Get environment from project properties if possible
        val environmentName = project.getPersistentProperty(PromPlugin.ENVIRIONMENT_QUALIFIER)
        if (environmentName != null) {
            env = EnvironmentData.loadInstanceFromPreferenceStore(PromPlugin.preferenceStore, environmentName)
        } else {
            env = getEnvironmentFromDialog()            
        }

        if (env != null) {
            // Copy values from environment
            env.applyToLaunchConfiguration(config)
        }
    }

    /**
     * {@inheritDoc}
     */
    override boolean isGoodMatch(ILaunchConfiguration configuration) {
        val launchData = KiCoLaunchData.loadFromConfiguration(configuration)
        return launchData.projectName == project.name
    }
    
    /**
     * {@inheritDoc}
     */
    override protected getLaunchConfigurations() {
        return getLaunchConfigurations(KiCoLaunchConfig.LAUNCH_CONFIGURATION_TYPE_ID)
    }
    
    /**
     * Opens a dialog such that the user can select this project's main file.
     * 
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
     * Opens a dialog such that the user can select an environment for this launch.
     * 
     * @return the selected EnvironmentData.
     */
    private def EnvironmentData getEnvironmentFromDialog() {
        // Load environments
        val store = PromPlugin.preferenceStore
        var environments = EnvironmentData.loadAllFromPreferenceStore(store)
        if(environments.isEmpty){
            environments = PromEnvironmentsInitializer.getAllDefaultEnvironments()
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
}

