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

import java.util.Map

/**
 * @author aas
 *
 */
abstract class PromConsoleHandler {
    private Map<String, IConsole> consoles = newHashMap
    
    public def IConsole getConsole(String name) {
        var console = consoles.get(name)
        if(console !== null) {
            return console
        } else {
            console = createConsole(name)
            consoles.put(name, console)
            return console
        }
    }
    
    protected def IConsole createConsole(String name)
}