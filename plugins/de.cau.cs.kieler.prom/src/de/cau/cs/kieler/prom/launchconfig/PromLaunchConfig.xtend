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
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.debug.core.ILaunch
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate
import org.eclipse.ui.console.ConsolePlugin
import org.eclipse.ui.console.MessageConsole
import org.eclipse.ui.console.MessageConsoleStream
import org.eclipse.xtend.lib.annotations.Accessors

abstract class PromLaunchConfig implements ILaunchConfigurationDelegate {
    
    // Objects from launch
    @Accessors
    private ILaunchConfiguration configuration
    @Accessors
    private String mode
    @Accessors
    private ILaunch launch
    @Accessors
    private IProgressMonitor monitor
    
    // Message console
    private static val CONSOLE_NAME = "KiCo Compilation"
    private static MessageConsole console;
    private static MessageConsoleStream consoleStream;
    
    /**
     * {@inheritDoc}
     */
    override void launch(ILaunchConfiguration configuration, String mode, ILaunch launch,
        IProgressMonitor monitor) throws CoreException {
        this.configuration = configuration
        this.mode = mode
        this.launch = launch
        this.monitor = monitor
    }

    /**
     * Returns a project handle if the project exists in the current workspace.
     * 
     * @param name The name of a project to be found
     */
    static def IProject findProject(String name) {
        if (!name.isNullOrEmpty() && new Path(name).isValidPath(name)) {
            val p = ResourcesPlugin.workspace.root.getProject(name)
            if (p.location != null)
                return p
        }
        return null
    }
    
    /**
     * Writes to the console view for a KiCo launch.
     * @param message The message to print to the console
     */
    public static def void writeToConsole(String message){
        // If there is nothing to write, we are done immediately.
        if(message.isNullOrEmpty())
            return;
        
        // Ensure the console exists.
        initializeConsole()
        
        // Print message
        consoleStream.println(message)
        
        // Bring console to front
        val consoleManager = ConsolePlugin.getDefault().getConsoleManager();
        consoleManager.showConsoleView(console)
    }

    /**
     * Write the exception to the KiCo console 
     * 
     * @param Exception e the exception
     */
    public static def void writeToConsole(Exception e){
        // Write exception to console of running Eclipse
        var text = ""
        text += Strings.nullToEmpty(e.toString())
        if(text.length > 0 )
            text += ":"
        text += Strings.nullToEmpty(e.message)
        writeToConsole(text)
        
        // Print stack trace
        e.printStackTrace()
    }

    /**
     * Search for a console with a given name in the Console View.
     * If the console can't be found it will be created.
     * 
     * @param name The name of a message console to be found or created
     * @return The found or newly created message console
     */
    private static def MessageConsole findOrCreateConsole(String name) {
        val consoleManager = ConsolePlugin.getDefault().getConsoleManager();
        val existingConsoles = consoleManager.getConsoles();
        for (var i = 0; i < existingConsoles.length; i++)
            if (name.equals(existingConsoles.get(i).getName()))
                return existingConsoles.get(i) as MessageConsole;

        // No console found, so create a new one.
        val myConsole = new MessageConsole(name, null);
        consoleManager.addConsoles(#[myConsole]);
        return myConsole;
    }
    
    /**
     * Removes all text from the console.
     */
    static def void clearConsole() {
        initializeConsole()
        console.clearConsole()
    }
    
    /**
     * Creates the console if it has not been created.
     */
    static def void initializeConsole() {
        if (console == null || consoleStream == null) {
            console = findOrCreateConsole(CONSOLE_NAME)
            consoleStream = console.newMessageStream()
        }
    }
    
}