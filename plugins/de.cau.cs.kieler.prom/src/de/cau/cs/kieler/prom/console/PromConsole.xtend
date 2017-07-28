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

import java.io.InputStream
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.prom.console.IConsole

/**
 * Delegates printing to either a registered console, or to stdout if there is no registered.
 * 
 * @author aas
 *
 */
class PromConsole {
    @Accessors
    private static var IConsole currentConsole
    
    /**
     * Writes to the console.
     * @param message The message to print to the console
     */
    public static def void print(String msg){
        if(currentConsole == null) {
            println(msg)
        } else {
            currentConsole.print(msg)       
        }
    }
    
    /**
     * Write the exception to the console.
     * 
     * @param Exception e the exception
     */
    public static def void print(Exception e){
        if(currentConsole == null) {
            e.printStackTrace
        } else {
            currentConsole.print(e)
        }
    }
    
    /**
     * Brings the console to the front.
     */
    public static def void bringToFront() {
        currentConsole?.bringToFront
    }

    /**
     * Remove all text from the console.
     */
    public static def void clear() {
        currentConsole?.clear
    }
    
    /**
     * Copies all bytes from the input stream to the console.
     * Does not close the stream.
     */
    public static def void copy(InputStream from) {
        currentConsole?.copy(from)
    }
}