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
import org.json.JSONObject

/**
 * A model is a named container for variables.
 * A model is part of a data pool.
 * 
 * @author aas
 *
 */
class Model {
    
    /**
     * The name of the model
     */
    @Accessors
    private String name
    
    /**
     * The pool in which this model is saved
     */
    @Accessors
    private DataPool pool
    
    /**
     * The variables of the model
     */
    private List<Variable> variables = newArrayList()

    /**
     * Converts the variables of this model to a json representation.
     */
    public def JSONObject toJSONObject() {
        val json = new JSONObject()
        for(v : variables) {
            val jsonVariable = new JSONObject()
            jsonVariable.put("value", v.value)
            jsonVariable.put("input", v.isInput)
            jsonVariable.put("output", v.isInput)
            jsonVariable.put("signal", v.isSignal)
            json.put(v.name, jsonVariable)
        }
        return json
    }
    
    /**
     * Loads the variables of this model from a json representation
     */
    public def void fromJSONObject(JSONObject json) {
        variables.clear()
        val names = json.names
        for(var i = 0; i < names.length; i++) {
            val varName = names.getString(i)
            val jsonVariable = json.getJSONObject(varName)
            val varValue = jsonVariable.get("value")
            
            val variable = new Variable(varName, varValue)
            variable.isInput = jsonVariable.optBoolean("input")
            variable.isOutput = jsonVariable.optBoolean("output")
            variable.isSignal = jsonVariable.optBoolean("signal")
            addVariable(variable)
        }
    }
    
    /**
     * Returns a list of previous states of this model from old to new. 
     */
    public def List<Model> getHistory() {
        val List<Model> history = newArrayList()
        val pools = pool.history
        for(p : pools) {
            for(m : p.models) {
                if(name != null && name.equals(m.name)) {
                    history.add(m)
                }
            }
        }
        return history
    }
    
    /**
     * Returns the variables.
     */
    public def List<Variable> getVariables() {
        return variables
    }

    /**
     * Adds a variables.
     */
    public def void addVariable(Variable v) {
        // Remove in old model
        if(v.model != null) {
            v.model.variables.remove(v)
        }
        // Set new model
        v.model = this
        if(!variables.contains(v)) {
            variables.add(v)
        }
    }
    
    /**
     * Clone an object.
     */
    override Model clone() {
        val m = new Model()
        m.name = this.name
        for(v : this.variables){
            m.addVariable(v.clone())   
        }
        return m
    }
}
