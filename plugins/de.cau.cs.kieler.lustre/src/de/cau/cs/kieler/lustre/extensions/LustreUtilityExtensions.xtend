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
package de.cau.cs.kieler.lustre.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.lustre.lustre.Automaton
import de.cau.cs.kieler.lustre.lustre.Equation
import java.util.HashSet
import java.util.List
import java.util.Set
import de.cau.cs.kieler.lustre.lustre.LustreVariableDeclaration
import de.cau.cs.kieler.kexpressions.VariableDeclaration

/**
 * @author lgr
 *
 */
class LustreUtilityExtensions {
    
    static val String CLOCK_EXPRESSION_MISMATCH_INFO = "Received %s."
    
    @Inject extension KExpressionsValuedObjectExtensions
    
    def areClocksEqual(ValuedObject clock, Expression expression) {
        val exprClock = expression.clockOfExpression
        
        if (clock === null) {
            return exprClock === null
        } else {
            return (exprClock !== null) && (clock == exprClock)
        }
    }
    
    def isClockedVariableDeclaration (VariableDeclaration varDecl) {
        if (varDecl instanceof LustreVariableDeclaration) {
            var clock = varDecl.clockExpr
            if (clock !== null) {
                return true
            }
        }
        return false
    }
    
    def ValuedObjectReference getClock (VariableDeclaration varDecl) {
        if (varDecl.isClockedVariableDeclaration) {
            var lustreVarDecl = varDecl.asLustreVariableDeclaration
            var clock = lustreVarDecl.clockExpr
            if (clock instanceof ValuedObjectReference) {
                return clock
            }
        }
        
        return null
    }
    
    def asLustreVariableDeclaration(VariableDeclaration varDecl) {
        if (varDecl.isClockedVariableDeclaration) {
            return varDecl as LustreVariableDeclaration
        }
        return null
    }

    def getClockOfExpression(Expression expression) {
        if (expression instanceof OperatorExpression) {
            return getClockOfOperatorExpression(expression)            
        } else if (expression instanceof ValuedObjectReference) {
            return getClockOfValuedObjectReference(expression)           
        }
        
        return null
    }
    
    def ValuedObject getClockOfOperatorExpression(OperatorExpression expression) {
        if (expression.operator == OperatorType.WHEN) {
            return getClockOfWhenExpression(expression)        
        } else if (expression.operator == OperatorType.CURRENT) {
            return getClockOfCurrentExpression(expression)            
        } else {
            return getClockOfSubExpression(expression)
        }
    }
    
    def getClockOfValuedObjectReference(ValuedObjectReference valuedObjectReference) {
        var varDecl = valuedObjectReference.valuedObject.declaration
        if (varDecl instanceof LustreVariableDeclaration) {
            var clockExpr = varDecl.clockExpr
            if (clockExpr !== null) {
                if (clockExpr instanceof ValuedObjectReference) {
                    return clockExpr.valuedObject
                }
            }
        }
        
        return null
    }
    
    def ValuedObject getClockOfSubExpression(OperatorExpression expression) {        
        var HashSet<ValuedObject> exprClockSet = newHashSet
        for (Expression expr : expression.subExpressions) {
            exprClockSet.add(getClockOfExpression(expr))
        }
        
        if (exprClockSet.size > 1) {
            var clockNameString = ""
            for (ValuedObject valObj : exprClockSet) {
                clockNameString += (valObj === null? "none(baseclock)" : valObj.name) + ", "
            }
            clockNameString = clockNameString.substring(0, clockNameString.length - 2)
            throw new IllegalStateException(String.format(CLOCK_EXPRESSION_MISMATCH_INFO, clockNameString))
        }
        
        return exprClockSet.get(0)
    }
    
