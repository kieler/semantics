/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.analyzer

import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs

/**
 * @author ssm
 * @kieler.design 2019-08-08 proposed 
 * @kieler.rating 2019-08-08 proposed yellow
 *
 */
class SCGValuedObjectComplexity extends InplaceProcessor<SCGraphs> {
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.complexity.valuedObject"
    }
    
    override getName() {
        "Valued Object Complexity"
    }
    
    override process() {
        model.scgs.head.calculateComplexity
    }
    
    private def calculateComplexity(SCGraph scg) {
        var complexity = scg.declarations.map[ valuedObjects ].fold(0, [a, b | a + 1]);        
                
        println(complexity)
    }
    
}