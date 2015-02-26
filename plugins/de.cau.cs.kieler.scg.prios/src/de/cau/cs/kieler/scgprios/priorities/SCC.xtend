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

import java.util.List
import de.cau.cs.kieler.scg.Node
import java.util.Stack
import java.util.LinkedList
import de.cau.cs.kieler.scgprios.extensions.CommonExtension

/**
 * This class determines the strongly connected components of an SCG
 * 
 * @author cbu
 *
 */
class SCC {
    
    private var commonExt = new CommonExtension
    private var number = <Node, Integer>newHashMap           // number of node / node has been visited
    private var lowlink = <Node, Integer>newHashMap          // minimal number of node / number of scc
    private var sccList = <LinkedList<Node>> newLinkedList   // list of sccs
    private var pointStack = new Stack<Node>                 // stack
    private var int i = 0
   
    /**
     * Use Tarjan's algorithm to find strongly connected components
     * Returns only partitions with more than one element
     * 
     * @param nodelist
     *          list of all nodes of the SCG
     * @return 
     *          list of strongly connected components. 
     * 
     */ 
    def LinkedList<LinkedList<Node>> findSCC(List<Node> nodelist){
        // nodes that have not been visited yet and might not be connected to the graph
        var remainingVertices = nodelist as Iterable<Node>
        sccList.clear
        number.clear
        lowlink.clear
       
        // if there are nodes which have not been visited yet
        while (!remainingVertices.empty){
            i = 0
            pointStack.clear
            //take first node, which has not been visited yet and
            //find all nodes which are strongly connected
            strongconnect(remainingVertices.head())
            //update remaining vertices
            remainingVertices = remainingVertices.filter[(!number.containsKey(it))]   
        }
        sccList
    }
    

    
    /**
     * Follows all edges to children and dependency edges (except from edges between surface and depth
     * in order to find the SCCs this node belongs to. Extends the global list with a list of nodes, if
     * this node is the smallest in an SCC.
     * 
     * @param currentNode
     *           node which is currently visited
     */
    private def void strongconnect(Node currentNode) {
        i = i + 1
        number.put(currentNode, i) //register node in number
        lowlink.put(currentNode, i) //initialize node in lowlink
        pointStack.push(currentNode) //add node to stack
        
        // get children and dependency nodes of current node
        var childNodes = commonExt.getInstantChildrenOfNode(currentNode)
        childNodes.addAll(commonExt.getDependencyNodes(currentNode))
        
        // for all children and dependency nodes
        for (child : childNodes) {
            // Node has not been visited before
            // Move to further to next node
            if (!number.containsKey(child)) {
                strongconnect(child)
                // save in list lowlink: current node and min of lowlink of currentnode and child
                lowlink.put(currentNode, commonExt.min(lowlink.get(currentNode).intValue(), lowlink.get(child).intValue()))
            } else {

                //Node has been visited before
                //Number of child is smaller than own number:
                //Take number of child as lowlink
                if (number.get(child).intValue() < number.get(currentNode).intValue()) {
                    if (pointStack.contains(child)) {
                        lowlink.put(currentNode,
                            commonExt.min(lowlink.get(currentNode).intValue(), number.get(child).intValue()))
                    }
                }
            }
        }
        //create a new partition
        if (lowlink.get(currentNode).intValue == number.get(currentNode).intValue) {
            var ssc = new LinkedList<Node>
            while ((!pointStack.isEmpty()) && (number.get(pointStack.peek).intValue >= number.get(currentNode).intValue)) {
                ssc.addLast(pointStack.pop())
            }
            sccList.addLast(ssc)

        }
    }
          
}

