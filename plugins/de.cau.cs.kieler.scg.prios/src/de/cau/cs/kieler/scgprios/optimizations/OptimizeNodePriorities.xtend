package de.cau.cs.kieler.scgprios.optimizations

import java.util.HashMap
import de.cau.cs.kieler.scg.Node
import java.util.LinkedList
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Surface
import java.util.Set
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scgprios.common.Helper
import de.cau.cs.kieler.scg.Link
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Fork

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
 * @author cbu
 *
 */
class OptimizeNodePriorities {
    
    var nodePriorities = <Node, Integer> newHashMap
    var newNodePriorities = <Node, Integer> newHashMap
    var Helper helper
    
    public def optimizeNodePriorities(HashMap<Node,Integer> nodePrios, LinkedList<LinkedList<Node>> sccs){
        
        // initialize global variables
        System.out.println("starting optimizePriorities")
        newNodePriorities.clear
        nodePriorities = nodePrios
        helper = new Helper
        var parentNodes = getParentsOfNodes(nodePriorities.keySet)
        var surfaceAndExitNodes = nodePriorities.keySet.filter[it instanceof Surface || it instanceof Exit]//getAllSurfaceAndExitNodes(nodePriorities.keySet)
        
        System.out.println("optimizePriorities: number of nodes:"+surfaceAndExitNodes.length)
        
        // find a higher priority for all exit and surface nodes
        for (n : surfaceAndExitNodes){ 
            findHigherPriority(n, n, sccs, parentNodes)
        }
        
        // update list
        for (np : newNodePriorities.keySet){
            System.out.println("optimizePriorities: replacing Node Priority")
            System.out.println("node "+np+"old priority "+nodePriorities.get(np)+" new priority "+newNodePriorities.get(np))
            this.nodePriorities.put(np,newNodePriorities.get(np))
        }
        // correct priority of first node if necessary
        correctPriortyOfFirstExit(getForkNodes(nodePriorities.keySet))
        this.nodePriorities
    }
    
