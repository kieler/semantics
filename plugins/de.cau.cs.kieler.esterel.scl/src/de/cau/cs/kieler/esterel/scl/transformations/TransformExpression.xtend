/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
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

/**
 * Transforms Esterels KExpressions to core KExpressions
 * 
 * @author krat
 * @kieler.rating proposed yellow 2015-02-09 krat
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
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(OperatorExpression operatorExpression) {
        val operatorType = OperatorType::getByName(operatorExpression.operator.getName())

        // ? Operator: Return variable holding the value
        if (operatorType == OperatorType::VAL) {
            val signal = signalToVariableMap.findLast [
                (operatorExpression.subExpressions.head as ValuedObjectReference).valuedObject.name == it.key
            ].value
            return createValObjRef(signalToValueMap.get(signal))
        }
        
        KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = operatorType
            for (subExp : operatorExpression.subExpressions) {
                subExpressions.add(transformExp(subExp))
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
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(ComplexExpression complexExpression) {
        if (complexExpression instanceof ValuedObjectReference) {
            transformExp(complexExpression as ValuedObjectReference)
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
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(ValuedObjectReference valuedObjectReference) {
        getValuedObjectReferenceByName(valuedObjectReference.valuedObject.name)
    }
    
    /**
     * Transforms TrapExpressions
     * 
     * @param valuedObjectReference The Esterel ValuedObjectReference to transform
     * @return The corresponding KExpressions ValuedObjectReference
     */
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(TrapExpression trapExpression) {
        valuedExitVariables.get(trapExpression.trap).createValObjRef
    }

	/**
	 * Transforms an Expression given as String with additional information for its type.
	 * 
	 * @param expression The Esterel expression as a String
	 * @param type The type of the expression
	 * @return The corresponding KExressions expression
	 */
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(String exp, String type) {
        val esterelExp = EsterelFactory::eINSTANCE.createConstantExpression => [
            value = exp
        ]

        esterelExp.transformExp(type)
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
            return expression.transformExp
        }

        val constantExpression = expression as ConstantExpression
        switch type {
            case ("int"):
                return KExpressionsFactory::eINSTANCE.createIntValue => [
                    value = Integer.parseInt(constantExpression.value)
                ]
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
                if (signalToVariableMap.findLast[ key == constantExpression.value ] != null) {
                    return signalToVariableMap.findLast[ key == constantExpression.value ].value.createValObjRef
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
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(BooleanValue booleanValue) {
        return createBoolValue(booleanValue.value)
    }

	/**
     * Transforms integer values
     * 
     * @param intValue The Esterel integer value
     * @return The corresponding KExpressions integer value
     */
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(IntValue intValue) {
        if (intValue.value < 0)
            return KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                operator = OperatorType::SUB
                subExpressions += createIntValue(intValue.value * -1)
            ]
        return createIntValue(intValue.value)
    }

	/**
	 * Transforms FunctionExpressions
	 * 
	 * @param functionExpression The function expression to transform
	 * @return The corresponding KExpressions FunctionCall
	 */
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(FunctionExpression functionExpression) {
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
}
