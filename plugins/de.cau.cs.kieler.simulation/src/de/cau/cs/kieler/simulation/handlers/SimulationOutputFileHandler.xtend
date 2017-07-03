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

import com.google.common.io.Files
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.DefaultDataHandler
import org.eclipse.xtend.lib.annotations.Accessors
import com.google.common.base.Charsets
import java.io.File

/**
 * @author aas
 *
 */
class SimulationOutputFileHandler extends DefaultDataHandler {
    
    @Accessors
    private var String fileLocation
    
    private var String modelName
    
    /**
     * Write a model in the data pool to the file system.
     */
    override write(DataPool pool) {
        val fileName = Files.getNameWithoutExtension(fileLocation)
        modelName = fileName
        
        // Try to output model that has the same name as the file.
        // If there is no such model, output the first model in the pool
        var model = pool.getModel(modelName)
        if(model == null && !pool.models.isNullOrEmpty) {
           model = pool.models.get(0) 
        }
        if(model != null) {
            val json = model.toJson
            
            val file = new File(fileLocation)
            Files.write(json, file, Charsets.UTF_8)
        }
    }
    
    
    override toString() {
        return "OutputFileHandler '"+fileLocation+"'"
    }
}