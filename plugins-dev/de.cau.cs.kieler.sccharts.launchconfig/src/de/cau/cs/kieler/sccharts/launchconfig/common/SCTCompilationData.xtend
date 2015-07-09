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

import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfiguration
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.xtend.lib.annotations.Accessors

/** 
 * Data container for sct files compilation.
 * The objects are created in the launch configuration dialog of SCCharts applications.
 * 
 * @author aas
 */
class SCTCompilationData {

    new() {
    }

    new(String projectRelativePath, String fileName) {
        this.projectRelativePath = projectRelativePath
        this.name = fileName
    }

    // The fields are protected instead private
    // so that they can be accessed by the SerializableData class
    // to serialize/deserialize them.
    
    @Accessors
    protected var String projectRelativePath = ""
    @Accessors
    protected var String name = ""
    
    /**
     * Loads all SCTCompilationData objects from the launch configuration.
     * They can be stored via saveAllToConfiguration(...)
     * 
     * @return List of the loaded compilation data.
     */
    static def List<SCTCompilationData> loadAllFromConfiguration(ILaunchConfiguration configuration){
        // Load list with paths of sct files that should be compiled.
        val List<String> sctFilePaths = configuration.getAttribute(LaunchConfiguration.ATTR_SCT_FILES, #[])
        
        // Prepare the result list.
        val List<SCTCompilationData> datas = newArrayList()
        
        // Create an object for each path and load its data.
        for(sctFilePath : sctFilePaths){
            val data = new SCTCompilationData()
            data.projectRelativePath = sctFilePath
            
            // The data for the object is stored with its path as attribute identification.
            val map = configuration.getAttribute(data.projectRelativePath, null as HashMap)
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
    static def saveAllToConfiguration(ILaunchConfigurationWorkingCopy configuration, List<SCTCompilationData> datas){
        if (datas != null) {
            // Create a list with the paths of the selected SCT files.
            val List<String> sctFiles = newArrayList()
            datas.forEach [
                sctFiles += it.projectRelativePath
                
                // Save the attributes of this file with the path as identification
                configuration.setAttribute(it.projectRelativePath, it.attributeMap)
            ]
            configuration.setAttribute(LaunchConfiguration.ATTR_SCT_FILES, sctFiles)
        }
    }
    
    /**
     * Compares this object with another object.
     * @return true if the other object is an SCTCompilationData and the paths are equal.<br />
     *         false otherwise.
     */
    override equals(Object o){
        if(o instanceof SCTCompilationData){
            val data = o as SCTCompilationData
            return data.projectRelativePath == projectRelativePath
        }
        return false
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
            map.put(f.name, f.get(this).toString())
        }
        return map
    }
}
