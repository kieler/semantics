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

import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.DefaultDataHandler
import de.cau.cs.kieler.simulation.core.NDimensionalArray
import java.util.Arrays

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
    public String from
    /**
     * The name of the model of which the inputs should be set.
     */
    public String to
    
    /**
     * Sets the value of input variables the to-model
     * to the value of output variables of the from-model.
     */
    override write(DataPool pool) {
        val fromModel = pool.models.findFirst[it.name == from]
        val outputs = fromModel.variables.filter[it.isOutput]
        
        val toModel = pool.models.findFirst[it.name == to]
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
                            throw new Exception("Array size mismatch of redirected variable '" + i.name + "'"
                                                             + " from '"+from+ "' to '"+to+"'\n"
                                                             + "(size " + NDimensionalArray.toString(iIndices) + " != size " + NDimensionalArray.toString(oIndices) + ")")
                        }
                    }
                } else {
                    throw new Exception("Type mismatch of redirected variable '" + i.name + "' from '"+from+ "' to '" + to + "'")
                }
                
                i.value = o.value
            } else {
                System.err.println("WARNING: No input in " + to + " for redirected output " + o.name + " in "+from)
            }
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override toString() {
        return "Redirect from '"+from+ "' to '"+to+"'"
    }
}