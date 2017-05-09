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
 * @author aas
 *
 */
class Model {
    
    @Accessors
    private String name
    
    @Accessors
    private DataPool pool
    
    private List<Variable> variables = newArrayList()

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
    
    public def List<Variable> getVariables() {
        return variables
    }

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
    
    override Model clone() {
        val m = new Model()
        m.name = this.name
        for(v : this.variables){
            m.addVariable(v.clone())   
        }
        return m
    }
}
