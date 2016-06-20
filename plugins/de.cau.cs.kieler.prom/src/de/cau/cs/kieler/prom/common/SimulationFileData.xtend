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
    @Accessors
    protected var boolean providesInputs
    
    
    
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