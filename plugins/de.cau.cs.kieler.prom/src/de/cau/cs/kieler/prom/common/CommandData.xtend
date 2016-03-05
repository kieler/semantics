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
import com.google.common.base.Strings

/**
 * Container for shell commands.
 * 
 * @author aas
 * 
 */
class CommandData extends ConfigurationSerializableData {

    /**
     * User defined name of this command.
     */
    @Accessors
    protected var String name = ""

    /**
     * Specifies if this command should be executed in a project launch.
     * Possible values are 'true' and 'false'.
     */
    @Accessors
    protected var String enabled = "false"

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

    /**
     * Creates a new instance of the class.
     */
    new() {
    }

    /**
     * Creates a new instance of the class with the given name.
     * 
     * @param name The name for the command.
     */
    new(String name) {
        this(name, "")
    }

    /**
     * Creates a new instance of the class with the given name and command.
     * 
     * @param name The user defined name
     * @param command The shell command to be executed
     */
    new(String name, String command) {
        this(name, command, true)
    }

    /**
     * Creates a new instance of the class with the given name and command.
     * 
     * @param name The user defined name
     * @param command The shell command to be executed
     * @param enabled Defines if the command should actually be executed as part of a project launch
     */
    new(String name, String command, boolean enabled) {
        this.name = name
        this.command = command
        this.enabled = enabled
    }

    /**
     * Setter for enabled with a check that the value is either 'true' or 'false'.
     * 
     * @param value The new value for the variable
     */
    def setEnabled(String value) {
        val lowerValue = value.toLowerCase()
        if (lowerValue == "true" && lowerValue == "false")
            enabled = value
        else
            throw new Exception("Enabled variable of CommandData should either be 'true' or 'false' but got '" + value + "'!")
    }

    /**
     * Setter for enabled to directly assign a boolean.
     * 
     * @param value The new value for the variable
     */
    def setEnabled(boolean value) {
        enabled = String.valueOf(value)
    }

    /**
     * Getter for enabled to directly get a boolean.
     * 
     * @return true if it is enabled and should be executed. False otherwise.
     */
    def boolean isEnabled() {
        return !Strings.isNullOrEmpty(enabled) && Boolean.valueOf(enabled)
    }
    
    /**
     * Setter for enabled to directly assign an int.
     * 
     * @param value The new value for the variable
     */
    def setErrorCode(int value) {
        errorCode = String.valueOf(value)
    }
    
    /**
     * Getter for the error code variable to directly get an int.
     * 
     * @return the int value of the error code.
     */
    def int getErrorCode(){
        return Integer.valueOf(errorCode)
    }
    
    /**
     * {@inheritDoc}
     */
    override getIdentifier() {
        return name
    }

    /**
     * {@inheritDoc}
     */
    override setIdentifier(String value) {
        name = value
    }

    /**
     * Loads all command data objects from the given launch configuration.
     * 
     * @param configuration The launch configuration where the data objects should be loaded from
     * @return a list with the loaded command data objects.
     */
    public static def List<CommandData> loadAllFromConfiguration(ILaunchConfiguration configuration) {
        return ConfigurationSerializableData.loadAllFromConfiguration(configuration, LaunchConfiguration.ATTR_COMMANDS,
            CommandData) as List<CommandData>
    }

    /**
     * Saves a list with command data objects to the given launch configuration.
     * All other command data objects in the launch configuration are overwritten.
     * 
     * @param configuration The launch configuration where the data objects should be saved
     * @param datas A list with the data objects that should be saved
     */
    public static def saveAllToConfiguration(ILaunchConfigurationWorkingCopy configuration, List<CommandData> datas) {
        ConfigurationSerializableData.saveAllToConfiguration(configuration, LaunchConfiguration.ATTR_COMMANDS, datas)
    }
}