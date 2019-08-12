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

import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.SCGraph

/**
 * @author ssm
 * @kieler.design 2019-08-08 proposed 
 * @kieler.rating 2019-08-08 proposed yellow
 *
 */
class SCGExpressionComplexity extends AbstractSCGComplexity {
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.complexity.expression"
    }
    
    override getName() {
        "Expression Complexity"
    }
    
    override calculateComplexity(SCGraph scg) {
        val expressions = <Expression> newLinkedList
        for (n : scg.nodes) {
            if (n instanceof Assignment) {
                expressions += n.expression
            }            
            else if (n instanceof Conditional) {
                expressions += n.condition
            }
        }
        
        var complexity = 0;        
        
        for (e : expressions) {
            complexity += e.complexity
        }
                
        environment.setProperty(COMPLEXITY, complexity)
    }
    
    private def int complexity(Expression e) {
        switch(e) {
            Value,
            ValuedObjectReference: return 1
            OperatorExpression: return e.subExpressions.map[complexity].fold(0, [a, b | a + b]) + 1
        }
    } 
}