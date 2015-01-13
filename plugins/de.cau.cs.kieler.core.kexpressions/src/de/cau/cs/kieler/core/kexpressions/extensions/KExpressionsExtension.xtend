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
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.Parameter
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



    //=======  SYNC MEETING DEMO  ======

    // Return the type of the ValuedObject.
    def public ValueType getType(ValuedObject valuedObject) {
        valuedObject.declaration.type
    }


    // Set the type of a ValuedObject. 
    def public ValuedObject setType(ValuedObject valuedObject, ValueType type) {
        val uniqueDeclaration = valuedObject.uniqueDeclaration
        uniqueDeclaration.setType(type)
        valuedObject;
    }
    
    
    // Helper method for Setter-Wrapper. It returns the direct Declaration of a ValuedObject
    // if there are no other ValuedObjects in this group. Otherwise it creates and returns
    // a new Declaration and removes the ValuedObject from the old one, adding it to the 
    // new one.
    def public Declaration getUniqueDeclaration(ValuedObject valuedObject) {
        val declaration = valuedObject.declarationOrCreate
        if (declaration._containsOnly(valuedObject)) {
            // We don't have to care about other valuedObjects
            return declaration
        } else {
            // Make a new Declaration
            val newDeclaration = createDeclaration(declaration)
            // Remove the valuedObject from the old group and add it to the new group
            declaration._removeValuedObject(valuedObject)
            if (declaration.valuedObjects.size == 0) {
                // THIS CANNOT HAPPEN, OTHERWISE WE WOULD HAVE BEEN IN IF CASE!
            }
            newDeclaration._addValuedObject(valuedObject)
            newDeclaration
        }
    } 
         
         
//    // Return the list of all contained ValuedObjects.
//    def private List<ValuedObject> getValuedObjects(List<Declaration> declarations) {
//        <ValuedObject>newArrayList => [list|declarations.forEach[list += valuedObjects]]
//    }
            
    
    // Return the list of all contained ValuedObjects. 
    // ATTENTION: This method returns a specific list. If you add ValuedObjects to this
    // list they will be added to  the container of a Declaration.
    def public ValuedObjectList getValuedObjects(EObject eObject) {
        val declarations = eObject.eContents.filter(typeof(Declaration)).toList
        val returnList = new ValuedObjectList()
        // This is necessary for adding ValuedObjects later
        returnList.setContainer(eObject)
        for (declaration : declarations) {
            returnList.addAll(declaration.valuedObjects)
        }
        returnList
    }

   
    
    //=======  DECLARATION WRAPPINGS  ======
    
    // Add a valuedObject to an eObject
    def public void addValuedObject(EObject eObject, ValuedObject valuedObject) {
        val declaration = valuedObject.uniqueDeclaration
        //val declarationFeature = eObject.eClass().getEStructuralFeature(KExpressionsPackage.TYPE_GROUP__VALUED_OBJECTS)
        val getDeclarations =  eObject.class.getMethod("getDeclarations")
        val possibleList = getDeclarations.invoke(eObject);
        val list = possibleList as EList<Object>
        list.add(declaration);        
    }
    
    
    // Remove a valuedObject from an eObject
    def public void removeValuedObject(EObject eObject, ValuedObject valuedObject) {
        val getDeclarations =  eObject.class.getMethod("getDeclarations")
        val possibleList = getDeclarations.invoke(eObject);
        val declarations = possibleList as EList<Declaration>
        for (declaration : declarations) {
            declaration._removeValuedObject(valuedObject)
        }
    }   
    
        
    

    //=======  GENERAL  ======

    // added by cmot (9.3.14)
    public def String removeEnclosingQuotes(String text) {
            var returnText = text
            if (returnText.startsWith("'") && returnText.endsWith("'")) {
                returnText = returnText.replaceFirst("'", "")
                returnText = returnText.substring(0, returnText.length - 1)
                return returnText.removeEnclosingQuotes
            }
            if (returnText.startsWith("\"") && returnText.endsWith("\"")) {
                returnText = returnText.substring(0, returnText.length - 1)
                returnText = returnText.replaceFirst("'", "")
                return returnText.removeEnclosingQuotes
            }
            return text
    }



        
    
