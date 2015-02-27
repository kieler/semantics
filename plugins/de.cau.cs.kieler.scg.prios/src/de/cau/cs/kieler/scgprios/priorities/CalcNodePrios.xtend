/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scgprios.priorities

import java.util.LinkedList
import de.cau.cs.kieler.scg.Node
import java.util.HashMap
import de.cau.cs.kieler.scgprios.extensions.CommonExtension
import de.cau.cs.kieler.scgprios.extensions.SCCExtension
import com.google.inject.Inject

/**
 * This class provides functions to determine the node priority for all nodes of an SCG
 * 
 * @author cbu
 *
 */
class CalcNodePrios {
    
    @Inject
    extension CommonExtension
    @Inject
    extension SCCExtension
 
    private var nodePriorityList = <Node,Integer>newHashMap
    
    /**
     * Starts calculation of the longest path for all nodes. The longest path is equal to the node 
     * priority. 
     * 
     * @param sccs
     *          nodes of an SCG represented as list of strongly connected components
     * @return
     *          HashMap, which contains the nodes and their corresponding priorities
     */
    public def HashMap<Node,Integer> calculateNodePriorities (LinkedList<LinkedList<Node>> sccs){

        nodePriorityList.clear
        var remainingNodes = sccs as Iterable<LinkedList<Node>>
        
        while (!remainingNodes.empty){
            longestPath(remainingNodes.head, sccs)
            // as the graph might not be connected, ensure that all nodes get their priority
            remainingNodes = sccs.filter[!nodePriorityList.containsKey(it.head())]
        }
        
        nodePriorityList
    }


    /**
     * Calculates longest path originating from a node/scc through the graph, where transition
     * edges have weight 0 and dependency edges have weight 1.
     * 
     * @param sccPartition
     *          sccPartition in question
     * @param sccs
     *          nodes of SCG represented as a list of strongly connected components
     */
    private def void longestPath(LinkedList<Node> sccPartition, LinkedList<LinkedList<Node>> sccs) {
        
        var children = new LinkedList<Node>
        var dependencies = new LinkedList<Node>
        var int nodePriority = 0

        children.addAll(getChildrenFromSCC(sccPartition))
        dependencies.addAll(getDependenciesFromSCC(sccPartition))

        // calculate longest path for all children
        for (child : children) {
            if (!nodePriorityList.containsKey(child)) {
                // get scc of child
                var childSCC = sccs.filter[it.contains(child)].head
                longestPath(childSCC, sccs)
                nodePriority = max(nodePriority, nodePriorityList.get(child))
            } else {
                nodePriority = max(nodePriority, nodePriorityList.get(child))

            }
        }
        // calculate longest path for all dependency nodes
        for (d : dependencies) {
            if (!nodePriorityList.containsKey(d)) {
                // get scc of dependency node
                var dependencySCC = sccs.filter[it.contains(d)].head
                longestPath(dependencySCC, sccs)
                nodePriority = max(nodePriority, nodePriorityList.get(d) + 1)
            } else {
                nodePriority = max(nodePriority, nodePriorityList.get(d) + 1)
            }
        }
        for (s : sccPartition) {
            nodePriorityList.put(s, nodePriority)
        }
    }    
   
}