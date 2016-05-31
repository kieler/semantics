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

import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.priorities.extensions.SCCExtensions
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import javax.inject.Inject

/**
 * @author lpe
 *
 */
class ThreadSegmentIDs {
    //TODO TODO TODO
    @Inject
    extension SCCExtensions
    
    
    private HashMap<Node, Integer> threadSegmentIDs
    private HashMap<Node, Boolean> visited
    private HashMap<Node, Integer> nodePrios
    private int nThreadSegmentIDs
    
    public def int getNumberOfThreadSegmentIDs() {
        return nThreadSegmentIDs
    }
    
    public def HashMap<Node, Integer> calcThreadSegmentIDs(List<Node> nodes, HashMap<Node, Integer> nodePrios) {
        
        this.nodePrios = nodePrios
        
        threadSegmentIDs = <Node, Integer> newHashMap
        visited          = <Node, Boolean> newHashMap
        for(node : nodes) {
            visited.put(node, false)
        }
        
        val forkNodes = nodes.filter[it instanceof Fork]
        var LinkedList<Node> entryToThreadNodes = <Node> newLinkedList
        
        for(node : forkNodes) {
            val fork = node as Fork
            for(link : fork.next) {
                entryToThreadNodes.add(link.target)
            }
        }
        nThreadSegmentIDs = entryToThreadNodes.length
        
        assignThreadSegmentIDs(nodes.head, 1)
        
        
        return threadSegmentIDs
    }
    
    private def int assignThreadSegmentIDs(Node node, int threadID) {
        var tID = threadID
        val neighbors = node.allNeighbors
        
        if(!visited.get(node)) {
            visited.put(node, true)
            if(node instanceof Fork) {
                val sortedNeighbors = neighbors.sortBy[neighbor | nodePrios.get(neighbor)]
                
                var LinkedList<Integer> childIDs = <Integer> newLinkedList
                for(n : sortedNeighbors) {
                    tID = assignThreadSegmentIDs(n, tID)
                    childIDs.add(tID)
                    tID++
                }
                tID = childIDs.max
                threadSegmentIDs.put(node, tID)
                
            } else {
                for(n : neighbors) {
                    tID = assignThreadSegmentIDs(n, tID)
                    threadSegmentIDs.put(node, tID)
                }
            }
            
        }
        if(neighbors.empty) {
            threadSegmentIDs.put(node, tID)
        }
        
        return tID
        
    }
    
}