/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors.transformators

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor

/**
 * @author aas
 *
 */
class FinalStateOptimizations extends SCChartsProcessor implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.finalStateOptimizations"
    }
    
    override getName() {
        "Final State Optimizations"
    }
 
    override process() {
        setModel(model.transform)
    }

    //-------------------------------------------------------------------------
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    
    //-------------------------------------------------------------------------
    //--                       T R A N S F O R M A T I O N                   --
    //-------------------------------------------------------------------------
    public def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }
    
    private def State transform(State rootState) {
        for (state : rootState.allStates.toList) {
            state.simplifyFinalStates(rootState)
        }
        rootState
    }
    
    private def void simplifyFinalStates(State state, State targetRootState) {
        // Convert final states to simple states
        //   - if there is no outgoing termination transition on the super state (no need for final states then)
        //   - if a concurrent region on the super state does not have a final state (not all regions can terminate anyway)
        val controlflowRegions = state.controlflowRegions
        val hasTermination = state.outgoingTransitions.exists[it.isTermination]
        val notAllRegionsCanTerminate = controlflowRegions.exists[!it.hasFinalState]
        if(!hasTermination || notAllRegionsCanTerminate) {
            // Remove all final states in the regions because they have no effect
            for(region : controlflowRegions) {
                val finalStates = region.states.filter[it.isFinal]
                for(finalState : finalStates) {
                    finalState.final = false
                }
            }
        }
    }
    
    private def boolean hasFinalState(ControlflowRegion region) {
        return region.states.exists[it.isFinal]
    }
}