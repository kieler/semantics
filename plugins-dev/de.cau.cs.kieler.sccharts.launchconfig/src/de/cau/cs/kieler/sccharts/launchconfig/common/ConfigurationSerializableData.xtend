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

import java.lang.reflect.Modifier
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy

/**
 * @author aas
 *
 */
class ConfigurationSerializableData {
    
    def getIdentifier(){
        return ""
    }
    
    /**
     * Try to loads the values of this objects fields by reading the map values.
     * 
     * @param map A map where the key is this object's field names
     * and the value is the value this object's field should have.  
     */
    def loadAttributesFromMap(Map<String, String> map) {
        val classObject = this.class
        for(f : classObject.declaredFields){
            if (f.type == String && !Modifier.isStatic(f.modifiers))
                f.set(this, map.get(f.name))
        }
    }
    
    /**
     * Stores all fields of this class in a map
     * where the key is a field's name and the value is the field's value.
     */
    def Map<String, String> getAttributeMap(){
        val map = new HashMap<String, String>()
        val classObject = this.class
        for(f : classObject.declaredFields){
            if (f.type == String && !Modifier.isStatic(f.modifiers))
                map.put(f.name, f.get(this).toString())
        }
        return map
    }
    
    /**
     * Loads all SCTCompilationData objects from the launch configuration.
     * They can be stored via saveAllToConfiguration(...)
     * 
     * @return List of the loaded compilation data.
     */
    static def List<? extends ConfigurationSerializableData> loadAllFromConfiguration(ILaunchConfiguration configuration, String AttributeKey, Class<? extends ConfigurationSerializableData> classObject){
        // Load list with identifiers
        val List<String> identifiers = configuration.getAttribute(AttributeKey, #[])
        
        // Prepare the result list.
        val List<ConfigurationSerializableData> datas = newArrayList()
        
        // Create an object for each identifier and load its data.
        for(identifier : identifiers){
            val data = classObject.newInstance()

            // The data for the object is stored with its identifier as key
            val map = configuration.getAttribute(identifier, null as HashMap)
            if(map != null){ 
                data.loadAttributesFromMap(map)
                
                // Add this object to the result list
                datas += data
            }
        }
        
        return datas
    }
    
    /**
     * Saves the list elements to the configuration.
     * They can be retrieved via loadAllFromConfiguration(...)
     */
    static def saveAllToConfiguration(ILaunchConfigurationWorkingCopy configuration, String AttributeKey, List<? extends ConfigurationSerializableData> datas){
        if (datas != null) {
            // Create a list with the identifiers of the data objects which will be saved.
            val List<String> dataIdentifiers = newArrayList()
            
            // Save every data's attribute map using the identifier
            datas.forEach [
                // Remember that this object has been saved
                dataIdentifiers += it.identifier
                
                // Save the attributes of this file with the path as identification
                configuration.setAttribute(it.identifier, it.attributeMap)
            ]
            configuration.setAttribute(AttributeKey, dataIdentifiers)
        }
    }
}