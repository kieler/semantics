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
     * The files used in this simulation.
     */
    @Accessors
    protected List<SimulationFileData> files = newArrayList()
    
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
        // Load files
        files = SimulationFileData.loadAllFromConfiguration(configuration)
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
        // Save files
        SimulationFileData.saveAllToConfiguration(configuration, data.files)
    }
}