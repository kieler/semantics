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
package de.cau.cs.kieler.core.model.ui.console

import com.google.common.base.Strings
import java.io.PrintWriter
import java.io.StringWriter
import java.io.PrintStream
import java.io.OutputStream
import java.io.IOException
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

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
        println(msg, ConsoleStyle.INFO)
    }
    
    /**
     * Writes an error to the console.
     * 
     *  @param message The message to be printed
     */ 
    public def void error(String msg) {
        println(msg, ConsoleStyle.ERROR)
    }
    
    /**
     * Writes a warning to the console.
     * 
     *  @param message The message to be printed
     */ 
    public def void warn(String msg) {
        println(msg, ConsoleStyle.WARNING)
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
        println(exceptionAsString, ConsoleStyle.ERROR)
    }
    
    /**
     * Write the exception and its cause to the console.
     * 
     * @param e The exception to be printed
     */
    public def void println(Exception e){
        var text = ""
        text += Strings.nullToEmpty(e.toString())
        if(e.cause !== null) {
            if(text.length > 0 )
                text += ":"
            text += Strings.nullToEmpty(e.cause.localizedMessage)    
        }
        println(text, ConsoleStyle.ERROR)
    }
    
    /**
     * Writes to the console.
     * 
     * @param message The message to print to the console
     * @param style The style to show the message
     */
    def void println(String msg, ConsoleStyle style)
    
    def PrintStream getInfoStream() {
        return new PrintStream(new CollectorStream(this, ConsoleStyle.INFO))
    }
    
    def PrintStream getWarningStream() {
        return new PrintStream(new CollectorStream(this, ConsoleStyle.WARNING))
    }
        
    def PrintStream getErrorStream() {
        return new PrintStream(new CollectorStream(this, ConsoleStyle.ERROR))
    }
    
}
    
@FinalFieldsConstructor
package class CollectorStream extends OutputStream {
        
    val IConsole console
    val ConsoleStyle style
    val StringBuffer buffer = new StringBuffer
    
    override write(int b) throws IOException {
        if ('\n'.charAt(0) === b) {
            console.println(buffer.toString, style)
            buffer.length = 0
        } else {
            buffer.append(b as char)
        }
    }
    
}
