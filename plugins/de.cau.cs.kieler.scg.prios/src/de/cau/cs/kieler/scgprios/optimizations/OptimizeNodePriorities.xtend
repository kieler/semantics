package de.cau.cs.kieler.scgprios.optimizations

import java.util.HashMap
import de.cau.cs.kieler.scg.Node
import java.util.LinkedList
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Link
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scgprios.extensions.CommonExtension
import de.cau.cs.kieler.scg.Depth

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

/**
 * This class provides methods to optimizes the given node priorities
 * 
 * @author cbu
 *
 */
class OptimizeNodePriorities {
    
    var commonExt = new CommonExtension
    var nodePriorities = <Node, Integer> newHashMap
    var newNodePriorities = <Node, Integer> newHashMap
    
    /**
     * This method calls a function, which optimizes the node priorities of all surface and exit nodes 
     * in order do prevent from unnecessary context switches.
     * 
     * @param nodePrios
     *          nodes with their corresponding priorities
     * @param sccs
     *          list of strongly connected components
     * @return 
     *          updated list of node priorities
     */
    public def optimizeNodePriorities(HashMap<Node,Integer> nodePrios, LinkedList<LinkedList<Node>> sccs){
        
        newNodePriorities.clear
        nodePriorities = nodePrios
        var surfaceAndExitNodes = nodePriorities.keySet.filter[it instanceof Surface || it instanceof Exit]
        
        // find a higher priority for all exit and surface nodes
        for (n : surfaceAndExitNodes){ 
            findHigherPriority(nodePriorities.get(n), n, sccs)
        }
        
        // update list
        for (np : newNodePriorities.keySet){
            this.nodePriorities.put(np,newNodePriorities.get(np))
        }
        
        // correct priority of first node if necessary
        correctPriortyOfFirstExit(nodePriorities.keySet.filter[it instanceof Fork])
        this.nodePriorities
    }
    
    /**
     * This first optimization starts from a surface or exit node and follows the incoming transition
     * edges using a depth first search.
     * If an entry node, join node or a node with incoming dependencies is reached, the search 
     * terminates and the node priority of that node is returned
     * If a node with a higher priority is found, the priority of that node is returned
     * If multiple a node has multiple parents with different node priorities, the lowest is chosen
     * 
     * @param exitOrSurfaceNode
     *          exitOrSurfaceNode, which is the starting point for the optimization
     * @param currentNode
     *          node in question
     * @param sccs
     *          list of strongly connected components
     * @return
     *          (optimized) node priority of node in question
     */
    private def int findHigherPriority(int priorityOfExitOrSurfaceNode, Node currentNode, LinkedList<LinkedList<Node>> sccs) {
        
        // current node has higher priority than exitOrSurfaceNode
        // return priority of that node
        if (nodePriorities.get(currentNode).intValue > priorityOfExitOrSurfaceNode) {
            newNodePriorities.put(currentNode, nodePriorities.get(currentNode))
            return nodePriorities.get(currentNode)

        // current node is instance of entry or depth or join
        // return priority of current node
        } else if (currentNode instanceof Entry || currentNode instanceof Join || currentNode instanceof Depth) {
            newNodePriorities.put(currentNode, nodePriorities.get(currentNode))
            return nodePriorities.get(currentNode)
        
        // check for incoming dependencies    
        } else {
           
            // find all incoming dependencies
            var scc = sccs.filter[it.contains(currentNode)].head
            var incomingDependencies = false
            var incomingList = new LinkedList<Link>
            
            for (s : scc){
                var newIncomingList = (s as Node).incoming
                for (n : newIncomingList){
                    if (!scc.contains(n.eContainer)){
                        incomingList.add(n)
                    }
                }
            }
            
            for (i : incomingList) {
                if (i instanceof Dependency && (i as Dependency).concurrent && !((i as Dependency).confluent)) {
                    incomingDependencies = true
                }
            }

            // if there are incoming dependencies, return priority of current node
            if (incomingDependencies) {
                newNodePriorities.put(currentNode, nodePriorities.get(currentNode))
                return nodePriorities.get(currentNode)

            } else {

                // find all parents
                var parentsOfNode = <Node> newLinkedList
                
                for (i : incomingList){
                    if (i instanceof ControlFlow){
                        var node = i.eContainer 
                        if (!(node instanceof Surface)){
                            parentsOfNode.add(node as Node)
                        }
                    }
                }  

                // if there are no incoming nodes, return priority of current node
                if (parentsOfNode.empty) {
                    newNodePriorities.put(currentNode, nodePriorities.get(currentNode))
                    return nodePriorities.get(currentNode)
                } else {
              
                    var results = new LinkedList<Integer>

                    // if there is no incoming dependency or entry node, use this function on 
                    // all parents
                    for (n : parentsOfNode) {
                        if (newNodePriorities.containsKey(n)) {
                            results.add(newNodePriorities.get(n))
                        } else {
                            var r = findHigherPriority(priorityOfExitOrSurfaceNode, n, sccs)
                            results.add(r)
                        }
                    }

                    // choose smallest priority
                    var res = results.first
                    for (r : results) {
                        if (res > r) {
                            res = r
                        }
                    }
                    newNodePriorities.put(currentNode, res)
                    
                    for (s : scc){
                        newNodePriorities.put(s, res)
                    }
                    
                    return res

                }
            }

        }
    }
    
  
 
    /**
     * In SCL_P it is not allowed for the first child of a fork node to perform the join.
     * As the previous optimization might result in this, it is necessary to correct this
     * See ABCO as example.
     * 
     * @param forknodes
     *          list of all forknodes within the scg
     */
    // sort Fork nodes according to their node priority and according to their exit node priority
    // exit node of first fork should not have the smallest priority
    private def void correctPriortyOfFirstExit(Iterable<Node> forknodes) {

        for (f : forknodes) {
            var entrynodes = <Node>newLinkedList
            var controlflow = (f as Fork).next
            for (cf : controlflow) {
                entrynodes.add(cf.target)
            }
            var sortedEntryNodes = commonExt.sortEntryNodes(entrynodes, nodePriorities)
             
            var firstentrynode = sortedEntryNodes.head as Entry
            var joiningnode = sortedEntryNodes.last as Entry
            
            if (nodePriorities.get(firstentrynode.exit) < nodePriorities.get(joiningnode.exit)){
                nodePriorities.put(joiningnode.exit,nodePriorities.get(firstentrynode.exit))
            }
            
        }

    }
  
    
}