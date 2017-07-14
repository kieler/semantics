/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.features

import com.google.inject.Inject
import de.cau.cs.kieler.kico.features.Feature
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions

/**
 * SCCharts Abort Feature.
 * 
 * @author cmot
 * @kieler.design 2015-03-12 proposed 
 * @kieler.rating 2015-03-12 proposed yellow
 */
class Abort extends Feature {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsFeature::ABORT_ID
    }

    override getName() {
        return SCChartsFeature::ABORT_NAME
    }

    //-------------------------------------------------------------------------
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsActionExtensions

    // This method checks, if this feature is contained in a model
    def isContained(State model) {
        val allStates = model.getAllContainedStatesList
        for (state : allStates) {
            val stateHasUntransformedTransitions = ((state.outgoingTransitions.size > 1) || ((state.outgoingTransitions.
                size == 1) && (!(state.outgoingTransitions.filter[isTermination].filter[trigger == null].size == 1))))

            //val stateHasUntransformedAborts = (!(state.outgoingTransitions.filter[!typeTermination].nullOrEmpty))
            //        if (state.hierarchical && stateHasUntransformedAborts && state.label != "WaitAandB") {
            if ((state.controlflowRegionsContainStates || state.containsInnerActions) && stateHasUntransformedTransitions) {
                return true
            }
        }
        return false
    }
    
    def isContained(SCCharts sccharts) {
        for(s:sccharts.rootStates) {
            if (s.isContained) return true
        }
        false
    }    

}
