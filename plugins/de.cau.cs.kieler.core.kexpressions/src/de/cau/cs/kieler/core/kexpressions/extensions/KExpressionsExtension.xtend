/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.core.kexpressions.extensions

import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import org.eclipse.emf.ecore.EObject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * S Extensions. 
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class KExpressionsExtension { 

//    public val Injector i = ActionsStandaloneSetup::doSetup();
//    public val ActionsScopeProvider scopeProvider = i.getInstance(typeof(ActionsScopeProvider));
//    public val ISerializer serializer = i.getInstance(typeof(ISerializer));
    

    // -------------------------------------------------------------------------   
    
    //=======  STATIC EXPRESSIONS  ======
    
    def public BoolValue TRUE() {
        createBooleanValue(true)
    }

    def public BoolValue FALSE() {
        createBooleanValue(false)
    }

    def public BoolValue createBooleanValue(boolean value) {
        val booleanValue = KExpressionsFactory::eINSTANCE.createBoolValue
        booleanValue.setValue(value)
        booleanValue
    }

    //==  EXPRESSION MODIFICATIONS  ==

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
        }
        else if (searchExpression instanceof OperatorExpression) {
            val operatorExpression = searchExpression as OperatorExpression
            for (Expression subExpression : operatorExpression.subExpressions) { 
                subExpression.replace(searchExpression, replaceExpression)
            }
        }
        expression
    }
    
    // Trim all AND/OR Expressions if it contains only a single sub expression
    def dispatch Expression trim(Expression expression) {
        expression
    }
    
    // Trim an AND/OR Expression if it contains only a single sub expression.
    def dispatch Expression trim(OperatorExpression operatorExpression) {
        if (operatorExpression == null || operatorExpression.subExpressions.nullOrEmpty) {
            return operatorExpression
        }
        if (operatorExpression.subExpressions.size == 1 && 
            ((operatorExpression.operator == OperatorType::AND) || (operatorExpression.operator == OperatorType::OR))
        ) {
               // if there is just one sub expression, we do not need an AND/OR!
               val innerExpression = operatorExpression.subExpressions.get(0);
               if (innerExpression != null) {
                   return innerExpression.trim
               }
               return innerExpression
        }
        else if (operatorExpression.subExpressions.size > 1 ) {
               for (Expression subExpression : operatorExpression.subExpressions.immutableCopy) {
                   operatorExpression.add(subExpression.trim.copy)
                   operatorExpression.subExpressions.remove(subExpression)
               }
        }
        operatorExpression;
    }

    //==========  EXPRESSIONS  ==========

    // Create an Expression.
    def Expression createExpression(OperatorType operatorType) {
        val expression = KExpressionsFactory::eINSTANCE.createExpression()
        expression
    }

    // Create an Operator Expression.
    def OperatorExpression createOperatorExpression(OperatorType operatorType) {
        val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression()
        expression.setOperator(operatorType)
        expression
    }

    // Create an EQ Expression.
    def OperatorExpression createEQExpression() {
        val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression()
        expression.setOperator(OperatorType::EQ)
        expression
    }
    // Create an EQ Expression as a sub expression.
    def OperatorExpression createEQExpression(OperatorExpression operatorExpression) {
        val expression = createEQExpression()
        operatorExpression.add(expression)
        expression
    }
    // Create an EQ Expression add expressionFirst and expressionSecond as a sub expression.
    def OperatorExpression isEqual(Expression expressionFirst, Expression expressionSecond) {
        val eqExpression = createEQExpression()
        eqExpression.add(expressionFirst)
        eqExpression.add(expressionSecond)
        eqExpression
    }

    // Create an AND Expression.
    def OperatorExpression createAndExpression() {
        val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression()
        expression.setOperator(OperatorType::AND)
        expression
    }
    // Create an AND Expression as a sub expression.
    def OperatorExpression createAndExpression(OperatorExpression operatorExpression) {
        val expression = createAndExpression()
        operatorExpression.add(expression)
        expression
    }
    // Create an AND Expression add expressionFirst and expressionSecond as a sub expression.
    def OperatorExpression and(Expression expressionFirst, Expression expressionSecond) {
        val andExpression = createAndExpression()
        andExpression.add(expressionFirst)
        andExpression.add(expressionSecond)
        andExpression
    }

    // Create an OR Expression.
    def OperatorExpression createOrExpression() {
        val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression()
        expression.setOperator(OperatorType::OR)
        expression
    }
    // Create an OR Expression as a sub expression.
    def OperatorExpression createOrExpression(OperatorExpression operatorExpression) {
        val expression = createOrExpression()
        operatorExpression.add(expression)
        expression
    }
    // Create an OR Expression add expressionFirst or expressionSecond as a sub expression.
    def OperatorExpression or(Expression expressionFirst, Expression expressionSecond) {
        val orExpression = createOrExpression()
        orExpression.add(expressionFirst)
        orExpression.add(expressionSecond)
        orExpression
    }

    // Create an NOT Expression.
    def OperatorExpression createNotExpression() {
        val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression()
        expression.setOperator(OperatorType::NOT)
        expression
    }
    // Create an NOT Expression as a sub expression.
    def OperatorExpression createNotExpression(OperatorExpression operatorExpression) {
        val expression = createNotExpression()
        operatorExpression.add(expression)
        expression
    }
    // Create an NOT Expression and add expression as a sub expression.
    def OperatorExpression not(Expression expression) {
        val notExpression = createNotExpression()
        notExpression.add(expression)
        notExpression
    }
    
    // Add a sub expression to an OperatorExpression.
    def OperatorExpression add(OperatorExpression operatorExpression, Expression expression) {
        operatorExpression.subExpressions.add(expression)
        operatorExpression
    }
    
    // Create a ValuedObjectReference to a valuedObject
    def ValuedObjectReference reference (ValuedObject valuedObject) {
         val valuedObjectReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
         valuedObjectReference.setValuedObject(valuedObject);
         valuedObjectReference
    }
    

    //=========  VALUED OBJECT  =========

    // Creates a new ValuedObject in a scope.
    def ValuedObject createValuedObject(String valuedObjectName) {
         val valuedObject = KExpressionsFactory::eINSTANCE.createValuedObject();
         valuedObject.setName(valuedObjectName)
         valuedObject
    }
    
    def ValuedObject setIsSignal(ValuedObject valuedObject, boolean isSignal) {
        valuedObject.setIsSignal(isSignal)
        valuedObject
    }
    def ValuedObject setIsInput(ValuedObject valuedObject) {
         valuedObject.setIsInput(true)
         valuedObject
    }    
    def ValuedObject setIsOutput(ValuedObject valuedObject) {
         valuedObject.setIsOutput(true)
         valuedObject
    }    
    def ValuedObject setTypePure(ValuedObject valuedObject) {
         valuedObject.setType(ValueType::PURE)
         valuedObject
    }    
    def ValuedObject setTypeInt(ValuedObject valuedObject) {
         valuedObject.setType(ValueType::INT)
         valuedObject
    }   
    def ValuedObject setTypeBool(ValuedObject valuedObject) {
         valuedObject.setType(ValueType::BOOL)
         valuedObject
    }    
    def ValuedObject setTypeDouble(ValuedObject valuedObject) {
         valuedObject.setType(ValueType::DOUBLE)
         valuedObject
    }    
    def ValuedObject setTypeFloat(ValuedObject valuedObject) {
         valuedObject.setType(ValueType::FLOAT)
         valuedObject
    }    

    //===========  VARIABLES  ===========

    // Creates a new variable ValuedObject.
    def ValuedObject createVariable(String variableName) {
         val valuedObject = KExpressionsFactory::eINSTANCE.createValuedObject();
         valuedObject.setName(variableName)
         valuedObject.setIsSignal(false)
         valuedObject;
    }
    
    // Creates a new Int variable ValuedObject.
    def ValuedObject createIntVariable(String variableName) {
         val valuedObject = createVariable(variableName)
         valuedObject.setTypeInt
    }
    
    // Creates a new Bool variable ValuedObject.
    def ValuedObject createBoolVariable(String variableName) {
         val valuedObject = createVariable(variableName)
         valuedObject.setTypeBool
    }

    // Creates a new Double variable ValuedObject.
    def ValuedObject createDoubleVariable(String variableName) {
         val valuedObject = createVariable(variableName)
         valuedObject.setTypeDouble
    }

    // Creates a new Float variable ValuedObject.
    def ValuedObject createFloatVariable(String variableName) {
         val valuedObject = createVariable(variableName)
         valuedObject.setTypeFloat
    }

    // Apply attributes of another ValuedObject.
    def ValuedObject applyAttributes(ValuedObject valuedObject, ValuedObject valuedObjectWithAttributes) {
        valuedObject.setIsInput(valuedObjectWithAttributes.isInput)
        valuedObject.setIsOutput(valuedObjectWithAttributes.isOutput)
        valuedObject.setIsStatic(valuedObjectWithAttributes.isStatic)
        valuedObject.setInitialValue(valuedObjectWithAttributes.initialValue.copy)
        valuedObject.setType(valuedObjectWithAttributes.type)
        valuedObject.setCombineOperator(valuedObjectWithAttributes.combineOperator)
        valuedObject
    }
    

    //============  SIGNALS  ============
    
    // Creates a new signal ValuedObject.
    def ValuedObject createSignal(String signalName) {
         val valuedObject = KExpressionsFactory::eINSTANCE.createValuedObject()
         valuedObject.setName(signalName)
         valuedObject.setIsSignal(true)
         valuedObject
    }

    // Creates a new pure signal ValuedObject.
    def ValuedObject createPureSignal(String variableName) {
         val valuedObject = createSignal(variableName)
         valuedObject.setTypePure
    }

    // Creates a new Int signal ValuedObject.
    def ValuedObject createIntSignal(String variableName) {
         val valuedObject = createSignal(variableName)
         valuedObject.setTypeInt
    }

    // Creates a new Bool signal ValuedObject.
    def ValuedObject createBoolSignal(String variableName) {
         val valuedObject = createSignal(variableName)
         valuedObject.setTypeBool
    }

    // Creates a new Double signal ValuedObject.
    def ValuedObject createDoubleSignal(String variableName) {
         val valuedObject = createSignal(variableName)
         valuedObject.setTypeDouble
    }

    // Creates a new Float signal ValuedObject.
    def ValuedObject createFloatSignal(String variableName) {
         val valuedObject = createSignal(variableName)
         valuedObject.setTypeFloat
    }
    
      
}
