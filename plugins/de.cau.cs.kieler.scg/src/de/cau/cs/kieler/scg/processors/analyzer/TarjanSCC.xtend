/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.analyzer

import com.google.inject.Inject
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCCExtensions
import java.util.LinkedList
import java.util.Stack

/**
 * A class to determine the Strongly Connected Components of an SCG. Also determines schedulability of the SCG.
 * @author lpe ssm als
 * 
 */
class TarjanSCC {
    
    @Inject extension SCCExtensions

    var count = 0
    var visited = <Node, Boolean>newHashMap
    var stack = new Stack<Node>
    var index = <Node, Integer>newHashMap
    var lowlink = <Node, Integer>newHashMap
    var sccList = <LinkedList<Node>>newLinkedList
    var isContained = <Node, Boolean>newHashMap
    
    def void  findSCCs(SCGraph scg, LoopData loopData, boolean considerAllDependencies) {
        val res = scg.nodes.findSCCs(considerAllDependencies).filter[ size > 1 ].toList
        
        for (l : res) {
            val loop = new SingleLoop(loopData.persistent) => [ criticalNodes.addAll(l) ]
            loopData.criticalNodes += loop.criticalNodes
            loopData.loops += loop            
        }
    }

    /**
     * Finds the Strongly Connected Components of an 
     * SCG using Tarjan's Algorithm. 
     * 
     * @param nodes 
     *          The nodes of the provided SCG
     * 
     * @return
     *          List of all Strongly Connected Components in the SCG
     */
    def LinkedList<LinkedList<Node>> findSCCs(Iterable<Node> nodes, boolean considerAllDependencies) {

        // Clear everything to enable a second run
        lowlink.clear
        index.clear
        sccList.clear
        stack.clear
        visited.clear
        isContained.clear
        count = 0
        
        for (node : nodes) {
            isContained.put(node, true)
        }

        // Ensure that all nodes of the SCG are visited once
        for (node : nodes) {
            if (!visited.containsKey(node) || !visited.get(node)) {
                tarjan(node, considerAllDependencies)
            }
        }
        
        sccList
    }

    /** Creates a Strongly Connected Component containing the node currentNode. 
     *  Strongly Connected Components include nodes that are connected with the 
     *  exception of Surface --> Depth nodes but including dependency edges.
     * 
     * @param currentNode 
     *              The Node that is contained in the Strongly Connected Component to be built
     * 
     */
    private def void tarjan(Node currentNode, boolean considerAllDependencies) {
        index.put(currentNode, count)
        lowlink.put(currentNode, count)
        count++
        stack.push(currentNode)
        visited.put(currentNode, true)
        
        val neighbors = if (considerAllDependencies) {
            currentNode.getNeighborsAndAllDependencies
        } else {
            currentNode.neighborsAndDependencies
        }
        for (nextNode : neighbors) {
            if (isContained.containsKey(nextNode) && isContained.get(nextNode)) {                
                // Next node has not yet been visited
                if (!visited.containsKey(nextNode) || !visited.get(nextNode)) {
                    tarjan(nextNode, considerAllDependencies)
                    lowlink.replace(currentNode, Math.min(lowlink.get(currentNode), lowlink.get(nextNode)))
                } // Next node has already been visited, hence in the current Strongly Connected Component
                else if (index.get(nextNode) < index.get(currentNode)) {
                    if (stack.contains(nextNode)) {
                        lowlink.replace(currentNode, Math.min(lowlink.get(currentNode), lowlink.get(nextNode)))
                    }
                }
            }
        }

        // Create the Strongly Connected Component
        if (index.get(currentNode) == lowlink.get(currentNode)) {
            var scc = <Node>newLinkedList
            var w = stack.peek;
            do {
                w = stack.pop
                scc.add(w)
            } while (w != currentNode)
            sccList.add(scc)
        }
    }

}
