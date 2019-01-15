/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.lustre.processors.lustreToScc

import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.kicool.compilation.ProcessorType

/**
 * @author lgr
 *
 */
class LustreToSCCDataFlow extends Processor<LustreProgram, SCCharts> {
    
    override getId() {
        return "de.cau.cs.kieler.lustre.processors.lustreToSCC.dataFlow"
    }

    override getName() {
        return "Lustre to SCCharts Control-flow"
    }

    override ProcessorType getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }

    override process() {
        model = model.transform
    }
    
    def SCCharts transform(LustreProgram p) {
        // TODO: transformation
    }
    
}