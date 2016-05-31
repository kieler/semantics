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
import de.cau.cs.kieler.scg.priorities.extensions.SCCExtensions
import java.util.HashMap
import java.util.LinkedList
import javax.inject.Inject

/**
 * @author lpe
 *
 */
class NodePriorities {
    
    @Inject
    extension SCCExtensions
    
    private HashMap<LinkedList<Node>, Boolean> visited
    private HashMap<LinkedList<Node>, Integer> index
    private LinkedList<LinkedList<Node>> sccs
    private HashMap<Node, Integer> sccMap
    private HashMap<LinkedList<Node>, Integer> sccPrio
    private HashMap<Node, Integer> nodePrio
    
    /**
     * Calculates the Node Priorities of the SCG provided as a list of 
     * Strongly Connected Components. 
     * 
     * @param sccs
     *              The Strongly Connected Components of the SCG
     * @param sccMap
     *              A HashMap that maps each node in the SCG to the SCC it belongs to
     * 
     */
    public def HashMap<Node, Integer> calcNodePrios(LinkedList<LinkedList<Node>> sccs, HashMap<Node,Integer> sccMap) {
        visited = newHashMap
        index = newHashMap
        sccPrio = newHashMap
        nodePrio = newHashMap
        this.sccs = sccs
        this.sccMap = sccMap
        
        
        for(scc : sccs) {
            visited.put(scc, false)
        }
        
        for(scc : sccs) {
            if(!visited.get(scc)) {
                longestPath(scc)
                visited.put(scc, true)
            }
        }
        
        for(scc : sccs) {
            val prio = sccPrio.get(scc)
            for(n : scc) {
                nodePrio.put(n, prio)

            }

        }
        
        return nodePrio
    }
    
    /**
     * Using the depth first search, calculates the longest weighted path from an SCC through the SCG. Dependency edges 
     * have a weight of 1, neighboring edges a weight of 0. Writes the results of the calculations into the 
     * sccPrio HashMap.
     * 
     * @param currentSCC
     *              The SCC to handle
     */
    private def void longestPath(LinkedList<Node> currentSCC) {
        
        val neighbors = currentSCC.findNeighborsOfSCC
        val dependencies = currentSCC.findAllDependenciesOfScc
        var int prio = 0
        
        for(dep : dependencies) {
            val depSCC = sccs.get(sccMap.get(dep))
            if(!visited.get(depSCC)) {
                longestPath(depSCC)
                visited.put(depSCC, true)
                prio = Math.max(prio, sccPrio.get(depSCC) + 1)
            } else {
                prio = Math.max(prio, sccPrio.get(depSCC) + 1)
            }
        }
        
        for(n : neighbors) {
            val nSCC = sccs.get(sccMap.get(n))
            if(!visited.get(nSCC)) {
                longestPath(nSCC)
                visited.put(nSCC, true)
                prio = Math.max(prio, sccPrio.get(nSCC))
            } else {
                prio = Math.max(prio, sccPrio.get(nSCC))
            }
        }
        sccPrio.put(currentSCC, prio)
        
    }
    
}
