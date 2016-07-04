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

import java.util.List
import org.eclipse.core.runtime.Path
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.prom.simulation.SimulationLaunchConfig

class SimulationFileData extends ConfigurationSerializable {
    
    /**
     * The project relative path of this file.
     */
    @Accessors
    protected var String projectRelativePath = ""
    
    /**
     * Flag to mark that a file provides inputs for the simulation,
     * in contrast to files that should be simulated.
     */
    @Accessors(PRIVATE_GETTER, PRIVATE_SETTER)
    protected var String providesInputs = ""
    
    
    
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
     * Getter for the field.
     * 
     * @return the boolean value of the string.
     */
    public def boolean isProvidesInputs(){
        return Boolean.valueOf(providesInputs)
        
    }
    
    /**
     * Setter for the field.
     */
    public def void setProvidesInputs(boolean value){
        providesInputs = String.valueOf(value)
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
    static def List<SimulationFileData> loadAllFromConfiguration(ILaunchConfiguration configuration) {
        return ConfigurationSerializable.loadAllFromConfiguration(configuration, SimulationLaunchConfig.ATTR_FILES,
            SimulationFileData) as List<SimulationFileData>
    }

    /**
     * Saves a list with data objects to the given launch configuration.
     * All other file compilation data objects in the launch configuration are overwritten.
     * 
     * @param configuration The launch configuration where the data should be saved to
     * @param datas The data objects to be saved
     */
    static def void saveAllToConfiguration(ILaunchConfigurationWorkingCopy configuration, List<SimulationFileData> datas) {
        ConfigurationSerializable.saveAllToConfiguration(configuration, SimulationLaunchConfig.ATTR_FILES, datas)
    }
    
    /**
     * Compares this object with another object.
     * 
     * @param o The other object.
     * @return true if the other object is a SimulationFileData with the same path.<br />
     *         false otherwise.
     */
    override boolean equals(Object o) {
        if (o instanceof SimulationFileData) {
            val data = o as SimulationFileData
            return data.projectRelativePath == projectRelativePath
        }
        return false
    }
}