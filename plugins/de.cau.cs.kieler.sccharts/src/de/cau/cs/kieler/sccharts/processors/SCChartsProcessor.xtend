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
package de.cau.cs.kieler.sccharts.processors

import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.sccharts.SCCharts

/**
 * @author ssm
 * @kieler.design 2017-07-09 proposed
 * @kieler.rating 2017-07-09 proposed yellow  
 */
abstract class SCChartsProcessor extends InplaceProcessor<SCCharts> {
    
    public static val SCCHARTS_GENERATED = "generated-sccharts"
    
    var VariableStore voStore = null
    
    protected def voStore() {
        if (voStore === null) {
            voStore = VariableStore.getVariableStore(environment)
        }
        return voStore
    } 
}
