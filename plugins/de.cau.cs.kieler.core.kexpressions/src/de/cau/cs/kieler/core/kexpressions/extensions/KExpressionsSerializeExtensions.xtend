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
package de.cau.cs.kieler.core.kexpressions.extensions

import de.cau.cs.kieler.core.kexpressions.CombineOperator
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.Expression
import java.util.List
import java.util.Iterator
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.FloatValue
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.StringValue

/**
 * @author ssm
 * 
 * @kieler.design 2014-09-04 proposed ssm
 * @kieler.rating 2014-09-04 proposed yellow
 *
 */
class KExpressionsSerializeExtensions {

   def dispatch CharSequence serialize(ValueType valueType) {
       if (valueType == ValueType::BOOL) {
           return 'bool'
       }
       else {
           return valueType.getName;
       }
   }    
   
   def dispatch CharSequence serialize(TextExpression hostCodeString) {
        hostCodeString.text
   }

   // Combine operator
   def dispatch CharSequence serialize(CombineOperator combineOperator) {
       if (combineOperator.equals(CombineOperator::ADD)) {
          return 'COMBINE_ADD'
       }
       else if (combineOperator.equals(CombineOperator::MULT)) {
          return 'COMBINE_MULT'
       }
       else if (combineOperator.equals(CombineOperator::MAX)) {
          return 'COMBINE_MAX'
       }
       else if (combineOperator.equals(CombineOperator::MIN)) {
          return 'COMBINE_MIN'
       }
       else if (combineOperator.equals(CombineOperator::OR)) {
          return 'COMBINE_OR'
       }
       else if (combineOperator.equals(CombineOperator::AND)) {
          return 'OMBINE_AND'
       }
       // default case combine with +
       return 'COMBINE_ADD';
   }

   def initialValue(CombineOperator combineOperator) {
       if (combineOperator.equals(CombineOperator::ADD)) {
          return '''0'''
       }
       else if (combineOperator.equals(CombineOperator::MULT)) {
          return '''1'''
       }
       else if (combineOperator.equals(CombineOperator::MAX)) {
          return '''-999999'''
       }
       else if (combineOperator.equals(CombineOperator::MIN)) {
          return '''999999'''
       }
       else if (combineOperator.equals(CombineOperator::OR)) {
          return '''0'''
       }
       else if (combineOperator.equals(CombineOperator::AND)) {
          return '''1'''
       }
       // default case combine with +
       return '''0''';
   }

   // -------------------------------------------------------------------------
   
    def CharSequence combineOperators(Iterator<Expression> expressions, String separator) {
        var s = ""
        while(expressions.hasNext){
            s = s + expressions.next.serialize
            if (expressions.hasNext) s = s + separator;
        }
        s
    }
   
   //Expand a complex expression.
    def dispatch CharSequence serialize(OperatorExpression expression) {
        if (expression.operator  == OperatorType::EQ) 
            return combineOperators(expression.subExpressions.iterator, " == ")   

        if (expression.operator  == OperatorType::LT) 
            return combineOperators(expression.subExpressions.iterator, " < ")   
        
        if (expression.operator  == OperatorType::LEQ) 
            return combineOperators(expression.subExpressions.iterator, " <= ")   
    
        if (expression.operator  == OperatorType::GT) 
            return combineOperators(expression.subExpressions.iterator, " > ")   
        
        if (expression.operator  == OperatorType::GEQ) 
            return combineOperators(expression.subExpressions.iterator, " >= ")
               
        if (expression.operator  == OperatorType::NOT) 
            return "!" + expression.subExpressions.head.serialize   
        
        if (expression.operator  == OperatorType::VAL) 
            return "VAL_SCC(" + expression.subExpressions.head.serialize + ")"

        if (expression.operator  == OperatorType::PRE) 
            return "(PRE_" + expression.subExpressions.head.serialize + ")"   
        
        if (expression.operator  == OperatorType::NE) 
            return combineOperators(expression.subExpressions.iterator, " != ")
               
        if (expression.operator  == OperatorType::AND) 
            return combineOperators(expression.subExpressions.iterator, " && ")
               
        if (expression.operator  == OperatorType::OR) 
            return combineOperators(expression.subExpressions.iterator, " || ")
               
        if (expression.operator  == OperatorType::ADD) 
            return combineOperators(expression.subExpressions.iterator, " + ")
               
        if (expression.operator  == OperatorType::SUB) 
            return combineOperators(expression.subExpressions.iterator, " - ")
               
        if (expression.operator  == OperatorType::MULT) 
            return combineOperators(expression.subExpressions.iterator, " * ")
               
        if (expression.operator  == OperatorType::DIV) 
            return combineOperators(expression.subExpressions.iterator, " / ")
               
        if (expression.operator  == OperatorType::MOD) 
            return combineOperators(expression.subExpressions.iterator, " % ")
   }

   // -------------------------------------------------------------------------
    
   def dispatch CharSequence serialize(ValuedObject valuedObject) {
       var vo = valuedObject.name
       for (index : valuedObject.cardinalities) {
           vo = vo + "[" + index.toString + "]"
       }
       vo
   }

   def dispatch CharSequence serialize(ValuedObjectReference valuedObjectReference) {
       var vo = valuedObjectReference.valuedObject.name
       for (index : valuedObjectReference.indices) {
           vo = vo + "[" + index.serialize + "]"
       }
       vo
   }
   
   // Expand a int expression value.
   def dispatch CharSequence serialize(IntValue expression) {
        expression.value.toString
   }

   // Expand a float expression value.
   def dispatch CharSequence serialize(FloatValue expression) {
        expression.value.toString
   }
   
   def dispatch CharSequence serialize(StringValue expression) {
       expression.value
   }

   // Expand a boolean expression value (true or false).
   def dispatch CharSequence serialize(BoolValue expression) {
        if (expression.value == true) return "true"
        return "false"
   }
   
    def dispatch CharSequence serialize(FunctionCall functionCall) {
        var funcCall = functionCall.functionName + "("
        
        var cnt = 0
        for(par : functionCall.parameters) {
            if (cnt>0) { funcCall = funcCall + ", " }
            if (par.callByReference) { funcCall = funcCall + "&" }
            funcCall = funcCall + par.expression.serialize
            cnt = cnt + 1
        }
        funcCall = funcCall + ")"
        funcCall
   }    
   
   def dispatch CharSequence serialize(String s) {
       s
   }
   
   def dispatch CharSequence serialize(Void x) {
       
   }
    
}