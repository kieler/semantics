/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.launchconfig.common

import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfigPlugin
import java.util.ArrayList
import java.util.List
import org.eclipse.jface.preference.IPreferenceStore
import org.eclipse.xtend.lib.annotations.Accessors
import java.lang.reflect.Modifier

/**
 * Data container for SCCharts compilation and execution and creation of new SCCharts project.
 * 
 * @author aas
 *
 */
class EnvironmentData {
    
    private static val String COMMAND_KEY = "command"
    private static val String COMMAND_NAME_KEY = "command.name"
    
    new(){
    }
    
    new(String name){
        this.name = name
    }
    
    /**
     * The unique name of the environment.
     * It is used to unambiguously store this environment's data in a preference store. 
     */
    @Accessors
    protected String name = ""
    
    
    
    /**
     * The target language for SCT compilation via KiCo.
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



    @Accessors
    protected List<CommandData> commands = newArrayList()


    
    /**
     * The class name of an implementation of the related project wizard for this environment.
     */
    @Accessors
    protected String relatedProjectWizardClass = ""
    
    
    
    /**
     * A project relative path to the default main file.
     * When creating a new SCCharts project, this value is used to initialize the main file creation page. 
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
     * @return true if the preference store does not contain any environment definitions.<br />
     *         false otherwise.
     */
    public static def boolean isPreferencesStoreEmpty(IPreferenceStore store){
        return store.getString(LaunchConfigPlugin.ENVIRONMENTS_CSV_ATTR) == ""
    }
    
    /**
     * Loads all environments from the preference store which have been saved using saveAllToPreferenceStore(...).
     * @return list with the environments saved in the preference store.
     */
    public static def ArrayList<EnvironmentData> loadAllFromPreferenceStore(IPreferenceStore store){
        val environmentsCSV = store.getString(LaunchConfigPlugin.ENVIRONMENTS_CSV_ATTR)
        
        // No environments specified
        if(environmentsCSV == "")
            return newArrayList()
        
        // Split names on comma
        val environmentsNames = environmentsCSV.split(",")
        
        // Load every environment
        val environments = new ArrayList<EnvironmentData>()
        for(envName : environmentsNames){
            var env = new EnvironmentData(envName)
            environments += env
            
            // Load every field of the environment
            env.loadFromPreferenceStore(store)
        }
        
        return environments
    }
    
    /**
     * Creates an environment with the data from a preference store.
     * The name is used to unambiguously identify the environment.
     * @return the loaded environment.
     */
    public static def EnvironmentData loadFromPreferenceStore(IPreferenceStore store, String environmentName) {
        
        var env = new EnvironmentData(environmentName)
        
        // Load every field of the environment
        env.loadFromPreferenceStore(store)
        
        return env
    } 
    
    /**
     * Loads the values of this class's fields from the prefernce store.
     * The values are unambiguously stored using an environment's name.
     */
    private def loadFromPreferenceStore(IPreferenceStore store){
        val classObject = typeof(EnvironmentData)
        for(f : classObject.declaredFields){
            if (f.type == String && !Modifier.isStatic(f.modifiers))
                f.set(this, store.getString(getStoreKey(f.name)))
        }
        
        // Non String attributes
        var commandName = ""
        var command = ""
        var i = 0;
        do{
            commandName = store.getString(getStoreKey(COMMAND_NAME_KEY+i))
            command = store.getString(getStoreKey(COMMAND_KEY+i))
            if(commandName != "" || command != ""){
                commands.add(new CommandData(commandName, command))
            }
            i++
        }while(commandName != "" || command != "")
    }
    
    /**
     * Saves the environments in the preference store.
     * They can be retrieved by using loadAllFromPreferenceStore(...)
     */
    public static def saveAllToPreferenceStore(IPreferenceStore store, ArrayList<EnvironmentData> environments){
        // Save environment names as comma separated values
        var environmentsCSV = "" 
        for(env : environments){
            if(environmentsCSV != "")
                environmentsCSV += ","
            environmentsCSV += env.name
        }
        store.setValue(LaunchConfigPlugin.ENVIRONMENTS_CSV_ATTR, environmentsCSV)
        
        // Save environments
        for(env : environments){
            env.saveToPreferenceStore(store)
        }
    }
    
    /**
     * Saves this environment's fields unambiguously to the preference store by using it's unique name.
     */
    private def saveToPreferenceStore(IPreferenceStore store){
        val classObject = this.class
        for(f : classObject.declaredFields){
            if (f.type == String && !Modifier.isStatic(f.modifiers))
                store.setValue(getStoreKey(f.name), f.get(this).toString())
        }
        
        // Non String attributes
        var i = 0
        for(comm : commands){
            store.setValue(getStoreKey(COMMAND_KEY+i), comm.command)
            store.setValue(getStoreKey(COMMAND_NAME_KEY+i), comm.name)
            i++
        }
        // Remove further commands from store which may have been there before items where removed
        while(store.getString(getStoreKey(COMMAND_KEY+i)) != ""){
            store.setValue(getStoreKey(COMMAND_KEY+i), "")
            store.setValue(getStoreKey(COMMAND_NAME_KEY+i), "")
            i++
        }
    }
    
    /**
     * Unique identifier for a field of this environment. 
     */
    private def getStoreKey(String fieldName){
        // The unique identifier for the stored value is a concatenation
        // of the environment name and the field name.
        LaunchConfigPlugin.ENVIRONMENT_ATTR+"."+name+"."+fieldName
    }
}