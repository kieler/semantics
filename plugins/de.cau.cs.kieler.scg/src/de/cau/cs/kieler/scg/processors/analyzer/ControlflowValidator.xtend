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
package de.cau.cs.kieler.scg.processors.analyzer

import de.cau.cs.kieler.kicool.compilation.IntermediateProcessor
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import com.google.inject.Inject
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions

/**
 * @author ssm
 * @kieler.design 2017-07-11 proposed
 * @kieler.rating 2017-07-11 proposed yellow  
 *
 */
class ControlflowValidator extends IntermediateProcessor<SCGraph> {
    
    @Inject extension SCGControlFlowExtensions
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.validators.controlflow"
    }
    
    override getName() {
        "Controlflow Validator"
    }
    
    override getType() {
        ProcessorType.VALIDATOR
    }
    
    override process() {
        val model = getModel
        
        for(node : model.nodes) {
            val corrupt = node.getAllPrevious.filter[ it.eContainer == null ].toList   
            if (corrupt.size > 0) {
                environment.warnings.add("Corrupt control flow detected!", node)
                environment.errors.add("This is an error!", node)
            }
        }
    }
    
}