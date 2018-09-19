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

import com.google.common.collect.LinkedHashMultimap
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import org.eclipse.xtend.lib.annotations.ToString
import org.eclipse.xtend.lib.annotations.Data
import de.cau.cs.kieler.sccharts.Action

/**
 * @author als
 *
 */
class SCChartsInheritanceExtensions {
    
    def getAllInherited(State state) {
        val inherited = new Inheritace
        val work = newLinkedList
        work.addAll(state.baseStates)
        
        while (!work.empty) {
            val s = work.pop
            inherited.declarationsMap.putAll(s, s.declarations)
            inherited.regionsMap.putAll(s, s.regions)
            for (base : s.baseStates) {
                if (!work.contains(base) &&
                    !inherited.declarationsMap.containsKey(base) &&
                    !inherited.regionsMap.containsKey(base) &&
                    !inherited.actionsMap.containsKey(base)
                ) {
                    work.add(base)
                }
            }
        }
        return inherited
    }
    
    def getAllInheritedDeclarations(State state) {
        return state.allInherited.declarations
    }
    
    def getAllInheritedRegions(State state) {
        return state.allInherited.regions
    }
    
    def getAllInheritedActions(State state) {
        return state.allInherited.actions
    }
}

@ToString
@Data
class Inheritace {
    
    val declarationsMap = LinkedHashMultimap.<State, Declaration>create
    val regionsMap = LinkedHashMultimap.<State, Region>create
    val actionsMap = LinkedHashMultimap.<State, Action>create
    
    def getDeclarations() {
        return declarationsMap.values
    }
    
    def getRegions() {
        return regionsMap.values
    }
    
    def getActions() {
        return actionsMap.values
    }
}