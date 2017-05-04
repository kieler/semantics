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
package de.cau.cs.kieler.simulation.handlers

import de.cau.cs.kieler.simulation.core.DataHandler
import de.cau.cs.kieler.simulation.core.DataPool

/**
 * @author aas
 *
 */
class Redirect implements DataHandler {
    
    public String from
    public String to
    
    override write(DataPool pool) {
        val fromModel = pool.models.findFirst[it.name == from]
        val outputs = fromModel.variables.filter[it.isOutput]

        val toModel = pool.models.findFirst[it.name == to]
        val inputs = toModel.variables.filter[it.isOutput]
        
        // Set value of inputs of destination to value of outputs of source 
        for(o : outputs) {
            val i = inputs.findFirst[it.name == o.name]
            if(i != null) {
                i.value = o.value
            }
        }
    }
    
    override read(DataPool pool) {
        // Nothing to do here
    }
}