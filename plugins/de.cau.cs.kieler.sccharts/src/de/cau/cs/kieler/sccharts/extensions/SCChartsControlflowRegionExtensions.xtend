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
package de.cau.cs.kieler.sccharts.extensions

import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.State
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.SCChartsFactory

/**
 * @author ssm
 * @kieler.design 2017-06-28 proposed 
 * @kieler.rating 2017-06-28 proposed yellow 
 *
 */
class SCChartsControlflowRegionExtensions {
    
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsScopeExtensions
    
    def getControlflowRegions(State state) {
        state.regions.filter(ControlflowRegion)
    }
    
     // previously getControlFlowRegions2
    def getNotEmptyControlflowRegions(State state) {
        state.regions.filter(ControlflowRegion).filter[ !states.empty ]
    }    
    
    def boolean regionsMayTerminate(State state) {
        for (region : state.controlflowRegions) {
            if (region.allFinalStates.nullOrEmpty) {
                return false
            }
        }
        return true
    }
    
    def ControlflowRegion createControlflowRegion(String id) {
        SCChartsFactory::eINSTANCE.createControlflowRegion => [
            setName(id)
            setLabel("")
        ]
    }

    def createControlflowRegion(State state, String id) {
        val region = createControlflowRegion(id)
        // ATTENTION: if this is the first region and there already is an IMPLICIT region,
        // e.g., because of inner actions, then return THIS region only!
        if (state.regions.size == 1 &&
            state.regions.head instanceof ControlflowRegion && 
            state.regions.head.allContainedStates.empty) {
            val implicitRegion = state.regions.head as ControlflowRegion;
            implicitRegion.name = id;
            return implicitRegion;
        }
        state.regions += region
        region
    }

    // was empty
    def boolean containsStates(ControlflowRegion region) {
        !region.states.empty
    }
    
    // was controlflowRegionsNotEmpty
    // use also for hasInnerStatesOrControlflowRegions
    def boolean controlflowRegionsContainStates(State state) {
        for (r : state.regions.filter(ControlflowRegion)) {
            if (r.containsStates) return true
        }
        false
    }

}