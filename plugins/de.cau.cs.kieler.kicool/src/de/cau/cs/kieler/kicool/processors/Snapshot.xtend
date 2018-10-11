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
 * Processor that issues a snapshot.
 * 
 * @author ssm
 * @kieler.design 2018-07-02 proposed
 * @kieler.rating 2018-07-02 proposed yellow  
 */
class Snapshot extends Processor<Object, Object> {
    
    override getId() {
        "de.cau.cs.kieler.kicool.processors.snapshot"
    }
    
    override getName() {
        "Snapshot"
    }
    
    override getType() {
        ProcessorType.ANALYZER
    }
    
    override process() {
        snapshot
    }
    
}