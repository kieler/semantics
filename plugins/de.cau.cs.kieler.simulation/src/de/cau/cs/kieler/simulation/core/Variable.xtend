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
package de.cau.cs.kieler.simulation.core

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * A container for information about a variable.
 * A Variable belongs to a model.
 * 
 * @author aas
 *
 */
class Variable implements Cloneable {
    /**
     * The variable name.
     */
    @Accessors
    private String name = ""
    
    /**
     * The variable type.
     */
    private VariableType type = VariableType.INT
    
    /**
     * The variable value.
     */
    @Accessors
    private Object value = null
    
    /**
     * A value for this variable entered by the user.
     */
    private Object userValue = null
    
    /**
     * Is this variable an input of the model?
     */
    @Accessors
    private boolean isInput = false
    
    /**
     * Is this variable an output of the model?
     */
    @Accessors
    private boolean isOutput = false
 
    /**
     * Is this variable a signal?
     */
    @Accessors
    private boolean isSignal = false
    
    /**
     * The model in which this variable is saved.
     */
    @Accessors
    private Model model = null
    
    /**
     * Constructor
     */
    new() {
    }
    
    /**
     * Constructor
     */
    new(String name) {
        this.name = name
    }
    
    /**
     * Constructor
     */
    new(String name, Object value) {
        this( name)
        this.value = value
    }
    
    /**
     * Set the value and type of this variable.
     */
    public def void setValue(Object value) {
        this.value = value
        // Update type.
        // In case of array, use type of first element.        
        var Object v = value
        if(v instanceof NDimensionalArray) {
            v = v.elements.get(0)
        }
        if(v instanceof String) {
            type = VariableType.STRING
        } else if (v instanceof Boolean) {
            type = VariableType.BOOL
        } else if (v instanceof Integer) {
            type = VariableType.INT
        } else if (v instanceof Float) {
            type = VariableType.FLOAT
        }
    }
    
    /**
     * Returns the type.
     */
    public def VariableType getType() {
        return type
    }
    
    /**
     * Returns a list with previous states of this variable from old to new.
     */
    public def List<Variable> getHistory() {
        val List<Variable> history = newArrayList()
        val models = model.history
        for(m : models) {
            for(v : m.variables) {
                if(name != null && name.equals(v.name)) {
                    history.add(v)
                }
            }
        }
        return history
    }
    
    /**
     * Returns true if the user has set a value for this variable,
     * and the user value differs from the actual value.
     */
    public def boolean isDirty() {
        return userValue != null && !userValue.equals(value)
    }
    
    public def Object getUserValue() {
        return userValue
    }
    
    public def void setUserValue(Object value) {
        var boolean eq = true
        if(value !== userValue) {
            eq = false
        } else if(value != null) {
            eq = value.equals(userValue) 
        } else if(userValue != null) {
            eq = userValue.equals(value)
        }
        if(!eq) {
            // Mark the modification in the model
            model.setModifiedVariable
            // Set the user value
            userValue = value
            // Notify simulation listeners that value changed
            SimulationManager.instance?.fireEvent(SimulationEventType.VARIABLE_CHANGE, this) 
        }
    }
    
    /**
     * Applies user made changes to variable values.
     */
    public def void applyUserValues() {
        if(!isDirty) {
            return
        }
        
        // Apply user value of changed array elements
        if(userValue instanceof NDimensionalArray) {
            val arr = userValue as NDimensionalArray
            for(elem : arr.elements) {
                if(elem.isDirty) {
                    elem.value = elem.userValue
                }
            }
        }
        // Apply user value
        value = userValue
    }
    
    public def void setPresent() {
        if(value instanceof Boolean) {
           value = true 
        } else if(value instanceof Number) {
           value = 1
        }
    }
    
    public def void setAbsent() {
        if(value instanceof Boolean) {
           value = false 
        } else if(value instanceof Number) {
           value = 0
        }
    }
    
    public def boolean isPresent() {
        if(value instanceof Boolean) {
            return value
        } else if(value instanceof Integer) {
            return (value != 0)
        } else {
            return false
        }
    }
    
    public def void togglePresentState() {
        value = toggledPresentState
    }
    
    public def Object toggledPresentState() {
        if(value instanceof Boolean) {
            return !value
        } else if(value instanceof Integer) {
            if(value == 0) {
                return 1
            } else {
                return 0
            }
        } else {
            throw new Exception("Can't toggle present state of variable "+name+" because it is neither a boolean nor an integer.")
        }
    }
    
    public def String getFullyQualifiedName() {
        if(model != null)
            return model.name+"."+name
        else
            return name
    }
    
    /**
     * Clones an object
     */
    override Variable clone() {
        val v = new Variable()
        v.name = this.name
        v.type = this.type
        v.value = this.value
        v.isInput = this.isInput
        v.isOutput = this.isOutput
        v.isSignal = this.isSignal
        return v
    }
    
    /**
     * {@inheritDoc}
     */
    override toString() {
        return "variable "+name
    }
}