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
package de.cau.cs.kieler.sccharts.legacy.kexpressions.extensions

import de.cau.cs.kieler.sccharts.legacy.kexpressions.BoolValue
import de.cau.cs.kieler.sccharts.legacy.kexpressions.CombineOperator
import de.cau.cs.kieler.sccharts.legacy.kexpressions.Expression
import de.cau.cs.kieler.sccharts.legacy.kexpressions.FloatValue
import de.cau.cs.kieler.sccharts.legacy.kexpressions.FunctionCall
import de.cau.cs.kieler.sccharts.legacy.kexpressions.IntValue
import de.cau.cs.kieler.sccharts.legacy.kexpressions.OperatorExpression
import de.cau.cs.kieler.sccharts.legacy.kexpressions.OperatorType
import de.cau.cs.kieler.sccharts.legacy.kexpressions.StringValue
import de.cau.cs.kieler.sccharts.legacy.kexpressions.TextExpression
import de.cau.cs.kieler.sccharts.legacy.kexpressions.ValueType
import de.cau.cs.kieler.sccharts.legacy.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.legacy.kexpressions.ValuedObjectReference
import java.util.Iterator

/**
 * Serialization of KExpressions.
 * 
 * @author ssm
 * 
 * @kieler.design 2014-09-04 proposed ssm
 * @kieler.rating 2014-09-04 proposed yellow
 *
 */
class KExpressionsSerializeExtensions {

