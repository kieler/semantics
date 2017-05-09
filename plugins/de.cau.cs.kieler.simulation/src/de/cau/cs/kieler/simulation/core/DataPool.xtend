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
class DataPool {
    
    private val List<Model> models = newArrayList()
    
    @Accessors
    private var DataPool previousPool
    
    override DataPool clone() {
        val pool = new DataPool()
        for(m : models) {
            pool.addModel(m.clone())            
        }
        return pool
    }
    
    public def List<Variable> getAllVariables() {
        val List<Variable> allVariables = newArrayList()
        for(m : models) {
            allVariables.addAll(m.variables)
        }
        return allVariables
    }
    
    public def List<Model> getModels() {
        return models
    }
    
    public def void addModel(Model m) {
        // Remove in old model
        if(m.pool != null) {
            m.pool.models.remove(m)
        }
        // Set new model
        m.pool = this
        if(!models.contains(m)) {
            models.add(m)
        }
    }
    
    public def List<DataPool> getHistory() {
        val List<DataPool> history = newArrayList()
        history.add(this)
        var next = this.previousPool
        while(next != null) {
            history.add(next)
            next = next.previousPool
        }
        return history.reverse
    }
    
    override String toString() {
        var String txt = "{  "
        val modelCount = models.size
        for(var i = 0; i < modelCount; i++) {
            val model = models.get(i)
            txt += model.name+"={"
            
            val variableCount = model.variables.size
            for(var v = 0; v < variableCount; v++) {
                val variable = model.variables.get(v)
                txt += variable.name + "=" + variable.value
                if(v < variableCount-1) {
                    txt += ", "
                }
            }
            
            txt += "}"
            if(i < modelCount-1) {
                txt += "\n"
            }
        }
        txt += "  }"
        return txt 
    }
}