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
import de.cau.cs.kieler.simulation.core.Model

/**
 * Reads the input file and sets the variables of a model in the simulation accordingly.
 * 
 * @author aas
 *
 */
class SimulationInputFileHandler extends SimulationInputOutputFileHandlerBase {
    /**
     * {@inheritDoc}
     */
    override initialize(DataPool pool) {
        super.initialize
        // Create name for new model if none set
        if(!modelName.isDefined) {
            modelName.value = getUniqueModelName(pool, file.name)
        }
        // Load the JSON object from the file
        val lines = Files.readLines(file, Charsets.UTF_8)
        // Set variable of model or create new model from the JSON object
        var Model model
        if(lines.isNullOrEmpty) {
            model = new Model
        } else {
            val line = lines.get(0)
            model = Model.createFromJson(modelName.stringValue, line)
        }
        pool.addModel(model)
    }
    
    /**
     * Reads the content of the file and parses it as JSON object.
     * Fills the data pool with the loaded values.
     * 
     * @param pool The pool
     */
    override write(DataPool pool) {
        // Get model in pool
        val model = findModel(pool, modelName.stringValue)

        // Read data pool from file
        val lines = Files.readLines(file, Charsets.UTF_8)
        var Model newModel
        if(lines.isNullOrEmpty) {
            newModel = new Model
        } else {
            val line = lines.get(0)
            newModel = Model.createFromJson(modelName.stringValue, line)
        }
        
        // Update model in pool
        pool.removeModel(model)
        pool.addModel(newModel) 
    }
    
    override getName() {
        return "simin"
    }
    
    override toString() {
        return "SimulationInputFileHandler '"+file.path+"'"
    }
}