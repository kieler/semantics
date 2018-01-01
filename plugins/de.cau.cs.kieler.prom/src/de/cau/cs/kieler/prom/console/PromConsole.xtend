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
package de.cau.cs.kieler.prom.console

import com.google.common.base.Charsets
import com.google.common.base.Strings
import com.google.common.io.CharStreams
import java.io.InputStream
import java.io.InputStreamReader
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Delegates printing to either a registered console, or to stdout if there is no registered.
 * Used to have a central class to show (debug) information to end-users.
 * 
 * @author aas
 *
 */
class PromConsole {
    /**
     * The currently used console.
     * Other plugins may replace this console with a UI console.
     */
    @Accessors
    private static var IConsole currentConsole = new SystemConsole
    
    /**
     * Writes to the console.
     * 
     * @param message The message to print to the console
     */
    public static def void print(String msg){
        print(msg, ConsoleStyle.INFO)
    }
    
    /**
     * Write the exception and its cause to the console.
     * 
     * @param e The exception to be printed
     */
    public static def void print(Exception e){
        var text = ""
        text += Strings.nullToEmpty(e.toString())
        if(e.cause !== null) {
            if(text.length > 0 )
                text += ":"
            text += Strings.nullToEmpty(e.cause.localizedMessage)    
        }
        print(text, ConsoleStyle.ERROR)
    }
    
    /**
     * Writes to the console.
     * 
     * @param message The message to print to the console
     * @param style The style for the message
     */
    public static def void print(String msg, ConsoleStyle style){
        currentConsole.print(msg, style)
    }
    
    /**
     * Brings the console to the front.
     */
    public static def void bringToFront() {
        currentConsole.bringToFront
    }

    /**
     * Remove all text from the console.
     */
    public static def void clear() {
        currentConsole.clear
    }
}