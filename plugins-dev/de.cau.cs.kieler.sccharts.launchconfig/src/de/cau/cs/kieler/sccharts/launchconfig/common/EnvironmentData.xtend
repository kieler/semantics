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

import java.util.ArrayList
import org.eclipse.jface.preference.IPreferenceStore
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.core.runtime.preferences.IPreferencesService

/**
 * @author aas
 *
 */
class EnvironmentData extends SerializableData {
    
    new(){
        
    }
    
    new(String name){
        this.name = name
    }
    
    @Accessors
    protected String name = ""
    
    @Accessors
    protected String targetLanguage = ""
    @Accessors
    protected String targetFileExtension = ""
    @Accessors
    protected String targetTemplate = ""
    
    @Accessors
    protected String wrapperCodeTemplate = ""
    @Accessors
    protected String wrapperCodeTarget = ""
    @Accessors
    protected String wrapperCodeSnippetsDirectory = ""
    @Accessors
    protected String wrapperCodeSnippetsOrigin = ""
    
    @Accessors
    protected String compileCommand = ""
    @Accessors
    protected String deployCommand = ""
    @Accessors
    protected String runCommand = ""
    
    @Accessors
    protected String relatedProjectWizardClass = ""
    
    @Accessors
    protected String mainFile = ""
    @Accessors
    protected String mainFileOrigin = ""
    
    public static def ArrayList<EnvironmentData> loadAllFromPreferenceStore(IPreferenceStore store){
        val environmentsCSV = store.getString("environments")
        val environmentsNames = environmentsCSV.split(",")
        
        // Return list
        val environments = new ArrayList<EnvironmentData>()
        
        // Load every environment
        for(envName : environmentsNames){
            var env = new EnvironmentData(envName)
            environments += env
            
            // Load every field of the environment
            val classObject = typeof(EnvironmentData)
            for(f : classObject.declaredFields){
                f.set(env, store.getString("environment."+env.name+"."+f.name))
            }
        }
        
        return environments
    }
    
    public static def saveAllToPreferenceStore(IPreferenceStore store, ArrayList<EnvironmentData> environments){
        // Save environment names as comma separated values
        var environmentsCSV = "" 
        for(env : environments){
            if(environmentsCSV != "")
                environmentsCSV += ","
            environmentsCSV += env.name
        }
        store.setValue("environments", environmentsCSV)
        
        // Save environments
        for(env : environments){
            env.saveToPreferenceStore(store)
        }
    }
    
    private def saveToPreferenceStore(IPreferenceStore store){
        // The unique identifier for the stored value is a concatenation
        // of the environment name and the field name.
        val classObject = this.class
        for(f : classObject.declaredFields){
            store.setValue("environment."+name+"."+f.name, f.get(this).toString())
        }
    }
}