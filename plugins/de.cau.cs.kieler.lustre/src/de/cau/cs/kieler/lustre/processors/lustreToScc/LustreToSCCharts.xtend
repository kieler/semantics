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

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.lustre.lustre.Equation
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions

/**
 * @author lgr
 *
 */
class LustreToSCCharts extends CoreLustreToSCC {

    @Inject extension SCChartsDataflowRegionExtensions
    
    override getId() {
        return "de.cau.cs.kieler.lustre.processors.lustreToSCC.dataFlow"
    }

    override getName() {
        return "Lustre to SCCharts"
    }

    override ProcessorType getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }

    override processEquation(Equation equation, State state) {
        var dataflowRegion = getDataflowRegionFromState(state)
        
        var assignment = getAssignmentForEquation(equation, state)
        if (assignment !== null) {
            dataflowRegion.effects += assignment
        }
    }   
    
    private def getDataflowRegionFromState(State state) {
        val dataFlowRegionsList = getDataflowRegions(state)

        // If there is no dataflow region, create one
        if (dataFlowRegionsList.length == 0) {
            createDataflowRegion(state, CoreLustreToSCC.DATAFLOW_REGION_NAME)
        }
        
        return dataFlowRegionsList.head as DataflowRegion
    }
}
