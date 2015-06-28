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
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.xtend.lib.annotations.Accessors

/** 
 * Data container for sct files compilation.
 * The objects are created in the launch configuration dialog of SCCharts applications.
 * 
 * @author aas
 */
class SCTCompilationData extends SerializableData {

    new() {
    }

    new(String filePath, String projectRelativePath, String fileName) {
        this.path = filePath
        this.projectRelativePath = projectRelativePath
        this.name = fileName
    }

    // The fields are protected instead private
    // so that they can be accessed by the SerializableData class
    // to serialize/deserialize them.
    
    @Accessors
    protected var String path = ""
    @Accessors
    protected var String projectRelativePath = ""
    @Accessors
    protected var String name = ""
    
    /**
     * Loads all SCTCompilationData objects from the launch configuration.
     * 
     * @return List of the loaded compilation data.
     */
    static def List<SCTCompilationData> loadAllFromConfiguration(ILaunchConfiguration configuration){
        // Load list with paths of sct files that should be compiled.
        val List<String> sctFiles = configuration.getAttribute(LaunchConfiguration.ATTR_SCT_FILES, #[])
        
        // Prepare the result list.
        val List<SCTCompilationData> datas = newArrayList()
        
        // Create an object for each path and load its data.
        sctFiles.forEach [
            val data = new SCTCompilationData()
            data.path = it
            
            // The data for the object is stored with its path as attribute identification. 
            data.loadAttributesFromMap(configuration.getAttribute(data.path, new HashMap()))
            
            // Add this object to the result list
            datas += data
        ]
        
        return datas
    }
}
