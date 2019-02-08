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
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
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

    @Inject extension KEffectsExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    
    override getId() {
        return "de.cau.cs.kieler.lustre.processors.lustreToSCC.dataFlow"
    }

    override getName() {
        return "Lustre to SC DF"
    }

    override ProcessorType getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override protected reset() {
        controlflowRegionCounter = 0
    }

    override processEquation(Equation equation, State state) {
        // Search for a dataflow region within the state
        val dataFlowRegionsList = getDataflowRegions(state)

        // If there is no dataflow region, create one
        if (dataFlowRegionsList.length == 0) {
            var dfRegion = createDataflowRegion(DATAFLOW_REGION_PREFIX + state.name, DATAFLOW_REGION_PREFIX + state.name)
            state.regions += dfRegion
        }
        
        // Take the first dataflow region for creating the equation
        var dataflowRegion = dataFlowRegionsList.head as DataflowRegion
        
        // The left side of the equation should be a known valued object (either simple like 'x = ...' or complex like '(x,y) = ...'
        if ((equation.reference !== null && lustreToScchartsValuedObjectMap.containsKey(equation.reference.valuedObject))
            || lustreToScchartsValuedObjectMap.keySet.containsAll(equation.references.map[valuedObject])) {
                
                var dataflowAssignment = createAssignment
                if (equation.reference !== null) {
                    var kExpressionValuedObject = lustreToScchartsValuedObjectMap.get(equation.reference.valuedObject)
                    dataflowAssignment.reference = kExpressionValuedObject.reference
                }
                dataflowAssignment.expression = equation.expression.transformExpression(state)
    
                if (dataflowAssignment.expression !== null) {
                    dataflowRegion.equations += dataflowAssignment
                }
        }
    }   
}
