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
package de.cau.cs.kieler.kexpressions.extensions

import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.StringValue
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.Parameter

/**
 * @author ssm
 * @kieler.design 2015-08-19 proposed 
 * @kieler.rating 2015-08-19 proposed yellow
 */
class KExpressionsCreateExtensions {
    
    // Create an Expression.
    def Expression createExpression() {
        KExpressionsFactory::eINSTANCE.createExpression()        
    }

    // Create an Operator Expression.
    def OperatorExpression createOperatorExpression() {
        KExpressionsFactory::eINSTANCE.createOperatorExpression()
    }

    // Create an Operator Expression with type.
    def OperatorExpression createOperatorExpression(OperatorType operatorType) {
        KExpressionsFactory::eINSTANCE.createOperatorExpression() => [
            setOperator(operatorType)
        ]
    }

    // Create an EQ Expression.
    def OperatorExpression createEQExpression() {
        createOperatorExpression(OperatorType::EQ) 
    }

    // Create an EQ Expression as a sub expression.
    def OperatorExpression createEQSubExpression(OperatorExpression operatorExpression) {
        createEQExpression() => [
            operatorExpression.subExpressions += it
        ]
    }
    
    protected def OperatorExpression safeAddToSubExpression(OperatorExpression operatorExpression, Expression expression) {
        if (expression != null) 
            operatorExpression.subExpressions += expression
        operatorExpression
    }

    // Create an EQ Expression add expressionFirst and expressionSecond as a sub expression.
    def OperatorExpression createEQExpression(Expression firstSubExpression, Expression secondSubExpression) {
        createEQExpression() => [
            it.safeAddToSubExpression(firstSubExpression)
            it.safeAddToSubExpression(secondSubExpression)
        ]
    }

    // Create an AND Expression.
    def OperatorExpression createLogicalAndExpression() {
        createOperatorExpression(OperatorType::LOGICAL_AND)
    }

    // Create an AND Expression as a sub expression.
    def OperatorExpression createLogicalAndSubExpression(OperatorExpression operatorExpression) {
        createLogicalAndExpression() => [
            operatorExpression.subExpressions += it
        ]
    }

    // Create an AND Expression add expressionFirst and expressionSecond as a sub expression.
    def OperatorExpression createLogicalAndExpression(Expression firstSubExpression, Expression secondSubExpression) {
        createLogicalAndExpression() => [
            it.safeAddToSubExpression(firstSubExpression)
            it.safeAddToSubExpression(secondSubExpression)
        ]
    }

    // Create an OR Expression.
    def OperatorExpression createLogicalOrExpression() {
        createOperatorExpression(OperatorType::LOGICAL_OR)
    }

    // Create an OR Expression as a sub expression.
    def OperatorExpression createLogicalOrSubExpression(OperatorExpression operatorExpression) {
        createLogicalOrExpression() => [
            operatorExpression.subExpressions += it
        ]
    }
    
    def OperatorExpression createLogicalOrExpression(Expression firstSubExpression, Expression secondSubExpression) {
        createLogicalOrExpression() => [
            it.safeAddToSubExpression(firstSubExpression)
            it.safeAddToSubExpression(secondSubExpression)
        ]
    }    

    // Create an NOT Expression.
    def OperatorExpression createNotExpression() {
        createOperatorExpression(OperatorType::NOT)
    }

    // Create an NOT Expression as a sub expression.
    def OperatorExpression createNotSubExpression(OperatorExpression operatorExpression) {
        createNotExpression() => [
            operatorExpression.subExpressions += it
        ]
    }
    
    def OperatorExpression createNotExpression(Expression expression) {
        createNotExpression() => [
            it.safeAddToSubExpression(expression)
        ]
    }    
    

    // Create an ADD Expression.
    def OperatorExpression createAddExpression() {
        createOperatorExpression(OperatorType::ADD)
    }

    // Create an ADD Expression as a sub expression.
    def OperatorExpression createAddSubExpression(OperatorExpression operatorExpression) {
        createAddExpression() => [
            operatorExpression.subExpressions += it
        ]
    }
    
    def OperatorExpression createAddExpression(Expression firstSubExpression, Expression secondSubExpression) {
        createAddExpression() => [
            it.safeAddToSubExpression(firstSubExpression)
            it.safeAddToSubExpression(secondSubExpression)
        ]
    }    

    // Create an SUB Expression.
    def OperatorExpression createSubExpression() {
        createOperatorExpression(OperatorType::SUB)
    }

    // Create an SUB Expression as a sub expression.
    def OperatorExpression createSubSubExpression(OperatorExpression operatorExpression) {
        createSubExpression() => [
            operatorExpression.subExpressions += it
        ]
    }
    
    def OperatorExpression createSubExpression(Expression firstSubExpression, Expression secondSubExpression) {
        createSubExpression() => [
            it.safeAddToSubExpression(firstSubExpression)
            it.safeAddToSubExpression(secondSubExpression)
        ]
    }    
    
    // Create an MULT Expression.
    def OperatorExpression createMultExpression() {
        val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression()
        expression.setOperator(OperatorType::MULT)
        expression
    }

    // Create an MULT Expression as a sub expression.
    def OperatorExpression createMultExpression(OperatorExpression operatorExpression) {
        createMultExpression() => [
            operatorExpression.subExpressions += it
        ]
    }
    
    // Create an MAX Expression.
    def OperatorExpression createMaxExpression() {
        val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression()
        expression.setOperator(OperatorType::ADD) // FIXME: change to MAX
        expression
    }

    // Create an MAX Expression as a sub expression.
    def OperatorExpression createMaxExpression(OperatorExpression operatorExpression) {
        createMaxExpression() => [
            operatorExpression.subExpressions += it
        ]
    }
    
    // Create an MIN Expression.
    def OperatorExpression createMinExpression() {
        val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression()
        expression.setOperator(OperatorType::ADD) // FIXME: change to MIN
        expression
    }

    // Create an MIN Expression as a sub expression.
    def OperatorExpression createMinExpression(OperatorExpression operatorExpression) {
        createMinExpression() => [
            operatorExpression.subExpressions += it
        ]
    }
    
    
    // Create an int value.
    def IntValue createIntValue(int value) {
        KExpressionsFactory::eINSTANCE.createIntValue() => [
            setValue(value)
        ]
    }

    // Create a float value.
    def FloatValue createFloatValue(float value) {
        KExpressionsFactory::eINSTANCE.createFloatValue() => [
            setValue(value)
        ]
    }

    // Create a boolean value.
    def BoolValue createBoolValue(boolean value) {
        KExpressionsFactory::eINSTANCE.createBoolValue() => [
            setValue(value)
        ]
    }

    def public BoolValue TRUE() {
        createBoolValue(true)
    }

    // Create a FALSE value.
    def public BoolValue FALSE() {
        createBoolValue(false)
    }

    def StringValue createStringValue(String value) {
        KExpressionsFactory::eINSTANCE.createStringValue() => [
            setValue(value)
        ]
    }

    // Create an empty text expression.
    def TextExpression createTextExpression() {
        KExpressionsFactory::eINSTANCE.createTextExpression()
    }

    def FunctionCall createFunctionCall() {
        KExpressionsFactory::eINSTANCE.createFunctionCall()
    }

    def Parameter createParameter() {
        KExpressionsFactory::eINSTANCE.createParameter()
    }

    // Create a text expression.
    def TextExpression createTextExpression(String text) {
        KExpressionsFactory::eINSTANCE.createTextExpression() => [
            setText("'" + text + "'")
        ]
    }
    

}