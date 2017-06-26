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

import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.priorities.extensions.SCCExtensions
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import javax.inject.Inject

/**
 * Class for the calculation of node priorities of an SCG.
 * @author lpe
 *
 */
class NodePriorities {
    
    @Inject
    extension SCCExtensions
    
    private HashMap<LinkedList<Node>, Boolean> visited
    private HashMap<LinkedList<Node>, Integer> index
    private LinkedList<LinkedList<Node>> sccs
    private LinkedList<LinkedList<Node>> schizoSccList
    private HashMap<Node, Integer> sccMap
    private HashMap<Node, Integer> schizoSccMap
    private HashMap<Node, Integer> nodePrio
    private HashMap<LinkedList<Node>, Integer> min
    private HashMap<LinkedList<Node>, Integer> max
    private HashMap<Node, Boolean> visitedNodes
    private int maxPrio
    
    /**
     * Calculates the Node Priorities of the SCG provided in the form of a list of 
     * Strongly Connected Components. 
     * 
     * @param sccs
     *              The Strongly Connected Components of the SCG
     * @param sccMap
     *              A HashMap that maps each node in the SCG to the SCC it belongs to
     * 
     */
    public def HashMap<Node, Integer> calcNodePrios(LinkedList<LinkedList<Node>> sccs, HashMap<Node,Integer> sccMap, 
                                                        List<Node> nodes, LinkedList<LinkedList<Node>> schizoSccList,
                                                        HashMap<Node, Integer> schizoSccMap) {
        visited = newHashMap
        index = newHashMap
        nodePrio = newHashMap
        min = newHashMap
        max = newHashMap
        maxPrio = 0
        visitedNodes = newHashMap
        this.sccs = sccs
        this.sccMap = sccMap
        this.schizoSccList = schizoSccList
        this.schizoSccMap = schizoSccMap
        
        // Reset visited nodes
        for(scc : sccs) {
            visited.put(scc, false)
        }
        
        
        // Calculate min
        for(scc : sccs) {
            if(!visited.get(scc)) {
                visited.put(scc, true)
                longestPath(scc)
            }
        }
        
        // Reset visited nodes
        for(scc : sccs) {
            visited.put(scc, false)
        }
        
        // Calculate max
        for(scc : sccs) {
            if(!visited.get(scc)) {
                visited.put(scc, true)
                longestPathBackwards(scc)
            }
        }
        
        // Reset visited nodes
        for(scc : sccs) {
            visited.put(scc, false)
        }
        
        // Calculate node priorities
        for(scc : sccs) {
            if(!visited.get(scc)) {
                visited.put(scc, true)
                calculateNodePrios(scc)
            }
        }
        
        return nodePrio
    }
    
    /**
     * Using the depth first search, calculates the longest weighted path from an SCC through the SCG. Dependency edges 
     * have a weight of 1, neighboring edges a weight of 0. Writes the results of the calculations into the 
     * min HashMap.
     * 
     * @param currentSCC
     *              The SCC to handle
     */
    private def void longestPath(LinkedList<Node> currentSCC) {
        
        val neighbors = currentSCC.findNeighborsOfSCC
        val dependencies = currentSCC.findAllDependenciesOfScc
        val head = currentSCC.head
        var int prio = 0
        
        for(dep : dependencies) {
            val depSCC = sccs.get(sccMap.get(dep))
            if(!visited.get(depSCC)) {
                visited.put(depSCC, true)
                longestPath(depSCC)
                prio = Math.max(prio, min.get(depSCC) + 1)
            } else {
                if(min.containsKey(depSCC)) {
                    prio = Math.max(prio, min.get(depSCC) + 1)                    
                }
            }
        }
        
        // If there were depth-joins we will have to take into account that all nodes in the cycle should 
        // be executed before all dependencies of this cycle. This is doing that.
        if(schizoSccMap.containsKey(head)) {
            val schizoScc = schizoSccList.get(schizoSccMap.get(head))
            val schizoDependencies = schizoScc.findAllExternalDependenciesOfScc(schizoSccMap)
            for(node : schizoDependencies) {
                val depSCC = sccs.get(sccMap.get(node))
                if (!visited.get(depSCC)) {
                    visited.put(depSCC, true)
                    longestPath(depSCC)
                    prio = Math.max(prio, min.get(depSCC) + 1)
                } else {
                    if (min.containsKey(depSCC)) {
                        prio = Math.max(prio, min.get(depSCC) + 1)
                    }
                }
            }
        }
        
        for(n : neighbors) {
            val nSCC = sccs.get(sccMap.get(n))
            if(!visited.get(nSCC)) {
                visited.put(nSCC, true)
                longestPath(nSCC)
                prio = Math.max(prio, min.get(nSCC))
            } else {
                if(min.containsKey(nSCC)) {
                    prio = Math.max(prio, min.get(nSCC))                    
                }
            }
        }
        maxPrio = Math.max(maxPrio, prio)
        min.put(currentSCC, prio)
        
    }
    
