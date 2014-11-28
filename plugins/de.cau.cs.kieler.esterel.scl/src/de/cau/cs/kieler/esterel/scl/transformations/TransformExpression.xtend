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

/**
 * @author krat
 *
 */
class TransformExpression {

    @Inject
    extension KExpressionsExtension

    @Inject
    extension EsterelToSclExtensions

    /*
     * Transforms an esterel.kexpression.Expression to core.kexpression.Expression
     * @param exp The Esterel expression to be transformed
     * @param variables List of ValuedObject in scope
     * @return The transformed KExpressions Expression
     */
    def transformExp(Expression exp,
        LinkedList<Pair<String, ValuedObject>> variables) {
        if (exp instanceof OperatorExpression) {
            System.out.println("transformExp: OperatorExpression")
            return transformOperatorExp(exp as OperatorExpression, variables)
        } else if (exp instanceof ValuedObjectReference) {
            System.out.println("transformExp: ValuedObjectReference")
            return transformValObjRef(exp as ValuedObjectReference, variables)
        } else if (exp instanceof ConstantExpression) {
            System.out.println("transformExp: ConstantExpression")

            // TODO: Does not have to be bool
            return transformConstExp(exp, "bool")
        } else if (exp instanceof BooleanValue) {
            return KExpressionsFactory::eINSTANCE.createBoolValue => [
                value = (exp as BooleanValue).value
            ]
        }

        System.out.println("transformExp: Unknown Expression: " + exp)
        createExpression
    }

    def de.cau.cs.kieler.core.kexpressions.OperatorExpression transformOperatorExp(OperatorExpression exp,
        LinkedList<Pair<String, ValuedObject>> variables) {

        //TODO beautify; complete
        val opType = switch exp.operator {
            case de.cau.cs.kieler.esterel.kexpressions.OperatorType::NOT: OperatorType::NOT
            case de.cau.cs.kieler.esterel.kexpressions.OperatorType::AND: OperatorType::AND
            case de.cau.cs.kieler.esterel.kexpressions.OperatorType::OR: OperatorType::OR
        }
        System.out.println("exptype :" + opType)
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

    def de.cau.cs.kieler.core.kexpressions.ValuedObjectReference transformCompExp(ComplexExpression comp,
        LinkedList<Pair<String, ValuedObject>> variables) {
        if (comp instanceof ValuedObjectReference) {
            transformValObjRef(comp as ValuedObjectReference, variables)
        }
    }

    def de.cau.cs.kieler.core.kexpressions.ValuedObjectReference transformValObjRef(ValuedObjectReference ref,
        LinkedList<Pair<String, ValuedObject>> variables) {
        getValuedObjectRef(variables, ref.valuedObject.name)
    }

    // TODO Kind of ugly as type is not stored explicitly
    def dispatch transformConstExp(ConstantExpression constExp, String type) {
        System.out.println("Value: " + constExp.value)
        System.out.println("type: " + type)
        System.out.println("As integer: " + Integer.getInteger(constExp.value))

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
                //TODO string
            default:
                System.out.println("Unable to transform constant expression: " + constExp.value)
        }
    }
    
    def dispatch transformConstExp(BooleanValue b, String type) {
        return KExpressionsFactory::eINSTANCE.createBoolValue => [
                    value = b.value
                ]
    }
}
