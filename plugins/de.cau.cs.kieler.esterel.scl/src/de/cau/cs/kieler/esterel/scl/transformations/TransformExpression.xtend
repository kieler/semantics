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
package de.cau.cs.kieler.esterel.scl.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.esterel.esterel.ConstantExpression
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.esterel.FunctionExpression
import de.cau.cs.kieler.esterel.kexpressions.BooleanValue
import de.cau.cs.kieler.esterel.kexpressions.CombineOperator
import de.cau.cs.kieler.esterel.kexpressions.ComplexExpression
import de.cau.cs.kieler.esterel.kexpressions.Expression
import de.cau.cs.kieler.esterel.kexpressions.IntValue
import de.cau.cs.kieler.esterel.kexpressions.OperatorExpression
import de.cau.cs.kieler.esterel.kexpressions.ValuedObjectReference
import javax.xml.transform.TransformerException
import de.cau.cs.kieler.esterel.esterel.TrapExpression
import de.cau.cs.kieler.esterel.kexpressions.FloatValue

/**
 * Transforms Esterels KExpressions to core KExpressions. This is necessary as the Esterel meta-model
 * relies on an old version of the KExpressions and provides more elements, such as signals. Basic
 * concepts are the same, thus, many transformation methods are straightforward. Basically, by calling
 * {@link #transformExp(Expression expression) transformExp} an Esterel expression can be transformed.
 * The specific method for the acutal expression is called via the dispatched mechanism of Xtend.
 * 
 * @author krat
 * @kieler.rating yellow 2015-03-14 review KI-63 by ssm, ima, cmot
 */
class TransformExpression {

    @Inject
    extension KExpressionsExtension

    @Inject
    extension EsterelToSclExtensions

    @Inject
    extension EsterelToSclTransformation

