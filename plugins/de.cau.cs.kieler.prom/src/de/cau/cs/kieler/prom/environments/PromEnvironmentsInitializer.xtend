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
package de.cau.cs.kieler.prom.environments

import de.cau.cs.kieler.prom.common.EnvironmentData
import de.cau.cs.kieler.prom.common.PromPlugin
import java.util.ArrayList
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Platform
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer
import org.eclipse.jface.preference.IPreferenceStore
import de.cau.cs.kieler.prom.common.KiCoLaunchData
import de.cau.cs.kieler.prom.launchconfig.LaunchConfiguration

/**
 * This class handles initialization of default environments.
 * 
 * @author aas
 */
class PromEnvironmentsInitializer extends AbstractPreferenceInitializer implements IEnvironmentsInitializer{

    /**
     * The extension point id of Prom environment initializers. 
     */
    private static val INITIALIZER_EXTENSION_POINT_ID = "de.cau.cs.kieler.prom.environmentInitializer"

    /**
     * Fills the preference store with default environments if there are none.
     * The method is called by eclipse
     * when the preferences page is opened for the first time in this run.
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
    public static def void initializeDefaultEnvironments(){
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
        datas += getGenericEnvironment()
        // Generic Java
        datas += getGenericJavaEnvironment()
        // Generic C
        datas += getGenericCEnvironment()
        return datas
    }
    
    /**
     * Creates a default environment for general projects.
     * @return the created environment
     */
    private static def EnvironmentData getGenericEnvironment() {
        var launchData = new KiCoLaunchData()
        
        launchData.targetLanguage = "s.c"
        launchData.targetLanguageFileExtension = ".c"
        
        var env = new EnvironmentData("Generic")
        env.launchData = launchData
        env.relatedProjectWizardClass = "org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard"
        return env
    }
    
    /**
     * Creates a default environment for Java projects.
     * @return the created environment
     */
    private static def EnvironmentData getGenericJavaEnvironment() {
        var launchData = new KiCoLaunchData()
        launchData.targetLanguage = "s.java"
        launchData.targetLanguageFileExtension = ".java"
        launchData.targetDirectory = LaunchConfiguration.BUILD_DIRECTORY
        
        var env = new EnvironmentData("Generic Java")
        env.launchData = launchData
        env.relatedProjectWizardClass = "org.eclipse.jdt.internal.ui.wizards.JavaProjectWizard"
        return env
    }
    
    /**
     * Creates a default environment for C projects.
     * @return the created environment
     */
    private static def EnvironmentData getGenericCEnvironment() {
        var launchData = new KiCoLaunchData()
        launchData.targetLanguage = "s.c"
        launchData.targetLanguageFileExtension = ".c"
        
        var env = new EnvironmentData("Generic C")
        env.launchData = launchData
        env.relatedProjectWizardClass = "org.eclipse.cdt.ui.wizards.CProjectWizard"
        return env
    }
    
    /**
     * Returns the preference store of the Prom plugin
     */
    private static def IPreferenceStore getStore(){
        return PromPlugin.^default.preferenceStore
    }
}
