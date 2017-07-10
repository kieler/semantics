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
package de.cau.cs.kieler.simulation.handlers

import de.cau.cs.kieler.prom.build.ConfigurableAttribute
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.DefaultDataHandler
import de.cau.cs.kieler.simulation.core.NDimensionalArray
import java.util.Arrays
import de.cau.cs.kieler.simulation.core.Model

/**
 * Sets the value of input variables of one model (to)
 * to the value of output variables of another model (from).
 * 
 * @author aas
 *
 */
class Redirect extends DefaultDataHandler {
    
    /**
     * The name of the model of which the outputs should be read.
     */
    public val from = new ConfigurableAttribute("from", null, true)
    /**
     * The name of the model of which the inputs should be set.
     */
    public val to = new ConfigurableAttribute("to", null, true)
    
    /**
     * Sets the value of input variables the to-model
     * to the value of output variables of the from-model.
     */
    override write(DataPool pool) {
        val fromModel = findModel(pool, from.stringValue)
        val outputs = fromModel.variables.filter[it.isOutput]
        
        val toModel = findModel(pool, to.stringValue)
        val inputs = toModel.variables.filter[it.isInput]
            
        // Set value of inputs of destination to value of outputs of source 
        for(o : outputs) {
            val i = inputs.findFirst[it.name == o.name]
            if(i != null) {
                if(i.value.class.isAssignableFrom(o.value.class)) {
                    if(i.value instanceof NDimensionalArray && o.value instanceof NDimensionalArray) {
                        val iIndices = (i.value as NDimensionalArray).indices
                        val oIndices = (o.value as NDimensionalArray).indices
                        val boolean arraySizeMatches = Arrays.equals(iIndices, oIndices)
                        if(!arraySizeMatches) {
                            throw new Exception("Array size mismatch of '"+this+"'\n"
                                              + "(size " + NDimensionalArray.toString(iIndices) + " != size " + NDimensionalArray.toString(oIndices) + ")")
                        }
                    }
                } else {
                    throw new Exception("Type mismatch of redirected variable '" + i.name + "' from '"+from.stringValue+ "' to '" + to + "'")
                }
                
                i.value = o.value
            } else {
//                println("WARNING: No input in " + to + " for redirected output " + o.name + " in "+from)
            }
        }
    }
    
    private def Model findModel(DataPool pool, String name) {
        val model = pool.models.findFirst[it.name == name]
        if(model == null) {
            throw new Exception("Can't redirect variables. Model '"+name+"' has not been found in the data pool.")
        }
        return model
    }
    
    override getName() {
        return "redirect"
    }
    
    /**
     * {@inheritDoc}
     */
    override toString() {
        return "Redirect from '"+from.stringValue+ "' to '"+to.stringValue+"'"
    }
}