//    // Return the list of all contained ValuedObjects. 
//    // ATTENTION: This method returns a specific list. If you add ValuedObjects to this
//    // list they will be added to  the container of a Declaration.
//    def public ValuedObjectList getValuedObjects(EObject eObject) {
//        val declarations = eObject.eContents.filter(typeof(Declaration)).toList
//        val returnList = new ValuedObjectList()
//        // This is necessary for adding ValuedObjects later
//        returnList.setContainer(eObject)
//        for (declaration : declarations) {
//            returnList.addAll(declaration.valuedObjects)
//        }
//        returnList
//    }

    // Get the real container of a ValuedObject (not the Declaration).
    def public EObject getEContainer(ValuedObject valuedObject) {
        valuedObject.eContainer.eContainer
    }

//    // Return the list of all contained ValuedObjects.
//    def private List<ValuedObject> getValuedObjects(List<Declaration> declarations) {
//        <ValuedObject>newArrayList => [list|declarations.forEach[list += valuedObjects]]
//    }
//
//    // Remove a specific ValuedObject.
//    def private removeValuedObject(List<Declaration> declarations, ValuedObject valuedObject) {
//        for (declaration : declarations) {
//            declaration._removeValuedObject(valuedObject)
//        }
//    }

//    // Return the type of the ValuedObject.
//    def public ValueType getType(ValuedObject valuedObject) {
//        valuedObject.declaration.type
//    }

    // Return whether the ValuedObject is an input.
    def public boolean getInput(ValuedObject valuedObject) {
        valuedObject.declaration.input
    }

    // Return whether the ValuedObject is an input.
    def public boolean isInput(ValuedObject valuedObject) {
        valuedObject.getInput()
    }

    // Return whether the ValuedObject is an output.
    def public boolean getOutput(ValuedObject valuedObject) {
        valuedObject.declaration.output
    }

    // Return whether the ValuedObject is an output.
    def public boolean isOutput(ValuedObject valuedObject) {
        valuedObject.getOutput()
    }
    
    // Return whether the ValuedObject is static.
    def public boolean getStatic(ValuedObject valuedObject) {
        valuedObject.declaration.static
    }

    // Return whether the ValuedObject is static.
    def public boolean isStatic(ValuedObject valuedObject) {
        valuedObject.getStatic()
    }
    
    // Return whether the ValuedObject is a const.
    def public boolean getConst(ValuedObject valuedObject) {
        valuedObject.declaration.const
    }

    // Return whether the ValuedObject is a const.
    def public boolean isConst(ValuedObject valuedObject) {
        valuedObject.getConst()
    }
    
    // Return whether the ValuedObject is a const.
    def public boolean getExtern(ValuedObject valuedObject) {
        valuedObject.declaration.extern
    }

    // Return whether the ValuedObject is a const.
    def public boolean isExtern(ValuedObject valuedObject) {
        valuedObject.getExtern()
    }    

    // Return whether the ValuedObject is an array.
    def public boolean isArray(ValuedObject valuedObject) {
        !valuedObject.cardinalities.nullOrEmpty
    }

    // Return whether the ValuedObject is a signal.
    def public boolean getSignal(ValuedObject valuedObject) {
        valuedObject.declaration.signal
    }

    // Return whether the ValuedObject is a signal.
    def public boolean isSignal(ValuedObject valuedObject) {
        valuedObject.getSignal()
    }
    
