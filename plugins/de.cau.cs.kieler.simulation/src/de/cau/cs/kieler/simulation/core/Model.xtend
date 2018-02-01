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
import java.util.Map
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
    private var String name = ""
    
    /**
     * The pool in which this model is saved
     */
    @Accessors
    private var DataPool pool = null
    
    /**
     * The variables of the model
     */
    private val List<Variable> variables = newArrayList
    
    /**
     * A mapping of variable names to the corresponding variable.
     */
    private val Map<String, Variable> variablesMap = newHashMap
    
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
        return getHistory(-1, true, false)
    }
    
    /**
     * Returns a list of previous states of this model from old to new.
     * 
     * @param maxSize The maximum amount of history entries to show
     * @param includeInitialization Determines whether the initial data pool should be included
     * @param includeCurrent Determines whether the current object (this) should be included in the returned list, or only its history
     * @return the history of previous models
     */
    public def List<Model> getHistory(int maxSize, boolean includeInitialization, boolean includeCurrent) {
        val List<Model> history = newArrayList()
        val pools = pool.getHistory(maxSize, includeInitialization, includeCurrent)
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
        variablesMap.get(name)
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
     * Returns true if a variable with the given name is in the model.
     */
    public def boolean hasVariable(String name) {
        return variablesMap.containsKey(name)
    }

    /**
     * Adds a variables.
     * 
     * @param v The variable
     */
    public def void addVariable(Variable v) {
        // Remove in old model
        if(v.model != null) {
            v.model.removeVariable(v)
        }
        // Set new model
        v.model = this
        if(!hasVariable(v.name)) {
            variables.add(v)
            variablesMap.put(v.name, v)
        }
    }
    
    /**
     * Removes a variables.
     * 
     * @param v The variable
     */
    public def void removeVariable(Variable v) {
        variables.remove(v)
        variablesMap.remove(v.name)
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
