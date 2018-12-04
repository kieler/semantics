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
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.core.model.Pair

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

    def ControlflowRegion getFirstControlflowRegion(EObject eObject) {
        if (eObject instanceof ControlflowRegion) 
            return eObject as ControlflowRegion
        else if (eObject.eContainer === null) 
            return null
        else if (eObject.eContainer instanceof ControlflowRegion) 
            return eObject.eContainer as ControlflowRegion
        else 
            return eObject.eContainer.getFirstControlflowRegion
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
    
    def ControlflowRegion createControlflowRegion(String id, String label) {
        SCChartsFactory::eINSTANCE.createControlflowRegion => [
            setName(id)
            setLabel(label)
        ]
    }
    
    def ControlflowRegion createControlflowRegion(String id) {
        createControlflowRegion(id, "")
    }

    def createControlflowRegion(State state, String id, String label) {
        val region = createControlflowRegion(id, label)
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

    /** Use createControlflowRegionWithoutLabel if you want an null label! */
    def createControlflowRegion(State state, String id) {
        createControlflowRegion(state, id, "")
    }
    
    /**
     * Historically transformations used createControlflowRegion with generation IDs, but also with empty labels.
     * Hence, ID only controlflow regions without explicit label that only show their ID cannot be created via 
     * createControlflowRegion. Use createControlflowRegionWithoutLabel for this. 
     * However, this kind of feels like a design flaw. Maybe this should be revised at some point in time. 
     */
    def createControlflowRegionWithoutLabel(State state, String id) {
        createControlflowRegion(state, id, null)
    }
    
    // was empty
    def boolean containsStates(ControlflowRegion region) {
        !region.states.empty
    }
    
    // was controlflowRegionsNotEmpty
    // use also for hasInnerStatesOrControlflowRegions
    def boolean controlflowRegionsContainStates(State state) {
        for (r : state.regions.filter(ControlflowRegion)) {
            if (r.containsStates || r.reference !== null) return true
        }
        false
    }
    
    /** Returns the nesting level of the given region. */
    def int getNestingLevel(Region r) {
        return r.getNestingLevel(0)
    }
    
    /** Adds the nesting levels of the given region to the given initial level. */
    def int getNestingLevel(Region r, int level) {
        val state = r.parentState
        if (state.eContainer instanceof Region) {
            return (state.eContainer as Region).getNestingLevel(level + 1)
        } else {
            return level
        }
    }

    /** Returns the ancestor region that is on the same level as the given region "concurrentRegion". */
    def Region ancestorRegion(Region r, Region concurrentRegion) {
        if (r === concurrentRegion) return r;
        
        val state = concurrentRegion.parentState
        var pull = r
        while (pull !== null && pull.eContainer != state) {
            pull = pull.parentState.parentRegion
        }
        return pull
    }
    
    /** Returns the ancestor region that (also) has the given state as superstate. */
    def Region ancestorRegion(Region r, State state) {
        if (r.parentState === state) return r;
        
        var pull = r
        while (pull !== null && pull.eContainer != state) {
            pull = pull.parentState.parentRegion
        }
        if (pull === null) {
            println(r + " is not nested inside of " + state)
        }
        return pull
    }
    
}