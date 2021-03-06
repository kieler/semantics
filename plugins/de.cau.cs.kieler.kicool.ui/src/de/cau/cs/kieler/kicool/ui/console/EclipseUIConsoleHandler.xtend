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
package de.cau.cs.kieler.kicool.ui.console

/**
 * @author aas
 *
 */
class EclipseUIConsoleHandler extends ConsoleHandler {
    
    override protected createConsole(String name) {
        return new EclipseUIConsole(name)
    }
}
