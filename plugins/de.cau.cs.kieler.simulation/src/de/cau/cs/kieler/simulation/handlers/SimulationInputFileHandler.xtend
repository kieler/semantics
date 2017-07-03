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
import de.cau.cs.kieler.simulation.core.DefaultDataHandler
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.simulation.core.Simulator
import java.io.File
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class SimulationInputFileHandler extends DefaultDataHandler implements Simulator {
    
    @Accessors
    private var String fileLocation
    
    private var String modelName
    
    override initialize(DataPool pool) {
        val fileName = Files.getNameWithoutExtension(fileLocation)
        modelName = pool.getUniqueModelName(fileName, 0)
        var Model model
        val lines = Files.readLines(new File(fileLocation), Charsets.UTF_8)
        if(lines.isNullOrEmpty) {
            model = new Model
        } else {
            val line = lines.get(0)
            model = Model.createFromJson(modelName, line)
        }
        pool.addModel(model)
    }
    
    /**
     * Reads the content of the file and parses it as JSON object.
     * Fills the data pool with the created objects.
     */
    override write(DataPool pool) {
        // Get model in pool
        val model = pool.models.findFirst[it.name == modelName]
        
        // Read data pool from file
        val lines = Files.readLines(new File(fileLocation), Charsets.UTF_8)
        var Model newModel
        if(lines.isNullOrEmpty) {
            newModel = new Model
        } else {
            val line = lines.get(0)
            newModel = Model.createFromJson(modelName, line)
        }
        
        // Update model in pool
        pool.removeModel(model)
        pool.addModel(newModel) 
    }
    
    override toString() {
        return "InputFileHandler '"+fileLocation+"'"
    }
    
}