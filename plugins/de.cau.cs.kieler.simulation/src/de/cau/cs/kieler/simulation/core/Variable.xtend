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
 * @author aas
 *
 */
class Variable {
    public enum VariableType {
        INT, BOOL, FLOAT, STRING
    }
    
    @Accessors
    private String name
    
    private VariableType type
    
    @Accessors
    private Object value
    
    @Accessors
    private Object userValue
    
    @Accessors
    private boolean isInput
    
    @Accessors
    private boolean isOutput
 
    @Accessors
    private boolean isSignal
    
    @Accessors
    private Model model
    
    new() {
    }
    
    new(String name) {
        this.name = name
    }
    
    new(String name, Object value) {
        this( name)
        this.value = value
    }
    
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
    
    public def VariableType getType() {
        return type
    }
    
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
    
    public def boolean isDirty() {
        if(userValue == null)
            return false
        else
            return !userValue.equals(value)
    }
    
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