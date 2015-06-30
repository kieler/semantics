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

import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.CombineOperator
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.FloatValue
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.StringValue
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import java.util.Iterator

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
        } else {
            return valueType.getName;
        }
    }

    def dispatch CharSequence serialize(TextExpression hostCodeString) {
        "'" + hostCodeString.text + "'"
    }
    
//      ssm: old c code serialization, remove these lines after creating specific serialization for the 
//      c code generation backend.
//
    // Combine operator
//    def dispatch CharSequence serialize(CombineOperator combineOperator) {
//        if (combineOperator.equals(CombineOperator::ADD)) {
//            return 'COMBINE_ADD'
//        } else if (combineOperator.equals(CombineOperator::MULT)) {
//            return 'COMBINE_MULT'
//        } else if (combineOperator.equals(CombineOperator::MAX)) {
//            return 'COMBINE_MAX'
//        } else if (combineOperator.equals(CombineOperator::MIN)) {
//            return 'COMBINE_MIN'
//        } else if (combineOperator.equals(CombineOperator::OR)) {
//            return 'COMBINE_OR'
//        } else if (combineOperator.equals(CombineOperator::AND)) {
//            return 'OMBINE_AND'
//        }
//        // default case combine with +
//        return 'COMBINE_ADD';
//    }

//      ssm: old c code serialization, remove these lines after creating specific serialization for the 
//      c code generation backend.
//
//    def initialValue(CombineOperator combineOperator) {
//        if (combineOperator.equals(CombineOperator::ADD)) {
//            return '''0'''
//        } else if (combineOperator.equals(CombineOperator::MULT)) {
//            return '''1'''
//        } else if (combineOperator.equals(CombineOperator::MAX)) {
//            return '''-999999'''
//        } else if (combineOperator.equals(CombineOperator::MIN)) {
//            return '''999999'''
//        } else if (combineOperator.equals(CombineOperator::OR)) {
//            return '''0'''
//        } else if (combineOperator.equals(CombineOperator::AND)) {
//            return '''1'''
//        }
//        // default case combine with +
//        return '''0''';
//    }

    // -------------------------------------------------------------------------
    def String combineOperators(Iterator<Expression> expressions, String separator) {
        var s = ""
        while (expressions.hasNext) {
            s = s + expressions.next.serialize
            if(expressions.hasNext) s = s + separator;
        }
        s
    }

    // Expand a complex expression.
    def dispatch CharSequence serialize(OperatorExpression expression) {
        var result = ""
        
        if (expression.operator == OperatorType::EQ) {
            result = combineOperators(expression.subExpressions.iterator, " == ")
        } else if (expression.operator == OperatorType::LT) {
            result = combineOperators(expression.subExpressions.iterator, " < ")
        } else if (expression.operator == OperatorType::LEQ) {
            result = combineOperators(expression.subExpressions.iterator, " <= ")
        } else if (expression.operator == OperatorType::GT) {
            result = combineOperators(expression.subExpressions.iterator, " > ")
        } else if (expression.operator == OperatorType::GEQ) {
            result = combineOperators(expression.subExpressions.iterator, " >= ")
        } else if (expression.operator == OperatorType::NOT) {
            return "!" + expression.subExpressions.head.serialize
        } else if (expression.operator == OperatorType::VAL) {
//            if (expression.subExpressions.head instanceof OperatorExpression) {
//                result = "val" + expression.subExpressions.head.serialize
//            } else {
                return "val(" + expression.subExpressions.head.serialize + ")"
//            }
        } else if (expression.operator == OperatorType::PRE) {
//            if (expression.subExpressions.head instanceof OperatorExpression) {
//                result = "pre" + expression.subExpressions.head.serialize
//            } else {
                return "pre(" + expression.subExpressions.head.serialize + ")"
//            }
        } else 

//      ssm: old c code serialization, remove these lines after creating specific serialization for the 
//      c code generation backend.
//
//        if (expression.operator == OperatorType::VAL)
//            return "VAL_SCC(" + expression.subExpressions.head.serialize + ")"
//
//        if (expression.operator == OperatorType::PRE)
//            return "(PRE_" + expression.subExpressions.head.serialize + ")"

        if (expression.operator == OperatorType::NE) {
            result = combineOperators(expression.subExpressions.iterator, " != ")
        } else if (expression.operator == OperatorType::LOGICAL_AND) {
            result = combineOperators(expression.subExpressions.iterator, " && ")
        } else if (expression.operator == OperatorType::LOGICAL_OR) {
            result = combineOperators(expression.subExpressions.iterator, " || ")
        } else if (expression.operator == OperatorType::BITWISE_AND) {
            result = combineOperators(expression.subExpressions.iterator, " & ")
        } else if (expression.operator == OperatorType::BITWISE_OR) {
            result = combineOperators(expression.subExpressions.iterator, " | ")
        } else if (expression.operator == OperatorType::ADD) {
            result = combineOperators(expression.subExpressions.iterator, " + ")
        } else if (expression.operator == OperatorType::SUB) {
            result = combineOperators(expression.subExpressions.iterator, " - ")
        } else if (expression.operator == OperatorType::MULT) {
            result = combineOperators(expression.subExpressions.iterator, " * ")
        } else if (expression.operator == OperatorType::DIV) {
            result = combineOperators(expression.subExpressions.iterator, " / ")
        } else if (expression.operator == OperatorType::MOD) {
            result = combineOperators(expression.subExpressions.iterator, " % ")
        }  
            
        return "(" + result + ")"
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
        "\"" + expression.value + "\""
    }

    // Expand a boolean expression value (true or false).
    def dispatch CharSequence serialize(BoolValue expression) {
        if(expression.value == true) return "true"
        return "false"
    }

    def dispatch CharSequence serialize(FunctionCall functionCall) {
        var funcCall = functionCall.functionName + "("

        var cnt = 0
        for (par : functionCall.parameters) {
            if (cnt > 0) {
                funcCall = funcCall + ", "
            }
            if (par.pureOutput) {
                funcCall = funcCall + "!"
            }
            if (par.callByReference) {
                funcCall = funcCall + "&"
            }
            funcCall = funcCall + par.expression.serialize
            cnt = cnt + 1
        }
        funcCall = funcCall + ")"
        return "<" + funcCall + ">"
    }

    def dispatch CharSequence serialize(String s) {
        s
    }

    def dispatch CharSequence serialize(Void x) {
    }

    protected def CharSequence humanReadable(String s) {
//        if (s == null) {
//            return null
//        }
        if (s.startsWith("(") && s.endsWith(")")) {
            var counter = 1
            for(var i=1; i<s.length()-1; i++) {
                val subString = s.substring(i, i + 1)
                if (subString == "(") { 
                    counter++
                } else if (subString == ")") {
                    counter--
                }
                if (counter == 0) {
                    return s
                }
            }
            return s.substring(1,s.length - 1)
        }
        s
    }
    
    protected def CharSequence humanReadable(CharSequence cs) {
        cs.toString.humanReadable
    }
    
    dispatch def CharSequence serializeHR(Expression expression) {
        expression.serialize.humanReadable
    }
    
//    dispatch def CharSequence serializeHR(Void x) {
//        
//    }
   
}