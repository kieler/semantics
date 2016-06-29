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

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.OperatorExpression

/**
 * @author ssm
 * @kieler.design 2015-08-19 proposed 
 * @kieler.rating 2015-08-19 proposed yellow
 */
class KExpressionsComplexCreateExtensions {
    
    @Inject
    extension KExpressionsCreateExtensions    
  
    // Create an AND Expression add expressionFirst and expressionSecond as a sub expression. 
    // If expressionFirst is null, just return expressionSecond.
    def Expression and(Expression first, Expression second) {
        if (first == null) {
            return second
        }
        createLogicalAndExpression(first, second)
    }  
    
    // Create an OR Expression add expressionFirst or expressionSecond as a sub expression.
    // If expressionFirst is null, just return expressionSecond.    
    def Expression or(Expression first, Expression second) {
        if (first == null) {
            return second
        }
        createLogicalOrExpression(first, second)
    }

    // Create an NOT Expression and add expression as a sub expression.
    def OperatorExpression not(Expression expression) {
        createNotExpression(expression)
    }

    // Create an ADD Expression and add expression as a sub expression.
    def Expression add(Expression first, Expression second) {
        if (first == null) {
            return second
        }
        createAddExpression(first, second) 
    }    
    
    // Create an SUB Expression and add expression as a sub expression.
    def Expression sub(Expression first, Expression second) {
        if (first == null) {
            return second
        }
        createSubExpression(first, second)
    }    

    // Create an MULT Expression and add expression as a sub expression.
    def Expression mult(Expression expressionFirst, Expression expressionSecond) {
        if (expressionFirst == null) {
            return expressionSecond
        }
        val addExpression = createMultExpression()
        addExpression.add(expressionFirst)
        addExpression.add(expressionSecond)
        addExpression
    }

    // Create an MAX Expression and add expression as a sub expression.
    def Expression max(Expression expressionFirst, Expression expressionSecond) {
        if (expressionFirst == null) {
            return expressionSecond
        }
        val addExpression = createMaxExpression()
        addExpression.add(expressionFirst)
        addExpression.add(expressionSecond)
        addExpression
    }

    // Create an MIN Expression and add expression as a sub expression.
    def Expression min(Expression expressionFirst, Expression expressionSecond) {
        if (expressionFirst == null) {
            return expressionSecond
        }
        val addExpression = createMinExpression()
        addExpression.add(expressionFirst)
        addExpression.add(expressionSecond)
        addExpression
    }
    
    // Create an EQ Expression.
    def OperatorExpression eq(Expression first, Expression second) {
        val equalsExpression = createEQExpression
        equalsExpression.add(first)
        equalsExpression.add(second)
        equalsExpression
    }
    
       
}