   def dispatch CharSequence serialize(ValueType valueType) {
        return valueType.literal;
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
    protected def String combineOperators(Iterator<Expression> expressions, String separator) {
        var s = ""
        while (expressions.hasNext) {
            s = s + expressions.next.serialize
            if(expressions.hasNext) s = s + separator;
        }
        s
    }
    
    protected def CharSequence serializeOperatorExpressionEQ(OperatorExpression expression) {
    	combineOperators(expression.subExpressions.iterator, " == ")
    }
    
    protected def CharSequence serializeOperatorExpressionLT(OperatorExpression expression) {
    	combineOperators(expression.subExpressions.iterator, " < ")
    }
    
    protected def CharSequence serializeOperatorExpressionLEQ(OperatorExpression expression) {
    	combineOperators(expression.subExpressions.iterator, " <= ")
    }

    protected def CharSequence serializeOperatorExpressionGT(OperatorExpression expression) {
    	combineOperators(expression.subExpressions.iterator, " > ")
    }
    
    protected def CharSequence serializeOperatorExpressionGEQ(OperatorExpression expression) {
    	combineOperators(expression.subExpressions.iterator, " >= ")
    }
    
    protected def CharSequence serializeOperatorExpressionVAL(OperatorExpression expression) {
    	"val(" + expression.subExpressions.head.serialize + ")"
    }
    
    protected def CharSequence serializeOperatorExpressionPRE(OperatorExpression expression) {
    	"pre(" + expression.subExpressions.head.serialize + ")"
    }   
    
    protected def CharSequence serializeOperatorExpressionNot(OperatorExpression expression) {
    	"!" + expression.subExpressions.head.serialize
    }

    protected def CharSequence serializeOperatorExpressionNE(OperatorExpression expression) {
    	combineOperators(expression.subExpressions.iterator, " != ")
    }
    
    protected def CharSequence serializeOperatorExpressionLogicalAnd(OperatorExpression expression) {
    	combineOperators(expression.subExpressions.iterator, " && ")
    }
    
    protected def CharSequence serializeOperatorExpressionLogicalOr(OperatorExpression expression) {
    	combineOperators(expression.subExpressions.iterator, " || ")
    }
    
    protected def CharSequence serializeOperatorExpressionBitwiseAnd(OperatorExpression expression) {
    	combineOperators(expression.subExpressions.iterator, " & ")
    }    
    
    protected def CharSequence serializeOperatorExpressionBitwiseOr(OperatorExpression expression) {
    	combineOperators(expression.subExpressions.iterator, " | ")
    }

    protected def CharSequence serializeOperatorExpressionAdd(OperatorExpression expression) {
    	combineOperators(expression.subExpressions.iterator, " + ")
    }
    
    protected def CharSequence serializeOperatorExpressionSub(OperatorExpression expression) {
        if (expression.subExpressions.size == 1) {
            "-" + expression.subExpressions.head.serialize
        } else {
        	combineOperators(expression.subExpressions.iterator, " - ")
    	}
    }
    
    protected def CharSequence serializeOperatorExpressionMul(OperatorExpression expression) {
    	combineOperators(expression.subExpressions.iterator, " * ")
    }
    
    protected def CharSequence serializeOperatorExpressionDiv(OperatorExpression expression) {
    	combineOperators(expression.subExpressions.iterator, " / ")
    }        

    protected def CharSequence serializeOperatorExpressionMod(OperatorExpression expression) {
    	combineOperators(expression.subExpressions.iterator, " % ")
    }        
        
    // Expand a complex expression.
    protected def CharSequence serializeOperatorExpression(OperatorExpression expression) {
        var CharSequence result = ""
        
        if (expression.operator == OperatorType::EQ) {
            result = expression.serializeOperatorExpressionEQ
        } else if (expression.operator == OperatorType::LT) {
            result = expression.serializeOperatorExpressionLT
        } else if (expression.operator == OperatorType::LEQ) {
            result = expression.serializeOperatorExpressionLEQ
        } else if (expression.operator == OperatorType::GT) {
            result = expression.serializeOperatorExpressionGT
        } else if (expression.operator == OperatorType::GEQ) {
            result = expression.serializeOperatorExpressionGEQ
        } else if (expression.operator == OperatorType::NOT) {
            return expression.serializeOperatorExpressionNot
        } else if (expression.operator == OperatorType::VAL) {
            return expression.serializeOperatorExpressionVAL
        } else if (expression.operator == OperatorType::PRE) {
            return expression.serializeOperatorExpressionPRE
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
            result = expression.serializeOperatorExpressionNE
        } else if (expression.operator == OperatorType::LOGICAL_AND) {
            result = expression.serializeOperatorExpressionLogicalAnd
        } else if (expression.operator == OperatorType::LOGICAL_OR) {
            result = expression.serializeOperatorExpressionLogicalOr
        } else if (expression.operator == OperatorType::BITWISE_AND) {
            result = expression.serializeOperatorExpressionBitwiseAnd
        } else if (expression.operator == OperatorType::BITWISE_OR) {
            result = expression.serializeOperatorExpressionBitwiseOr
        } else if (expression.operator == OperatorType::ADD) {
            result = expression.serializeOperatorExpressionAdd
        } else if (expression.operator == OperatorType::SUB) {
            result = expression.serializeOperatorExpressionSub
        } else if (expression.operator == OperatorType::MULT) {
            result = expression.serializeOperatorExpressionMul
        } else if (expression.operator == OperatorType::DIV) {
            result = expression.serializeOperatorExpressionDiv
        } else if (expression.operator == OperatorType::MOD) {
            result = expression.serializeOperatorExpressionMod
        }  
            
        return result
    }
    
    
    def dispatch CharSequence serialize(CombineOperator combineOperator) {
        return switch (combineOperator) {
            case CombineOperator.ADD : "+" 
            case CombineOperator.MULT : "*" 
            case CombineOperator.MIN : "min" 
            case CombineOperator.MAX : "max"
            case CombineOperator.AND : "and"
            case CombineOperator.OR : "or"
            //FIXME discuss what to serialize in the host case
            case CombineOperator.HOST : "host"
            default: ""
        }
    }
    
        
    def dispatch CharSequence serialize(OperatorExpression expression) {
		val result = serializeOperatorExpression(expression)
		
		if ((expression.operator == OperatorType::NOT) || 
			(expression.operator == OperatorType::VAL) ||
			(expression.operator == OperatorType::PRE)) {
			return result
		}

		return "(" + result + ")"
	}

    // -------------------------------------------------------------------------
    def dispatch CharSequence serialize(ValuedObject valuedObject) {
        var vo = valuedObject.name
        for (index : valuedObject.cardinalities) {
            vo = vo + "[" + index.serialize + "]"
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

  
}