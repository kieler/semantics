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
import com.google.inject.Inject

/**
 * @author stu114663
 *
 */
class CSVImporter extends ExogenousProcessor<String, SCCharts> {
    
    @Inject
    var StateTransitionTableInterpreter stti
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.CSVImporter"
    }
    
    override getName() {
        "CSV to SCTX Importer"
    }
    
    override process() {
        val sourceString = getModel
        
        val CSVParser parser = new CSVParser(sourceString, ",", "\\")
        
        val ArrayList<ArrayList<String>> table = parser.getTable()
        
        stti.table = table
        stti.interpret
        
        println("TableInterpreter")
    }
}