/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.compilation

import java.util.HashMap
import de.cau.cs.kieler.kicool.System
import static extension de.cau.cs.kieler.kicool.util.KiCoolUtils.*
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration

/**
 * @author ssm
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow  
 */
class RuntimeSystems {
    private static val systems = new HashMap<System, CompilationContext>()
    
    static def add(System system, CompilationContext cc) {
        systems.put(system, cc)
    }
    
    static def CompilationContext get(System system) {
        systems.get(system)
    }
    
    static def remove(System system) {
        systems.remove(system)
    }
    
    static def de.cau.cs.kieler.kicool.compilation.Processor getProcessorInstance(de.cau.cs.kieler.kicool.Processor processor) {
        val system = processor.getSystem
        val cc = systems.get(system)
        if (cc == null) {
            // There is no running instance of this processor, return a new instance
            return KiCoolRegistration.getProcessorInstance(processor.id)
        } else {
            return cc.getCompilationUnit(processor)    
        }
    }
}