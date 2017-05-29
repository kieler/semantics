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
package de.cau.rtsys.peu

import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.State
import de.cau.rtsys.peu.railSL.Program
import de.cau.rtsys.peu.generator.RailSLGenerator

/**
 * @author stu121235
 *
 */
class RailSLTransformation extends AbstractExpansionTransformation implements Traceable {
    
    override getExpandsFeatureId() {
        return "RailSL"
    }
    
    override getId() {
        return "RailSLTransformation"
    }
    
    def State transform (Program program) {
        val gen = new RailSLGenerator()
        
        return gen.transform(program)
    }
    
}