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
 * Class to calculate the PrioIDs of the nodes in an SCG.
 * @author lpe
 *
 */
class PrioIDs {
    
    HashMap<Node, Boolean> visited = <Node, Boolean>newHashMap
    
    /**
     * Calculates the priority IDs of every node using the node priorities, the thread segment IDs and the overall 
     * number of thread segment IDs: node priority * number of thread segmend IDs + thread segment ID
     * 
     * @param nodePrios
     *                  The node priorities of all nodes
     * @param threadSegmentIDs
     *                  The thread segment IDs of all nodes
     * @param nThreadSegmentIDs
     *                  The overall number of used thread segment IDs
     * @param nodes
     *                  A list of all nodes contained in the SCG
     * 
     * @return
     *                  A HashMap mapping the nodes to their PrioID
     */
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
        
        visited = <Node, Boolean>newHashMap
        
        prioIDs
        
    }
    
    
    
}