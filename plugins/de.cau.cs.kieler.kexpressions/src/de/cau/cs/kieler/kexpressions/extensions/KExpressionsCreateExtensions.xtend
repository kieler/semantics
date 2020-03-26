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
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.PrintCall
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.IgnoreValue
import de.cau.cs.kieler.kexpressions.RandomCall
import de.cau.cs.kieler.kexpressions.RandomizeCall

/**
 * @author ssm
 * @kieler.design 2015-08-19 proposed 
 * @kieler.rating 2015-08-19 proposed yellow
 */
class KExpressionsCreateExtensions {
    
    def OperatorExpression createOperatorExpression() {
        KExpressionsFactory::eINSTANCE.createOperatorExpression()
    }

    def OperatorExpression createOperatorExpression(OperatorType operatorType) {
        KExpressionsFactory::eINSTANCE.createOperatorExpression() => [
            setOperator(operatorType)
        ]
    }

    def OperatorExpression createEQExpression() {
        createOperatorExpression(OperatorType::EQ) 
    }
    
    def OperatorExpression createEQSubExpression(OperatorExpression operatorExpression) {
        createEQExpression() => [
            operatorExpression.subExpressions += it
        ]
    }

    // Create an EQ Expression add expressionFirst and expressionSecond as sub expressions.
    def OperatorExpression createEQExpression(Expression firstSubExpression, Expression secondSubExpression) {
        createEQExpression() => [
            it.safeAddToSubExpression(firstSubExpression)
            it.safeAddToSubExpression(secondSubExpression)
        ]
    }

    def OperatorExpression createNEExpression() {
        createOperatorExpression(OperatorType::NE) 
    }

    // Create an GEQ Expression add expressionFirst and expressionSecond as sub expressions.
    def OperatorExpression createNEExpression(Expression firstSubExpression, Expression secondSubExpression) {
        createNEExpression() => [
            it.safeAddToSubExpression(firstSubExpression)
            it.safeAddToSubExpression(secondSubExpression)
        ]
    }

    def OperatorExpression createLEQExpression() {
        createOperatorExpression(OperatorType::LEQ) 
    }

    // Create an LEQ Expression add expressionFirst and expressionSecond as sub expressions.
    def OperatorExpression createLEQExpression(Expression firstSubExpression, Expression secondSubExpression) {
        createLEQExpression() => [
            it.safeAddToSubExpression(firstSubExpression)
            it.safeAddToSubExpression(secondSubExpression)
        ]
    }

    def OperatorExpression createLEExpression() {
        createOperatorExpression(OperatorType::LT) 
    }

    def OperatorExpression createLEExpression(Expression firstSubExpression, Expression secondSubExpression) {
        createLEExpression() => [
            it.safeAddToSubExpression(firstSubExpression)
            it.safeAddToSubExpression(secondSubExpression)
        ]
    }

    def OperatorExpression createGEQExpression() {
        createOperatorExpression(OperatorType::GEQ) 
    }

    // Create an GEQ Expression add expressionFirst and expressionSecond as sub expressions.
    def OperatorExpression createGEQExpression(Expression firstSubExpression, Expression secondSubExpression) {
        createGEQExpression() => [
            it.safeAddToSubExpression(firstSubExpression)
            it.safeAddToSubExpression(secondSubExpression)
        ]
    }
    
    def OperatorExpression createGTExpression() {
        createOperatorExpression(OperatorType::GT) 
    }

    // Create an GEQ Expression add expressionFirst and expressionSecond as sub expressions.
    def OperatorExpression createGTExpression(Expression firstSubExpression, Expression secondSubExpression) {
        createGTExpression() => [
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

    // Create an AND Expression add expressionFirst and expressionSecond as sub expressions.
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
    
    // Create an PRE Expression.
    def OperatorExpression createPreExpression() {
        createOperatorExpression(OperatorType::PRE)
    }

    // Create an PRE Expression as a sub expression.
    def OperatorExpression createPreSubExpression(OperatorExpression operatorExpression) {
        createPreExpression() => [
            operatorExpression.subExpressions += it
        ]
    }
    
    def OperatorExpression createPreExpression(Expression expression) {
        createPreExpression() => [
            it.safeAddToSubExpression(expression)
        ]
    }
    
    // Create a conditional operator expression.
    def OperatorExpression createConditionalExpression() {
        createOperatorExpression(OperatorType::CONDITIONAL)
    }
        
    def OperatorExpression createConditionalExpression(Expression condition, Expression thenExpression, Expression elseExpression) {
        createOperatorExpression(OperatorType::CONDITIONAL) => [
            subExpressions += condition
            subExpressions += thenExpression
            subExpressions += elseExpression
        ]
    }

    def OperatorExpression createConditionalExpression(Expression condition, Expression thenExpression) {
        createOperatorExpression(OperatorType::CONDITIONAL) => [
            subExpressions += condition
            subExpressions += thenExpression
        ]
    }
    
    // Create an int value.
    def IntValue createIntValue(int value) {
        KExpressionsFactory::eINSTANCE.createIntValue() => [
            setValue(value)
        ]
    }

    // Create a float value.
    def FloatValue createFloatValue(double value) {
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
    
    def VectorValue createVectorValue() {
        KExpressionsFactory::eINSTANCE.createVectorValue
    }
    
    def IgnoreValue createIgnoreValue() {
        KExpressionsFactory::eINSTANCE.createIgnoreValue
    }

    def TextExpression createTextExpression() {
        KExpressionsFactory::eINSTANCE.createTextExpression
    }
    
    def ReferenceCall createReferenceCall() {
        KExpressionsFactory::eINSTANCE.createReferenceCall
    }

    def FunctionCall createFunctionCall() {
        KExpressionsFactory::eINSTANCE.createFunctionCall
    }
    
    def PrintCall createPrintCall() {
        KExpressionsFactory::eINSTANCE.createPrintCall
    }
    
    def RandomCall createRandomCall() {
        KExpressionsFactory::eINSTANCE.createRandomCall
    }

    def RandomizeCall createRandomizeCall() {
        KExpressionsFactory::eINSTANCE.createRandomizeCall
    }
    
    def Parameter createParameter() {
        KExpressionsFactory::eINSTANCE.createParameter
    }
    
    def Parameter createParameter(FunctionCall fc, Expression exp) {
        createParameter() => [
            expression = exp
            fc.parameters.add(it)
        ]
    }

    def TextExpression createTextExpression(String text) {
        KExpressionsFactory::eINSTANCE.createTextExpression() => [
            setText(text)
        ]
    }
    
    // Convert a String into a text/host code effect
   def Expression asTextExpression(String hostCode) {
       val effect = KExpressionsFactory::eINSTANCE.createTextExpression
       effect.text = hostCode;
       effect        
   }
   
    // HELPER
    
    protected def OperatorExpression safeAddToSubExpression(OperatorExpression operatorExpression, Expression expression) {
        if (expression !== null) 
            operatorExpression.subExpressions += expression
        operatorExpression
    }

}