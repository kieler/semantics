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
package de.cau.cs.kieler.prom.data

import com.google.common.base.Strings
import java.lang.reflect.Modifier
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type
import java.util.ArrayList
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
abstract class ConfigurationSerializable {

    /**
     * Returns a unique identifier which must not contain a comma.
     * The identifier is used to store and load the data object.<br>
     * 
     * The check for uniqueness and that there is no comma in it
     * has to be done by the instantiating component e.g. UI.
     * 
     * @return an identifier for the object
     */
    abstract def String getIdentifier()
    
    /**
     * Sets the unique identifier for this data object to store and load it.
     * The identifier must not contain a comma.<br>
     * 
     * The check for uniqueness and that there is no comma in it
     * has to be done by the instantiating component e.g. UI.
     * 
     * @param value The new value of the identifier
     */
    abstract def String setIdentifier(String value)

    /**
     * Try to load the values of this object's string fields by reading the map values.
     * 
     * @param map A map where the key is this object's field names
     * and the value is the value of the fields
     */
    public def void loadAttributesFromMap(Map<String, String> map) {
        val classObject = this.class
        for (f : classObject.declaredFields) {
            if (f.type == String && !Modifier.isStatic(f.modifiers)) {
                val value = map.get(f.name)
                val nonNullValue = Strings.nullToEmpty(value)
                f.set(this, nonNullValue)
            }
        }
    }

    /**
     * Stores all string fields of this class in a map
     * where the key is a field's name and the value is the field's value.
     * 
     * @return a map with the attributes of this object
     */
    public def Map<String, String> getAttributeMap() {
        val map = new HashMap<String, String>()
        val classObject = this.class
        for (f : classObject.declaredFields) {
            if (f.type == String && !Modifier.isStatic(f.modifiers)) {
                val object = f.get(this)
                if(object != null) {
                    val value = object.toString()
                    map.put(f.name, value)
                }    
            }
        }
        return map
    }

