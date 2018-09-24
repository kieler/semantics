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

import de.cau.cs.kieler.sccharts.State
import java.util.Set

/**
 * @author als
 *
 */
class SCChartsInheritanceExtensions {
    
    /**
     * Returns a set of all states contained in the inheritance hierarchy of the given state.
     */
    def Set<State> getAllInheritedStates(State state) {
        val allBaseStates = newLinkedHashSet
        val work = newLinkedList
        work.addAll(state.baseStates.toSet)
        work.removeIf[it == state]
        
        while (!work.empty) {
            val s = work.pop
            allBaseStates += s
            for (base : s.baseStates.reverseView) { // Depth first
                if (base != state && !work.contains(base) && !allBaseStates.contains(base)) {
                    work.push(base)
                }
            }
        }
        return allBaseStates
    }
    
    /**
     * Returns an iterator of all visible (no private) declarations of all states contained in the inheritance hierarchy of the given state.
     * Conflicting duplicates will be included.
     */
    def getAllVisibleInheritedDeclarations(State state) {
        return state.getAllInheritedStates.map[it.declarations].flatten.filter[!private]
    }
    
    /**
     * Returns an iterator of all actions of all states contained in the inheritance hierarchy of the given state.
     */
    def getAllVisibleInheritedActions(State state) {
        return state.getAllInheritedStates.map[it.actions].flatten
    }
    
    /**
     * Returns an iterator of all visible (override region will hide overridden ones) regions of all states contained in the inheritance hierarchy of the given state.
     * Conflicting duplicates will be included.
     */
    def getAllVisibleInheritedRegions(State state) {
        // TODO override
        return state.getAllInheritedStates.map[it.regions].flatten
    }
    
//    def allConflictingInheritedRegions(State state) {
//        return state.getAllInheritedStates.allConflictingInheritedRegions
//    }
//    
//    def allConflictingInheritedRegions(state, Collection<State> baseState) {
//            val idRegionMap = LinkedHashMultimap.<String, Region>create
//            for (r : state.regions) {
//                idRegionMap.put(r.name, r)
//            }
//            if (idRegionMap.keySet.size != idRegionMap.values.size) {
//                // we have a conflict
//            }
//        return state.getAllInheritedStates.map[it.regions].flatten
//    }
}