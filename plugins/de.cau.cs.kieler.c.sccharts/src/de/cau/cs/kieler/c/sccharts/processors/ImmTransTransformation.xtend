/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.c.sccharts.processors

import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.State
import java.util.LinkedList
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.sccharts.DelayType

/**
 * @author sle
 * 
 */
class ImmTransTransformation extends InplaceProcessor<SCCharts> {

    LinkedList<State> nextStates = new LinkedList<State>();
    LinkedList<State> tmpList = new LinkedList<State>();

    override getId() {
        "de.cau.cs.kieler.c.sccharts.immediateTransitions"
    }
    
    override getName() {
        "Immediate Transitions"
    }
    
    override process() {
        for(rootState : model.rootStates) {
            rootState.transform
        }
    }    
    
    // It is required, that a state contains only one ControlflowRegion
    def State transform(State rootSCChart) {
        if (rootSCChart instanceof SCCharts) {
            for (rootState : rootSCChart.rootStates) {

                val regions = rootState.regions.filter(ControlflowRegion)
                // List of States of function
                val states = regions.head.states
                // Todo-list
                for (s : states) {
                    nextStates.add(s)
                }

                /* Make marked all transitions, which are marked by the annotation "notImmediate" of all states in this region
                 * delayed transitions. 
                 */
                while (!nextStates.empty) {

                    tmpList.clear

                    for (s : nextStates) {
//                        // Change all transitions of State s
//                        for (t : s.outgoingTransitions) {
//                            if (t.annotations.head != null) {
//                                if (t.annotations.head.name.contains("notImmediate")) {
//                                    t.immediate = false
//                                }
//                            }
//                        }
                        for (t : s.incomingTransitions) {
                            if (t.annotations.head !== null) {
                                if (t.annotations.head.name.contains("notImmediate")) {
                                    t.delay = DelayType.DELAYED;
                                }
                            }
                        }
                        // If State s contains additional states that need to be checked for transitions add them to Todo list
                        var tmpRegions = s.regions.filter(ControlflowRegion)
                        if (!tmpRegions.empty) {
                            var tmpStates = tmpRegions.head.states
                            // Save states to copy to Todo list later
                            if (!tmpStates.empty) {
                                for (state : tmpStates) {
                                    tmpList.add(state)
                                }
                            }
                        }
                    }
                    // Update Todo list
                    nextStates.clear
                    for (s : tmpList) {
                        nextStates.add(s)
                    }
                }
            }
        }

        rootSCChart
    }
    

    
}
