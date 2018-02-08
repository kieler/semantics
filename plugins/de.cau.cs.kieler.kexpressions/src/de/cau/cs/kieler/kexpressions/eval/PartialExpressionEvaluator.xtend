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

import com.google.inject.Guice
import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.DoubleValue
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.StringValue
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class PartialExpressionEvaluator {
    
    @Inject Injector injector
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsCompareExtensions
    @Inject extension KEffectsExtensions
    @Inject extension AnnotationsExtensions
    
    // -- Config --
    
    @Accessors var boolean inplace = false
//    @Accessors var boolean compute = false
    
    // -- Vars --
    
    val Map<ValuedObject, Value> values
    
    new() {
        this(emptyMap)
    }
    
    new(Map<ValuedObject, Value> values) {
        if (injector === null) {
            injector = Guice.createInjector
            injector.injectMembers(this)
        }
        this.values = values
    }
    
    def Expression evaluate(Expression expression) {
        val parEval = //if (compute) {
//            synchronized (this) {
//                // Java JShell requires 1.9
//                throw new UnsupportedOperationException("Not yet implemented")
//            }
//        } else {
            expression?.eval
//        }

        if (parEval !== null) {
            return parEval
        } else if (inplace) {
            return expression
        } else {
            return expression.copy
        }
    }
    
    // ------------------------------------
    // General HELPER
    // ------------------------------------
    
    def boolean isThruthy(Value value) {
        return switch(value) {
            BoolValue: value.value
            IntValue: value.value != 0
            FloatValue: value.value != 0
            DoubleValue: value.value != 0
            StringValue: !value.value.nullOrEmpty
            default: throw new UnsupportedOperationException("Cannot determine truth value for value type " + value.class.simpleName)
        }
    }
    
    def boolean isFalsy(Value value) {
        return !value.isThruthy
    }
    
    // ------------------------------------
    // EVAL
    // ------------------------------------
    
    protected dispatch def Expression eval(ValuedObjectReference vor) {
        if (!vor.indices.nullOrEmpty || vor.subReference !== null) {
            throw new UnsupportedOperationException("Cannot handle valued object references with indices or sub-references")
        }
        if (values.containsKey(vor.valuedObject)) {
            return values.get(vor.valuedObject)
        }
        return if (inplace) vor else vor.valuedObject.reference
    }
    
    protected dispatch def Expression eval(OperatorExpression op) {
        val newOp = createOperatorExpression(op.operator)
        switch (op.operator) {
            // BOOLEAN LOGIC
            case LOGICAL_AND: {
                for (parEval : op.subExpressions.map[eval].filterNull) {
                    if (parEval instanceof Value) {
                        if (parEval.isFalsy) {
                            return createBoolValue(false) 
                        }
                        // skip operand
                    } else if (!newOp.subExpressions.exists[equals2(parEval)]) { // add only if unique operant
                        newOp.subExpressions += parEval
                    }
                }
                switch (newOp.subExpressions.size) {
                    case 0: return createBoolValue(true)
                    case 1: return newOp.subExpressions.head
                    default: return newOp
                }
            }
            case LOGICAL_OR: {
                for (parEval : op.subExpressions.map[eval].filterNull) {
                    if (parEval instanceof Value) {
                        if (parEval.isThruthy) {
                            return createBoolValue(true) 
                        }
                        // skip operand
                    } else if (!newOp.subExpressions.exists[equals2(parEval)]) { // add only if unique operant
                        newOp.subExpressions += parEval
                    }
                }
                switch (newOp.subExpressions.size) {
                    case 0: return createBoolValue(false)
                    case 1: return newOp.subExpressions.head
                    default: return newOp
                }
            }
            case NOT: {
                val parEval = op.subExpressions.head.eval
                if (parEval instanceof Value) {
                    return createBoolValue(parEval.isFalsy)
                } else {
                    return parEval
                }
            }
            // COMPARISON
            // CALCULATION
            // SPECIAL
            case CONDITIONAL: {
                for (parEval : op.subExpressions.map[eval]) {
                    newOp.subExpressions += parEval
                }
                val cond = newOp.subExpressions.head
                if (cond instanceof Value) {
                    if (cond.isThruthy) {
                        return newOp.subExpressions.get(1) 
                    } else {
                        return newOp.subExpressions.get(2) 
                    }
                } else {
                    return newOp
                }
            }
            default: return if (inplace) op else op.copy // Not yet supported
        }
    }
    
    // Fallback
    protected dispatch def Expression eval(Expression exp) {
        return null // Not yet supported
    }
    
//    
//    protected def Expression compute(List<Value> values, OperatorType op) {
//        if (values.size == 0) {
//            throw new IllegalArgumentException("No values to compute")
//        } else if (values.size == 1) {
//            return values.head
//        }
//
//        val type = values.checkTypeForComputation(op)
//        val result = engine.eval(values.map[toValueString(type)].join(" " + op.literal + " "));
//        return switch(type) {
//            case BOOL: createBoolValue(result as Boolean)
//            case INT:
//            case LOAT:
//            case DOUBLE:
//            case STRING:
//            default: throw new IllegalStateException("Cannot occur")
//        }
//        return null // Not yet supported
//    }
//    
//    protected def ValueType checkTypeForComputation(List<Value> values, OperatorType op) {
//        if (values.size == 0) {
//            throw new IllegalArgumentException("No values to compute")
//        } else if (values.size == 1) {
//            return values.head.valueType
//        }
//        if (values.head instanceof StringValue) { // concat
//            return ValueType.STRING
//        } else if (op.name().startsWith("BITWISE")) { // bitwise
//            if (values.forall[valueType == ValueType.BOOL || valueType == ValueType.INT]) {
//                if (values.forall[valueType == ValueType.BOOL]) {
//                    return ValueType.BOOL
//                } else {
//                    return ValueType.INT
//                }
//            }
//        } else { // regular computation
//            val types = values.groupBy[valueType]
//            if (!(types.containsKey(ValueType.BOOL) || types.containsKey(ValueType.STRING))) { // only numbers
//                // select highest precision
//                if (types.containsKey(ValueType.DOUBLE)) {
//                    return ValueType.DOUBLE
//                } else if (types.containsKey(ValueType.FLOAT)) {
//                    return ValueType.FLOAT
//                } else if (types.containsKey(ValueType.INT)) {
//                    return ValueType.INT
//                }
//            }
//        }
//        throw new IllegalArgumentException("Incompatible value types " + values.map[class].join(", ") + " for operation " + op.name())
//    }   
//    
//    protected def ValueType valueType(Value value) {
//        return switch(value) {
//            BoolValue: ValueType.BOOL
//            IntValue: ValueType.INT
//            FloatValue: ValueType.FLOAT
//            DoubleValue: ValueType.DOUBLE
//            StringValue: ValueType.STRING
//            default: throw new IllegalArgumentException("Unsupported value type: " + value.class)
//        }
//    }
//    
//    protected def String toValueString(Value value, ValueType targetType) {
//        return switch(value) {
//            BoolValue: {
//                if (targetType == ValueType.BOOL) {
//                    return value.value.toString
//                } else if (value.value) {
//                    return "1"
//                } else {
//                    return "0"
//                }
//            }
//            IntValue: value.value.toString
//            FloatValue: value.value.toString
//            DoubleValue: value.value.toString
//            StringValue: value.value
//            default: throw new IllegalArgumentException("Unsupported value type: " + value.class)
//        }
//    }      
    
}