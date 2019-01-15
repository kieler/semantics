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
    var de.cau.cs.kieler.sccharts.processors.tabels.StateTransitionTableInterpreter stti
    @Inject
    var de.cau.cs.kieler.sccharts.processors.tabels.StateEventTableInterpreter seti
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.Table2SCTX"
    }
    
    override getName() {
        "Table2SCTX"
    }
    
    override process() {
        stti.table = getModel
        // TODO check for empty model
//        stti.initialize(null, null)
        model = stti.interpret
    }
}
