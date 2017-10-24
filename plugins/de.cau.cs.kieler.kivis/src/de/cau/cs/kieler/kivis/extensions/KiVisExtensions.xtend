/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kivis.extensions

import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kivis.interactions.FunctionHandler
import de.cau.cs.kieler.kivis.kivis.Action
import de.cau.cs.kieler.kivis.kivis.AndExpression
import de.cau.cs.kieler.kivis.kivis.Animation
import de.cau.cs.kieler.kivis.kivis.AttributeMapping
import de.cau.cs.kieler.kivis.kivis.Comparison
import de.cau.cs.kieler.kivis.kivis.Condition
import de.cau.cs.kieler.kivis.kivis.Domain
import de.cau.cs.kieler.kivis.kivis.Function
import de.cau.cs.kieler.kivis.kivis.Mapping
import de.cau.cs.kieler.kivis.kivis.SimulationOperation
import de.cau.cs.kieler.kivis.kivis.VariableReference
import de.cau.cs.kieler.prom.configurable.AttributeExtensions
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.NDimensionalArray
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.Variable
import org.eclipse.emf.ecore.EObject

/**
 * @author aas
 *
 */
class KiVisExtensions {
    extension var AttributeExtensions attributeExtensions
    
    new() {
        attributeExtensions = new AttributeExtensions
    }
    
    /**
     * Finds the variable in the pool that corresponds to the variable reference.
     * 
     * @param ref The variable reference
     * @param pool The data pool 
     */
    public def Variable getVariable(VariableReference ref, DataPool pool) {
        if(ref == null) {
            return null
        }
        
        val modelName = ref.model?.name
        val variableName = ref.name
        // Get variable in pool
        val variable = pool.getVariable(modelName, variableName)
        if(variable == null) {
            throw new Exception("'"+variableName+"' was not found in the data pool.")
        }
        return variable
    }
    
    /**
     * Returns the value of a variable in the pool that corresponds to the variable reference.
     * 
     * @param ref The variable reference
     * @param pool The data pool 
     * @param userValue Determines whether the user entered value of the variable should be preferred or always its 'real' value
     */
    public def Object getVariableValue(VariableReference ref, DataPool pool, boolean userValue) {
        if(ref == null) {
            return null
        }
        // Get the variable from the reference
        val variable = getVariable(ref, pool)
        // Get value of variable
        var Object value = if (variable.isDirty)
                               variable.userValue
                           else
                               variable.value
        // Get value of an array element
        if(value instanceof NDimensionalArray) {
            val arrayIndex = ref.arrayIndex?.indices
            val array = value as NDimensionalArray
            if(arrayIndex.isNullOrEmpty) {
                throw new Exception("Trying to access array "+ref.name+" without index.")
            }
            value = array.get(arrayIndex, userValue)
        }
        return value
    }
    
    /**
     * Evaluates the condition where variables are replaced with their corresponding value in the pool.
     * 
     * @param cond The condition
     * @param pool The pool
     */
    public def boolean eval(Condition cond, DataPool pool) {
        if(cond instanceof AndExpression) {
            return (cond as AndExpression).eval(pool)
        } else if(cond instanceof Comparison) {
            return (cond as Comparison).eval(pool)
        }
        return true
    }
    
    /**
     * Evaluates the comparison where variables are replaced with their corresponding value in the pool.
     * 
     * @param cond The comparison
     * @param pool The pool
     */
    public def boolean eval(Comparison cond, DataPool pool) {
        if(cond != null) {
            // Left side is always a variable reference of which must be resolved
            val leftValue = cond.left.getVariableValue(pool, true)
            // Right side may be a constant value (in this case it's an EObject, e.g. IntValue)
            // or another variable reference that must be resolved
            val right = cond.right
            var Object rightValue
            
            if(right instanceof VariableReference) {
                rightValue = right.getVariableValue(pool, true)
            } else if(right instanceof EObject) {
                rightValue = right.primitiveValue
            }
            if( leftValue != null && rightValue != null) {
                try {
                    switch(cond.relation) {
                        case OperatorType.EQ : return leftValue.equalsValue(rightValue)
                        case OperatorType.NE : return !leftValue.equalsValue(rightValue)
                        case OperatorType.GT : return leftValue.doubleValue > rightValue.doubleValue
                        case OperatorType.LT : return leftValue.doubleValue < rightValue.doubleValue
                        case OperatorType.GEQ : return leftValue.doubleValue >= rightValue.doubleValue
                        case OperatorType.LEQ : return leftValue.doubleValue <= rightValue.doubleValue
                        default: {
                            return false
                        }
                    }
                } catch(IllegalArgumentException e) {
                    return false
                }        
            }
            cond.left
        }
        return true
    }
    
