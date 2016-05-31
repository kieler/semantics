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
import java.util.List

/**
 * @author lpe
 *
 */
class PrioIDs {
    
    
    public def HashMap<Node, Integer> calcPrioIDs(HashMap<Node, Integer> nodePrios, HashMap<Node, Integer> 
                                                        threadSegmentIDs, int nThreadSegmentIDs, List<Node> nodes) {
        
        val HashMap<Node, Integer> prioIDs = <Node, Integer> newHashMap
        for(node : nodes) {
            val nodePrio = nodePrios.get(node)
            val threadID = threadSegmentIDs.get(node)
            var prioID = -1
            if(nodePrio != null && threadID != null) {
                prioID = nodePrio * nThreadSegmentIDs + threadID
            }
            
            prioIDs.put(node, prioID)
        }
        
        prioIDs
        
    }
}