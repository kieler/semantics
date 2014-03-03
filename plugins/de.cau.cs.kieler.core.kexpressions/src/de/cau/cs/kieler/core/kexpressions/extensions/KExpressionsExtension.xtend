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
import de.cau.cs.kieler.core.kexpressions.FloatValue
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import org.eclipse.emf.ecore.EObject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.kexpressions.TypeGroup
import java.util.List

/**
 * KExpressions Extensions. 
 * 
 * @author cmot ssm
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class KExpressionsExtension { 

//    public val Injector i = ActionsStandaloneSetup::doSetup();
//    public val ActionsScopeProvider scopeProvider = i.getInstance(typeof(ActionsScopeProvider));
//    public val ISerializer serializer = i.getInstance(typeof(ISerializer));
    

    // -------------------------------------------------------------------------   
    
    //=======  TYPE GROUP WRAPPINGS  ======
    
    /**
     * Since the xtend editor does not support highlighting for deprecated methods,
     * this runtime method prints such usages on the console.
     * TODO: Remove at some later stage.
     */
    def private deprecatedValuedObjectAccess() {
    	System::out.println("USED DEPRECATED VALUED OBJECT ACCESSOR! REMOVE THIS CALL SOON!")
    }

    def public TypeGroup getTypeGroup(ValuedObject valuedObject) {
    	// TODO: Safeguard check for the time of transition. Remove at some later stage. 
    	if (valuedObject.eContainer instanceof TypeGroup) {
    		return valuedObject.eContainer as TypeGroup
    	} else {
    		throw new NullPointerException("Valued object is not contained in a type group!")
    	}
    }
    
    def public ValueType getType(ValuedObject valuedObject) {
    	valuedObject.typeGroup.type
    }
    
    def public ValuedObject setType(ValuedObject valuedObject, ValueType type) {
    	valuedObject => [ typeGroup.type = type ]
    }
    
    def public boolean getInput(ValuedObject valuedObject) {
    	valuedObject.typeGroup.input
    }

    def public boolean isInput(ValuedObject valuedObject) {
    	valuedObject.input
    }
    
    /**
     * @deprecated Use type groups instead.
     */
    def public ValuedObject setInput(ValuedObject valuedObject, boolean input) {
    	deprecatedValuedObjectAccess
    	valuedObject => [ typeGroup.input = input ]
    }

    def public boolean getOutput(ValuedObject valuedObject) {
    	valuedObject.typeGroup.output
    }

    def public boolean isOutput(ValuedObject valuedObject) {
    	valuedObject.output
    }
    
    /**
     * @deprecated Use type groups instead.
     */
    def public ValuedObject setOutput(ValuedObject valuedObject, boolean output) {
    	deprecatedValuedObjectAccess
    	valuedObject => [ typeGroup.output = output ]
    }

    def public boolean getStatic(ValuedObject valuedObject) {
    	valuedObject.typeGroup.static
    }

    def public boolean isStatic(ValuedObject valuedObject) {
    	valuedObject.static
    }
    
    /**
     * @deprecated Use type groups instead.
     */
    def public ValuedObject setStatic(ValuedObject valuedObject, boolean statik) {
    	deprecatedValuedObjectAccess
    	valuedObject => [ typeGroup.static = statik ]
    }
    
    def public boolean getConstant(ValuedObject valuedObject) {
    	valuedObject.typeGroup.constant
    }

    def public boolean isConstant(ValuedObject valuedObject) {
    	valuedObject.constant
    }

    /**
     * @deprecated Use type groups instead.
     */
    def public ValuedObject setSignal(ValuedObject valuedObject, boolean signal) {
    	deprecatedValuedObjectAccess
    	valuedObject => [ typeGroup.signal = signal ]
    }
    
    def public boolean getSignal(ValuedObject valuedObject) {
    	valuedObject.typeGroup.signal
    }

    def public boolean isSignal(ValuedObject valuedObject) {
    	valuedObject.signal
    }
    
    /**
     * @deprecated Use type groups instead.
     */
    def public ValuedObject setConstant(ValuedObject valuedObject, boolean constant) {
    	deprecatedValuedObjectAccess
    	valuedObject => [ typeGroup.constant = constant ]
    }
    
    
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


    // In an EObject replace one expression by another
