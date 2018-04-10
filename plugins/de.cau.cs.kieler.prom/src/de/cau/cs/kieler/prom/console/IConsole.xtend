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

import com.google.common.base.Strings
import java.io.PrintWriter
import java.io.StringWriter

/**
 * Interface to present information to users in a console. 
 * 
 * @author aas
 *
 */
interface IConsole {
    /**
     * Writes an information to the console.
     * 
     *  @param message The message to be printed
     */ 
    public def void info(String msg) {
        print(msg, ConsoleStyle.INFO)
    }
    
    /**
     * Writes an error to the console.
     * 
     *  @param message The message to be printed
     */ 
    public def void error(String msg) {
        print(msg, ConsoleStyle.ERROR)
    }
    
    /**
     * Writes a warning to the console.
     * 
     *  @param message The message to be printed
     */ 
    public def void warn(String msg) {
        print(msg, ConsoleStyle.WARNING)
    }
    
    /**
     * Write the exception stack trace to the console.
     * 
     * @param e The exception to be printed
     */
    public def void printStackTrace(Exception e){
        val sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        val exceptionAsString = sw.toString();
        print(exceptionAsString, ConsoleStyle.ERROR)
    }
    
    /**
     * Write the exception and its cause to the console.
     * 
     * @param e The exception to be printed
     */
    public def void print(Exception e){
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
     * @param style The style to show the message
     */
    def void print(String msg, ConsoleStyle style)
}