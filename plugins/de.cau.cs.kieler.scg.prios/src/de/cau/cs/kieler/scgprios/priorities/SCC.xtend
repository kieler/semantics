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

import com.google.inject.Inject
import java.util.List
import de.cau.cs.kieler.scg.Node
import java.util.Stack
import java.util.LinkedList
import de.cau.cs.kieler.scgprios.common.Helper
//import de.cau.cs.kieler.scl.scl_p.



/**
 * @author cbu
 *
 */
class SCC {
    
//    @Inject 
//    extension Helper
    private var helper = new Helper
    private var number = <Node, Integer>newHashMap           // number of node / node has been visited
    private var lowlink = <Node, Integer>newHashMap          // minimal number of node / number of scc
    private var sccList = <LinkedList<Node>> newLinkedList   // list of sccs
    private var pointStack = new Stack<Node>                 // stack
    private var int i = 0
   
    /**
     * Use Tarjan's algorithm to find strongly connected components
     * Returns only partitions with more than one element
     * 
     * @param list of all nodes of the SCG
     * @return list that contains sublists, each sublist is a list of strongly connected nodes
     *          only sublists, that contain more than one node are returned
     * 
     */ 
    def LinkedList<LinkedList<Node>> findSCC(List<Node> nodelist){
        // nodes that have not been visited yet and might not be connected to the graph
        var remainingVertices = findRemainingVertices(nodelist) 
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
            remainingVertices = findRemainingVertices(nodelist) 
        }
        // return only those sccs, which contain more than one element
        // necessary?
        var finalSccList = <LinkedList<Node>> newLinkedList
        for (scc : sccList){
            if (!(scc.empty || scc.length==1)){
                finalSccList.add(scc)
            }
        }
        finalSccList
    }
    
    /**
     * This function returns a list of nodes, which have not been visited yet
     * 
     * @param list of nodes
     * @return list of nodes which have not been visited yet
     */
    private def List<Node> findRemainingVertices(List<Node> nodelist){
        var returnNode = new LinkedList<Node>
        for (node: nodelist){
            if (!number.containsKey(node)){
                returnNode.addLast(node)
            }
        }
        returnNode
    }
    
    /**
     * Follows all edges to children and dependency edges (except from edges between surface and depth
     * in order to find the SCCs this node belongs to. Extends the global list with a list of nodes, if
     * this node is the smallest in an SCC.
     * 
     * @param currentNode: node which is currently visited
     */
    private def void strongconnect(Node currentNode) {
        i = i + 1
        number.put(currentNode, i) //register node in number
        lowlink.put(currentNode, i) //register node in lowlink???
        pointStack.push(currentNode) //add to stack
        
        // get children and dependency nodes of current node
        var childNodes = helper.getInstantChildrenOfNode(currentNode)
        childNodes.addAll(helper.getDependencyNodes(currentNode))
        
        // for all children and dependency nodes
        for (child : childNodes) {
            // Node has not been visited before
            // Move to further to next node
            if (!number.containsKey(child)) {
                strongconnect(child)
                // save in list lowlink: current node and min of lowlink of currentnode and child
                lowlink.put(currentNode, helper.min(lowlink.get(currentNode).intValue(), lowlink.get(child).intValue()))
            } else {

                //Node has been visited before
                //Number of child is smaller than own number:
                //Take number of child as lowlink
                if (number.get(child).intValue() < number.get(currentNode).intValue()) {
                    if (pointStack.contains(child)) {
                        lowlink.put(currentNode,
                            helper.min(lowlink.get(currentNode).intValue(), number.get(child).intValue()))
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

