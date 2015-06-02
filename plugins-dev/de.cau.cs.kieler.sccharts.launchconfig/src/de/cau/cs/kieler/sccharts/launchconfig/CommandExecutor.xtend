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
package de.cau.cs.kieler.sccharts.launchconfig

import java.util.ArrayList
import java.util.List
import java.util.regex.Pattern
import org.eclipse.core.internal.variables.ValueVariable
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.core.variables.VariablesPlugin
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunch

/**
 * @author aas
 * 
 */
class CommandExecutor {

    private var IProject project
    private var ILaunch launch

    new(IProject project, ILaunch launch){
        this.project = project
        this.launch = launch
    }
    
    public def IStatus execute(Command... commands){
        // Set launched_project_loc variable.
        setVariables()
        
        // Execute every command squentially.
        for(c : commands){
            // Execute and proceed only if no error occured.
            executeSingle(c)
            if(c.errorCode != 0){
                throw new Exception("Error while executing "+ c.label + "\n'"+ c.fullCommand +"'.")        
            }
        }
        
        return Status.OK_STATUS
    }

    /**
     * Executes a command via OS and waits for the process termination.
     * The command may contain arguments separated by spaces.
     * Double quotes (") can be use to handle a command or argument with spaces as one entity.
     * The created process gets a console in the Console View to fetch its output.
     */
    private def executeSingle(Command command) {
        if (command != null && command.command != null && command.command != "") {
            val man = VariablesPlugin.getDefault.stringVariableManager
            command.fullCommand = man.performStringSubstitution(command.command)
            val commandWithParameters = splitStringOnWhitespace(command.fullCommand)

            // Run process
            val p = new ProcessBuilder(commandWithParameters).start()
            DebugPlugin.newProcess(launch, p, command.label)

            // Wait until the process finished
            command.errorCode = p.waitFor()
        }
    }

    /**
     * Split input string on spaces, except if between double quotes ("hello world" would be one token.)
     * Surrounding double quotes are removed.
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

    private def setVariables() {
        val man = VariablesPlugin.getDefault.stringVariableManager
        var ValueVariable variable = null;
        val variables = man.variables.filter[it.name == "launched_project_loc"]
        if (variables.isEmpty) {
            variable = new ValueVariable("launched_project_loc", "Fully qualified path to the launched SCT project",
                true, project.location.toOSString)
            man.addVariables(#[variable])
        } else {
            variable = variables.get(0) as ValueVariable
            variable.value = project.location.toOSString
        }
    }
}