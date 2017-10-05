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

import com.google.common.base.Charsets
import com.google.common.io.Files
import de.cau.cs.kieler.simulation.core.DataPool

/**
 * @author aas
 *
 */
class SimulationOutputFileHandler extends SimulationInputOutputFileHandlerBase {
    
    /**
     * {@inheritDoc}
     */
    override initialize() {
        super.initialize
        // Get name for the model if none set
        if(!modelName.isDefined) {
            modelName.value = file.name
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override initialize(DataPool pool) {
    }
    
    /**
     * Serialize a model in the data pool to JSON and save it in the file system.
     * 
     * @param pool The pool
     */
    override write(DataPool pool) {
        // Serialize the model and save it in the file system.
        // If there is no such model, output the first model in the pool
        var model = findModel(pool, modelName.stringValue)
        if(model != null) {
            val json = model.toJson
            Files.write(json, file, Charsets.UTF_8)
        } else {
            throw new Exception("No model with name '"+modelName.stringValue+"' was found for "+toString)
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getName() {
        return "simout"
    }
    
    /**
     * {@inheritDoc}
     */
    override toString() {
        return "SimulationOutputFileHandler '"+file.path+"'"
    }
}