    /**
     * Loads all data objects from the launch configuration
     * which have been stored using saveAllToConfiguration(...)
     * 
     * @return List of the loaded data objects
     */
    protected static def List<? extends ConfigurationSerializable> loadAllFromConfiguration(
        ILaunchConfiguration configuration, String AttributeKey, Class<? extends ConfigurationSerializable> classObject) {
        
        // Load list with identifiers
        val List<String> identifiers = configuration.getAttribute(AttributeKey, #[])

        // Prepare the result list.
        val List<ConfigurationSerializable> datas = newArrayList()

        // Create an object for each identifier and load its data.
        for (identifier : identifiers) {
            val data = classObject.newInstance()

            // The data for the object is stored with its identifier as key
            val map = configuration.getAttribute(identifier, null as HashMap<String,String>)
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
     * The identifiers key is used to store the data object identifiers.
     * The objects can be retrieved via loadAllFromConfiguration(...)
     * 
     * @param configuration The launch configuration where the data objects should be saved
     * @param identifiersKey A key to store a list of identifiers in the configuration
     * @param datas The list of data objects to be saved
     */
    protected static def saveAllToConfiguration(ILaunchConfigurationWorkingCopy configuration, String identifiersKey,
        Iterable<? extends ConfigurationSerializable> datas) {

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
     * The identifiers key is used to store the data object identifiers.
     * They can be retrieved by using loadAllFromPreferenceStore(...)
     * 
     * @param store The preference store where the data objects should be saved
     * @param identifiersKey A key to store a list of identifiers
     * @param datas The list of data objects to be saved
     */
    protected static def saveAllToPreferenceStore(IPreferenceStore store, String identifiersKey,
        Iterable<? extends ConfigurationSerializable> datas) {
        
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
     * 
     * @param store The preference store where the data should be saved
     */
    protected def void saveToPreferenceStore(IPreferenceStore store){
        saveToPreferenceStore(store, "")
    }
    
    /**
     * Saves this data object's fields to the preference store.
     * Thereby the identifiers to store the fields are prefixed with the given prefix. 
     * 
     * @param store The preference store where the data should be saved
     * @param prefix A prefix for the identifiers in the store.
     */
    protected def void saveToPreferenceStore(IPreferenceStore store, String prefix){
        // Save string fields
        val classObject = this.class
        for(f : classObject.declaredFields){
            if(!Modifier.isStatic(f.modifiers)) {
                val storeKey = getStoreKey(f.name, prefix)
                if (f.type ==  String || f.type == Boolean) {
                    val object = f.get(this)
                    if(object != null) {
                        val value = object.toString()
                        store.setValue(storeKey, value)
                    }
                } else if(typeof(ConfigurationSerializable).isAssignableFrom(f.type)) {
                    // Save single reference of another serializable object
                    val innerDataObject = f.get(this) as ConfigurationSerializable
                    // Save object
                    innerDataObject.saveToPreferenceStore(store, storeKey)
                    // Save identifier of the object
                    store.setValue(storeKey, innerDataObject.identifier)
                } else if(typeof(List).isAssignableFrom(f.type)) {
                    // Save list of references that contains other serializable objects
                    val iter = f.get(this) as List
                    var identifiersCSV = ""
                    for(i : iter) {
                        if(i instanceof ConfigurationSerializable) {
                            i.saveToPreferenceStore(store, storeKey)
                            identifiersCSV += i.identifier+","
                        }
                    }
                    // Save identifiers of the objects
                    store.setValue(storeKey, identifiersCSV)
                }
            }
        }
    }
    
    /**
     * Loads all data objects from the preference store
     * which have been saved using saveAllToPreferenceStore(...).
     * 
     * @param store The preference store where the data should be loaded from
     * @param identifiersKey A key for the list of identifiers the store contains
     * @param classObject A class of which objects are instantiated and loaded from the store
     * @return list with the loaded data objects from the preference store
     */
    protected static def List<? extends ConfigurationSerializable> loadAllFromPreferenceStore(IPreferenceStore store, String identifiersKey,
            Class<? extends ConfigurationSerializable> classObject) {
        
        val identifiersCSV = store.getString(identifiersKey)
        
        // No objects found
        if(identifiersCSV.isNullOrEmpty())
            return newArrayList()
        
        // Split on comma
        val identifiers = identifiersCSV.split(",")
         
        // Load every object
        val datas = newArrayList()
        if(store != null) {
            for(identifier : identifiers){
                val data = classObject.newInstance()
                data.setIdentifier(identifier)
                datas += data
                
                // Load the fields
                data.loadFromPreferenceStore(store)
            }    
        } 
        
        return datas
    }
    
    /**
     * Loads the values of this class's fields from the preference store.
     * 
     * @param store The preference store to load the data from
     */
    protected def void loadFromPreferenceStore(IPreferenceStore store) {
        loadFromPreferenceStore(store, "")
    }
    
    /**
     * Loads the values of this class's fields from the preference store.
     * Therefor the given prefix is used to identify field values.
     * 
     * @param store The preference store to load the data from
     * @param prefix A prefix for identifiers of fields
     */
    protected def void loadFromPreferenceStore(IPreferenceStore store, String prefix){
        // Load string fields
        val classObject = this.class
        for(f : classObject.declaredFields){
            if( !Modifier.isStatic(f.modifiers)) {
                val storeKey = getStoreKey(f.name, prefix)
                if (f.type == String) {
                    // Load string value
                    val value = store.getString(storeKey)
                    val nonNullValue = Strings.nullToEmpty(value)
                    f.set(this, nonNullValue)
                } if (f.type == Boolean) {
                    // Load boolean value
                    val value = store.getBoolean(storeKey)
                    f.set(this, value)
                } else if(typeof(ConfigurationSerializable).isAssignableFrom(f.type)) {
                    // Load single reference to other serializable data
                    // Get identifier
                    val loadedIdentifier = store.getString(storeKey)
                    // Create object
                    val innerDataObject = f.type.newInstance() as ConfigurationSerializable
                    innerDataObject.identifier = loadedIdentifier
                    // Load fields of object
                    innerDataObject.loadFromPreferenceStore(store, storeKey)
                    // Assign loaded object to field
                    f.set(this, innerDataObject)
                } else if(typeof(List).isAssignableFrom(f.type)) {
                    // Load list of references that contains serializable data
                    val classOfContent = getClassOfFirstTypeArgument(f.genericType)
                    if(typeof(ConfigurationSerializable).isAssignableFrom(classOfContent)) {
                        // Set value of field
                        val list = new ArrayList()
                        f.set(this, list)
                        // Load content of list
                        // Get identifiers CSV
                        val loadedIdentifiersCSV = store.getString(storeKey)
                        if(!loadedIdentifiersCSV.isNullOrEmpty()) {
                            val loadedIdentifiers = loadedIdentifiersCSV.split(",");
                            // Iterate over identifiers
                            for(loadedIdentifier : loadedIdentifiers) {
                                if(!loadedIdentifier.isNullOrEmpty()) {                                
                                    // Create object
                                    val innerDataObject = classOfContent.newInstance() as ConfigurationSerializable
                                    innerDataObject.identifier = loadedIdentifier
                                    // Load fields of object
                                    innerDataObject.loadFromPreferenceStore(store, storeKey)
                                    // Add to list
                                    list.add(innerDataObject)
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * For a generic class, returns the type of the first generic parameter,
     * for instance a List<String> would return String here.
     * 
     * @param genericType A class with at least one generic argument, e.g., List<T>
     * @return the type of the first generic 
     */
    private def Class<?> getClassOfFirstTypeArgument(Type genericType) {
        if(genericType instanceof ParameterizedType){
            val fieldArgTypes = genericType.getActualTypeArguments();
            for(fieldArgType : fieldArgTypes) {
                return fieldArgType as Class<?>
            }
        }
        return null
    }
     
    /**
     * Constructs a unique name for a field of this object
     * by concatenating identifiers for this class, object and field.
     * 
     * @return unique identifier for a field of this data object. 
     */
    protected def String getStoreKey(String fieldName){
        return class.name+"."+getIdentifier()+"."+fieldName
    }
    
    /**
     * Constructs a unique name for a field of this object
     * by concatenating the prefix and identifiers for this class, object and field.
     * 
     * @return prefixed and unique identifier for a field of this data object. 
     */
    protected def String getStoreKey(String fieldName, String prefix){
        if(prefix.isNullOrEmpty())
            return getStoreKey(fieldName)
        else
            return prefix+"."+getStoreKey(fieldName)
    }
}