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
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import java.util.LinkedList
import java.util.HashMap
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scgprios.extensions.CommonExtension
import com.google.inject.Inject
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Assignment

/**
 * This class provides a method to assign the thread segment ID to each node of an SCG
 * and the corresponding helper methods
 * 
 * @author cbu
 *
 */
class CalcTSIDs {
    
    @Inject
    extension CommonExtension
     
    private int nextTSID
    private var tsIDs = <Node, Integer> newHashMap
    
    /**
     * This method initializes all global variables and calls the method, which assigns thread
     * segment ids to all nodes afterwards
     * 
     * @param nodes
     *          list of scg nodes
     * @param nodePriorities
     *          nodes with their corresponding node priorities
     * @return
     *          HashMap containing the nodes and their corresponding thread segment IDs
     */
    def HashMap<Node, Integer> calculateTSIDs(List<Node> nodes, HashMap<Node, Integer> nodePriorities){
        
        tsIDs.clear
        var entrynodes = nodes.filter[it instanceof Entry]
        var forknodes = nodes.filter[it instanceof Fork]
        nextTSID = entrynodes.length - forknodes.length - 1
        var rootnode = nodes.head
        var nodesOfPath = <Node> newLinkedList
        
        numberThreadSegments(rootnode,(entrynodes.length - forknodes.length),nodePriorities,nodesOfPath)
        
        tsIDs
    }
    
    /**
     * This method recursively assigns thread segment IDs to all nodes
     * 
     * @param node
     *          node in question
     * @param i
     *          id of current thread segment
     * @param nodePriorities
     *          nodes and their corresponding priorities
     * @param nodesOfPath
     *          list of nodes, that have been visited within the current region
     * @param return
     *          updated list of nodes, that have been visited within the current region
     */
    private def void numberThreadSegments(Node node, int i, HashMap<Node,Integer> nodePriorities, LinkedList<Node> nodesOfPath){
       
        var newPath = new LinkedList(nodesOfPath)
        // prevent from endless loops 
        // (if the node has already been visited during the current pass - terminate)
        if (!nodesOfPath.contains(node) && (!(tsIDs.containsKey(node) && (tsIDs.get(node) < i)))){
            // add node to current path
            newPath.add(node)
            
            // do terminate for join nodes
            // join nodes are considered by their corresponding fork nodes
            if (!(node instanceof Join)){
                
                // If node is instance of Exit, tsID is the value i
                // This might be called twice per node: In case, that the exit node is not connected
                // to the other nodes of the region, the entry node calls this function for the exit
                // node, if the exit node is connected, then the tsID might be overwritten 
                if (node instanceof Exit){
                    tsIDs.put(node,i)
                
                // call this function for the exit node (it might happen, that exit nodes are unconnected)
                // call this function for the child node (this might overwrite the current tsID fo the
                // exit node
                // in case of an unconnected exit node, a join will never be performed, as a result the 
                // assignment of a too high tsID will not cause any harm
                } else if (node instanceof Entry){
                    tsIDs.put(node,i)
                    numberThreadSegments(((node as Entry).exit), i, nodePriorities, newPath)
                    numberThreadSegments(((node as Entry).next.target), i, nodePriorities, newPath)
                    
                // call this function for the for all children (depth first search until reaching the 
                // join node), empty the nodesOfPathList for each child, as this is a new region
                // the first child gets the tsID of its parent
                // for all other children, the decrement and use the global nextTSID as tsID
                // assign minimal tsID to the join node afterwards
                } else if (node instanceof Fork){
                    tsIDs.put(node,i)
                    var children = getAllChildrenOfNode(node)
                    var entrynodes = sortEntryNodes(children, nodePriorities)
                    var firstentry = entrynodes.head
                    entrynodes.remove(firstentry)
                    var emptyPath = <Node> newLinkedList
                    numberThreadSegments(firstentry, i, nodePriorities, emptyPath)
                    //newNodesOfPath.addAll(path)
                    for (e : entrynodes){
                        var newTSID = nextTSID
                        nextTSID = nextTSID - 1;
                        numberThreadSegments(e, newTSID, nodePriorities, emptyPath)             
                  
                    }
                    var joinpriority = tsIDs.get((entrynodes.last as Entry).exit)
                    tsIDs.put((node as Fork).join,joinpriority)
                    numberThreadSegments((node as Fork).join.next.target, joinpriority, nodePriorities, newPath)
                    entrynodes.addFirst(firstentry)
                
                // for all other nodes, assign the delivered ID i as tsID to that node and call
                // this function for all child nodes
                // it might happen, that a node is visited twice: the lower tsID will overwrite the
                // higher tsID
                } else {
                    tsIDs.put(node,i)
                    var pathLength = newPath.length
                    for (c : getAllChildrenOfNode(node)){
                        var individualPath = <Node> newLinkedList
                        individualPath.addAll(newPath.subList(0,pathLength))
                        numberThreadSegments(c, i, nodePriorities, individualPath)
                    }
                
            }
            
            } 
        } 
        
    } 
    
}