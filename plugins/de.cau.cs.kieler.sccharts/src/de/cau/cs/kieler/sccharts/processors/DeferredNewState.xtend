/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.processors

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions

/**
 * @author kolja
 * 
 */
class DeferredNewState extends SCChartsProcessor implements Traceable {
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.deferredNewState"
    }

    override getName() {
        "Deferred"
    }

    override process() {
        setModel(model.transform)
    }

    // -------------------------------------------------------------------------
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsActionExtensions

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_deferred_"

    // ---------------------------------------------------------------------------------------------
    // --             D E F E R R E D    N E W    S T A T E   T R A N S I T I O N                 --
    // ---------------------------------------------------------------------------------------------
    // For all deferred transitions T from S1 to S2, create a new State _S2
    // copy behavior of S2 to _S2 and copy all outgoing transitions from S2 to _S2 
    // and make all outgoing transitions of _S2 delayed
    def State transform(State rootState) {
        // Traverse all states
        rootState.allContainedTransitions.forEach[transition|transition.transformDeferred]
        rootState
    }

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [rootStates.forEach[transform]]
    }

    def void transformDeferred(Transition transition) {
        if (transition.deferred) {

            var State _S = null
            if (transition.targetState.parentRegion.allStates.filter [
                it.name == GENERATED_PREFIX + transition.targetState.name
            ].size > 0) { // get deferred copy
                _S = transition.targetState.parentRegion.allStates.filter [
                    it.name == GENERATED_PREFIX + transition.targetState.name
                ].toList.get(0)
            } else // Create a new state _S
            {
                transition.targetState.makeVariablesPublic(transition.targetState.parentRegion)
                _S = transition.targetState.copy
                _S.incomingTransitions.clear
                _S.outgoingTransitions.clear
                _S.name = GENERATED_PREFIX + transition.targetState.name
                transition.targetState.parentRegion.states.add(_S)
                // copy outgoing transitions
                for (outTransition : transition.targetState.outgoingTransitions) {
                    var nT = outTransition.copy
                    nT.sourceState = _S
                    nT.targetState = outTransition.targetState
                    nT.delay = DelayType.DELAYED
                    _S.outgoingTransitions.add(nT)
                }
                while( _S.entryActions.size > 0 )
                    _S.entryActions.get( 0 ).remove
                for( during : _S.duringActions )
                    during.delay = DelayType.DELAYED
                for( subRegion : _S.allContainedControlflowRegions.toList ){
                    if( subRegion.states.size > 0 ){
                        for( state : subRegion.states.filter[ it.initial ].toList ){
                            for( trans : state.outgoingTransitions ){
                                trans.delay = DelayType.DELAYED
                            }
                        }
                    }
                }
            }

            // Re-target transition T
            transition.targetState = _S
            // Remove deferred flag
            transition.deferred = false
        }
    }

    def void makeVariablesPublic(State s, ControlflowRegion parent) {
        while (s.declarations.size > 0)
            parent.declarations.add(s.declarations.get(0))
        for( subState : s.allContainedStates.toList )
            subState.makeVariablesPublic( parent )
        for( region : s.allContainedDataflowRegions.toList )
        {
            while( region.declarations.size > 0 )
                parent.declarations.add(s.declarations.get(0))
        }
        for( region : s.allContainedControlflowRegions.toList )
        {
            while( region.declarations.size > 0 )
                parent.declarations.add(s.declarations.get(0))
        }
    }
}
