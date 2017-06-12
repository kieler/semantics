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

/**
 * @author ssm
 * @kieler.design 2015-08-19 proposed 
 * @kieler.rating 2015-08-19 proposed yellow
 */
class KExpressionsCompareExtensions {
  
    def dispatch boolean equals2(OperatorExpression expression1, OperatorExpression expression2) {
        if (expression1 == null && expression2 == null) {
            return true
        }
        else if (expression1 != null && expression2 == null) {
            return false
        }
        else if (expression1 == null && expression2 != null) {
            return false
        }
        var c = 0
        for (Expression subExpression1 : expression1.subExpressions) {
            val subExpression2 = expression2.subExpressions.get(c)
            c = c + 1
            if (expression1.operator != expression2.operator) {
                return false
            }
            if (!(subExpression1.equals2(subExpression2))) {
                return false
            }
        }
        return true
    }

    def dispatch equals2(ValuedObjectReference expression1, ValuedObjectReference expression2) {
        if (expression1 == null && expression2 == null) {
            return true
        } else if (expression1 != null && expression2 == null) {
            return false
        } else if (expression1 == null && expression2 != null) {
            return false
        }
        return expression1.valuedObject == expression2.valuedObject
    }

    def dispatch equals2(TextExpression expression1, TextExpression expression2) {
        if (expression1 == null && expression2 == null) {
            return true
        } else if (expression1 != null && expression2 == null) {
            return false
        } else if (expression1 == null && expression2 != null) {
            return false
        }
        return expression1.text.equals(expression2.text)
    }

    def dispatch equals2(BoolValue boolValue1, BoolValue boolValue2) {
        if (boolValue1 == null && boolValue2 == null) {
            return true
        } else if (boolValue1 != null && boolValue2 == null) {
            return false
        } else if (boolValue1 == null && boolValue2 != null) {
            return false
        }
        return (boolValue1.value == boolValue2.value)
    }

    def dispatch equals2(IntValue intValue1, IntValue intValue2) {
        if (intValue1 == null && intValue2 == null) {
            return true
        } else if (intValue1 != null && intValue2 == null) {
            return false
        } else if (intValue1 == null && intValue2 != null) {
            return false
        }
        return (intValue1.value == intValue2.value)
    }

    
    def dispatch equals2(Expression expression1, Expression expression2) {
        if (expression1 == null && expression2 == null) {
            return true
        }
        return false
    }
    
    
}