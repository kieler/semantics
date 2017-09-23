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

import de.cau.cs.kieler.simulation.json.JsonManager
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * A model is a named container for variables.
 * A model is part of a data pool.
 * 
 * @author aas
 *
 */
class Model implements Cloneable {
    
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
    private List<Variable> variables = newArrayList()
    
    /**
     * Indicates that at least one variable might have a user value set,
     * which must be applied before the next tick is executed.
     */
    @Accessors(PUBLIC_GETTER)
    private boolean hasModifiedVariable

    /**
     * Constructor
     */
    new () {
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
     * Convert this model to a json representation.
     * 
     * @return the JSON representation for this object
     */
    public def String toJson() {
        val json = JsonManager.GSON.toJson(this)
        return json
    }
    
    /**
     * Creates a model from a json representation
     * 
     * @param name The name for the new model
     * @param json The JSON representation to be loaded
     * @return the loaded model
     */
    public static def Model createFromJson(String name, String json) {
        val m = JsonManager.GSON.fromJson(json, typeof(Model))
        m.name = name
        return m
    }
    
    /**
     * Returns a list of previous states of this model from old to new. 
     * 
     * @return the history of previous models
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
     * Returns the variable with the given name.
     * 
     * @param name The name
     * @return the variable with the given name, or null if none
     */
    public def Variable getVariable(String name) {
        variables.findFirst[it.name == name]
    }
    
    /**
     * Returns the variables.
     * 
     * @return the variables in this model
     */
    public def List<Variable> getVariables() {
        return variables
    }

    /**
     * Adds a variables.
     * 
     * @param v The variable
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
     * Applies the user values of all variables
     */
    public def void applyUserValues() {
        // Apply user made changes to variable values
        for(v : variables) {
            v.applyUserValues
        }
    }
    
    /**
     * Sets the flag to indicate that at least one variable has a user value
     */
    protected def void setModifiedVariable() {
        hasModifiedVariable = true
        pool.setModifiedVariable
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
