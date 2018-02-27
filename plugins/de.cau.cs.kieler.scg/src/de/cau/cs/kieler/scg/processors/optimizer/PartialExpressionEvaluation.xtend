/*
RegularSSATransformation.xtend * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.optimizer

import de.cau.cs.kieler.kexpressions.eval.PartialExpressionEvaluator
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * The SSA transformation for SCGs
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class PartialExpressionEvaluation extends InplaceProcessor<SCGraphs> implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "de.cau.cs.kieler.scg.processors.pareval"
    }

    override getName() {
        return "Partial Expression Evaluation"
    }
    
    override process() {
        model.scgs.forEach[transform]
        model = model
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    extension PartialExpressionEvaluator = new PartialExpressionEvaluator() => [ 
        compute = true
        inplace = true
    ]

    // -------------------------------------------------------------------------
    def SCGraph transform(SCGraph scg) {
        
        for (n : scg.nodes) {
            if (n instanceof Assignment) {
            	n.expression.replace(n.expression.evaluate)
            } else if (n instanceof Conditional) {
                n.condition.replace(n.condition.evaluate)
            }
        }
        
        return scg
    }
}
    