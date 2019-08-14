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
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions

import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.ControlflowRegion

/**
 * @author kolja
 *
 */
class DeferredNewState extends SCChartsProcessor implements Traceable {
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.deferrednewstate"
    }
    
    override getName() {
        "Deferred"
    }

    override process() {
        setModel(model.transform)
    }


    //-------------------------------------------------------------------------
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"
    
    //---------------------------------------------------------------------------------------------
    //--             D E F E R R E D    N E W    S T A T E   T R A N S I T I O N                 --
    //---------------------------------------------------------------------------------------------
    // For all deferred transitions T from S1 to S2, create a new State _S
    // create a new transition _T from _S to S2 and change T's target to _S.
    // Remove the deferred flag from T.
    def State transform(State rootState) {
        // Traverse all states
        rootState.allContainedTransitions.forEach[ transition | transition.transformDeferred ]
        rootState
    }

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }
    
    def void transformDeferred(Transition transition) {
        if (transition.deferred) {
            // Create a new state _S
            val _S = transition.targetState.parentRegion.createState(transition.targetState.parentRegion.newUniqueStateName)
            // Create a new transition _T
            _S.createTransitionTo(transition.targetState)
            // Re-target transition T
            transition.setTargetState(_S)
            // Remove deferred flag
            transition.setDeferred(false)
        }
    }
    
    // creates a new unique state name
    def newUniqueStateName( ControlflowRegion r ) {
        var name = GENERATED_PREFIX + "deferred";
        var suffix = 0
        while( true )
        {
           val fName = name;
           if(!r.allContainedStates.exists[it.name == fName]) 
                return name
           name = GENERATED_PREFIX + "deferred" + suffix++
        }
    }
}