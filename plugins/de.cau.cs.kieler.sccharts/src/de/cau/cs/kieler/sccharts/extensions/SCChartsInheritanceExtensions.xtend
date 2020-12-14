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

import com.google.common.collect.HashMultimap
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.sccharts.LocalAction
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kexpressions.AccessModifier
import de.cau.cs.kieler.sccharts.BaseStateReference
import de.cau.cs.kieler.sccharts.SCChartsFactory

/**
 * @author als
 *
 */
class SCChartsInheritanceExtensions {
    
    /**
     * Returns all base states.
     */
    def Iterable<State> baseStates(State state) {
        return state.baseStateReferences.map[target].filterNull
    }
    
    /**
     * Returns a set of all states contained in the inheritance hierarchy of the given state.
     */
    def Set<State> getAllInheritedStates(State state) {
        val allBaseStates = <State>newLinkedHashSet
        
        if (state !== null && !state.baseStateReferences.nullOrEmpty) {
            val work = newLinkedList
            work.addAll(state.baseStates.toSet)
            work.removeIf[it == state]
            
            while (!work.empty) {
                val s = work.pop
                allBaseStates += s
                for (base : s.baseStateReferences.reverseView.map[target].filterNull) { // Depth first
                    if (base != state && !work.contains(base) && !allBaseStates.contains(base)) {
                        work.push(base)
                    }
                }
            }
        }
        return allBaseStates
    }
    
    /**
     * Returns a list of all base states references contained in the inheritance hierarchy acending depth.
     */
    def List<BaseStateReference> getAllInheritedStatesReferencesHierachically(State state) {
        val allBaseStateRefs = <BaseStateReference>newLinkedHashSet
        
        if (state !== null && !state.baseStateReferences.nullOrEmpty) {
            val work = newLinkedList
            work.addAll(state.baseStateReferences)
            work.removeIf[it.target == state]
            
            while (!work.empty) {
                val ref = work.pop
                allBaseStateRefs += ref
                val target = ref.target
                if (!target.baseStateReferences.nullOrEmpty) {
                    for (baseRef : target.baseStateReferences.filterNull) { // Depth first
                        if (baseRef.target !== null && baseRef.target != state && !work.contains(baseRef) && !allBaseStateRefs.contains(baseRef)) {
                            work.add(baseRef)
                        }
                    }
                }
            }
        }
        return allBaseStateRefs.toList
    }
    
    /**
     * Returns an iterator of all visible (no private) declarations of all states contained in the inheritance hierarchy of the given state.
     * Conflicting duplicates will be included.
     */
    def Iterable<Declaration> getAllVisibleInheritedDeclarations(State state) {
        return state.getAllInheritedStates.map[it.declarations].flatten.filter[access !== AccessModifier.PRIVATE]
    }
    
    /**
     * Returns an iterator of all declarations in all states contained in the inheritance hierarchy of the given state.
     * Conflicting duplicates will be included.
     */
    def Iterable<Declaration> getAllInheritedDeclarations(State state) {
        return state.getAllInheritedStates.map[it.declarations].flatten
    }
    
    /**
     * Returns an iterator of all actions of all states contained in the inheritance hierarchy of the given state.
     */
    def Iterable<LocalAction> getAllVisibleInheritedActions(State state) {
        return state.getAllInheritedStates.map[it.actions].flatten
    }
    
    /**
     * Returns an iterator of all visible (override region will hide overridden ones) regions of all states contained in the inheritance hierarchy of the given state.
     * Conflicting duplicates will be included.
     */
    def Iterable<Region> getAllVisibleInheritedRegions(State state) {
        return state.getAllVisibleInheritedRegions(true)
    }
    
    /**
     * Returns an iterator of all visible (override region will hide overridden ones) regions of all states contained in the inheritance hierarchy of the given state.
     * Conflicting duplicates will be included.
     * @param directOverride if true the given state also contributed as overrider.
     *
     */
    def Iterable<Region> getAllVisibleInheritedRegions(State state, boolean directOverride) {
        if (state !== null && !state.baseStateReferences.nullOrEmpty) {
            val regions = newLinkedHashSet
            val path = newLinkedList(state)
            val indexes = newLinkedList(-1)
            val overrides = <List<Region>>newLinkedList
            if (directOverride) {
                overrides.push(state.regions.filter[!name.nullOrEmpty && override].toList)
            } else {
                overrides.push(emptyList)
            }
            
            while (!path.empty) {
                val s = path.peek
                val idx = indexes.pop + 1
                if (idx == 0 && s != state) {
                    regions += s.regions.filter[ r | r.name.nullOrEmpty || !overrides.flatten.exists[r.name.equals(name)]]
                    overrides.push(s.regions.filter[!name.nullOrEmpty && override].toList)
                }
                if (s.baseStateReferences === null || s.baseStateReferences.size <= idx) {
                    path.pop
                    overrides.pop
                } else {
                    indexes.push(idx)
                    val base = s.baseStateReferences.get(idx)?.target
                    // check cycle
                    if (base !== null && !path.contains(base)) {
                        path.push(base)
                        indexes.push(-1)
                    }
                }
            }
            
            return regions
        }
        return emptyList
    }
    
    /**
     * Returns true if the given state has an acyclic hierarchy.
     */
    def hasAcyclicHierarchy(State state) {
        return state.hierarchyCycles.empty
    }
    
    /**
     * Returns states that are included in hierarchy cycles, values id the index of the baseState of the given state which includes the cycle.
     */
    def getHierarchyCycles(State state) {
        val cycles = HashMultimap.<State, Integer>create
        if (state !== null && !state.baseStateReferences.nullOrEmpty) {
            // DFS with checks if new child already exists in path to root.
            val path = newLinkedList(state)
            val indexes = newLinkedList(-1)
            while (!path.empty) {
                val s = path.peek
                val idx = indexes.pop + 1
                if (s.baseStateReferences === null || s.baseStateReferences.size <= idx) {
                    path.pop
                } else {
                    indexes.push(idx)
                    val base = s.baseStateReferences.get(idx)?.target
                    // check cycle
                    if (path.contains(base)) {
                        cycles.put(base, indexes.last)
                    } else {
                        path.push(base)
                        indexes.push(-1)
                    }
                }
            }
        }
        return cycles
    }
    
    def State getNextSuperStateWithBaseStates(Scope scope) {
        var EObject parent = scope
        while (parent !== null) {
            if (parent instanceof State) {
                if (!parent.baseStateReferences.nullOrEmpty) {
                    return parent
                }
            }
            parent = parent.eContainer
        }
        return null
    }
    
    def BaseStateReference baseReference(State state) {
        return SCChartsFactory.eINSTANCE.createBaseStateReference => [
            target = state
        ]
    }

}