//    def dispatch equals2(Object expression1, Object expression2) {
//        if (expression1 == null && expression2 == null) {
//            return true
//        }
//    }
    def dispatch equals2(OperatorExpression expression1, OperatorExpression expression2) {
        var c = 0
        for (Expression subExpression1 : expression1.subExpressions) {
            val subExpression2 = expression2.subExpressions.get(c)
            c = c + 1
           if (expression1.operator != expression2.operator) {
               return false
           }
           if (!subExpression1.equals(subExpression2)) {
               return false
           }  
        }
        return true
    }

    def dispatch equals2(ValuedObjectReference expression1, ValuedObjectReference expression2) {
        if (expression1 == null && expression2 == null) {
            return true
        }
        else if (expression1 != null && expression2 == null) {
            return false
        }
        else if (expression1 == null && expression2 != null) {
            return false
        }
        return expression1.valuedObject == expression2.valuedObject
    }

    def dispatch equals2(TextExpression expression1, TextExpression expression2) {
        if (expression1 == null && expression2 == null) {
            return true
        }
        else if (expression1 != null && expression2 == null) {
            return false
        }
        else if (expression1 == null && expression2 != null) {
            return false
        }
        return expression1.text.equals(expression2.text)
    }

    def dispatch equals2(Expression expression1, Expression expression2) {
        if (expression1 == null && expression2 == null) {
            return true
        }
        return false
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
    
    //-------------------------------------------------------------------------
    //--             H O T F I X   F O R   O P E R A T O R S                 --
    //-------------------------------------------------------------------------
    // Because the KExpressions Parser has a problem with
    // AND / OR lists of more than two elements the following fixes
    // an OperatorExpression of such kind.
    // Test 14
    def Expression fix(Expression expression) {
        if (expression instanceof OperatorExpression) {
            (expression as OperatorExpression).fixForOperatorExpressionLists     
        } else {
            expression
        }        
    }
    
    def OperatorExpression fixForOperatorExpressionLists(OperatorExpression operatorExpression) {
        if (operatorExpression == null || operatorExpression.subExpressions.nullOrEmpty ||
            operatorExpression.subExpressions.size <= 2) {

            // In this case we do not need the fix
//            return operatorExpression;
              val oeCopy = operatorExpression.copy
              oeCopy.subExpressions.clear
              operatorExpression.subExpressions.forEach[
                  oeCopy.subExpressions += it.copy.fix
              ]    
              return oeCopy                    
        }

        // Here we apply the fix recursively
        val operatorExpressionCopy = operatorExpression.copy;
        val newOperatorExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression();
        newOperatorExpression.setOperator(operatorExpression.operator);
        newOperatorExpression.subExpressions.add(operatorExpression.subExpressions.head);

        // Call recursively without the first element
        operatorExpressionCopy.subExpressions.remove(0);
        newOperatorExpression.subExpressions.add(operatorExpressionCopy.fixForOperatorExpressionLists);
        return newOperatorExpression;
    }    

    //==========  EXPRESSIONS  ==========

    // Create an Expression.
    def Expression createExpression() {
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

    // Create an AND Expression add expressionFirst and expressionSecond as a sub expression. 
    // If expressionFirst is null, just return expressionSecond.
    def Expression and2(Expression expressionFirst, Expression expressionSecond) {
        if (expressionFirst == null) {
            return expressionSecond
        }
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

    // Create an OR Expression add expressionFirst or expressionSecond as a sub expression.
    // If expressionFirst is null, just return expressionSecond.    
    def Expression or2(Expression expressionFirst, Expression expressionSecond) {
        if (expressionFirst == null) {
            return expressionSecond
        }
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
    
    
    // Create an ADD Expression.
    def OperatorExpression createAddExpression() {
        val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression()
        expression.setOperator(OperatorType::ADD)
        expression
    }
    
    // Create an ADD Expression as a sub expression.
    def OperatorExpression createAddExpression(OperatorExpression operatorExpression) {
        val expression = createAddExpression()
        operatorExpression.add(expression)
        expression
    }
    
    // Create an ADD Expression and add expression as a sub expression.
    def Expression add(Expression expressionFirst, Expression expressionSecond) {
        if (expressionFirst == null) {
            return expressionSecond
        }
        val addExpression = createAddExpression()
        addExpression.add(expressionFirst)
        addExpression.add(expressionSecond)
        addExpression
    }
    
    // Create an SUB Expression.
    def OperatorExpression createSubExpression() {
        val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression()
        expression.setOperator(OperatorType::SUB)
        expression
    }
    
    // Create an SUB Expression as a sub expression.
    def OperatorExpression createSubExpression(OperatorExpression operatorExpression) {
        val expression = createSubExpression()
        operatorExpression.add(expression)
        expression
    }
    
    // Create an SUB Expression and add expression as a sub expression.
    def Expression sub(Expression expressionFirst, Expression expressionSecond) {
        if (expressionFirst == null) {
            return expressionSecond
        }
        val subExpression = createSubExpression()
        subExpression.add(expressionFirst)
        subExpression.add(expressionSecond)
        subExpression
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

    // Creates a new TypeGroup.
    def public TypeGroup createTypeGroup() {
         KExpressionsFactory::eINSTANCE.createTypeGroup
    }    

    def public TypeGroup createTypeGroup(ValueType valueType) {
         KExpressionsFactory::eINSTANCE.createTypeGroup => [ type = valueType ]
    }
    
    def public TypeGroup createTypeGroup(ValuedObject valuedObject) {
    	createTypeGroup() => [ valuedObjects += valuedObject ]
    }
    
    def public TypeGroup createTypeGroup(List<ValuedObject> valueObjects) {
    	createTypeGroup() => [ it.valuedObjects += valuedObjects ] 
    }
    
    def public TypeGroup createTypeGroupWOValuedObjects(TypeGroup typeGroup) {
		createTypeGroup => [
			type = typeGroup.type
			input = typeGroup.input
			output = typeGroup.output
			signal = typeGroup.signal
			static = typeGroup.static
			constant = typeGroup.constant
		]    	
    }
    
    def public TypeGroup copyAttributes(TypeGroup target, TypeGroup typeGroup) {
		target => [
			type = typeGroup.type
			input = typeGroup.input
			output = typeGroup.output
			signal = typeGroup.signal
			static = typeGroup.static
			constant = typeGroup.constant
		]    	
    }

    // Set the TypeGroup to be of type PURE.
    def TypeGroup setTypePure(TypeGroup typeGroup) {
    	typeGroup => [ type = ValueType::PURE ]
    }
    
    // Set the TypeGroup to be of type INT.
    def TypeGroup setTypeInt(TypeGroup typeGroup) {
    	typeGroup => [ type = ValueType::INT ]
    }    

    // Set the TypeGroup to be of type BOOL.
    def TypeGroup setTypeBool(TypeGroup typeGroup) {
    	typeGroup => [ type = ValueType::BOOL ]
    }    

    // Set the TypeGroup to be of type DOUBLE.
    def TypeGroup setTypeDouble(TypeGroup typeGroup) {
    	typeGroup => [ type = ValueType::DOUBLE ]
    }    

    // Set the TypeGroup to be of type FLOAT.
    def TypeGroup setTypeFloat(TypeGroup typeGroup) {
    	typeGroup => [ type = ValueType::FLOAT ]
    }    
            
    // Creates a new ValuedObject.
    def ValuedObject createValuedObject(String valuedObjectName) {
         val valuedObject = KExpressionsFactory::eINSTANCE.createValuedObject();
         valuedObject.setName(valuedObjectName)
         valuedObject
    }
    
    def ValuedObject createValuedObject(TypeGroup typeGroup, String valuedObjectName) {
    	createValuedObject(valuedObjectName) => [ typeGroup.valuedObjects += it ]
    }
    
    def ValuedObject createValuedObjectInTypeGroup(String valuedObjectName) {
        val tg = createTypeGroup 
        createValuedObject(tg, valuedObjectName)	
    }
    
    def public List<ValuedObject> getValuedObjects(List<TypeGroup> typeGroups) {
    	<ValuedObject> newArrayList => [ list | typeGroups.forEach[ list += valuedObjects]]
    }
        
    def public removeValuedObject(List<TypeGroup> typeGroups, ValuedObject valuedObject) {
    	for (tg : typeGroups) {
    		if (tg.valuedObjects.contains(valuedObject)) tg.valuedObjects -= valuedObject
    	}
    }
    
//    // Set the ValuedObject to be a signal.
//    def ValuedObject setSignal(ValuedObject valuedObject, boolean isSignal) {
//        valuedObject.setSignal(isSignal)
//        valuedObject
//    }
//    
//    // Set the ValuedObject to be an input.
//    def ValuedObject setInput(ValuedObject valuedObject) {
//         valuedObject.setInput(true)
//         valuedObject
//    }    
//    
//    // Set the ValuedObject to be an output.
//    def ValuedObject setOutput(ValuedObject valuedObject) {
//         valuedObject.setOutput(true)
//         valuedObject
//    }    
//    
//    // Set the ValuedObject to be of type PURE.
//    def ValuedObject setTypePure(ValuedObject valuedObject) {
//         valuedObject.setType(ValueType::PURE)
//         valuedObject
//    }    
//
//    // Set the ValuedObject to be of type INT.
//    def ValuedObject setTypeInt(ValuedObject valuedObject) {
//         valuedObject.setType(ValueType::INT)
//         valuedObject
//    }   
//    
//    // Set the ValuedObject to be of type BOOL.
//    def ValuedObject setTypeBool(ValuedObject valuedObject) {
//         valuedObject.setType(ValueType::BOOL)
//         valuedObject
//    }    
//    
//    // Set the ValuedObject to be of type DOUBLE.
//    def ValuedObject setTypeDouble(ValuedObject valuedObject) {
//         valuedObject.setType(ValueType::DOUBLE)
//         valuedObject
//    }    
//    
//    // Set the ValuedObject to be of type FLOAT.
//    def ValuedObject setTypeFloat(ValuedObject valuedObject) {
//         valuedObject.setType(ValueType::FLOAT)
//         valuedObject
//    }    

    //===========  VARIABLES  ===========

    // Creates a new variable ValuedObject.
    def ValuedObject createVariable(String variableName) {
    	createValuedObject(variableName)
    }
    
    def ValuedObject createVariable(TypeGroup typeGroup, String variableName) {
    	createValuedObject(typeGroup, variableName)
    }
    
    def ValuedObject createVariableInTypeGroup(String variableName) {
        val tg = createTypeGroup 
        createVariable(tg, variableName)	
    }
    
    // Creates a new Int variable ValuedObject.
    def ValuedObject createVariableInIntTypeGroup(String variableName) {
        val tg = createTypeGroup => [ setTypeInt ]
        createVariable(tg, variableName)	
    }
    
    // Creates a new Bool variable ValuedObject.
    def ValuedObject createVariableInBoolTypeGroup(String variableName) {
        val tg = createTypeGroup => [ setTypeBool ]
        createVariable(tg, variableName)	
    }

    // Creates a new Double variable ValuedObject.
    def ValuedObject createVariableInDoubleTypeGroup(String variableName) {
        val tg = createTypeGroup => [ setTypeDouble ]
        createVariable(tg, variableName)	
    }

    // Creates a new Float variable ValuedObject.
    def ValuedObject createVariableInFloatTypeGroup(String variableName) {
        val tg = createTypeGroup => [ setTypeInt ]
        createVariable(tg, variableName)	
    }

    // Apply attributes of another ValuedObject.
    def ValuedObject applyAttributes(ValuedObject valuedObject, ValuedObject valuedObjectWithAttributes) {
        valuedObject.setInput(valuedObjectWithAttributes.isInput)
        valuedObject.setOutput(valuedObjectWithAttributes.isOutput)
        valuedObject.setStatic(valuedObjectWithAttributes.isStatic)
        valuedObject.setInitialValue(valuedObjectWithAttributes.initialValue.copy)
        valuedObject.setType(valuedObjectWithAttributes.type)
        valuedObject.setCombineOperator(valuedObjectWithAttributes.combineOperator)
        valuedObject
    }
    

    //============  SIGNALS  ============
    
    // Creates a new signal ValuedObject.
    def ValuedObject createSignal(TypeGroup typeGroup, String signalName) {
    	if (typeGroup.signal == false) {
    		throw new UnsupportedOperationException("The given type group does not accept signals!")
    	}
		createValuedObject(typeGroup, signalName)
    }

    // Creates a new pure signal ValuedObject.
    def ValuedObject createSignalInPureTypeGroup(String variableName) {
        val tg = createTypeGroup => [ setTypePure; signal = true ]
        createSignal(tg, variableName)	
    }

    // Creates a new Int signal ValuedObject.
    def ValuedObject createSignalInIntTypeGroup(String variableName) {
        val tg = createTypeGroup => [ setTypeInt; signal = true ]
        createSignal(tg, variableName)	
    }

    // Creates a new Bool signal ValuedObject.
    def ValuedObject createSignalInBoolTypeGroup(String variableName) {
        val tg = createTypeGroup => [ setTypeBool; signal = true ]
        createSignal(tg, variableName)	
    }

    // Creates a new Double signal ValuedObject.
    def ValuedObject createSignalInDoubleTypeGroup(String variableName) {
        val tg = createTypeGroup => [ setTypeDouble; signal = true ]
        createSignal(tg, variableName)	
    }

    // Creates a new Float signal ValuedObject.
    def ValuedObject createSignalInFloatTypeGroup(String variableName) {
        val tg = createTypeGroup => [ setTypeFloat; signal = true ]
        createSignal(tg, variableName)	
    }
    
    //===========  VALUES  ===========
    
    // Create an int value.
    def IntValue createIntValue(int value) {
         val expression = KExpressionsFactory::eINSTANCE.createIntValue()
         expression.setValue(value)
         expression
    }
    
    // Create a float value.
    def FloatValue createFloatValue(float value) {
         val expression = KExpressionsFactory::eINSTANCE.createFloatValue()
         expression.setValue(value)
         expression
    }

    // Create a boolean value.
    def BoolValue createBoolValue(boolean value) {
         val expression = KExpressionsFactory::eINSTANCE.createBoolValue()
         expression.setValue(value)
         expression
    }


    // Create an empty text expression.
    def TextExpression createTextExpression() {
         val expression = KExpressionsFactory::eINSTANCE.createTextExpression()
         expression
    }
    // Create a text expression.
    def TextExpression createTextExpression(String text) {
         val expression = KExpressionsFactory::eINSTANCE.createTextExpression()
         expression.setText("'" + text + "'")
         expression
    }
      
}
