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
import org.eclipse.emf.ecore.EStructuralFeature
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage
import org.eclipse.emf.common.util.EList

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
    
    // Add a valuedObject to an eObject
    def public void addValuedObject(EObject eObject, ValuedObject valuedObject) {
        val typeGroup = valuedObject.uniqueTypeGroup
        //val typeGroupFeature = eObject.eClass().getEStructuralFeature(KExpressionsPackage.TYPE_GROUP__VALUED_OBJECTS)
        val getTypeGroups =  eObject.class.getMethod("getTypeGroups")
        val possibleList = getTypeGroups.invoke(eObject);
        val list = possibleList as EList<Object>
        list.add(typeGroup);        
    }
    
    // Remove a valuedObject from an eObject
    def public void removeValuedObject(EObject eObject, ValuedObject valuedObject) {
        val getTypeGroups =  eObject.class.getMethod("getTypeGroups")
        val possibleList = getTypeGroups.invoke(eObject);
        val typeGroups = possibleList as EList<TypeGroup>
        for (typeGroup : typeGroups) {
            typeGroup._removeValuedObject(valuedObject)
        }
    }    
    
    // Return the list of all contained ValuedObjects. 
    // ATTENTION: This method returns a specific list. If you add ValuedObjects to this
    // list they will be added to  the container of a TypeGroup.
    def public ValuedObjectList getValuedObjects(EObject eObject) {
        val typeGroups = eObject.eContents.filter(typeof(TypeGroup)).toList
        val returnList = new ValuedObjectList()
        // This is necessary for adding ValuedObjects later
        returnList.setContainer(eObject)
        for (typeGroup : typeGroups) {
            returnList.addAll(typeGroup.valuedObjects)
        }
        returnList
    }

    // Get the real container of a ValuedObject (not the TypeGroup).
    def public EObject getEContainer(ValuedObject valuedObject) {
        valuedObject.eContainer.eContainer
    }

//    // Return the list of all contained ValuedObjects.
//    def private List<ValuedObject> getValuedObjects(List<TypeGroup> typeGroups) {
//        <ValuedObject>newArrayList => [list|typeGroups.forEach[list += valuedObjects]]
//    }
//
//    // Remove a specific ValuedObject.
//    def private removeValuedObject(List<TypeGroup> typeGroups, ValuedObject valuedObject) {
//        for (typeGroup : typeGroups) {
//            typeGroup._removeValuedObject(valuedObject)
//        }
//    }

    // Return the type of the ValuedObject.
    def public ValueType getType(ValuedObject valuedObject) {
        valuedObject.typeGroup.type
    }

    // Return whether the ValuedObject is an input.
    def public boolean getInput(ValuedObject valuedObject) {
        valuedObject.typeGroup.input
    }

    // Return whether the ValuedObject is an input.
    def public boolean isInput(ValuedObject valuedObject) {
        valuedObject.getInput()
    }

    // Return whether the ValuedObject is an output.
    def public boolean getOutput(ValuedObject valuedObject) {
        valuedObject.typeGroup.output
    }

    // Return whether the ValuedObject is an output.
    def public boolean isOutput(ValuedObject valuedObject) {
        valuedObject.getOutput()
    }
    
    // Return whether the ValuedObject is static.
    def public boolean getStatic(ValuedObject valuedObject) {
        valuedObject.typeGroup.static
    }

    // Return whether the ValuedObject is static.
    def public boolean isStatic(ValuedObject valuedObject) {
        valuedObject.getStatic()
    }
    
    // Return whether the ValuedObject is a const.
    def public boolean getConst(ValuedObject valuedObject) {
        valuedObject.typeGroup.const
    }

    // Return whether the ValuedObject is a const.
    def public boolean isConst(ValuedObject valuedObject) {
        valuedObject.getConst()
    }

    // Return whether the ValuedObject is a signal.
    def public boolean getSignal(ValuedObject valuedObject) {
        valuedObject.typeGroup.signal
    }

    // Return whether the ValuedObject is a signal.
    def public boolean isSignal(ValuedObject valuedObject) {
        valuedObject.getSignal()
    }
    
    // Set the type of a ValuedObject. 
    def public ValuedObject setType(ValuedObject valuedObject, ValueType type) {
        val uniqueTypeGroup = valuedObject.uniqueTypeGroup
        uniqueTypeGroup.setType(type)
        valuedObject;
    }

    // Set the ValuedObject to be or not be an input.
    def public ValuedObject setInput(ValuedObject valuedObject, boolean isInput) {
        val uniqueTypeGroup = valuedObject.uniqueTypeGroup
        uniqueTypeGroup.setInput(isInput)
        valuedObject;
    }
    def public ValuedObject setIsInput(ValuedObject valuedObject) {
        valuedObject.setInput(true)
    } 
    def public ValuedObject setIsNotInput(ValuedObject valuedObject) {
        valuedObject.setInput(false)
    } 
    
    // Set the ValuedObject to be or not be an output.
    def public ValuedObject setOutput(ValuedObject valuedObject, boolean isOutput) {
        val uniqueTypeGroup = valuedObject.uniqueTypeGroup
        uniqueTypeGroup.setOutput(isOutput)
        valuedObject;
    }
    def public ValuedObject setIsOutput(ValuedObject valuedObject) {
        valuedObject.setOutput(true)
    } 
    def public ValuedObject setIsNotOutput(ValuedObject valuedObject) {
        valuedObject.setOutput(false)
    } 

    // Set the ValuedObject to be or not be static.
    def public ValuedObject setStatic(ValuedObject valuedObject, boolean isStatic) {
        val uniqueTypeGroup = valuedObject.uniqueTypeGroup
        uniqueTypeGroup.setInput(isStatic)
        valuedObject;
    }
    def public ValuedObject setIsStatic(ValuedObject valuedObject) {
        valuedObject.setConst(true)
    } 
    def public ValuedObject setIsNotStatic(ValuedObject valuedObject) {
        valuedObject.setConst(false)
    } 
    
   // Set the ValuedObject to be or not be a Const.
   def public ValuedObject setConst(ValuedObject valuedObject, boolean isConst) {
        val uniqueTypeGroup = valuedObject.uniqueTypeGroup
        uniqueTypeGroup.setConst(isConst)
        valuedObject;
    }
    def public ValuedObject setIsConst(ValuedObject valuedObject) {
        valuedObject.setConst(true)
    } 
    def public ValuedObject setIsNotConst(ValuedObject valuedObject) {
        valuedObject.setConst(false)
    } 

    // Set the ValuedObject to be or not be a sinal.
    def public ValuedObject setSignal(ValuedObject valuedObject, boolean isSignal) {
        val uniqueTypeGroup = valuedObject.uniqueTypeGroup
        uniqueTypeGroup.setSignal(isSignal)
        valuedObject;
    }
    def public ValuedObject setIsSignal(ValuedObject valuedObject) {
        valuedObject.setSignal(true)
    } 
    def public ValuedObject setIsNotSignal(ValuedObject valuedObject) {
        valuedObject.setSignal(false)
    } 


    //=======  TYPE GROUPS  ======

    // Creates a new TypeGroup.
    def public TypeGroup createTypeGroup() {
        KExpressionsFactory::eINSTANCE.createTypeGroup
    }

    // Creates a new TypeGroup as a copy of another TypeGroup.
    def public TypeGroup createTypeGroup(TypeGroup typeGroup) {
        createTypeGroup => [
            type = typeGroup.type
            input = typeGroup.input
            output = typeGroup.output
            signal = typeGroup.signal
            static = typeGroup.static
            const = typeGroup.const
        ]
    }

