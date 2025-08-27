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
package de.cau.cs.kieler.prom.console

/**
 * @author aas
 *
 */
class SystemConsoleHandler extends PromConsoleHandler {
    
    private static val IConsole SYSTEM_CONSOLE = new SystemConsole
    
    override protected createConsole(String name) {
        return SYSTEM_CONSOLE
    }
}