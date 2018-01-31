/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kexpressions.eval

import java.util.HashMap
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.Expression
import java.util.Map

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class PartialExpressionEvaluator {
    
    val Map<ValuedObject, Value> values
    
    new() {
        this.values = emptyMap
    }
    
    new(HashMap<ValuedObject, Value> values) {
        this.values = values
    }
    
    def Expression evaluate(Expression expression) {
        // TODO: implement
        return expression // DO NOTHING
    }
    
}