    /**
     * Evaluates the expression where variables are replaced with their corresponding value in the pool.
     * 
     * @param cond The expression
     * @param pool The pool
     */
    public def boolean eval(AndExpression cond, DataPool pool) {
        return cond.left.eval(pool) && cond.right.eval(pool)
    }
    
    /**
     * Selects the (possibly linearly interpolated) value of the target side of the mapping for the given input value.
     * When using this method, it is assumed that the input value matches the left side of the mapping already.
     * 
     * Example: Given a mapping "(1..10) -> (1..100)" and a value "5",
     *          the resulting value is linearly interpolated, which is "50" in this case.
     * 
     * @param mapping The mapping
     * @param value The value
     */
    public def Object apply(Mapping mapping, Object value) {
        val attributeDomain = mapping.attributeDomain
        if(attributeDomain.currentValue) {
            // The current value should be returned
            return value
        } else if(attributeDomain.value != null) {
            // The right side is a constant, which means this value is returned no matter what the input value is.
            return attributeDomain.value.primitiveValue
        } else if(attributeDomain.range != null && mapping.variableDomain.range != null) {
            // Interpolate the target value
            val doubleValue = value.doubleValue
            val variableDomain = mapping.variableDomain
            val fromLow = variableDomain.range.from.primitiveValue.doubleValue
            val fromHigh = variableDomain.range.to.primitiveValue.doubleValue
            val toLow = attributeDomain.range.from.primitiveValue.doubleValue
            val toHigh = attributeDomain.range.to.primitiveValue.doubleValue
            val mappedValue = scale(doubleValue, fromLow, fromHigh, toLow, toHigh)
            // Try to use Integer instead Double if possible
            if(mappedValue == mappedValue.intValue)
                return mappedValue.intValue
            return mappedValue
        }
        return null
    }
    
    /**
     * Maps the given value from the source interval [fromLow, fromHigh] to the target interval [toLow, toHigh].
     * The given value must be inside the source interval.
     * 
     * @param value The value
     * @param fromLow Left side of the source interval
     * @param fromHigh Right side of the source interval
     * @param toLow Left side of the target interval
     * @param toHigh Right side of the target interval
     */
    public def double scale(double value, double fromLow, double fromHigh, double toLow, double toHigh) {
        // Vector calculation v = pos + percent*length
        val double percent = Math.abs(value - fromLow) / Math.abs(fromHigh - fromLow)
        val mappedValue = (toLow + percent * Math.abs(toHigh-toLow))
        return mappedValue
    }
    
    /**
     * Checks whether the given value matches is part of the domain.
     * 
     * @param domain The domain
     * @param value The value
     */
    public def boolean matches(Domain domain, Object value) {
        if(domain.otherValues) {
            // All other values should match
            return true
        } else if(domain.value != null) {
            // The domain is a single value, thus for a match the given value must be equal to it.
            val domValue = domain.value.primitiveValue
            return domValue.equalsValue(value)
        } else if(domain.range != null) {
            
            try {
                // The domain is a range, thus for a match it holds
                // lowestIntervalValue <= value <= highestIntervalValue
                val doubleValue = value.doubleValue
                val low = domain.range.from.primitiveValue.doubleValue
                val high = domain.range.to.primitiveValue.doubleValue
                return (low <= doubleValue) && (doubleValue <= high)
            } catch(IllegalArgumentException e) {
                // At least one of the values is not a proper number. Thus the range can't be matched.
                // Just go to 'return false' at the end of the method.
            }
        }
        return false
    }
    
