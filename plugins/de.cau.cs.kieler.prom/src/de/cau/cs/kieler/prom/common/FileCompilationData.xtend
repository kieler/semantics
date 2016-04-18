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
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.core.runtime.Path

/** 
 * Data container for files which should be compiled via KiCo.
 * Objects of this class are created in the launch configuration dialog.
 * 
 * @author aas
 */
class FileCompilationData extends ConfigurationSerializable {

    @Accessors
    protected var String projectRelativePath = ""



    /**
     * Creates a new instance of the class.
     */
    new() {
    }

    /**
     * Creates a new instance of the class with the given path.
     */
    new(String projectRelativePath) {
        this.projectRelativePath = projectRelativePath
    }

    /**
     * Returns the file name (including extension) of the project relative path.
     * 
     * @return the name of the file of this object's project relative path
     */
    public def String getName(){
        return new Path(projectRelativePath).lastSegment
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
     * 
     * @param configuration The launch configuration where the data should be loaded from
     * @return list with the loaded compilation data objects.
     */
    static def List<FileCompilationData> loadAllFromConfiguration(ILaunchConfiguration configuration) {
        return ConfigurationSerializable.loadAllFromConfiguration(configuration, LaunchConfiguration.ATTR_FILES,
            FileCompilationData) as List<FileCompilationData>
    }

    /**
     * Saves a list with data objects to the given launch configuration.
     * All other file compilation data objects in the launch configuration are overwritten.
     * 
     * @param configuration The launch configuration where the data should be saved to
     * @param datas The data objects to be saved
     */
    static def void saveAllToConfiguration(ILaunchConfigurationWorkingCopy configuration, List<FileCompilationData> datas) {
        ConfigurationSerializable.saveAllToConfiguration(configuration, LaunchConfiguration.ATTR_FILES, datas)
    }
    
    /**
     * Compares this object with another object.
     * 
     * @param o The other object.
     * @return true if the other object is a FileCompilationData with the same path.<br />
     *         false otherwise.
     */
    override boolean equals(Object o) {
        if (o instanceof FileCompilationData) {
            val data = o as FileCompilationData
            return data.projectRelativePath == projectRelativePath
        }
        return false
    }
}
