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
        return !expression.hasBool && !expression.hasString &&
               (expression.hasInt || expression.hasFloat)
    }
    
    
    def boolean isFloatExpression(Expression expression) {
        expression.inferType == ValueType.FLOAT
    }
    
    
    
    def boolean isFloat(Expression expression) {
        switch(expression) {
            Value: return expression instanceof FloatValue
            ValuedObject: return compareTypes(expression, ValueType.FLOAT)
            ValuedObjectReference: return compareTypes(expression.lowermostReference.valuedObject, ValueType.FLOAT)
            OperatorExpression: {
                var skipFirst = expression.operator == OperatorType.CONDITIONAL
                for (subExpression : expression.subExpressions) {
                    if (!skipFirst) {
                        if (!subExpression.isFloat) return false
                    } else {
                        skipFirst = false
                    }
                }
                return true
            }
            default: {
                return false
            }
        }
    }
    
    def boolean hasFloat(Expression expression) {
        switch(expression) {
            Value: return expression instanceof FloatValue
            ValuedObject: return compareTypes(expression, ValueType.FLOAT)
            ValuedObjectReference: return compareTypes(expression.lowermostReference.valuedObject, ValueType.FLOAT)
            OperatorExpression: {
                var skipFirst = expression.operator == OperatorType.CONDITIONAL
                for (subExpression : expression.subExpressions) {
                    if (!skipFirst) {
                        if (subExpression.hasFloat) return true
                    } else {
                        skipFirst = false
                    }
                }
                return false
            }
            default: {
                return false
            }
        }
    }    
    


    def boolean isInt(Expression expression) {
        switch(expression) {
            Value: return expression instanceof IntValue
            ValuedObject: return compareTypes(expression, ValueType.INT)
            ValuedObjectReference: return compareTypes(expression.lowermostReference.valuedObject, ValueType.INT)
            OperatorExpression: {
                var skipFirst = expression.operator == OperatorType.CONDITIONAL
                for (subExpression : expression.subExpressions) {
                    if (!skipFirst) {
                        if (!subExpression.isInt) return false
                    } else {
                        skipFirst = false
                    }
                }
                return true
            }
            default: {
                return false
            }
        }
    }
    
    def boolean hasInt(Expression expression) {
        switch(expression) {
            Value: return expression instanceof IntValue
            ValuedObject: return compareTypes(expression, ValueType.INT)
            ValuedObjectReference: return compareTypes(expression.lowermostReference.valuedObject, ValueType.INT)
            OperatorExpression: {
                var skipFirst = expression.operator == OperatorType.CONDITIONAL
                for (subExpression : expression.subExpressions) {
                    if (!skipFirst) {
                        if (subExpression.hasInt) return true
                    } else {
                        skipFirst = false
                    }
                }
                return false
            }
            default: {
                return false
            }
        }
    }    
     
    
    
    def boolean isBool(Expression expression) {
        switch(expression) {
            Value: return expression instanceof BoolValue
            ValuedObject: return compareTypes(expression, ValueType.BOOL)
            ValuedObjectReference: return compareTypes(expression.lowermostReference.valuedObject, ValueType.BOOL)
            OperatorExpression: {
                var skipFirst = expression.operator == OperatorType.CONDITIONAL
                for (subExpression : expression.subExpressions) {
                    if (!skipFirst) {
                        if (!subExpression.isBool) return false
                    } else {
                        skipFirst = false
                    }
                }
                return true
            }
            default: {
                return false
            }
        }
    }
    
    def boolean hasBool(Expression expression) {
        switch(expression) {
            Value: return expression instanceof BoolValue
            ValuedObject: return compareTypes(expression, ValueType.BOOL)
            ValuedObjectReference: return compareTypes(expression.lowermostReference.valuedObject, ValueType.BOOL)
            OperatorExpression: {
                var skipFirst = expression.operator == OperatorType.CONDITIONAL
                for (subExpression : expression.subExpressions) {
                    if (!skipFirst) {
                        if (subExpression.hasBool) return true
                    } else {
                        skipFirst = false
                    }
                }
                return false
            }
            default: {
                return false
            }
        }
    }    
    
    

    def boolean isString(Expression expression) {
        switch(expression) {
            Value: return expression instanceof StringValue
            ValuedObject: return compareTypes(expression, ValueType.STRING)
            ValuedObjectReference: return compareTypes(expression.lowermostReference.valuedObject, ValueType.STRING)
            OperatorExpression: {
                var skipFirst = expression.operator == OperatorType.CONDITIONAL
                for (subExpression : expression.subExpressions) {
                    if (!skipFirst) {
                        if (!subExpression.isString) return false
                    } else {
                        skipFirst = false
                    }
                }
                return true
            }
            default: {
                return false
            }
        }
    }
    
    def boolean hasString(Expression expression) {
        switch(expression) {
            Value: return expression instanceof StringValue
            ValuedObject: return compareTypes(expression, ValueType.STRING)
            ValuedObjectReference: return compareTypes(expression.lowermostReference.valuedObject, ValueType.STRING)
            OperatorExpression: {
                var skipFirst = expression.operator == OperatorType.CONDITIONAL
                for (subExpression : expression.subExpressions) {
                    if (!skipFirst) {
                        if (subExpression.hasString) return true
                    } else {
                        skipFirst = false
                    }
                }
                return false
            }
            default: {
                return false
            }
        }
    }
    
    def compareTypes(ValuedObject valuedObject, ValueType type) {
        valuedObject.type == type
    }
    
    def getValueType(Value value) {
        if (value.isBool) {
            return ValueType.BOOL
        } else if (value.isInt) {
            return ValueType.INT
        } else if (value.isFloat) {
            return ValueType.FLOAT
        } else {
            return ValueType.UNKNOWN
        }
    }
    
}