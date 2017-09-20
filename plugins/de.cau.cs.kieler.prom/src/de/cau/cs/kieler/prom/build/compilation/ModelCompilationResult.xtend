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
package de.cau.cs.kieler.prom.build.compilation

import de.cau.cs.kieler.prom.build.FileGenerationResult
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Data container for the result of a compiled model.
 * 
 * @author aas
 *
 */
class ModelCompilationResult extends FileGenerationResult {
    /**
     * Optional simulation generation result if a simulation has been generated for the compiled model as well.
     */
    @Accessors    
    var FileGenerationResult simulationGenerationResult
    
    /**
     * Returns the files that have been generated for a simulation of the compiled model.
     * 
     * @return the generated files for simulation, or an empty list if there are none 
     */
    public def List<IFile> getCreatedSimulationFiles() {
        if(simulationGenerationResult != null) {
            return simulationGenerationResult.createdFiles    
        }
        return newArrayList
    }
}