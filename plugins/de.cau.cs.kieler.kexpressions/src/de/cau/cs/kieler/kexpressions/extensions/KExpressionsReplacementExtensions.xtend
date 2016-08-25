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
package de.cau.cs.kieler.core.kexpressions.extensions

import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import org.eclipse.emf.ecore.EObject

/**
 * @author ssm
 * @kieler.design 2015-08-19 proposed 
 * @kieler.rating 2015-08-19 proposed yellow
 */
class KExpressionsReplacementExtensions {
    
        // In an EObject replace one expression by another
    def void replace(EObject eObject, Expression searchExpression, Expression replaceExpression) {
        for (Expression expression : eObject.eAllContents.filter(typeof(Expression)).toList) {
            expression.replace(searchExpression, replaceExpression)
        }
    }

    // In an Expression replace one expression by another
    def Expression replace(Expression expression, Expression searchExpression, Expression replaceExpression) {
        if (expression == searchExpression) {
            return replaceExpression
        } else if (searchExpression instanceof OperatorExpression) {
            val operatorExpression = searchExpression as OperatorExpression
            for (Expression subExpression : operatorExpression.subExpressions) {
                subExpression.replace(searchExpression, replaceExpression)
            }
        }
        expression
    }
    
    // In an Expression replace one expression by another
    def Expression replace(Expression expression, ValuedObject valuedObject, Expression replaceExpression) {
        if (expression instanceof ValuedObjectReference) {
            if ((expression as ValuedObjectReference).valuedObject == valuedObject) {
                return replaceExpression
            }
        } else if (expression instanceof OperatorExpression) {
            val operatorExpression = expression as OperatorExpression
            for (Expression subExpression : operatorExpression.subExpressions) {
                subExpression.replace(valuedObject, replaceExpression)
            }
        }
        expression
    }    
    
    
}