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
package de.cau.cs.kieler.sccharts.processors.tabels

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.sccharts.SCCharts
import java.util.List

/**
 * @author stu114663
 *
 */
class Table2SCTX extends ExogenousProcessor<List<List<String>>, SCCharts> {
    @Inject
    var de.cau.cs.kieler.sccharts.processors.tabels.TableIdentifier tableid
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.Table2SCTX"
    }
    
    override getName() {
        "Table2SCTX"
    }
    
    override process() {
        val model = getModel
        // TODO check for empty model
        val TableInterpreter ti = getInterpreter(model)
        
        // TODO should be done by TableIdentifier
        ti.table = getModel
//        stti.initialize(null, null)
        model = ti.interpret
    }
    
    def TableInterpreter getInterpreter(List<List<String>> table) {        
        return tableid.identify(table)
    }
}
