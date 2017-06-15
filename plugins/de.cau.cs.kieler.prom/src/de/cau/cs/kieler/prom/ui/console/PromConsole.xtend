/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.prom.ui.console

import com.google.common.base.Strings
import org.eclipse.ui.console.MessageConsole
import org.eclipse.ui.console.MessageConsoleStream
import org.eclipse.ui.console.ConsolePlugin
import org.eclipse.xtend.lib.annotations.Accessors
import com.google.common.io.ByteStreams
import java.io.InputStream

/**
 * Dedecated console in the Console View of Eclipse for output about the simulation. 
 * 
 * @author aas
 *
 */
class PromConsole {
    // Message console
    private static val CONSOLE_NAME = "KIELER Project Management"
    private static MessageConsole console;
    private static MessageConsoleStream consoleStream;
    
    /**
     * Writes to the console.
     * @param message The message to print to the console
     */
    public static def void print(String message){
        // If there is nothing to write, we are done immediately.
        if(message.isNullOrEmpty())
            return;
        
        // Ensure the console exists.
        initialize()
        
        // Print message
        consoleStream.println(message)
    }
    
    /**
     * Write the exception to the console 
     * 
     * @param Exception e the exception
     */
    public static def void print(Exception e){
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
    
    public static def void bringToFront() {
        initialize()
        val consoleManager = ConsolePlugin.getDefault().getConsoleManager();
        consoleManager.showConsoleView(console)
    }

    /**
     * Remove all text from the console
     */
    public static def void clear() {
        initialize()
        console.clearConsole()
    }
    
    /**
     * Copies all bytes from the input stream to the console. Does not close either stream.
     */
    public static def void copy(InputStream from) {
        initialize()
        ByteStreams.copy(from, consoleStream)
        consoleStream.flush
    }
    
    /**
     * Creates the console if not yet done
     */
    public static def void initialize() {
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
}