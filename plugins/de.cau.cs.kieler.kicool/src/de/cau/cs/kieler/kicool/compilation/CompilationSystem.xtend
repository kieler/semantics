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

import de.cau.cs.kieler.kicool.KiCoolFactory
import java.util.List

/**
 * Class for preparing compilations programmatically through creating compilation contexts. 
 * The context itself then has a method to invoke the compilation.
 * 
 * @author ssm
 * @kieler.design 2017-08-18 proposed
 * @kieler.rating 2017-08-18 proposed yellow  
 */
class CompilationSystem {
    
    static def createCompilationSystem(String systemId, List<String> processorIds) {
        KiCoolFactory.eINSTANCE.createSystem => [
            id = systemId
            if (processorIds.size > 0) {
                if (processorIds.size == 1) {
                    processors = KiCoolFactory.eINSTANCE.createProcessorReference => [
                        id = processorIds.head
                    ]
                } else {
                    processors = KiCoolFactory.eINSTANCE.createProcessorGroup => [
                        for (processorId : processorIds) {
                            processors += KiCoolFactory.eINSTANCE.createProcessorReference => [
                                id = processorId
                            ]
                        }
                    ]
                }
            } 
        ]
    }
    
}