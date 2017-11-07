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

import java.util.List
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.prom.FileExtensions

/**
 * @author aas
 *
 */
class SimulationHistoryPrinter extends TracePrinter {
    override getFileExtension() {
        return FileExtensions.SIM_HISTORY
    }
    
    override getFileContent(List<DataPool> history) {
        // Turn data pools to json objects
        var String content = ""
        for(pool : history) {
            content += pool.toJson+"\n"
        }
        return content
    }
}