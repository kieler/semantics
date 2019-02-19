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
package de.cau.cs.kieler.kicool.ui.console

import java.util.Map
import org.eclipse.swt.graphics.Color
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.console.ConsolePlugin
import org.eclipse.ui.console.MessageConsole
import org.eclipse.ui.console.MessageConsoleStream

/**
 * Dedicated console in the Console View of Eclipse to show information to the end user (e.g. about the simulation). 
 * 
 * @author aas
 *
 */
class EclipseUIConsole implements IConsole {
    /**
     * The name of the console
     */
    private val String name
    
    /**
     * The console
     */
    private MessageConsole console;
    
    /**
     * The stream of the console to write to
     */
    private Map<ConsoleStyle, MessageConsoleStream> consoleStreams = newHashMap;
    
    new(String name) {
        super()
        this.name = name
        console = findOrCreateConsole(name)
    }
    
    /**
     * {@inheritDoc}
     */
    override println(String message, ConsoleStyle style){
        if(message.isNullOrEmpty())
            return;
        
        // Print message using a stream that fits the style
        val stream = getOrCreateConsoleStream(style)
        stream.println(message)
    }
    
    /**
     * Brings the console to the front.
     */
    public def void bringToFront() {
        val consoleManager = ConsolePlugin.getDefault().getConsoleManager();
        consoleManager.showConsoleView(console)
    }

    /**
     * Removes all text from the console.
     */
    public def void clear() {
        console.clearConsole()
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
    
    /**
     * Returns a stream in this console for the given style.
     */
    private def MessageConsoleStream getOrCreateConsoleStream(ConsoleStyle style) {
        val oldStream = consoleStreams.get(style)
        if(oldStream !== null) {
            return oldStream
        } else {
            val newStream = console.newMessageStream()
            consoleStreams.put(style, newStream)    
            Display.getDefault().asyncExec(new Runnable() {
                override void run() {
                    try {
                        newStream.color = new Color(Display.current, style.r, style.g, style.b)
                    } catch(Exception e) {
                    }
                }
            })
            return newStream
        }
    }
}
