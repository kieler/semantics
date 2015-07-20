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

import de.cau.cs.kieler.prom.launchconfig.LaunchConfiguration
import java.util.List
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.xtend.lib.annotations.Accessors

/** 
 * Data container for sct file compilation.
 * The objects are created in the launch configuration dialog of SCChart applications.
 * 
 * @author aas
 */
class SCTCompilationData extends ConfigurationSerializableData {

    @Accessors
    protected var String projectRelativePath = ""
    @Accessors
    protected var String name = ""



    new() {
    }

    new(String projectRelativePath, String fileName) {
        this.projectRelativePath = projectRelativePath
        this.name = fileName
    }



    /**
     * {@inheritDoc}
     */    
    override getIdentifier() {
        return projectRelativePath
    }
    
    /**
     * {@inheritDoc}
     */    
    override setIdentifier(String value) {
        projectRelativePath = value
    }
    
    /**
     * Loads all data objects from the given launch configuration.
     * @return list with the loaded compilation data objects.
     */
    static def loadAllFromConfiguration(ILaunchConfiguration configuration) {
        return ConfigurationSerializableData.loadAllFromConfiguration(configuration, LaunchConfiguration.ATTR_SCT_FILES,
            SCTCompilationData) as List<SCTCompilationData>
    }

    /**
     * Saves a list with data objects to the given launch configuration.
     * All other sct compilation data in the launch configuration is overwritten.
     */
    static def saveAllToConfiguration(ILaunchConfigurationWorkingCopy configuration, List<SCTCompilationData> datas) {
        ConfigurationSerializableData.saveAllToConfiguration(configuration, LaunchConfiguration.ATTR_SCT_FILES, datas)
    }
    
    /**
     * Compares this object with another object.
     * @return true if the other object is an SCTCompilationData and the paths are equal.<br />
     *         false otherwise.
     */
    override equals(Object o) {
        if (o instanceof SCTCompilationData) {
            val data = o as SCTCompilationData
            return data.projectRelativePath == projectRelativePath
        }
        return false
    }
}
