/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.lustre.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.CombineOperator
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import java.util.ArrayList
import java.util.Stack

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * @author lgr
 *
 */
class LustreTransformationExtension {
    
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    
    /*
     * -----------------------------------------------------------------
     * Extension method for the conversion Lustre -> KExpressions
     * -----------------------------------------------------------------
     */
    def createFollowedByExpression(Stack<Expression> subExpressionList) {
        // x fby y <=> x -> pre(y)
        var bExpression = subExpressionList.pop
        while(!subExpressionList.isEmpty) {
            bExpression = createPreCascadedExpression(bExpression)
            var aExpression = createOperatorExpression(OperatorType.FBY)
            aExpression.subExpressions += subExpressionList.pop
            aExpression.subExpressions += bExpression
            bExpression = aExpression
        }

        return bExpression as OperatorExpression
    }

    def createImpliesExpression(Stack<Expression> subExpressionList) {
        // A => B  <=>  !A or B
        var rightExpression = subExpressionList.pop
        var leftExpression = subExpressionList.pop

        leftExpression = leftExpression.createNotExpression
        var convertedExpression = createLogicalOrExpression(leftExpression, rightExpression)

        while (subExpressionList.length > 0) {
            rightExpression = convertedExpression
            leftExpression = subExpressionList.pop.createNotExpression
            convertedExpression = createLogicalOrExpression(leftExpression, rightExpression)
        }

        return convertedExpression
    }

    def createInitExpression(Stack<Expression> subExpressionList) {
        // x -> y <=> x fby y (in sccharts)
        var convertedExpression = createOperatorExpression(OperatorType.FBY)
        convertedExpression.subExpressions += subExpressionList

        return convertedExpression
    }

    def createIntDivExpression(Stack<Expression> subExpressionList) {
        // Division depends on type in sccharts
        var convertedExpression = createOperatorExpression(OperatorType.DIV)
        convertedExpression.subExpressions += subExpressionList

        return convertedExpression
    }

    def createXorExpression(Stack<Expression> subExpressionList) {
        // A xor B <=> A && !B || !A && B
        var Expression bExpression
        var Expression aExpression
        var Expression notBExpression
        var Expression notAExpression
        var Expression leftOrExpression
        var Expression rightOrExpression

        var tempExpression = subExpressionList.pop

        do {
            bExpression = tempExpression
            aExpression = subExpressionList.pop

            notBExpression = createNotExpression(bExpression.copy)
            notAExpression = createNotExpression(aExpression.copy)

            leftOrExpression = createLogicalAndExpression(aExpression, notBExpression)
            rightOrExpression = createLogicalAndExpression(notAExpression, bExpression)

            tempExpression = createLogicalOrExpression(leftOrExpression, rightOrExpression)
        } while (subExpressionList.length > 0);

        var convertedExpression = tempExpression as OperatorExpression

        return convertedExpression
    }

    def createPreCascadedExpression(Expression subExpression) {
        var kExpression = subExpression

        kExpression = cascadePre(kExpression)

        return kExpression as OperatorExpression
    }

    private def Expression cascadePre(Expression kExpression) {
        if (kExpression instanceof OperatorExpression) {

            val subExpressionList = new ArrayList<Expression>
            for (var i = 0; i < kExpression.subExpressions.length; i++) {
                var kSubExpression = kExpression.subExpressions.get(i)
                var convertedKSubExpression = kSubExpression.cascadePre
                subExpressionList.add(convertedKSubExpression)
            }

            return createOperatorExpression => [
                operator = kExpression.operator
                subExpressions.addAll(subExpressionList)
            ]

        } else if (kExpression instanceof ValuedObjectReference) {
            var preExpression = createPreExpression
            var valObj = kExpression.valuedObject
            preExpression.subExpressions += valObj.reference
            return preExpression
        } else {
            return kExpression
        }
    }

    def createNorExpression(Stack<Expression> subExpressionList) {
        // nor(A, B, C) <=> !and(A, B, C)
        var aExpression = subExpressionList.pop

        while (!subExpressionList.isEmpty) {
            var bExpression = subExpressionList.pop
            aExpression = createLogicalAndExpression(aExpression, bExpression)
        }

        return createNotExpression(aExpression)
    }

    // Only needed for signal approach
    def makeSignalFromVariableDeclaration(VariableDeclaration variableDeclaration, boolean useSignal) {
        if (useSignal) {
            if (variableDeclaration.valuedObjects.length != 1) {
                throw new UnsupportedOperationException(
                    "Cannot transform clock expressions with multiple valued objects.")
            }
            variableDeclaration.signal = true;
            switch (variableDeclaration.type) {
                case BOOL: {
                    variableDeclaration.valuedObjects.head.combineOperator = CombineOperator.OR
                }
                case FLOAT,
                case INT: {
                    variableDeclaration.valuedObjects.head.combineOperator = CombineOperator.ADD
                }
                default: {
                }
            }
        }
    }
}