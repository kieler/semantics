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
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.StringValue
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

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
    @Accessors var boolean compute = false
    
    // -- Vars --
    
    protected val Map<ValuedObject, Value> values
    
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
        var Expression parEval = expression?.eval
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
    
    static def boolean isThruthy(Value value) {
        return switch(value) {
            BoolValue: value.value
            IntValue: value.value != 0
            FloatValue: value.value != 0
            DoubleValue: value.value != 0
            StringValue: !value.value.nullOrEmpty
            default: throw new UnsupportedOperationException("Cannot determine truth value for value type " + value.class.simpleName)
        }
    }
    
    static def boolean isFalsy(Value value) {
        return !value.isThruthy
    }
    
    // ------------------------------------
    // EVAL
    // ------------------------------------
    
    protected dispatch def Expression eval(ValuedObjectReference vor) {
        if (vor.indices.nullOrEmpty && vor.subReference == null) { // Cannot handle valued object references with indices or sub-references
            if (values.containsKey(vor.valuedObject)) {
                return values.get(vor.valuedObject)
            }
        }
        return if (inplace) vor else vor.copy//valuedObject.reference
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
            // COMPARISON & CALCULATION
            case EQ,
            case GEQ,
            case GT,
            case LEQ,
            case LT,
            case NE,
            case ADD,
            case BITWISE_AND,
            case BITWISE_OR,
            case BITWISE_XOR,
            case DIV,
            case MOD,
            case MULT,
            case SHIFT_LEFT,
            case SHIFT_RIGHT,
            case SHIFT_RIGHT_UNSIGNED,
            case SUB: {
                for (parEval : op.subExpressions.map[eval]) {
                    newOp.subExpressions += parEval
                }
                if (newOp.subExpressions.forall[it instanceof Value]) { // No partial computation
                    if (op.operator == OperatorType.SUB && newOp.subExpressions.size == 1 && newOp.subExpressions.head instanceof IntValue) {
                        // TODO This might become a problem
                        return createIntValue(0 - (newOp.subExpressions.head as IntValue).value)
                    } else if (compute && newOp.subExpressions.size > 1) {
                        return newOp.compute
                    }
                }
                return newOp
            }
            case BITWISE_NOT: {
                val parEval = op.subExpressions.head.eval
                if (parEval instanceof BoolValue) {
                    return createBoolValue(parEval.isFalsy)
                } else if (parEval instanceof IntValue && compute) {
                    return createIntValue((parEval as IntValue).value.bitwiseNot)
                } else {
                    return parEval
                }
            }
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
    
    protected dispatch def Expression eval(Value value) {
        return if (inplace) value else value.copy
    }
    
    // Fallback
    protected dispatch def Expression eval(Expression exp) {
        return if (inplace) exp else exp.copy
    }
    
    // ------------------------------------
    // Compute
    // ------------------------------------
    
    def Expression compute(OperatorExpression oexp) {
        if (oexp.operator == OperatorType.DIV) { // Division might loose precision because of mission type system in KExpressions
            return oexp
        }
        if (oexp.subExpressions.size > 2) {
            // FIXME support!
            return oexp
        }
        // Only compute integer/bool
        if (oexp.subExpressions.forall[it instanceof IntValue || it instanceof BoolValue]) {
            val sub0 = oexp.subExpressions.get(0) as Value
            val op0 = if (sub0 instanceof IntValue) {
                sub0.value
            } else if (sub0.isThruthy) {
                1
            } else {
                0
            }
            val sub1 = oexp.subExpressions.get(1) as Value
            val op1 = if (sub1 instanceof IntValue) {
                sub1.value
            } else if (sub0.isThruthy) {
                1
            } else {
                0
            }
            
            return switch (oexp.operator) {
                // COMPARISON
                case EQ: createBoolValue(op0 == op1)
                case GEQ: createBoolValue(op0 >= op1)
                case GT: createBoolValue(op0 > op1)
                case LEQ: createBoolValue(op0 <= op1)
                case LT: createBoolValue(op0 < op1)
                case NE: createBoolValue(op0 != op1)
                // CALCULATION
                case ADD: createIntValue(op0 + op1)
                case BITWISE_AND: createIntValue(op0.bitwiseAnd(op1))
                case BITWISE_OR: createIntValue(op0.bitwiseAnd(op1))
                case BITWISE_XOR: createIntValue(op0.bitwiseAnd(op1))
                case MOD: createIntValue(op0 % op1)
                case MULT: createIntValue(op0 * op1)
                case SHIFT_LEFT: createIntValue(op0.bitwiseAnd(op1))
                case SHIFT_RIGHT: createIntValue(op0.bitwiseAnd(op1))
                case SHIFT_RIGHT_UNSIGNED: createIntValue(op0.bitwiseAnd(op1))
                case SUB: createIntValue(op0 - op1)
                default: oexp
            }
        }
        return oexp
    }
}