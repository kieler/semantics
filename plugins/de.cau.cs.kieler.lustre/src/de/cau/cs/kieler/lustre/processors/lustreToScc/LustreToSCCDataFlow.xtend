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
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.lustre.extensions.LustreCreateExtension
import de.cau.cs.kieler.lustre.lustre.Automaton
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.kexpressions.keffects.Assignment

/**
 * @author lgr
 *
 */
class LustreToSCCDataFlow extends AbstractLustreToSCC {

    static final String DATAFLOW_REGION_PREFIX = "dataflow_region_for_"

    extension SCChartsFactory = SCChartsFactory.eINSTANCE
    @Inject extension LustreCreateExtension
    

    
    override getId() {
        return "de.cau.cs.kieler.lustre.processors.lustreToSCC.dataFlow"
    }

    override getName() {
        return "Lustre to SCCharts Data-flow"
    }

    override ProcessorType getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
        
    override processEquation(Assignment equation, State state) {
       
       // Search for a dataflow region within the state
       var dataflowRegionIndex = -1
       for (var i = 0; dataflowRegionIndex == -1 && i < state.regions.length; i++) {
           val region = state.regions.get(i)
           if (region instanceof DataflowRegion) {
               dataflowRegionIndex = i
           }           
       }
       
       // If there is none, create one
       if (dataflowRegionIndex == -1) {
           var dfRegion = createDataflowRegion => [
                name = DATAFLOW_REGION_PREFIX + state.name
                label = DATAFLOW_REGION_PREFIX + state.name
            ]
            state.regions += dfRegion
            dataflowRegionIndex = state.regions.indexOf(dfRegion)
       }
        
        var dataflowRegion = state.regions.get(dataflowRegionIndex) as DataflowRegion
        
        dataflowRegion.equations += equation.createAssignmentFromLustre(lustreToScchartsValuedObjectMap)
    }
    
    override processAutomaton(Automaton automaton, State state) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override processAssertion(Expression assertion, State state) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
        
}