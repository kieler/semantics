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
package de.cau.cs.kieler.sccharts.processors.transformators

import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor

/**
 * @author ssm
 * @kieler.design 2017-07-09 proposed
 * @kieler.rating 2017-07-09 proposed yellow  
 */
abstract class AbstractWrapper extends SCChartsProcessor {
   
    override getType() {
        ProcessorType.TRANSFORMATOR
    }
    
}