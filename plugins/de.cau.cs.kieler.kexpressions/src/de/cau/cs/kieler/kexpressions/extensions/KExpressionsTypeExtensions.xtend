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
package de.cau.cs.kieler.kexpressions.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.ValuedObjectReference

/**
 * @author ssm
 * @kieler.design 2017-12-19 proposed 
 * @kieler.rating 2017-12-19 proposed yellow
 *
 */
class KExpressionsTypeExtensions {
    
    @Inject extension KExpressionsValuedObjectExtensions
    
    def dispatch boolean isFloat(ValuedObject valuedObject) {
        valuedObject.type == ValueType.FLOAT
    }
    
    def dispatch boolean isFloat(ValuedObjectReference valuedObjectReference) {
        valuedObjectReference.valuedObject.type == ValueType.FLOAT
    }
    
    def dispatch boolean isFloat(OperatorExpression operatorExpression) {
        for (subExpression : operatorExpression.subExpressions) {
            if (subExpression.isFloat) return true;
        }
        return false;
    }
    
    def dispatch boolean isFloat(Value value) {
        value instanceof FloatValue
    }
}