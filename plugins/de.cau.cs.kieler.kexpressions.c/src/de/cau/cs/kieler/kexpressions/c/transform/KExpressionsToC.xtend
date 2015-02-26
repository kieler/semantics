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
package de.cau.cs.kieler.kexpressions.c.transform

import de.cau.cs.kieler.core.kexpressions.Declaration
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.Parameter
import de.cau.cs.kieler.core.kexpressions.OperatorType
import java.util.List
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.core.kexpressions.StringValue
import de.cau.cs.kieler.core.kexpressions.FloatValue
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference

/**
 * This class generates C Code for KExpressions
 * 
 * @author cbu
 *
 */
class KExpressionsToC {
    
    /**
     * Transforms a list of Declaration
     * 
     * @param declarations
     *          List of declarations
     */
    def String transformDeclarations(EList<Declaration> declarations){
        '''
        «FOR d : declarations»
            «IF d.extern && d.const» 
            extern const «transformValuedObjects(d.type, d.valuedObjects)»
            «ELSEIF d.static && d.const» 
            static const «transformValuedObjects(d.type, d.valuedObjects)»
            «ELSEIF d.extern»
            extern «transformValuedObjects(d.type, d.valuedObjects)»
            «ELSEIF d.static»
            static «transformValuedObjects(d.type, d.valuedObjects)»
            «ELSEIF d.const»
            const «transformValuedObjects(d.type, d.valuedObjects)»
            «ELSE»
            «transformValuedObjects(d.type, d.valuedObjects)»
            «ENDIF»
        «ENDFOR»
        '''
    }
    
    /**
     * Transforms a list of valuedObjects from a given type for declarations
     * 
     * @param type
     *          Type of valuedObject
     * @param objects
     *          List of valuedObjects
     */
    private def String transformValuedObjects(ValueType type, EList<ValuedObject> objects){   
       '''
       «FOR o : objects»
            «type» «o.name»«IF o.cardinalities.length > 0»«o.cardinalities»«ENDIF»;
       «ENDFOR» 
       '''
    }
    
    /**
     * Transforms a ValuedObjectReference
     * 
     * @param ref
     *          ValuedObjectReference
     */
    def dispatch String transformExpression(ValuedObjectReference ref){
        '''«ref.valuedObject.name»«IF !ref.indices.empty»«transformExpressions(ref.indices)»«ENDIF»'''    
    }
    
    /**
     * Transforms a IntValue
     * 
     * @param value
     *          IntValue 
     */
    def dispatch String transformExpression(IntValue value){
        '''«value.value»'''     
    }
     /**
     * Transforms an BoolValue
     * 
     * @param value
     *          BoolValue 
     */
    def dispatch String transformExpression(BoolValue value){
        '''«value.value»'''     
    }
     /**
     * Transforms a FloatValue
     * 
     * @param value
     *          FloatValue 
     */
    def dispatch String transformExpression(FloatValue value){
        '''«value.value»'''     
    }
     /**
     * Transforms a StringValue
     * 
     * @param value
     *          StringValue 
     */
    def dispatch String transformExpression(StringValue value){
        '''«value.value»'''
    }
    

    /**
     * Transforms an OperatorExpression
     * 
     * @param opExp
     *          OperatorExpression
     */
    def dispatch String transformExpression(OperatorExpression opExp){       
        var operator = transformOperators(opExp.operator)
        var subexpressions = opExp.subExpressions
        if (subexpressions.length == 1){
            System.out.println(operator+" "+transformExpression(subexpressions.head))
            '''«transformFirstOperator(opExp.operator)»«transformExpression(subexpressions.head)»'''
        } else {
            var lastexpression = subexpressions.last
            subexpressions.remove(lastexpression)
            '''«FOR s : subexpressions»«transformExpression(s)» «operator» «ENDFOR»«transformExpression(lastexpression)»'''
        }
    }
    
    /**
     * Transforms a TextExpression
     * 
     * @param textExp
     *          TextExpression
     */
    def dispatch String transformExpression(TextExpression textExp){
        '''«textExp.text»'''
    }
    
    /**
     * Transforms FunctionCall
     * 
     * @param funcCall
     *          functionCall
     */
    // does this really exist?
    def dispatch String transformExpression(FunctionCall funcCall){
        var newString = ""
        for (p : funcCall.parameters){
            newString = newString + transformParameter(p) + ","
        }
        '''«funcCall.functionName»(«newString.substring(0, newString.length()-1)»)'''
    }
    
    /**
     * Transforms a list of Expressions
     * 
     * @param indices
     *          List of Expressions
     */
    def String transformExpressions(List<Expression> indices){
        '''[«FOR i : indices»«transformExpression(i)»«ENDFOR»]'''
    }
    
    /**
     * Transforms operators
     * 
     * @param operatortype
     *          Operator
     */
    private def String transformOperators(OperatorType operatortype){
        if (operatortype.getName() == "AND"){
            '''&&'''
        } else if (operatortype.getName() == "OR"){
            '''||'''
        } else {
            '''«operatortype»'''
        }
        
    }
    
    /**
     * Transforms operators which are only applied to a single argument
     * 
     * @param operatortype
     *          Operator
     */
    private def String transformFirstOperator(OperatorType operatortype){
        if (operatortype.getName() == "NOT" || operatortype.getName() == "SUB" || operatortype.getName() == "ADD"){
            '''«operatortype»'''
        } else {
            ''''''
        }
    }
    
    /**
     * Transforms Parameter
     * 
     * @param p
     *          parameter
     */    
    private def String transformParameter(Parameter p){
        if (p.callByReference){
            '''*«transformExpression(p.expression)»'''
        } else {
            '''«transformExpression(p.expression)»'''
        }
    }
}