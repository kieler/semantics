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
package de.cau.cs.kieler.kivis.ui.interactions

import de.cau.cs.kieler.kivis.interactions.FunctionHandler
import java.util.List

/**
 * @author aas
 *
 */
class SinFunction extends FunctionHandler {
    
    override getName() {
        "sin"
    }
    
    override getValue(List<Object> arguments) {
        if(!arguments.isSupported) {
            throw new Exception(name+" expects 1 argument but got "+arguments.size)
        }
        val x = arguments.get(0) as Integer
        val result = Math.sin(x) as Double 
        println("x: "+x+", sin(x):"+result)
        return result
    }
    
    override getSupportedArgumentCounts() {
        return #[1]
    }
}