    /**
     *  Using depth first search, calculates the maximum priority a node in an SCG can have depending on incoming 
     *  dependency edges and its predecessors, dependency edges have a weight of -1, neighboring edges a weight of 0.
     *  Writes the results of the calculation into the max HashMap
     */
    private def void longestPathBackwards(LinkedList<Node> currentSCC) {
        
        val predecessors = currentSCC.findPredecessorsOfSCC
        val incomingDependency = currentSCC.findAllIncomingDependenciesOfScc
        var int prio = maxPrio
        var isEntry = false
        
        for(dep : incomingDependency) {
            val depSCC = sccs.get(sccMap.get(dep))
            prio = Math.min(prio,min.get(depSCC) - 1)
        }
        
        for(n : predecessors) {
            if(n instanceof Fork) {
                isEntry = true
            }
            val nSCC = sccs.get(sccMap.get(n))
            if(!visited.get(nSCC)) {
                visited.put(nSCC, true)
                longestPathBackwards(nSCC)
                if(max.containsKey(nSCC)) {
                    prio = Math.min(prio, max.get(nSCC))                    
                }
            } else {
                if(max.containsKey(nSCC)) {
                    prio = Math.min(prio, max.get(nSCC))                    
                }
            }
        }
        if(isEntry || (predecessors.empty && currentSCC.head instanceof Entry)) {
            max.put(currentSCC, min.get(currentSCC))
        } else {
            
            max.put(currentSCC, prio)
        }
        
    }
    
    
    
    /**
     *  Calculates the node priorities of each node in the SCG depending on the min and max priorities determined 
     *  earlier.
     */
    private def int calculateNodePrios(LinkedList<Node> currentSCC) {
        val neighbors = currentSCC.findNeighborsOfSCC
        var nextPrio = max.get(currentSCC)
        var succPrio = Integer.MIN_VALUE
        
        for(n : neighbors) {
            if(!(n instanceof Join)) {
                val nextSCC = sccs.get(sccMap.get(n))
                if(!visited.containsKey(nextSCC) || !visited.get(nextSCC)) {
                    visited.put(nextSCC, true)              
                    succPrio = Math.max(calculateNodePrios(nextSCC), succPrio)  
                } else {
                    if(nodePrio.containsKey(n)) {
                        succPrio = Math.max(nodePrio.get(n), succPrio)                        
                    }
                }                
            }
        }
        
        if(succPrio >= min.get(currentSCC)) {
            nextPrio = succPrio   
        }
        
        if(min.get(currentSCC) > max.get(currentSCC)) {
            for(node : currentSCC) {
                if(node instanceof Join) {
                    nodePrio.put(node, max.get(currentSCC))                    
                } else {
                    nodePrio.put(node, nextPrio)
                }
            }
        } else {
            for(node : currentSCC) {
                nodePrio.put(node, nextPrio)
            }            
        }
        
        
        return nextPrio
    }
    
}
