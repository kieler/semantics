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
class Variable {
    /**
     * Possible types for variables
     */
    public enum VariableType {
        INT, BOOL, FLOAT, STRING
    }
    
    /**
     * The variable name.
     */
    @Accessors
    private String name
    
    /**
     * The variable type.
     */
    private VariableType type
    
    /**
     * The variable value.
     */
    @Accessors
    private Object value
    
    /**
     * A value for this variable entered by the user.
     */
    @Accessors
    private Object userValue
    
    /**
     * Is this variable an input of the model?
     */
    @Accessors
    private boolean isInput
    
    /**
     * Is this variable an output of the model?
     */
    @Accessors
    private boolean isOutput
 
    /**
     * Is this variable a signal?
     */
    @Accessors
    private boolean isSignal
    
    /**
     * The model in which this variable is saved.
     */
    @Accessors
    private Model model
    
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
        if(value instanceof String) {
            type = VariableType.STRING
        } else if (value instanceof Boolean) {
            type = VariableType.BOOL
        } else if (value instanceof Integer) {
            type = VariableType.INT
        } else if (value instanceof Float) {
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
        if(userValue == null)
            return false
        else
            return !userValue.equals(value)
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
}