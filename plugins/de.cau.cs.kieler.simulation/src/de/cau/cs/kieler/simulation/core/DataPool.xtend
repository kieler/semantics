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

/**
 * @author aas
 *
 */
class DataPool {
    
    public val List<Model> models = newArrayList()
    
    override DataPool clone() {
        val pool = new DataPool()
        for(m : models)
            pool.models.add(m.clone())
        return pool
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