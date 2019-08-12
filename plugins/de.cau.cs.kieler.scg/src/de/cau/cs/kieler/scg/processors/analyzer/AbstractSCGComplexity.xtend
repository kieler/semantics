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
package de.cau.cs.kieler.scg.processors.analyzer

import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.scg.SCGraph

/**
 * @author lgr
 *
 */
abstract class AbstractSCGComplexity extends InplaceProcessor<SCGraphs> {
    
    public static val IProperty<Integer> COMPLEXITY = 
        new Property<Integer>("de.cau.cs.kieler.scg.complexity", new Integer(0))
    
    override process() {
        model.scgs.head.calculateComplexity
    }
    
    abstract def void calculateComplexity(SCGraph scg)
}