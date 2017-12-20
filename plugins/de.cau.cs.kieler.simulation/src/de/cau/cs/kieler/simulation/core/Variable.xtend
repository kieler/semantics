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

import de.cau.cs.kieler.prom.templates.VariableInterfaceType
import de.cau.cs.kieler.simulation.core.events.VariableUserValueEvent
import java.util.HashSet
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
    @Accessors
    private var VariableType type = VariableType.INT
    
    /**
     * The variable value.
     */
    @Accessors
    private var Object value = null
    
    /**
     * A value for this variable entered by the user.
     */
    private var Object userValue = null
    
    /**
     * Is this variable an input of the model?
     */
    @Accessors
    private var HashSet<VariableInterfaceType> interfaceTypes = newHashSet
 
    /**
     * The model in which this variable is saved.
     */
    @Accessors
    private var Model model = null
    
    /**
     * Constructor
     */
    new() {
    }
    
    /**
     * Constructor
     * 
     * @param name The name
     */
    new(String name) {
        this.name = name
    }
    
    /**
     * Constructor
     * 
     * @param name the name
     * @param value the value
     */
    new(String name, Object value) {
        this( name)
        this.value = value
    }
    
    /**
     * Returns true if the variable is an input.
     */
    public def boolean isInput() {
        return interfaceTypes.contains(VariableInterfaceType.INPUT)
    }
    
    /**
     * Returns true if the variable is an output.
     */
    public def boolean isOutput() {
        return interfaceTypes.contains(VariableInterfaceType.OUTPUT)
    }
    
    /**
     * Defines this variable as an input variable.
     */
    public def void setIsInput(boolean value) {
        if(value) {
            interfaceTypes.add(VariableInterfaceType.INPUT)
        } else {
            interfaceTypes.remove(VariableInterfaceType.INPUT)
        }
    }
    
    /**
     * Defines this variable as an output variable.
     */
    public def void setIsOutput(boolean value) {
        if(value) {
            interfaceTypes.add(VariableInterfaceType.OUTPUT)
        } else {
            interfaceTypes.remove(VariableInterfaceType.OUTPUT)
        }
    }
    
    /**
     * Set the value and type of this variable.
     * The type is infered from the value.
     * 
     * @param value The value
     */
    public def void setValue(Object value) {
        this.value = value
        // Update type.
        // In case of array, use type of first element.        
        var Object v = value
        if(v instanceof NDimensionalArray) {
            if(!v.isEmpty) {
                v = v.elements.get(0)    
            }
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
     * Returns a list with previous states of this variable from old to new.
     * 
     * @param the previous versions of this variable
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
     * 
     * @return true if the variable has a user value that must be applied
     */
    public def boolean isDirty() {
        return userValue != null && !userValue.equals(value)
    }
    
    /**
     * Returns the user value
     * 
     * @return the user value
     */
    public def Object getUserValue() {
        return userValue
    }
    
    /**
     * Sets the user value.
     * 
     * @param value The value
     */
    public def void setUserValue(Object value) {
        // Mark the modification in the model
        model.setModifiedVariable
        // Set the user value
        val oldValue = userValue 
        userValue = value
        // Notify simulation listeners that value changed
        SimulationManager.instance?.fireEvent(new VariableUserValueEvent(this, oldValue, value))
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
        userValue = null
    }
    
    /**
     * Sets the value of the variable to represent a state of 'present' wrt. synchronous langugages
     */
    public def void setPresent() {
        if(value instanceof Boolean) {
           value = true 
        } else if(value instanceof Number) {
           value = 1
        }
    }
    
    /**
     * Sets the value of the variable to represent a state of 'absent' wrt. synchronous langugages
     */
    public def void setAbsent() {
        if(value instanceof Boolean) {
           value = false 
        } else if(value instanceof Number) {
           value = 0
        }
    }
    
    /**
     * Checks if the value of the variable represents a state of 'present' wrt. synchronous langugages
     */
    public def boolean isPresent() {
        if(value instanceof Boolean) {
            return value
        } else if(value instanceof Integer) {
            return (value != 0)
        } else {
            return false
        }
    }
    
    /**
     * Toggles the present state (present -> absent, absent -> present)
     */
    public def void togglePresentState() {
        value = toggledPresentState
    }
    
    /**
     * Returns the present state, that this variable does NOT have at the moment.
     * 
     * @return the toggled present state.
     */
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
    
    /**
     * Returns the fully qualified name of the variable.
     * This is a concatenation of the model name and variable name.
     * 
     * @return the fully qualified name of the variable.
     */
    public def String getFullyQualifiedName() {
        if(model != null)
            return model.name+"."+name
        else
            return name
    }
    
    /**
     * Returns true if the value of this variable is an array.
     * 
     * @return true if the value of this variable is an array, false otherwise
     */
    public def boolean isArray() {
        return (value !== null && value instanceof NDimensionalArray)
    }
    
    /**
     * Clones an object
     */
    override Variable clone() {
        val v = new Variable()
        v.name = this.name
        v.type = this.type
        v.interfaceTypes = this.interfaceTypes.clone as HashSet
        v.value = this.value
        v.userValue = this.userValue
        return v
    }
    
    /**
     * {@inheritDoc}
     */
    override toString() {
        return "variable "+name
    }
}