//    // Set the type of a ValuedObject. 
//    def public ValuedObject setType(ValuedObject valuedObject, ValueType type) {
//        val uniqueDeclaration = valuedObject.uniqueDeclaration
//        uniqueDeclaration.setType(type)
//        valuedObject;
//    }

    // Set the ValuedObject to be or not be an input.
    def public ValuedObject setInput(ValuedObject valuedObject, boolean isInput) {
        val uniqueDeclaration = valuedObject.uniqueDeclaration
        uniqueDeclaration.setInput(isInput)
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
        val uniqueDeclaration = valuedObject.uniqueDeclaration
        uniqueDeclaration.setOutput(isOutput)
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
        val uniqueDeclaration = valuedObject.uniqueDeclaration
        uniqueDeclaration.setInput(isStatic)
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
        val uniqueDeclaration = valuedObject.uniqueDeclaration
        uniqueDeclaration.setConst(isConst)
        valuedObject;
    }
    def public ValuedObject setIsConst(ValuedObject valuedObject) {
        valuedObject.setConst(true)
    } 
    def public ValuedObject setIsNotConst(ValuedObject valuedObject) {
        valuedObject.setConst(false)
    } 

   // Set the ValuedObject to be or not be a Const.
   def public ValuedObject setExtern(ValuedObject valuedObject, boolean isExtern) {
        val uniqueDeclaration = valuedObject.uniqueDeclaration
        uniqueDeclaration.setExtern(isExtern)
        valuedObject;
    }
    def public ValuedObject setIsExtern(ValuedObject valuedObject) {
        valuedObject.setExtern(true)
    } 
    def public ValuedObject setIsNotExtern(ValuedObject valuedObject) {
        valuedObject.setExtern(false)
    } 

    // Set the ValuedObject to be or not be a sinal.
    def public ValuedObject setSignal(ValuedObject valuedObject, boolean isSignal) {
        val uniqueDeclaration = valuedObject.uniqueDeclaration
        uniqueDeclaration.setSignal(isSignal)
        valuedObject;
    }
    def public ValuedObject setIsSignal(ValuedObject valuedObject) {
        valuedObject.setSignal(true)
    } 
    def public ValuedObject setIsNotSignal(ValuedObject valuedObject) {
        valuedObject.setSignal(false)
    } 


    //=======  DECLARATIONS  ======

    // Creates a new Declaration.
    def public Declaration createDeclaration() {
        KExpressionsFactory::eINSTANCE.createDeclaration
    }

    // Creates a new Declaration as a copy of another Declaration.
    def public Declaration createDeclaration(Declaration declaration) {
        createDeclaration => [
            type = declaration.type
            input = declaration.input
            output = declaration.output
            signal = declaration.signal
            static = declaration.static
            const = declaration.const
            extern = declaration.extern
        ]
    }

//    // Set the Declaration to a specific type.
//    def private Declaration setType(Declaration declaration, ValueType type) {
//        declaration.type = type
//        declaration
//    }


    //=======  DECLARATIONS AND VALUED OBJECTS  ======
    
    // Get the surrounding Declaration of a ValuedObject that contains the ValuedObject. 
    // This Declaration may also contain other ValuedObjects, see containsOnly().
    // If the valuedObject does not have any Declaration yet, then create a new one.
    def private Declaration getDeclarationOrCreate(ValuedObject valuedObject) {
        if (valuedObject.eContainer instanceof Declaration) {
            return valuedObject.eContainer as Declaration
        } else {
            val newDeclaration = createDeclaration;
            newDeclaration._addValuedObject(valuedObject)
            newDeclaration
        }
    }
    
    def public Declaration declaration(ValuedObject valuedObject) {
        if (valuedObject.eContainer instanceof Declaration) {
            return valuedObject.eContainer as Declaration
        } 
    }
    
