package de.cau.cs.kieler.sccharts.environments

import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfigPlugin
import de.cau.cs.kieler.sccharts.launchconfig.common.EnvironmentData
import java.util.ArrayList
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer
import org.eclipse.jface.preference.IPreferenceStore

class Initializer extends AbstractPreferenceInitializer {
    
    private IPreferenceStore store
    
    new() {
        super()
        
        store = LaunchConfigPlugin.getDefault().preferenceStore
    }

    override void initializeDefaultPreferences() {
        if(EnvironmentData.isPreferencesStoreEmpty(store)){
            initializeDefaultEnvironments()
        }
    }

    def initializeDefaultEnvironments(){
        EnvironmentData.saveAllToPreferenceStore(store, getDefaultEnvironments())
    }

    public static def getDefaultEnvironments(){
        val datas = new ArrayList<EnvironmentData>()
        
        // Generic
        var env = new EnvironmentData("Generic")
        
        env.targetLanguage = "s.c"
        env.targetFileExtension = ".c"
        env.targetTemplate = ""
        
        env.wrapperCodeTemplate = ""
        env.wrapperCodeTarget = ""
        env.wrapperCodeSnippetsDirectory = ""
        env.wrapperCodeSnippetsOrigin = ""
        
        env.compileCommand = ""
        env.deployCommand = ""
        env.runCommand = ""
        
        env.relatedProjectWizardClass = "org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard"
        
        env.mainFile = ""
        env.mainFileOrigin = ""
        
        datas += env
        
        // Generic Java
        env = new EnvironmentData("Generic Java")
        
        env.targetLanguage = "s.java"
        env.targetFileExtension = ".java"
        env.targetTemplate = ""
        
        env.wrapperCodeTemplate = ""
        env.wrapperCodeTarget = ""
        env.wrapperCodeSnippetsDirectory = ""
        env.wrapperCodeSnippetsOrigin = ""
        
        env.compileCommand = ""
        env.deployCommand = ""
        env.runCommand = ""
        
        env.relatedProjectWizardClass = "org.eclipse.jdt.internal.ui.wizards.JavaProjectWizard"
        
        env.mainFile = ""
        env.mainFileOrigin = ""
        
        datas += env
        
        // Generic C
        env = new EnvironmentData("Generic C")
        
        env.targetLanguage = "s.c"
        env.targetFileExtension = ".c"
        env.targetTemplate = ""
        
        env.wrapperCodeTemplate = ""
        env.wrapperCodeTarget = ""
        env.wrapperCodeSnippetsDirectory = ""
        env.wrapperCodeSnippetsOrigin = ""
        
        env.compileCommand = ""
        env.deployCommand = ""
        env.runCommand = ""
        
        env.relatedProjectWizardClass = "org.eclipse.cdt.ui.wizards.CProjectWizard"
        
        env.mainFile = ""
        env.mainFileOrigin = ""
        
        datas += env
        
        // Mindstorms NXJ
        env = new EnvironmentData("Mindstorms NXJ")
        
        env.targetLanguage = "s.java"
        env.targetFileExtension = ".java"
        env.targetTemplate = ""
        
        env.wrapperCodeTemplate = "src/Main.ftl"
        env.wrapperCodeTarget = "sct-get/Main.java"
        env.wrapperCodeSnippetsDirectory = "templates/Mindstorms NXJ"
        env.wrapperCodeSnippetsOrigin = "/home/aas/SCCharts Environments/Mindstorms NXJ/templates/"
        
        env.compileCommand = 'nxjc -cp "/opt/leJOS/lib:sct-gen:src" "sct-gen/Main.java"'
        env.deployCommand = 'nxj -cp "/opt/leJOS/lib:sct-gen:src" -o "Main.nxj" Main'
        env.runCommand = ""
        
        env.relatedProjectWizardClass = "org.lejos.nxt.ldt.wizard.NewNXTProject"
        
        env.mainFile = "scr/Main.ftl"
        env.mainFileOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.launchconfig/resources/environments/mindstorms_nxj/Main.ftl"
        
        datas += env
        
        return datas
    }
}
