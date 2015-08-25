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
import org.eclipse.ltk.core.refactoring.participants.DeleteParticipant

/**
 * In case of deleting a resource,
 * this participant will empty fields of KiCo launch configurations,
 * if they contain the old values.
 * 
 * The project, main file and model files are thus cleared automatically.
 * @author aas
 */
class LaunchConfigDeleteParticipant extends DeleteParticipant {
    
    private IProject project
    private IFile file
    
    private var String oldName
    
    private var String oldPath
    
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
        
        // Update project properites
        updateProperties()
        
        return null
    }
    
    /**
     * {@inheritDoc}
     */
    override getName() {
        return "KiCo Launch Config Delete Participant"
    }
    
    /**
     * {@inheritDoc}
     */
    override protected initialize(Object element) {
        if(element instanceof IProject){
            project = element
            
            oldName = project.name
            oldPath = ""
        } else if(element instanceof IFile){
            file = element
            
            oldName = file.name
            oldPath = file.projectRelativePath.toOSString
        }
        return true
    }    
    
    /**
     * Update the project properties.
     */
    private def void updateProperties(){
        // Remove main file
        if(file != null && oldPath == file.project.getPersistentProperty(PromPlugin.MAIN_FILE_QUALIFIER)){
            file.project.setPersistentProperty(PromPlugin.MAIN_FILE_QUALIFIER, null)
        }
    }
    
    /**
     * Update fields of the configuration.
     */
    private def void updateConfiguration(ILaunchConfigurationWorkingCopy wc){
        // Delete files
        updateFiles(wc)
        
        // Delete project
        updateProject(wc)
    }
    
    /**
     * Update the project name of the configuration.
     */
    private def void updateProject(ILaunchConfigurationWorkingCopy wc) {
        if(project != null) {
            val oldName = project.name
            // Delete complete launch configuration
            if(oldName == wc.getAttribute(LaunchConfiguration.ATTR_PROJECT, "")){
                wc.delete()
                wc.doSave().delete()
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
            val oldPath = file.projectRelativePath.toOSString
            
            // Clear main file field
            if(oldPath == wc.getAttribute(LaunchConfiguration.ATTR_MAIN_FILE, "")){
                wc.setAttribute(LaunchConfiguration.ATTR_MAIN_FILE, "")
                wc.doSave()
            }
            // Main file in project properties
            if(oldPath == file.project.getPersistentProperty(PromPlugin.MAIN_FILE_QUALIFIER)){
                file.project.setPersistentProperty(PromPlugin.MAIN_FILE_QUALIFIER, null)
            }
            
            // Remove model files
            val modelFiles = FileCompilationData.loadAllFromConfiguration(wc)
            val cloneOfModelFiles = modelFiles.clone()
            var changed = false;
            // First change all data objects
            // (We iterate over a clone of the collection, because the original will be modified)
            for(modelFile : cloneOfModelFiles){
                if(oldPath == modelFile.projectRelativePath){
                    modelFiles.remove(modelFile)
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
