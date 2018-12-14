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
package de.cau.cs.kieler.sccharts.processors.csv

import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.sccharts.SCCharts
import java.util.ArrayList

/**
 * @author stu114663
 *
 */
class CSVExporter extends ExogenousProcessor<SCCharts, String> {
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.CSVExporter"
    }
    
    override getName() {
        "SCTX to CSV Exporter"
    }
    
    override process() {
        val sourceString = getModel
    }
}