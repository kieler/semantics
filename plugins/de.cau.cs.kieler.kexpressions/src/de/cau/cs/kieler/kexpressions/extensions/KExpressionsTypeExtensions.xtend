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
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.StringValue

/**
 * @author ssm
 * @kieler.design 2017-12-19 proposed 
 * @kieler.rating 2017-12-19 proposed yellow
 *
 */
class KExpressionsTypeExtensions {
    
    @Inject extension KExpressionsValuedObjectExtensions
    
    def ValueType inferType(Expression expression) {
        if (expression.isBool) return ValueType.BOOL;
        if (expression.isInt) return ValueType.INT;
        if (expression.isFloat) return ValueType.FLOAT;
        if (expression.isString) return ValueType.STRING;
        return ValueType.UNKNOWN;
    }
    
    def dispatch boolean isFloat(ValuedObject valuedObject) {
        valuedObject.type == ValueType.FLOAT
    }
    
    def dispatch boolean isFloat(ValuedObjectReference valuedObjectReference) {
        valuedObjectReference.valuedObject.type == ValueType.FLOAT
    }
    
    def dispatch boolean isFloat(OperatorExpression operatorExpression) {
        for (subExpression : operatorExpression.subExpressions) {
            if (!subExpression.isFloat) return false;
        }
        return true;
    }
    
    def dispatch boolean isFloat(Value value) {
        value instanceof FloatValue
    }

    def dispatch boolean isInt(ValuedObject valuedObject) {
        valuedObject.type == ValueType.INT
    }
    
    def dispatch boolean isInt(ValuedObjectReference valuedObjectReference) {
        valuedObjectReference.valuedObject.type == ValueType.INT
    }
    
    def dispatch boolean isInt(OperatorExpression operatorExpression) {
        for (subExpression : operatorExpression.subExpressions) {
            if (!subExpression.isInt) return false;
        }
        return true;
    }
    
    def dispatch boolean isInt(Value value) {
        value instanceof IntValue
    }
    
    def dispatch boolean isBool(ValuedObject valuedObject) {
        valuedObject.type == ValueType.BOOL
    }
    
    def dispatch boolean isBool(ValuedObjectReference valuedObjectReference) {
        valuedObjectReference.valuedObject.type == ValueType.BOOL
    }
    
    def dispatch boolean isBool(OperatorExpression operatorExpression) {
        for (subExpression : operatorExpression.subExpressions) {
            if (!subExpression.isBool) return false;
        }
        return true
    }
    
    def dispatch boolean isBool(Value value) {
        value instanceof BoolValue
    }
    
    def dispatch boolean isString(ValuedObject valuedObject) {
        valuedObject.type == ValueType.STRING
    }
    
    def dispatch boolean isString(ValuedObjectReference valuedObjectReference) {
        valuedObjectReference.valuedObject.type == ValueType.STRING
    }
    
    def dispatch boolean isString(OperatorExpression operatorExpression) {
        for (subExpression : operatorExpression.subExpressions) {
            if (subExpression.isString) return true;
        }
        return false;
    }
    
    def dispatch boolean isString(Value value) {
        value instanceof StringValue
    }
        
}