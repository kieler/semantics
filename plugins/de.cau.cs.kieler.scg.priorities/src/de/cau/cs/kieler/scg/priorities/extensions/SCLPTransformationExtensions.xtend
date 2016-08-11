/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.priorities.extensions

import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.FloatValue
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.StringValue
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import java.util.ArrayList
import java.util.List

/**
 * Some helper functions for the translation from the SCG to SCL_p Code
 * 
 * @author lpe
 *
 */
class SCLPTransformationExtensions {
    
    
    /**
     * Translates a valuedObjectReference
     * 
     */
    dispatch def expand(StringBuilder sb, ValuedObjectReference valuedObjectReference) {
        if(!valuedObjectReference.indices.nullOrEmpty) {
            sb.expand_val_array(valuedObjectReference.valuedObject, valuedObjectReference.indices)
        } else {
            sb.expand(valuedObjectReference.valuedObject)
        }
    }
    
    
    /**
     *  Translates a valued Object by taking its name
     * 
     */
    dispatch def expand(StringBuilder sb, ValuedObject vo) {
        sb.append(vo.name)
    }
    
    
    /**
     *  Translates an integer value
     */
    dispatch def expand(StringBuilder sb, IntValue value) {
        sb.append(value.value)
    }
    
    
    /**
     *  Translates a float value
     * 
     */
    dispatch def expand(StringBuilder sb, FloatValue value) {
        sb.append(value.value)
    }
    
    /**
     *  Translates a boolean value
     * 
     */
    dispatch def expand(StringBuilder sb, BoolValue value) {
        if(value.value == true) {
            sb.append("true")
        } else {
            sb.append("false")
        }
    }
    
    
    /**
     *  Translates a String Value
     */
    dispatch def expand(StringBuilder sb, StringValue value) {
        sb.append(value.value)
    }
    
    /**
     *  Translates textExpressions
     */
    dispatch def expand(StringBuilder sb, TextExpression expression) {
        sb.append(expression.text)
    }
    
    
    /**
     *  Translates an OperatorExpression by appending the operator as well as translating the subexpressions
     */
    dispatch def expand(StringBuilder sb, OperatorExpression expression) {
        switch(expression.operator) {
            case OperatorType::ADD: {
                sb.expand(expression.subExpressions.head)
                for(subExpression : expression.subExpressions.tail) {
                    sb.append(" + ")
                    sb.append("(")
                    sb.expand(subExpression)
                    sb.append(")")                
                }
            }
            case OperatorType::SUB: {
                sb.expand(expression.subExpressions.head)
                for(subExpression : expression.subExpressions.tail) {
                    sb.append(" - ")
                    sb.append("(")
                    sb.expand(subExpression)
                    sb.append(")")                
                }
            }
            case OperatorType::MULT: {
                sb.expand(expression.subExpressions.head)
                for(subExpression : expression.subExpressions.tail) {
                    sb.append(" * ")
                    sb.append("(")
                    sb.expand(subExpression)
                    sb.append(")")                
                }
            }
            case OperatorType::DIV: {
                sb.expand(expression.subExpressions.head)
                for(subExpression : expression.subExpressions.tail) {
                    sb.append(" / ")
                    sb.append("(")
                    sb.expand(subExpression)
                    sb.append(")")                
                }
            }
            case OperatorType::MOD: {
                sb.expand(expression.subExpressions.head)
                for(subExpression : expression.subExpressions.tail) {
                    sb.append(" % ")
                    sb.append("(")
                    sb.expand(subExpression)
                    sb.append(")")                
                }
            }
            case OperatorType::GEQ: {
                sb.expand(expression.subExpressions.head)
                for(subExpression : expression.subExpressions.tail) {
                    sb.append(" >= ")
                    sb.append("(")
                    sb.expand(subExpression)
                    sb.append(")")                
                }
            }
            case OperatorType::GT: {
                sb.expand(expression.subExpressions.head)
                for(subExpression : expression.subExpressions.tail) {
                    sb.append(" > ")
                    sb.append("(")
                    sb.expand(subExpression)
                    sb.append(")")                
                }
            }
            case OperatorType::EQ: {
                sb.expand(expression.subExpressions.head)
                for(subExpression : expression.subExpressions.tail) {
                    sb.append(" == ")
                    sb.append("(")
                    sb.expand(subExpression)
                    sb.append(")")                
                }
            }
            case OperatorType::LEQ: {
                sb.expand(expression.subExpressions.head)
                for(subExpression : expression.subExpressions.tail) {
                    sb.append(" <= ")
                    sb.append("(")
                    sb.expand(subExpression)
                    sb.append(")")                
                }
            }
            case OperatorType::LT: {
                sb.expand(expression.subExpressions.head)
                for(subExpression : expression.subExpressions.tail) {
                    sb.append(" < ")
                    sb.append("(")
                    sb.expand(subExpression)
                    sb.append(")")                
                }
            }
            case OperatorType::NE: {
                sb.expand(expression.subExpressions.head)
                for(subExpression : expression.subExpressions.tail) {
                    sb.append(" != ")
                    sb.append("(")
                    sb.expand(subExpression)
                    sb.append(")")                
                    }
            }
            case OperatorType::LOGICAL_AND: {
                sb.expand(expression.subExpressions.head)
                for(subExpression : expression.subExpressions.tail) {
                    sb.append(" && ")
                    sb.append("(")
                    sb.expand(subExpression)
                    sb.append(")") 
                    }
            }
            case OperatorType::LOGICAL_OR: {
                sb.expand(expression.subExpressions.head)
                for(subExpression : expression.subExpressions.tail) {
                    sb.append(" || ")
                    sb.append("(")
                    sb.expand(subExpression)
                    sb.append(")")
                }
            }
            case OperatorType::NOT: {
                sb.append("!")
                sb.append("(")
                sb.expand(expression.subExpressions.head)
                sb.append(")")
            }
            case OperatorType::BITWISE_AND: {
                sb.append(" & ")
            }
            case OperatorType::BITWISE_OR: {
                sb.append(" | ")
            }
            case OperatorType::POSTFIX_ADD: {
                sb.append("(")
                sb.append(expression.subExpressions.head)
                sb.append(")")
                sb.append("++")
            }
            case OperatorType::POSTFIX_SUB: {
                sb.append("(")
                sb.append(expression.subExpressions.head)
                sb.append(")")
                sb.append("--")
            }
            case OperatorType::PRE: {
                //Something
            }
            case OperatorType::VAL: {
                //Something
            }

            
        }
    }
    
    
    def expand_val_array(StringBuilder sb, ValuedObject signal, List<Expression> indices) {
        sb.append(signal.name)
        
        for(index : indices) {
            sb.append("[")
            sb.expand(index)
            sb.append("]")
        }
    }
    
    
    
    //--------------------------------------------------------------------------------------------------
    
    
    /**
     * Helper function to create a String containing the priorities of the different threads.
     * Used for the joinn-macro.
     * 
     * @param prioList
     *                  The priorities of the threads listed in the join statement
     */
    def createPrioString(ArrayList<Integer> prioList) {
        
        var s = new StringBuilder()
        
        for(prio : prioList) {
            s.append(prio)
            if(!prio.equals(prioList.last)) {
                s.append(", ")
            }
        }
        
        
        return s.toString
    }
    
}