    def getClockOfWhenExpression(OperatorExpression expression) {
        if (expression.operator !== OperatorType.WHEN) {
            throw new IllegalArgumentException("Supplied argument is not a 'when' expression")
        }
        
        // Clocks must be variable references
        // TODO: actually also the not operation must be supported 
        var clockExpression = expression.subExpressions.size > 1? expression.subExpressions.get(1) : null
        if (clockExpression instanceof ValuedObjectReference) {
            return clockExpression.valuedObject
        }
        
        return null
    } 
    
    def getClockOfCurrentExpression(OperatorExpression expression) {
        if (expression.operator !== OperatorType.CURRENT) {
            throw new IllegalArgumentException("Supplied argument is not a 'current' expression")
        }
        
        var currentExpression = expression.subExpressions.size > 0? expression.subExpressions.get(0) : null
        if (currentExpression instanceof ValuedObjectReference) {
            var varDecl = currentExpression.valuedObject.declaration
            if (varDecl instanceof LustreVariableDeclaration) {
                var clockExpr = varDecl.clockExpr
                if (clockExpr !== null) {
                    if (clockExpr instanceof ValuedObjectReference) {
                        return getClockOfValuedObjectReference(clockExpr)
                    }
                }
            }
        } else if (currentExpression instanceof OperatorExpression) {
            var exprClock = currentExpression.clockOfOperatorExpression
            var exprClockDecl = exprClock.declaration
            if (exprClockDecl instanceof LustreVariableDeclaration) {
                var clockExpr = exprClockDecl.clockExpr
                if (clockExpr !== null) {
                    if (clockExpr instanceof ValuedObjectReference) {
                        return clockExpr.valuedObject
                    }
                }
            }
        }
    }
    
    def Set<ValuedObject> getValuedObjectsFromEquations(List<Assignment> equations) {
        var valuedObjects = newHashSet
        
        for (equation : equations) {
            if (equation instanceof Equation) {
                if (equation.reference === null) {
                    if (equation.references !== null) {
                        for (valObjRef : equation.references) {
                            valuedObjects.add(valObjRef.valuedObject)
                        }
                    }
                } else {
                    valuedObjects.add(equation.reference.valuedObject)
                }
            }
        }
        
        return valuedObjects
    }
    
    def Set<ValuedObject> getValuedObjectsFromAutomatons(List<Automaton> automatons) {
        var valuedObjects = newHashSet
        
        for (automaton : automatons) {
            for (state : automaton.states) {
                valuedObjects.addAll(getValuedObjectsFromEquations(state.equations))
                valuedObjects.addAll(getValuedObjectsFromAutomatons(state.automatons))
            }
        }
        
        return valuedObjects
    }
    
    dispatch def String getStringRepresentation(Expression expression) {
        var String result = ""
        if (expression instanceof OperatorExpression) {
            if (expression.subExpressions.length == 1) {
                result = expression.operator.literal + "(" +
                    getStringRepresentation(expression.subExpressions.get(0)) + ")"
            } else {
                for (Expression expr : expression.subExpressions) {
                    result += getStringRepresentation(expr)
                    if (expression.subExpressions.indexOf(expr) < expression.subExpressions.length - 1) {
                        result += " " + expression.operator.toString + " "
                    }
                }
            }
        } else if (expression instanceof ValuedObjectReference) {
            result = expression.valuedObject.name
        } else if (expression instanceof IntValue) {
            result = expression.value.toString
        } else if (expression instanceof BoolValue) {
            result = expression.value.toString
        } else if (expression instanceof FloatValue) {
            result = expression.value.toString
        }
        return result
    }
    
    dispatch def String getStringRepresentation(Equation equation) {
        if (equation.reference !== null && equation.expression !== null) {
            return equation.reference.valuedObject.name + " = " + getStringRepresentation(equation.expression)
        } else if (equation.references !== null && equation.expression !== null) {
            return "(" 
                + equation.references.map[valuedObject.name].join(", ") 
                + ")"
                + " = "
                + getStringRepresentation(equation.expression)
        }
        
        return ""
    }
    
}