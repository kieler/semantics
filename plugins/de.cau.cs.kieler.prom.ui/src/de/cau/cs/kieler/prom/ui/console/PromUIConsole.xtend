/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.prom.ui.console

import com.google.common.base.Strings
import com.google.common.io.ByteStreams
import de.cau.cs.kieler.prom.console.IConsole
import java.io.InputStream
import org.eclipse.ui.console.ConsolePlugin
import org.eclipse.ui.console.MessageConsole
import org.eclipse.ui.console.MessageConsoleStream

/**
 * Dedecated console in the Console View of Eclipse for output about the simulation. 
 * 
 * @author aas
 *
 */
class PromUIConsole implements IConsole {
    // Message console
    private static val CONSOLE_NAME = "KIELER Project Management"
    private static MessageConsole console;
    private static MessageConsoleStream consoleStream;
    
    override print(String message){
        // If there is nothing to write, we are done immediately.
        if(message.isNullOrEmpty())
            return;
        
        // Ensure the console exists.
        initialize()
        
        // Print message
        consoleStream.println(message)
    }
    
    override print(Exception e) {
        // Write exception to console of running Eclipse
        var text = ""
        text += Strings.nullToEmpty(e.toString())
        if(text.length > 0 )
            text += ":"
        text += Strings.nullToEmpty(e.message)
        print(text)
        
        // Bring to front because an exception might require user action
        bringToFront()
        
        // Print stack trace
        e.printStackTrace()
    }
    
    override bringToFront() {
        initialize()
        val consoleManager = ConsolePlugin.getDefault().getConsoleManager();
        consoleManager.showConsoleView(console)
    }

    override clear() {
        initialize()
        console.clearConsole()
    }
    
    override copy(InputStream from) {
        initialize()
        ByteStreams.copy(from, consoleStream)
        consoleStream.flush
    }
    
    /**
     * Creates the console if not yet done
     */
    private def void initialize() {
        if (console == null || consoleStream == null) {
            console = findOrCreateConsole(CONSOLE_NAME)
            consoleStream = console.newMessageStream()
        }
    }

    /**
     * Search for a console with a given name in the Console View.
     * If the console can't be found it will be created.
     * 
     * @param name The name of a message console to be found or created
     * @return The found or newly created message console
     */
    private def MessageConsole findOrCreateConsole(String name) {
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
}