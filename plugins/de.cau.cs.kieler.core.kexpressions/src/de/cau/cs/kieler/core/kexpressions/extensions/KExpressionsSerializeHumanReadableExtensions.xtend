package de.cau.cs.kieler.core.kexpressions.extensions

import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsSerializeExtensions
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import org.eclipse.emf.ecore.EObject
import java.util.Iterator

/**
 * @author ssm
 * 
 * @kieler.design 2015-06-30 proposed ssm
 * @kieler.rating 2015-06-30 proposed yellow
 *
 */
class KExpressionsSerializeHumanReadableExtensions extends KExpressionsSerializeExtensions {	

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
    
    


    def dispatch CharSequence serializeHR(ValuedObjectReference valuedObjectReference) {
        var vo = valuedObjectReference.valuedObject.name
        for (index : valuedObjectReference.indices) {
            vo = vo + "[" + index.serializeHR + "]"
        }
        vo
    }

    def dispatch CharSequence serializeHR(FunctionCall functionCall) {
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
            funcCall = funcCall + par.expression.serializeHR
            cnt = cnt + 1
        }
        funcCall = funcCall + ")"
        return "<" + funcCall + ">"
    }


//    protected def CharSequence serializeHROperatorExpressionVAL(OperatorExpression expression) {
//    	"val(" + expression.subExpressions.head.serializeHR + ")"
//    }
//    
//    protected def CharSequence serializeHROperatorExpressionPRE(OperatorExpression expression) {
//    	"pre(" + expression.subExpressions.head.serializeHR + ")"
//    }   
//    
//    protected def CharSequence serializeHROperatorExpressionNot(OperatorExpression expression) {
//    	"!" + expression.subExpressions.head.serializeHR
//    }
//
//    // Expand a complex expression.
//    protected def CharSequence serializeHROperatorExpression(OperatorExpression expression) {
//        var CharSequence result = ""
//        
//        if (expression.operator == OperatorType::EQ) {
//            result = expression.serializeOperatorExpressionEQ
//        } else if (expression.operator == OperatorType::LT) {
//            result = expression.serializeOperatorExpressionLT
//        } else if (expression.operator == OperatorType::LEQ) {
//            result = expression.serializeOperatorExpressionLEQ
//        } else if (expression.operator == OperatorType::GT) {
//            result = expression.serializeOperatorExpressionGT
//        } else if (expression.operator == OperatorType::GEQ) {
//            result = expression.serializeOperatorExpressionGEQ
//        } else if (expression.operator == OperatorType::NOT) {
//            return expression.serializeHROperatorExpressionNot
//        } else if (expression.operator == OperatorType::VAL) {
//            return expression.serializeHROperatorExpressionVAL
//        } else if (expression.operator == OperatorType::PRE) {
//            return expression.serializeHROperatorExpressionPRE
//        } else 
//        if (expression.operator == OperatorType::NE) {
//            result = expression.serializeOperatorExpressionNE
//        } else if (expression.operator == OperatorType::LOGICAL_AND) {
//            result = expression.serializeOperatorExpressionLogicalAnd
//        } else if (expression.operator == OperatorType::LOGICAL_OR) {
//            result = expression.serializeOperatorExpressionLogicalOr
//        } else if (expression.operator == OperatorType::BITWISE_AND) {
//            result = expression.serializeOperatorExpressionBitwiseAnd
//        } else if (expression.operator == OperatorType::BITWISE_OR) {
//            result = expression.serializeOperatorExpressionBitwiseOr
//        } else if (expression.operator == OperatorType::ADD) {
//            result = expression.serializeOperatorExpressionAdd
//        } else if (expression.operator == OperatorType::SUB) {
//            result = expression.serializeOperatorExpressionSub
//        } else if (expression.operator == OperatorType::MULT) {
//            result = expression.serializeOperatorExpressionMul
//        } else if (expression.operator == OperatorType::DIV) {
//            result = expression.serializeOperatorExpressionDiv
//        } else if (expression.operator == OperatorType::MOD) {
//            result = expression.serializeOperatorExpressionMod
//        }  
//            
//        return result
//    }
    
    dispatch def CharSequence serializeHR(OperatorExpression expression) {
		val result = serializeHROperatorExpression(expression)
		if ((expression.operator == OperatorType::NOT) || 
			(expression.operator == OperatorType::VAL) ||
			(expression.operator == OperatorType::PRE)) {
			return result
		}
		
		if (expression.eContainer != null && expression.eContainer instanceof OperatorExpression) {
			val myPrecedence = expression.operator.precedence
			val parentPrecedence = (expression.eContainer as OperatorExpression).operator.precedence
			if (myPrecedence >= parentPrecedence) {
				return "(" + result + ")"
			} else {
				return result
			}
		}

		return result
	}
	
	protected def int precedence(OperatorType operatorType) {
		if (operatorType == OperatorType::POSTFIX_ADD) return 1;
		if (operatorType == OperatorType::POSTFIX_SUB) return 1;
		if (operatorType == OperatorType::NOT) return 2;
		if (operatorType == OperatorType::MULT) return 3;
		if (operatorType == OperatorType::DIV) return 3;
		if (operatorType == OperatorType::MOD) return 3;
		if (operatorType == OperatorType::ADD) return 4;
		if (operatorType == OperatorType::SUB) return 4;
		if (operatorType == OperatorType::LT) return 6;
		if (operatorType == OperatorType::LEQ) return 6;
		if (operatorType == OperatorType::GT) return 6;
		if (operatorType == OperatorType::GEQ) return 6;
		if (operatorType == OperatorType::EQ) return 7;
		if (operatorType == OperatorType::NE) return 7;
		if (operatorType == OperatorType::BITWISE_AND) return 8;
		if (operatorType == OperatorType::BITWISE_OR) return 10;
		if (operatorType == OperatorType::LOGICAL_AND) return 11;
		if (operatorType == OperatorType::LOGICAL_OR) return 12;
		return 99
	}
	
    protected def String combineOperatorsHR(Iterator<Expression> expressions, String separator) {
        var s = ""
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
    
    protected def CharSequence serializeHROperatorExpressionBitwiseAnd(OperatorExpression expression) {
    	combineOperatorsHR(expression.subExpressions.iterator, " & ")
    }    
    
    protected def CharSequence serializeHROperatorExpressionBitwiseOr(OperatorExpression expression) {
    	combineOperatorsHR(expression.subExpressions.iterator, " | ")
    }

    protected def CharSequence serializeHROperatorExpressionAdd(OperatorExpression expression) {
    	combineOperatorsHR(expression.subExpressions.iterator, " + ")
    }
    
    protected def CharSequence serializeHROperatorExpressionSub(OperatorExpression expression) {
    	combineOperatorsHR(expression.subExpressions.iterator, " - ")
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
        } else if (expression.operator == OperatorType::NE) {
            result = expression.serializeHROperatorExpressionNE
        } else if (expression.operator == OperatorType::LOGICAL_AND) {
            result = expression.serializeHROperatorExpressionLogicalAnd
        } else if (expression.operator == OperatorType::LOGICAL_OR) {
            result = expression.serializeHROperatorExpressionLogicalOr
        } else if (expression.operator == OperatorType::BITWISE_AND) {
            result = expression.serializeHROperatorExpressionBitwiseAnd
        } else if (expression.operator == OperatorType::BITWISE_OR) {
            result = expression.serializeHROperatorExpressionBitwiseOr
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
        }  
            
        return result
    }	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    dispatch def CharSequence serializeHR(Expression expression) {
        expression.serialize.humanReadable
    }
//    dispatch def CharSequence serializeHR(Void x) {
//        
//    }

	dispatch def CharSequence serializeHR(EObject eObject) {
		
	}
}