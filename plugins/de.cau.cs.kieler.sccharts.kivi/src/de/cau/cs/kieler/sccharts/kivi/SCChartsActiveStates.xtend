/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.kivi

import de.cau.cs.kieler.sccharts.State
import java.util.HashMap
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.ControlflowRegion
import java.util.HashSet
import java.util.List
import java.util.ArrayList

/**
 * This class is meant to calculate active states by using the structure of an 
 * SCChart an information about taken transitions. It is meant to be used only with
 * simulator components that do not provide active state information.
 * 
 * @author cmot
 *
 */
class SCChartsActiveStates {
    
    HashSet<State> activeStates = new HashSet<State>
    
    def void resetAll() {
        activeStates = new HashSet<State>
    }
    
    def void enterState(State state) {
        activeStates.add(state)
        if (state.regions.nullOrEmpty) {
            return;
        }
        for (region : state.regions) {
            if (region instanceof ControlflowRegion) {
                for (initialState : region.states.filter[isInitial]) {
                    initialState.enterState
                }
            }
        }
    }
    
    
    def void leaveState(State state) {
        activeStates.remove(state)
        if (state.regions.nullOrEmpty) {
            return;
        }
        for (region : state.regions) {
            if (region instanceof ControlflowRegion) {
                for (innerState : region.states) {
                    innerState.leaveState
                }
            }
        }
    }
    
    def public List<State> getAllActiveStates() {
        val returnList = new ArrayList<State>
        for(state : activeStates) {
            if (state instanceof State) {
               returnList.add(state)
            }
        }
        return returnList
    }
    
    
}