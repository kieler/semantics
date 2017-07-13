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
import de.cau.cs.kieler.prom.build.ConfigurableAttribute
import de.cau.cs.kieler.simulation.core.DataPool
import java.io.File
import org.eclipse.core.resources.IFile
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class SimulationOutputFileHandler extends DefaultDataHandler {
    
    public val location = new ConfigurableAttribute("fileLocation", null, true)
    
    @Accessors
    private var IFile file
    
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
    
    private def String getFileLocation() {
        if(file != null) {
            return file.location.toOSString
        } else {
            return location.stringValue
        }
    }
    
    override getName() {
        return "simout"
    }
    
    override toString() {
        return "OutputFileHandler '"+fileLocation+"'"
    }
}