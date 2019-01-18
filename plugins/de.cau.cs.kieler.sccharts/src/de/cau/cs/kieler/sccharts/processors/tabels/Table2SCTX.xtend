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
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import java.util.List

/**
 * @author stu114663
 *
 */
class Table2SCTX extends ExogenousProcessor<List<List<String>>, SCCharts> {
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsStateExtensions
    
    @Inject
    var TableIdentifier tableid
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.Table2SCTX"
    }
    
    override getName() {
        "Table2SCTX"
    }
    
    override process() {
        val model = getModel
        // TODO check for empty model
        try {
            val TableInterpreter ti = getInterpreter(model)
            model = ti.interpret
        } catch (IllegalArgumentException exception) {
            environment.errors.add(exception)
//            val rootstate = createState => [name = "root"]
//            model = createSCChart => [rootStates += rootstate]
        }
    }
    
    def TableInterpreter getInterpreter(List<List<String>> table) throws IllegalArgumentException {        
        return tableid.identify(table)
    }
}