    /**
     * Transforms Esterel Operator Expression to KExpression Operator Expression.
     * 
     * @param operatorExpression The Esterel OperatorExpression to transform
     * @return The corresponding SCL OperatorExpression
     */
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExpression(OperatorExpression operatorExpression) {
        val operatorType = OperatorType::getByName(operatorExpression.operator.getName())

        // ? Operator: Return variable holding the value
        if (operatorType == OperatorType::VAL) {
            val signal = signalToVariableMap.findLast [
                (operatorExpression.subExpressions.head as ValuedObjectReference).valuedObject.name == it.key
            ].value
            return createValuedObjectReference(signalToValueMap.get(signal))
        }

        KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = operatorType
            if (!operatorExpression.subExpressions.nullOrEmpty) {
                for (subExp : operatorExpression.subExpressions) {
                    subExpressions.add(transformExpression(subExp))
                }
            } else {
                // FIXME: Special case for synchronous tick
                transformExpression(null); 
            }
        ]
    }

    /**
     * Translates Esterel CombineOperator to KExpressions CombineOperator.
     * 
     * @param combineOperator The Esterel combine operator to translate
     * @return The corresponding SCL combine operator
     */
    def de.cau.cs.kieler.core.kexpressions.CombineOperator transformCombineOperator(CombineOperator combineOperator) {
        return de.cau.cs.kieler.core.kexpressions.CombineOperator::get(combineOperator.toString)
    }

    /**
	 * Transforms an Esterel ComplexExpression. This should either be an OperatorExpression 
	 * (catched above) or a ValuedObjectReference.
	 * 
	 * @param complexExpression The Esterel complex expression to transform
	 * @return The corresponding ValuedObjectReference
	 */
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExpression(ComplexExpression complexExpression) {
        if (complexExpression instanceof ValuedObjectReference) {
            transformExpression(complexExpression as ValuedObjectReference)
        } else {
            throw new TransformerException("Unhandled ComplexExpressions " + complexExpression)
        }
    }

    /**
	 * Transforms ValuedObjectReferences
	 * 
	 * @param valuedObjectReference The Esterel ValuedObjectReference to transform
	 * @return The corresponding KExpressions ValuedObjectReference
	 */
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExpression(
        ValuedObjectReference valuedObjectReference) {
        getValuedObjectReferenceByName(valuedObjectReference.valuedObject.name)
    }

    /**
     * Transforms TrapExpressions
     * 
     * @param valuedObjectReference The Esterel ValuedObjectReference to transform
     * @return The corresponding KExpressions ValuedObjectReference
     */
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExpression(TrapExpression trapExpression) {
        valuedExitVariables.get(trapExpression.trap).createValuedObjectReference
    }

    /**
	 * Transforms an Expression given as String with additional information for its type.
	 * 
	 * @param expression The Esterel expression as a String
	 * @param type The type of the expression
	 * @return The corresponding KExressions expression
	 */
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(String expression, String type) {
        val esterelExpression = EsterelFactory::eINSTANCE.createConstantExpression => [
            value = expression
        ]

        esterelExpression.transformExp(type)
    }

    /**
	 * Transforms an expression with additional given String indicating the type. This is mainly for 
	 * the case of ConstantExpressions which are parsed as Strings such that the type
	 * is only given by its context.
	 * 
	 * @param expression The Esterel expression to transform
	 * @param type The type of the expression
	 * @return The corresponding KExpressions expression
	 */
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(Expression expression, String type) {

        // If it is no ConstantExpression, it can be transformed without additional type information
        if (!(expression instanceof ConstantExpression)) {
            return expression.transformExpression
        }

        val constantExpression = expression as ConstantExpression
        switch type {
            case ("int"):
                if (Integer.parseInt(constantExpression.value) >= 0) {
                    return createIntValue(Integer.parseInt(constantExpression.value))

                } else {
                    return createOperatorExpression(OperatorType::SUB) => [
                        subExpressions += createIntValue(-Integer.parseInt(constantExpression.value))
                    ]
                }
            case ("bool"):
                return KExpressionsFactory::eINSTANCE.createBoolValue => [
                    value = Boolean.parseBoolean(constantExpression.value)
                ]
            case ("float"):
                return KExpressionsFactory::eINSTANCE.createFloatValue => [
                    value = Float.parseFloat(constantExpression.value)
                ]
            //No double in SCL, float is used instead
            case ("double"):
                return KExpressionsFactory::eINSTANCE.createFloatValue => [
                    value = Float.parseFloat(constantExpression.value)
                ]
            //No Unsigned in SCL, integer is used instead
            case ("unsigned"):
                return KExpressionsFactory::eINSTANCE.createIntValue => [
                    value = Integer.parseInt(constantExpression.value)
                ]
            //String was added recently to SCL, but code generation does not support it yet
            case ("string"):
                return KExpressionsFactory::eINSTANCE.createTextExpression => [
                    text = "'" + constantExpression.value + "'"
                ]
            case ("host"):
                return KExpressionsFactory::eINSTANCE.createTextExpression => [
                    text = "'" + constantExpression.value + "'"
                ]
            default:
                if (signalToVariableMap.findLast[key == constantExpression.value] != null) {
                    return signalToVariableMap.findLast[key == constantExpression.value].value.
                        createValuedObjectReference
                } else {
                    throw new IllegalArgumentException("Unknown datatype: " + type)
                }
        }
    }

    /**
	 * Transforms BooleanValue
	 * 
	 * @param booleanValue The Esterel boolean value
	 * @return The corresponding KExpressions boolean value
	 */
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExpression(BooleanValue booleanValue) {
        return createBoolValue(booleanValue.value)
    }

    /**
     * Transforms integer values
     * 
     * @param intValue The Esterel integer value
     * @return The corresponding KExpressions integer value
     */
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExpression(IntValue intValue) {
        if (intValue.value < 0)
            return KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                operator = OperatorType::SUB
                subExpressions += createIntValue(intValue.value * -1)
            ]
        return createIntValue(intValue.value)
    }

    /**
     * Transforms gloat values
     * 
     * @param floatValue The Esterel float value
     * @return The corresponding KExpressions integer value
     */
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExpression(FloatValue floatValue) {
        if (floatValue.value < 0)
            return KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                operator = OperatorType::SUB
                subExpressions += createFloatValue(floatValue.value * -1)
            ]
        return createFloatValue(floatValue.value)
    }

    /**
	 * Transforms FunctionExpressions
	 * 
	 * @param functionExpression The function expression to transform
	 * @return The corresponding KExpressions FunctionCall
	 */
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExpression(FunctionExpression functionExpression) {
        val functionCall = KExpressionsFactory::eINSTANCE.createFunctionCall
        functionCall.functionName = functionExpression.function.name
        var typeIndex = 0 // Index of the current variable to get its type
        for (expression : functionExpression.kexpressions) {
            val type = functionExpression.function.idList.get(typeIndex).type.toString
            functionCall.parameters.add(
                KExpressionsFactory::eINSTANCE.createParameter => [
                    expression = expression.transformExp(type)
                ]
            )
            typeIndex = typeIndex + 1
        }

        functionCall
    }

    /**
     * When there is no expression given, for the Esterel meta-model this means a tick.
     * 
     * @param operatorExpression The Esterel null expression to transform
     * @return The corresponding SCL OperatorExpression
     */
    def dispatch transformExpression(Void nullExpression) {
        synchronousTick.createValuedObjectReference
    }
}
