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

/**
 * @author krat
 *
 */
class TransformExpression {
    
    @Inject
    extension KExpressionsExtension
    
    @Inject
    extension EsterelToSclExtensions
    
    
    def de.cau.cs.kieler.core.kexpressions.Expression transformExp(Expression exp, LinkedList<ValuedObject> variables) {
        if (exp instanceof OperatorExpression) {
            System.out.println("transformExp: OperatorExpression")
            return transformOperatorExp(exp as OperatorExpression, variables)
        } else if (exp instanceof ValuedObjectReference) {
            System.out.println("transformExp: ValuedObjectReference")
            return transformValObjRef(exp as ValuedObjectReference, variables)
        } else if (exp instanceof ConstantExpression) {
            System.out.println("transformExp: ConstantExpression")
            return transformConstExp(exp as ConstantExpression)
        }

        System.out.println("transformExp: Unknown Expression: " + exp)
        createExpression
    }

    def de.cau.cs.kieler.core.kexpressions.OperatorExpression transformOperatorExp(OperatorExpression exp, LinkedList<ValuedObject> variables) {

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

    def de.cau.cs.kieler.core.kexpressions.ValuedObjectReference transformCompExp(ComplexExpression comp, LinkedList<ValuedObject> variables) {
        if (comp instanceof ValuedObjectReference) {
            transformValObjRef(comp as ValuedObjectReference, variables)
        }
    }

    def de.cau.cs.kieler.core.kexpressions.ValuedObjectReference transformValObjRef(ValuedObjectReference ref, LinkedList<ValuedObject> variables) {
        getValuedObjectRef(variables, ref.valuedObject.name)
    }

    // TODO Expression is considered being an integer...
    def transformConstExp(ConstantExpression constExp) {
        System.out.println("Value: " + constExp.value)
        System.out.println("As integer: " + Integer.getInteger(constExp.value))
        return KExpressionsFactory::eINSTANCE.createIntValue => [
            value = Integer.parseInt(constExp.value)
        ]
    }
}