    /**
     * Returns the first attribute in the animation configuration with the given name.
     * 
     * @param animation The animation in which the attribute is searched
     * @param name The name of the attribute
     */
    public def AttributeMapping getAttribute(Animation animation, String name) {
        return animation.attributeMappings.findFirst[it.attribute.equals(name)]
    }
    
    /**
     * Performs the action in the data pool.
     * An action is either an assignment of a variable (i.e. a variable in the pool is set to some value)
     * or a simulation operation such as STEP or STOP.
     * 
     * @param action The action
     * @param pool The pool 
     */
    public def void perform(Action action, DataPool pool) {
        if(action.variable != null) {
            if(action.value != null) {
                action.variable.performAssignment(action.value, pool)
            } else if(action.function != null) {
                action.variable.performAssignment(action.function, pool)
            }
        } else if(action.operation != null) {
            perform(action.operation)
        }
    }
    
    /**
     * Performs the simulation operation
     * 
     * @param operation The operation
     */
    public def void perform(SimulationOperation operation) {
        val simulation = SimulationManager.instance
        if(simulation != null && !simulation.isStopped) {
            switch(operation) {
                case SimulationOperation.STEP : {
                    simulation.stepMacroTick
                }
                case SimulationOperation.PLAY : {
                    simulation.play
                }
                case SimulationOperation.PAUSE : {
                    simulation.pause
                }
                case SimulationOperation.STOP : {
                    simulation.stop
                }
            }
        }
    }
    
    /**
     * Sets the value of the variable in the data pool that corresponds to the given variable reference.
     * 
     * @param variableReference The variableReference
     * @param value The new value for the variable
     * @param pool The data pool in which the variable should be set
     */
    public def void performAssignment(VariableReference variableReference, EObject value, DataPool pool) {
        val primitive = value.primitiveValue
        // Get variable in pool
        val variable = getVariable(variableReference, pool)
        if(variable != null) {
            val currentValue = variable.value
            // Set value of array element
            if(currentValue instanceof NDimensionalArray) {
                if(variable.userValue == null) {
                    variable.userValue = currentValue.clone
                }
                val newValue = variable.userValue as NDimensionalArray
                val index = variableReference.arrayIndex.indices
                if(index.isNullOrEmpty) {
                    throw new Exception("Trying to set the array '"+variableReference.name+"' without index.")
                }
                val arrayElement = newValue.getElement(index)
                arrayElement.setUserValue(primitive)
                variable.userValue = newValue
            } else {
                variable.userValue = primitive
            }
        }
    }
    
    /**
     * Sets the value of the variable in the data pool that corresponds to the given variable reference.
     * 
     * @param variableReference The variableReference
     * @param function The function that computes the new value
     * @param pool The data pool in which the variable should be set
     */
    public def void performAssignment(VariableReference variableReference, Function function, DataPool pool) {
        // Get function handler for the function name
        val handler = FunctionHandler.getFunctionHandler(function.functionName)
        if(handler == null) {
            throw new Exception("The function '"+function.functionName+"' is not handled by the simulation visualization.\n"
                              + "Supported functions are:"+FunctionHandler.handledFunctions.keySet.join(", "))
        }
        // Get function arguments
        val arguments = <Object>newArrayList
        for(p : function.parameters) {
            var Object argument
            if(p.variableReference != null) {
                argument = p.variableReference.getVariableValue(pool, true)    
            } else if(p.value != null) {
                argument = p.value.primitiveValue
            }
            if(argument != null) {
                arguments.add(argument) 
            }
        }
        // Calculate the function
        val value = handler.getValue(function.functionName, arguments)
        // Assign new value to the variable
        val variable = getVariable(variableReference, pool)
        if(variable != null) {
            variable.userValue = value
        }
    }
    
    /**
     * Checks whether to values are equal.
     * This is needed in case of numbers, because the normal equals of Float and Double
     * for example would return false for the same numeric value.
     * 
     */
    public def boolean equalsValue(Object v1, Object v2) {
        if(v1 == null && v2 == null) {
            return true
        }
        if(v1 != null && v2 != null) {
            if(v1 instanceof String || v1 instanceof Boolean) {
                return v1.equals(v2)
            }
            if(v1 instanceof Number && v2 instanceof Number) {
                return v1.doubleValue.equals(v2.doubleValue)
            }
        }
        return false
    }
}