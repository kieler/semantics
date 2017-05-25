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

import com.google.gson.JsonPrimitive
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.google.gson.internal.LinkedTreeMap
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
     * The variable name.
     */
    @Accessors
    @Expose
    private String name = ""
    
    /**
     * The variable type.
     */
    @Expose
    private VariableType type = VariableType.INT
    
    /**
     * The variable value.
     */
    @Accessors
    @Expose
    private Object value = null
    
    /**
     * A value for this variable entered by the user.
     */
    @Accessors
    private Object userValue = null
    
    /**
     * Is this variable an input of the model?
     */
    @Accessors
    @Expose
    @SerializedName("input")
    private boolean isInput = false
    
    /**
     * Is this variable an output of the model?
     */
    @Accessors
    @Expose
    @SerializedName("output")
    private boolean isOutput = false
 
    /**
     * Is this variable a signal?
     */
    @Accessors
    @Expose
    @SerializedName("signal")
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
    
    public def void valueFromJson() {
        // Make array from json object
        if(value instanceof LinkedTreeMap<?,?>) {
            val jsonObject = Model.GSON.toJsonTree(value).getAsJsonObject();
            val jsonIndices = jsonObject.get("indices").asJsonArray
            val indices = newArrayList()
            for(jsonElem : jsonIndices) {
                indices += jsonElem.asInt
            }
            
            val jsonValues = jsonObject.get("values").asJsonArray
            val List<Object> values = newArrayList()
            for(jsonElem : jsonValues) {
                if(jsonElem instanceof JsonPrimitive) {
                    if(jsonElem.isBoolean) {
                        values += jsonElem.asBoolean
                    } else if(jsonElem.isNumber) {
                        values += jsonElem.asNumber
                    } else if(jsonElem.isString) {
                        values += jsonElem.asString
                    }
                }
            }
            value = new NDimensionalArray(values, indices)
        }
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