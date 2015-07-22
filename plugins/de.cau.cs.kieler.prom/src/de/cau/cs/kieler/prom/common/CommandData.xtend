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
 * Container for shell commands.
 * 
 * @author aas
 *
 */
class CommandData extends ConfigurationSerializableData{
    
    /**
     * User defined name of this command.
     */
    @Accessors
    protected var String name = ""
    
    /**
     * Specifies if this command should be executed in a project launch.
     */
    @Accessors
    protected var String isEnabled = ""
    
    /**
     * The command to be executed e.g.'echo ${project_name}'
     */
    @Accessors
    protected var String command = ""
    
    /**
     * The command ready to be executed with all variables substituted e.g. 'echo MyProject'
     */
    @Accessors
    protected var String fullCommand = ""
    
    /**
     * The returned error code of the process from this command.
     */
    @Accessors
    protected var String errorCode = "0"
    
    
    
    
    new(){
    }
    
    new(String name){
        this(name, "")
    }
    
    new(String name, String command){
        this.name = name
        this.command = command
    }
    
    
    /**
     * {@inheritDoc}
     */
    override getIdentifier(){
        return name
    }
    
    /**
     * {@inheritDoc}
     */
    override setIdentifier(String value){
        name = value
    }
    
    /**
     * Loads all data objects from the given launch configuration.
     * @return list with the loaded command data objects.
     */
    static def List<CommandData> loadAllFromConfiguration(ILaunchConfiguration configuration) {
        return ConfigurationSerializableData.loadAllFromConfiguration(configuration, LaunchConfiguration.ATTR_COMMANDS,
            CommandData) as List<CommandData>
    }
    
    /**
     * Saves a list with data objects to the given launch configuration.
     * All other command data in the launch configuration is overwritten.
     */
    static def saveAllToConfiguration(ILaunchConfigurationWorkingCopy configuration, List<CommandData> datas) {
        ConfigurationSerializableData.saveAllToConfiguration(configuration, LaunchConfiguration.ATTR_COMMANDS, datas)
    }
}