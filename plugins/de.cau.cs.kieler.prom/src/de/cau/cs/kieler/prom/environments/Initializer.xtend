package de.cau.cs.kieler.prom.environments

import de.cau.cs.kieler.prom.common.CommandData
import de.cau.cs.kieler.prom.common.EnvironmentData
import java.util.ArrayList
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer
import org.eclipse.jface.preference.IPreferenceStore
import de.cau.cs.kieler.prom.common.PromPlugin
import de.cau.cs.kieler.prom.launchconfig.LaunchConfiguration

/**
 * This class creates default environments if there are none.
 */
class Initializer extends AbstractPreferenceInitializer {

    /**
     * Reference to the preference store in which the environments are saved.
     */    
    private IPreferenceStore store
    
    new() {
        super()

        store = PromPlugin.getDefault().preferenceStore
    }

    /**
     * Fills the preference store with default environments if there are none.
     * The method is called by eclipse
     * if the preferences page is opened for the first time in this run.
     */
    override void initializeDefaultPreferences() {
        if(EnvironmentData.isPreferenceStoreEmpty(store)){
            initializeDefaultEnvironments()
        }
    }

    /** 
     * Fills the preference store with default environments.
     * Any other environment data in the store will be lost. 
     */
    def initializeDefaultEnvironments(){
        EnvironmentData.saveAllToPreferenceStore(store, getDefaultEnvironments())
    }

    /**
     * Returns a list with the default environments ready to use.
     */
    public static def getDefaultEnvironments(){
        val datas = new ArrayList<EnvironmentData>()
        
        // Generic
        var env = new EnvironmentData("Generic")
        
        env.targetLanguage = "s.c"
        env.targetFileExtension = ".c"
        env.targetTemplate = ""
        
        env.wrapperCodeTemplate = ""
        env.wrapperCodeSnippetsDirectory = ""
        env.wrapperCodeSnippetsOrigin = ""
        
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
        env.wrapperCodeSnippetsDirectory = ""
        env.wrapperCodeSnippetsOrigin = ""
        
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
        env.wrapperCodeSnippetsDirectory = ""
        env.wrapperCodeSnippetsOrigin = ""
        
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
        env.wrapperCodeSnippetsDirectory = "snippets/mindstorms_nxj"
        env.wrapperCodeSnippetsOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxj/snippets"
        
        env.commands.add(new CommandData("Compile", '''nxjc -cp "/opt/leJOS_0.9.1/lib:src:«LaunchConfiguration.BUILD_DIRECTORY»" "«LaunchConfiguration.BUILD_DIRECTORY»/Main.java"'''))
        env.commands.add(new CommandData("Deploy and Run", '''nxj -r -cp "/opt/leJOS_0.9.1/lib:src:«LaunchConfiguration.BUILD_DIRECTORY»" -o "Main.nxj" Main'''))
        
        env.relatedProjectWizardClass = "org.lejos.nxt.ldt.wizard.NewNXTProject"
        
        env.mainFile = "src/Main.ftl"
        env.mainFileOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxj/Main.ftl"
        
        datas += env
        
        return datas
    }
}
