package de.cau.cs.kieler.kexpressions.extensions

import de.cau.cs.kieler.annotations.NamedObject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.IgnoreValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ParameterAccessType
import de.cau.cs.kieler.kexpressions.RandomCall
import de.cau.cs.kieler.kexpressions.RandomizeCall
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ValueTypeReference
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VectorValue
import java.util.Iterator
import java.util.List

/**
 * Serialization of KExpressions in human readable form.
 * 
 * @author ssm
 * 
 * @kieler.design 2015-06-30 proposed ssm
 * @kieler.rating 2015-06-30 proposed yellow
 *
 */
class KExpressionsSerializeHRExtensions extends KExpressionsSerializeExtensions {	

    protected def CharSequence humanReadable(String s) {
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
    
    def dispatch CharSequence serializeHR(ValuedObject valuedObject) {
        if( valuedObject.label !== null )
            return valuedObject.label
        var vo = valuedObject.name
        for (index : valuedObject.cardinalities) {
            vo = vo + "[" + index.serializeHR + "]"
        }
        vo
    }    

    def dispatch CharSequence serializeHR(ValuedObjectReference vor) {
        return vor.serializeVOR
    }
    
    def CharSequence serializeVOR(ValuedObjectReference valuedObjectReference) {
        if (valuedObjectReference.valuedObject === null) {
            System.err.println("Valued object reference is null! Cannot serialize: " + valuedObjectReference)
            return "<BROKEN_REFERENCE>"
        }
        var vo = valuedObjectReference.valuedObject.name
        if (vo.startsWith("^")) {
            vo = vo.substring(1)
        }
        for (index : valuedObjectReference.indices) {
            vo = vo + "[" + index.serializeHR + "]"
        }
        if( valuedObjectReference.valuedObject.label !== null )
            vo = valuedObjectReference.valuedObject.label
        if (valuedObjectReference.subReference !== null && valuedObjectReference.subReference.valuedObject !== null) {
            vo = vo + "." + valuedObjectReference.subReference.serializeVOR
        }
        vo
    }
    
    def dispatch CharSequence serializeHR(ValueTypeReference vtr) {
        return vtr.valueType.serializeHR
    }
    
    def dispatch CharSequence serializeHR(ReferenceCall referenceCall) {
        var text = new StringBuilder()
        if (referenceCall.super) {
            text.append("super.")
        }
        text.append(referenceCall.serializeVOR)
        text.append(referenceCall.parameters.serializeHRParameters)
        return text
    }    

    def dispatch CharSequence serializeHR(FunctionCall functionCall) {
        return "extern " + functionCall.functionName + functionCall.parameters.serializeHRParameters 
    }
    
    def dispatch CharSequence serializeHR(RandomCall randomCall) {
        return "random"
    }
    
    def dispatch CharSequence serializeHR(RandomizeCall randomizeCall) {
        return "randomize"
    }
    
    def CharSequence serializeHRParameters(List<Parameter> parameters) {
        parameters.serializeHRParameters("(", ")")
    }
        
    def CharSequence serializeHRParameters(List<Parameter> parameters, String start, String end) {
        val sb = new StringBuilder
        sb.append(start)
        var cnt = 0
        for (par : parameters) {
            if (cnt > 0) {
                sb.append(", ")
            }
            if (par.accessType === ParameterAccessType.PURE_OUTPUT) {
                sb.append("!&")
            }
            else if (par.accessType === ParameterAccessType.CALL_BY_REFERENCE) {
                sb.append("&")
            }
            if (par.expression === null) sb.append("NULL!!!") else 
            sb.append(par.expression.serializeHR)
            cnt = cnt + 1
        }
        sb.append(end) 
        return sb.toString      
    }    

    dispatch def CharSequence serializeHR(OperatorExpression expression) {
		val result = serializeHROperatorExpression(expression)
		if ((expression.operator == OperatorType::NOT) || 
			(expression.operator == OperatorType::VAL) ||
			(expression.operator == OperatorType::PRE)) {
			return result
		}
		
		if (expression.eContainer !== null && expression.eContainer instanceof OperatorExpression) {
			val parent = expression.eContainer as OperatorExpression
			if (expression.requiresParenthesis(parent)) {
				return "(" + result + ")"
			} else {
				return result
			}
		}

		return result
	}
	
	static val ALWAYS_OMIT_PARENTHESIS = newHashSet(OperatorType.LOGICAL_OR, OperatorType.LOGICAL_AND, OperatorType.NOT, OperatorType.ADD, OperatorType.SUB, OperatorType.MULT, OperatorType.BITWISE_AND, OperatorType.BITWISE_OR, OperatorType.BITWISE_XOR, OperatorType.BITWISE_NOT )
	protected def boolean requiresParenthesis(OperatorExpression expression, OperatorExpression parent) {
        val myOperator = expression.operator
        val parentOperator = parent.operator
	    val myPrecedence = myOperator.precedence
        val parentPrecedence = parentOperator.precedence
        
        if (myPrecedence > parentPrecedence) {
            return true
        }
        // Same precedence is not always associative, such as div! KISEMA-1394
        if (myPrecedence == parentPrecedence) {
            val position = parent.subExpressions.indexOf(expression)
            if (position == 0) { // redundant left associativity
                if (parent.subExpressions.size != 1 || parent.operator != OperatorType.SUB) {
                    // Exclude single minus 
                    return false
                }
            }
            // This will ignore user forces right associativity
            // TODO discuss if we really want this behavior
            if (myOperator == parentOperator && ALWAYS_OMIT_PARENTHESIS.contains(myOperator)) {
                return false
            }
            // This will ignore if user forces right associativity with + and -
            // TODO discuss if we really want this behavior
//            if (myOperator == OperatorType.ADD && parentOperator == OperatorType.SUB || myOperator == OperatorType.SUB && parentOperator == OperatorType.ADD) {
//                return false
//            }
            return true
        }
        return false
	}
	
	protected def int precedence(OperatorType operatorType) {
		if (operatorType == OperatorType::POSTFIX_ADD) return 1;
		if (operatorType == OperatorType::POSTFIX_SUB) return 1;
		if (operatorType == OperatorType::NOT) return 2;
		if (operatorType == OperatorType::BITWISE_NOT) return 2;
		if (operatorType == OperatorType::MULT) return 3;
		if (operatorType == OperatorType::DIV) return 3;
		if (operatorType == OperatorType::MOD) return 3;
		if (operatorType == OperatorType::ADD) return 4;
		if (operatorType == OperatorType::SUB) return 4;
        if (operatorType == OperatorType::SHIFT_LEFT) return 5;
        if (operatorType == OperatorType::SHIFT_RIGHT) return 5;
        if (operatorType == OperatorType::SHIFT_RIGHT_UNSIGNED) return 5;
		if (operatorType == OperatorType::LT) return 6;
		if (operatorType == OperatorType::LEQ) return 6;
		if (operatorType == OperatorType::GT) return 6;
		if (operatorType == OperatorType::GEQ) return 6;
		if (operatorType == OperatorType::EQ) return 7;
		if (operatorType == OperatorType::NE) return 7;
		if (operatorType == OperatorType::BITWISE_AND) return 8;
		if (operatorType == OperatorType::BITWISE_XOR) return 9;
		if (operatorType == OperatorType::BITWISE_OR) return 10;
		if (operatorType == OperatorType::LOGICAL_AND) return 11;
		if (operatorType == OperatorType::LOGICAL_OR) return 12;
		if (operatorType == OperatorType::CONDITIONAL) return 13;
		return 99
	}
	
    protected def String combineOperatorsHR(Iterator<Expression> expressions, String separator) {
        var s = ""
        if (!expressions.hasNext) {
            System.err.println("Serialization: An operator expression without sub-expressions occurred! " + 
                "This should not happen! Check your transformation!")
        }
        while (expressions.hasNext) {
            s = s + expressions.next.serializeHR
            if(expressions.hasNext) s = s + separator;
        }
        s
    }
    
    protected def CharSequence serializeHROperatorExpressionEQ(OperatorExpression expression) {
    	combineOperatorsHR(expression.subExpressions.iterator, " == ")
    }
    
    protected def CharSequence serializeHROperatorExpressionLT(OperatorExpression expression) {
    	combineOperatorsHR(expression.subExpressions.iterator, " < ")
    }
    
    protected def CharSequence serializeHROperatorExpressionLEQ(OperatorExpression expression) {
    	combineOperatorsHR(expression.subExpressions.iterator, " <= ")
    }

    protected def CharSequence serializeHROperatorExpressionGT(OperatorExpression expression) {
    	combineOperatorsHR(expression.subExpressions.iterator, " > ")
    }
    
    protected def CharSequence serializeHROperatorExpressionGEQ(OperatorExpression expression) {
    	combineOperatorsHR(expression.subExpressions.iterator, " >= ")
    }
    
    protected def CharSequence serializeHROperatorExpressionVAL(OperatorExpression expression) {
    	"val(" + expression.subExpressions.head.serializeHR + ")"
    }
    
    protected def CharSequence serializeHROperatorExpressionPRE(OperatorExpression expression) {
    	"pre(" + expression.subExpressions.head.serializeHR + ")"
    }

    protected def CharSequence serializeHROperatorExpressionINIT(OperatorExpression expression) {
        combineOperatorsHR(expression.subExpressions.iterator, " -> ")
    }

    protected def CharSequence serializeHROperatorExpressionFby(OperatorExpression expression) {
        combineOperatorsHR(expression.subExpressions.iterator, " fby ")
    }

    protected def CharSequence serializeHROperatorExpressionSfby(OperatorExpression expression) {
        combineOperatorsHR(expression.subExpressions.iterator, " sfby ")
    }
    
    protected def CharSequence serializeHROperatorExpressionNot(OperatorExpression expression) {
    	"!" + expression.subExpressions.head.serializeHR
    }

    protected def CharSequence serializeHROperatorExpressionNE(OperatorExpression expression) {
    	combineOperatorsHR(expression.subExpressions.iterator, " != ")
    }
    
    protected def CharSequence serializeHROperatorExpressionLogicalAnd(OperatorExpression expression) {
    	combineOperatorsHR(expression.subExpressions.iterator, " && ")
    }
    
    protected def CharSequence serializeHROperatorExpressionLogicalOr(OperatorExpression expression) {
    	combineOperatorsHR(expression.subExpressions.iterator, " || ")
    }
    
    protected def CharSequence serializeHROperatorExpressionBitwiseNot(OperatorExpression expression) {
        "~" + expression.subExpressions.head.serializeHR
    }
    
    protected def CharSequence serializeHROperatorExpressionBitwiseAnd(OperatorExpression expression) {
    	combineOperatorsHR(expression.subExpressions.iterator, " & ")
    }    
    
    protected def CharSequence serializeHROperatorExpressionBitwiseOr(OperatorExpression expression) {
    	combineOperatorsHR(expression.subExpressions.iterator, " | ")
    }
    
    protected def CharSequence serializeHROperatorExpressionBitwiseXOr(OperatorExpression expression) {
        combineOperatorsHR(expression.subExpressions.iterator, " ^ ")
    }

    protected def CharSequence serializeHROperatorExpressionShiftLeft(OperatorExpression expression) {
        combineOperators(expression.subExpressions.iterator, " << ")
    }
    
    protected def CharSequence serializeHROperatorExpressionShiftRight(OperatorExpression expression) {
        combineOperators(expression.subExpressions.iterator, " >> ")
    }
    
    protected def CharSequence serializeHROperatorExpressionShiftRightUnsigned(OperatorExpression expression) {
        combineOperators(expression.subExpressions.iterator, " >>> ")
    }

    protected def CharSequence serializeHROperatorExpressionAdd(OperatorExpression expression) {
    	combineOperatorsHR(expression.subExpressions.iterator, " + ")
    }
    
    protected def CharSequence serializeHROperatorExpressionSub(OperatorExpression expression) {
        if (expression.subExpressions.size == 1) {
            "-" + expression.subExpressions.head.serializeHR
        } else {
    	   combineOperatorsHR(expression.subExpressions.iterator, " - ")
        }
    }
    
    protected def CharSequence serializeHROperatorExpressionMul(OperatorExpression expression) {
    	combineOperatorsHR(expression.subExpressions.iterator, " * ")
    }
    
    protected def CharSequence serializeHROperatorExpressionDiv(OperatorExpression expression) {
    	combineOperatorsHR(expression.subExpressions.iterator, " / ")
    }        

    protected def CharSequence serializeHROperatorExpressionMod(OperatorExpression expression) {
    	combineOperatorsHR(expression.subExpressions.iterator, " % ")
    }        
    
    protected def CharSequence serializeHROperatorExpressionConditional(OperatorExpression expression) {
        if (expression.subExpressions.size == 2 || expression.subExpressions.size == 3 ) {
            return expression.subExpressions.head.serializeHR + " ? " +
                expression.subExpressions.get(1).serializeHR
                + if (expression.subExpressions.size == 3) " : " + expression.subExpressions.get(2).serializeHR else ""
        } else {
            throw new IllegalArgumentException("An OperatorExpression with a ternary conditional has " + 
                expression.subExpressions.size + " arguments.")
        }
    } 
            
    // Expand a complex expression.
    protected def CharSequence serializeHROperatorExpression(OperatorExpression expression) {
        var CharSequence result = ""
        
        if (expression.operator == OperatorType::EQ) {
            result = expression.serializeHROperatorExpressionEQ
        } else if (expression.operator == OperatorType::LT) {
            result = expression.serializeHROperatorExpressionLT
        } else if (expression.operator == OperatorType::LEQ) {
            result = expression.serializeHROperatorExpressionLEQ
        } else if (expression.operator == OperatorType::GT) {
            result = expression.serializeHROperatorExpressionGT
        } else if (expression.operator == OperatorType::GEQ) {
            result = expression.serializeHROperatorExpressionGEQ
        } else if (expression.operator == OperatorType::NOT) {
            return expression.serializeHROperatorExpressionNot
        } else if (expression.operator == OperatorType::VAL) {
            return expression.serializeHROperatorExpressionVAL
        } else if (expression.operator == OperatorType::PRE) {
            return expression.serializeHROperatorExpressionPRE
        } else if (expression.operator == OperatorType::INIT) {
            return expression.serializeHROperatorExpressionINIT
        } else if (expression.operator == OperatorType::FBY) {
            return expression.serializeHROperatorExpressionFby
        } else if (expression.operator == OperatorType::SFBY) {
            return expression.serializeHROperatorExpressionSfby
        } else if (expression.operator == OperatorType::NE) {
            result = expression.serializeHROperatorExpressionNE
        } else if (expression.operator == OperatorType::LOGICAL_AND) {
            result = expression.serializeHROperatorExpressionLogicalAnd
        } else if (expression.operator == OperatorType::LOGICAL_OR) {
            result = expression.serializeHROperatorExpressionLogicalOr
        } else if (expression.operator == OperatorType::BITWISE_NOT) {
            return expression.serializeHROperatorExpressionBitwiseNot
        } else if (expression.operator == OperatorType::BITWISE_AND) {
            result = expression.serializeHROperatorExpressionBitwiseAnd
        } else if (expression.operator == OperatorType::BITWISE_OR) {
            result = expression.serializeHROperatorExpressionBitwiseOr
        } else if (expression.operator == OperatorType::BITWISE_XOR) {
            result = expression.serializeHROperatorExpressionBitwiseXOr
        } else if (expression.operator == OperatorType::SHIFT_LEFT) {
            result = expression.serializeOperatorExpressionShiftLeft
        } else if (expression.operator == OperatorType::SHIFT_RIGHT) {
            result = expression.serializeOperatorExpressionShiftRight
        } else if (expression.operator == OperatorType::SHIFT_RIGHT_UNSIGNED) {
            result = expression.serializeOperatorExpressionShiftRightUnsigned
        } else if (expression.operator == OperatorType::ADD) {
            result = expression.serializeHROperatorExpressionAdd
        } else if (expression.operator == OperatorType::SUB) {
            result = expression.serializeHROperatorExpressionSub
        } else if (expression.operator == OperatorType::MULT) {
            result = expression.serializeHROperatorExpressionMul
        } else if (expression.operator == OperatorType::DIV) {
            result = expression.serializeHROperatorExpressionDiv
        } else if (expression.operator == OperatorType::MOD) {
            result = expression.serializeHROperatorExpressionMod
        } else if (expression.operator == OperatorType::CONDITIONAL) {
            result = expression.serializeHROperatorExpressionConditional
        }  
            
        return result
    }
    
    dispatch def CharSequence serializeHR(OperatorType operator) {
        var CharSequence result = ""
        
        if (operator == OperatorType::EQ) {
            result = "=="
        } else if (operator == OperatorType::LT) {
            result = "<"
        } else if (operator == OperatorType::LEQ) {
            result = "<="
        } else if (operator == OperatorType::GT) {
            result = ">"
        } else if (operator == OperatorType::GEQ) {
            result = ">="
        } else if (operator == OperatorType::NOT) {
            return "!"
        } else if (operator == OperatorType::VAL) {
            return "val"
        } else if (operator == OperatorType::PRE) {
            return "pre"
        } else if (operator == OperatorType::FBY) {
            return "->"
        } else if (operator == OperatorType::NE) {
            result = "~"
        } else if (operator == OperatorType::LOGICAL_AND) {
            result = "&&"
        } else if (operator == OperatorType::LOGICAL_OR) {
            result = "||"
        } else if (operator == OperatorType::BITWISE_NOT) {
            return "~"
        } else if (operator == OperatorType::BITWISE_AND) {
            result = "&"
        } else if (operator == OperatorType::BITWISE_OR) {
            result = "|"
        } else if (operator == OperatorType::BITWISE_XOR) {
            result = "^"
        } else if (operator == OperatorType::ADD) {
            result = "+"
        } else if (operator == OperatorType::SUB) {
            result = "-"
        } else if (operator == OperatorType::MULT) {
            result = "*"
        } else if (operator == OperatorType::DIV) {
            result = "/"
        } else if (operator == OperatorType::MOD) {
            result = "%"
        }  
            
        return result
    }  
    
    def dispatch CharSequence serializeHR(VectorValue expression) {
        if (expression.range) {
            return "{" + expression.values.head?.serializeHR + " to " + expression.values.last?.serializeHR + "}"
        } else {
            var s = "{"
            for (value : expression.values) {
                s = s + value.serializeHR + ", "
            }
            return s.substring(0, s.length - 2) + "}"
        }
    }    
    
    def dispatch CharSequence serializeHR(IgnoreValue expression) {
        "_"
    }
    
    def dispatch CharSequence serializeHR(NamedObject namedObject) {
        "NamedObject \"" + namedObject.name + "\""
    }
    
    dispatch def CharSequence serializeHR(Expression expression) {
        expression.serialize.humanReadable
    }

	dispatch def CharSequence serializeHR(Object object) {
	    // Fallback on non human readable mode
		object.serialize
	}
}