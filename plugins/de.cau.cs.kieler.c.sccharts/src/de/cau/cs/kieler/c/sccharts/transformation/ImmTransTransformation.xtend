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
package de.cau.cs.kieler.c.sccharts.transformation

import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import java.util.LinkedList

/**
 * @author SL
 *
 */
class ImmTransTransformation extends AbstractExpansionTransformation {
 
 
    LinkedList<State> nextStates = new LinkedList<State>();
    LinkedList<State> tmpList = new LinkedList<State>();
    
    override getProducesFeatureIds() {
        return newHashSet(SCChartsFeatureGroup.EXPANSION_ID)
    }
    
    override getExpandsFeatureId() {
        return CbasedSCChartFeature.ID
    }
     
    override getId() {
        val String id = "immediateTrans"
        return id
    }

    
    // It is required, that a state contains only one ControlflowRegion
    def State transform(State rootState, KielerCompilerContext context) {
        
        val regions = rootState.regions.filter(ControlflowRegion)
        // List of States of function
        val states = regions.head.states
        // Todo list
        for (s : states) {
            nextStates.add(s)
        }
        

        // Make all outgoing transitions of all states in this region immediate transitions
        while (!nextStates.empty) {
            
            tmpList.clear
            
            for (s : nextStates) {
                // Change all transitions of State s
                for (t : s.outgoingTransitions) {
                    t.immediate = true
                }
                for (t : s.incomingTransitions) {
                    t.immediate = true
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
        
        rootState
    }
 
    
}