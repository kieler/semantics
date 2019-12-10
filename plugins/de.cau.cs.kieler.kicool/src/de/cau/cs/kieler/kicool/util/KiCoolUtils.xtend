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

import de.cau.cs.kieler.kicool.ProcessorAlternativeGroup
import de.cau.cs.kieler.kicool.ProcessorEntry
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.ProcessorSystem
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration

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
    static def System getSystem(ProcessorEntry entry) {
        if (entry.eContainer instanceof System) {
            entry.eContainer as System
        } else {
            (entry.eContainer as ProcessorEntry).getSystem
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
            var Class<?> lastTarget = Object
            val count = system.processors.processorCount
            var Class<?> input = null
            for (var i = 0; i < count; i++) {
                val p = system.processors.findProcessor(i)
                if (p !== null) {
                    if (input === null) {
                        input = p.sourceTargetTypes.source
                    }
                    if (lastTarget != p.sourceTargetTypes.source) {
                        if (!p.sourceTargetTypes.source.isAssignableFrom(lastTarget)) {
                            input = p.sourceTargetTypes.source
                        }
                    }
                    if (p.sourceTargetTypes.source != p.sourceTargetTypes.target) {
                        return input
                    }
                    lastTarget = p.sourceTargetTypes.target
                }
            }
            return input
        } catch (Exception e) {
            e.printStackTrace
        }
        return null
    }

    static def dispatch Processor<?, ?> findProcessor(ProcessorReference p, int index) {
        if (index == 0) {
            return KiCoolRegistration.getProcessorInstance(p.id)
        }
        return null
    }

    static def dispatch Processor<?, ?> findProcessor(ProcessorSystem p, int index) {
        return KiCoolRegistration.getSystemById(p.id)?.processors.findProcessor(index)
    }

    static def dispatch Processor<?, ?> findProcessor(ProcessorGroup p, int i) {
        var index = i
        for (p2 : p.processors.toList) {
            val count = p2.processorCount
            if (count > index) {
                return p2.findProcessor(index)
            } else {
                index -= count
            }
        }
        return null
    }


    static def dispatch int processorCount(Void p) {
        return 0
    }
    
    static def dispatch int processorCount(ProcessorReference p) {
        return 1
    }

    static def dispatch int processorCount(ProcessorSystem s) {
        return KiCoolRegistration.getSystemById(s.id)?.processors?.processorCount
    }

    static def dispatch int processorCount(ProcessorGroup g) {
        var count = 0
        for (p : g.processors.toList) {
            count += p.processorCount
        }
        return count
    }

    static def dispatch int processorCount(ProcessorAlternativeGroup p) {
        return 0
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