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
import de.cau.cs.kieler.kexpressions.OperatorType

/**
 * @author ssm
 * @kieler.design 2017-12-19 proposed 
 * @kieler.rating 2017-12-19 proposed yellow
 *
 */
class KExpressionsTypeExtensions {
    
    @Inject extension KExpressionsValuedObjectExtensions
    
    def ValueType inferTypeStrict(Expression expression) {
        if (expression.isBool) return ValueType.BOOL;
        if (expression.isInt) return ValueType.INT;
        if (expression.isFloat) return ValueType.FLOAT;
        if (expression.isString) return ValueType.STRING;
        return ValueType.UNKNOWN;
    }
    
    def ValueType inferType(Expression expression) {
        if (expression.arithmetic) {
            if (expression.hasFloat) return ValueType.FLOAT
        } 
        return expression.inferTypeStrict
    }
    
    def boolean isArithmetic(Expression expression) {
        // TODO: Check for non variable valued objects?
        if (!expression.hasBool && !expression.hasString &&
            (expression.hasInt || expression.hasFloat)
        ) return true
        return false
    }
    
    
    def boolean isFloatExpression(Expression expression) {
        expression.inferType == ValueType.FLOAT
    }
    
    
    
    def dispatch boolean isFloat(ValuedObject valuedObject) {
        valuedObject.type == ValueType.FLOAT
    }
    
    def dispatch boolean isFloat(ValuedObjectReference valuedObjectReference) {
        valuedObjectReference.valuedObject.type == ValueType.FLOAT
    }
    
    def dispatch boolean isFloat(Value value) {
        value instanceof FloatValue
    }
    
    def dispatch boolean isFloat(OperatorExpression operatorExpression) {
        var skipFirst = operatorExpression.operator == OperatorType.CONDITIONAL
        for (subExpression : operatorExpression.subExpressions) {
            if (!skipFirst) {
                if (!subExpression.isFloat) return false;
            } else {
                skipFirst = false
            }
        }
        return true;
    }
    
    

    
    def dispatch boolean hasFloat(ValuedObject valuedObject) {
        valuedObject.type == ValueType.FLOAT
    }
    
    def dispatch boolean hasFloat(ValuedObjectReference valuedObjectReference) {
        valuedObjectReference.valuedObject.type == ValueType.FLOAT
    }
    
    def dispatch boolean hasFloat(Value value) {
        value instanceof FloatValue
    }
    
    def dispatch boolean hasFloat(OperatorExpression operatorExpression) {
        var skipFirst = operatorExpression.operator == OperatorType.CONDITIONAL
        for (subExpression : operatorExpression.subExpressions) {
            if (!skipFirst) {
                if (subExpression.hasFloat) return true
            } else {
                skipFirst = false
            }
        }
        return false
    }
    
    
    
    

    def dispatch boolean isInt(ValuedObject valuedObject) {
        valuedObject.type == ValueType.INT
    }
    
    def dispatch boolean isInt(ValuedObjectReference valuedObjectReference) {
        valuedObjectReference.valuedObject.type == ValueType.INT
    }
    
    def dispatch boolean isInt(Value value) {
        value instanceof IntValue
    }
    
    def dispatch boolean isInt(OperatorExpression operatorExpression) {
        var skipFirst = operatorExpression.operator == OperatorType.CONDITIONAL
        for (subExpression : operatorExpression.subExpressions) {
            if (!skipFirst) {
                if (!subExpression.isInt) return false;
            } else {
                skipFirst = false
            }
        }
        return true;
    }
    
    
    def dispatch boolean hasInt(ValuedObject valuedObject) {
        valuedObject.type == ValueType.INT
    }
    
    def dispatch boolean hasInt(ValuedObjectReference valuedObjectReference) {
        valuedObjectReference.valuedObject.type == ValueType.INT
    }
    
    def dispatch boolean hasInt(Value value) {
        value instanceof IntValue
    }
    
    def dispatch boolean hasInt(OperatorExpression operatorExpression) {
        var skipFirst = operatorExpression.operator == OperatorType.CONDITIONAL
        for (subExpression : operatorExpression.subExpressions) {
            if (!skipFirst) {
                if (subExpression.hasInt) return true
            } else {
                skipFirst = false
            }
        }
        return false
    }

    
    
    
    
    def dispatch boolean isBool(ValuedObject valuedObject) {
        valuedObject.type == ValueType.BOOL
    }
    
    def dispatch boolean isBool(ValuedObjectReference valuedObjectReference) {
        valuedObjectReference.valuedObject.type == ValueType.BOOL
    }
    
    def dispatch boolean isBool(Value value) {
        value instanceof BoolValue
    }
    
    def dispatch boolean isBool(OperatorExpression operatorExpression) {
        var skipFirst = operatorExpression.operator == OperatorType.CONDITIONAL
        for (subExpression : operatorExpression.subExpressions) {
            if (!skipFirst) {
                if (!subExpression.isBool) return false;
            } else {
                skipFirst = false
            }
        }
        return true
    }


    def dispatch boolean hasBool(ValuedObject valuedObject) {
        valuedObject.type == ValueType.BOOL
    }
    
    def dispatch boolean hasBool(ValuedObjectReference valuedObjectReference) {
        valuedObjectReference.valuedObject.type == ValueType.BOOL
    }
    
    def dispatch boolean hasBool(Value value) {
        value instanceof BoolValue
    }
    
    def dispatch boolean hasBool(OperatorExpression operatorExpression) {
        var skipFirst = operatorExpression.operator == OperatorType.CONDITIONAL
        for (subExpression : operatorExpression.subExpressions) {
            if (!skipFirst) {
                if (subExpression.hasBool) return true
            } else {
                skipFirst = false
            }
        }
        return false
    }
    
    
    
    
    
    def dispatch boolean isString(ValuedObject valuedObject) {
        valuedObject.type == ValueType.STRING
    }
    
    def dispatch boolean isString(ValuedObjectReference valuedObjectReference) {
        valuedObjectReference.valuedObject.type == ValueType.STRING
    }
    
    def dispatch boolean isString(Value value) {
        value instanceof StringValue
    }
    
    def dispatch boolean isString(OperatorExpression operatorExpression) {
        var skipFirst = operatorExpression.operator == OperatorType.CONDITIONAL
        for (subExpression : operatorExpression.subExpressions) {
            if (!skipFirst) {
                if (!subExpression.isString) return false
            } else {
                skipFirst = false
            }
        }
        return true
    }
    
    
    
    def dispatch boolean hasString(ValuedObject valuedObject) {
        valuedObject.type == ValueType.STRING
    }
    
    def dispatch boolean hasString(ValuedObjectReference valuedObjectReference) {
        valuedObjectReference.valuedObject.type == ValueType.STRING
    }
    
    def dispatch boolean hasString(Value value) {
        value instanceof StringValue
    }
        
    def dispatch boolean hasString(OperatorExpression operatorExpression) {
        var skipFirst = operatorExpression.operator == OperatorType.CONDITIONAL
        for (subExpression : operatorExpression.subExpressions) {
            if (!skipFirst) {
                if (subExpression.hasString) return true
            } else {
                skipFirst = false
            }
        }
        return false
    }
    
        
}