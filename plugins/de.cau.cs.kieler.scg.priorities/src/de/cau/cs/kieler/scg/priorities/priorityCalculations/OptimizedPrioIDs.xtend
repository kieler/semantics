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
package de.cau.cs.kieler.scg.priorities.priorityCalculations

import de.cau.cs.kieler.scg.Node
import java.util.HashMap
import java.util.LinkedList
import java.util.List

/**
 * @author lpe
 *
 */
class OptimizedPrioIDs {
    
    
    public def HashMap<Node, Integer> calcOptimizedPrioIDs(HashMap<Node, Integer> prioIDs, List<Node> nodes) {
        
        var LinkedList<Integer> ids = <Integer> newLinkedList
        var List<Integer> sortedIds
        
        for(node : nodes) {
            val id = prioIDs.get(node)
            if(id != null && !ids.contains(id)) {
                ids.add(id)
            }
        }
        sortedIds = ids.sort
        
        var HashMap<Node, Integer> optPrioIDs = <Node, Integer> newHashMap
        for(node : nodes) {
            val pID = prioIDs.get(node)
            if(pID != null) {
                optPrioIDs.put(node, sortedIds.indexOf(pID))
                
            }
        }
        
        return optPrioIDs
        
    }
    
}