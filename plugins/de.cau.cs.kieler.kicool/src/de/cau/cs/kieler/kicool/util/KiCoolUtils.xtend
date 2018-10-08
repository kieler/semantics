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
package de.cau.cs.kieler.kicool.util

import de.cau.cs.kieler.kicool.ProcessorEntry
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import java.lang.reflect.ParameterizedType
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.ProcessorSystem
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.ProcessorAlternativeGroup

/**
 * Generic utility class
 * 
 * @author ssm
 * @kieler.design 2017-02-27 proposed 
 * @kieler.rating 2017-02-27 proposed yellow
 */
class KiCoolUtils {
    
    /**
     * Retrieve the meta system of a meta processor.
     */
    static def de.cau.cs.kieler.kicool.System getSystem(de.cau.cs.kieler.kicool.ProcessorEntry entry) {
        if (entry.eContainer instanceof de.cau.cs.kieler.kicool.System) {
            entry.eContainer as de.cau.cs.kieler.kicool.System
        } else {
            (entry.eContainer as de.cau.cs.kieler.kicool.ProcessorEntry).getSystem
        }
    }
    
    /**
     * Create a unique id of a meta processor.
     */
    static def uniqueProcessorId(ProcessorEntry processor) {
        processor.id + "#" + processor.hashCode
    }
    
    
    static def hasInput(System sys, Class<?> modelClass) {
        val input = sys.findInputClass
        if (modelClass !== null && input !== null) {
            return input.isAssignableFrom(modelClass)
        }
        return true
    }
   
    
    /**
     * Retrieves the input class for a system
     */
    static def findInputClass(System system) {
        try {
            val p = system.processors.firstProcessor
            if (p !== null) {
                return p.sourceTargetTypes.source as Class<?>
            }
        } catch (Exception e) {}
        return null
    }
    
    static def dispatch Processor<?,?> firstProcessor(ProcessorReference p) {
        return KiCoolRegistration.getProcessorInstance(p.id)
    }
    
    static def dispatch Processor<?,?> firstProcessor(ProcessorSystem p) {
        return KiCoolRegistration.getSystemById(p.id)?.processors.firstProcessor
    }
    
    static def dispatch Processor<?,?> firstProcessor(ProcessorGroup p) {
        return p.processors.head?.firstProcessor
    }
    
    static def dispatch Processor<?,?> firstProcessor(ProcessorAlternativeGroup p) {
        return null
    }    
}