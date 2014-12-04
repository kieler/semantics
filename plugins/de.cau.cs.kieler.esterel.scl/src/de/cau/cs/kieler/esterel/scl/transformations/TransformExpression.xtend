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

import de.cau.cs.kieler.esterel.kexpressions.Expression
import de.cau.cs.kieler.esterel.kexpressions.OperatorExpression
import de.cau.cs.kieler.esterel.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.esterel.esterel.ConstantExpression
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.esterel.kexpressions.ComplexExpression
import java.util.LinkedList
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.esterel.kexpressions.BooleanValue
import de.cau.cs.kieler.core.kexpressions.util.KExpressionsAdapterFactory
import de.cau.cs.kieler.esterel.kexpressions.ValueType
import de.cau.cs.kieler.esterel.kexpressions.CombineOperator
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.kexpressions.IntValue
import de.cau.cs.kieler.esterel.esterel.FunctionExpression

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

    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(OperatorExpression exp,
        LinkedList<Pair<String, ValuedObject>> variables) {

        val opType = OperatorType::getByName(exp.operator.name)

        // ? Operator: Return variable holding the value
        // TODO val working?
        if (opType == OperatorType::VAL) {
            val sig = variables.findLast [
                (exp.subExpressions.head as ValuedObjectReference).valuedObject.name == it.key
            ].value
            System.out.println("transformExp: OperatorExpression " + sig)
            val sig_val = valuedMap.get(sig)
            //TODO VAL is not translated right
//            return KExpressionsFactory::eINSTANCE.createOperatorExpression => [
//                operator = opType
//                subExpressions += createValuedObjectRef(sig_val)
//            ]
            return createValuedObjectRef(sig_val)
        }
        
        KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = opType
            for (subExp : exp.subExpressions) {
                subExpressions.add(transformExp(subExp, variables))
            }
        ]
    }

    /*
     * Translates esterel CombineOperator to KExpressions Operator
     */
    def de.cau.cs.kieler.core.kexpressions.CombineOperator transformCombineOperator(CombineOperator op) {
        return de.cau.cs.kieler.core.kexpressions.CombineOperator::get(op.toString)
    }

    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(ComplexExpression comp,
        LinkedList<Pair<String, ValuedObject>> variables) {
        if (comp instanceof ValuedObjectReference) {
            transformExp(comp as ValuedObjectReference, variables)
        }
    }

    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(ValuedObjectReference ref,
        LinkedList<Pair<String, ValuedObject>> variables) {
        getValuedObjectRef(variables, ref.valuedObject.name)
    }

    // Consider Strings as ConstantExpressions
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(String exp, String type) {
        val esterelExp = EsterelFactory::eINSTANCE.createConstantExpression => [
            value = exp
        ]

        esterelExp.transformExp(type)
    }

    // TODO Kind of ugly as type is not stored explicitly
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(ConstantExpression constExp, String type) {

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
            //TODO should be double...
            case ("double"):
                return KExpressionsFactory::eINSTANCE.createFloatValue => [
                    value = Float.parseFloat(constExp.value)
                ]
            //TODO should be unsigned...
            case ("unsigned"):
                return KExpressionsFactory::eINSTANCE.createIntValue => [
                    value = Integer.parseInt(constExp.value)
                ]
            case ("string"):
                return KExpressionsFactory::eINSTANCE.createTextExpression => [
                    text = "'" + constExp.value + "'"
                ]
            default:
                throw new IllegalArgumentException("Unknown datatype: " + type)
        }
    }

    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(BooleanValue b, String type) {
        return KExpressionsFactory::eINSTANCE.createBoolValue => [
            value = b.value
        ]
    }

    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(BooleanValue b, boolean bool) {
        return KExpressionsFactory::eINSTANCE.createBoolValue => [
            value = bool
        ]
    }

    //TODO other values
    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(BooleanValue boolVal,
        LinkedList<Pair<String, ValuedObject>> variables) {
        return createBoolValue(boolVal.value)
    }

    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(IntValue intVal,
        LinkedList<Pair<String, ValuedObject>> variables) {

        //TODO no negative INT values?
        if (intVal.value < 0)
            return KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                operator = OperatorType::SUB
                subExpressions += createIntValue(intVal.value * -1)
            ]
        return createIntValue(intVal.value)
    }

//    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(ConstantExpression constExp,
//        LinkedList<Pair<String, ValuedObject>> variables) {
//        return KExpressionsFactory::eINSTANCE.createTextExpression => [
//            text = constExp.value
//        ]
//    }

    def dispatch de.cau.cs.kieler.core.kexpressions.Expression transformExp(FunctionExpression funcExp,
        LinkedList<Pair<String, ValuedObject>> variables) {
        val res = KExpressionsFactory::eINSTANCE.createFunctionCall
        res.functionName = funcExp.function.name
        var i = 0
        for (exp : funcExp.kexpressions) {
            val type = funcExp.function.idList.get(i).type.toString
            res.parameters.add(
                KExpressionsFactory::eINSTANCE.createParameter => [
                    if (exp instanceof ConstantExpression) {
                        expression = exp.transformExp(type)
                    } else {
                        expression = exp.transformExp(variables)
                    }
                ]
            )
            i = i + 1

        }

        res
    }
}
