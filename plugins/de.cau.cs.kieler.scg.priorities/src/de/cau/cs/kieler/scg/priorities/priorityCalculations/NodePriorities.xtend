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

import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.priorities.extensions.SCCExtensions
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import javax.inject.Inject
import de.cau.cs.kieler.scg.Fork

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
    private HashMap<Node, Integer> sccMap
    private HashMap<LinkedList<Node>, Integer> sccPrio
    private HashMap<Node, Integer> nodePrio
    private HashMap<Node, Boolean> visitedNodes
    
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
                                                        List<Node> nodes) {
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
        
        optimizeNodePrios(nodes)
        
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
    
    
    /**
     *  Optimizes node priorities by finding surface or exit nodes and searching their parent nodes for higher 
     *  node priorities. This results in less context switches.
     *  
     *  @param nodes
     *              The nodes of the SCG
     */
    private def optimizeNodePrios(List<Node> nodes) {
        visitedNodes = <Node, Boolean> newHashMap
        var surfaceOrExit = nodes.filter[it instanceof Surface || it instanceof Exit]
        for(node : surfaceOrExit) {
            visitedNodes = <Node, Boolean> newHashMap
            propagateUpwards(node)
        }
        fixFirstAndLastPriorities(nodes)
    }
    
    
    /**
     *  Finds join, entry or depth nodes, or nodes that have incoming dependencies. If these are encountered, they return 
     *  their node priority and propagate them to their following nodes.
     * 
     *  @param currentNode
     *          The currently observed node
     * 
     *  @returns
     *          The (new) node priority of the currentNode
     * 
     */
    private def int propagateUpwards(Node currentNode) {
        visitedNodes.put(currentNode, true)
        var dependencyExists = false
        //Detect any incoming concurrent dependencies
        for(inc : currentNode.incoming) {
            dependencyExists = dependencyExists || (inc instanceof DataDependency && (inc as DataDependency).concurrent 
                                                              && !(inc as DataDependency).confluent)
        }
        
        //Check for termination condition. If we encounter one of these nodes, we should not look further.
        if(currentNode instanceof Join || currentNode instanceof Entry || currentNode instanceof Depth || dependencyExists) {
            return nodePrio.get(currentNode)
        //Get the node priorities of the predecessors and compare them to the node priority of the current node
        } else {
            var min = Integer.MAX_VALUE
            for(incControlFlow : currentNode.incoming) {
                if(!(incControlFlow instanceof DataDependency)) {
                    val pred = incControlFlow.eContainer as Node
                    if(!visitedNodes.containsKey(pred) || !visitedNodes.get(pred)) {
                        val curr = propagateUpwards(pred)
                        min = Math.min(curr, min)
                    } else if(visitedNodes.containsKey(pred) && visitedNodes.get(pred)) {
                        min = Math.min(nodePrio.get(pred), min)
                    }                   
                }
            }
            if(nodePrio.get(currentNode) < min && min != Integer.MAX_VALUE) {
                nodePrio.put(currentNode, min)                
            }
            return nodePrio.get(currentNode)
        }
    }
    
    /**
     *  Fixes the Priorities of threads where the thread with the highest entry priority
     *  also has the lowest exit priority. The SCL macros would not be able to properly schedule such
     *  programs and therefore these occurences need to be removed.
     * 
     * 
     */
    private def void fixFirstAndLastPriorities(List<Node> nodes) {
        
        val forks = nodes.filter[it instanceof Fork]
        
        for (fork : forks) {
            val innerEntryNodes = fork.neighbors.sortBy[nodePrio.get(it)]
            val innerExitNodes = <Node> newLinkedList
            for(entry : innerEntryNodes) {
                innerExitNodes.add((entry as Entry).exit)
            }

            val sortedExitNodes = innerExitNodes.sortBy[nodePrio.get(it)]
            //If the thread with the highest entry priority is also 
            //the thread with the lowest exit priority, we have to lower the second lowest priority
            //in an exit node to the priority of the first thread. With this, the scheduler can perform 
            //the join as intended.
            if((innerEntryNodes.last as Entry).exit.equals(sortedExitNodes.head)) {
                nodePrio.replace(sortedExitNodes.get(1), nodePrio.get(sortedExitNodes.head))
            }
        }
        
    }
    
}
