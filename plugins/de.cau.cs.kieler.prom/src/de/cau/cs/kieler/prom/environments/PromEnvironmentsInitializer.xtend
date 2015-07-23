package de.cau.cs.kieler.prom.environments

import de.cau.cs.kieler.prom.common.EnvironmentData
import de.cau.cs.kieler.prom.common.PromPlugin
import java.util.ArrayList
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Platform
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer
import org.eclipse.jface.preference.IPreferenceStore

/**
 * This class creates default environments if there are none.
 */
class PromEnvironmentsInitializer extends AbstractPreferenceInitializer implements IEnvironmentsInitializer{

    static val INITIALIZER_EXTENSION_POINT_ID = "de.cau.cs.kieler.prom.environmentInitializer"

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
    public static def initializeDefaultEnvironments(){
        EnvironmentData.saveAllToPreferenceStore(store, getAllDefaultEnvironments())
    }

    /**
     * Fetches all default environments from all registered environment initializers.
     */
    public static def getAllDefaultEnvironments(){
        val datas = new ArrayList<EnvironmentData>()
        
        // Get environments defined by extensions
        // that implement an environment initializer.
        val config = Platform.getExtensionRegistry().getConfigurationElementsFor(INITIALIZER_EXTENSION_POINT_ID);
        try {
            for (IConfigurationElement e : config) {
            val o = e.createExecutableExtension("class");
                if (o instanceof IEnvironmentsInitializer) {
                    datas += o.getDefaultEnvironments()
                }
            }
        } catch (CoreException ex) {
            System.err.println(ex.getMessage());
        }
        
        return datas
    }

    /**
     * @{inheritDoc}
     */
    override getDefaultEnvironments(){
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
        
        return datas
    }
    
    private static def getStore(){
        return PromPlugin.^default.preferenceStore
    }
}
