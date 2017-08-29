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
package de.cau.cs.kieler.kicool.util

import de.cau.cs.kieler.kicool.ProcessorEntry

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
    
}