//    // Helper method for Setter-Wrapper. It returns the direct Declaration of a ValuedObject
//    // if there are no other ValuedObjects in this group. Otherwise it creates and returns
//    // a new Declaration and removes the ValuedObject from the old one, adding it to the 
//    // new one.
//    def public Declaration getUniqueDeclaration(ValuedObject valuedObject) {
//        val declaration = valuedObject.declaration
//        if (declaration._containsOnly(valuedObject)) {
//            // We don't have to care about other valuedObjects
//            return declaration
//        } else {
//            // Make a new Declaration
//            val newDeclaration = createDeclaration(declaration)
//            // Remove the valuedObject from the old group and add it to the new group
//            declaration._removeValuedObject(valuedObject)
//            if (declaration.valuedObjects.size == 0) {
//                // THIS CANNOT HAPPEN, OTHERWISE WE WOULD HAVE BEEN IN CASE ONE!
//            }
//            newDeclaration._addValuedObject(valuedObject)
//            newDeclaration
//        }
//    }    

    // Check if a Declaration only contains a single ValuedObject.
    def private boolean _containsOnly(Declaration declaration, ValuedObject valuedObject) {
        (declaration.valuedObjects.contains(valuedObject))&&(declaration.valuedObjects.size == 1)
    }

    // Remove a specific ValuedObject.
    def private _removeValuedObject(Declaration declaration, ValuedObject valuedObject) {
         if (declaration.valuedObjects.contains(valuedObject)) {
           declaration.valuedObjects -= valuedObject  
         } 
    }
    
    // Add a ValuedObject.
    def private Declaration _addValuedObject(Declaration declaration, ValuedObject valuedObject) {
        declaration.valuedObjects.add(valuedObject)
        declaration
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
    
    def Expression fixHostCode(Expression expression) {
    	if (expression instanceof TextExpression) 
    		(expression as TextExpression).fixHostCodeInTextExpression
    	else if (expression instanceof OperatorExpression)
    		(expression as OperatorExpression).fixHostCodeInOperatorExpression	
    	else 
    		expression	
    }
    
    def TextExpression fixHostCodeInTextExpression(TextExpression expression) {
    	if (expression.text.startsWith("'")) return expression
    	else return expression.copy => [ setText("'" + expression.getText + "'") ]
    }
    
    def Expression fixHostCodeInOperatorExpression(OperatorExpression expression) {
    	if (expression == null || expression.subExpressions.nullOrEmpty) {
    		return expression
    	}
        val oeCopy = expression.copy
        oeCopy.subExpressions.clear
        expression.subExpressions.forEach [
        	oeCopy.subExpressions += it.copy.fixHostCode
        ]
        
        oeCopy
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
        valuedObject.setConst(valuedObjectWithAttributes.isConst)
        valuedObject.setExtern(valuedObjectWithAttributes.isExtern)
        valuedObject.setInitialValue(valuedObjectWithAttributes.initialValue.copy)
        valuedObject.setType(valuedObjectWithAttributes.type)
        valuedObject.setCombineOperator(valuedObjectWithAttributes.combineOperator)
        if (!valuedObjectWithAttributes.cardinalities.nullOrEmpty) {
            for (card : valuedObjectWithAttributes.cardinalities) {
                valuedObject.cardinalities.add(card);        
            }
        }
        valuedObject
    }
    
    def List<ValuedObjectReference> getAllReferences(Expression expression) {
        val list = <ValuedObjectReference> newArrayList
        if (expression instanceof ValuedObjectReference) {
            list += expression as ValuedObjectReference
        } else {
            list += expression.eAllContents.filter(typeof(ValuedObjectReference)).toList
        }
        return list
    }

    //    def public void addValuedObject(EObject eObject, ValuedObject valuedObject) {
    //        val declarations = eObject.eAllContents.filter(typeof(Declaration)); 
    //    }
    //
    //    def public void removeValuedObject(EObject eObject, ValuedObject valuedObject) {
    //        val declarations = eObject.eAllContents.filter(typeof(Declaration)).filter[valuedObjects.contains(valuedObject)].toList;
    //        for (declaration : declarations.immutableCopy) {
    //            declaration.valuedObjects.remove(valuedObject)
    //        } 
    //    }
    //    
    //    def private Declaration createDeclaration(ValuedObject valuedObject) {
    //    	createDeclaration() => [ valuedObjects += valuedObject ]
    //    }
    //    
    //    def private Declaration createDeclaration(List<ValuedObject> valueObjects) {
    //    	createDeclaration() => [ it.valuedObjects += valuedObjects ] 
    //    }
    //    
    //    
    //    def private Declaration copyAttributes(Declaration target, Declaration declaration) {
    //		target => [
    //			type = declaration.type
    //			input = declaration.input
    //			output = declaration.output
    //			signal = declaration.signal
    //			static = declaration.static
    //			Const = declaration.Const
    //		]    	
    //    }
    //    def private ValuedObject createValuedObject(Declaration declaration, String valuedObjectName) {
    //    	createValuedObject(valuedObjectName) => [ declaration.valuedObjects += it ]
    //    }
    //    
    //    def private ValuedObject createValuedObjectInDeclaration(String valuedObjectName) {
    //        val tg = createDeclaration 
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
    
    
    def void delete(Declaration declaration) {
    	declaration.valuedObjects.immutableCopy.forEach[ remove ]
    	declaration.remove
    }
    
    //===========  VARIABLES  ===========
    
    // Creates a new variable ValuedObject.
    def ValuedObject createVariable(String variableName) {
        createValuedObject(variableName)
    }
    
    def void delete(ValuedObject valuedObject) {
        val declaration = valuedObject.declaration
        valuedObject.remove
        if (declaration.valuedObjects.nullOrEmpty) declaration.remove
    }


    //============  SIGNALS  ============
    
    // Creates a new signal ValuedObject.
    def ValuedObject createSignal(Declaration declaration, String signalName) {
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
    
    def FunctionCall createFunctionCall() {
        KExpressionsFactory::eINSTANCE.createFunctionCall()
    }
    
    def Parameter createParameter() {
        KExpressionsFactory::eINSTANCE.createParameter()
    }

    // Create a text expression.
    def TextExpression createTextExpression(String text) {
        val expression = KExpressionsFactory::eINSTANCE.createTextExpression()
        expression.setText("'" + text + "'")
        expression
    }
    
}
