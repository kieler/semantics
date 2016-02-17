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
class EnvironmentData extends ConfigurationSerializableData {
    // Attribute names for the preference store.
    /**
     * Key for the attribute which holds a comma separated string of environment names.
     */
    private static val ENVIRONMENT_IDENTIFIERS_ATTR = "environments"
    
    /**
     * Key for the attributes which holds the shell commands.
     */
    private static val String COMMAND_KEY = "command"
    /**
     * Key for the attribute which holds the user defined names of commands.
     */
    private static val String COMMAND_NAME_KEY = "command.name"
    /**
     * Key for the attribute that defines if the command should be executed.
     */
    private static val String COMMAND_ENABLED = "command.enabled"
    
    
    // Fields
    /**
     * The unique name of the environment.
     * It is used to unambiguously store this environment's data. 
     */
    @Accessors
    protected String name = ""
    
    /**
     * The class name of an implementation of the related project wizard for this environment.
     */
    @Accessors
    protected String relatedProjectWizardClass = ""
    
    /**
     * A project relative path to the default main file.
     * When creating a new project, this value is used to initialize the main file. 
     */
    @Accessors
    protected String mainFile = ""
    /**
     * A path to a file with the initial contents of a newly created main file of this environment.
     * This might either be a file system path or a URL with the platform protocol provided by eclipse
     * (e.g. 'platform:/plugin/org.myplugin/path/to/my/Main.java').
     */
    @Accessors
    protected String mainFileOrigin = ""
    
    
    
    /**
     * The target language for KiCo compilation.
     * This is the id of a KiCo transformation feature.
     */
    @Accessors
    protected String targetLanguage = ""
    
    /**
     * The file extension for the specified target language (e.g. '.java' for Java Code) 
     */
    @Accessors
    protected String targetFileExtension = ""
    
    /**
     * A path to a file used as template for the KiCo compilation result.
     */
    @Accessors
    protected String targetTemplate = ""

    /**
     * A path to a file used as template for wrapper code generation.
     * Generated wrapper code is inserted in this file.
     */
    @Accessors
    protected String wrapperCodeTemplate = ""
    
    /**
     * A path to a directory containing snippet definitions to use in wrapper code generation from annotations.
     */
    @Accessors
    protected String wrapperCodeSnippetsDirectory = ""
    
    /**
     * A path to a directory with the default contents for the snippet directory when creating a new project.
     * This might either be a file system path or a URL with the platform protocol provided by eclipse
     * (e.g. 'platform:/plugin/org.myplugin/directory/with/snippets').
     */
    @Accessors
    protected String wrapperCodeSnippetsOrigin = ""



    /**
     * List with commands which should be executed after the compilation and wrapper code generation
     * of a launch ended successfully.
     */
    @Accessors
    protected List<CommandData> commands = newArrayList()

    /**
     * The class name of an implementation of the associated launch shortcut for this environment.
     */
    @Accessors
    protected String associatedLaunchShortcut = ""
    
    /**
     * The class name of an implementation that generates wrapper code.
     */
    @Accessors
    protected String wrapperCodeGenerator = ""
    
    
    /**
     * Creates a new instance of the class.
     */
    new(){
    }
    
    /**
     * Creates a new instance of the class with the given name.
     * 
     * @param name The initial name
     */
    new(String name){
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
        ConfigurationSerializableData.saveAllToPreferenceStore(store, EnvironmentData.ENVIRONMENT_IDENTIFIERS_ATTR, environments)
    }
    
    /**
     * {@inheritDoc}
     */
    protected override saveToPreferenceStore(IPreferenceStore store){
        // String attributes
        super.saveToPreferenceStore(store)
        
        // Non string attributes
        var i = 0
        for(comm : commands){
            store.setValue(getStoreKey(COMMAND_KEY+i), comm.command)
            store.setValue(getStoreKey(COMMAND_NAME_KEY+i), comm.name)
            store.setValue(getStoreKey(COMMAND_ENABLED+i), comm.enabled)
            i++
        }
        
        // Remove further commands from store
        // which might have been there in an earlier state of this environment.
        while(store.getString(getStoreKey(COMMAND_KEY+i)) != ""){
            store.setValue(getStoreKey(COMMAND_KEY+i), "")
            store.setValue(getStoreKey(COMMAND_NAME_KEY+i), "")
            store.setValue(getStoreKey(COMMAND_ENABLED+i), "")
            i++
        }
    }
    
    /**
     * Loads all environments from the preference store
     * which have been saved using saveAllToPreferenceStore(...).
     * @return list with the environments from the preference store.
     */
    public static def List<EnvironmentData> loadAllFromPreferenceStore(IPreferenceStore store){
        return ConfigurationSerializableData.loadAllFromPreferenceStore(store, EnvironmentData.ENVIRONMENT_IDENTIFIERS_ATTR, EnvironmentData)
                as List<EnvironmentData>
    }
    
    /**
     * Creates an environment with the name and loads its settings from the preference store.
     * @return the created environment.
     */
    public static def EnvironmentData loadFromPreferenceStore(IPreferenceStore store, String environmentName) {
        var env = new EnvironmentData(environmentName)
        env.loadFromPreferenceStore(store)
        
        return env
    }
    
    /**
     * {@inheritDoc}
     */
    protected override loadFromPreferenceStore(IPreferenceStore store){
        // String attributes
        super.loadFromPreferenceStore(store)
        
        // Non string attributes
        var commandName = ""
        var command = ""
        var i = 0;
        do{
            commandName = store.getString(getStoreKey(COMMAND_NAME_KEY+i))
            command = store.getString(getStoreKey(COMMAND_KEY+i))
            if(commandName != "" || command != ""){
                val c = new CommandData(commandName, command)
                c.enabled = store.getString(getStoreKey(COMMAND_ENABLED+i))
                commands.add(c)
            }
            i++
        }while(commandName != "" || command != "")
    }
    
    /**
     * Set this environment's values as values of the launch configuration. 
     */
    def void applyToLaunchConfiguration(ILaunchConfigurationWorkingCopy config){
        config.setAttribute(LaunchConfiguration.ATTR_ENVIRONMENT, name)
        config.setAttribute(LaunchConfiguration.ATTR_TARGET_LANGUAGE, targetLanguage)
        config.setAttribute(LaunchConfiguration.ATTR_TARGET_LANGUAGE_FILE_EXTENSION, targetFileExtension)
        config.setAttribute(LaunchConfiguration.ATTR_TARGET_TEMPLATE, targetTemplate)
        config.setAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_TEMPLATE, wrapperCodeTemplate)
        config.setAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_SNIPPETS, wrapperCodeSnippetsDirectory)
        config.setAttribute(LaunchConfiguration.ATTR_ASSOCIATED_LAUNCH_SHORTCUT, associatedLaunchShortcut)
        config.setAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_GENERATOR, wrapperCodeGenerator)
        
        CommandData.saveAllToConfiguration(config, commands)    
    }
}