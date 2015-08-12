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
package de.cau.cs.kieler.prom.launchconfig

import com.google.common.base.Strings
import de.cau.cs.kieler.prom.common.CommandData
import java.io.File
import java.util.ArrayList
import java.util.List
import java.util.regex.Pattern
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.core.variables.VariablesPlugin
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunch

/**
 * This class handles the execution of shell commands in the context of a project launch.
 * 
 * @author aas
 */
class CommandExecutor {

    /**
     * The project from the launch config.
     */
    private var IProject project
    
    /**
     * The launch in which this object has been created.
     */
    private var ILaunch launch


    /**
     * Creates a new instance of this class and sets the project and launch associated with it.
     * 
     * @param project The project
     * @param launch The launch
     */
    new(IProject project, ILaunch launch){
        this.project = project
        this.launch = launch
    }

    /**
     * Executes the commands and waits for their termination.
     * Successive commands are executed only if the commands before ended successfully
     * (with an error code of 0).
     * Each executed command gets its own Console View.
     * 
     * @param commands A list with commands to be executed sequentially
     */
    public def IStatus execute(CommandData... commands){
        // Execute every command squentially.
        for(c : commands){
            if(c.isEnabled){
                // Execute and proceed only if no error occured.
                executeSingle(c)
                if(c.getErrorCode() != 0){
                    throw new Exception("Error while executing "+ c.name + "\n'"+ c.fullCommand +"'.")        
                }
            }
        }
        
        return Status.OK_STATUS
    }
    
    /**
     * Executes a command via OS and waits for the process termination.
     * The command may contain arguments separated by spaces.
     * Double quotes (") can be use to handle a command or argument with spaces as one entity.
     * The created process gets a console in the Console View to fetch its output.
     * 
     * @param command The command to be executed
     */
    private def void executeSingle(CommandData command) {
        if (command != null && !Strings.isNullOrEmpty(command.command)) {
            val man = VariablesPlugin.getDefault.stringVariableManager
            command.fullCommand = man.performStringSubstitution(command.command)
            val commandWithParameters = splitStringOnWhitespace(command.fullCommand)

            // Run process
            val pBuilder = new ProcessBuilder(commandWithParameters)
            pBuilder.directory(new File(project.location.toOSString))
            val p = pBuilder.start()
            DebugPlugin.newProcess(launch, p, command.name)

            // Wait until the process finished
            command.errorCode = p.waitFor()
        }
    }

    /**
     * Split input string on spaces, except if between double quotes (e.g. "hello world" would be one token.)
     * Surrounding double quotes are removed.
     * 
     * @param str The string to be splitted
     * @return List<String> containing slices of the input string.
     */
    private def List<String> splitStringOnWhitespace(String str) {
        // Code from
        // http://stackoverflow.com/questions/7804335/split-string-on-spaces-except-if-between-quotes-i-e-treat-hello-world-as
        val list = new ArrayList<String>();
        val m = Pattern.compile("([^\"]\\S*|\".+?\")\\s*").matcher(str);
        while (m.find()) {
            // .replace(...) is to remove surrounding qoutes
            list.add(m.group(1).replace("\"", ""))
        }
        return list
    }
}