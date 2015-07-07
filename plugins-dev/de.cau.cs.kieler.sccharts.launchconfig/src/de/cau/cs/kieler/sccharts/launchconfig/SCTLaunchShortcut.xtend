package de.cau.cs.kieler.sccharts.launchconfig

import de.cau.cs.kieler.sccharts.launchconfig.common.EnvironmentData
import de.cau.cs.kieler.sccharts.launchconfig.common.SCTCompilationData
import java.util.ArrayList
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.ui.DebugUITools
import org.eclipse.debug.ui.ILaunchShortcut
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.dialogs.ResourceSelectionDialog
import org.eclipse.ui.ide.ResourceUtil
import org.eclipse.core.resources.IResource
import org.eclipse.swt.SWT
import org.eclipse.jface.window.Window

class SCTLaunchShortcut implements ILaunchShortcut {
    
    private IFile file
    private IProject project
    
    val launchConfigurationTypeId = "de.cau.cs.kieler.sccharts.launchconfig.scchartsLaunchConfiguration"
    
    /**
     * {@inheritDoc}
     */
    override void launch(IEditorPart editor, String mode) {
        val file = ResourceUtil.getFile(editor.editorInput)
        if(file != null)
            launch(file, mode)
    }
    
    /**
     * {@inheritDoc}
     */
    override void launch(ISelection selection, String mode) {
        if (selection instanceof IStructuredSelection) {
            val s = selection as IStructuredSelection
            if(s.firstElement instanceof IFile)
                launch(s.firstElement as IFile, mode)
        }
    }
    
    /**
     * Launch the sct file by adding it to an existing launch config of this project
     * or creating a new one if none yet.
     * If a new config is created the environment used will be fetched from the project properties.
     */
    def launch(IFile file, String mode){
        this.file = file 
        this.project = file.project
        
        val configuration = findLaunchConfiguration(mode)
        if(configuration != null){
            // Add the input file to the list of sct file which should be compiled
            // unless it is already in the list
            val datas = SCTCompilationData.loadAllFromConfiguration(configuration)
            
            // Check if already in list
            var alreadyInList = false
            for(data : datas){
                if(data.path == file.location.toOSString)
                    alreadyInList = true
            }
            
            // Add if not in list
            if(!alreadyInList){
                val workingCopy = configuration.getWorkingCopy()
                
                val data = new SCTCompilationData(file.location.toOSString, file.projectRelativePath.toOSString, file.name)
                datas += data
                SCTCompilationData.saveAllToConfiguration(workingCopy, datas)
                workingCopy.doSave()        
            }
            
            // Launch 
            DebugUITools.launch(configuration, mode)
        }
    }

    private def ILaunchConfiguration findLaunchConfiguration(String mode) {
        val configs = getLaunchConfigurations()
        var ILaunchConfiguration configuration
        if (configs.length == 0) {
            configuration = createNewConfiguration()
        } else {
            configuration = configs.get(0)
        }
        return configuration
    }
    
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
    
    private def initializeConfiguration(ILaunchConfigurationWorkingCopy config){
        // Set project
        config.setAttribute(LaunchConfiguration.ATTR_PROJECT, project.name)
        
        // Set main file of launch config as main file of project
        var mainFile = project.getPersistentProperty(LaunchConfigPlugin.MAIN_FILE_QUALIFIER)
        if(mainFile == null)
            mainFile = getMainFileFromDialog()
        config.setAttribute(LaunchConfiguration.ATTR_MAIN_FILE, mainFile)
        
        // Set environment of launch config as environment of project
        val environmentName = project.getPersistentProperty(LaunchConfigPlugin.ENVIRIONMENT_QUALIFIER)
        if(environmentName != null){ 
            val env =  EnvironmentData.loadFromPreferenceStore(LaunchConfigPlugin.^default.preferenceStore, environmentName) 
            config.setAttribute(LaunchConfiguration.ATTR_USE_ENVIRONMENT, true)
            config.setAttribute(LaunchConfiguration.ATTR_ENVIRONMENT, env.name)
        }
    } 
    
    private def String getMainFileFromDialog(){
        val dialog = new ResourceSelectionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
            project,
            "Select the main file of the project or cancel if the project does not need one.")
        dialog.title = "Main File Selection"
        
        val returnCode = dialog.open()
        if(returnCode == Window.OK){
            val results = dialog.result
            if (results != null && results.size > 0) {
                val result = results.get(0) as IResource
                return result.projectRelativePath.toOSString
            }
        }
        return ""
    }
    
    private def getLaunchConfigurations(){
        val result = new ArrayList<ILaunchConfiguration>()
        try{ 
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
    
    private def boolean isGoodMatch(ILaunchConfiguration configuration){
        val projectName = configuration.getAttribute(LaunchConfiguration.ATTR_PROJECT, "")
        return projectName == project.name
    }
}

