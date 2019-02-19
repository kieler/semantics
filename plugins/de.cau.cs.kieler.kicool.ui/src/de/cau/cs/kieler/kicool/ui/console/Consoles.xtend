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

import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Delegates printing to either a registered console, or to stdout if there is no registered.
 * Used to have a central class to show (debug) information to end-users.
 * 
 * @author aas
 *
 */
class Consoles {
    /**
     * The currently used console handler to create new consoles.
     * Other plugins may replace this console handler with a UI console handler.
     */
    @Accessors
    private static var ConsoleHandler currentConsoleHandler = new EclipseUIConsoleHandler
    
    /**
     * Returns a (possibly new) console with the given name. 
     */
    static def IConsole getConsole(String name) {
        return currentConsoleHandler.getConsole(name)
    }
}
