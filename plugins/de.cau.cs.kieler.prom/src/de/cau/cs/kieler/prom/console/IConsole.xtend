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

/**
 * @author aas
 *
 */
interface IConsole {
    /**
     * Writes to the console.
     * @param message The message to print to the console
     */
    def void print(String msg)
    
    /**
     * Write the exception to the console 
     * 
     * @param Exception e the exception
     */
    def void print(Exception e)
    
    /**
     * Show the console to the user
     */
    def void bringToFront()
    
    /**
     * Remove all text from the console
     */
    def void clear()
    
    /**
     * Copies all bytes from the input stream to the console. 
     * Does not close either stream.
     */
    def void copy(InputStream from)
}