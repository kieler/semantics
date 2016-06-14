package de.cau.cs.kieler.prom.common

import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.xtend.lib.annotations.Accessors

class SimulationLaunchData extends ConfigurationSerializable{
    
    /**
     * Key for the attribute that holds a simulation launch data object.
     */
    private static val IDENTIFIER_ATTR = "simulationLaunchData"
    
    /**
     * The name of the project that should be launched.
     */
    @Accessors
    protected String projectName = ""
    
    /**
     * The fully qualified class name of the simulator that should be used.
     */
    @Accessors
    protected String simulatorClassName = ""
    
    /**
     * The name of the environment that should be used to compile the models.
     */
    @Accessors
    protected String environmentName = ""
    
    /**
     * {inheritDoc}
     */
    override getIdentifier() {
        return IDENTIFIER_ATTR
    }
    
    /**
     * {inheritDoc}
     */
    override setIdentifier(String value) {
        // The identifier is constant for this data class.
    }
    
    /**
     * Creates a data object and loads its state from the given launch configuration.
     * 
     * @param configuration The launch configuration where the data object should be loaded from
     * @return the loaded data object.
     */
    public static def SimulationLaunchData loadFromConfiguration(ILaunchConfiguration configuration) {
        val data = new SimulationLaunchData()
        data.loadAttributesFromConfiguration(configuration)
        return data
    }
    
    /**
     * Load the data object from the given launch configuration.
     * 
     * @param configuration The launch configuration where the data object should be loaded from
     * @return the loaded data object.
     */
    public def void loadAttributesFromConfiguration(ILaunchConfiguration configuration) {
        // Load attribute map
        val attributeMap = configuration.getAttribute(IDENTIFIER_ATTR, newHashMap());
        loadAttributesFromMap(attributeMap)
    }

    /**
     * Saves the data object to the given launch configuration.
     * 
     * @param configuration The launch configuration where the data object should be saved
     * @param data The data object that should be saved
     */
    public static def saveToConfiguration(ILaunchConfigurationWorkingCopy configuration, SimulationLaunchData data) {
        // Save attribute map
        configuration.setAttribute(IDENTIFIER_ATTR, data.attributeMap)
    }
}