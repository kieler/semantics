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

/**
 * Interface to present information to users in a console. 
 * 
 * @author aas
 *
 */
interface IConsole {
    /**
     * Writes to the console.
     * 
     * @param message The message to print to the console
     * @param style The style to show the message
     */
    def void print(String msg, ConsoleStyle style)
    
    /**
     * Show the console to the user
     */
    def void bringToFront()
    
    /**
     * Remove all text from the console
     */
    def void clear()
}