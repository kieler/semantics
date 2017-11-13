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
package de.cau.cs.kieler.simulation.trace.printer

import de.cau.cs.kieler.prom.FileExtensions
import de.cau.cs.kieler.simulation.core.DataPool
import java.util.List

/**
 * @author aas
 *
 */
class EsoFilePrinter extends TracePrinter {
    override getFileExtension() {
        return FileExtensions.ESO
    }
    
    override getFileContent(List<DataPool> history) {
        var String content = ""
        // Start with a reset
        content += "! reset;\n"
        // Print variables that are present, possibly with their current value
        for(pool : history) {
            if(pool.models.size > 1) {
                throw new Exception("Eso files are currently not supported with multiple data pools in the simulation.")
            }
            for(v : pool.allVariables) {
                if(v.isInput && v.isPresent) {
                    content += v.name
                    if(v.value instanceof Integer) {
                        content += "("+v.value+")"
                    }
                    content += " "
                }
            }
            content += "\n"
            content += "% Output: "
            for(v : pool.allVariables) {
                if(v.isOutput && v.isPresent) {
                    content += v.name
                    if(v.value instanceof Integer) {
                        content += "("+v.value+")"
                    }
                    content += " "
                }
            }
            content += "\n;\n"
        }
        return content
    }
}