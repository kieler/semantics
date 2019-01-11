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
import java.util.List

/**
 * @author stu114663
 *
 */
class Table2CSV extends ExogenousProcessor<List<List<String>>, String> {
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.Table2CSV"
    }
    
    override getName() {
        "Table2CSV"
    }
    
    override process() {
        val table = getModel
        // TODO check for empty model
        val CSVBuilder cb = new CSVBuilder(table, ",", "\\")
        model = cb.getCSV()
    }
    
    
}