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
import java.util.HashMap
import java.util.Map
import com.google.inject.Guice
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
    @Inject extension KEffectsExtensions
    @Inject extension AnnotationsExtensions
    
    val Map<ValuedObject, Value> values
    
    new() {
        if (injector === null) {
            injector = Guice.createInjector
            injector.injectMembers(this)
        }
        this.values = emptyMap
    }
    
    new(HashMap<ValuedObject, Value> values) {
        this.values = values
    }
    
    def Expression evaluate(Expression expression) {
        val parEval = expression?.eval
        return if (parEval !== null) parEval else expression
    }
    
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
        return vor.valuedObject.reference
    }
    
    protected dispatch def Expression eval(OperatorExpression op) {
        val newOp = createOperatorExpression(op.operator)
        switch (op.operator) {
            case LOGICAL_AND: {
                for (parEval : op.subExpressions.map[eval].filterNull) {
                    if (parEval instanceof Value) {
                        if (parEval.isFalsy) {
                            return createBoolValue(false) 
                        }
                        // skip operand
                    } else {
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
                    } else {
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
                    return createBoolValue(parEval.isThruthy)
                } else {
                    return parEval
                }
            }
            default: return op.copy // Not yet supported
        }
    }
    
    // Fallback
    protected dispatch def Expression eval(Expression exp) {
        return null // Not yet supported
    }    
    
}