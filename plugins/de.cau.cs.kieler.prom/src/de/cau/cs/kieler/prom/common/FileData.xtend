package de.cau.cs.kieler.prom.common

import de.cau.cs.kieler.prom.simulation.SimulationLaunchConfig
import java.util.List
import org.eclipse.core.runtime.Path
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.xtend.lib.annotations.Accessors

class FileData extends ConfigurationSerializable {
    
    /**
     * The project relative path of this file.
     */
    @Accessors
    protected var String projectRelativePath = ""
    
    /**
     * Flag to mark that a file provides inputs for simulation,
     * in contrast to files that should be simulated.
     */
    @Accessors(PRIVATE_GETTER, PRIVATE_SETTER)
    protected var String providesInputs = ""

    /**
     * The origin of the resource to be created.
     * This is either an absolute file system path or an url with the platform scheme provided by eclipse
     * (e.g. 'platform:/plugin/org.myplugin/path/to/my/Main.java').
     */
    @Accessors
    protected var String origin = ""
    
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
     * Creates a new instance of the class with the given path and origin.
     */
    new(String projectRelativePath, String origin) {
        this(projectRelativePath)
        this.origin = origin
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
    static def List<FileData> loadAllFromConfiguration(ILaunchConfiguration configuration) {
        return ConfigurationSerializable.loadAllFromConfiguration(configuration, SimulationLaunchConfig.ATTR_FILES,
            FileData) as List<FileData>
    }

    /**
     * Saves a list with data objects to the given launch configuration.
     * All other file compilation data objects in the launch configuration are overwritten.
     * 
     * @param configuration The launch configuration where the data should be saved to
     * @param datas The data objects to be saved
     */
    static def void saveAllToConfiguration(ILaunchConfigurationWorkingCopy configuration, List<FileData> datas) {
        ConfigurationSerializable.saveAllToConfiguration(configuration, SimulationLaunchConfig.ATTR_FILES, datas)
    }
    
    /**
     * Compares this object with another object.
     * 
     * @param o The other object.
     * @return true if the other object is a FileData with the same path.<br />
     *         false otherwise.
     */
    override boolean equals(Object o) {
        if (o instanceof FileData) {
            val data = o as FileData
            return data.projectRelativePath == projectRelativePath
        }
        return false
    }
}