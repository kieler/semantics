/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kexpressions.extensions

import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.DoubleValue
import de.cau.cs.kieler.kexpressions.StringValue

/**
 * @author ssm
 * @kieler.design 2015-08-19 proposed 
 * @kieler.rating 2015-08-19 proposed yellow
 */
class KExpressionsCompareExtensions {
  
    def dispatch boolean equals2(OperatorExpression expression1, OperatorExpression expression2) {
        if (expression1 === expression2) { // same object or both null
            return true
        } else if ((expression1 !== null).xor(expression2 !== null)) { // one is null
            return false
        }
        
        // op
        if (expression1.operator != expression2.operator) {
            return false
        }
        
        // subExpressions
        if (expression1.subExpressions.size != expression2.subExpressions.size) {
            return false
        }
        for (subExpression1 : expression1.subExpressions.indexed) {
            val subExpression2 = expression2.subExpressions.get(subExpression1.key)
            if (!subExpression1.value.equals2(subExpression2)) {
                return false
            }
        }
        
        return true
    }

    def dispatch boolean equals2(ValuedObjectReference expression1, ValuedObjectReference expression2) {
        if (expression1 === expression2) { // same object or both null
            return true
        } else if ((expression1 !== null).xor(expression2 !== null)) { // one is null
            return false
        }
        
        // vo
        if (expression1.valuedObject !== expression2.valuedObject) {
            return false
        }
        
        // indices
        if (expression1.indices.size != expression2.indices.size) {
            return false
        }
        for (subExpression1 : expression1.indices.indexed) {
            val subExpression2 = expression2.indices.get(subExpression1.key)
            if (!subExpression1.value.equals2(subExpression2)) {
                return false
            }
        }
        
        // subReference
        if (expression1.subReference != expression2.subReference &&
            (expression1.subReference === null || expression2.subReference === null ||
            !expression1.subReference.equals2(expression2.subReference))
        ) {
            return false
        }
        
        return true
    }

    def dispatch boolean equals2(TextExpression expression1, TextExpression expression2) {
        if (expression1 === expression2) { // same object or both null
            return true
        } else if ((expression1 !== null).xor(expression2 !== null)) { // one is null
            return false
        }
        
        return expression1.text.equals(expression2.text)
    }

    def dispatch boolean equals2(BoolValue expression1, BoolValue expression2) {
        if (expression1 === expression2) { // same object or both null
            return true
        } else if ((expression1 !== null).xor(expression2 !== null)) { // one is null
            return false
        }
        
        return expression1.value == expression2.value
    }

    def dispatch boolean equals2(IntValue expression1, IntValue expression2) {
        if (expression1 === expression2) { // same object or both null
            return true
        } else if ((expression1 !== null).xor(expression2 !== null)) { // one is null
            return false
        }
        
        return expression1.value == expression2.value
    }

    def dispatch boolean equals2(FloatValue expression1, FloatValue expression2) {
        if (expression1 === expression2) { // same object or both null
            return true
        } else if ((expression1 !== null).xor(expression2 !== null)) { // one is null
            return false
        }
        
        return expression1.value == expression2.value
    }

    def dispatch boolean equals2(DoubleValue expression1, DoubleValue expression2) {
        if (expression1 === expression2) { // same object or both null
            return true
        } else if ((expression1 !== null).xor(expression2 !== null)) { // one is null
            return false
        }
        
        return expression1.value == expression2.value
    }

    def dispatch boolean equals2(StringValue expression1, StringValue expression2) {
        if (expression1 === expression2) { // same object or both null
            return true
        } else if ((expression1 !== null).xor(expression2 !== null)) { // one is null
            return false
        }
        
        return expression1.value.equals(expression2.value)
    }
        
    def dispatch boolean equals2(Expression expression1, Expression expression2) {
        if (expression1 === expression2) { // same object or both null
            return true
        }
        
        return false
    }
    
}