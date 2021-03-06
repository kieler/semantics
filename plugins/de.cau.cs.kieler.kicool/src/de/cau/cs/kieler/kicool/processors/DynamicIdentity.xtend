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
package de.cau.cs.kieler.kicool.processors

import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType

/**
 * Test processor that does nothing.
 * 
 * @author ssm
 * @kieler.design 2017-12-19 proposed
 * @kieler.rating 2017-12-19 proposed yellow  
 */
class DynamicIdentity extends Processor<Object, Object> {
    
    override getId() {
        "de.cau.cs.kieler.kicool.processors.dynamicIdentity"
    }
    
    override getName() {
        "Dyn. Identity"
    }
    
    override getType() {
        ProcessorType.ANALYZER
    }
    
    override process() {
        compilationContext.addProcessorEntry("de.cau.cs.kieler.kicool.processors.identity")
    }
    
}