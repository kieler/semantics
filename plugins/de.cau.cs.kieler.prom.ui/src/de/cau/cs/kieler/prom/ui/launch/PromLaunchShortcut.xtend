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
import org.eclipse.ui.ide.ResourceUtil

abstract class PromLaunchShortcut implements ILaunchShortcut {
    
    /**
     * The file handle from which this launch shortcut has been startet.
     */
    protected List<IFile> files = newArrayList()
    /**
     * The mode in which the shortcut was used. This is either 'run' or 'debug'.
     */
    protected String mode = ""
    /**
     * The file handle from which this launch shortcut has been startet.
     */
    protected IProject project
    /**
     * Flag to indicate if the launch configuration is newly created
     * or an already existing launch configuration will be used.
     */
    protected boolean isNewLaunchConfiguration = false
    
    /**
     * {@inheritDoc}
     */
    override void launch(IEditorPart editor, String mode) {
        val file = ResourceUtil.getFile(editor.editorInput)
        if (file != null) {
            this.files = #[file]
            this.project = file.project
            this.mode = mode
            launch()
        }
    }

    /**
     * {@inheritDoc}
     */
    override void launch(ISelection selection, String mode) {
        this.mode = mode
        if (selection instanceof IStructuredSelection) {
            val structuredSelection = selection as IStructuredSelection
            if (structuredSelection.firstElement instanceof IFile) {
                val file = structuredSelection.firstElement as IFile
                if(file != null) {
                    this.files = structuredSelection.toList
                    this.project = file.project
                    this.mode = mode
                    launch()         
                }
            }    
        }
    }
    
    abstract protected def void launch()
    
    /**
     * Searches for a launch configuration in the project. Creates a new one if none found.
     * 
     * @param mode The mode the launch should be performed in (e.g. 'run' or 'debug')
     * @return launch configuration for the project. 
     */
    protected def ILaunchConfiguration findLaunchConfiguration(String mode) {
        val configs = getLaunchConfigurations()
        var ILaunchConfiguration configuration
        if (configs.isEmpty) { 
            isNewLaunchConfiguration = true
            configuration = createNewConfiguration()
        } else { 
            configuration = configs.get(0)    
        }
        
        return configuration
    }

    /**
     * Creates and initializes a new launch config for the project.
     * 
     * @return the new launch configuration
     */
    protected def ILaunchConfiguration createNewConfiguration(String launchConfigTypeId) {
        try {
            val lm = DebugPlugin.getDefault().getLaunchManager()
            val type = lm.getLaunchConfigurationType(launchConfigTypeId)
            val baseName = getNewLaunchConfigurationBaseName
            val name = baseName + " ("+type.name+")"
            val uniqueName = getUniqueNameForLaunchConfig(lm, name, -1)
            val wc = type.newInstance(null, uniqueName)
            initializeConfiguration(wc)
            return wc.doSave()
        } catch (CoreException ce) {
            ce.printStackTrace()
        }
        return null
    }
    
    /**
     * The base name for a new launch configuration
     * 
     * @return a suited name for a new launch configuration for the selected files
     */
    protected def String getNewLaunchConfigurationBaseName() {
        return project.name
    }
    
    /**
     * Creates and initializes a new launch config for the project.
     * 
     * @return the new launch configuration
     */
    abstract protected def ILaunchConfiguration createNewConfiguration()
    
    /**
     * Initializes a new launch config for the project.
     * The main file and environment used are loaded from the project's properties
     * if possible or from dialogs if not.
     * 
     * @param config The launch configuration to be initialized
     */
    abstract protected def void initializeConfiguration(ILaunchConfigurationWorkingCopy config)
    
    /**
     * Searches for all applicable launch configurations of the given id for this project.
     * 
     * @return list with the launch configurations.
     */
    protected def ArrayList<ILaunchConfiguration> getLaunchConfigurations(String launchConfigTypeId) {
        val result = new ArrayList<ILaunchConfiguration>()
        try {
            val manager = DebugPlugin.getDefault().getLaunchManager()
            val type = manager.getLaunchConfigurationType(launchConfigTypeId)
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
     * Searches for all applicable launch configurations for this project.
     * 
     * @return list with the launch configurations.
     */
    abstract protected def ArrayList<ILaunchConfiguration> getLaunchConfigurations()
    
    /**
     * Determines if a launch configuration is suited
     * for this project and contextthe shortcut was used on.
     * If a good match is found, it can be directly used
     * and there is no need to create a new launch config.
     * 
     * @return list with the launch configurations.
     */
    abstract protected def boolean isGoodMatch(ILaunchConfiguration config)
    
    /**
     * Makes a name for a launch configuration unique by adding an index
     * if the original name is already in use by another launch configuration.
     * 
     * @return a unique name for a launch configuration
     */
    protected def String getUniqueNameForLaunchConfig(ILaunchManager lm, String name, int suffixNumber) {
        val uniqueName = if(suffixNumber > 0)
            name + " ("+suffixNumber+")"
        else 
            name
        
        // Check if name is really unique
        for(config : lm.launchConfigurations) {
            // Name is not unique. Increase suffix number and check again.
            if(config.name.equals(uniqueName)) {
                return getUniqueNameForLaunchConfig(lm, name, suffixNumber + 1)
            }
        }
        
        // Return unique name
        return uniqueName
    }
}