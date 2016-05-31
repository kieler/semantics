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
    
    /** The thread segment ID for each node */
    private HashMap<Node, Integer> threadSegmentIDs
    /** A HashMap to store whether a node has been visited or not */
    private HashMap<Node, Boolean> visited
    /** The node priorities of a node calculated beforehand */
    private HashMap<Node, Integer> nodePrios
    /** The overall number of thread segment IDs */
    private int nThreadSegmentIDs
    
    /**
     * Gives the number of thread segment IDs
     */
    public def int getNumberOfThreadSegmentIDs() {
        return nThreadSegmentIDs
    }
    
    /**
     * Calculates the thread segment IDs of the given SCG (given as a list of nodes).
     * 
     * @param nodes
     *              The SCG for which to calculate the thread segment IDs
     * @param nodePrios
     *              The node priorities of the given nodes. This is required to minimize 
     *              context switches 
     * 
     * @return
     *              A HashMap mapping the nodes of the SCG to their thread segment ID
     */
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
    
    /**
     *  Method to calculate the thread segment IDs of the nodes. Executes a depth-first search 
     *  of the nodes. If we reach the end of an execution, the thread is given the ID threadID. 
     * 
     * @param node
     *              The current node. Calculates the thread segment ID for all his children and then 
     *              calculate the thread segment ID of this node.
     * @param threadID
     *              The threadID to be given to the thread
     * 
     * @return
     *              The thread segment ID of the node to be used by its parent node
     */
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