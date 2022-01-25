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
package de.cau.cs.kieler.prom.ui.console

import de.cau.cs.kieler.prom.console.PromConsoleHandler

/**
 * @author aas
 *
 */
class PromUIConsoleHandler extends PromConsoleHandler {
    
    override protected createConsole(String name) {
        return new PromUIConsole(name)
    }
}