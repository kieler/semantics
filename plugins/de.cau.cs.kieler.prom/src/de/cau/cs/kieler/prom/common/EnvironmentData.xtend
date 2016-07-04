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
package de.cau.cs.kieler.prom.common

import de.cau.cs.kieler.prom.launchconfig.LaunchConfiguration
import java.util.List
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.jface.preference.IPreferenceStore
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Data container for default settings to use in KiCo compilation and execution
 * as well as creation of new projects.
 * 
 * @author aas
 *
 */
class EnvironmentData extends ConfigurationSerializable {
    // Attribute names for the preference store.
    /**
     * Key for the attribute which holds a comma separated string of environment names.
     */
    private static val ENVIRONMENT_IDENTIFIERS_ATTR = "environments"
    
    // Fields
    /**
     * The unique name of the environment.
     * It is used to unambiguously store this environment's data. 
     */
    @Accessors
    protected String name = ""
    
    /**
     * Data container with default values for a KiCo launch. 
     */
    @Accessors
    protected KiCoLaunchData launchData = new KiCoLaunchData()
    
    /**
     * The class name of an implementation of the associated project wizard.
     */
    @Accessors
    protected String associatedProjectWizardClass = ""
    
    /**
     * A path to a file with the initial contents of a newly created main file of this environment.
     * This might either be a file system path or a URL with the platform protocol provided by eclipse
     * (e.g. 'platform:/plugin/org.myplugin/path/to/my/Main.java').
     */
    @Accessors
    protected String mainFileOrigin = ""
    
    /**
     * The project relative path for initial the model file, but without file extension. 
     */
    @Accessors
    protected String modelFile = ""
    
    /**
     * A path to a directory with the default contents for the snippet directory when creating a new project.
     * This might either be a file system path or a URL with the platform protocol provided by eclipse
     * (e.g. 'platform:/plugin/org.myplugin/directory/with/snippets').
     */
    @Accessors
    protected String wrapperCodeSnippetsOrigin = ""
    
    /**
     * Creates a new instance of the class.
     */
    new() {
    }
    
    /**
     * Creates a new instance of the class with the given name.
     * 
     * @param name The initial name
     */
    new(String name) {
        this()
        this.name = name
    }
    
    
    /**
     * {@inheritDoc}
     */    
    override getIdentifier() {
        return name
    }
    
    /**
     * {@inheritDoc}
     */    
    override setIdentifier(String value) {
        name = value
    }
    
    /**
     * @return true if the preference store does not contain any environment definitions.<br />
     *         false otherwise.
     */
    public static def boolean isPreferenceStoreEmpty(IPreferenceStore store){
        return store.getString(EnvironmentData.ENVIRONMENT_IDENTIFIERS_ATTR) == ""
    }
    
    /**
     * Saves the environments to the preference store.
     * They can be retrieved by using loadAllFromPreferenceStore(...)
     */
    public static def void saveAllToPreferenceStore(IPreferenceStore store, List<EnvironmentData> environments){
        ConfigurationSerializable.saveAllToPreferenceStore(store, EnvironmentData.ENVIRONMENT_IDENTIFIERS_ATTR, environments)
    }
    
    /**
     * Loads all environments from the preference store
     * which have been saved using saveAllToPreferenceStore(...).
     * @return list with the environments from the preference store.
     */
    public static def List<EnvironmentData> loadAllFromPreferenceStore(IPreferenceStore store){
        return ConfigurationSerializable.loadAllFromPreferenceStore(store, EnvironmentData.ENVIRONMENT_IDENTIFIERS_ATTR, EnvironmentData)
                as List<EnvironmentData>
    }
    
    /**
     * Creates an environment with the name and loads its settings from the preference store.
     * @return the created environment.
     */
    public static def EnvironmentData loadInstanceFromPreferenceStore(IPreferenceStore store, String environmentName) {
        var env = new EnvironmentData(environmentName)
        env.loadFromPreferenceStore(store)
        return env
    }
    
    /**
     * Set this environment's values as values of the launch configuration. 
     */
    def void applyToLaunchConfiguration(ILaunchConfigurationWorkingCopy config){
        // Save which environment was used to initialize this launch config
        config.setAttribute(LaunchConfiguration.ATTR_ENVIRONMENT, name)
        // Load data
        val loadedLaunchData = KiCoLaunchData.loadFromConfiguration(config)
        // Copy values of fields
        loadedLaunchData.setTargetLanguage(launchData.targetLanguage)
        loadedLaunchData.targetLanguageFileExtension = launchData.targetLanguageFileExtension
        loadedLaunchData.targetTemplate = launchData.targetTemplate
        loadedLaunchData.targetDirectory = launchData.targetDirectory
        
        loadedLaunchData.wrapperCodeTemplate = launchData.wrapperCodeTemplate
        loadedLaunchData.wrapperCodeSnippetDirectory = launchData.wrapperCodeSnippetDirectory
    
        loadedLaunchData.commands = launchData.commands
        loadedLaunchData.associatedLaunchShortcut = launchData.associatedLaunchShortcut
        // Save data
        KiCoLaunchData.saveToConfiguration(config, loadedLaunchData)
    }
}