    private def int findHigherPriority(Node exitOrSurfaceNode, Node currentNode, LinkedList<LinkedList<Node>> sccs, HashMap<Node, LinkedList<Node>> parentList) {
        System.out.println("starting findHigherPriority")
        System.out.println("current node: "+nodePriorities.get(currentNode).intValue+" originalNode "+nodePriorities.get(exitOrSurfaceNode).intValue)
        // current node has higher priority than exitOrSurfaceNode
        // return priority of that node
        if (nodePriorities.get(currentNode).intValue > nodePriorities.get(exitOrSurfaceNode).intValue) {
            System.out.println("findHigherNodePriority: found higher priority")
            newNodePriorities.put(currentNode, nodePriorities.get(currentNode))
            return nodePriorities.get(currentNode)

        // current node is instance of entry or depth or join
        // return priority of current node
        } else if (currentNode instanceof Entry || currentNode instanceof Join) {
            System.out.println("findHigherNodePriority: found Entry")
            newNodePriorities.put(currentNode, nodePriorities.get(currentNode))
            return nodePriorities.get(currentNode)
            
        } else {
            
            System.out.println("findHigherNodePriority: examining parents and incoming Dependencies")
            // otherwise, examine parents and incoming dependencies
            var scc = getSCCOfNode(sccs, currentNode)
            var inSCC = !scc.empty

            // find all incoming dependencies
            var incomingDependencies = false
            var incomingList = new LinkedList<Link>
            
            if (inSCC){
                for (s : scc){
                    incomingList.addAll(s.incoming)
                }
            } else {
                incomingList.addAll(currentNode.incoming)
            }
            
            for (i : incomingList) {
                if (i instanceof Dependency && (i as Dependency).concurrent && !((i as Dependency).confluent)) {
                    incomingDependencies = true
                }
            }

            // if there are incoming dependencies, return priority of current node
            if (incomingDependencies) {
                System.out.println("findHigherNodePriority: found incoming Dependency")
                newNodePriorities.put(currentNode, nodePriorities.get(currentNode))
                return nodePriorities.get(currentNode)

            } else {

                // find all parents
                var parentsOfNode = new LinkedList<Node>
                if (inSCC){
                    parentsOfNode.addAll(getParentNodesOfSCC(scc, parentList))
                } else {
                    parentsOfNode.addAll(parentList.get(currentNode))
                }

                // if there are no incoming nodes, return priority of current node
                if (parentsOfNode.empty) {
                    System.out.println("findHigherNodePriority: no incoming nodes")
                    newNodePriorities.put(currentNode, nodePriorities.get(currentNode))
                    return nodePriorities.get(currentNode)
                } else {
                    System.out.println("findHigherNodePriority: found incoming nodes: "+parentsOfNode.length)
                    var results = new LinkedList<Integer>

                    // if there is no incoming dependency or entry node, use this function on 
                    // all parents
                    for (n : parentsOfNode) {
                        if (newNodePriorities.containsKey(n)) {
                            results.add(newNodePriorities.get(n))
                        } else {
                            var r = findHigherPriority(exitOrSurfaceNode, n, sccs, parentList)
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
                    // update all nodes of scc if required
                    if (inSCC){
                        for (s : scc){
                            newNodePriorities.put(s, res)
                        }
                    }
                    return res

                }
            }

        }
    }
    
    
//    private def LinkedList<Node> getAllSurfaceAndExitNodes(Set<Node> nodes) {
//        System.out.println("starting getAllSurfaceAndExitNodes")
//        var surfaceAndExitNodes = new LinkedList<Node>
//        for (n : nodes){
//            if (n instanceof Exit || n instanceof Surface){
//                surfaceAndExitNodes.add(n)
//            }
//        }
//        surfaceAndExitNodes
//    }
   
    
    private  def LinkedList<Node> getParentNodesOfSCC(LinkedList<Node> scc, HashMap<Node, LinkedList<Node>> parents){
        var parentList = new LinkedList<Node>
        for (node : scc){
            parentList.addAll(parents.get(node))
        }
        var cleanParentList = helper.removeDoubleElements(parentList)
        for (s : scc){
            cleanParentList.remove(s)
        } 
        cleanParentList
    }
    
    
    
    // creates a HashMap, which lists all parents of a node
    private def HashMap<Node, LinkedList<Node>> getParentsOfNodes(Set<Node> nodes){
        var parentNodes = <Node, LinkedList<Node>> newHashMap
        for (key : nodes){
            var list = new LinkedList<Node>
            parentNodes.put(key,list)
        }
        for (node : nodes){
            var children = helper.getInstantChildrenOfNode(node)
            for (child : children){
                var currentParentList = parentNodes.get(child) 
                currentParentList.add(node)
                parentNodes.put(child, currentParentList)
            }
        }
        parentNodes
    }
    
    private def LinkedList<Node> getSCCOfNode(LinkedList<LinkedList<Node>> sccs, Node node){
        System.out.println("starting getSCCOfNode")
        var s = new LinkedList<Node>
        for (scc : sccs){
            if(scc.contains(node)){
                s.addAll(scc)
            }
        }
        s
    }
    
    // sort Fork nodes according to their node priority and according to their exit node priority
    // exit node of first fork should not have the smallest priority
    private def correctPriortyOfFirstExit(LinkedList<Node> forknodes){
        System.out.println("sorting fork nodes")
        for (f : forknodes){
            System.out.println("loop: sorting fork nodes")
            var entrynodes = (f as Fork).next
            
            //var potentialFirstEntries = (f as Fork).next.filter[nodePriorities.get(it.target).intValue == nodePriorities.get(f).intValue] 
            
            var sortedlist = entrynodes.sortBy[nodePriorities.get(it.target).intValue]
            
//            for (s : sortedlist){
//                entrynodes.remove(s)
//            }
//            for (s : sortedlist){
//                entrynodes.add(s)
//            }
            
            var firstentrynode = sortedlist.last
            //entrynodes.remove(firstentrynode)
            
            // the first exit node of the first entry node should not be the smallest 
            // exit node before the join
            var isSmallest = true
            for (e : entrynodes) {
                System.out.println("sorting entry nodes")
                if (nodePriorities.get((firstentrynode.target as Entry).exit).intValue >=
                    nodePriorities.get((e.target as Entry).exit).intValue) {
                    if (!firstentrynode.equals(e)){
                        isSmallest = false
                    }
                }

            }
            if (isSmallest){
                var firstExitNode = (firstentrynode.target as Entry).exit
                if (firstExitNode != null){
                    nodePriorities.put((sortedlist.head.target as Entry).exit, new Integer(nodePriorities.get(firstExitNode).intValue))
                }
                
            }
            entrynodes.add(firstentrynode)
        }
        
    }
   
    
  
    
 
  
    
    private def LinkedList<Node> getForkNodes(Set<Node> nodes){
        val list = new LinkedList<Node>
        for (n : nodes){
            if (n instanceof Fork){
                list.add(n)
            }
        }
        list
    }
   
    
}