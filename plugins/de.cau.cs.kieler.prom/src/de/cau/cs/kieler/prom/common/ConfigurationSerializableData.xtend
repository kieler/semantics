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
package de.cau.cs.kieler.prom.common

import java.lang.reflect.Modifier
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.jface.preference.IPreferenceStore

/**
 * Base class for data containers which can be saved and loaded to launch configurations or
 * preference stores.
 * 
 * @author aas
 * 
 */
abstract class ConfigurationSerializableData {

    /**
     * Returns a unique identifier for this data object to store and load it. 
     */
    def getIdentifier() {
        return ""
    }
    
    /**
     * Sets the unique identifier for this data object to store and load it. 
     */
    def setIdentifier(String identifier) {
    }

    /**
     * Try to load the values of this object's string fields by reading the map values.
     * 
     * @param map A map where the key is this object's field names
     * and the value is the value of the fields.  
     */
    def loadAttributesFromMap(Map<String, String> map) {
        val classObject = this.class
        for (f : classObject.declaredFields) {
            if (f.type == String && !Modifier.isStatic(f.modifiers))
                f.set(this, map.get(f.name))
        }
    }

    /**
     * Stores all string fields of this class in a map
     * where the key is a field's name and the value is the field's value.
     */
    def Map<String, String> getAttributeMap() {
        val map = new HashMap<String, String>()
        val classObject = this.class
        for (f : classObject.declaredFields) {
            if (f.type == String && !Modifier.isStatic(f.modifiers))
                map.put(f.name, f.get(this).toString())
        }
        return map
    }

    /**
     * Loads all data objects from the launch configuration
     * which have been stored using saveAllToConfiguration(...)
     * 
     * @return List of the loaded data objects.
     */
    protected static def List<? extends ConfigurationSerializableData> loadAllFromConfiguration(
        ILaunchConfiguration configuration, String AttributeKey, Class<? extends ConfigurationSerializableData> classObject) {
        
        // Load list with identifiers
        val List<String> identifiers = configuration.getAttribute(AttributeKey, #[])

        // Prepare the result list.
        val List<ConfigurationSerializableData> datas = newArrayList()

        // Create an object for each identifier and load its data.
        for (identifier : identifiers) {
            val data = classObject.newInstance()

            // The data for the object is stored with its identifier as key
            val map = configuration.getAttribute(identifier, null as HashMap)
            if (map != null) {
                data.loadAttributesFromMap(map)

                // Add this object to the result list
                datas += data
            }
        }

        return datas
    }

    /**
     * Saves the data objects to the configuration.
     * The identifiers key is used to store the data object's identifiers.
     * The objects can be retrieved via loadAllFromConfiguration(...)
     */
    protected static def saveAllToConfiguration(ILaunchConfigurationWorkingCopy configuration, String identifiersKey,
        List<? extends ConfigurationSerializableData> datas) {

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
            configuration.setAttribute(identifiersKey, dataIdentifiers)
        }
    }
    
    /**
     * Saves the data objects to the preference store.
     * The identifiers key is used to store the data object's identifiers.
     * They can be retrieved by using loadAllFromPreferenceStore(...)
     */
    protected static def saveAllToPreferenceStore(IPreferenceStore store, String identifiersKey,
        List<? extends ConfigurationSerializableData> datas) {
        
        // Save identifiers of data objects as comma separated values
        var identifierCSV = "" 
        for(data : datas){
            if(identifierCSV != "")
                identifierCSV += ","
            identifierCSV += data.getIdentifier()
        }
        store.setValue(identifiersKey, identifierCSV)
        
        // Save fields of data objects
        for(data : datas)
            data.saveToPreferenceStore(store)
    }
    
    /**
     * Saves this data object's fields to the preference store.
     */
    protected def saveToPreferenceStore(IPreferenceStore store){
        // Save string fields
        val classObject = this.class
        for(f : classObject.declaredFields){
            if (f.type == String && !Modifier.isStatic(f.modifiers))
                store.setValue(getStoreKey(f.name), f.get(this).toString())
        }
    }
    
    /**
     * Loads all data objects from the preference store
     * which have been saved using saveAllToPreferenceStore(...).
     * @return list with the data objects from the preference store.
     */
    protected static def List<? extends ConfigurationSerializableData> loadAllFromPreferenceStore(IPreferenceStore store, String identifiersKey,
            Class<? extends ConfigurationSerializableData> classObject) {
        
        val identifiersCSV = store.getString(identifiersKey)
        
        // No objects found
        if(identifiersCSV == "")
            return newArrayList()
        
        // Split on comma
        val identifiers = identifiersCSV.split(",")
         
        // Load every object
        val datas = newArrayList()
        for(identifier : identifiers){
            val data = classObject.newInstance()
            data.setIdentifier(identifier)
            datas += data
            
            // Load the fields
            data.loadFromPreferenceStore(store)
        }
        
        return datas
    }
    
    /**
     * Loads the values of this class's fields from the preference store.
     */
    protected def loadFromPreferenceStore(IPreferenceStore store){
        // Load string fields
        val classObject = this.class
        for(f : classObject.declaredFields){
            if (f.type == String && !Modifier.isStatic(f.modifiers))
                f.set(this, store.getString(getStoreKey(f.name)))
        }
    }
    
    /**
     * @return unique identifier for a field of this data object. 
     */
    protected def getStoreKey(String fieldName){
        return class.name+"."+getIdentifier()+"."+fieldName
    }
}