//    // Set the TypeGroup to a specific type.
//    def private TypeGroup setType(TypeGroup typeGroup, ValueType type) {
//        typeGroup.type = type
//        typeGroup
//    }


    //=======  TYPE GROUPS AND VALUED OBJECTS  ======
    
    // Get the surrounding TypeGroup of a ValuedObject that contains the ValuedObject. 
    // This TypeGroup may also contain other ValuedObjects, see containsOnly().
    // If the valuedObject does not have any TypeGroup yet, then create a new one.
    def private TypeGroup getTypeGroup(ValuedObject valuedObject) {
        if (valuedObject.eContainer instanceof TypeGroup) {
            return valuedObject.eContainer as TypeGroup
        } else {
            val newTypeGroup = createTypeGroup;
            newTypeGroup._addValuedObject(valuedObject)
            newTypeGroup
        }
    }
    
    // Helper method for Setter-Wrapper. It returns the direct TypeGroup of a ValuedObject
    // if there are no other ValuedObjects in this group. Otherwise it creates and returns
    // a new TypeGroup and removes the ValuedObject from the old one, adding it to the 
    // new one.
    def public TypeGroup getUniqueTypeGroup(ValuedObject valuedObject) {
        val typeGroup = valuedObject.typeGroup
        if (typeGroup._containsOnly(valuedObject)) {
            // We don't have to care about other valuedObjects
            return typeGroup
        } else {
            // Make a new TypeGroup
            val newTypeGroup = createTypeGroup(typeGroup)
            // Remove the valuedObject from the old group and add it to the new group
            typeGroup._removeValuedObject(valuedObject)
            if (typeGroup.valuedObjects.size == 0) {
                // THIS CANNOT HAPPEN, OTHERWISE WE WOULD HAVE BEEN IN CASE ONE!
            }
            newTypeGroup._addValuedObject(valuedObject)
            newTypeGroup
        }
    }    

    // Check if a TypeGroup only contains a single ValuedObject.
    def private boolean _containsOnly(TypeGroup typeGroup, ValuedObject valuedObject) {
        (typeGroup.valuedObjects.contains(valuedObject))&&(typeGroup.valuedObjects.size == 1)
    }

    // Remove a specific ValuedObject.
    def private _removeValuedObject(TypeGroup typeGroup, ValuedObject valuedObject) {
         if (typeGroup.valuedObjects.contains(valuedObject)) {
           typeGroup.valuedObjects -= valuedObject  
         } 
    }
    
    // Add a ValuedObject.
    def private TypeGroup _addValuedObject(TypeGroup typeGroup, ValuedObject valuedObject) {
        typeGroup.valuedObjects.add(valuedObject)
        typeGroup
    }

    // -------------------------------------------------------------------------   
    
    //=======  STATIC EXPRESSIONS  ======
    
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
        } else if (expression1 != null && expression2 == null) {
            return false
        } else if (expression1 == null && expression2 != null) {
            return false
        }
        return expression1.valuedObject == expression2.valuedObject
    }

    def dispatch equals2(TextExpression expression1, TextExpression expression2) {
        if (expression1 == null && expression2 == null) {
            return true
        } else if (expression1 != null && expression2 == null) {
            return false
        } else if (expression1 == null && expression2 != null) {
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
        } else if (searchExpression instanceof OperatorExpression) {
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
            ((operatorExpression.operator == OperatorType::AND) || (operatorExpression.operator == OperatorType::OR))) {

            // if there is just one sub expression, we do not need an AND/OR!
            val innerExpression = operatorExpression.subExpressions.get(0);
            if (innerExpression != null) {
                return innerExpression.trim
            }
            return innerExpression
        } else if (operatorExpression.subExpressions.size > 1) {
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
            operatorExpression.subExpressions.forEach [
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
    def ValuedObjectReference reference(ValuedObject valuedObject) {
        val valuedObjectReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
        valuedObjectReference.setValuedObject(valuedObject);
        valuedObjectReference
    }

    //=========  VALUED OBJECT  =========
    // Creates a new ValuedObject.
    def ValuedObject createValuedObject(String valuedObjectName) {
        val valuedObject = KExpressionsFactory::eINSTANCE.createValuedObject();
        valuedObject.setName(valuedObjectName)
        valuedObject
    }

    // Set the ValuedObject to be of type PURE.
    def public ValuedObject setTypePure(ValuedObject valuedObject) {
        valuedObject.setType(ValueType::PURE);
        valuedObject
    }

    // Set the ValuedObject to be of type INT.
    def public ValuedObject setTypeInt(ValuedObject valuedObject) {
        valuedObject.setType(ValueType::INT);
        valuedObject
    }

    // Set the ValuedObject to be of type BOOL.
    def public ValuedObject setTypeBool(ValuedObject valuedObject) {
        valuedObject.setType(ValueType::BOOL);
        valuedObject
    }

    // Set the ValuedObject to be of type DOUBLE.
    def public ValuedObject setTypeDouble(ValuedObject valuedObject) {
        valuedObject.setType(ValueType::DOUBLE);
        valuedObject
    }

    // Set the ValuedObject to be of type FLOAT.
    def public ValuedObject setTypeFloat(ValuedObject valuedObject) {
        valuedObject.setType(ValueType::FLOAT);
        valuedObject
    }

    // Set the ValuedObject to be of type HOST.
    def public ValuedObject setTypeHost(ValuedObject valuedObject) {
        valuedObject.setType(ValueType::HOST);
        valuedObject
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

    //    def public void addValuedObject(EObject eObject, ValuedObject valuedObject) {
    //        val typeGroups = eObject.eAllContents.filter(typeof(TypeGroup)); 
    //    }
    //
    //    def public void removeValuedObject(EObject eObject, ValuedObject valuedObject) {
    //        val typeGroups = eObject.eAllContents.filter(typeof(TypeGroup)).filter[valuedObjects.contains(valuedObject)].toList;
    //        for (typeGroup : typeGroups.immutableCopy) {
    //            typeGroup.valuedObjects.remove(valuedObject)
    //        } 
    //    }
    //    
    //    def private TypeGroup createTypeGroup(ValuedObject valuedObject) {
    //    	createTypeGroup() => [ valuedObjects += valuedObject ]
    //    }
    //    
    //    def private TypeGroup createTypeGroup(List<ValuedObject> valueObjects) {
    //    	createTypeGroup() => [ it.valuedObjects += valuedObjects ] 
    //    }
    //    
    //    
    //    def private TypeGroup copyAttributes(TypeGroup target, TypeGroup typeGroup) {
    //		target => [
    //			type = typeGroup.type
    //			input = typeGroup.input
    //			output = typeGroup.output
    //			signal = typeGroup.signal
    //			static = typeGroup.static
    //			Const = typeGroup.Const
    //		]    	
    //    }
    //    def private ValuedObject createValuedObject(TypeGroup typeGroup, String valuedObjectName) {
    //    	createValuedObject(valuedObjectName) => [ typeGroup.valuedObjects += it ]
    //    }
    //    
    //    def private ValuedObject createValuedObjectInTypeGroup(String valuedObjectName) {
    //        val tg = createTypeGroup 
    //        createValuedObject(tg, valuedObjectName)	
    //    }
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


    //============  SIGNALS  ============
    
    // Creates a new signal ValuedObject.
    def ValuedObject createSignal(TypeGroup typeGroup, String signalName) {
        createValuedObject(signalName).setSignal(true)
    }


    //===========  VALUES  ===========
    
    // Create a TRUE value.
    def public BoolValue TRUE() {
        createBoolValue(true)
    }

    // Create a FALSE value.
    def public BoolValue FALSE() {
        createBoolValue(false)
    }
        
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
