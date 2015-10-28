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
package de.cau.cs.kieler.prom.launchconfig

import de.cau.cs.kieler.prom.common.FileCompilationData
import de.cau.cs.kieler.prom.common.PromPlugin
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.OperationCanceledException
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.ltk.core.refactoring.RefactoringStatus
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext
import org.eclipse.ltk.core.refactoring.participants.RenameParticipant

/**
 * In case of renaming a resource,
 * this participant will rename fields of KiCo launch configurations,
 * if they contain the old values.
 * 
 * The project, main file and model files are thus renamed automatically.
 * @author aas
 */
class LaunchConfigRenameParticipant extends RenameParticipant {
    
    private IProject project
    private IFile file
    
    private var String oldName
    private var String newName
    
    private var String oldPath
    private var String newPath
    
    /**
     * {@inheritDoc}
     */
    override checkConditions(IProgressMonitor pm, CheckConditionsContext context) throws OperationCanceledException {
        // It is always OK
        return new RefactoringStatus()
    }
    
    /**
     * {@inheritDoc}
     */
    override createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
        // Iterate over launch configs
        val manager = DebugPlugin.getDefault().getLaunchManager()
        val type = manager.getLaunchConfigurationType(LaunchConfiguration.LAUNCH_CONFIGURATION_TYPE_ID)
        val configs = manager.getLaunchConfigurations(type)
        for(config : configs) {
            // Get mutable instance
            val wc = config.getWorkingCopy()
            
            // Update instance
            updateConfiguration(wc)
        }
        
        // Update project properties
        updateProperties()
        
        return null
    }
    
    /**
     * {@inheritDoc}
     */
    override getName() {
        return "KiCo Launch Config Rename Participant"
    }
    
    /**
     * {@inheritDoc}
     */
    override protected initialize(Object element) {
        if(element instanceof IProject){
            project = element
            
            oldName = project.name
            newName = getArguments().getNewName()
            
            oldPath = ""
            newPath = ""
        } else if(element instanceof IFile){
            file = element
            
            oldName = file.name
            newName = getArguments().getNewName()
            
            oldPath = file.projectRelativePath.toOSString
            newPath = oldPath.substring(0,(oldPath.length-file.name.length)) + getArguments().newName
        }
        return true
    }    
    
    /**
     * Update the project properties.
     */
    private def void updateProperties(){
        // Rename main file
        if(file != null && oldPath == file.project.getPersistentProperty(PromPlugin.MAIN_FILE_QUALIFIER)){
            file.project.setPersistentProperty(PromPlugin.MAIN_FILE_QUALIFIER, newPath)
        }
    }
    
    /**
     * Update fields of the configuration.
     */
    private def void updateConfiguration(ILaunchConfigurationWorkingCopy wc){
        // Change project name
        updateProject(wc)
        
        // Change paths
        updateFiles(wc)
    }
    
    /**
     * Update the project name of the configuration.
     */
    private def void updateProject(ILaunchConfigurationWorkingCopy wc) {
        if(project != null) {
            // Rename project
            if(oldName == wc.getAttribute(LaunchConfiguration.ATTR_PROJECT, "")){
                wc.setAttribute(LaunchConfiguration.ATTR_PROJECT, newName)
                wc.doSave()
            }
        }
    }
    
    /**
     * Update the main file and model file paths of the configuration.
     */
    private def void updateFiles(ILaunchConfigurationWorkingCopy wc) {
        // Only work on files of the launch config's project
        val projectName = wc.getAttribute(LaunchConfiguration.ATTR_PROJECT, "")
        
        if(file != null && file.project != null && file.project.name == projectName) {
            // Rename main file
            if(oldPath == wc.getAttribute(LaunchConfiguration.ATTR_MAIN_FILE, "")){
                wc.setAttribute(LaunchConfiguration.ATTR_MAIN_FILE, newPath)
                wc.doSave()
            }
            
            // Rename model files
            val modelFiles = FileCompilationData.loadAllFromConfiguration(wc)
            var changed = false;
            // First change all data objects
            for(modelFile : modelFiles){
                if(oldPath == modelFile.projectRelativePath){
                    modelFile.projectRelativePath = newPath
                    changed = true
                }
            }
            // Flush all changes at once to the working copy
            if(changed){
                FileCompilationData.saveAllToConfiguration(wc, modelFiles)
                wc.doSave()
            }
        }
    }
}
