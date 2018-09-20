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

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions
import de.cau.cs.kieler.sccharts.State

/**
 * @author als
 *
 */
class SCChartsInheritanceExtensions {
    
    @Inject extension KExpressionsCompareExtensions
    
    def getAllInheritedStates(State state) {
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
    
    def getAllInheritedDeclarations(State state) {
        return state.getAllInheritedStates.map[it.declarations].flatten
    }
    
    def boolean isMergeableDeclaration(Declaration d1, Declaration d2) {
        return d1.sameType(d2)
    }
    
    def getAllInheritedActions(State state) {
        return state.getAllInheritedStates.map[it.actions].flatten
    }
    
    def getAllInheritedRegions(State state) {
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