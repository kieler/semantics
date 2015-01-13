/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
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

/**
 * @author krat
 *
 */
class TransformExpression {

    @Inject
    extension KExpressionsExtension

    @Inject
    extension EsterelToSclExtensions

    @Inject
    extension EsterelToSclTransformation

    /*
     * Transforms Esterel Operator Expression to KExpression Operator Expression
     */
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(OperatorExpression exp) {
        val opType = OperatorType::getByName(exp.operator.name)

        // ? Operator: Return variable holding the value
        if (opType == OperatorType::VAL) {
            val sig = signalMap.findLast [
                (exp.subExpressions.head as ValuedObjectReference).valuedObject.name == it.key
            ].value
            val sig_val = valuedMap.get(sig)
            return createValObjRef(sig_val)
        }
        
        KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = opType
            for (subExp : exp.subExpressions) {
                subExpressions.add(transformExp(subExp))
            }
        ]
    }

    /*
     * Translates Esterel CombineOperator to KExpressions Operator
     */
    def de.cau.cs.kieler.core.kexpressions.CombineOperator transformCombineOperator(CombineOperator op) {
        return de.cau.cs.kieler.core.kexpressions.CombineOperator::get(op.toString)
    }

    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(ComplexExpression comp) {
        if (comp instanceof ValuedObjectReference) {
            transformExp(comp as ValuedObjectReference)
        }
    }

    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(ValuedObjectReference ref) {
        getValuedObjectRef(ref.valuedObject.name)
    }

    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(String exp, String type) {
        val esterelExp = EsterelFactory::eINSTANCE.createConstantExpression => [
            value = exp
        ]

        esterelExp.transformExp(type)
    }

    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(Expression exp, String type) {
        
        if (!(exp instanceof ConstantExpression)) {
            return exp.transformExp
        }

        val constExp = exp as ConstantExpression
        switch type {
            case ("int"):
                return KExpressionsFactory::eINSTANCE.createIntValue => [
                    value = Integer.parseInt(constExp.value)
                ]
            case ("bool"):
                return KExpressionsFactory::eINSTANCE.createBoolValue => [
                    value = Boolean.parseBoolean(constExp.value)
                ]
            case ("float"):
                return KExpressionsFactory::eINSTANCE.createFloatValue => [
                    value = Float.parseFloat(constExp.value)
                ]
            //No double in SCL...
            case ("double"):
                return KExpressionsFactory::eINSTANCE.createFloatValue => [
                    value = Float.parseFloat(constExp.value)
                ]
            //No Unsigned in SCL...
            case ("unsigned"):
                return KExpressionsFactory::eINSTANCE.createIntValue => [
                    value = Integer.parseInt(constExp.value)
                ]
            case ("string"):
                return KExpressionsFactory::eINSTANCE.createTextExpression => [
                    text = "'" + constExp.value + "'"
                ]
            case ("host"):
                return KExpressionsFactory::eINSTANCE.createTextExpression => [
                    text = "'" + constExp.value + "'"
                ]
            default:
                throw new IllegalArgumentException("Unknown datatype: " + type)
        }
    }

//    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(BooleanValue b, String type) {
//        return KExpressionsFactory::eINSTANCE.createBoolValue => [
//            value = b.value
//        ]
//    }
//
//    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(BooleanValue b, boolean bool) {
//        return KExpressionsFactory::eINSTANCE.createBoolValue => [
//            value = bool
//        ]
//    }

    //TODO other values
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(BooleanValue boolVal) {
        return createBoolValue(boolVal.value)
    }

    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(IntValue intVal) {
        if (intVal.value < 0)
            return KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                operator = OperatorType::SUB
                subExpressions += createIntValue(intVal.value * -1)
            ]
        return createIntValue(intVal.value)
    }


    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(FunctionExpression funcExp) {
        val res = KExpressionsFactory::eINSTANCE.createFunctionCall
        res.functionName = funcExp.function.name
        var i = 0
        for (exp : funcExp.kexpressions) {
            val type = funcExp.function.idList.get(i).type.toString
            res.parameters.add(
                KExpressionsFactory::eINSTANCE.createParameter => [
                        expression = exp.transformExp(type)
                ]
            )
            i = i + 1
        }

        res
    }
}
