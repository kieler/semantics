/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.core.model.ui.console

/**
 * IConsole implementation that prints to System.out and System.err.
 * 
 * @author aas
 *
 */
class SystemConsole implements IConsole {
    
    /**
     * Prints the given message.
     * If the style for an error is used, then System.err is used to print the message.
     */
    override println(String msg, ConsoleStyle style) {
        if(style == ConsoleStyle.ERROR) {
            System.err.println(msg)
        } else {
            System.out.println(msg)
        }
    }
}
