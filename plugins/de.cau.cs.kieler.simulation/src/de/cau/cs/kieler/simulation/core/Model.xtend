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

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonObject
import com.google.gson.annotations.Expose
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

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
    private String name = ""
    
    /**
     * The pool in which this model is saved
     */
    @Accessors
    private DataPool pool = null
    
    /**
     * The variables of the model
     */
    @Expose
    private List<Variable> variables = newArrayList()

    public static Gson GSON = createGson();

    /**
     * Convert this model to a json representation.
     */
    public def String toJson() {
        val json = GSON.toJson(this)
        return json
    }
    
    /**
     * Creates a model from a json representation
     */
    public static def Model createFromJson(String name, String json) {
        val m = GSON.fromJson(json, typeof(Model))
        m.name = name
        // Set reference to model in variables
        for(v : m.variables) {
            v.model = m;
            v.valueFromJson();
        }
        return m
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
    
    private static def Gson createGson() {
        val builder = new GsonBuilder()
        builder.excludeFieldsWithoutExposeAnnotation();
        return builder.create();
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
