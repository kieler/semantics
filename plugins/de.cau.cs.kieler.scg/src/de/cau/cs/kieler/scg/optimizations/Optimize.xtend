/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.optimizations

import de.cau.cs.kieler.kico.transformation.ITransformation
import de.cau.cs.kieler.kico.transformation.ProcessorOption
import de.cau.cs.kieler.scg.processors.SCGProcessors

/**
 * Deletes conditionals with constant value, unreachable nodes until all eliminated.
 * Resolves unused variables to constants
 * 
 * @author krat ssm 
 * @kieler.design 2015-05-25 proposed 
 * @kieler.rating 2015-05-25 proposed yellow
 *
 */
class Optimize implements ITransformation {
    
    override getId() {
        return "scg.optimizations.esterel.all"
    }
    
    override getName() {
        return "Esterel Optimizations"
    }
    
    override getProcessorOptions() {
        <ProcessorOption>newArrayList => [
            it += new ProcessorOption(SCGProcessors.REPLACEUNUSEDVARIABLES_ID)
            it += new ProcessorOption(SCGProcessors.CONSTANTCONDITIONALS_ID)
            it += new ProcessorOption(SCGProcessors.UNREACHABLENODES_ID)
        ]
    }
    
    override isInplace() {
        true
    }
    
}