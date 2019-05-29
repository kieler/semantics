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
package de.cau.cs.kieler.kicool.processors.dependencies

import java.util.LinkedList
import java.util.Stack
import de.cau.cs.kieler.kexpressions.keffects.Linkable
import org.eclipse.emf.ecore.EObject
import java.util.List

/**
 * A class to determine the Strongly Connected Components of an SCG. Also determines schedulability of the SCG.
 * @author lpe ssm als
 * 
 */
class TarjanLinkable implements ITarjanFilter {
    
    var count = 0
    var visited = <Linkable, Boolean>newHashMap
    var stack = new Stack<Linkable>
    var index = <Linkable, Integer>newHashMap
    var lowlink = <Linkable, Integer>newHashMap
    var sccList = <LinkedList<Linkable>>newLinkedList
    var isContained = <Linkable, Boolean>newHashMap
    
    def void findSCCs(EObject rootObject, LoopDataLinkable loopData) {
        findSCCs(rootObject, loopData, this)
    }
    
    def void findSCCs(EObject rootObject, LoopDataLinkable loopData, ITarjanFilter filter) {
        val linkableNodes = filter.getLinkableNodes(rootObject)
        val res = linkableNodes.findSCCs(filter).filter[ size > 1 ].toList
        
        for (l : res) {
            val loop = new SingleLoopLinkable(loopData.persistent) => [ criticalNodes.addAll(l) ]
            loopData.criticalNodes += loop.criticalNodes
            loopData.loops += loop            
        }
    }
    
    override List<Linkable> getLinkableNodes(EObject rootObject) {
        rootObject.eAllContents.filter(Linkable).toList
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
    protected def LinkedList<LinkedList<Linkable>> findSCCs(List<Linkable> nodes, ITarjanFilter neighborFilter) {

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
                tarjan(node, neighborFilter)
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
    private def void tarjan(Linkable currentNode, ITarjanFilter neighborFilter) {
        index.put(currentNode, count)
        lowlink.put(currentNode, count)
        count++
        stack.push(currentNode)
        visited.put(currentNode, true)
        
        val neighbors = currentNode.getNeighbors(neighborFilter)
        for (nextNode : neighbors) {
            if (isContained.containsKey(nextNode) && isContained.get(nextNode)) {                
                // Next node has not yet been visited
                if (!visited.containsKey(nextNode) || !visited.get(nextNode)) {
                    tarjan(nextNode, neighborFilter)
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
            var scc = <Linkable>newLinkedList
            var w = stack.peek;
            do {
                w = stack.pop
                scc.add(w)
            } while (w != currentNode)
            sccList.add(scc)
        }
    }
    
    protected def List<Linkable> getNeighbors(Linkable node, ITarjanFilter neighborFilter) {
        val neighbors =  <Linkable> newLinkedList
        neighborFilter.filterNeighbors(node, neighbors)
        return neighbors
    }
    
    override filterNeighbors(Linkable node, List<Linkable> neighborList) {
        neighborList.addAll(
            node.getOutgoingLinks.map[ target ]
        )
    }
    
}
